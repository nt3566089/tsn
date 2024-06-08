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
 * The entity of E_STOCKINFOIMPORT as TABLE. <br>
 * 在庫情報送信テーブル
 * <pre>
 * [primary-key]
 *     CENTER_STOCK_INFO_SEND_ID
 *
 * [column]
 *     CENTER_STOCK_INFO_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, SEQNO, ADDDATETIME, WAREHOUSECD, WAREHOUSE_SNAME, PRODUCT_CD, ITEM_NAME, LIMITDATE, DESIGN_CD, OTHERLOT1, ADDRESS3, QTY1, REFNO, FIRMCARRYNO, MANUFACTURECD, SOURCE_CD, SOURCE_NAME, SHIPSCHDATE, SCHRECEIVE_DATE, SCHRECEIVE_NUM, TRANSPORT_PRIORITY, ITEM_ORDERBY, USETYPE, LOCGROUP, LOCGROUPNAME, OTHERREFNO1, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_STOCK_INFO_SEND_ID
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
 * Long centerStockInfoSendId = entity.getCenterStockInfoSendId();
 * String sendCd = entity.getSendCd();
 * Long sendRowId = entity.getSendRowId();
 * String workFlg = entity.getWorkFlg();
 * String seqno = entity.getSeqno();
 * String adddatetime = entity.getAdddatetime();
 * String warehousecd = entity.getWarehousecd();
 * String warehouseSname = entity.getWarehouseSname();
 * String productCd = entity.getProductCd();
 * String itemName = entity.getItemName();
 * String limitdate = entity.getLimitdate();
 * String designCd = entity.getDesignCd();
 * String otherlot1 = entity.getOtherlot1();
 * String address3 = entity.getAddress3();
 * String qty1 = entity.getQty1();
 * String refno = entity.getRefno();
 * String firmcarryno = entity.getFirmcarryno();
 * String manufacturecd = entity.getManufacturecd();
 * String sourceCd = entity.getSourceCd();
 * String sourceName = entity.getSourceName();
 * String shipschdate = entity.getShipschdate();
 * String schreceiveDate = entity.getSchreceiveDate();
 * String schreceiveNum = entity.getSchreceiveNum();
 * String transportPriority = entity.getTransportPriority();
 * String itemOrderby = entity.getItemOrderby();
 * String usetype = entity.getUsetype();
 * String locgroup = entity.getLocgroup();
 * String locgroupname = entity.getLocgroupname();
 * String otherrefno1 = entity.getOtherrefno1();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCenterStockInfoSendId(centerStockInfoSendId);
 * entity.setSendCd(sendCd);
 * entity.setSendRowId(sendRowId);
 * entity.setWorkFlg(workFlg);
 * entity.setSeqno(seqno);
 * entity.setAdddatetime(adddatetime);
 * entity.setWarehousecd(warehousecd);
 * entity.setWarehouseSname(warehouseSname);
 * entity.setProductCd(productCd);
 * entity.setItemName(itemName);
 * entity.setLimitdate(limitdate);
 * entity.setDesignCd(designCd);
 * entity.setOtherlot1(otherlot1);
 * entity.setAddress3(address3);
 * entity.setQty1(qty1);
 * entity.setRefno(refno);
 * entity.setFirmcarryno(firmcarryno);
 * entity.setManufacturecd(manufacturecd);
 * entity.setSourceCd(sourceCd);
 * entity.setSourceName(sourceName);
 * entity.setShipschdate(shipschdate);
 * entity.setSchreceiveDate(schreceiveDate);
 * entity.setSchreceiveNum(schreceiveNum);
 * entity.setTransportPriority(transportPriority);
 * entity.setItemOrderby(itemOrderby);
 * entity.setUsetype(usetype);
 * entity.setLocgroup(locgroup);
 * entity.setLocgroupname(locgroupname);
 * entity.setOtherrefno1(otherrefno1);
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
public abstract class BsEStockinfoimport extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _centerStockInfoSendId;

    /** SEND_CD: {NotNull, varchar(30)} */
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1), default=[0]} */
    protected String _workFlg;

    /** SEQNO: {varchar(255)} */
    protected String _seqno;

    /** ADDDATETIME: {varchar(255)} */
    protected String _adddatetime;

    /** WAREHOUSECD: {varchar(255)} */
    protected String _warehousecd;

    /** WAREHOUSE_SNAME: {varchar(255)} */
    protected String _warehouseSname;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** ITEM_NAME: {varchar(255)} */
    protected String _itemName;

    /** LIMITDATE: {varchar(255)} */
    protected String _limitdate;

    /** DESIGN_CD: {varchar(255)} */
    protected String _designCd;

    /** OTHERLOT1: {varchar(255)} */
    protected String _otherlot1;

    /** ADDRESS3: {varchar(255)} */
    protected String _address3;

    /** QTY1: {varchar(255)} */
    protected String _qty1;

    /** REFNO: {varchar(255)} */
    protected String _refno;

    /** FIRMCARRYNO: {varchar(255)} */
    protected String _firmcarryno;

    /** MANUFACTURECD: {varchar(255)} */
    protected String _manufacturecd;

    /** SOURCE_CD: {varchar(255)} */
    protected String _sourceCd;

    /** SOURCE_NAME: {varchar(255)} */
    protected String _sourceName;

    /** SHIPSCHDATE: {varchar(255)} */
    protected String _shipschdate;

    /** SCHRECEIVE_DATE: {varchar(255)} */
    protected String _schreceiveDate;

    /** SCHRECEIVE_NUM: {varchar(255)} */
    protected String _schreceiveNum;

    /** TRANSPORT_PRIORITY: {varchar(255)} */
    protected String _transportPriority;

    /** ITEM_ORDERBY: {varchar(255)} */
    protected String _itemOrderby;

    /** USETYPE: {varchar(255)} */
    protected String _usetype;

    /** LOCGROUP: {varchar(255)} */
    protected String _locgroup;

    /** LOCGROUPNAME: {varchar(255)} */
    protected String _locgroupname;

    /** OTHERREFNO1: {varchar(255)} */
    protected String _otherrefno1;

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
        return "E_STOCKINFOIMPORT";
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
        if (_centerStockInfoSendId == null) { return false; }
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
        if (obj instanceof BsEStockinfoimport) {
            BsEStockinfoimport other = (BsEStockinfoimport)obj;
            if (!xSV(_centerStockInfoSendId, other._centerStockInfoSendId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _centerStockInfoSendId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_centerStockInfoSendId));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendRowId));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_seqno));
        sb.append(dm).append(xfND(_adddatetime));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_warehouseSname));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_itemName));
        sb.append(dm).append(xfND(_limitdate));
        sb.append(dm).append(xfND(_designCd));
        sb.append(dm).append(xfND(_otherlot1));
        sb.append(dm).append(xfND(_address3));
        sb.append(dm).append(xfND(_qty1));
        sb.append(dm).append(xfND(_refno));
        sb.append(dm).append(xfND(_firmcarryno));
        sb.append(dm).append(xfND(_manufacturecd));
        sb.append(dm).append(xfND(_sourceCd));
        sb.append(dm).append(xfND(_sourceName));
        sb.append(dm).append(xfND(_shipschdate));
        sb.append(dm).append(xfND(_schreceiveDate));
        sb.append(dm).append(xfND(_schreceiveNum));
        sb.append(dm).append(xfND(_transportPriority));
        sb.append(dm).append(xfND(_itemOrderby));
        sb.append(dm).append(xfND(_usetype));
        sb.append(dm).append(xfND(_locgroup));
        sb.append(dm).append(xfND(_locgroupname));
        sb.append(dm).append(xfND(_otherrefno1));
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
    public EStockinfoimport clone() {
        return (EStockinfoimport)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫情報送信ID
     * @return The value of the column 'CENTER_STOCK_INFO_SEND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterStockInfoSendId() {
        checkSpecifiedProperty("centerStockInfoSendId");
        return _centerStockInfoSendId;
    }

    /**
     * [set] CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫情報送信ID
     * @param centerStockInfoSendId The value of the column 'CENTER_STOCK_INFO_SEND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterStockInfoSendId(Long centerStockInfoSendId) {
        registerModifiedProperty("centerStockInfoSendId");
        _centerStockInfoSendId = centerStockInfoSendId;
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
     * [get] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getWorkFlg() {
        checkSpecifiedProperty("workFlg");
        return convertEmptyToNull(_workFlg);
    }

    /**
     * [set] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setWorkFlg(String workFlg) {
        registerModifiedProperty("workFlg");
        _workFlg = workFlg;
    }

    /**
     * [get] SEQNO: {varchar(255)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSeqno() {
        checkSpecifiedProperty("seqno");
        return convertEmptyToNull(_seqno);
    }

    /**
     * [set] SEQNO: {varchar(255)} <br>
     * シーケンス番号
     * @param seqno The value of the column 'SEQNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSeqno(String seqno) {
        registerModifiedProperty("seqno");
        _seqno = seqno;
    }

    /**
     * [get] ADDDATETIME: {varchar(255)} <br>
     * 情報作成日
     * @return The value of the column 'ADDDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getAdddatetime() {
        checkSpecifiedProperty("adddatetime");
        return convertEmptyToNull(_adddatetime);
    }

    /**
     * [set] ADDDATETIME: {varchar(255)} <br>
     * 情報作成日
     * @param adddatetime The value of the column 'ADDDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdddatetime(String adddatetime) {
        registerModifiedProperty("adddatetime");
        _adddatetime = adddatetime;
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
     * [get] WAREHOUSE_SNAME: {varchar(255)} <br>
     * 拠点名称
     * @return The value of the column 'WAREHOUSE_SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseSname() {
        checkSpecifiedProperty("warehouseSname");
        return convertEmptyToNull(_warehouseSname);
    }

    /**
     * [set] WAREHOUSE_SNAME: {varchar(255)} <br>
     * 拠点名称
     * @param warehouseSname The value of the column 'WAREHOUSE_SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseSname(String warehouseSname) {
        registerModifiedProperty("warehouseSname");
        _warehouseSname = warehouseSname;
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
     * [get] ITEM_NAME: {varchar(255)} <br>
     * 銘柄名称
     * @return The value of the column 'ITEM_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemName() {
        checkSpecifiedProperty("itemName");
        return convertEmptyToNull(_itemName);
    }

    /**
     * [set] ITEM_NAME: {varchar(255)} <br>
     * 銘柄名称
     * @param itemName The value of the column 'ITEM_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemName(String itemName) {
        registerModifiedProperty("itemName");
        _itemName = itemName;
    }

    /**
     * [get] LIMITDATE: {varchar(255)} <br>
     * 製造年月日
     * @return The value of the column 'LIMITDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitdate() {
        checkSpecifiedProperty("limitdate");
        return convertEmptyToNull(_limitdate);
    }

    /**
     * [set] LIMITDATE: {varchar(255)} <br>
     * 製造年月日
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitdate(String limitdate) {
        registerModifiedProperty("limitdate");
        _limitdate = limitdate;
    }

    /**
     * [get] DESIGN_CD: {varchar(255)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesignCd() {
        checkSpecifiedProperty("designCd");
        return convertEmptyToNull(_designCd);
    }

    /**
     * [set] DESIGN_CD: {varchar(255)} <br>
     * デザイン区分
     * @param designCd The value of the column 'DESIGN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesignCd(String designCd) {
        registerModifiedProperty("designCd");
        _designCd = designCd;
    }

    /**
     * [get] OTHERLOT1: {varchar(255)} <br>
     * 在庫区分
     * @return The value of the column 'OTHERLOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot1() {
        checkSpecifiedProperty("otherlot1");
        return convertEmptyToNull(_otherlot1);
    }

    /**
     * [set] OTHERLOT1: {varchar(255)} <br>
     * 在庫区分
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot1(String otherlot1) {
        registerModifiedProperty("otherlot1");
        _otherlot1 = otherlot1;
    }

    /**
     * [get] ADDRESS3: {varchar(255)} <br>
     * 製品区分
     * @return The value of the column 'ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress3() {
        checkSpecifiedProperty("address3");
        return convertEmptyToNull(_address3);
    }

    /**
     * [set] ADDRESS3: {varchar(255)} <br>
     * 製品区分
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress3(String address3) {
        registerModifiedProperty("address3");
        _address3 = address3;
    }

    /**
     * [get] QTY1: {varchar(255)} <br>
     * 在庫数量
     * @return The value of the column 'QTY1'. (NullAllowed even if selected: for no constraint)
     */
    public String getQty1() {
        checkSpecifiedProperty("qty1");
        return convertEmptyToNull(_qty1);
    }

    /**
     * [set] QTY1: {varchar(255)} <br>
     * 在庫数量
     * @param qty1 The value of the column 'QTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty1(String qty1) {
        registerModifiedProperty("qty1");
        _qty1 = qty1;
    }

    /**
     * [get] REFNO: {varchar(255)} <br>
     * 輸送番号
     * @return The value of the column 'REFNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRefno() {
        checkSpecifiedProperty("refno");
        return convertEmptyToNull(_refno);
    }

    /**
     * [set] REFNO: {varchar(255)} <br>
     * 輸送番号
     * @param refno The value of the column 'REFNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRefno(String refno) {
        registerModifiedProperty("refno");
        _refno = refno;
    }

    /**
     * [get] FIRMCARRYNO: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMCARRYNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirmcarryno() {
        checkSpecifiedProperty("firmcarryno");
        return convertEmptyToNull(_firmcarryno);
    }

    /**
     * [set] FIRMCARRYNO: {varchar(255)} <br>
     * 商社搬入番号
     * @param firmcarryno The value of the column 'FIRMCARRYNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirmcarryno(String firmcarryno) {
        registerModifiedProperty("firmcarryno");
        _firmcarryno = firmcarryno;
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
     * [get] SOURCE_CD: {varchar(255)} <br>
     * 発送元CD
     * @return The value of the column 'SOURCE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSourceCd() {
        checkSpecifiedProperty("sourceCd");
        return convertEmptyToNull(_sourceCd);
    }

    /**
     * [set] SOURCE_CD: {varchar(255)} <br>
     * 発送元CD
     * @param sourceCd The value of the column 'SOURCE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSourceCd(String sourceCd) {
        registerModifiedProperty("sourceCd");
        _sourceCd = sourceCd;
    }

    /**
     * [get] SOURCE_NAME: {varchar(255)} <br>
     * 発送元名称
     * @return The value of the column 'SOURCE_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSourceName() {
        checkSpecifiedProperty("sourceName");
        return convertEmptyToNull(_sourceName);
    }

    /**
     * [set] SOURCE_NAME: {varchar(255)} <br>
     * 発送元名称
     * @param sourceName The value of the column 'SOURCE_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSourceName(String sourceName) {
        registerModifiedProperty("sourceName");
        _sourceName = sourceName;
    }

    /**
     * [get] SHIPSCHDATE: {varchar(255)} <br>
     * 発送予定日
     * @return The value of the column 'SHIPSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipschdate() {
        checkSpecifiedProperty("shipschdate");
        return convertEmptyToNull(_shipschdate);
    }

    /**
     * [set] SHIPSCHDATE: {varchar(255)} <br>
     * 発送予定日
     * @param shipschdate The value of the column 'SHIPSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipschdate(String shipschdate) {
        registerModifiedProperty("shipschdate");
        _shipschdate = shipschdate;
    }

    /**
     * [get] SCHRECEIVE_DATE: {varchar(255)} <br>
     * 入庫予定日
     * @return The value of the column 'SCHRECEIVE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSchreceiveDate() {
        checkSpecifiedProperty("schreceiveDate");
        return convertEmptyToNull(_schreceiveDate);
    }

    /**
     * [set] SCHRECEIVE_DATE: {varchar(255)} <br>
     * 入庫予定日
     * @param schreceiveDate The value of the column 'SCHRECEIVE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSchreceiveDate(String schreceiveDate) {
        registerModifiedProperty("schreceiveDate");
        _schreceiveDate = schreceiveDate;
    }

    /**
     * [get] SCHRECEIVE_NUM: {varchar(255)} <br>
     * 受入予定数量
     * @return The value of the column 'SCHRECEIVE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSchreceiveNum() {
        checkSpecifiedProperty("schreceiveNum");
        return convertEmptyToNull(_schreceiveNum);
    }

    /**
     * [set] SCHRECEIVE_NUM: {varchar(255)} <br>
     * 受入予定数量
     * @param schreceiveNum The value of the column 'SCHRECEIVE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSchreceiveNum(String schreceiveNum) {
        registerModifiedProperty("schreceiveNum");
        _schreceiveNum = schreceiveNum;
    }

    /**
     * [get] TRANSPORT_PRIORITY: {varchar(255)} <br>
     * 出力順(組織)
     * @return The value of the column 'TRANSPORT_PRIORITY'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportPriority() {
        checkSpecifiedProperty("transportPriority");
        return convertEmptyToNull(_transportPriority);
    }

    /**
     * [set] TRANSPORT_PRIORITY: {varchar(255)} <br>
     * 出力順(組織)
     * @param transportPriority The value of the column 'TRANSPORT_PRIORITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportPriority(String transportPriority) {
        registerModifiedProperty("transportPriority");
        _transportPriority = transportPriority;
    }

    /**
     * [get] ITEM_ORDERBY: {varchar(255)} <br>
     * 一般出力順
     * @return The value of the column 'ITEM_ORDERBY'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemOrderby() {
        checkSpecifiedProperty("itemOrderby");
        return convertEmptyToNull(_itemOrderby);
    }

    /**
     * [set] ITEM_ORDERBY: {varchar(255)} <br>
     * 一般出力順
     * @param itemOrderby The value of the column 'ITEM_ORDERBY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemOrderby(String itemOrderby) {
        registerModifiedProperty("itemOrderby");
        _itemOrderby = itemOrderby;
    }

    /**
     * [get] USETYPE: {varchar(255)} <br>
     * 使用区分
     * @return The value of the column 'USETYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUsetype() {
        checkSpecifiedProperty("usetype");
        return convertEmptyToNull(_usetype);
    }

    /**
     * [set] USETYPE: {varchar(255)} <br>
     * 使用区分
     * @param usetype The value of the column 'USETYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsetype(String usetype) {
        registerModifiedProperty("usetype");
        _usetype = usetype;
    }

    /**
     * [get] LOCGROUP: {varchar(255)} <br>
     * ロケーショングループCD
     * @return The value of the column 'LOCGROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocgroup() {
        checkSpecifiedProperty("locgroup");
        return convertEmptyToNull(_locgroup);
    }

    /**
     * [set] LOCGROUP: {varchar(255)} <br>
     * ロケーショングループCD
     * @param locgroup The value of the column 'LOCGROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocgroup(String locgroup) {
        registerModifiedProperty("locgroup");
        _locgroup = locgroup;
    }

    /**
     * [get] LOCGROUPNAME: {varchar(255)} <br>
     * ロケーショングループ名称
     * @return The value of the column 'LOCGROUPNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocgroupname() {
        checkSpecifiedProperty("locgroupname");
        return convertEmptyToNull(_locgroupname);
    }

    /**
     * [set] LOCGROUPNAME: {varchar(255)} <br>
     * ロケーショングループ名称
     * @param locgroupname The value of the column 'LOCGROUPNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocgroupname(String locgroupname) {
        registerModifiedProperty("locgroupname");
        _locgroupname = locgroupname;
    }

    /**
     * [get] OTHERREFNO1: {varchar(255)} <br>
     * 特販業者CD
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno1() {
        checkSpecifiedProperty("otherrefno1");
        return convertEmptyToNull(_otherrefno1);
    }

    /**
     * [set] OTHERREFNO1: {varchar(255)} <br>
     * 特販業者CD
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno1(String otherrefno1) {
        registerModifiedProperty("otherrefno1");
        _otherrefno1 = otherrefno1;
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
