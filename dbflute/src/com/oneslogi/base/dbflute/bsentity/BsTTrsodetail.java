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
 * The entity of T_TRSODETAIL as TABLE. <br>
 * 出庫予定明細
 * <pre>
 * [primary-key]
 *     SODETAILID
 *
 * [column]
 *     SODETAILID, SOID, SOLINENO, ORDERLINENO, OWNERORDERLINENO, CUSTORDERLINENO, ORIGINALPOLINENO, PRODUCT_ID, IFITEMCD, LOT1, LOT2, LOT3, LOT4, LOT5, STOCK_TYPE_CD, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, EXPECTQTY1, XDOCKQTY1, ALLOCQTY1, PICKEDQTY1, SORTEDQTY1, INSPECTEDQTY1, SHIPPEDQTY1, ADJUSTQTY1, PRICE1, PRICE2, PRICE3, NOTES, LOTRESERVEFLG, PICKQTYERRORFLG, LOGICFLG1, LOGICFLG2, LOGICFLG3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SODETAILID
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
 * Long sodetailid = entity.getSodetailid();
 * Long soid = entity.getSoid();
 * Long solineno = entity.getSolineno();
 * Long orderlineno = entity.getOrderlineno();
 * Long ownerorderlineno = entity.getOwnerorderlineno();
 * Long custorderlineno = entity.getCustorderlineno();
 * Long originalpolineno = entity.getOriginalpolineno();
 * Long productId = entity.getProductId();
 * String ifitemcd = entity.getIfitemcd();
 * String lot1 = entity.getLot1();
 * String lot2 = entity.getLot2();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String lot5 = entity.getLot5();
 * String stockTypeCd = entity.getStockTypeCd();
 * String otherlot2 = entity.getOtherlot2();
 * String otherlot3 = entity.getOtherlot3();
 * String otherlot4 = entity.getOtherlot4();
 * Long otherlot5 = entity.getOtherlot5();
 * String damageflg = entity.getDamageflg();
 * String noshippingflg = entity.getNoshippingflg();
 * String foreigncargoflg = entity.getForeigncargoflg();
 * String customsreleaseflg = entity.getCustomsreleaseflg();
 * String taxflg = entity.getTaxflg();
 * Long expectqty1 = entity.getExpectqty1();
 * Long xdockqty1 = entity.getXdockqty1();
 * Long allocqty1 = entity.getAllocqty1();
 * Long pickedqty1 = entity.getPickedqty1();
 * Long sortedqty1 = entity.getSortedqty1();
 * Long inspectedqty1 = entity.getInspectedqty1();
 * Long shippedqty1 = entity.getShippedqty1();
 * Long adjustqty1 = entity.getAdjustqty1();
 * java.math.BigDecimal price1 = entity.getPrice1();
 * java.math.BigDecimal price2 = entity.getPrice2();
 * java.math.BigDecimal price3 = entity.getPrice3();
 * String notes = entity.getNotes();
 * String lotreserveflg = entity.getLotreserveflg();
 * String pickqtyerrorflg = entity.getPickqtyerrorflg();
 * String logicflg1 = entity.getLogicflg1();
 * String logicflg2 = entity.getLogicflg2();
 * String logicflg3 = entity.getLogicflg3();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSodetailid(sodetailid);
 * entity.setSoid(soid);
 * entity.setSolineno(solineno);
 * entity.setOrderlineno(orderlineno);
 * entity.setOwnerorderlineno(ownerorderlineno);
 * entity.setCustorderlineno(custorderlineno);
 * entity.setOriginalpolineno(originalpolineno);
 * entity.setProductId(productId);
 * entity.setIfitemcd(ifitemcd);
 * entity.setLot1(lot1);
 * entity.setLot2(lot2);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setLot5(lot5);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setOtherlot2(otherlot2);
 * entity.setOtherlot3(otherlot3);
 * entity.setOtherlot4(otherlot4);
 * entity.setOtherlot5(otherlot5);
 * entity.setDamageflg(damageflg);
 * entity.setNoshippingflg(noshippingflg);
 * entity.setForeigncargoflg(foreigncargoflg);
 * entity.setCustomsreleaseflg(customsreleaseflg);
 * entity.setTaxflg(taxflg);
 * entity.setExpectqty1(expectqty1);
 * entity.setXdockqty1(xdockqty1);
 * entity.setAllocqty1(allocqty1);
 * entity.setPickedqty1(pickedqty1);
 * entity.setSortedqty1(sortedqty1);
 * entity.setInspectedqty1(inspectedqty1);
 * entity.setShippedqty1(shippedqty1);
 * entity.setAdjustqty1(adjustqty1);
 * entity.setPrice1(price1);
 * entity.setPrice2(price2);
 * entity.setPrice3(price3);
 * entity.setNotes(notes);
 * entity.setLotreserveflg(lotreserveflg);
 * entity.setPickqtyerrorflg(pickqtyerrorflg);
 * entity.setLogicflg1(logicflg1);
 * entity.setLogicflg2(logicflg2);
 * entity.setLogicflg3(logicflg3);
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
public abstract class BsTTrsodetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SODETAILID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _sodetailid;

    /** SOID: {NotNull, bigint(19)} */
    protected Long _soid;

    /** SOLINENO: {NotNull, bigint(19)} */
    protected Long _solineno;

    /** ORDERLINENO: {bigint(19)} */
    protected Long _orderlineno;

    /** OWNERORDERLINENO: {bigint(19)} */
    protected Long _ownerorderlineno;

    /** CUSTORDERLINENO: {bigint(19)} */
    protected Long _custorderlineno;

    /** ORIGINALPOLINENO: {bigint(19)} */
    protected Long _originalpolineno;

    /** PRODUCT_ID: {IX, NotNull, bigint(19)} */
    protected Long _productId;

    /** IFITEMCD: {varchar(30)} */
    protected String _ifitemcd;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT2: {varchar(60)} */
    protected String _lot2;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** LOT5: {varchar(8)} */
    protected String _lot5;

    /** STOCK_TYPE_CD: {varchar(30)} */
    protected String _stockTypeCd;

    /** OTHERLOT2: {varchar(60)} */
    protected String _otherlot2;

    /** OTHERLOT3: {varchar(60)} */
    protected String _otherlot3;

    /** OTHERLOT4: {varchar(60)} */
    protected String _otherlot4;

    /** OTHERLOT5: {bigint(19)} */
    protected Long _otherlot5;

    /** DAMAGEFLG: {NotNull, char(1), default=[(0)]} */
    protected String _damageflg;

    /** NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]} */
    protected String _noshippingflg;

    /** FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]} */
    protected String _foreigncargoflg;

    /** CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]} */
    protected String _customsreleaseflg;

    /** TAXFLG: {NotNull, char(1), default=[(0)]} */
    protected String _taxflg;

    /** EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _expectqty1;

    /** XDOCKQTY1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _xdockqty1;

    /** ALLOCQTY1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _allocqty1;

    /** PICKEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _pickedqty1;

    /** SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _sortedqty1;

    /** INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _inspectedqty1;

    /** SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _shippedqty1;

    /** ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _adjustqty1;

    /** PRICE1: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _price1;

    /** PRICE2: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _price2;

    /** PRICE3: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _price3;

    /** NOTES: {varchar(30)} */
    protected String _notes;

    /** LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]} */
    protected String _lotreserveflg;

    /** PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]} */
    protected String _pickqtyerrorflg;

    /** LOGICFLG1: {NotNull, char(1), default=[(0)]} */
    protected String _logicflg1;

    /** LOGICFLG2: {NotNull, char(1), default=[(0)]} */
    protected String _logicflg2;

    /** LOGICFLG3: {NotNull, char(1), default=[(0)]} */
    protected String _logicflg3;

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
        return "T_TRSODETAIL";
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
        if (_sodetailid == null) { return false; }
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
        if (obj instanceof BsTTrsodetail) {
            BsTTrsodetail other = (BsTTrsodetail)obj;
            if (!xSV(_sodetailid, other._sodetailid)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sodetailid);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sodetailid));
        sb.append(dm).append(xfND(_soid));
        sb.append(dm).append(xfND(_solineno));
        sb.append(dm).append(xfND(_orderlineno));
        sb.append(dm).append(xfND(_ownerorderlineno));
        sb.append(dm).append(xfND(_custorderlineno));
        sb.append(dm).append(xfND(_originalpolineno));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_ifitemcd));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot5));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_otherlot2));
        sb.append(dm).append(xfND(_otherlot3));
        sb.append(dm).append(xfND(_otherlot4));
        sb.append(dm).append(xfND(_otherlot5));
        sb.append(dm).append(xfND(_damageflg));
        sb.append(dm).append(xfND(_noshippingflg));
        sb.append(dm).append(xfND(_foreigncargoflg));
        sb.append(dm).append(xfND(_customsreleaseflg));
        sb.append(dm).append(xfND(_taxflg));
        sb.append(dm).append(xfND(_expectqty1));
        sb.append(dm).append(xfND(_xdockqty1));
        sb.append(dm).append(xfND(_allocqty1));
        sb.append(dm).append(xfND(_pickedqty1));
        sb.append(dm).append(xfND(_sortedqty1));
        sb.append(dm).append(xfND(_inspectedqty1));
        sb.append(dm).append(xfND(_shippedqty1));
        sb.append(dm).append(xfND(_adjustqty1));
        sb.append(dm).append(xfND(_price1));
        sb.append(dm).append(xfND(_price2));
        sb.append(dm).append(xfND(_price3));
        sb.append(dm).append(xfND(_notes));
        sb.append(dm).append(xfND(_lotreserveflg));
        sb.append(dm).append(xfND(_pickqtyerrorflg));
        sb.append(dm).append(xfND(_logicflg1));
        sb.append(dm).append(xfND(_logicflg2));
        sb.append(dm).append(xfND(_logicflg3));
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
    public TTrsodetail clone() {
        return (TTrsodetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SODETAILID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫予定明細ID
     * @return The value of the column 'SODETAILID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSodetailid() {
        checkSpecifiedProperty("sodetailid");
        return _sodetailid;
    }

    /**
     * [set] SODETAILID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫予定明細ID
     * @param sodetailid The value of the column 'SODETAILID'. (basically NotNull if update: for the constraint)
     */
    public void setSodetailid(Long sodetailid) {
        registerModifiedProperty("sodetailid");
        _sodetailid = sodetailid;
    }

    /**
     * [get] SOID: {NotNull, bigint(19)} <br>
     * 出庫予定ID
     * @return The value of the column 'SOID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSoid() {
        checkSpecifiedProperty("soid");
        return _soid;
    }

    /**
     * [set] SOID: {NotNull, bigint(19)} <br>
     * 出庫予定ID
     * @param soid The value of the column 'SOID'. (basically NotNull if update: for the constraint)
     */
    public void setSoid(Long soid) {
        registerModifiedProperty("soid");
        _soid = soid;
    }

    /**
     * [get] SOLINENO: {NotNull, bigint(19)} <br>
     * 出庫指示行№
     * @return The value of the column 'SOLINENO'. (basically NotNull if selected: for the constraint)
     */
    public Long getSolineno() {
        checkSpecifiedProperty("solineno");
        return _solineno;
    }

    /**
     * [set] SOLINENO: {NotNull, bigint(19)} <br>
     * 出庫指示行№
     * @param solineno The value of the column 'SOLINENO'. (basically NotNull if update: for the constraint)
     */
    public void setSolineno(Long solineno) {
        registerModifiedProperty("solineno");
        _solineno = solineno;
    }

    /**
     * [get] ORDERLINENO: {bigint(19)} <br>
     * 受注オーダ行№
     * @return The value of the column 'ORDERLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOrderlineno() {
        checkSpecifiedProperty("orderlineno");
        return _orderlineno;
    }

    /**
     * [set] ORDERLINENO: {bigint(19)} <br>
     * 受注オーダ行№
     * @param orderlineno The value of the column 'ORDERLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderlineno(Long orderlineno) {
        registerModifiedProperty("orderlineno");
        _orderlineno = orderlineno;
    }

    /**
     * [get] OWNERORDERLINENO: {bigint(19)} <br>
     * 荷主オーダ行№
     * @return The value of the column 'OWNERORDERLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOwnerorderlineno() {
        checkSpecifiedProperty("ownerorderlineno");
        return _ownerorderlineno;
    }

    /**
     * [set] OWNERORDERLINENO: {bigint(19)} <br>
     * 荷主オーダ行№
     * @param ownerorderlineno The value of the column 'OWNERORDERLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnerorderlineno(Long ownerorderlineno) {
        registerModifiedProperty("ownerorderlineno");
        _ownerorderlineno = ownerorderlineno;
    }

    /**
     * [get] CUSTORDERLINENO: {bigint(19)} <br>
     * 顧客オーダ行№
     * @return The value of the column 'CUSTORDERLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCustorderlineno() {
        checkSpecifiedProperty("custorderlineno");
        return _custorderlineno;
    }

    /**
     * [set] CUSTORDERLINENO: {bigint(19)} <br>
     * 顧客オーダ行№
     * @param custorderlineno The value of the column 'CUSTORDERLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustorderlineno(Long custorderlineno) {
        registerModifiedProperty("custorderlineno");
        _custorderlineno = custorderlineno;
    }

    /**
     * [get] ORIGINALPOLINENO: {bigint(19)} <br>
     * 原始ＰＯ行№
     * @return The value of the column 'ORIGINALPOLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOriginalpolineno() {
        checkSpecifiedProperty("originalpolineno");
        return _originalpolineno;
    }

    /**
     * [set] ORIGINALPOLINENO: {bigint(19)} <br>
     * 原始ＰＯ行№
     * @param originalpolineno The value of the column 'ORIGINALPOLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOriginalpolineno(Long originalpolineno) {
        registerModifiedProperty("originalpolineno");
        _originalpolineno = originalpolineno;
    }

    /**
     * [get] PRODUCT_ID: {IX, NotNull, bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, NotNull, bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] IFITEMCD: {varchar(30)} <br>
     * 需給CD
     * @return The value of the column 'IFITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getIfitemcd() {
        checkSpecifiedProperty("ifitemcd");
        return convertEmptyToNull(_ifitemcd);
    }

    /**
     * [set] IFITEMCD: {varchar(30)} <br>
     * 需給CD
     * @param ifitemcd The value of the column 'IFITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfitemcd(String ifitemcd) {
        registerModifiedProperty("ifitemcd");
        _ifitemcd = ifitemcd;
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
     * [get] LOT5: {varchar(8)} <br>
     * 管理５（日付属性２）
     * @return The value of the column 'LOT5'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot5() {
        checkSpecifiedProperty("lot5");
        return convertEmptyToNull(_lot5);
    }

    /**
     * [set] LOT5: {varchar(8)} <br>
     * 管理５（日付属性２）
     * @param lot5 The value of the column 'LOT5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot5(String lot5) {
        registerModifiedProperty("lot5");
        _lot5 = lot5;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(30)} <br>
     * 在庫区分
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(30)} <br>
     * 在庫区分
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] OTHERLOT2: {varchar(60)} <br>
     * 依頼種別
     * @return The value of the column 'OTHERLOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot2() {
        checkSpecifiedProperty("otherlot2");
        return convertEmptyToNull(_otherlot2);
    }

    /**
     * [set] OTHERLOT2: {varchar(60)} <br>
     * 依頼種別
     * @param otherlot2 The value of the column 'OTHERLOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot2(String otherlot2) {
        registerModifiedProperty("otherlot2");
        _otherlot2 = otherlot2;
    }

    /**
     * [get] OTHERLOT3: {varchar(60)} <br>
     * 整理番号
     * @return The value of the column 'OTHERLOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot3() {
        checkSpecifiedProperty("otherlot3");
        return convertEmptyToNull(_otherlot3);
    }

    /**
     * [set] OTHERLOT3: {varchar(60)} <br>
     * 整理番号
     * @param otherlot3 The value of the column 'OTHERLOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot3(String otherlot3) {
        registerModifiedProperty("otherlot3");
        _otherlot3 = otherlot3;
    }

    /**
     * [get] OTHERLOT4: {varchar(60)} <br>
     * 依頼番号
     * @return The value of the column 'OTHERLOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot4() {
        checkSpecifiedProperty("otherlot4");
        return convertEmptyToNull(_otherlot4);
    }

    /**
     * [set] OTHERLOT4: {varchar(60)} <br>
     * 依頼番号
     * @param otherlot4 The value of the column 'OTHERLOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot4(String otherlot4) {
        registerModifiedProperty("otherlot4");
        _otherlot4 = otherlot4;
    }

    /**
     * [get] OTHERLOT5: {bigint(19)} <br>
     * その他属性５（数値）
     * @return The value of the column 'OTHERLOT5'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOtherlot5() {
        checkSpecifiedProperty("otherlot5");
        return _otherlot5;
    }

    /**
     * [set] OTHERLOT5: {bigint(19)} <br>
     * その他属性５（数値）
     * @param otherlot5 The value of the column 'OTHERLOT5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot5(Long otherlot5) {
        registerModifiedProperty("otherlot5");
        _otherlot5 = otherlot5;
    }

    /**
     * [get] DAMAGEFLG: {NotNull, char(1), default=[(0)]} <br>
     * 良品・不良品区分
     * @return The value of the column 'DAMAGEFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDamageflg() {
        checkSpecifiedProperty("damageflg");
        return convertEmptyToNull(_damageflg);
    }

    /**
     * [set] DAMAGEFLG: {NotNull, char(1), default=[(0)]} <br>
     * 良品・不良品区分
     * @param damageflg The value of the column 'DAMAGEFLG'. (basically NotNull if update: for the constraint)
     */
    public void setDamageflg(String damageflg) {
        registerModifiedProperty("damageflg");
        _damageflg = damageflg;
    }

    /**
     * [get] NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]} <br>
     * 出庫禁止フラグ
     * @return The value of the column 'NOSHIPPINGFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getNoshippingflg() {
        checkSpecifiedProperty("noshippingflg");
        return convertEmptyToNull(_noshippingflg);
    }

    /**
     * [set] NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]} <br>
     * 出庫禁止フラグ
     * @param noshippingflg The value of the column 'NOSHIPPINGFLG'. (basically NotNull if update: for the constraint)
     */
    public void setNoshippingflg(String noshippingflg) {
        registerModifiedProperty("noshippingflg");
        _noshippingflg = noshippingflg;
    }

    /**
     * [get] FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getForeigncargoflg() {
        checkSpecifiedProperty("foreigncargoflg");
        return convertEmptyToNull(_foreigncargoflg);
    }

    /**
     * [set] FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (basically NotNull if update: for the constraint)
     */
    public void setForeigncargoflg(String foreigncargoflg) {
        registerModifiedProperty("foreigncargoflg");
        _foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]} <br>
     * 通関済みフラグ
     * @return The value of the column 'CUSTOMSRELEASEFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getCustomsreleaseflg() {
        checkSpecifiedProperty("customsreleaseflg");
        return convertEmptyToNull(_customsreleaseflg);
    }

    /**
     * [set] CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]} <br>
     * 通関済みフラグ
     * @param customsreleaseflg The value of the column 'CUSTOMSRELEASEFLG'. (basically NotNull if update: for the constraint)
     */
    public void setCustomsreleaseflg(String customsreleaseflg) {
        registerModifiedProperty("customsreleaseflg");
        _customsreleaseflg = customsreleaseflg;
    }

    /**
     * [get] TAXFLG: {NotNull, char(1), default=[(0)]} <br>
     * 税区分
     * @return The value of the column 'TAXFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getTaxflg() {
        checkSpecifiedProperty("taxflg");
        return convertEmptyToNull(_taxflg);
    }

    /**
     * [set] TAXFLG: {NotNull, char(1), default=[(0)]} <br>
     * 税区分
     * @param taxflg The value of the column 'TAXFLG'. (basically NotNull if update: for the constraint)
     */
    public void setTaxflg(String taxflg) {
        registerModifiedProperty("taxflg");
        _taxflg = taxflg;
    }

    /**
     * [get] EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 個装数量
     * @return The value of the column 'EXPECTQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getExpectqty1() {
        checkSpecifiedProperty("expectqty1");
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 個装数量
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setExpectqty1(Long expectqty1) {
        registerModifiedProperty("expectqty1");
        _expectqty1 = expectqty1;
    }

    /**
     * [get] XDOCKQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * クロスドック済数量１（バラ）
     * @return The value of the column 'XDOCKQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getXdockqty1() {
        checkSpecifiedProperty("xdockqty1");
        return _xdockqty1;
    }

    /**
     * [set] XDOCKQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * クロスドック済数量１（バラ）
     * @param xdockqty1 The value of the column 'XDOCKQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setXdockqty1(Long xdockqty1) {
        registerModifiedProperty("xdockqty1");
        _xdockqty1 = xdockqty1;
    }

    /**
     * [get] ALLOCQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 引当済数量１（バラ）
     * @return The value of the column 'ALLOCQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getAllocqty1() {
        checkSpecifiedProperty("allocqty1");
        return _allocqty1;
    }

    /**
     * [set] ALLOCQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 引当済数量１（バラ）
     * @param allocqty1 The value of the column 'ALLOCQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setAllocqty1(Long allocqty1) {
        registerModifiedProperty("allocqty1");
        _allocqty1 = allocqty1;
    }

    /**
     * [get] PICKEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量１（バラ）
     * @return The value of the column 'PICKEDQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickedqty1() {
        checkSpecifiedProperty("pickedqty1");
        return _pickedqty1;
    }

    /**
     * [set] PICKEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量１（バラ）
     * @param pickedqty1 The value of the column 'PICKEDQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setPickedqty1(Long pickedqty1) {
        registerModifiedProperty("pickedqty1");
        _pickedqty1 = pickedqty1;
    }

    /**
     * [get] SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量１（バラ）
     * @return The value of the column 'SORTEDQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getSortedqty1() {
        checkSpecifiedProperty("sortedqty1");
        return _sortedqty1;
    }

    /**
     * [set] SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量１（バラ）
     * @param sortedqty1 The value of the column 'SORTEDQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setSortedqty1(Long sortedqty1) {
        registerModifiedProperty("sortedqty1");
        _sortedqty1 = sortedqty1;
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
     * [get] SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 出庫実績数量１（バラ）
     * @return The value of the column 'SHIPPEDQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippedqty1() {
        checkSpecifiedProperty("shippedqty1");
        return _shippedqty1;
    }

    /**
     * [set] SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 出庫実績数量１（バラ）
     * @param shippedqty1 The value of the column 'SHIPPEDQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setShippedqty1(Long shippedqty1) {
        registerModifiedProperty("shippedqty1");
        _shippedqty1 = shippedqty1;
    }

    /**
     * [get] ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 取消数量（個）
     * @return The value of the column 'ADJUSTQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getAdjustqty1() {
        checkSpecifiedProperty("adjustqty1");
        return _adjustqty1;
    }

    /**
     * [set] ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 取消数量（個）
     * @param adjustqty1 The value of the column 'ADJUSTQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setAdjustqty1(Long adjustqty1) {
        registerModifiedProperty("adjustqty1");
        _adjustqty1 = adjustqty1;
    }

    /**
     * [get] PRICE1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 銘柄単価１
     * @return The value of the column 'PRICE1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPrice1() {
        checkSpecifiedProperty("price1");
        return _price1;
    }

    /**
     * [set] PRICE1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 銘柄単価１
     * @param price1 The value of the column 'PRICE1'. (basically NotNull if update: for the constraint)
     */
    public void setPrice1(java.math.BigDecimal price1) {
        registerModifiedProperty("price1");
        _price1 = price1;
    }

    /**
     * [get] PRICE2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * パレタイズ順
     * @return The value of the column 'PRICE2'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPrice2() {
        checkSpecifiedProperty("price2");
        return _price2;
    }

    /**
     * [set] PRICE2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * パレタイズ順
     * @param price2 The value of the column 'PRICE2'. (basically NotNull if update: for the constraint)
     */
    public void setPrice2(java.math.BigDecimal price2) {
        registerModifiedProperty("price2");
        _price2 = price2;
    }

    /**
     * [get] PRICE3: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * パレット種別
     * @return The value of the column 'PRICE3'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPrice3() {
        checkSpecifiedProperty("price3");
        return _price3;
    }

    /**
     * [set] PRICE3: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * パレット種別
     * @param price3 The value of the column 'PRICE3'. (basically NotNull if update: for the constraint)
     */
    public void setPrice3(java.math.BigDecimal price3) {
        registerModifiedProperty("price3");
        _price3 = price3;
    }

    /**
     * [get] NOTES: {varchar(30)} <br>
     * パレット番号（保税）
     * @return The value of the column 'NOTES'. (NullAllowed even if selected: for no constraint)
     */
    public String getNotes() {
        checkSpecifiedProperty("notes");
        return convertEmptyToNull(_notes);
    }

    /**
     * [set] NOTES: {varchar(30)} <br>
     * パレット番号（保税）
     * @param notes The value of the column 'NOTES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotes(String notes) {
        registerModifiedProperty("notes");
        _notes = notes;
    }

    /**
     * [get] LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]} <br>
     * ロット指定フラグ
     * @return The value of the column 'LOTRESERVEFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getLotreserveflg() {
        checkSpecifiedProperty("lotreserveflg");
        return convertEmptyToNull(_lotreserveflg);
    }

    /**
     * [set] LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]} <br>
     * ロット指定フラグ
     * @param lotreserveflg The value of the column 'LOTRESERVEFLG'. (basically NotNull if update: for the constraint)
     */
    public void setLotreserveflg(String lotreserveflg) {
        registerModifiedProperty("lotreserveflg");
        _lotreserveflg = lotreserveflg;
    }

    /**
     * [get] PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]} <br>
     * ピッキング数量異常フラグ
     * @return The value of the column 'PICKQTYERRORFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getPickqtyerrorflg() {
        checkSpecifiedProperty("pickqtyerrorflg");
        return convertEmptyToNull(_pickqtyerrorflg);
    }

    /**
     * [set] PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]} <br>
     * ピッキング数量異常フラグ
     * @param pickqtyerrorflg The value of the column 'PICKQTYERRORFLG'. (basically NotNull if update: for the constraint)
     */
    public void setPickqtyerrorflg(String pickqtyerrorflg) {
        registerModifiedProperty("pickqtyerrorflg");
        _pickqtyerrorflg = pickqtyerrorflg;
    }

    /**
     * [get] LOGICFLG1: {NotNull, char(1), default=[(0)]} <br>
     * 理論在庫フラグ１
     * @return The value of the column 'LOGICFLG1'. (basically NotNull if selected: for the constraint)
     */
    public String getLogicflg1() {
        checkSpecifiedProperty("logicflg1");
        return convertEmptyToNull(_logicflg1);
    }

    /**
     * [set] LOGICFLG1: {NotNull, char(1), default=[(0)]} <br>
     * 理論在庫フラグ１
     * @param logicflg1 The value of the column 'LOGICFLG1'. (basically NotNull if update: for the constraint)
     */
    public void setLogicflg1(String logicflg1) {
        registerModifiedProperty("logicflg1");
        _logicflg1 = logicflg1;
    }

    /**
     * [get] LOGICFLG2: {NotNull, char(1), default=[(0)]} <br>
     * 理論在庫フラグ２
     * @return The value of the column 'LOGICFLG2'. (basically NotNull if selected: for the constraint)
     */
    public String getLogicflg2() {
        checkSpecifiedProperty("logicflg2");
        return convertEmptyToNull(_logicflg2);
    }

    /**
     * [set] LOGICFLG2: {NotNull, char(1), default=[(0)]} <br>
     * 理論在庫フラグ２
     * @param logicflg2 The value of the column 'LOGICFLG2'. (basically NotNull if update: for the constraint)
     */
    public void setLogicflg2(String logicflg2) {
        registerModifiedProperty("logicflg2");
        _logicflg2 = logicflg2;
    }

    /**
     * [get] LOGICFLG3: {NotNull, char(1), default=[(0)]} <br>
     * 理論在庫フラグ３
     * @return The value of the column 'LOGICFLG3'. (basically NotNull if selected: for the constraint)
     */
    public String getLogicflg3() {
        checkSpecifiedProperty("logicflg3");
        return convertEmptyToNull(_logicflg3);
    }

    /**
     * [set] LOGICFLG3: {NotNull, char(1), default=[(0)]} <br>
     * 理論在庫フラグ３
     * @param logicflg3 The value of the column 'LOGICFLG3'. (basically NotNull if update: for the constraint)
     */
    public void setLogicflg3(String logicflg3) {
        registerModifiedProperty("logicflg3");
        _logicflg3 = logicflg3;
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
