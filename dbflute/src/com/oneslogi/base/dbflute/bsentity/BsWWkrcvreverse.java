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
 * The entity of W_WKRCVREVERSE as TABLE. <br>
 * 製造年月日逆転リスト（入庫）情報
 * <pre>
 * [primary-key]
 *     PRINTKEY, RCVREVERSENO, RCVREVERSELINENO
 *
 * [column]
 *     PRINTKEY, RCVREVERSENO, RCVREVERSELINENO, WAREHOUSECD, WAREHOUSENAME, TRANSPORTNO, RCVSCHDATE, SUPPLIERCD, SUPPLIERNAME, PRODUCT_CD, ITEMNAME, RCVLIMITDATE, RCVDESIGNCD, RCVQTY, WORKDATETIME, LOC, LOCCD, LIMITDAY, DESIGNCD, QTYCASE, QTYBOWL, FLG, INSIDE_OUTSIDE_KBN, ITEM_ORDERBY, PRINTPAGENO, SEQSORTKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * java.math.BigDecimal printkey = entity.getPrintkey();
 * java.math.BigDecimal rcvreverseno = entity.getRcvreverseno();
 * Long rcvreverselineno = entity.getRcvreverselineno();
 * String warehousecd = entity.getWarehousecd();
 * String warehousename = entity.getWarehousename();
 * String transportno = entity.getTransportno();
 * String rcvschdate = entity.getRcvschdate();
 * String suppliercd = entity.getSuppliercd();
 * String suppliername = entity.getSuppliername();
 * String productCd = entity.getProductCd();
 * String itemname = entity.getItemname();
 * String rcvlimitdate = entity.getRcvlimitdate();
 * String rcvdesigncd = entity.getRcvdesigncd();
 * String rcvqty = entity.getRcvqty();
 * String workdatetime = entity.getWorkdatetime();
 * String loc = entity.getLoc();
 * String loccd = entity.getLoccd();
 * String limitday = entity.getLimitday();
 * String designcd = entity.getDesigncd();
 * java.math.BigDecimal qtycase = entity.getQtycase();
 * java.math.BigDecimal qtybowl = entity.getQtybowl();
 * String flg = entity.getFlg();
 * String insideOutsideKbn = entity.getInsideOutsideKbn();
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
 * entity.setPrintkey(printkey);
 * entity.setRcvreverseno(rcvreverseno);
 * entity.setRcvreverselineno(rcvreverselineno);
 * entity.setWarehousecd(warehousecd);
 * entity.setWarehousename(warehousename);
 * entity.setTransportno(transportno);
 * entity.setRcvschdate(rcvschdate);
 * entity.setSuppliercd(suppliercd);
 * entity.setSuppliername(suppliername);
 * entity.setProductCd(productCd);
 * entity.setItemname(itemname);
 * entity.setRcvlimitdate(rcvlimitdate);
 * entity.setRcvdesigncd(rcvdesigncd);
 * entity.setRcvqty(rcvqty);
 * entity.setWorkdatetime(workdatetime);
 * entity.setLoc(loc);
 * entity.setLoccd(loccd);
 * entity.setLimitday(limitday);
 * entity.setDesigncd(designcd);
 * entity.setQtycase(qtycase);
 * entity.setQtybowl(qtybowl);
 * entity.setFlg(flg);
 * entity.setInsideOutsideKbn(insideOutsideKbn);
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
public abstract class BsWWkrcvreverse extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRINTKEY: {PK, NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _printkey;

    /** RCVREVERSENO: {PK, NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _rcvreverseno;

    /** RCVREVERSELINENO: {PK, NotNull, bigint(19)} */
    protected Long _rcvreverselineno;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    protected String _warehousecd;

    /** WAREHOUSENAME: {varchar(100)} */
    protected String _warehousename;

    /** TRANSPORTNO: {NotNull, varchar(60)} */
    protected String _transportno;

    /** RCVSCHDATE: {NotNull, varchar(8)} */
    protected String _rcvschdate;

    /** SUPPLIERCD: {NotNull, varchar(30)} */
    protected String _suppliercd;

    /** SUPPLIERNAME: {varchar(255)} */
    protected String _suppliername;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** ITEMNAME: {varchar(100)} */
    protected String _itemname;

    /** RCVLIMITDATE: {NotNull, varchar(255)} */
    protected String _rcvlimitdate;

    /** RCVDESIGNCD: {varchar(100)} */
    protected String _rcvdesigncd;

    /** RCVQTY: {NotNull, varchar(4000)} */
    protected String _rcvqty;

    /** WORKDATETIME: {varchar(8)} */
    protected String _workdatetime;

    /** LOC: {NotNull, varchar(30)} */
    protected String _loc;

    /** LOCCD: {varchar(30)} */
    protected String _loccd;

    /** LIMITDAY: {NotNull, varchar(8)} */
    protected String _limitday;

    /** DESIGNCD: {varchar(30)} */
    protected String _designcd;

    /** QTYCASE: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _qtycase;

    /** QTYBOWL: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _qtybowl;

    /** FLG: {char(1)} */
    protected String _flg;

    /** INSIDE_OUTSIDE_KBN: {varchar(60)} */
    protected String _insideOutsideKbn;

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
        return "W_WKRCVREVERSE";
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
        if (_printkey == null) { return false; }
        if (_rcvreverseno == null) { return false; }
        if (_rcvreverselineno == null) { return false; }
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
        if (obj instanceof BsWWkrcvreverse) {
            BsWWkrcvreverse other = (BsWWkrcvreverse)obj;
            if (!xSV(_printkey, other._printkey)) { return false; }
            if (!xSV(_rcvreverseno, other._rcvreverseno)) { return false; }
            if (!xSV(_rcvreverselineno, other._rcvreverselineno)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _printkey);
        hs = xCH(hs, _rcvreverseno);
        hs = xCH(hs, _rcvreverselineno);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_printkey));
        sb.append(dm).append(xfND(_rcvreverseno));
        sb.append(dm).append(xfND(_rcvreverselineno));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_warehousename));
        sb.append(dm).append(xfND(_transportno));
        sb.append(dm).append(xfND(_rcvschdate));
        sb.append(dm).append(xfND(_suppliercd));
        sb.append(dm).append(xfND(_suppliername));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_itemname));
        sb.append(dm).append(xfND(_rcvlimitdate));
        sb.append(dm).append(xfND(_rcvdesigncd));
        sb.append(dm).append(xfND(_rcvqty));
        sb.append(dm).append(xfND(_workdatetime));
        sb.append(dm).append(xfND(_loc));
        sb.append(dm).append(xfND(_loccd));
        sb.append(dm).append(xfND(_limitday));
        sb.append(dm).append(xfND(_designcd));
        sb.append(dm).append(xfND(_qtycase));
        sb.append(dm).append(xfND(_qtybowl));
        sb.append(dm).append(xfND(_flg));
        sb.append(dm).append(xfND(_insideOutsideKbn));
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
    public WWkrcvreverse clone() {
        return (WWkrcvreverse)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRINTKEY: {PK, NotNull, decimal(16, 6)} <br>
     * 印刷キー
     * @return The value of the column 'PRINTKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPrintkey() {
        checkSpecifiedProperty("printkey");
        return _printkey;
    }

    /**
     * [set] PRINTKEY: {PK, NotNull, decimal(16, 6)} <br>
     * 印刷キー
     * @param printkey The value of the column 'PRINTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setPrintkey(java.math.BigDecimal printkey) {
        registerModifiedProperty("printkey");
        _printkey = printkey;
    }

    /**
     * [get] RCVREVERSENO: {PK, NotNull, decimal(16, 6)} <br>
     * 逆転リストNo.
     * @return The value of the column 'RCVREVERSENO'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRcvreverseno() {
        checkSpecifiedProperty("rcvreverseno");
        return _rcvreverseno;
    }

    /**
     * [set] RCVREVERSENO: {PK, NotNull, decimal(16, 6)} <br>
     * 逆転リストNo.
     * @param rcvreverseno The value of the column 'RCVREVERSENO'. (basically NotNull if update: for the constraint)
     */
    public void setRcvreverseno(java.math.BigDecimal rcvreverseno) {
        registerModifiedProperty("rcvreverseno");
        _rcvreverseno = rcvreverseno;
    }

    /**
     * [get] RCVREVERSELINENO: {PK, NotNull, bigint(19)} <br>
     * 逆転リスト明細No.
     * @return The value of the column 'RCVREVERSELINENO'. (basically NotNull if selected: for the constraint)
     */
    public Long getRcvreverselineno() {
        checkSpecifiedProperty("rcvreverselineno");
        return _rcvreverselineno;
    }

    /**
     * [set] RCVREVERSELINENO: {PK, NotNull, bigint(19)} <br>
     * 逆転リスト明細No.
     * @param rcvreverselineno The value of the column 'RCVREVERSELINENO'. (basically NotNull if update: for the constraint)
     */
    public void setRcvreverselineno(Long rcvreverselineno) {
        registerModifiedProperty("rcvreverselineno");
        _rcvreverselineno = rcvreverselineno;
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
     * [get] WAREHOUSENAME: {varchar(100)} <br>
     * 拠点名称
     * @return The value of the column 'WAREHOUSENAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousename() {
        checkSpecifiedProperty("warehousename");
        return convertEmptyToNull(_warehousename);
    }

    /**
     * [set] WAREHOUSENAME: {varchar(100)} <br>
     * 拠点名称
     * @param warehousename The value of the column 'WAREHOUSENAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousename(String warehousename) {
        registerModifiedProperty("warehousename");
        _warehousename = warehousename;
    }

    /**
     * [get] TRANSPORTNO: {NotNull, varchar(60)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTNO'. (basically NotNull if selected: for the constraint)
     */
    public String getTransportno() {
        checkSpecifiedProperty("transportno");
        return convertEmptyToNull(_transportno);
    }

    /**
     * [set] TRANSPORTNO: {NotNull, varchar(60)} <br>
     * 輸送番号
     * @param transportno The value of the column 'TRANSPORTNO'. (basically NotNull if update: for the constraint)
     */
    public void setTransportno(String transportno) {
        registerModifiedProperty("transportno");
        _transportno = transportno;
    }

    /**
     * [get] RCVSCHDATE: {NotNull, varchar(8)} <br>
     * 受入予定年月日
     * @return The value of the column 'RCVSCHDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getRcvschdate() {
        checkSpecifiedProperty("rcvschdate");
        return convertEmptyToNull(_rcvschdate);
    }

    /**
     * [set] RCVSCHDATE: {NotNull, varchar(8)} <br>
     * 受入予定年月日
     * @param rcvschdate The value of the column 'RCVSCHDATE'. (basically NotNull if update: for the constraint)
     */
    public void setRcvschdate(String rcvschdate) {
        registerModifiedProperty("rcvschdate");
        _rcvschdate = rcvschdate;
    }

    /**
     * [get] SUPPLIERCD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SUPPLIERCD'. (basically NotNull if selected: for the constraint)
     */
    public String getSuppliercd() {
        checkSpecifiedProperty("suppliercd");
        return convertEmptyToNull(_suppliercd);
    }

    /**
     * [set] SUPPLIERCD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (basically NotNull if update: for the constraint)
     */
    public void setSuppliercd(String suppliercd) {
        registerModifiedProperty("suppliercd");
        _suppliercd = suppliercd;
    }

    /**
     * [get] SUPPLIERNAME: {varchar(255)} <br>
     * 発送元名称
     * @return The value of the column 'SUPPLIERNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSuppliername() {
        checkSpecifiedProperty("suppliername");
        return convertEmptyToNull(_suppliername);
    }

    /**
     * [set] SUPPLIERNAME: {varchar(255)} <br>
     * 発送元名称
     * @param suppliername The value of the column 'SUPPLIERNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuppliername(String suppliername) {
        registerModifiedProperty("suppliername");
        _suppliername = suppliername;
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
     * [get] RCVLIMITDATE: {NotNull, varchar(255)} <br>
     * 入庫製品製造年月日
     * @return The value of the column 'RCVLIMITDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getRcvlimitdate() {
        checkSpecifiedProperty("rcvlimitdate");
        return convertEmptyToNull(_rcvlimitdate);
    }

    /**
     * [set] RCVLIMITDATE: {NotNull, varchar(255)} <br>
     * 入庫製品製造年月日
     * @param rcvlimitdate The value of the column 'RCVLIMITDATE'. (basically NotNull if update: for the constraint)
     */
    public void setRcvlimitdate(String rcvlimitdate) {
        registerModifiedProperty("rcvlimitdate");
        _rcvlimitdate = rcvlimitdate;
    }

    /**
     * [get] RCVDESIGNCD: {varchar(100)} <br>
     * 入庫製品デザイン区分
     * @return The value of the column 'RCVDESIGNCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvdesigncd() {
        checkSpecifiedProperty("rcvdesigncd");
        return convertEmptyToNull(_rcvdesigncd);
    }

    /**
     * [set] RCVDESIGNCD: {varchar(100)} <br>
     * 入庫製品デザイン区分
     * @param rcvdesigncd The value of the column 'RCVDESIGNCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvdesigncd(String rcvdesigncd) {
        registerModifiedProperty("rcvdesigncd");
        _rcvdesigncd = rcvdesigncd;
    }

    /**
     * [get] RCVQTY: {NotNull, varchar(4000)} <br>
     * 数量
     * @return The value of the column 'RCVQTY'. (basically NotNull if selected: for the constraint)
     */
    public String getRcvqty() {
        checkSpecifiedProperty("rcvqty");
        return convertEmptyToNull(_rcvqty);
    }

    /**
     * [set] RCVQTY: {NotNull, varchar(4000)} <br>
     * 数量
     * @param rcvqty The value of the column 'RCVQTY'. (basically NotNull if update: for the constraint)
     */
    public void setRcvqty(String rcvqty) {
        registerModifiedProperty("rcvqty");
        _rcvqty = rcvqty;
    }

    /**
     * [get] WORKDATETIME: {varchar(8)} <br>
     * 作業時刻
     * @return The value of the column 'WORKDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkdatetime() {
        checkSpecifiedProperty("workdatetime");
        return convertEmptyToNull(_workdatetime);
    }

    /**
     * [set] WORKDATETIME: {varchar(8)} <br>
     * 作業時刻
     * @param workdatetime The value of the column 'WORKDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkdatetime(String workdatetime) {
        registerModifiedProperty("workdatetime");
        _workdatetime = workdatetime;
    }

    /**
     * [get] LOC: {NotNull, varchar(30)} <br>
     * ロケーション区分
     * @return The value of the column 'LOC'. (basically NotNull if selected: for the constraint)
     */
    public String getLoc() {
        checkSpecifiedProperty("loc");
        return convertEmptyToNull(_loc);
    }

    /**
     * [set] LOC: {NotNull, varchar(30)} <br>
     * ロケーション区分
     * @param loc The value of the column 'LOC'. (basically NotNull if update: for the constraint)
     */
    public void setLoc(String loc) {
        registerModifiedProperty("loc");
        _loc = loc;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLoccd() {
        checkSpecifiedProperty("loccd");
        return convertEmptyToNull(_loccd);
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * ロケーションCD
     * @param loccd The value of the column 'LOCCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoccd(String loccd) {
        registerModifiedProperty("loccd");
        _loccd = loccd;
    }

    /**
     * [get] LIMITDAY: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LIMITDAY'. (basically NotNull if selected: for the constraint)
     */
    public String getLimitday() {
        checkSpecifiedProperty("limitday");
        return convertEmptyToNull(_limitday);
    }

    /**
     * [set] LIMITDAY: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param limitday The value of the column 'LIMITDAY'. (basically NotNull if update: for the constraint)
     */
    public void setLimitday(String limitday) {
        registerModifiedProperty("limitday");
        _limitday = limitday;
    }

    /**
     * [get] DESIGNCD: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncd() {
        checkSpecifiedProperty("designcd");
        return convertEmptyToNull(_designcd);
    }

    /**
     * [set] DESIGNCD: {varchar(30)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DESIGNCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncd(String designcd) {
        registerModifiedProperty("designcd");
        _designcd = designcd;
    }

    /**
     * [get] QTYCASE: {NotNull, decimal(16, 6)} <br>
     * 在庫ケース数
     * @return The value of the column 'QTYCASE'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getQtycase() {
        checkSpecifiedProperty("qtycase");
        return _qtycase;
    }

    /**
     * [set] QTYCASE: {NotNull, decimal(16, 6)} <br>
     * 在庫ケース数
     * @param qtycase The value of the column 'QTYCASE'. (basically NotNull if update: for the constraint)
     */
    public void setQtycase(java.math.BigDecimal qtycase) {
        registerModifiedProperty("qtycase");
        _qtycase = qtycase;
    }

    /**
     * [get] QTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 在庫カートン数
     * @return The value of the column 'QTYBOWL'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getQtybowl() {
        checkSpecifiedProperty("qtybowl");
        return _qtybowl;
    }

    /**
     * [set] QTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 在庫カートン数
     * @param qtybowl The value of the column 'QTYBOWL'. (basically NotNull if update: for the constraint)
     */
    public void setQtybowl(java.math.BigDecimal qtybowl) {
        registerModifiedProperty("qtybowl");
        _qtybowl = qtybowl;
    }

    /**
     * [get] FLG: {char(1)} <br>
     * 逆転フラグ
     * @return The value of the column 'FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg() {
        checkSpecifiedProperty("flg");
        return convertEmptyToNull(_flg);
    }

    /**
     * [set] FLG: {char(1)} <br>
     * 逆転フラグ
     * @param flg The value of the column 'FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg(String flg) {
        registerModifiedProperty("flg");
        _flg = flg;
    }

    /**
     * [get] INSIDE_OUTSIDE_KBN: {varchar(60)} <br>
     * 内外区分
     * @return The value of the column 'INSIDE_OUTSIDE_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getInsideOutsideKbn() {
        checkSpecifiedProperty("insideOutsideKbn");
        return convertEmptyToNull(_insideOutsideKbn);
    }

    /**
     * [set] INSIDE_OUTSIDE_KBN: {varchar(60)} <br>
     * 内外区分
     * @param insideOutsideKbn The value of the column 'INSIDE_OUTSIDE_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInsideOutsideKbn(String insideOutsideKbn) {
        registerModifiedProperty("insideOutsideKbn");
        _insideOutsideKbn = insideOutsideKbn;
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
