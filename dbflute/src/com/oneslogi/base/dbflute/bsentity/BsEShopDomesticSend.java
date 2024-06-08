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
 * The entity of E_SHOP_DOMESTIC_SEND as TABLE. <br>
 * 販売店仕分情報送信テーブル(国産)
 * <pre>
 * [primary-key]
 *     SHOP_DOMESTIC_SEND_ID
 *
 * [column]
 *     SHOP_DOMESTIC_SEND_ID, SEND_CD, SEND_ROW_CD, WORK_FLG, USERNUM1, TRACEKEY, WAREHOUSECD, WAREHOUSENAME, FACTORYCD, FACTORYNAME, PRODUCT_CD, ITEMNAME, SKUCD, RECEIVECD, PRODUCTMARK, ORDERNO, PRINTERNO, MAKENO, LOT4, MAKETIME, TRANSPORTCD, DISTRIBUTIONCD, PALLETID, INITNUM, CREATEDATETIME, ASSORTDATETIME, TRACETYPE, TRACETYPENAME, LINEBLOCK, ASSORTEDUNIT, ASSORTEDINDEX, OPERATIONCODE, CASEINNUM, ASSORTNUM, ASSORTDIFNUM, DIRECTIONCD, PISTONTYPE, CUSTOMERCD, DIRECTIONNUM, DISTWAREHOUSECD, DISTWAREHOUSENAME, INV_NUM, SORT_NUM, ADOPT_NUM, WH_ITEMCD, WH_ITEMNAME, WH_DESIGNCD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHOP_DOMESTIC_SEND_ID
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
 * Long shopDomesticSendId = entity.getShopDomesticSendId();
 * String sendCd = entity.getSendCd();
 * Long sendRowCd = entity.getSendRowCd();
 * String workFlg = entity.getWorkFlg();
 * String usernum1 = entity.getUsernum1();
 * String tracekey = entity.getTracekey();
 * String warehousecd = entity.getWarehousecd();
 * String warehousename = entity.getWarehousename();
 * String factorycd = entity.getFactorycd();
 * String factoryname = entity.getFactoryname();
 * String productCd = entity.getProductCd();
 * String itemname = entity.getItemname();
 * String skucd = entity.getSkucd();
 * String receivecd = entity.getReceivecd();
 * String productmark = entity.getProductmark();
 * String orderno = entity.getOrderno();
 * String printerno = entity.getPrinterno();
 * String makeno = entity.getMakeno();
 * String lot4 = entity.getLot4();
 * String maketime = entity.getMaketime();
 * String transportcd = entity.getTransportcd();
 * String distributioncd = entity.getDistributioncd();
 * String palletid = entity.getPalletid();
 * String initnum = entity.getInitnum();
 * String createdatetime = entity.getCreatedatetime();
 * String assortdatetime = entity.getAssortdatetime();
 * String tracetype = entity.getTracetype();
 * String tracetypename = entity.getTracetypename();
 * String lineblock = entity.getLineblock();
 * String assortedunit = entity.getAssortedunit();
 * String assortedindex = entity.getAssortedindex();
 * String operationcode = entity.getOperationcode();
 * String caseinnum = entity.getCaseinnum();
 * String assortnum = entity.getAssortnum();
 * String assortdifnum = entity.getAssortdifnum();
 * String directioncd = entity.getDirectioncd();
 * String pistontype = entity.getPistontype();
 * String customercd = entity.getCustomercd();
 * String directionnum = entity.getDirectionnum();
 * String distwarehousecd = entity.getDistwarehousecd();
 * String distwarehousename = entity.getDistwarehousename();
 * String invNum = entity.getInvNum();
 * String sortNum = entity.getSortNum();
 * String adoptNum = entity.getAdoptNum();
 * String whItemcd = entity.getWhItemcd();
 * String whItemname = entity.getWhItemname();
 * String whDesigncd = entity.getWhDesigncd();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShopDomesticSendId(shopDomesticSendId);
 * entity.setSendCd(sendCd);
 * entity.setSendRowCd(sendRowCd);
 * entity.setWorkFlg(workFlg);
 * entity.setUsernum1(usernum1);
 * entity.setTracekey(tracekey);
 * entity.setWarehousecd(warehousecd);
 * entity.setWarehousename(warehousename);
 * entity.setFactorycd(factorycd);
 * entity.setFactoryname(factoryname);
 * entity.setProductCd(productCd);
 * entity.setItemname(itemname);
 * entity.setSkucd(skucd);
 * entity.setReceivecd(receivecd);
 * entity.setProductmark(productmark);
 * entity.setOrderno(orderno);
 * entity.setPrinterno(printerno);
 * entity.setMakeno(makeno);
 * entity.setLot4(lot4);
 * entity.setMaketime(maketime);
 * entity.setTransportcd(transportcd);
 * entity.setDistributioncd(distributioncd);
 * entity.setPalletid(palletid);
 * entity.setInitnum(initnum);
 * entity.setCreatedatetime(createdatetime);
 * entity.setAssortdatetime(assortdatetime);
 * entity.setTracetype(tracetype);
 * entity.setTracetypename(tracetypename);
 * entity.setLineblock(lineblock);
 * entity.setAssortedunit(assortedunit);
 * entity.setAssortedindex(assortedindex);
 * entity.setOperationcode(operationcode);
 * entity.setCaseinnum(caseinnum);
 * entity.setAssortnum(assortnum);
 * entity.setAssortdifnum(assortdifnum);
 * entity.setDirectioncd(directioncd);
 * entity.setPistontype(pistontype);
 * entity.setCustomercd(customercd);
 * entity.setDirectionnum(directionnum);
 * entity.setDistwarehousecd(distwarehousecd);
 * entity.setDistwarehousename(distwarehousename);
 * entity.setInvNum(invNum);
 * entity.setSortNum(sortNum);
 * entity.setAdoptNum(adoptNum);
 * entity.setWhItemcd(whItemcd);
 * entity.setWhItemname(whItemname);
 * entity.setWhDesigncd(whDesigncd);
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
public abstract class BsEShopDomesticSend extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _shopDomesticSendId;

    /** SEND_CD: {NotNull, varchar(30)} */
    protected String _sendCd;

    /** SEND_ROW_CD: {NotNull, bigint(19)} */
    protected Long _sendRowCd;

    /** WORK_FLG: {NotNull, char(1)} */
    protected String _workFlg;

    /** USERNUM1: {char(1)} */
    protected String _usernum1;

    /** TRACEKEY: {varchar(255)} */
    protected String _tracekey;

    /** WAREHOUSECD: {varchar(255)} */
    protected String _warehousecd;

    /** WAREHOUSENAME: {varchar(255)} */
    protected String _warehousename;

    /** FACTORYCD: {varchar(255)} */
    protected String _factorycd;

    /** FACTORYNAME: {varchar(255)} */
    protected String _factoryname;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** ITEMNAME: {varchar(255)} */
    protected String _itemname;

    /** SKUCD: {varchar(255)} */
    protected String _skucd;

    /** RECEIVECD: {varchar(255)} */
    protected String _receivecd;

    /** PRODUCTMARK: {varchar(255)} */
    protected String _productmark;

    /** ORDERNO: {varchar(255)} */
    protected String _orderno;

    /** PRINTERNO: {varchar(255)} */
    protected String _printerno;

    /** MAKENO: {varchar(255)} */
    protected String _makeno;

    /** LOT4: {varchar(255)} */
    protected String _lot4;

    /** MAKETIME: {varchar(255)} */
    protected String _maketime;

    /** TRANSPORTCD: {varchar(255)} */
    protected String _transportcd;

    /** DISTRIBUTIONCD: {varchar(255)} */
    protected String _distributioncd;

    /** PALLETID: {varchar(255)} */
    protected String _palletid;

    /** INITNUM: {varchar(255)} */
    protected String _initnum;

    /** CREATEDATETIME: {varchar(255)} */
    protected String _createdatetime;

    /** ASSORTDATETIME: {varchar(255)} */
    protected String _assortdatetime;

    /** TRACETYPE: {varchar(255)} */
    protected String _tracetype;

    /** TRACETYPENAME: {varchar(255)} */
    protected String _tracetypename;

    /** LINEBLOCK: {varchar(255)} */
    protected String _lineblock;

    /** ASSORTEDUNIT: {varchar(255)} */
    protected String _assortedunit;

    /** ASSORTEDINDEX: {varchar(255)} */
    protected String _assortedindex;

    /** OPERATIONCODE: {varchar(255)} */
    protected String _operationcode;

    /** CASEINNUM: {varchar(255)} */
    protected String _caseinnum;

    /** ASSORTNUM: {varchar(255)} */
    protected String _assortnum;

    /** ASSORTDIFNUM: {varchar(255)} */
    protected String _assortdifnum;

    /** DIRECTIONCD: {varchar(255)} */
    protected String _directioncd;

    /** PISTONTYPE: {varchar(255)} */
    protected String _pistontype;

    /** CUSTOMERCD: {varchar(255)} */
    protected String _customercd;

    /** DIRECTIONNUM: {varchar(255)} */
    protected String _directionnum;

    /** DISTWAREHOUSECD: {varchar(255)} */
    protected String _distwarehousecd;

    /** DISTWAREHOUSENAME: {varchar(255)} */
    protected String _distwarehousename;

    /** INV_NUM: {varchar(255)} */
    protected String _invNum;

    /** SORT_NUM: {varchar(255)} */
    protected String _sortNum;

    /** ADOPT_NUM: {varchar(255)} */
    protected String _adoptNum;

    /** WH_ITEMCD: {varchar(255)} */
    protected String _whItemcd;

    /** WH_ITEMNAME: {varchar(255)} */
    protected String _whItemname;

    /** WH_DESIGNCD: {varchar(255)} */
    protected String _whDesigncd;

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
        return "E_SHOP_DOMESTIC_SEND";
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
        if (_shopDomesticSendId == null) { return false; }
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
        if (obj instanceof BsEShopDomesticSend) {
            BsEShopDomesticSend other = (BsEShopDomesticSend)obj;
            if (!xSV(_shopDomesticSendId, other._shopDomesticSendId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shopDomesticSendId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shopDomesticSendId));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendRowCd));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_usernum1));
        sb.append(dm).append(xfND(_tracekey));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_warehousename));
        sb.append(dm).append(xfND(_factorycd));
        sb.append(dm).append(xfND(_factoryname));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_itemname));
        sb.append(dm).append(xfND(_skucd));
        sb.append(dm).append(xfND(_receivecd));
        sb.append(dm).append(xfND(_productmark));
        sb.append(dm).append(xfND(_orderno));
        sb.append(dm).append(xfND(_printerno));
        sb.append(dm).append(xfND(_makeno));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_maketime));
        sb.append(dm).append(xfND(_transportcd));
        sb.append(dm).append(xfND(_distributioncd));
        sb.append(dm).append(xfND(_palletid));
        sb.append(dm).append(xfND(_initnum));
        sb.append(dm).append(xfND(_createdatetime));
        sb.append(dm).append(xfND(_assortdatetime));
        sb.append(dm).append(xfND(_tracetype));
        sb.append(dm).append(xfND(_tracetypename));
        sb.append(dm).append(xfND(_lineblock));
        sb.append(dm).append(xfND(_assortedunit));
        sb.append(dm).append(xfND(_assortedindex));
        sb.append(dm).append(xfND(_operationcode));
        sb.append(dm).append(xfND(_caseinnum));
        sb.append(dm).append(xfND(_assortnum));
        sb.append(dm).append(xfND(_assortdifnum));
        sb.append(dm).append(xfND(_directioncd));
        sb.append(dm).append(xfND(_pistontype));
        sb.append(dm).append(xfND(_customercd));
        sb.append(dm).append(xfND(_directionnum));
        sb.append(dm).append(xfND(_distwarehousecd));
        sb.append(dm).append(xfND(_distwarehousename));
        sb.append(dm).append(xfND(_invNum));
        sb.append(dm).append(xfND(_sortNum));
        sb.append(dm).append(xfND(_adoptNum));
        sb.append(dm).append(xfND(_whItemcd));
        sb.append(dm).append(xfND(_whItemname));
        sb.append(dm).append(xfND(_whDesigncd));
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
    public EShopDomesticSend clone() {
        return (EShopDomesticSend)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 販売店仕分情報送信(国産)ID
     * @return The value of the column 'SHOP_DOMESTIC_SEND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShopDomesticSendId() {
        checkSpecifiedProperty("shopDomesticSendId");
        return _shopDomesticSendId;
    }

    /**
     * [set] SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 販売店仕分情報送信(国産)ID
     * @param shopDomesticSendId The value of the column 'SHOP_DOMESTIC_SEND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShopDomesticSendId(Long shopDomesticSendId) {
        registerModifiedProperty("shopDomesticSendId");
        _shopDomesticSendId = shopDomesticSendId;
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
     * [get] SEND_ROW_CD: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_CD'. (basically NotNull if selected: for the constraint)
     */
    public Long getSendRowCd() {
        checkSpecifiedProperty("sendRowCd");
        return _sendRowCd;
    }

    /**
     * [set] SEND_ROW_CD: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @param sendRowCd The value of the column 'SEND_ROW_CD'. (basically NotNull if update: for the constraint)
     */
    public void setSendRowCd(Long sendRowCd) {
        registerModifiedProperty("sendRowCd");
        _sendRowCd = sendRowCd;
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
     * [get] USERNUM1: {char(1)} <br>
     * 国産・輸入区分
     * @return The value of the column 'USERNUM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getUsernum1() {
        checkSpecifiedProperty("usernum1");
        return convertEmptyToNull(_usernum1);
    }

    /**
     * [set] USERNUM1: {char(1)} <br>
     * 国産・輸入区分
     * @param usernum1 The value of the column 'USERNUM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum1(String usernum1) {
        registerModifiedProperty("usernum1");
        _usernum1 = usernum1;
    }

    /**
     * [get] TRACEKEY: {varchar(255)} <br>
     * 製品追跡キー
     * @return The value of the column 'TRACEKEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getTracekey() {
        checkSpecifiedProperty("tracekey");
        return convertEmptyToNull(_tracekey);
    }

    /**
     * [set] TRACEKEY: {varchar(255)} <br>
     * 製品追跡キー
     * @param tracekey The value of the column 'TRACEKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTracekey(String tracekey) {
        registerModifiedProperty("tracekey");
        _tracekey = tracekey;
    }

    /**
     * [get] WAREHOUSECD: {varchar(255)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {varchar(255)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] WAREHOUSENAME: {varchar(255)} <br>
     * 拠点名称
     * @return The value of the column 'WAREHOUSENAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousename() {
        checkSpecifiedProperty("warehousename");
        return convertEmptyToNull(_warehousename);
    }

    /**
     * [set] WAREHOUSENAME: {varchar(255)} <br>
     * 拠点名称
     * @param warehousename The value of the column 'WAREHOUSENAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousename(String warehousename) {
        registerModifiedProperty("warehousename");
        _warehousename = warehousename;
    }

    /**
     * [get] FACTORYCD: {varchar(255)} <br>
     * 工場CD
     * @return The value of the column 'FACTORYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFactorycd() {
        checkSpecifiedProperty("factorycd");
        return convertEmptyToNull(_factorycd);
    }

    /**
     * [set] FACTORYCD: {varchar(255)} <br>
     * 工場CD
     * @param factorycd The value of the column 'FACTORYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFactorycd(String factorycd) {
        registerModifiedProperty("factorycd");
        _factorycd = factorycd;
    }

    /**
     * [get] FACTORYNAME: {varchar(255)} <br>
     * 工場名称
     * @return The value of the column 'FACTORYNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getFactoryname() {
        checkSpecifiedProperty("factoryname");
        return convertEmptyToNull(_factoryname);
    }

    /**
     * [set] FACTORYNAME: {varchar(255)} <br>
     * 工場名称
     * @param factoryname The value of the column 'FACTORYNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFactoryname(String factoryname) {
        registerModifiedProperty("factoryname");
        _factoryname = factoryname;
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
     * [get] ITEMNAME: {varchar(255)} <br>
     * 銘柄名称
     * @return The value of the column 'ITEMNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemname() {
        checkSpecifiedProperty("itemname");
        return convertEmptyToNull(_itemname);
    }

    /**
     * [set] ITEMNAME: {varchar(255)} <br>
     * 銘柄名称
     * @param itemname The value of the column 'ITEMNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemname(String itemname) {
        registerModifiedProperty("itemname");
        _itemname = itemname;
    }

    /**
     * [get] SKUCD: {varchar(255)} <br>
     * SKUCD
     * @return The value of the column 'SKUCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSkucd() {
        checkSpecifiedProperty("skucd");
        return convertEmptyToNull(_skucd);
    }

    /**
     * [set] SKUCD: {varchar(255)} <br>
     * SKUCD
     * @param skucd The value of the column 'SKUCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSkucd(String skucd) {
        registerModifiedProperty("skucd");
        _skucd = skucd;
    }

    /**
     * [get] RECEIVECD: {varchar(255)} <br>
     * 仕向地CD
     * @return The value of the column 'RECEIVECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivecd() {
        checkSpecifiedProperty("receivecd");
        return convertEmptyToNull(_receivecd);
    }

    /**
     * [set] RECEIVECD: {varchar(255)} <br>
     * 仕向地CD
     * @param receivecd The value of the column 'RECEIVECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivecd(String receivecd) {
        registerModifiedProperty("receivecd");
        _receivecd = receivecd;
    }

    /**
     * [get] PRODUCTMARK: {varchar(255)} <br>
     * 製造記号
     * @return The value of the column 'PRODUCTMARK'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductmark() {
        checkSpecifiedProperty("productmark");
        return convertEmptyToNull(_productmark);
    }

    /**
     * [set] PRODUCTMARK: {varchar(255)} <br>
     * 製造記号
     * @param productmark The value of the column 'PRODUCTMARK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductmark(String productmark) {
        registerModifiedProperty("productmark");
        _productmark = productmark;
    }

    /**
     * [get] ORDERNO: {varchar(255)} <br>
     * 発注番号
     * @return The value of the column 'ORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderno() {
        checkSpecifiedProperty("orderno");
        return convertEmptyToNull(_orderno);
    }

    /**
     * [set] ORDERNO: {varchar(255)} <br>
     * 発注番号
     * @param orderno The value of the column 'ORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderno(String orderno) {
        registerModifiedProperty("orderno");
        _orderno = orderno;
    }

    /**
     * [get] PRINTERNO: {varchar(255)} <br>
     * 号機
     * @return The value of the column 'PRINTERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrinterno() {
        checkSpecifiedProperty("printerno");
        return convertEmptyToNull(_printerno);
    }

    /**
     * [set] PRINTERNO: {varchar(255)} <br>
     * 号機
     * @param printerno The value of the column 'PRINTERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrinterno(String printerno) {
        registerModifiedProperty("printerno");
        _printerno = printerno;
    }

    /**
     * [get] MAKENO: {varchar(255)} <br>
     * 生出番号
     * @return The value of the column 'MAKENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMakeno() {
        checkSpecifiedProperty("makeno");
        return convertEmptyToNull(_makeno);
    }

    /**
     * [set] MAKENO: {varchar(255)} <br>
     * 生出番号
     * @param makeno The value of the column 'MAKENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMakeno(String makeno) {
        registerModifiedProperty("makeno");
        _makeno = makeno;
    }

    /**
     * [get] LOT4: {varchar(255)} <br>
     * 年月日
     * @return The value of the column 'LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot4() {
        checkSpecifiedProperty("lot4");
        return convertEmptyToNull(_lot4);
    }

    /**
     * [set] LOT4: {varchar(255)} <br>
     * 年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot4(String lot4) {
        registerModifiedProperty("lot4");
        _lot4 = lot4;
    }

    /**
     * [get] MAKETIME: {varchar(255)} <br>
     * 日付時刻
     * @return The value of the column 'MAKETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMaketime() {
        checkSpecifiedProperty("maketime");
        return convertEmptyToNull(_maketime);
    }

    /**
     * [set] MAKETIME: {varchar(255)} <br>
     * 日付時刻
     * @param maketime The value of the column 'MAKETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaketime(String maketime) {
        registerModifiedProperty("maketime");
        _maketime = maketime;
    }

    /**
     * [get] TRANSPORTCD: {varchar(255)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportcd() {
        checkSpecifiedProperty("transportcd");
        return convertEmptyToNull(_transportcd);
    }

    /**
     * [set] TRANSPORTCD: {varchar(255)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportcd(String transportcd) {
        registerModifiedProperty("transportcd");
        _transportcd = transportcd;
    }

    /**
     * [get] DISTRIBUTIONCD: {varchar(255)} <br>
     * 流通識別
     * @return The value of the column 'DISTRIBUTIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistributioncd() {
        checkSpecifiedProperty("distributioncd");
        return convertEmptyToNull(_distributioncd);
    }

    /**
     * [set] DISTRIBUTIONCD: {varchar(255)} <br>
     * 流通識別
     * @param distributioncd The value of the column 'DISTRIBUTIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistributioncd(String distributioncd) {
        registerModifiedProperty("distributioncd");
        _distributioncd = distributioncd;
    }

    /**
     * [get] PALLETID: {varchar(255)} <br>
     * パレットID
     * @return The value of the column 'PALLETID'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletid() {
        checkSpecifiedProperty("palletid");
        return convertEmptyToNull(_palletid);
    }

    /**
     * [set] PALLETID: {varchar(255)} <br>
     * パレットID
     * @param palletid The value of the column 'PALLETID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletid(String palletid) {
        registerModifiedProperty("palletid");
        _palletid = palletid;
    }

    /**
     * [get] INITNUM: {varchar(255)} <br>
     * 入庫時数量
     * @return The value of the column 'INITNUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getInitnum() {
        checkSpecifiedProperty("initnum");
        return convertEmptyToNull(_initnum);
    }

    /**
     * [set] INITNUM: {varchar(255)} <br>
     * 入庫時数量
     * @param initnum The value of the column 'INITNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInitnum(String initnum) {
        registerModifiedProperty("initnum");
        _initnum = initnum;
    }

    /**
     * [get] CREATEDATETIME: {varchar(255)} <br>
     * 情報作成日
     * @return The value of the column 'CREATEDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreatedatetime() {
        checkSpecifiedProperty("createdatetime");
        return convertEmptyToNull(_createdatetime);
    }

    /**
     * [set] CREATEDATETIME: {varchar(255)} <br>
     * 情報作成日
     * @param createdatetime The value of the column 'CREATEDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreatedatetime(String createdatetime) {
        registerModifiedProperty("createdatetime");
        _createdatetime = createdatetime;
    }

    /**
     * [get] ASSORTDATETIME: {varchar(255)} <br>
     * 仕分年月日
     * @return The value of the column 'ASSORTDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortdatetime() {
        checkSpecifiedProperty("assortdatetime");
        return convertEmptyToNull(_assortdatetime);
    }

    /**
     * [set] ASSORTDATETIME: {varchar(255)} <br>
     * 仕分年月日
     * @param assortdatetime The value of the column 'ASSORTDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortdatetime(String assortdatetime) {
        registerModifiedProperty("assortdatetime");
        _assortdatetime = assortdatetime;
    }

    /**
     * [get] TRACETYPE: {varchar(255)} <br>
     * 追跡区分
     * @return The value of the column 'TRACETYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTracetype() {
        checkSpecifiedProperty("tracetype");
        return convertEmptyToNull(_tracetype);
    }

    /**
     * [set] TRACETYPE: {varchar(255)} <br>
     * 追跡区分
     * @param tracetype The value of the column 'TRACETYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTracetype(String tracetype) {
        registerModifiedProperty("tracetype");
        _tracetype = tracetype;
    }

    /**
     * [get] TRACETYPENAME: {varchar(255)} <br>
     * 追跡区分名称
     * @return The value of the column 'TRACETYPENAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getTracetypename() {
        checkSpecifiedProperty("tracetypename");
        return convertEmptyToNull(_tracetypename);
    }

    /**
     * [set] TRACETYPENAME: {varchar(255)} <br>
     * 追跡区分名称
     * @param tracetypename The value of the column 'TRACETYPENAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTracetypename(String tracetypename) {
        registerModifiedProperty("tracetypename");
        _tracetypename = tracetypename;
    }

    /**
     * [get] LINEBLOCK: {varchar(255)} <br>
     * ラインブロック
     * @return The value of the column 'LINEBLOCK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineblock() {
        checkSpecifiedProperty("lineblock");
        return convertEmptyToNull(_lineblock);
    }

    /**
     * [set] LINEBLOCK: {varchar(255)} <br>
     * ラインブロック
     * @param lineblock The value of the column 'LINEBLOCK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineblock(String lineblock) {
        registerModifiedProperty("lineblock");
        _lineblock = lineblock;
    }

    /**
     * [get] ASSORTEDUNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'ASSORTEDUNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortedunit() {
        checkSpecifiedProperty("assortedunit");
        return convertEmptyToNull(_assortedunit);
    }

    /**
     * [set] ASSORTEDUNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @param assortedunit The value of the column 'ASSORTEDUNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortedunit(String assortedunit) {
        registerModifiedProperty("assortedunit");
        _assortedunit = assortedunit;
    }

    /**
     * [get] ASSORTEDINDEX: {varchar(255)} <br>
     * 投入順
     * @return The value of the column 'ASSORTEDINDEX'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortedindex() {
        checkSpecifiedProperty("assortedindex");
        return convertEmptyToNull(_assortedindex);
    }

    /**
     * [set] ASSORTEDINDEX: {varchar(255)} <br>
     * 投入順
     * @param assortedindex The value of the column 'ASSORTEDINDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortedindex(String assortedindex) {
        registerModifiedProperty("assortedindex");
        _assortedindex = assortedindex;
    }

    /**
     * [get] OPERATIONCODE: {varchar(255)} <br>
     * 操作数量符号
     * @return The value of the column 'OPERATIONCODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOperationcode() {
        checkSpecifiedProperty("operationcode");
        return convertEmptyToNull(_operationcode);
    }

    /**
     * [set] OPERATIONCODE: {varchar(255)} <br>
     * 操作数量符号
     * @param operationcode The value of the column 'OPERATIONCODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOperationcode(String operationcode) {
        registerModifiedProperty("operationcode");
        _operationcode = operationcode;
    }

    /**
     * [get] CASEINNUM: {varchar(255)} <br>
     * ケース内数量
     * @return The value of the column 'CASEINNUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseinnum() {
        checkSpecifiedProperty("caseinnum");
        return convertEmptyToNull(_caseinnum);
    }

    /**
     * [set] CASEINNUM: {varchar(255)} <br>
     * ケース内数量
     * @param caseinnum The value of the column 'CASEINNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseinnum(String caseinnum) {
        registerModifiedProperty("caseinnum");
        _caseinnum = caseinnum;
    }

    /**
     * [get] ASSORTNUM: {varchar(255)} <br>
     * 仕分数量
     * @return The value of the column 'ASSORTNUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortnum() {
        checkSpecifiedProperty("assortnum");
        return convertEmptyToNull(_assortnum);
    }

    /**
     * [set] ASSORTNUM: {varchar(255)} <br>
     * 仕分数量
     * @param assortnum The value of the column 'ASSORTNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortnum(String assortnum) {
        registerModifiedProperty("assortnum");
        _assortnum = assortnum;
    }

    /**
     * [get] ASSORTDIFNUM: {varchar(255)} <br>
     * 差異不良数量
     * @return The value of the column 'ASSORTDIFNUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortdifnum() {
        checkSpecifiedProperty("assortdifnum");
        return convertEmptyToNull(_assortdifnum);
    }

    /**
     * [set] ASSORTDIFNUM: {varchar(255)} <br>
     * 差異不良数量
     * @param assortdifnum The value of the column 'ASSORTDIFNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortdifnum(String assortdifnum) {
        registerModifiedProperty("assortdifnum");
        _assortdifnum = assortdifnum;
    }

    /**
     * [get] DIRECTIONCD: {varchar(255)} <br>
     * 方面CD
     * @return The value of the column 'DIRECTIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectioncd() {
        checkSpecifiedProperty("directioncd");
        return convertEmptyToNull(_directioncd);
    }

    /**
     * [set] DIRECTIONCD: {varchar(255)} <br>
     * 方面CD
     * @param directioncd The value of the column 'DIRECTIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectioncd(String directioncd) {
        registerModifiedProperty("directioncd");
        _directioncd = directioncd;
    }

    /**
     * [get] PISTONTYPE: {varchar(255)} <br>
     * ピストン区分
     * @return The value of the column 'PISTONTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPistontype() {
        checkSpecifiedProperty("pistontype");
        return convertEmptyToNull(_pistontype);
    }

    /**
     * [set] PISTONTYPE: {varchar(255)} <br>
     * ピストン区分
     * @param pistontype The value of the column 'PISTONTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPistontype(String pistontype) {
        registerModifiedProperty("pistontype");
        _pistontype = pistontype;
    }

    /**
     * [get] CUSTOMERCD: {varchar(255)} <br>
     * お得意様CD
     * @return The value of the column 'CUSTOMERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomercd() {
        checkSpecifiedProperty("customercd");
        return convertEmptyToNull(_customercd);
    }

    /**
     * [set] CUSTOMERCD: {varchar(255)} <br>
     * お得意様CD
     * @param customercd The value of the column 'CUSTOMERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomercd(String customercd) {
        registerModifiedProperty("customercd");
        _customercd = customercd;
    }

    /**
     * [get] DIRECTIONNUM: {varchar(255)} <br>
     * さしず数量
     * @return The value of the column 'DIRECTIONNUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectionnum() {
        checkSpecifiedProperty("directionnum");
        return convertEmptyToNull(_directionnum);
    }

    /**
     * [set] DIRECTIONNUM: {varchar(255)} <br>
     * さしず数量
     * @param directionnum The value of the column 'DIRECTIONNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionnum(String directionnum) {
        registerModifiedProperty("directionnum");
        _directionnum = directionnum;
    }

    /**
     * [get] DISTWAREHOUSECD: {varchar(255)} <br>
     * 融通先拠点CD
     * @return The value of the column 'DISTWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistwarehousecd() {
        checkSpecifiedProperty("distwarehousecd");
        return convertEmptyToNull(_distwarehousecd);
    }

    /**
     * [set] DISTWAREHOUSECD: {varchar(255)} <br>
     * 融通先拠点CD
     * @param distwarehousecd The value of the column 'DISTWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistwarehousecd(String distwarehousecd) {
        registerModifiedProperty("distwarehousecd");
        _distwarehousecd = distwarehousecd;
    }

    /**
     * [get] DISTWAREHOUSENAME: {varchar(255)} <br>
     * 融通先拠点名称
     * @return The value of the column 'DISTWAREHOUSENAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistwarehousename() {
        checkSpecifiedProperty("distwarehousename");
        return convertEmptyToNull(_distwarehousename);
    }

    /**
     * [set] DISTWAREHOUSENAME: {varchar(255)} <br>
     * 融通先拠点名称
     * @param distwarehousename The value of the column 'DISTWAREHOUSENAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistwarehousename(String distwarehousename) {
        registerModifiedProperty("distwarehousename");
        _distwarehousename = distwarehousename;
    }

    /**
     * [get] INV_NUM: {varchar(255)} <br>
     * 倉庫内数量符号(保管場)
     * @return The value of the column 'INV_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvNum() {
        checkSpecifiedProperty("invNum");
        return convertEmptyToNull(_invNum);
    }

    /**
     * [set] INV_NUM: {varchar(255)} <br>
     * 倉庫内数量符号(保管場)
     * @param invNum The value of the column 'INV_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvNum(String invNum) {
        registerModifiedProperty("invNum");
        _invNum = invNum;
    }

    /**
     * [get] SORT_NUM: {varchar(255)} <br>
     * 倉庫内数量符号(仕分場)
     * @return The value of the column 'SORT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortNum() {
        checkSpecifiedProperty("sortNum");
        return convertEmptyToNull(_sortNum);
    }

    /**
     * [set] SORT_NUM: {varchar(255)} <br>
     * 倉庫内数量符号(仕分場)
     * @param sortNum The value of the column 'SORT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortNum(String sortNum) {
        registerModifiedProperty("sortNum");
        _sortNum = sortNum;
    }

    /**
     * [get] ADOPT_NUM: {varchar(255)} <br>
     * 倉庫内数量符号(引取場)
     * @return The value of the column 'ADOPT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAdoptNum() {
        checkSpecifiedProperty("adoptNum");
        return convertEmptyToNull(_adoptNum);
    }

    /**
     * [set] ADOPT_NUM: {varchar(255)} <br>
     * 倉庫内数量符号(引取場)
     * @param adoptNum The value of the column 'ADOPT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdoptNum(String adoptNum) {
        registerModifiedProperty("adoptNum");
        _adoptNum = adoptNum;
    }

    /**
     * [get] WH_ITEMCD: {varchar(255)} <br>
     * 倉庫内銘柄CD
     * @return The value of the column 'WH_ITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWhItemcd() {
        checkSpecifiedProperty("whItemcd");
        return convertEmptyToNull(_whItemcd);
    }

    /**
     * [set] WH_ITEMCD: {varchar(255)} <br>
     * 倉庫内銘柄CD
     * @param whItemcd The value of the column 'WH_ITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWhItemcd(String whItemcd) {
        registerModifiedProperty("whItemcd");
        _whItemcd = whItemcd;
    }

    /**
     * [get] WH_ITEMNAME: {varchar(255)} <br>
     * 倉庫内名称名称
     * @return The value of the column 'WH_ITEMNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getWhItemname() {
        checkSpecifiedProperty("whItemname");
        return convertEmptyToNull(_whItemname);
    }

    /**
     * [set] WH_ITEMNAME: {varchar(255)} <br>
     * 倉庫内名称名称
     * @param whItemname The value of the column 'WH_ITEMNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWhItemname(String whItemname) {
        registerModifiedProperty("whItemname");
        _whItemname = whItemname;
    }

    /**
     * [get] WH_DESIGNCD: {varchar(255)} <br>
     * 倉庫内デザイン区分
     * @return The value of the column 'WH_DESIGNCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWhDesigncd() {
        checkSpecifiedProperty("whDesigncd");
        return convertEmptyToNull(_whDesigncd);
    }

    /**
     * [set] WH_DESIGNCD: {varchar(255)} <br>
     * 倉庫内デザイン区分
     * @param whDesigncd The value of the column 'WH_DESIGNCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWhDesigncd(String whDesigncd) {
        registerModifiedProperty("whDesigncd");
        _whDesigncd = whDesigncd;
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
