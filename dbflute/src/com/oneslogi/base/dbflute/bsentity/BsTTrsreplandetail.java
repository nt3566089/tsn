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
 * The entity of T_TRSREPLANDETAIL as TABLE. <br>
 * 返品入庫予定明細
 * <pre>
 * [primary-key]
 *     TRSREPLANDETAIL_ID
 *
 * [column]
 *     TRSREPLANDETAIL_ID, TRSREPLAN_ID, RCVLINENO, SUPPLIERRCVLINENO, XDOCFLG, POKEY, POLINENO, POTYPE, OWNERPONO, OWNERPOLINENO, ORIGINALPONO, ORIGINALPOLINENO, PODATE, OWNERCD, ITEMADMIN, PRODUCT_CD, IFITEMCD, LOT1, LOT2, LOT3, LOT4, LOT5, OTHERLOT1, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, EXPECTQTY1, EXPECTQTY2, EXPECTQTY3, RECEIVEDQTY1, RECEIVEDQTY2, RECEIVEDQTY3, ADJUSTQTY1, ADJUSTQTY2, ADJUSTQTY3, RCVTAGQTY1, XDOCFREEQTY1, INSPECTEDQTY1, INSPECTEDQTY2, INSPECTEDQTY3, PRICE_BUY, PRICE_WHOLESALE, PRICE_SALE, NOTES, ICDATE, ORDERKEY, ORDERLINENO, OWNERORDERNO, OWNERORDERLINENO, CUSTORDERNO, CUSTORDERLINENO, ORDERTYPE, RCVQTYERRORFLG, LOGICFLG1, LOGICFLG2, LOGICFLG3, MOVELINENO, ASSYLINENO, PRODUCELINENO, CHECKLASTLOTFLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSREPLANDETAIL_ID
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
 * Long trsreplandetailId = entity.getTrsreplandetailId();
 * Long trsreplanId = entity.getTrsreplanId();
 * Long rcvlineno = entity.getRcvlineno();
 * Long supplierrcvlineno = entity.getSupplierrcvlineno();
 * java.math.BigDecimal xdocflg = entity.getXdocflg();
 * java.math.BigDecimal pokey = entity.getPokey();
 * Long polineno = entity.getPolineno();
 * String potype = entity.getPotype();
 * String ownerpono = entity.getOwnerpono();
 * Long ownerpolineno = entity.getOwnerpolineno();
 * String originalpono = entity.getOriginalpono();
 * Long originalpolineno = entity.getOriginalpolineno();
 * String podate = entity.getPodate();
 * String ownercd = entity.getOwnercd();
 * String itemadmin = entity.getItemadmin();
 * String productCd = entity.getProductCd();
 * String ifitemcd = entity.getIfitemcd();
 * String lot1 = entity.getLot1();
 * String lot2 = entity.getLot2();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String lot5 = entity.getLot5();
 * String otherlot1 = entity.getOtherlot1();
 * String otherlot2 = entity.getOtherlot2();
 * String otherlot3 = entity.getOtherlot3();
 * String otherlot4 = entity.getOtherlot4();
 * java.math.BigDecimal otherlot5 = entity.getOtherlot5();
 * java.math.BigDecimal damageflg = entity.getDamageflg();
 * java.math.BigDecimal noshippingflg = entity.getNoshippingflg();
 * java.math.BigDecimal foreigncargoflg = entity.getForeigncargoflg();
 * java.math.BigDecimal customsreleaseflg = entity.getCustomsreleaseflg();
 * java.math.BigDecimal taxflg = entity.getTaxflg();
 * java.math.BigDecimal expectqty1 = entity.getExpectqty1();
 * Long expectqty2 = entity.getExpectqty2();
 * Long expectqty3 = entity.getExpectqty3();
 * java.math.BigDecimal receivedqty1 = entity.getReceivedqty1();
 * Long receivedqty2 = entity.getReceivedqty2();
 * Long receivedqty3 = entity.getReceivedqty3();
 * java.math.BigDecimal adjustqty1 = entity.getAdjustqty1();
 * Long adjustqty2 = entity.getAdjustqty2();
 * Long adjustqty3 = entity.getAdjustqty3();
 * java.math.BigDecimal rcvtagqty1 = entity.getRcvtagqty1();
 * java.math.BigDecimal xdocfreeqty1 = entity.getXdocfreeqty1();
 * java.math.BigDecimal inspectedqty1 = entity.getInspectedqty1();
 * Long inspectedqty2 = entity.getInspectedqty2();
 * Long inspectedqty3 = entity.getInspectedqty3();
 * Long priceBuy = entity.getPriceBuy();
 * Long priceWholesale = entity.getPriceWholesale();
 * Long priceSale = entity.getPriceSale();
 * String notes = entity.getNotes();
 * String icdate = entity.getIcdate();
 * java.math.BigDecimal orderkey = entity.getOrderkey();
 * Long orderlineno = entity.getOrderlineno();
 * String ownerorderno = entity.getOwnerorderno();
 * Long ownerorderlineno = entity.getOwnerorderlineno();
 * String custorderno = entity.getCustorderno();
 * Long custorderlineno = entity.getCustorderlineno();
 * String ordertype = entity.getOrdertype();
 * java.math.BigDecimal rcvqtyerrorflg = entity.getRcvqtyerrorflg();
 * java.math.BigDecimal logicflg1 = entity.getLogicflg1();
 * java.math.BigDecimal logicflg2 = entity.getLogicflg2();
 * java.math.BigDecimal logicflg3 = entity.getLogicflg3();
 * Long movelineno = entity.getMovelineno();
 * Long assylineno = entity.getAssylineno();
 * Long producelineno = entity.getProducelineno();
 * java.math.BigDecimal checklastlotflg = entity.getChecklastlotflg();
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
 * entity.setTrsreplandetailId(trsreplandetailId);
 * entity.setTrsreplanId(trsreplanId);
 * entity.setRcvlineno(rcvlineno);
 * entity.setSupplierrcvlineno(supplierrcvlineno);
 * entity.setXdocflg(xdocflg);
 * entity.setPokey(pokey);
 * entity.setPolineno(polineno);
 * entity.setPotype(potype);
 * entity.setOwnerpono(ownerpono);
 * entity.setOwnerpolineno(ownerpolineno);
 * entity.setOriginalpono(originalpono);
 * entity.setOriginalpolineno(originalpolineno);
 * entity.setPodate(podate);
 * entity.setOwnercd(ownercd);
 * entity.setItemadmin(itemadmin);
 * entity.setProductCd(productCd);
 * entity.setIfitemcd(ifitemcd);
 * entity.setLot1(lot1);
 * entity.setLot2(lot2);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setLot5(lot5);
 * entity.setOtherlot1(otherlot1);
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
 * entity.setExpectqty2(expectqty2);
 * entity.setExpectqty3(expectqty3);
 * entity.setReceivedqty1(receivedqty1);
 * entity.setReceivedqty2(receivedqty2);
 * entity.setReceivedqty3(receivedqty3);
 * entity.setAdjustqty1(adjustqty1);
 * entity.setAdjustqty2(adjustqty2);
 * entity.setAdjustqty3(adjustqty3);
 * entity.setRcvtagqty1(rcvtagqty1);
 * entity.setXdocfreeqty1(xdocfreeqty1);
 * entity.setInspectedqty1(inspectedqty1);
 * entity.setInspectedqty2(inspectedqty2);
 * entity.setInspectedqty3(inspectedqty3);
 * entity.setPriceBuy(priceBuy);
 * entity.setPriceWholesale(priceWholesale);
 * entity.setPriceSale(priceSale);
 * entity.setNotes(notes);
 * entity.setIcdate(icdate);
 * entity.setOrderkey(orderkey);
 * entity.setOrderlineno(orderlineno);
 * entity.setOwnerorderno(ownerorderno);
 * entity.setOwnerorderlineno(ownerorderlineno);
 * entity.setCustorderno(custorderno);
 * entity.setCustorderlineno(custorderlineno);
 * entity.setOrdertype(ordertype);
 * entity.setRcvqtyerrorflg(rcvqtyerrorflg);
 * entity.setLogicflg1(logicflg1);
 * entity.setLogicflg2(logicflg2);
 * entity.setLogicflg3(logicflg3);
 * entity.setMovelineno(movelineno);
 * entity.setAssylineno(assylineno);
 * entity.setProducelineno(producelineno);
 * entity.setChecklastlotflg(checklastlotflg);
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
public abstract class BsTTrsreplandetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trsreplandetailId;

    /** TRSREPLAN_ID: {NotNull, bigint(19)} */
    protected Long _trsreplanId;

    /** RCVLINENO: {NotNull, bigint(19)} */
    protected Long _rcvlineno;

    /** SUPPLIERRCVLINENO: {bigint(19)} */
    protected Long _supplierrcvlineno;

    /** XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _xdocflg;

    /** POKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _pokey;

    /** POLINENO: {bigint(19)} */
    protected Long _polineno;

    /** POTYPE: {varchar(30)} */
    protected String _potype;

    /** OWNERPONO: {varchar(60)} */
    protected String _ownerpono;

    /** OWNERPOLINENO: {bigint(19)} */
    protected Long _ownerpolineno;

    /** ORIGINALPONO: {varchar(60)} */
    protected String _originalpono;

    /** ORIGINALPOLINENO: {bigint(19)} */
    protected Long _originalpolineno;

    /** PODATE: {varchar(8)} */
    protected String _podate;

    /** OWNERCD: {NotNull, varchar(30)} */
    protected String _ownercd;

    /** ITEMADMIN: {NotNull, varchar(30)} */
    protected String _itemadmin;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

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

    /** OTHERLOT1: {varchar(60)} */
    protected String _otherlot1;

    /** OTHERLOT2: {varchar(60)} */
    protected String _otherlot2;

    /** OTHERLOT3: {varchar(60)} */
    protected String _otherlot3;

    /** OTHERLOT4: {varchar(60)} */
    protected String _otherlot4;

    /** OTHERLOT5: {decimal(16, 6)} */
    protected java.math.BigDecimal _otherlot5;

    /** DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _damageflg;

    /** NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _noshippingflg;

    /** FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _foreigncargoflg;

    /** CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _customsreleaseflg;

    /** TAXFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _taxflg;

    /** EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _expectqty1;

    /** EXPECTQTY2: {NotNull, bigint(19), default=[(0)]} */
    protected Long _expectqty2;

    /** EXPECTQTY3: {NotNull, bigint(19), default=[(0)]} */
    protected Long _expectqty3;

    /** RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _receivedqty1;

    /** RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]} */
    protected Long _receivedqty2;

    /** RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]} */
    protected Long _receivedqty3;

    /** ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _adjustqty1;

    /** ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]} */
    protected Long _adjustqty2;

    /** ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]} */
    protected Long _adjustqty3;

    /** RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _rcvtagqty1;

    /** XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _xdocfreeqty1;

    /** INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _inspectedqty1;

    /** INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]} */
    protected Long _inspectedqty2;

    /** INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]} */
    protected Long _inspectedqty3;

    /** PRICE_BUY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _priceBuy;

    /** PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]} */
    protected Long _priceWholesale;

    /** PRICE_SALE: {NotNull, bigint(19), default=[(0)]} */
    protected Long _priceSale;

    /** NOTES: {varchar(4000)} */
    protected String _notes;

    /** ICDATE: {varchar(8)} */
    protected String _icdate;

    /** ORDERKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _orderkey;

    /** ORDERLINENO: {bigint(19)} */
    protected Long _orderlineno;

    /** OWNERORDERNO: {varchar(60)} */
    protected String _ownerorderno;

    /** OWNERORDERLINENO: {bigint(19)} */
    protected Long _ownerorderlineno;

    /** CUSTORDERNO: {varchar(60)} */
    protected String _custorderno;

    /** CUSTORDERLINENO: {bigint(19)} */
    protected Long _custorderlineno;

    /** ORDERTYPE: {varchar(30)} */
    protected String _ordertype;

    /** RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _rcvqtyerrorflg;

    /** LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _logicflg1;

    /** LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _logicflg2;

    /** LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _logicflg3;

    /** MOVELINENO: {bigint(19)} */
    protected Long _movelineno;

    /** ASSYLINENO: {bigint(19)} */
    protected Long _assylineno;

    /** PRODUCELINENO: {bigint(19)} */
    protected Long _producelineno;

    /** CHECKLASTLOTFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _checklastlotflg;

    /** CENTER_ID: {NotNull, bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

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
        return "T_TRSREPLANDETAIL";
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
        if (_trsreplandetailId == null) { return false; }
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
        if (obj instanceof BsTTrsreplandetail) {
            BsTTrsreplandetail other = (BsTTrsreplandetail)obj;
            if (!xSV(_trsreplandetailId, other._trsreplandetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trsreplandetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trsreplandetailId));
        sb.append(dm).append(xfND(_trsreplanId));
        sb.append(dm).append(xfND(_rcvlineno));
        sb.append(dm).append(xfND(_supplierrcvlineno));
        sb.append(dm).append(xfND(_xdocflg));
        sb.append(dm).append(xfND(_pokey));
        sb.append(dm).append(xfND(_polineno));
        sb.append(dm).append(xfND(_potype));
        sb.append(dm).append(xfND(_ownerpono));
        sb.append(dm).append(xfND(_ownerpolineno));
        sb.append(dm).append(xfND(_originalpono));
        sb.append(dm).append(xfND(_originalpolineno));
        sb.append(dm).append(xfND(_podate));
        sb.append(dm).append(xfND(_ownercd));
        sb.append(dm).append(xfND(_itemadmin));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_ifitemcd));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot5));
        sb.append(dm).append(xfND(_otherlot1));
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
        sb.append(dm).append(xfND(_expectqty2));
        sb.append(dm).append(xfND(_expectqty3));
        sb.append(dm).append(xfND(_receivedqty1));
        sb.append(dm).append(xfND(_receivedqty2));
        sb.append(dm).append(xfND(_receivedqty3));
        sb.append(dm).append(xfND(_adjustqty1));
        sb.append(dm).append(xfND(_adjustqty2));
        sb.append(dm).append(xfND(_adjustqty3));
        sb.append(dm).append(xfND(_rcvtagqty1));
        sb.append(dm).append(xfND(_xdocfreeqty1));
        sb.append(dm).append(xfND(_inspectedqty1));
        sb.append(dm).append(xfND(_inspectedqty2));
        sb.append(dm).append(xfND(_inspectedqty3));
        sb.append(dm).append(xfND(_priceBuy));
        sb.append(dm).append(xfND(_priceWholesale));
        sb.append(dm).append(xfND(_priceSale));
        sb.append(dm).append(xfND(_notes));
        sb.append(dm).append(xfND(_icdate));
        sb.append(dm).append(xfND(_orderkey));
        sb.append(dm).append(xfND(_orderlineno));
        sb.append(dm).append(xfND(_ownerorderno));
        sb.append(dm).append(xfND(_ownerorderlineno));
        sb.append(dm).append(xfND(_custorderno));
        sb.append(dm).append(xfND(_custorderlineno));
        sb.append(dm).append(xfND(_ordertype));
        sb.append(dm).append(xfND(_rcvqtyerrorflg));
        sb.append(dm).append(xfND(_logicflg1));
        sb.append(dm).append(xfND(_logicflg2));
        sb.append(dm).append(xfND(_logicflg3));
        sb.append(dm).append(xfND(_movelineno));
        sb.append(dm).append(xfND(_assylineno));
        sb.append(dm).append(xfND(_producelineno));
        sb.append(dm).append(xfND(_checklastlotflg));
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
    public TTrsreplandetail clone() {
        return (TTrsreplandetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 返品入庫予定明細ID
     * @return The value of the column 'TRSREPLANDETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrsreplandetailId() {
        checkSpecifiedProperty("trsreplandetailId");
        return _trsreplandetailId;
    }

    /**
     * [set] TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 返品入庫予定明細ID
     * @param trsreplandetailId The value of the column 'TRSREPLANDETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrsreplandetailId(Long trsreplandetailId) {
        registerModifiedProperty("trsreplandetailId");
        _trsreplandetailId = trsreplandetailId;
    }

    /**
     * [get] TRSREPLAN_ID: {NotNull, bigint(19)} <br>
     * 返品入庫予定ID
     * @return The value of the column 'TRSREPLAN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrsreplanId() {
        checkSpecifiedProperty("trsreplanId");
        return _trsreplanId;
    }

    /**
     * [set] TRSREPLAN_ID: {NotNull, bigint(19)} <br>
     * 返品入庫予定ID
     * @param trsreplanId The value of the column 'TRSREPLAN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrsreplanId(Long trsreplanId) {
        registerModifiedProperty("trsreplanId");
        _trsreplanId = trsreplanId;
    }

    /**
     * [get] RCVLINENO: {NotNull, bigint(19)} <br>
     * 入庫行№
     * @return The value of the column 'RCVLINENO'. (basically NotNull if selected: for the constraint)
     */
    public Long getRcvlineno() {
        checkSpecifiedProperty("rcvlineno");
        return _rcvlineno;
    }

    /**
     * [set] RCVLINENO: {NotNull, bigint(19)} <br>
     * 入庫行№
     * @param rcvlineno The value of the column 'RCVLINENO'. (basically NotNull if update: for the constraint)
     */
    public void setRcvlineno(Long rcvlineno) {
        registerModifiedProperty("rcvlineno");
        _rcvlineno = rcvlineno;
    }

    /**
     * [get] SUPPLIERRCVLINENO: {bigint(19)} <br>
     * 調達先入庫行No.
     * @return The value of the column 'SUPPLIERRCVLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSupplierrcvlineno() {
        checkSpecifiedProperty("supplierrcvlineno");
        return _supplierrcvlineno;
    }

    /**
     * [set] SUPPLIERRCVLINENO: {bigint(19)} <br>
     * 調達先入庫行No.
     * @param supplierrcvlineno The value of the column 'SUPPLIERRCVLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrcvlineno(Long supplierrcvlineno) {
        registerModifiedProperty("supplierrcvlineno");
        _supplierrcvlineno = supplierrcvlineno;
    }

    /**
     * [get] XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * クロスドック対象フラグ
     * @return The value of the column 'XDOCFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getXdocflg() {
        checkSpecifiedProperty("xdocflg");
        return _xdocflg;
    }

    /**
     * [set] XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * クロスドック対象フラグ
     * @param xdocflg The value of the column 'XDOCFLG'. (basically NotNull if update: for the constraint)
     */
    public void setXdocflg(java.math.BigDecimal xdocflg) {
        registerModifiedProperty("xdocflg");
        _xdocflg = xdocflg;
    }

    /**
     * [get] POKEY: {decimal(16, 6)} <br>
     * ＰＯＫｅｙ
     * @return The value of the column 'POKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPokey() {
        checkSpecifiedProperty("pokey");
        return _pokey;
    }

    /**
     * [set] POKEY: {decimal(16, 6)} <br>
     * ＰＯＫｅｙ
     * @param pokey The value of the column 'POKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPokey(java.math.BigDecimal pokey) {
        registerModifiedProperty("pokey");
        _pokey = pokey;
    }

    /**
     * [get] POLINENO: {bigint(19)} <br>
     * ＰＯ行№
     * @return The value of the column 'POLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPolineno() {
        checkSpecifiedProperty("polineno");
        return _polineno;
    }

    /**
     * [set] POLINENO: {bigint(19)} <br>
     * ＰＯ行№
     * @param polineno The value of the column 'POLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPolineno(Long polineno) {
        registerModifiedProperty("polineno");
        _polineno = polineno;
    }

    /**
     * [get] POTYPE: {varchar(30)} <br>
     * 調達タイプ
     * @return The value of the column 'POTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPotype() {
        checkSpecifiedProperty("potype");
        return convertEmptyToNull(_potype);
    }

    /**
     * [set] POTYPE: {varchar(30)} <br>
     * 調達タイプ
     * @param potype The value of the column 'POTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPotype(String potype) {
        registerModifiedProperty("potype");
        _potype = potype;
    }

    /**
     * [get] OWNERPONO: {varchar(60)} <br>
     * 発注元ＰＯ番号
     * @return The value of the column 'OWNERPONO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnerpono() {
        checkSpecifiedProperty("ownerpono");
        return convertEmptyToNull(_ownerpono);
    }

    /**
     * [set] OWNERPONO: {varchar(60)} <br>
     * 発注元ＰＯ番号
     * @param ownerpono The value of the column 'OWNERPONO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnerpono(String ownerpono) {
        registerModifiedProperty("ownerpono");
        _ownerpono = ownerpono;
    }

    /**
     * [get] OWNERPOLINENO: {bigint(19)} <br>
     * 発注元ＰＯ行№
     * @return The value of the column 'OWNERPOLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOwnerpolineno() {
        checkSpecifiedProperty("ownerpolineno");
        return _ownerpolineno;
    }

    /**
     * [set] OWNERPOLINENO: {bigint(19)} <br>
     * 発注元ＰＯ行№
     * @param ownerpolineno The value of the column 'OWNERPOLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnerpolineno(Long ownerpolineno) {
        registerModifiedProperty("ownerpolineno");
        _ownerpolineno = ownerpolineno;
    }

    /**
     * [get] ORIGINALPONO: {varchar(60)} <br>
     * 原始ＰＯ番号
     * @return The value of the column 'ORIGINALPONO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOriginalpono() {
        checkSpecifiedProperty("originalpono");
        return convertEmptyToNull(_originalpono);
    }

    /**
     * [set] ORIGINALPONO: {varchar(60)} <br>
     * 原始ＰＯ番号
     * @param originalpono The value of the column 'ORIGINALPONO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOriginalpono(String originalpono) {
        registerModifiedProperty("originalpono");
        _originalpono = originalpono;
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
     * [get] PODATE: {varchar(8)} <br>
     * 発注日
     * @return The value of the column 'PODATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPodate() {
        checkSpecifiedProperty("podate");
        return convertEmptyToNull(_podate);
    }

    /**
     * [set] PODATE: {varchar(8)} <br>
     * 発注日
     * @param podate The value of the column 'PODATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPodate(String podate) {
        registerModifiedProperty("podate");
        _podate = podate;
    }

    /**
     * [get] OWNERCD: {NotNull, varchar(30)} <br>
     * 取引先（荷主）CD
     * @return The value of the column 'OWNERCD'. (basically NotNull if selected: for the constraint)
     */
    public String getOwnercd() {
        checkSpecifiedProperty("ownercd");
        return convertEmptyToNull(_ownercd);
    }

    /**
     * [set] OWNERCD: {NotNull, varchar(30)} <br>
     * 取引先（荷主）CD
     * @param ownercd The value of the column 'OWNERCD'. (basically NotNull if update: for the constraint)
     */
    public void setOwnercd(String ownercd) {
        registerModifiedProperty("ownercd");
        _ownercd = ownercd;
    }

    /**
     * [get] ITEMADMIN: {NotNull, varchar(30)} <br>
     * 銘柄管理社
     * @return The value of the column 'ITEMADMIN'. (basically NotNull if selected: for the constraint)
     */
    public String getItemadmin() {
        checkSpecifiedProperty("itemadmin");
        return convertEmptyToNull(_itemadmin);
    }

    /**
     * [set] ITEMADMIN: {NotNull, varchar(30)} <br>
     * 銘柄管理社
     * @param itemadmin The value of the column 'ITEMADMIN'. (basically NotNull if update: for the constraint)
     */
    public void setItemadmin(String itemadmin) {
        registerModifiedProperty("itemadmin");
        _itemadmin = itemadmin;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD(さしず）
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD(さしず）
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] IFITEMCD: {varchar(30)} <br>
     * 銘柄CD(実績）
     * @return The value of the column 'IFITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getIfitemcd() {
        checkSpecifiedProperty("ifitemcd");
        return convertEmptyToNull(_ifitemcd);
    }

    /**
     * [set] IFITEMCD: {varchar(30)} <br>
     * 銘柄CD(実績）
     * @param ifitemcd The value of the column 'IFITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfitemcd(String ifitemcd) {
        registerModifiedProperty("ifitemcd");
        _ifitemcd = ifitemcd;
    }

    /**
     * [get] LOT1: {varchar(60)} <br>
     * 状態CD(さしず)
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(60)} <br>
     * 状態CD(さしず)
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(60)} <br>
     * 状態CD(実績)
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * 状態CD(実績)
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * 管理３
     * @return The value of the column 'LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * 管理３
     * @param lot3 The value of the column 'LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 管理４（日付属性１）
     * @return The value of the column 'LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot4() {
        checkSpecifiedProperty("lot4");
        return convertEmptyToNull(_lot4);
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 管理４（日付属性１）
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
     * [get] OTHERLOT1: {varchar(60)} <br>
     * 返品検品ステータス
     * @return The value of the column 'OTHERLOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot1() {
        checkSpecifiedProperty("otherlot1");
        return convertEmptyToNull(_otherlot1);
    }

    /**
     * [set] OTHERLOT1: {varchar(60)} <br>
     * 返品検品ステータス
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot1(String otherlot1) {
        registerModifiedProperty("otherlot1");
        _otherlot1 = otherlot1;
    }

    /**
     * [get] OTHERLOT2: {varchar(60)} <br>
     * 変更区分
     * @return The value of the column 'OTHERLOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot2() {
        checkSpecifiedProperty("otherlot2");
        return convertEmptyToNull(_otherlot2);
    }

    /**
     * [set] OTHERLOT2: {varchar(60)} <br>
     * 変更区分
     * @param otherlot2 The value of the column 'OTHERLOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot2(String otherlot2) {
        registerModifiedProperty("otherlot2");
        _otherlot2 = otherlot2;
    }

    /**
     * [get] OTHERLOT3: {varchar(60)} <br>
     * 管理３
     * @return The value of the column 'OTHERLOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot3() {
        checkSpecifiedProperty("otherlot3");
        return convertEmptyToNull(_otherlot3);
    }

    /**
     * [set] OTHERLOT3: {varchar(60)} <br>
     * 管理３
     * @param otherlot3 The value of the column 'OTHERLOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot3(String otherlot3) {
        registerModifiedProperty("otherlot3");
        _otherlot3 = otherlot3;
    }

    /**
     * [get] OTHERLOT4: {varchar(60)} <br>
     * 状態CD確認区分
     * @return The value of the column 'OTHERLOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot4() {
        checkSpecifiedProperty("otherlot4");
        return convertEmptyToNull(_otherlot4);
    }

    /**
     * [set] OTHERLOT4: {varchar(60)} <br>
     * 状態CD確認区分
     * @param otherlot4 The value of the column 'OTHERLOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot4(String otherlot4) {
        registerModifiedProperty("otherlot4");
        _otherlot4 = otherlot4;
    }

    /**
     * [get] OTHERLOT5: {decimal(16, 6)} <br>
     * その他属性５（数値）
     * @return The value of the column 'OTHERLOT5'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getOtherlot5() {
        checkSpecifiedProperty("otherlot5");
        return _otherlot5;
    }

    /**
     * [set] OTHERLOT5: {decimal(16, 6)} <br>
     * その他属性５（数値）
     * @param otherlot5 The value of the column 'OTHERLOT5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot5(java.math.BigDecimal otherlot5) {
        registerModifiedProperty("otherlot5");
        _otherlot5 = otherlot5;
    }

    /**
     * [get] DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 良品・不良品区分
     * @return The value of the column 'DAMAGEFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getDamageflg() {
        checkSpecifiedProperty("damageflg");
        return _damageflg;
    }

    /**
     * [set] DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 良品・不良品区分
     * @param damageflg The value of the column 'DAMAGEFLG'. (basically NotNull if update: for the constraint)
     */
    public void setDamageflg(java.math.BigDecimal damageflg) {
        registerModifiedProperty("damageflg");
        _damageflg = damageflg;
    }

    /**
     * [get] NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 出庫禁止フラグ
     * @return The value of the column 'NOSHIPPINGFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getNoshippingflg() {
        checkSpecifiedProperty("noshippingflg");
        return _noshippingflg;
    }

    /**
     * [set] NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 出庫禁止フラグ
     * @param noshippingflg The value of the column 'NOSHIPPINGFLG'. (basically NotNull if update: for the constraint)
     */
    public void setNoshippingflg(java.math.BigDecimal noshippingflg) {
        registerModifiedProperty("noshippingflg");
        _noshippingflg = noshippingflg;
    }

    /**
     * [get] FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getForeigncargoflg() {
        checkSpecifiedProperty("foreigncargoflg");
        return _foreigncargoflg;
    }

    /**
     * [set] FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (basically NotNull if update: for the constraint)
     */
    public void setForeigncargoflg(java.math.BigDecimal foreigncargoflg) {
        registerModifiedProperty("foreigncargoflg");
        _foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 通関済みフラグ
     * @return The value of the column 'CUSTOMSRELEASEFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getCustomsreleaseflg() {
        checkSpecifiedProperty("customsreleaseflg");
        return _customsreleaseflg;
    }

    /**
     * [set] CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 通関済みフラグ
     * @param customsreleaseflg The value of the column 'CUSTOMSRELEASEFLG'. (basically NotNull if update: for the constraint)
     */
    public void setCustomsreleaseflg(java.math.BigDecimal customsreleaseflg) {
        registerModifiedProperty("customsreleaseflg");
        _customsreleaseflg = customsreleaseflg;
    }

    /**
     * [get] TAXFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 税区分
     * @return The value of the column 'TAXFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTaxflg() {
        checkSpecifiedProperty("taxflg");
        return _taxflg;
    }

    /**
     * [set] TAXFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 税区分
     * @param taxflg The value of the column 'TAXFLG'. (basically NotNull if update: for the constraint)
     */
    public void setTaxflg(java.math.BigDecimal taxflg) {
        registerModifiedProperty("taxflg");
        _taxflg = taxflg;
    }

    /**
     * [get] EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫予定数(さしず）
     * @return The value of the column 'EXPECTQTY1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getExpectqty1() {
        checkSpecifiedProperty("expectqty1");
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫予定数(さしず）
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setExpectqty1(java.math.BigDecimal expectqty1) {
        registerModifiedProperty("expectqty1");
        _expectqty1 = expectqty1;
    }

    /**
     * [get] EXPECTQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫予定数量２
     * @return The value of the column 'EXPECTQTY2'. (basically NotNull if selected: for the constraint)
     */
    public Long getExpectqty2() {
        checkSpecifiedProperty("expectqty2");
        return _expectqty2;
    }

    /**
     * [set] EXPECTQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫予定数量２
     * @param expectqty2 The value of the column 'EXPECTQTY2'. (basically NotNull if update: for the constraint)
     */
    public void setExpectqty2(Long expectqty2) {
        registerModifiedProperty("expectqty2");
        _expectqty2 = expectqty2;
    }

    /**
     * [get] EXPECTQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫予定数量３
     * @return The value of the column 'EXPECTQTY3'. (basically NotNull if selected: for the constraint)
     */
    public Long getExpectqty3() {
        checkSpecifiedProperty("expectqty3");
        return _expectqty3;
    }

    /**
     * [set] EXPECTQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫予定数量３
     * @param expectqty3 The value of the column 'EXPECTQTY3'. (basically NotNull if update: for the constraint)
     */
    public void setExpectqty3(Long expectqty3) {
        registerModifiedProperty("expectqty3");
        _expectqty3 = expectqty3;
    }

    /**
     * [get] RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫実績数（個装換算）
     * @return The value of the column 'RECEIVEDQTY1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getReceivedqty1() {
        checkSpecifiedProperty("receivedqty1");
        return _receivedqty1;
    }

    /**
     * [set] RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫実績数（個装換算）
     * @param receivedqty1 The value of the column 'RECEIVEDQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setReceivedqty1(java.math.BigDecimal receivedqty1) {
        registerModifiedProperty("receivedqty1");
        _receivedqty1 = receivedqty1;
    }

    /**
     * [get] RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫実績数（カートン）
     * @return The value of the column 'RECEIVEDQTY2'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceivedqty2() {
        checkSpecifiedProperty("receivedqty2");
        return _receivedqty2;
    }

    /**
     * [set] RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫実績数（カートン）
     * @param receivedqty2 The value of the column 'RECEIVEDQTY2'. (basically NotNull if update: for the constraint)
     */
    public void setReceivedqty2(Long receivedqty2) {
        registerModifiedProperty("receivedqty2");
        _receivedqty2 = receivedqty2;
    }

    /**
     * [get] RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫実績数(個装)
     * @return The value of the column 'RECEIVEDQTY3'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceivedqty3() {
        checkSpecifiedProperty("receivedqty3");
        return _receivedqty3;
    }

    /**
     * [set] RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫実績数(個装)
     * @param receivedqty3 The value of the column 'RECEIVEDQTY3'. (basically NotNull if update: for the constraint)
     */
    public void setReceivedqty3(Long receivedqty3) {
        registerModifiedProperty("receivedqty3");
        _receivedqty3 = receivedqty3;
    }

    /**
     * [get] ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫実績差異数
     * @return The value of the column 'ADJUSTQTY1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getAdjustqty1() {
        checkSpecifiedProperty("adjustqty1");
        return _adjustqty1;
    }

    /**
     * [set] ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫実績差異数
     * @param adjustqty1 The value of the column 'ADJUSTQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setAdjustqty1(java.math.BigDecimal adjustqty1) {
        registerModifiedProperty("adjustqty1");
        _adjustqty1 = adjustqty1;
    }

    /**
     * [get] ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫取消数量２
     * @return The value of the column 'ADJUSTQTY2'. (basically NotNull if selected: for the constraint)
     */
    public Long getAdjustqty2() {
        checkSpecifiedProperty("adjustqty2");
        return _adjustqty2;
    }

    /**
     * [set] ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫取消数量２
     * @param adjustqty2 The value of the column 'ADJUSTQTY2'. (basically NotNull if update: for the constraint)
     */
    public void setAdjustqty2(Long adjustqty2) {
        registerModifiedProperty("adjustqty2");
        _adjustqty2 = adjustqty2;
    }

    /**
     * [get] ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫取消数量３
     * @return The value of the column 'ADJUSTQTY3'. (basically NotNull if selected: for the constraint)
     */
    public Long getAdjustqty3() {
        checkSpecifiedProperty("adjustqty3");
        return _adjustqty3;
    }

    /**
     * [set] ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫取消数量３
     * @param adjustqty3 The value of the column 'ADJUSTQTY3'. (basically NotNull if update: for the constraint)
     */
    public void setAdjustqty3(Long adjustqty3) {
        registerModifiedProperty("adjustqty3");
        _adjustqty3 = adjustqty3;
    }

    /**
     * [get] RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫積付指示済数量１（バラ）
     * @return The value of the column 'RCVTAGQTY1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRcvtagqty1() {
        checkSpecifiedProperty("rcvtagqty1");
        return _rcvtagqty1;
    }

    /**
     * [set] RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫積付指示済数量１（バラ）
     * @param rcvtagqty1 The value of the column 'RCVTAGQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setRcvtagqty1(java.math.BigDecimal rcvtagqty1) {
        registerModifiedProperty("rcvtagqty1");
        _rcvtagqty1 = rcvtagqty1;
    }

    /**
     * [get] XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * クロスドック可能数量１（バラ）
     * @return The value of the column 'XDOCFREEQTY1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getXdocfreeqty1() {
        checkSpecifiedProperty("xdocfreeqty1");
        return _xdocfreeqty1;
    }

    /**
     * [set] XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * クロスドック可能数量１（バラ）
     * @param xdocfreeqty1 The value of the column 'XDOCFREEQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setXdocfreeqty1(java.math.BigDecimal xdocfreeqty1) {
        registerModifiedProperty("xdocfreeqty1");
        _xdocfreeqty1 = xdocfreeqty1;
    }

    /**
     * [get] INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 検品済数量１（バラ）
     * @return The value of the column 'INSPECTEDQTY1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getInspectedqty1() {
        checkSpecifiedProperty("inspectedqty1");
        return _inspectedqty1;
    }

    /**
     * [set] INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 検品済数量１（バラ）
     * @param inspectedqty1 The value of the column 'INSPECTEDQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setInspectedqty1(java.math.BigDecimal inspectedqty1) {
        registerModifiedProperty("inspectedqty1");
        _inspectedqty1 = inspectedqty1;
    }

    /**
     * [get] INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量２
     * @return The value of the column 'INSPECTEDQTY2'. (basically NotNull if selected: for the constraint)
     */
    public Long getInspectedqty2() {
        checkSpecifiedProperty("inspectedqty2");
        return _inspectedqty2;
    }

    /**
     * [set] INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量２
     * @param inspectedqty2 The value of the column 'INSPECTEDQTY2'. (basically NotNull if update: for the constraint)
     */
    public void setInspectedqty2(Long inspectedqty2) {
        registerModifiedProperty("inspectedqty2");
        _inspectedqty2 = inspectedqty2;
    }

    /**
     * [get] INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量３
     * @return The value of the column 'INSPECTEDQTY3'. (basically NotNull if selected: for the constraint)
     */
    public Long getInspectedqty3() {
        checkSpecifiedProperty("inspectedqty3");
        return _inspectedqty3;
    }

    /**
     * [set] INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量３
     * @param inspectedqty3 The value of the column 'INSPECTEDQTY3'. (basically NotNull if update: for the constraint)
     */
    public void setInspectedqty3(Long inspectedqty3) {
        registerModifiedProperty("inspectedqty3");
        _inspectedqty3 = inspectedqty3;
    }

    /**
     * [get] PRICE_BUY: {NotNull, bigint(19), default=[(0)]} <br>
     * 不足本数(さしず)
     * @return The value of the column 'PRICE_BUY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPriceBuy() {
        checkSpecifiedProperty("priceBuy");
        return _priceBuy;
    }

    /**
     * [set] PRICE_BUY: {NotNull, bigint(19), default=[(0)]} <br>
     * 不足本数(さしず)
     * @param priceBuy The value of the column 'PRICE_BUY'. (basically NotNull if update: for the constraint)
     */
    public void setPriceBuy(Long priceBuy) {
        registerModifiedProperty("priceBuy");
        _priceBuy = priceBuy;
    }

    /**
     * [get] PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 不足本数(実績)
     * @return The value of the column 'PRICE_WHOLESALE'. (basically NotNull if selected: for the constraint)
     */
    public Long getPriceWholesale() {
        checkSpecifiedProperty("priceWholesale");
        return _priceWholesale;
    }

    /**
     * [set] PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 不足本数(実績)
     * @param priceWholesale The value of the column 'PRICE_WHOLESALE'. (basically NotNull if update: for the constraint)
     */
    public void setPriceWholesale(Long priceWholesale) {
        registerModifiedProperty("priceWholesale");
        _priceWholesale = priceWholesale;
    }

    /**
     * [get] PRICE_SALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 銘柄単価（売値）
     * @return The value of the column 'PRICE_SALE'. (basically NotNull if selected: for the constraint)
     */
    public Long getPriceSale() {
        checkSpecifiedProperty("priceSale");
        return _priceSale;
    }

    /**
     * [set] PRICE_SALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 銘柄単価（売値）
     * @param priceSale The value of the column 'PRICE_SALE'. (basically NotNull if update: for the constraint)
     */
    public void setPriceSale(Long priceSale) {
        registerModifiedProperty("priceSale");
        _priceSale = priceSale;
    }

    /**
     * [get] NOTES: {varchar(4000)} <br>
     * 備考
     * @return The value of the column 'NOTES'. (NullAllowed even if selected: for no constraint)
     */
    public String getNotes() {
        checkSpecifiedProperty("notes");
        return convertEmptyToNull(_notes);
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * 備考
     * @param notes The value of the column 'NOTES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotes(String notes) {
        registerModifiedProperty("notes");
        _notes = notes;
    }

    /**
     * [get] ICDATE: {varchar(8)} <br>
     * 保管料起算日
     * @return The value of the column 'ICDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getIcdate() {
        checkSpecifiedProperty("icdate");
        return convertEmptyToNull(_icdate);
    }

    /**
     * [set] ICDATE: {varchar(8)} <br>
     * 保管料起算日
     * @param icdate The value of the column 'ICDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIcdate(String icdate) {
        registerModifiedProperty("icdate");
        _icdate = icdate;
    }

    /**
     * [get] ORDERKEY: {decimal(16, 6)} <br>
     * 受注オーダＫｅｙ
     * @return The value of the column 'ORDERKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getOrderkey() {
        checkSpecifiedProperty("orderkey");
        return _orderkey;
    }

    /**
     * [set] ORDERKEY: {decimal(16, 6)} <br>
     * 受注オーダＫｅｙ
     * @param orderkey The value of the column 'ORDERKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderkey(java.math.BigDecimal orderkey) {
        registerModifiedProperty("orderkey");
        _orderkey = orderkey;
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
     * [get] OWNERORDERNO: {varchar(60)} <br>
     * 荷主オーダ番号
     * @return The value of the column 'OWNERORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnerorderno() {
        checkSpecifiedProperty("ownerorderno");
        return convertEmptyToNull(_ownerorderno);
    }

    /**
     * [set] OWNERORDERNO: {varchar(60)} <br>
     * 荷主オーダ番号
     * @param ownerorderno The value of the column 'OWNERORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnerorderno(String ownerorderno) {
        registerModifiedProperty("ownerorderno");
        _ownerorderno = ownerorderno;
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
     * [get] CUSTORDERNO: {varchar(60)} <br>
     * 顧客オーダ番号
     * @return The value of the column 'CUSTORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustorderno() {
        checkSpecifiedProperty("custorderno");
        return convertEmptyToNull(_custorderno);
    }

    /**
     * [set] CUSTORDERNO: {varchar(60)} <br>
     * 顧客オーダ番号
     * @param custorderno The value of the column 'CUSTORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustorderno(String custorderno) {
        registerModifiedProperty("custorderno");
        _custorderno = custorderno;
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
     * [get] ORDERTYPE: {varchar(30)} <br>
     * 受注タイプ
     * @return The value of the column 'ORDERTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdertype() {
        checkSpecifiedProperty("ordertype");
        return convertEmptyToNull(_ordertype);
    }

    /**
     * [set] ORDERTYPE: {varchar(30)} <br>
     * 受注タイプ
     * @param ordertype The value of the column 'ORDERTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdertype(String ordertype) {
        registerModifiedProperty("ordertype");
        _ordertype = ordertype;
    }

    /**
     * [get] RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫数量異常フラグ
     * @return The value of the column 'RCVQTYERRORFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRcvqtyerrorflg() {
        checkSpecifiedProperty("rcvqtyerrorflg");
        return _rcvqtyerrorflg;
    }

    /**
     * [set] RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫数量異常フラグ
     * @param rcvqtyerrorflg The value of the column 'RCVQTYERRORFLG'. (basically NotNull if update: for the constraint)
     */
    public void setRcvqtyerrorflg(java.math.BigDecimal rcvqtyerrorflg) {
        registerModifiedProperty("rcvqtyerrorflg");
        _rcvqtyerrorflg = rcvqtyerrorflg;
    }

    /**
     * [get] LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 理論在庫フラグ１
     * @return The value of the column 'LOGICFLG1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getLogicflg1() {
        checkSpecifiedProperty("logicflg1");
        return _logicflg1;
    }

    /**
     * [set] LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 理論在庫フラグ１
     * @param logicflg1 The value of the column 'LOGICFLG1'. (basically NotNull if update: for the constraint)
     */
    public void setLogicflg1(java.math.BigDecimal logicflg1) {
        registerModifiedProperty("logicflg1");
        _logicflg1 = logicflg1;
    }

    /**
     * [get] LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 理論在庫フラグ２
     * @return The value of the column 'LOGICFLG2'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getLogicflg2() {
        checkSpecifiedProperty("logicflg2");
        return _logicflg2;
    }

    /**
     * [set] LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 理論在庫フラグ２
     * @param logicflg2 The value of the column 'LOGICFLG2'. (basically NotNull if update: for the constraint)
     */
    public void setLogicflg2(java.math.BigDecimal logicflg2) {
        registerModifiedProperty("logicflg2");
        _logicflg2 = logicflg2;
    }

    /**
     * [get] LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 理論在庫フラグ３
     * @return The value of the column 'LOGICFLG3'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getLogicflg3() {
        checkSpecifiedProperty("logicflg3");
        return _logicflg3;
    }

    /**
     * [set] LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 理論在庫フラグ３
     * @param logicflg3 The value of the column 'LOGICFLG3'. (basically NotNull if update: for the constraint)
     */
    public void setLogicflg3(java.math.BigDecimal logicflg3) {
        registerModifiedProperty("logicflg3");
        _logicflg3 = logicflg3;
    }

    /**
     * [get] MOVELINENO: {bigint(19)} <br>
     * 移動予定行№
     * @return The value of the column 'MOVELINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMovelineno() {
        checkSpecifiedProperty("movelineno");
        return _movelineno;
    }

    /**
     * [set] MOVELINENO: {bigint(19)} <br>
     * 移動予定行№
     * @param movelineno The value of the column 'MOVELINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMovelineno(Long movelineno) {
        registerModifiedProperty("movelineno");
        _movelineno = movelineno;
    }

    /**
     * [get] ASSYLINENO: {bigint(19)} <br>
     * 加工指示行№
     * @return The value of the column 'ASSYLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAssylineno() {
        checkSpecifiedProperty("assylineno");
        return _assylineno;
    }

    /**
     * [set] ASSYLINENO: {bigint(19)} <br>
     * 加工指示行№
     * @param assylineno The value of the column 'ASSYLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssylineno(Long assylineno) {
        registerModifiedProperty("assylineno");
        _assylineno = assylineno;
    }

    /**
     * [get] PRODUCELINENO: {bigint(19)} <br>
     * 加工結果行№
     * @return The value of the column 'PRODUCELINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProducelineno() {
        checkSpecifiedProperty("producelineno");
        return _producelineno;
    }

    /**
     * [set] PRODUCELINENO: {bigint(19)} <br>
     * 加工結果行№
     * @param producelineno The value of the column 'PRODUCELINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProducelineno(Long producelineno) {
        registerModifiedProperty("producelineno");
        _producelineno = producelineno;
    }

    /**
     * [get] CHECKLASTLOTFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * ロット後退チェックフラグ
     * @return The value of the column 'CHECKLASTLOTFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getChecklastlotflg() {
        checkSpecifiedProperty("checklastlotflg");
        return _checklastlotflg;
    }

    /**
     * [set] CHECKLASTLOTFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * ロット後退チェックフラグ
     * @param checklastlotflg The value of the column 'CHECKLASTLOTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setChecklastlotflg(java.math.BigDecimal checklastlotflg) {
        registerModifiedProperty("checklastlotflg");
        _checklastlotflg = checklastlotflg;
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
