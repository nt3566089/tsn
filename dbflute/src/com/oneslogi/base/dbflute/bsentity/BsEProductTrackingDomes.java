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
 * The entity of E_PRODUCT_TRACKING_DOMES as TABLE. <br>
 * 製品追跡情報送信テーブル(日次)(国産)
 * <pre>
 * [primary-key]
 *     PRODUCT_TRACKING_DOMES_ID
 *
 * [column]
 *     PRODUCT_TRACKING_DOMES_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, USERNUM1, ITEM_ADMIN, TRACEKEY, WAREHOUSECD, FACTORYCD, PRODUCT_CD, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO, MACHINEMO, CREATENO, LIMITDATE, DATETIME, DISTRIBUTIONCD, TRANSPORTCD, PALLETID, INITNUM, CREATEDATETIME, ASSORTDATETIME, TRACETYPE, LINEBLOCK, ASSORTEDUNIT, ASSORTEDINDEX, OPERATIONCODE, CASEINNUM, ASSORTNUM, ASSORTDIFNUM, DIRECTIONCD, PISTONTYPE, CUSTOMERCD, DIRECTIONNUM, DISTWAREHOUSECD, RCVKEY, ITEMCD_WH, DESIGNCD, INV_NUM, SORT_NUM, ADOPT_NUM, DT_EXTDATA2, RESERVEAREA, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_TRACKING_DOMES_ID
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
 * Long productTrackingDomesId = entity.getProductTrackingDomesId();
 * String sendCd = entity.getSendCd();
 * Long sendRowId = entity.getSendRowId();
 * String workFlg = entity.getWorkFlg();
 * String usernum1 = entity.getUsernum1();
 * String itemAdmin = entity.getItemAdmin();
 * String tracekey = entity.getTracekey();
 * String warehousecd = entity.getWarehousecd();
 * String factorycd = entity.getFactorycd();
 * String productCd = entity.getProductCd();
 * String skucd = entity.getSkucd();
 * String destinationcd = entity.getDestinationcd();
 * String manufacturecd = entity.getManufacturecd();
 * String orderno = entity.getOrderno();
 * String machinemo = entity.getMachinemo();
 * String createno = entity.getCreateno();
 * String limitdate = entity.getLimitdate();
 * String datetime = entity.getDatetime();
 * String distributioncd = entity.getDistributioncd();
 * String transportcd = entity.getTransportcd();
 * String palletid = entity.getPalletid();
 * String initnum = entity.getInitnum();
 * String createdatetime = entity.getCreatedatetime();
 * String assortdatetime = entity.getAssortdatetime();
 * String tracetype = entity.getTracetype();
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
 * String rcvkey = entity.getRcvkey();
 * String itemcdWh = entity.getItemcdWh();
 * String designcd = entity.getDesigncd();
 * String invNum = entity.getInvNum();
 * String sortNum = entity.getSortNum();
 * String adoptNum = entity.getAdoptNum();
 * String dtExtdata2 = entity.getDtExtdata2();
 * String reservearea = entity.getReservearea();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setProductTrackingDomesId(productTrackingDomesId);
 * entity.setSendCd(sendCd);
 * entity.setSendRowId(sendRowId);
 * entity.setWorkFlg(workFlg);
 * entity.setUsernum1(usernum1);
 * entity.setItemAdmin(itemAdmin);
 * entity.setTracekey(tracekey);
 * entity.setWarehousecd(warehousecd);
 * entity.setFactorycd(factorycd);
 * entity.setProductCd(productCd);
 * entity.setSkucd(skucd);
 * entity.setDestinationcd(destinationcd);
 * entity.setManufacturecd(manufacturecd);
 * entity.setOrderno(orderno);
 * entity.setMachinemo(machinemo);
 * entity.setCreateno(createno);
 * entity.setLimitdate(limitdate);
 * entity.setDatetime(datetime);
 * entity.setDistributioncd(distributioncd);
 * entity.setTransportcd(transportcd);
 * entity.setPalletid(palletid);
 * entity.setInitnum(initnum);
 * entity.setCreatedatetime(createdatetime);
 * entity.setAssortdatetime(assortdatetime);
 * entity.setTracetype(tracetype);
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
 * entity.setRcvkey(rcvkey);
 * entity.setItemcdWh(itemcdWh);
 * entity.setDesigncd(designcd);
 * entity.setInvNum(invNum);
 * entity.setSortNum(sortNum);
 * entity.setAdoptNum(adoptNum);
 * entity.setDtExtdata2(dtExtdata2);
 * entity.setReservearea(reservearea);
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
public abstract class BsEProductTrackingDomes extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _productTrackingDomesId;

    /** SEND_CD: {NotNull, varchar(30)} */
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1)} */
    protected String _workFlg;

    /** USERNUM1: {varchar(30)} */
    protected String _usernum1;

    /** ITEM_ADMIN: {varchar(30)} */
    protected String _itemAdmin;

    /** TRACEKEY: {varchar(255)} */
    protected String _tracekey;

    /** WAREHOUSECD: {varchar(255)} */
    protected String _warehousecd;

    /** FACTORYCD: {varchar(255)} */
    protected String _factorycd;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** SKUCD: {varchar(255)} */
    protected String _skucd;

    /** DESTINATIONCD: {varchar(255)} */
    protected String _destinationcd;

    /** MANUFACTURECD: {varchar(255)} */
    protected String _manufacturecd;

    /** ORDERNO: {varchar(255)} */
    protected String _orderno;

    /** MACHINEMO: {varchar(255)} */
    protected String _machinemo;

    /** CREATENO: {varchar(255)} */
    protected String _createno;

    /** LIMITDATE: {varchar(255)} */
    protected String _limitdate;

    /** DATETIME: {varchar(255)} */
    protected String _datetime;

    /** DISTRIBUTIONCD: {varchar(255)} */
    protected String _distributioncd;

    /** TRANSPORTCD: {varchar(255)} */
    protected String _transportcd;

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

    /** RCVKEY: {varchar(255)} */
    protected String _rcvkey;

    /** ITEMCD_WH: {varchar(255)} */
    protected String _itemcdWh;

    /** DESIGNCD: {varchar(255)} */
    protected String _designcd;

    /** INV_NUM: {varchar(255)} */
    protected String _invNum;

    /** SORT_NUM: {varchar(255)} */
    protected String _sortNum;

    /** ADOPT_NUM: {varchar(255)} */
    protected String _adoptNum;

    /** DT_EXTDATA2: {varchar(255)} */
    protected String _dtExtdata2;

    /** RESERVEAREA: {varchar(255)} */
    protected String _reservearea;

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
        return "E_PRODUCT_TRACKING_DOMES";
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
        if (_productTrackingDomesId == null) { return false; }
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
        if (obj instanceof BsEProductTrackingDomes) {
            BsEProductTrackingDomes other = (BsEProductTrackingDomes)obj;
            if (!xSV(_productTrackingDomesId, other._productTrackingDomesId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productTrackingDomesId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productTrackingDomesId));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendRowId));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_usernum1));
        sb.append(dm).append(xfND(_itemAdmin));
        sb.append(dm).append(xfND(_tracekey));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_factorycd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_skucd));
        sb.append(dm).append(xfND(_destinationcd));
        sb.append(dm).append(xfND(_manufacturecd));
        sb.append(dm).append(xfND(_orderno));
        sb.append(dm).append(xfND(_machinemo));
        sb.append(dm).append(xfND(_createno));
        sb.append(dm).append(xfND(_limitdate));
        sb.append(dm).append(xfND(_datetime));
        sb.append(dm).append(xfND(_distributioncd));
        sb.append(dm).append(xfND(_transportcd));
        sb.append(dm).append(xfND(_palletid));
        sb.append(dm).append(xfND(_initnum));
        sb.append(dm).append(xfND(_createdatetime));
        sb.append(dm).append(xfND(_assortdatetime));
        sb.append(dm).append(xfND(_tracetype));
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
        sb.append(dm).append(xfND(_rcvkey));
        sb.append(dm).append(xfND(_itemcdWh));
        sb.append(dm).append(xfND(_designcd));
        sb.append(dm).append(xfND(_invNum));
        sb.append(dm).append(xfND(_sortNum));
        sb.append(dm).append(xfND(_adoptNum));
        sb.append(dm).append(xfND(_dtExtdata2));
        sb.append(dm).append(xfND(_reservearea));
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
    public EProductTrackingDomes clone() {
        return (EProductTrackingDomes)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製品追跡情報送信(日次)(国産)ID
     * @return The value of the column 'PRODUCT_TRACKING_DOMES_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductTrackingDomesId() {
        checkSpecifiedProperty("productTrackingDomesId");
        return _productTrackingDomesId;
    }

    /**
     * [set] PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製品追跡情報送信(日次)(国産)ID
     * @param productTrackingDomesId The value of the column 'PRODUCT_TRACKING_DOMES_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductTrackingDomesId(Long productTrackingDomesId) {
        registerModifiedProperty("productTrackingDomesId");
        _productTrackingDomesId = productTrackingDomesId;
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
     * [get] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSendRowId() {
        checkSpecifiedProperty("sendRowId");
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSendRowId(Long sendRowId) {
        registerModifiedProperty("sendRowId");
        _sendRowId = sendRowId;
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
     * [get] USERNUM1: {varchar(30)} <br>
     * 国産・輸入区分
     * @return The value of the column 'USERNUM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getUsernum1() {
        checkSpecifiedProperty("usernum1");
        return convertEmptyToNull(_usernum1);
    }

    /**
     * [set] USERNUM1: {varchar(30)} <br>
     * 国産・輸入区分
     * @param usernum1 The value of the column 'USERNUM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum1(String usernum1) {
        registerModifiedProperty("usernum1");
        _usernum1 = usernum1;
    }

    /**
     * [get] ITEM_ADMIN: {varchar(30)} <br>
     * 銘柄管理社
     * @return The value of the column 'ITEM_ADMIN'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemAdmin() {
        checkSpecifiedProperty("itemAdmin");
        return convertEmptyToNull(_itemAdmin);
    }

    /**
     * [set] ITEM_ADMIN: {varchar(30)} <br>
     * 銘柄管理社
     * @param itemAdmin The value of the column 'ITEM_ADMIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemAdmin(String itemAdmin) {
        registerModifiedProperty("itemAdmin");
        _itemAdmin = itemAdmin;
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
     * [get] DESTINATIONCD: {varchar(255)} <br>
     * 仕向地CD
     * @return The value of the column 'DESTINATIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationcd() {
        checkSpecifiedProperty("destinationcd");
        return convertEmptyToNull(_destinationcd);
    }

    /**
     * [set] DESTINATIONCD: {varchar(255)} <br>
     * 仕向地CD
     * @param destinationcd The value of the column 'DESTINATIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationcd(String destinationcd) {
        registerModifiedProperty("destinationcd");
        _destinationcd = destinationcd;
    }

    /**
     * [get] MANUFACTURECD: {varchar(255)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufacturecd() {
        checkSpecifiedProperty("manufacturecd");
        return convertEmptyToNull(_manufacturecd);
    }

    /**
     * [set] MANUFACTURECD: {varchar(255)} <br>
     * 製造記号
     * @param manufacturecd The value of the column 'MANUFACTURECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufacturecd(String manufacturecd) {
        registerModifiedProperty("manufacturecd");
        _manufacturecd = manufacturecd;
    }

    /**
     * [get] ORDERNO: {varchar(255)} <br>
     * 発注記号
     * @return The value of the column 'ORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderno() {
        checkSpecifiedProperty("orderno");
        return convertEmptyToNull(_orderno);
    }

    /**
     * [set] ORDERNO: {varchar(255)} <br>
     * 発注記号
     * @param orderno The value of the column 'ORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderno(String orderno) {
        registerModifiedProperty("orderno");
        _orderno = orderno;
    }

    /**
     * [get] MACHINEMO: {varchar(255)} <br>
     * 号機
     * @return The value of the column 'MACHINEMO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMachinemo() {
        checkSpecifiedProperty("machinemo");
        return convertEmptyToNull(_machinemo);
    }

    /**
     * [set] MACHINEMO: {varchar(255)} <br>
     * 号機
     * @param machinemo The value of the column 'MACHINEMO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMachinemo(String machinemo) {
        registerModifiedProperty("machinemo");
        _machinemo = machinemo;
    }

    /**
     * [get] CREATENO: {varchar(255)} <br>
     * 生出番号
     * @return The value of the column 'CREATENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreateno() {
        checkSpecifiedProperty("createno");
        return convertEmptyToNull(_createno);
    }

    /**
     * [set] CREATENO: {varchar(255)} <br>
     * 生出番号
     * @param createno The value of the column 'CREATENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateno(String createno) {
        registerModifiedProperty("createno");
        _createno = createno;
    }

    /**
     * [get] LIMITDATE: {varchar(255)} <br>
     * 年月日
     * @return The value of the column 'LIMITDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitdate() {
        checkSpecifiedProperty("limitdate");
        return convertEmptyToNull(_limitdate);
    }

    /**
     * [set] LIMITDATE: {varchar(255)} <br>
     * 年月日
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitdate(String limitdate) {
        registerModifiedProperty("limitdate");
        _limitdate = limitdate;
    }

    /**
     * [get] DATETIME: {varchar(255)} <br>
     * 日付時刻
     * @return The value of the column 'DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDatetime() {
        checkSpecifiedProperty("datetime");
        return convertEmptyToNull(_datetime);
    }

    /**
     * [set] DATETIME: {varchar(255)} <br>
     * 日付時刻
     * @param datetime The value of the column 'DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDatetime(String datetime) {
        registerModifiedProperty("datetime");
        _datetime = datetime;
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
     * 作成年月日
     * @return The value of the column 'CREATEDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreatedatetime() {
        checkSpecifiedProperty("createdatetime");
        return convertEmptyToNull(_createdatetime);
    }

    /**
     * [set] CREATEDATETIME: {varchar(255)} <br>
     * 作成年月日
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
     * 融通先CD
     * @return The value of the column 'DISTWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistwarehousecd() {
        checkSpecifiedProperty("distwarehousecd");
        return convertEmptyToNull(_distwarehousecd);
    }

    /**
     * [set] DISTWAREHOUSECD: {varchar(255)} <br>
     * 融通先CD
     * @param distwarehousecd The value of the column 'DISTWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistwarehousecd(String distwarehousecd) {
        registerModifiedProperty("distwarehousecd");
        _distwarehousecd = distwarehousecd;
    }

    /**
     * [get] RCVKEY: {varchar(255)} <br>
     * 入庫キー
     * @return The value of the column 'RCVKEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvkey() {
        checkSpecifiedProperty("rcvkey");
        return convertEmptyToNull(_rcvkey);
    }

    /**
     * [set] RCVKEY: {varchar(255)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvkey(String rcvkey) {
        registerModifiedProperty("rcvkey");
        _rcvkey = rcvkey;
    }

    /**
     * [get] ITEMCD_WH: {varchar(255)} <br>
     * 倉庫内銘柄CD
     * @return The value of the column 'ITEMCD_WH'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcdWh() {
        checkSpecifiedProperty("itemcdWh");
        return convertEmptyToNull(_itemcdWh);
    }

    /**
     * [set] ITEMCD_WH: {varchar(255)} <br>
     * 倉庫内銘柄CD
     * @param itemcdWh The value of the column 'ITEMCD_WH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcdWh(String itemcdWh) {
        registerModifiedProperty("itemcdWh");
        _itemcdWh = itemcdWh;
    }

    /**
     * [get] DESIGNCD: {varchar(255)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncd() {
        checkSpecifiedProperty("designcd");
        return convertEmptyToNull(_designcd);
    }

    /**
     * [set] DESIGNCD: {varchar(255)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DESIGNCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncd(String designcd) {
        registerModifiedProperty("designcd");
        _designcd = designcd;
    }

    /**
     * [get] INV_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳(保管場)
     * @return The value of the column 'INV_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvNum() {
        checkSpecifiedProperty("invNum");
        return convertEmptyToNull(_invNum);
    }

    /**
     * [set] INV_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳(保管場)
     * @param invNum The value of the column 'INV_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvNum(String invNum) {
        registerModifiedProperty("invNum");
        _invNum = invNum;
    }

    /**
     * [get] SORT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳(仕分場)
     * @return The value of the column 'SORT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortNum() {
        checkSpecifiedProperty("sortNum");
        return convertEmptyToNull(_sortNum);
    }

    /**
     * [set] SORT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳(仕分場)
     * @param sortNum The value of the column 'SORT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortNum(String sortNum) {
        registerModifiedProperty("sortNum");
        _sortNum = sortNum;
    }

    /**
     * [get] ADOPT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳(引取場)
     * @return The value of the column 'ADOPT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAdoptNum() {
        checkSpecifiedProperty("adoptNum");
        return convertEmptyToNull(_adoptNum);
    }

    /**
     * [set] ADOPT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳(引取場)
     * @param adoptNum The value of the column 'ADOPT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdoptNum(String adoptNum) {
        registerModifiedProperty("adoptNum");
        _adoptNum = adoptNum;
    }

    /**
     * [get] DT_EXTDATA2: {varchar(255)} <br>
     * 配達年月日
     * @return The value of the column 'DT_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata2() {
        checkSpecifiedProperty("dtExtdata2");
        return convertEmptyToNull(_dtExtdata2);
    }

    /**
     * [set] DT_EXTDATA2: {varchar(255)} <br>
     * 配達年月日
     * @param dtExtdata2 The value of the column 'DT_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata2(String dtExtdata2) {
        registerModifiedProperty("dtExtdata2");
        _dtExtdata2 = dtExtdata2;
    }

    /**
     * [get] RESERVEAREA: {varchar(255)} <br>
     * 予備領域
     * @return The value of the column 'RESERVEAREA'. (NullAllowed even if selected: for no constraint)
     */
    public String getReservearea() {
        checkSpecifiedProperty("reservearea");
        return convertEmptyToNull(_reservearea);
    }

    /**
     * [set] RESERVEAREA: {varchar(255)} <br>
     * 予備領域
     * @param reservearea The value of the column 'RESERVEAREA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReservearea(String reservearea) {
        registerModifiedProperty("reservearea");
        _reservearea = reservearea;
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
