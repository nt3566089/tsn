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
 * The entity of T_TRFLEXIBILITYPRODUCT as TABLE. <br>
 * 融通輸送製品情報
 * <pre>
 * [primary-key]
 *     TRFLEXIBILITYPRODUCT_ID
 *
 * [column]
 *     TRFLEXIBILITYPRODUCT_ID, SUPPLIERCD, SHIPCD, SCHDATE, FLEXIBITYNO, TRANSPORTCD, RCVDATE, OWNERCD, INSTRACTDATETIME, RCVMAKEFLG, REFLINENO, PRODUCT_CD, MANUFACTUREDATE, DESIGNCD, QTYCASE, QTYBOWL, CASEINFOFLG, FACTORYCD, ITEMCD_CASE, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO, MACHINENO, CREATENO, LIMITDATE, DATETIME, DISTRIBUTIONCD, OPERATIONNUM, RCVKEY, FIRMCARRYNO, BATJPRODUCTIONYM, COMETODATE, RECEIVEDATE, CARDBOARDNO, RCVPALLETNO, TAXPALLETNO, ITEMCD_IN, ITEMCD_WH, DESIGNCD_IN, DESIGNCD_WH, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRFLEXIBILITYPRODUCT_ID
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
 * Long trflexibilityproductId = entity.getTrflexibilityproductId();
 * String suppliercd = entity.getSuppliercd();
 * String shipcd = entity.getShipcd();
 * String schdate = entity.getSchdate();
 * java.math.BigDecimal flexibityno = entity.getFlexibityno();
 * String transportcd = entity.getTransportcd();
 * String rcvdate = entity.getRcvdate();
 * String ownercd = entity.getOwnercd();
 * String instractdatetime = entity.getInstractdatetime();
 * java.math.BigDecimal rcvmakeflg = entity.getRcvmakeflg();
 * Long reflineno = entity.getReflineno();
 * String productCd = entity.getProductCd();
 * String manufacturedate = entity.getManufacturedate();
 * String designcd = entity.getDesigncd();
 * java.math.BigDecimal qtycase = entity.getQtycase();
 * java.math.BigDecimal qtybowl = entity.getQtybowl();
 * java.math.BigDecimal caseinfoflg = entity.getCaseinfoflg();
 * String factorycd = entity.getFactorycd();
 * String itemcdCase = entity.getItemcdCase();
 * String skucd = entity.getSkucd();
 * String destinationcd = entity.getDestinationcd();
 * String manufacturecd = entity.getManufacturecd();
 * String orderno = entity.getOrderno();
 * String machineno = entity.getMachineno();
 * String createno = entity.getCreateno();
 * String limitdate = entity.getLimitdate();
 * String datetime = entity.getDatetime();
 * String distributioncd = entity.getDistributioncd();
 * Long operationnum = entity.getOperationnum();
 * java.math.BigDecimal rcvkey = entity.getRcvkey();
 * String firmcarryno = entity.getFirmcarryno();
 * String batjproductionym = entity.getBatjproductionym();
 * String cometodate = entity.getCometodate();
 * String receivedate = entity.getReceivedate();
 * String cardboardno = entity.getCardboardno();
 * String rcvpalletno = entity.getRcvpalletno();
 * String taxpalletno = entity.getTaxpalletno();
 * String itemcdIn = entity.getItemcdIn();
 * String itemcdWh = entity.getItemcdWh();
 * String designcdIn = entity.getDesigncdIn();
 * String designcdWh = entity.getDesigncdWh();
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
 * entity.setTrflexibilityproductId(trflexibilityproductId);
 * entity.setSuppliercd(suppliercd);
 * entity.setShipcd(shipcd);
 * entity.setSchdate(schdate);
 * entity.setFlexibityno(flexibityno);
 * entity.setTransportcd(transportcd);
 * entity.setRcvdate(rcvdate);
 * entity.setOwnercd(ownercd);
 * entity.setInstractdatetime(instractdatetime);
 * entity.setRcvmakeflg(rcvmakeflg);
 * entity.setReflineno(reflineno);
 * entity.setProductCd(productCd);
 * entity.setManufacturedate(manufacturedate);
 * entity.setDesigncd(designcd);
 * entity.setQtycase(qtycase);
 * entity.setQtybowl(qtybowl);
 * entity.setCaseinfoflg(caseinfoflg);
 * entity.setFactorycd(factorycd);
 * entity.setItemcdCase(itemcdCase);
 * entity.setSkucd(skucd);
 * entity.setDestinationcd(destinationcd);
 * entity.setManufacturecd(manufacturecd);
 * entity.setOrderno(orderno);
 * entity.setMachineno(machineno);
 * entity.setCreateno(createno);
 * entity.setLimitdate(limitdate);
 * entity.setDatetime(datetime);
 * entity.setDistributioncd(distributioncd);
 * entity.setOperationnum(operationnum);
 * entity.setRcvkey(rcvkey);
 * entity.setFirmcarryno(firmcarryno);
 * entity.setBatjproductionym(batjproductionym);
 * entity.setCometodate(cometodate);
 * entity.setReceivedate(receivedate);
 * entity.setCardboardno(cardboardno);
 * entity.setRcvpalletno(rcvpalletno);
 * entity.setTaxpalletno(taxpalletno);
 * entity.setItemcdIn(itemcdIn);
 * entity.setItemcdWh(itemcdWh);
 * entity.setDesigncdIn(designcdIn);
 * entity.setDesigncdWh(designcdWh);
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
public abstract class BsTTrflexibilityproduct extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trflexibilityproductId;

    /** SUPPLIERCD: {NotNull, varchar(30)} */
    protected String _suppliercd;

    /** SHIPCD: {NotNull, varchar(30)} */
    protected String _shipcd;

    /** SCHDATE: {NotNull, varchar(8)} */
    protected String _schdate;

    /** FLEXIBITYNO: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _flexibityno;

    /** TRANSPORTCD: {NotNull, varchar(30)} */
    protected String _transportcd;

    /** RCVDATE: {IX, NotNull, varchar(8)} */
    protected String _rcvdate;

    /** OWNERCD: {NotNull, varchar(30)} */
    protected String _ownercd;

    /** INSTRACTDATETIME: {NotNull, varchar(8)} */
    protected String _instractdatetime;

    /** RCVMAKEFLG: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _rcvmakeflg;

    /** REFLINENO: {NotNull, bigint(19)} */
    protected Long _reflineno;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** MANUFACTUREDATE: {NotNull, varchar(8)} */
    protected String _manufacturedate;

    /** DESIGNCD: {NotNull, varchar(30)} */
    protected String _designcd;

    /** QTYCASE: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _qtycase;

    /** QTYBOWL: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _qtybowl;

    /** CASEINFOFLG: {decimal(16, 6)} */
    protected java.math.BigDecimal _caseinfoflg;

    /** FACTORYCD: {varchar(30)} */
    protected String _factorycd;

    /** ITEMCD_CASE: {varchar(30)} */
    protected String _itemcdCase;

    /** SKUCD: {varchar(30)} */
    protected String _skucd;

    /** DESTINATIONCD: {varchar(30)} */
    protected String _destinationcd;

    /** MANUFACTURECD: {varchar(30)} */
    protected String _manufacturecd;

    /** ORDERNO: {varchar(30)} */
    protected String _orderno;

    /** MACHINENO: {varchar(30)} */
    protected String _machineno;

    /** CREATENO: {varchar(30)} */
    protected String _createno;

    /** LIMITDATE: {varchar(8)} */
    protected String _limitdate;

    /** DATETIME: {varchar(8)} */
    protected String _datetime;

    /** DISTRIBUTIONCD: {char(1)} */
    protected String _distributioncd;

    /** OPERATIONNUM: {bigint(19)} */
    protected Long _operationnum;

    /** RCVKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _rcvkey;

    /** FIRMCARRYNO: {varchar(30)} */
    protected String _firmcarryno;

    /** BATJPRODUCTIONYM: {varchar(30)} */
    protected String _batjproductionym;

    /** COMETODATE: {varchar(8)} */
    protected String _cometodate;

    /** RECEIVEDATE: {varchar(8)} */
    protected String _receivedate;

    /** CARDBOARDNO: {varchar(30)} */
    protected String _cardboardno;

    /** RCVPALLETNO: {varchar(30)} */
    protected String _rcvpalletno;

    /** TAXPALLETNO: {varchar(30)} */
    protected String _taxpalletno;

    /** ITEMCD_IN: {varchar(30)} */
    protected String _itemcdIn;

    /** ITEMCD_WH: {varchar(30)} */
    protected String _itemcdWh;

    /** DESIGNCD_IN: {varchar(30)} */
    protected String _designcdIn;

    /** DESIGNCD_WH: {varchar(30)} */
    protected String _designcdWh;

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
        return "T_TRFLEXIBILITYPRODUCT";
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
        if (_trflexibilityproductId == null) { return false; }
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
        if (obj instanceof BsTTrflexibilityproduct) {
            BsTTrflexibilityproduct other = (BsTTrflexibilityproduct)obj;
            if (!xSV(_trflexibilityproductId, other._trflexibilityproductId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trflexibilityproductId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trflexibilityproductId));
        sb.append(dm).append(xfND(_suppliercd));
        sb.append(dm).append(xfND(_shipcd));
        sb.append(dm).append(xfND(_schdate));
        sb.append(dm).append(xfND(_flexibityno));
        sb.append(dm).append(xfND(_transportcd));
        sb.append(dm).append(xfND(_rcvdate));
        sb.append(dm).append(xfND(_ownercd));
        sb.append(dm).append(xfND(_instractdatetime));
        sb.append(dm).append(xfND(_rcvmakeflg));
        sb.append(dm).append(xfND(_reflineno));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_manufacturedate));
        sb.append(dm).append(xfND(_designcd));
        sb.append(dm).append(xfND(_qtycase));
        sb.append(dm).append(xfND(_qtybowl));
        sb.append(dm).append(xfND(_caseinfoflg));
        sb.append(dm).append(xfND(_factorycd));
        sb.append(dm).append(xfND(_itemcdCase));
        sb.append(dm).append(xfND(_skucd));
        sb.append(dm).append(xfND(_destinationcd));
        sb.append(dm).append(xfND(_manufacturecd));
        sb.append(dm).append(xfND(_orderno));
        sb.append(dm).append(xfND(_machineno));
        sb.append(dm).append(xfND(_createno));
        sb.append(dm).append(xfND(_limitdate));
        sb.append(dm).append(xfND(_datetime));
        sb.append(dm).append(xfND(_distributioncd));
        sb.append(dm).append(xfND(_operationnum));
        sb.append(dm).append(xfND(_rcvkey));
        sb.append(dm).append(xfND(_firmcarryno));
        sb.append(dm).append(xfND(_batjproductionym));
        sb.append(dm).append(xfND(_cometodate));
        sb.append(dm).append(xfND(_receivedate));
        sb.append(dm).append(xfND(_cardboardno));
        sb.append(dm).append(xfND(_rcvpalletno));
        sb.append(dm).append(xfND(_taxpalletno));
        sb.append(dm).append(xfND(_itemcdIn));
        sb.append(dm).append(xfND(_itemcdWh));
        sb.append(dm).append(xfND(_designcdIn));
        sb.append(dm).append(xfND(_designcdWh));
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
        return "";
    }

    @Override
    public TTrflexibilityproduct clone() {
        return (TTrflexibilityproduct)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通輸送製品情報ID
     * @return The value of the column 'TRFLEXIBILITYPRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrflexibilityproductId() {
        checkSpecifiedProperty("trflexibilityproductId");
        return _trflexibilityproductId;
    }

    /**
     * [set] TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通輸送製品情報ID
     * @param trflexibilityproductId The value of the column 'TRFLEXIBILITYPRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrflexibilityproductId(Long trflexibilityproductId) {
        registerModifiedProperty("trflexibilityproductId");
        _trflexibilityproductId = trflexibilityproductId;
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
     * [get] SHIPCD: {NotNull, varchar(30)} <br>
     * 発送先CD
     * @return The value of the column 'SHIPCD'. (basically NotNull if selected: for the constraint)
     */
    public String getShipcd() {
        checkSpecifiedProperty("shipcd");
        return convertEmptyToNull(_shipcd);
    }

    /**
     * [set] SHIPCD: {NotNull, varchar(30)} <br>
     * 発送先CD
     * @param shipcd The value of the column 'SHIPCD'. (basically NotNull if update: for the constraint)
     */
    public void setShipcd(String shipcd) {
        registerModifiedProperty("shipcd");
        _shipcd = shipcd;
    }

    /**
     * [get] SCHDATE: {NotNull, varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SCHDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getSchdate() {
        checkSpecifiedProperty("schdate");
        return convertEmptyToNull(_schdate);
    }

    /**
     * [set] SCHDATE: {NotNull, varchar(8)} <br>
     * 発送予定日
     * @param schdate The value of the column 'SCHDATE'. (basically NotNull if update: for the constraint)
     */
    public void setSchdate(String schdate) {
        registerModifiedProperty("schdate");
        _schdate = schdate;
    }

    /**
     * [get] FLEXIBITYNO: {NotNull, decimal(16, 6)} <br>
     * 融通No.
     * @return The value of the column 'FLEXIBITYNO'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getFlexibityno() {
        checkSpecifiedProperty("flexibityno");
        return _flexibityno;
    }

    /**
     * [set] FLEXIBITYNO: {NotNull, decimal(16, 6)} <br>
     * 融通No.
     * @param flexibityno The value of the column 'FLEXIBITYNO'. (basically NotNull if update: for the constraint)
     */
    public void setFlexibityno(java.math.BigDecimal flexibityno) {
        registerModifiedProperty("flexibityno");
        _flexibityno = flexibityno;
    }

    /**
     * [get] TRANSPORTCD: {NotNull, varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (basically NotNull if selected: for the constraint)
     */
    public String getTransportcd() {
        checkSpecifiedProperty("transportcd");
        return convertEmptyToNull(_transportcd);
    }

    /**
     * [set] TRANSPORTCD: {NotNull, varchar(30)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (basically NotNull if update: for the constraint)
     */
    public void setTransportcd(String transportcd) {
        registerModifiedProperty("transportcd");
        _transportcd = transportcd;
    }

    /**
     * [get] RCVDATE: {IX, NotNull, varchar(8)} <br>
     * 受入予定日
     * @return The value of the column 'RCVDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getRcvdate() {
        checkSpecifiedProperty("rcvdate");
        return convertEmptyToNull(_rcvdate);
    }

    /**
     * [set] RCVDATE: {IX, NotNull, varchar(8)} <br>
     * 受入予定日
     * @param rcvdate The value of the column 'RCVDATE'. (basically NotNull if update: for the constraint)
     */
    public void setRcvdate(String rcvdate) {
        registerModifiedProperty("rcvdate");
        _rcvdate = rcvdate;
    }

    /**
     * [get] OWNERCD: {NotNull, varchar(30)} <br>
     * 荷主CD
     * @return The value of the column 'OWNERCD'. (basically NotNull if selected: for the constraint)
     */
    public String getOwnercd() {
        checkSpecifiedProperty("ownercd");
        return convertEmptyToNull(_ownercd);
    }

    /**
     * [set] OWNERCD: {NotNull, varchar(30)} <br>
     * 荷主CD
     * @param ownercd The value of the column 'OWNERCD'. (basically NotNull if update: for the constraint)
     */
    public void setOwnercd(String ownercd) {
        registerModifiedProperty("ownercd");
        _ownercd = ownercd;
    }

    /**
     * [get] INSTRACTDATETIME: {NotNull, varchar(8)} <br>
     * 指示登録日時
     * @return The value of the column 'INSTRACTDATETIME'. (basically NotNull if selected: for the constraint)
     */
    public String getInstractdatetime() {
        checkSpecifiedProperty("instractdatetime");
        return convertEmptyToNull(_instractdatetime);
    }

    /**
     * [set] INSTRACTDATETIME: {NotNull, varchar(8)} <br>
     * 指示登録日時
     * @param instractdatetime The value of the column 'INSTRACTDATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setInstractdatetime(String instractdatetime) {
        registerModifiedProperty("instractdatetime");
        _instractdatetime = instractdatetime;
    }

    /**
     * [get] RCVMAKEFLG: {NotNull, decimal(16, 6)} <br>
     * 入庫予定作成フラグ
     * @return The value of the column 'RCVMAKEFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRcvmakeflg() {
        checkSpecifiedProperty("rcvmakeflg");
        return _rcvmakeflg;
    }

    /**
     * [set] RCVMAKEFLG: {NotNull, decimal(16, 6)} <br>
     * 入庫予定作成フラグ
     * @param rcvmakeflg The value of the column 'RCVMAKEFLG'. (basically NotNull if update: for the constraint)
     */
    public void setRcvmakeflg(java.math.BigDecimal rcvmakeflg) {
        registerModifiedProperty("rcvmakeflg");
        _rcvmakeflg = rcvmakeflg;
    }

    /**
     * [get] REFLINENO: {NotNull, bigint(19)} <br>
     * 明細番号
     * @return The value of the column 'REFLINENO'. (basically NotNull if selected: for the constraint)
     */
    public Long getReflineno() {
        checkSpecifiedProperty("reflineno");
        return _reflineno;
    }

    /**
     * [set] REFLINENO: {NotNull, bigint(19)} <br>
     * 明細番号
     * @param reflineno The value of the column 'REFLINENO'. (basically NotNull if update: for the constraint)
     */
    public void setReflineno(Long reflineno) {
        registerModifiedProperty("reflineno");
        _reflineno = reflineno;
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
     * [get] MANUFACTUREDATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTUREDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getManufacturedate() {
        checkSpecifiedProperty("manufacturedate");
        return convertEmptyToNull(_manufacturedate);
    }

    /**
     * [set] MANUFACTUREDATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param manufacturedate The value of the column 'MANUFACTUREDATE'. (basically NotNull if update: for the constraint)
     */
    public void setManufacturedate(String manufacturedate) {
        registerModifiedProperty("manufacturedate");
        _manufacturedate = manufacturedate;
    }

    /**
     * [get] DESIGNCD: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNCD'. (basically NotNull if selected: for the constraint)
     */
    public String getDesigncd() {
        checkSpecifiedProperty("designcd");
        return convertEmptyToNull(_designcd);
    }

    /**
     * [set] DESIGNCD: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DESIGNCD'. (basically NotNull if update: for the constraint)
     */
    public void setDesigncd(String designcd) {
        registerModifiedProperty("designcd");
        _designcd = designcd;
    }

    /**
     * [get] QTYCASE: {NotNull, decimal(16, 6)} <br>
     * 数量（ケース）
     * @return The value of the column 'QTYCASE'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getQtycase() {
        checkSpecifiedProperty("qtycase");
        return _qtycase;
    }

    /**
     * [set] QTYCASE: {NotNull, decimal(16, 6)} <br>
     * 数量（ケース）
     * @param qtycase The value of the column 'QTYCASE'. (basically NotNull if update: for the constraint)
     */
    public void setQtycase(java.math.BigDecimal qtycase) {
        registerModifiedProperty("qtycase");
        _qtycase = qtycase;
    }

    /**
     * [get] QTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 数量（カートン）
     * @return The value of the column 'QTYBOWL'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getQtybowl() {
        checkSpecifiedProperty("qtybowl");
        return _qtybowl;
    }

    /**
     * [set] QTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 数量（カートン）
     * @param qtybowl The value of the column 'QTYBOWL'. (basically NotNull if update: for the constraint)
     */
    public void setQtybowl(java.math.BigDecimal qtybowl) {
        registerModifiedProperty("qtybowl");
        _qtybowl = qtybowl;
    }

    /**
     * [get] CASEINFOFLG: {decimal(16, 6)} <br>
     * ケース情報有無フラグ
     * @return The value of the column 'CASEINFOFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCaseinfoflg() {
        checkSpecifiedProperty("caseinfoflg");
        return _caseinfoflg;
    }

    /**
     * [set] CASEINFOFLG: {decimal(16, 6)} <br>
     * ケース情報有無フラグ
     * @param caseinfoflg The value of the column 'CASEINFOFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseinfoflg(java.math.BigDecimal caseinfoflg) {
        registerModifiedProperty("caseinfoflg");
        _caseinfoflg = caseinfoflg;
    }

    /**
     * [get] FACTORYCD: {varchar(30)} <br>
     * 工場CD
     * @return The value of the column 'FACTORYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFactorycd() {
        checkSpecifiedProperty("factorycd");
        return convertEmptyToNull(_factorycd);
    }

    /**
     * [set] FACTORYCD: {varchar(30)} <br>
     * 工場CD
     * @param factorycd The value of the column 'FACTORYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFactorycd(String factorycd) {
        registerModifiedProperty("factorycd");
        _factorycd = factorycd;
    }

    /**
     * [get] ITEMCD_CASE: {varchar(30)} <br>
     * 銘柄CD（ケース）
     * @return The value of the column 'ITEMCD_CASE'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcdCase() {
        checkSpecifiedProperty("itemcdCase");
        return convertEmptyToNull(_itemcdCase);
    }

    /**
     * [set] ITEMCD_CASE: {varchar(30)} <br>
     * 銘柄CD（ケース）
     * @param itemcdCase The value of the column 'ITEMCD_CASE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcdCase(String itemcdCase) {
        registerModifiedProperty("itemcdCase");
        _itemcdCase = itemcdCase;
    }

    /**
     * [get] SKUCD: {varchar(30)} <br>
     * SKUCD
     * @return The value of the column 'SKUCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSkucd() {
        checkSpecifiedProperty("skucd");
        return convertEmptyToNull(_skucd);
    }

    /**
     * [set] SKUCD: {varchar(30)} <br>
     * SKUCD
     * @param skucd The value of the column 'SKUCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSkucd(String skucd) {
        registerModifiedProperty("skucd");
        _skucd = skucd;
    }

    /**
     * [get] DESTINATIONCD: {varchar(30)} <br>
     * 仕向地CD
     * @return The value of the column 'DESTINATIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationcd() {
        checkSpecifiedProperty("destinationcd");
        return convertEmptyToNull(_destinationcd);
    }

    /**
     * [set] DESTINATIONCD: {varchar(30)} <br>
     * 仕向地CD
     * @param destinationcd The value of the column 'DESTINATIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationcd(String destinationcd) {
        registerModifiedProperty("destinationcd");
        _destinationcd = destinationcd;
    }

    /**
     * [get] MANUFACTURECD: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufacturecd() {
        checkSpecifiedProperty("manufacturecd");
        return convertEmptyToNull(_manufacturecd);
    }

    /**
     * [set] MANUFACTURECD: {varchar(30)} <br>
     * 製造記号
     * @param manufacturecd The value of the column 'MANUFACTURECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufacturecd(String manufacturecd) {
        registerModifiedProperty("manufacturecd");
        _manufacturecd = manufacturecd;
    }

    /**
     * [get] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @return The value of the column 'ORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderno() {
        checkSpecifiedProperty("orderno");
        return convertEmptyToNull(_orderno);
    }

    /**
     * [set] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @param orderno The value of the column 'ORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderno(String orderno) {
        registerModifiedProperty("orderno");
        _orderno = orderno;
    }

    /**
     * [get] MACHINENO: {varchar(30)} <br>
     * 号機
     * @return The value of the column 'MACHINENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMachineno() {
        checkSpecifiedProperty("machineno");
        return convertEmptyToNull(_machineno);
    }

    /**
     * [set] MACHINENO: {varchar(30)} <br>
     * 号機
     * @param machineno The value of the column 'MACHINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMachineno(String machineno) {
        registerModifiedProperty("machineno");
        _machineno = machineno;
    }

    /**
     * [get] CREATENO: {varchar(30)} <br>
     * 生出番号
     * @return The value of the column 'CREATENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreateno() {
        checkSpecifiedProperty("createno");
        return convertEmptyToNull(_createno);
    }

    /**
     * [set] CREATENO: {varchar(30)} <br>
     * 生出番号
     * @param createno The value of the column 'CREATENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateno(String createno) {
        registerModifiedProperty("createno");
        _createno = createno;
    }

    /**
     * [get] LIMITDATE: {varchar(8)} <br>
     * 製造年月日（ケース）
     * @return The value of the column 'LIMITDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitdate() {
        checkSpecifiedProperty("limitdate");
        return convertEmptyToNull(_limitdate);
    }

    /**
     * [set] LIMITDATE: {varchar(8)} <br>
     * 製造年月日（ケース）
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitdate(String limitdate) {
        registerModifiedProperty("limitdate");
        _limitdate = limitdate;
    }

    /**
     * [get] DATETIME: {varchar(8)} <br>
     * 日付時刻
     * @return The value of the column 'DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDatetime() {
        checkSpecifiedProperty("datetime");
        return convertEmptyToNull(_datetime);
    }

    /**
     * [set] DATETIME: {varchar(8)} <br>
     * 日付時刻
     * @param datetime The value of the column 'DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDatetime(String datetime) {
        registerModifiedProperty("datetime");
        _datetime = datetime;
    }

    /**
     * [get] DISTRIBUTIONCD: {char(1)} <br>
     * 流通識別
     * @return The value of the column 'DISTRIBUTIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistributioncd() {
        checkSpecifiedProperty("distributioncd");
        return convertEmptyToNull(_distributioncd);
    }

    /**
     * [set] DISTRIBUTIONCD: {char(1)} <br>
     * 流通識別
     * @param distributioncd The value of the column 'DISTRIBUTIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistributioncd(String distributioncd) {
        registerModifiedProperty("distributioncd");
        _distributioncd = distributioncd;
    }

    /**
     * [get] OPERATIONNUM: {bigint(19)} <br>
     * 操作数量
     * @return The value of the column 'OPERATIONNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOperationnum() {
        checkSpecifiedProperty("operationnum");
        return _operationnum;
    }

    /**
     * [set] OPERATIONNUM: {bigint(19)} <br>
     * 操作数量
     * @param operationnum The value of the column 'OPERATIONNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOperationnum(Long operationnum) {
        registerModifiedProperty("operationnum");
        _operationnum = operationnum;
    }

    /**
     * [get] RCVKEY: {decimal(16, 6)} <br>
     * 入庫キー
     * @return The value of the column 'RCVKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRcvkey() {
        checkSpecifiedProperty("rcvkey");
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {decimal(16, 6)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        registerModifiedProperty("rcvkey");
        _rcvkey = rcvkey;
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
     * [get] BATJPRODUCTIONYM: {varchar(30)} <br>
     * BATJ製造月情報
     * @return The value of the column 'BATJPRODUCTIONYM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatjproductionym() {
        checkSpecifiedProperty("batjproductionym");
        return convertEmptyToNull(_batjproductionym);
    }

    /**
     * [set] BATJPRODUCTIONYM: {varchar(30)} <br>
     * BATJ製造月情報
     * @param batjproductionym The value of the column 'BATJPRODUCTIONYM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatjproductionym(String batjproductionym) {
        registerModifiedProperty("batjproductionym");
        _batjproductionym = batjproductionym;
    }

    /**
     * [get] COMETODATE: {varchar(8)} <br>
     * 入港日
     * @return The value of the column 'COMETODATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCometodate() {
        checkSpecifiedProperty("cometodate");
        return convertEmptyToNull(_cometodate);
    }

    /**
     * [set] COMETODATE: {varchar(8)} <br>
     * 入港日
     * @param cometodate The value of the column 'COMETODATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCometodate(String cometodate) {
        registerModifiedProperty("cometodate");
        _cometodate = cometodate;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedate() {
        checkSpecifiedProperty("receivedate");
        return convertEmptyToNull(_receivedate);
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedate(String receivedate) {
        registerModifiedProperty("receivedate");
        _receivedate = receivedate;
    }

    /**
     * [get] CARDBOARDNO: {varchar(30)} <br>
     * 段ボール番号
     * @return The value of the column 'CARDBOARDNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCardboardno() {
        checkSpecifiedProperty("cardboardno");
        return convertEmptyToNull(_cardboardno);
    }

    /**
     * [set] CARDBOARDNO: {varchar(30)} <br>
     * 段ボール番号
     * @param cardboardno The value of the column 'CARDBOARDNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCardboardno(String cardboardno) {
        registerModifiedProperty("cardboardno");
        _cardboardno = cardboardno;
    }

    /**
     * [get] RCVPALLETNO: {varchar(30)} <br>
     * 08需給パレット番号
     * @return The value of the column 'RCVPALLETNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvpalletno() {
        checkSpecifiedProperty("rcvpalletno");
        return convertEmptyToNull(_rcvpalletno);
    }

    /**
     * [set] RCVPALLETNO: {varchar(30)} <br>
     * 08需給パレット番号
     * @param rcvpalletno The value of the column 'RCVPALLETNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvpalletno(String rcvpalletno) {
        registerModifiedProperty("rcvpalletno");
        _rcvpalletno = rcvpalletno;
    }

    /**
     * [get] TAXPALLETNO: {varchar(30)} <br>
     * 保税パレット番号
     * @return The value of the column 'TAXPALLETNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTaxpalletno() {
        checkSpecifiedProperty("taxpalletno");
        return convertEmptyToNull(_taxpalletno);
    }

    /**
     * [set] TAXPALLETNO: {varchar(30)} <br>
     * 保税パレット番号
     * @param taxpalletno The value of the column 'TAXPALLETNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTaxpalletno(String taxpalletno) {
        registerModifiedProperty("taxpalletno");
        _taxpalletno = taxpalletno;
    }

    /**
     * [get] ITEMCD_IN: {varchar(30)} <br>
     * 銘柄CD（入庫時）
     * @return The value of the column 'ITEMCD_IN'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcdIn() {
        checkSpecifiedProperty("itemcdIn");
        return convertEmptyToNull(_itemcdIn);
    }

    /**
     * [set] ITEMCD_IN: {varchar(30)} <br>
     * 銘柄CD（入庫時）
     * @param itemcdIn The value of the column 'ITEMCD_IN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcdIn(String itemcdIn) {
        registerModifiedProperty("itemcdIn");
        _itemcdIn = itemcdIn;
    }

    /**
     * [get] ITEMCD_WH: {varchar(30)} <br>
     * 銘柄CD（倉庫内）
     * @return The value of the column 'ITEMCD_WH'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcdWh() {
        checkSpecifiedProperty("itemcdWh");
        return convertEmptyToNull(_itemcdWh);
    }

    /**
     * [set] ITEMCD_WH: {varchar(30)} <br>
     * 銘柄CD（倉庫内）
     * @param itemcdWh The value of the column 'ITEMCD_WH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcdWh(String itemcdWh) {
        registerModifiedProperty("itemcdWh");
        _itemcdWh = itemcdWh;
    }

    /**
     * [get] DESIGNCD_IN: {varchar(30)} <br>
     * デザイン区分（入庫時）
     * @return The value of the column 'DESIGNCD_IN'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncdIn() {
        checkSpecifiedProperty("designcdIn");
        return convertEmptyToNull(_designcdIn);
    }

    /**
     * [set] DESIGNCD_IN: {varchar(30)} <br>
     * デザイン区分（入庫時）
     * @param designcdIn The value of the column 'DESIGNCD_IN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncdIn(String designcdIn) {
        registerModifiedProperty("designcdIn");
        _designcdIn = designcdIn;
    }

    /**
     * [get] DESIGNCD_WH: {varchar(30)} <br>
     * デザイン区分（倉庫内）
     * @return The value of the column 'DESIGNCD_WH'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncdWh() {
        checkSpecifiedProperty("designcdWh");
        return convertEmptyToNull(_designcdWh);
    }

    /**
     * [set] DESIGNCD_WH: {varchar(30)} <br>
     * デザイン区分（倉庫内）
     * @param designcdWh The value of the column 'DESIGNCD_WH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncdWh(String designcdWh) {
        registerModifiedProperty("designcdWh");
        _designcdWh = designcdWh;
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
