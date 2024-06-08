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
 * The entity of W_WKRECEIVEPLAN as TABLE. <br>
 * 格納先予定リスト情報
 * <pre>
 * [primary-key]
 *     W_WKRECEIVEPLAN_ID
 *
 * [column]
 *     W_WKRECEIVEPLAN_ID, PRINTKEY, LINE_NO, RECEIVE_PLAN_H_ID, RCVLINENO, WAREHOUSECD, WAREHOUSE_SNAME, SLOTLOCNAME, RCVSCHDATE, RECEIVE_LOT4, RECEIVE_LOT3, LOCATION_CD, CASEQTY_CAPACITY, FLOOR, FROMFAX, FROMPHONE, SUPPLIERRCVNO, PRODUCT_CD, ITEMNAME, ZONE, EXPECTQTY, RCVPAL, RCVCASE, LOT1, LOT4, LOT3, QTYCASE, QTYBOWL, QTYPAL, INOUTKBN, ITEM_ORDERBY, PRINTPAGENO, SEQSORTKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * Long wWkreceiveplanId = entity.getWWkreceiveplanId();
 * java.math.BigDecimal printkey = entity.getPrintkey();
 * Long lineNo = entity.getLineNo();
 * Long receivePlanHId = entity.getReceivePlanHId();
 * java.math.BigDecimal rcvlineno = entity.getRcvlineno();
 * String warehousecd = entity.getWarehousecd();
 * String warehouseSname = entity.getWarehouseSname();
 * String slotlocname = entity.getSlotlocname();
 * String rcvschdate = entity.getRcvschdate();
 * String receiveLot4 = entity.getReceiveLot4();
 * String receiveLot3 = entity.getReceiveLot3();
 * String locationCd = entity.getLocationCd();
 * Long caseqtyCapacity = entity.getCaseqtyCapacity();
 * String floor = entity.getFloor();
 * String fromfax = entity.getFromfax();
 * String fromphone = entity.getFromphone();
 * String supplierrcvno = entity.getSupplierrcvno();
 * String productCd = entity.getProductCd();
 * String itemname = entity.getItemname();
 * String zone = entity.getZone();
 * java.math.BigDecimal expectqty = entity.getExpectqty();
 * java.math.BigDecimal rcvpal = entity.getRcvpal();
 * java.math.BigDecimal rcvcase = entity.getRcvcase();
 * String lot1 = entity.getLot1();
 * String lot4 = entity.getLot4();
 * String lot3 = entity.getLot3();
 * java.math.BigDecimal qtycase = entity.getQtycase();
 * java.math.BigDecimal qtybowl = entity.getQtybowl();
 * java.math.BigDecimal qtypal = entity.getQtypal();
 * String inoutkbn = entity.getInoutkbn();
 * Long itemOrderby = entity.getItemOrderby();
 * Long printpageno = entity.getPrintpageno();
 * java.math.BigDecimal seqsortkey = entity.getSeqsortkey();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setWWkreceiveplanId(wWkreceiveplanId);
 * entity.setPrintkey(printkey);
 * entity.setLineNo(lineNo);
 * entity.setReceivePlanHId(receivePlanHId);
 * entity.setRcvlineno(rcvlineno);
 * entity.setWarehousecd(warehousecd);
 * entity.setWarehouseSname(warehouseSname);
 * entity.setSlotlocname(slotlocname);
 * entity.setRcvschdate(rcvschdate);
 * entity.setReceiveLot4(receiveLot4);
 * entity.setReceiveLot3(receiveLot3);
 * entity.setLocationCd(locationCd);
 * entity.setCaseqtyCapacity(caseqtyCapacity);
 * entity.setFloor(floor);
 * entity.setFromfax(fromfax);
 * entity.setFromphone(fromphone);
 * entity.setSupplierrcvno(supplierrcvno);
 * entity.setProductCd(productCd);
 * entity.setItemname(itemname);
 * entity.setZone(zone);
 * entity.setExpectqty(expectqty);
 * entity.setRcvpal(rcvpal);
 * entity.setRcvcase(rcvcase);
 * entity.setLot1(lot1);
 * entity.setLot4(lot4);
 * entity.setLot3(lot3);
 * entity.setQtycase(qtycase);
 * entity.setQtybowl(qtybowl);
 * entity.setQtypal(qtypal);
 * entity.setInoutkbn(inoutkbn);
 * entity.setItemOrderby(itemOrderby);
 * entity.setPrintpageno(printpageno);
 * entity.setSeqsortkey(seqsortkey);
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
public abstract class BsWWkreceiveplan extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)} */
    protected Long _wWkreceiveplanId;

    /** PRINTKEY: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _printkey;

    /** LINE_NO: {NotNull, bigint(19)} */
    protected Long _lineNo;

    /** RECEIVE_PLAN_H_ID: {bigint(19)} */
    protected Long _receivePlanHId;

    /** RCVLINENO: {decimal(16, 6)} */
    protected java.math.BigDecimal _rcvlineno;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    protected String _warehousecd;

    /** WAREHOUSE_SNAME: {varchar(100)} */
    protected String _warehouseSname;

    /** SLOTLOCNAME: {varchar(255)} */
    protected String _slotlocname;

    /** RCVSCHDATE: {varchar(8)} */
    protected String _rcvschdate;

    /** RECEIVE_LOT4: {varchar(8)} */
    protected String _receiveLot4;

    /** RECEIVE_LOT3: {varchar(60)} */
    protected String _receiveLot3;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** CASEQTY_CAPACITY: {bigint(19)} */
    protected Long _caseqtyCapacity;

    /** FLOOR: {varchar(60)} */
    protected String _floor;

    /** FROMFAX: {varchar(60)} */
    protected String _fromfax;

    /** FROMPHONE: {varchar(60)} */
    protected String _fromphone;

    /** SUPPLIERRCVNO: {varchar(60)} */
    protected String _supplierrcvno;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** ITEMNAME: {varchar(100)} */
    protected String _itemname;

    /** ZONE: {varchar(60)} */
    protected String _zone;

    /** EXPECTQTY: {decimal(16, 6)} */
    protected java.math.BigDecimal _expectqty;

    /** RCVPAL: {decimal(16, 6)} */
    protected java.math.BigDecimal _rcvpal;

    /** RCVCASE: {decimal(16, 6)} */
    protected java.math.BigDecimal _rcvcase;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** QTYCASE: {decimal(16, 6)} */
    protected java.math.BigDecimal _qtycase;

    /** QTYBOWL: {decimal(16, 6)} */
    protected java.math.BigDecimal _qtybowl;

    /** QTYPAL: {decimal(16, 6)} */
    protected java.math.BigDecimal _qtypal;

    /** INOUTKBN: {varchar(30)} */
    protected String _inoutkbn;

    /** ITEM_ORDERBY: {bigint(19)} */
    protected Long _itemOrderby;

    /** PRINTPAGENO: {bigint(19)} */
    protected Long _printpageno;

    /** SEQSORTKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _seqsortkey;

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
        return "W_WKRECEIVEPLAN";
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
        if (_wWkreceiveplanId == null) { return false; }
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
        if (obj instanceof BsWWkreceiveplan) {
            BsWWkreceiveplan other = (BsWWkreceiveplan)obj;
            if (!xSV(_wWkreceiveplanId, other._wWkreceiveplanId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _wWkreceiveplanId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_wWkreceiveplanId));
        sb.append(dm).append(xfND(_printkey));
        sb.append(dm).append(xfND(_lineNo));
        sb.append(dm).append(xfND(_receivePlanHId));
        sb.append(dm).append(xfND(_rcvlineno));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_warehouseSname));
        sb.append(dm).append(xfND(_slotlocname));
        sb.append(dm).append(xfND(_rcvschdate));
        sb.append(dm).append(xfND(_receiveLot4));
        sb.append(dm).append(xfND(_receiveLot3));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_caseqtyCapacity));
        sb.append(dm).append(xfND(_floor));
        sb.append(dm).append(xfND(_fromfax));
        sb.append(dm).append(xfND(_fromphone));
        sb.append(dm).append(xfND(_supplierrcvno));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_itemname));
        sb.append(dm).append(xfND(_zone));
        sb.append(dm).append(xfND(_expectqty));
        sb.append(dm).append(xfND(_rcvpal));
        sb.append(dm).append(xfND(_rcvcase));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_qtycase));
        sb.append(dm).append(xfND(_qtybowl));
        sb.append(dm).append(xfND(_qtypal));
        sb.append(dm).append(xfND(_inoutkbn));
        sb.append(dm).append(xfND(_itemOrderby));
        sb.append(dm).append(xfND(_printpageno));
        sb.append(dm).append(xfND(_seqsortkey));
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
    public WWkreceiveplan clone() {
        return (WWkreceiveplan)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)} <br>
     * 格納先予定リスト情報ID
     * @return The value of the column 'W_WKRECEIVEPLAN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getWWkreceiveplanId() {
        checkSpecifiedProperty("WWkreceiveplanId");
        return _wWkreceiveplanId;
    }

    /**
     * [set] W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)} <br>
     * 格納先予定リスト情報ID
     * @param wWkreceiveplanId The value of the column 'W_WKRECEIVEPLAN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWWkreceiveplanId(Long wWkreceiveplanId) {
        registerModifiedProperty("WWkreceiveplanId");
        _wWkreceiveplanId = wWkreceiveplanId;
    }

    /**
     * [get] PRINTKEY: {NotNull, decimal(16, 6)} <br>
     * 印刷キー
     * @return The value of the column 'PRINTKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPrintkey() {
        checkSpecifiedProperty("printkey");
        return _printkey;
    }

    /**
     * [set] PRINTKEY: {NotNull, decimal(16, 6)} <br>
     * 印刷キー
     * @param printkey The value of the column 'PRINTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setPrintkey(java.math.BigDecimal printkey) {
        registerModifiedProperty("printkey");
        _printkey = printkey;
    }

    /**
     * [get] LINE_NO: {NotNull, bigint(19)} <br>
     * 格納先予定リスト明細No.
     * @return The value of the column 'LINE_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getLineNo() {
        checkSpecifiedProperty("lineNo");
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {NotNull, bigint(19)} <br>
     * 格納先予定リスト明細No.
     * @param lineNo The value of the column 'LINE_NO'. (basically NotNull if update: for the constraint)
     */
    public void setLineNo(Long lineNo) {
        registerModifiedProperty("lineNo");
        _lineNo = lineNo;
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
     * [get] RCVLINENO: {decimal(16, 6)} <br>
     * 入庫行No.
     * @return The value of the column 'RCVLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRcvlineno() {
        checkSpecifiedProperty("rcvlineno");
        return _rcvlineno;
    }

    /**
     * [set] RCVLINENO: {decimal(16, 6)} <br>
     * 入庫行No.
     * @param rcvlineno The value of the column 'RCVLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvlineno(java.math.BigDecimal rcvlineno) {
        registerModifiedProperty("rcvlineno");
        _rcvlineno = rcvlineno;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] WAREHOUSE_SNAME: {varchar(100)} <br>
     * 拠点名称
     * @return The value of the column 'WAREHOUSE_SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseSname() {
        checkSpecifiedProperty("warehouseSname");
        return convertEmptyToNull(_warehouseSname);
    }

    /**
     * [set] WAREHOUSE_SNAME: {varchar(100)} <br>
     * 拠点名称
     * @param warehouseSname The value of the column 'WAREHOUSE_SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseSname(String warehouseSname) {
        registerModifiedProperty("warehouseSname");
        _warehouseSname = warehouseSname;
    }

    /**
     * [get] SLOTLOCNAME: {varchar(255)} <br>
     * 入庫予定ロケーション
     * @return The value of the column 'SLOTLOCNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlotlocname() {
        checkSpecifiedProperty("slotlocname");
        return convertEmptyToNull(_slotlocname);
    }

    /**
     * [set] SLOTLOCNAME: {varchar(255)} <br>
     * 入庫予定ロケーション
     * @param slotlocname The value of the column 'SLOTLOCNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlotlocname(String slotlocname) {
        registerModifiedProperty("slotlocname");
        _slotlocname = slotlocname;
    }

    /**
     * [get] RCVSCHDATE: {varchar(8)} <br>
     * 入庫予定日・時刻
     * @return The value of the column 'RCVSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvschdate() {
        checkSpecifiedProperty("rcvschdate");
        return convertEmptyToNull(_rcvschdate);
    }

    /**
     * [set] RCVSCHDATE: {varchar(8)} <br>
     * 入庫予定日・時刻
     * @param rcvschdate The value of the column 'RCVSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvschdate(String rcvschdate) {
        registerModifiedProperty("rcvschdate");
        _rcvschdate = rcvschdate;
    }

    /**
     * [get] RECEIVE_LOT4: {varchar(8)} <br>
     * 入庫予定製造年月日
     * @return The value of the column 'RECEIVE_LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveLot4() {
        checkSpecifiedProperty("receiveLot4");
        return convertEmptyToNull(_receiveLot4);
    }

    /**
     * [set] RECEIVE_LOT4: {varchar(8)} <br>
     * 入庫予定製造年月日
     * @param receiveLot4 The value of the column 'RECEIVE_LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveLot4(String receiveLot4) {
        registerModifiedProperty("receiveLot4");
        _receiveLot4 = receiveLot4;
    }

    /**
     * [get] RECEIVE_LOT3: {varchar(60)} <br>
     * 入庫予定デザイン区分
     * @return The value of the column 'RECEIVE_LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveLot3() {
        checkSpecifiedProperty("receiveLot3");
        return convertEmptyToNull(_receiveLot3);
    }

    /**
     * [set] RECEIVE_LOT3: {varchar(60)} <br>
     * 入庫予定デザイン区分
     * @param receiveLot3 The value of the column 'RECEIVE_LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveLot3(String receiveLot3) {
        registerModifiedProperty("receiveLot3");
        _receiveLot3 = receiveLot3;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] CASEQTY_CAPACITY: {bigint(19)} <br>
     * 許容ケース数
     * @return The value of the column 'CASEQTY_CAPACITY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCaseqtyCapacity() {
        checkSpecifiedProperty("caseqtyCapacity");
        return _caseqtyCapacity;
    }

    /**
     * [set] CASEQTY_CAPACITY: {bigint(19)} <br>
     * 許容ケース数
     * @param caseqtyCapacity The value of the column 'CASEQTY_CAPACITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseqtyCapacity(Long caseqtyCapacity) {
        registerModifiedProperty("caseqtyCapacity");
        _caseqtyCapacity = caseqtyCapacity;
    }

    /**
     * [get] FLOOR: {varchar(60)} <br>
     * フロア
     * @return The value of the column 'FLOOR'. (NullAllowed even if selected: for no constraint)
     */
    public String getFloor() {
        checkSpecifiedProperty("floor");
        return convertEmptyToNull(_floor);
    }

    /**
     * [set] FLOOR: {varchar(60)} <br>
     * フロア
     * @param floor The value of the column 'FLOOR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFloor(String floor) {
        registerModifiedProperty("floor");
        _floor = floor;
    }

    /**
     * [get] FROMFAX: {varchar(60)} <br>
     * ラインNO
     * @return The value of the column 'FROMFAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromfax() {
        checkSpecifiedProperty("fromfax");
        return convertEmptyToNull(_fromfax);
    }

    /**
     * [set] FROMFAX: {varchar(60)} <br>
     * ラインNO
     * @param fromfax The value of the column 'FROMFAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromfax(String fromfax) {
        registerModifiedProperty("fromfax");
        _fromfax = fromfax;
    }

    /**
     * [get] FROMPHONE: {varchar(60)} <br>
     * 搬入順
     * @return The value of the column 'FROMPHONE'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromphone() {
        checkSpecifiedProperty("fromphone");
        return convertEmptyToNull(_fromphone);
    }

    /**
     * [set] FROMPHONE: {varchar(60)} <br>
     * 搬入順
     * @param fromphone The value of the column 'FROMPHONE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromphone(String fromphone) {
        registerModifiedProperty("fromphone");
        _fromphone = fromphone;
    }

    /**
     * [get] SUPPLIERRCVNO: {varchar(60)} <br>
     * 整理番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrcvno() {
        checkSpecifiedProperty("supplierrcvno");
        return convertEmptyToNull(_supplierrcvno);
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(60)} <br>
     * 整理番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        registerModifiedProperty("supplierrcvno");
        _supplierrcvno = supplierrcvno;
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
     * [get] ITEMNAME: {varchar(100)} <br>
     * 銘柄名称
     * @return The value of the column 'ITEMNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemname() {
        checkSpecifiedProperty("itemname");
        return convertEmptyToNull(_itemname);
    }

    /**
     * [set] ITEMNAME: {varchar(100)} <br>
     * 銘柄名称
     * @param itemname The value of the column 'ITEMNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemname(String itemname) {
        registerModifiedProperty("itemname");
        _itemname = itemname;
    }

    /**
     * [get] ZONE: {varchar(60)} <br>
     * ゾーン
     * @return The value of the column 'ZONE'. (NullAllowed even if selected: for no constraint)
     */
    public String getZone() {
        checkSpecifiedProperty("zone");
        return convertEmptyToNull(_zone);
    }

    /**
     * [set] ZONE: {varchar(60)} <br>
     * ゾーン
     * @param zone The value of the column 'ZONE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZone(String zone) {
        registerModifiedProperty("zone");
        _zone = zone;
    }

    /**
     * [get] EXPECTQTY: {decimal(16, 6)} <br>
     * 格納予定数量（バラ）
     * @return The value of the column 'EXPECTQTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getExpectqty() {
        checkSpecifiedProperty("expectqty");
        return _expectqty;
    }

    /**
     * [set] EXPECTQTY: {decimal(16, 6)} <br>
     * 格納予定数量（バラ）
     * @param expectqty The value of the column 'EXPECTQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectqty(java.math.BigDecimal expectqty) {
        registerModifiedProperty("expectqty");
        _expectqty = expectqty;
    }

    /**
     * [get] RCVPAL: {decimal(16, 6)} <br>
     * 格納予定数量（パレット）
     * @return The value of the column 'RCVPAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRcvpal() {
        checkSpecifiedProperty("rcvpal");
        return _rcvpal;
    }

    /**
     * [set] RCVPAL: {decimal(16, 6)} <br>
     * 格納予定数量（パレット）
     * @param rcvpal The value of the column 'RCVPAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvpal(java.math.BigDecimal rcvpal) {
        registerModifiedProperty("rcvpal");
        _rcvpal = rcvpal;
    }

    /**
     * [get] RCVCASE: {decimal(16, 6)} <br>
     * 格納予定数量（ケース）
     * @return The value of the column 'RCVCASE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRcvcase() {
        checkSpecifiedProperty("rcvcase");
        return _rcvcase;
    }

    /**
     * [set] RCVCASE: {decimal(16, 6)} <br>
     * 格納予定数量（ケース）
     * @param rcvcase The value of the column 'RCVCASE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvcase(java.math.BigDecimal rcvcase) {
        registerModifiedProperty("rcvcase");
        _rcvcase = rcvcase;
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
     * [get] QTYCASE: {decimal(16, 6)} <br>
     * 在庫ケース数
     * @return The value of the column 'QTYCASE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getQtycase() {
        checkSpecifiedProperty("qtycase");
        return _qtycase;
    }

    /**
     * [set] QTYCASE: {decimal(16, 6)} <br>
     * 在庫ケース数
     * @param qtycase The value of the column 'QTYCASE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQtycase(java.math.BigDecimal qtycase) {
        registerModifiedProperty("qtycase");
        _qtycase = qtycase;
    }

    /**
     * [get] QTYBOWL: {decimal(16, 6)} <br>
     * 在庫カートン数
     * @return The value of the column 'QTYBOWL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getQtybowl() {
        checkSpecifiedProperty("qtybowl");
        return _qtybowl;
    }

    /**
     * [set] QTYBOWL: {decimal(16, 6)} <br>
     * 在庫カートン数
     * @param qtybowl The value of the column 'QTYBOWL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQtybowl(java.math.BigDecimal qtybowl) {
        registerModifiedProperty("qtybowl");
        _qtybowl = qtybowl;
    }

    /**
     * [get] QTYPAL: {decimal(16, 6)} <br>
     * 在庫パレット数
     * @return The value of the column 'QTYPAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getQtypal() {
        checkSpecifiedProperty("qtypal");
        return _qtypal;
    }

    /**
     * [set] QTYPAL: {decimal(16, 6)} <br>
     * 在庫パレット数
     * @param qtypal The value of the column 'QTYPAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQtypal(java.math.BigDecimal qtypal) {
        registerModifiedProperty("qtypal");
        _qtypal = qtypal;
    }

    /**
     * [get] INOUTKBN: {varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'INOUTKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getInoutkbn() {
        checkSpecifiedProperty("inoutkbn");
        return convertEmptyToNull(_inoutkbn);
    }

    /**
     * [set] INOUTKBN: {varchar(30)} <br>
     * 内外区分
     * @param inoutkbn The value of the column 'INOUTKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInoutkbn(String inoutkbn) {
        registerModifiedProperty("inoutkbn");
        _inoutkbn = inoutkbn;
    }

    /**
     * [get] ITEM_ORDERBY: {bigint(19)} <br>
     * 一般出力順
     * @return The value of the column 'ITEM_ORDERBY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getItemOrderby() {
        checkSpecifiedProperty("itemOrderby");
        return _itemOrderby;
    }

    /**
     * [set] ITEM_ORDERBY: {bigint(19)} <br>
     * 一般出力順
     * @param itemOrderby The value of the column 'ITEM_ORDERBY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemOrderby(Long itemOrderby) {
        registerModifiedProperty("itemOrderby");
        _itemOrderby = itemOrderby;
    }

    /**
     * [get] PRINTPAGENO: {bigint(19)} <br>
     * 帳票改頁
     * @return The value of the column 'PRINTPAGENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPrintpageno() {
        checkSpecifiedProperty("printpageno");
        return _printpageno;
    }

    /**
     * [set] PRINTPAGENO: {bigint(19)} <br>
     * 帳票改頁
     * @param printpageno The value of the column 'PRINTPAGENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintpageno(Long printpageno) {
        registerModifiedProperty("printpageno");
        _printpageno = printpageno;
    }

    /**
     * [get] SEQSORTKEY: {decimal(16, 6)} <br>
     * 連番ソートキー
     * @return The value of the column 'SEQSORTKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSeqsortkey() {
        checkSpecifiedProperty("seqsortkey");
        return _seqsortkey;
    }

    /**
     * [set] SEQSORTKEY: {decimal(16, 6)} <br>
     * 連番ソートキー
     * @param seqsortkey The value of the column 'SEQSORTKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSeqsortkey(java.math.BigDecimal seqsortkey) {
        registerModifiedProperty("seqsortkey");
        _seqsortkey = seqsortkey;
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
