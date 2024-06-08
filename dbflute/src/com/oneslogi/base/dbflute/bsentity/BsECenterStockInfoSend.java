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
 * The entity of E_CENTER_STOCK_INFO_SEND as TABLE. <br>
 * 拠点別在庫情報送信テーブル(国産)
 * <pre>
 * [primary-key]
 *     CENTER_STOCK_INFO_SEND_ID
 *
 * [column]
 *     CENTER_STOCK_INFO_SEND_ID, SEQNO, PROCESS_DT, WAREHOUSE_CD, WAREHOUSE_NAME, ITEM_CD, ITEM_NAME, LIMIT_DATE, DESIGN_CD, INV_TYPE, INV_NUM, TRANSPORT_CD, FIRMTRANSPORT_CD, SOURCE_CD, SOURCE_NAME, SCH_DATE, RECEIVE_DATE, SCHRECEIVE_DATE, SCHRECEIVE_NUM, TRANSPORT_PRIORITY, ITEM_SORT, USE_TYPE, SEND_CD, SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * Long seqno = entity.getSeqno();
 * String processDt = entity.getProcessDt();
 * String warehouseCd = entity.getWarehouseCd();
 * String warehouseName = entity.getWarehouseName();
 * String itemCd = entity.getItemCd();
 * String itemName = entity.getItemName();
 * String limitDate = entity.getLimitDate();
 * String designCd = entity.getDesignCd();
 * String invType = entity.getInvType();
 * java.math.BigDecimal invNum = entity.getInvNum();
 * String transportCd = entity.getTransportCd();
 * String firmtransportCd = entity.getFirmtransportCd();
 * String sourceCd = entity.getSourceCd();
 * String sourceName = entity.getSourceName();
 * String schDate = entity.getSchDate();
 * String receiveDate = entity.getReceiveDate();
 * String schreceiveDate = entity.getSchreceiveDate();
 * java.math.BigDecimal schreceiveNum = entity.getSchreceiveNum();
 * java.math.BigDecimal transportPriority = entity.getTransportPriority();
 * java.math.BigDecimal itemSort = entity.getItemSort();
 * java.math.BigDecimal useType = entity.getUseType();
 * String sendCd = entity.getSendCd();
 * String sendFlg = entity.getSendFlg();
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
 * entity.setSeqno(seqno);
 * entity.setProcessDt(processDt);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setWarehouseName(warehouseName);
 * entity.setItemCd(itemCd);
 * entity.setItemName(itemName);
 * entity.setLimitDate(limitDate);
 * entity.setDesignCd(designCd);
 * entity.setInvType(invType);
 * entity.setInvNum(invNum);
 * entity.setTransportCd(transportCd);
 * entity.setFirmtransportCd(firmtransportCd);
 * entity.setSourceCd(sourceCd);
 * entity.setSourceName(sourceName);
 * entity.setSchDate(schDate);
 * entity.setReceiveDate(receiveDate);
 * entity.setSchreceiveDate(schreceiveDate);
 * entity.setSchreceiveNum(schreceiveNum);
 * entity.setTransportPriority(transportPriority);
 * entity.setItemSort(itemSort);
 * entity.setUseType(useType);
 * entity.setSendCd(sendCd);
 * entity.setSendFlg(sendFlg);
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
public abstract class BsECenterStockInfoSend extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

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

    /** SEQNO: {NotNull, bigint(19)} */
    protected Long _seqno;

    /** PROCESS_DT: {NotNull, varchar(8)} */
    protected String _processDt;

    /** WAREHOUSE_CD: {NotNull, varchar(30)} */
    protected String _warehouseCd;

    /** WAREHOUSE_NAME: {NotNull, varchar(60)} */
    protected String _warehouseName;

    /** ITEM_CD: {NotNull, varchar(30)} */
    protected String _itemCd;

    /** ITEM_NAME: {NotNull, varchar(60)} */
    protected String _itemName;

    /** LIMIT_DATE: {varchar(8)} */
    protected String _limitDate;

    /** DESIGN_CD: {varchar(30)} */
    protected String _designCd;

    /** INV_TYPE: {NotNull, varchar(60)} */
    protected String _invType;

    /** INV_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _invNum;

    /** TRANSPORT_CD: {varchar(30)} */
    protected String _transportCd;

    /** FIRMTRANSPORT_CD: {varchar(30)} */
    protected String _firmtransportCd;

    /** SOURCE_CD: {varchar(30)} */
    protected String _sourceCd;

    /** SOURCE_NAME: {varchar(100)} */
    protected String _sourceName;

    /** SCH_DATE: {varchar(8)} */
    protected String _schDate;

    /** RECEIVE_DATE: {varchar(8)} */
    protected String _receiveDate;

    /** SCHRECEIVE_DATE: {varchar(8)} */
    protected String _schreceiveDate;

    /** SCHRECEIVE_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _schreceiveNum;

    /** TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _transportPriority;

    /** ITEM_SORT: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _itemSort;

    /** USE_TYPE: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _useType;

    /** SEND_CD: {varchar(30)} */
    protected String _sendCd;

    /** SEND_FLG: {char(1)} */
    protected String _sendFlg;

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
        return "E_CENTER_STOCK_INFO_SEND";
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
        if (obj instanceof BsECenterStockInfoSend) {
            BsECenterStockInfoSend other = (BsECenterStockInfoSend)obj;
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
        sb.append(dm).append(xfND(_seqno));
        sb.append(dm).append(xfND(_processDt));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_warehouseName));
        sb.append(dm).append(xfND(_itemCd));
        sb.append(dm).append(xfND(_itemName));
        sb.append(dm).append(xfND(_limitDate));
        sb.append(dm).append(xfND(_designCd));
        sb.append(dm).append(xfND(_invType));
        sb.append(dm).append(xfND(_invNum));
        sb.append(dm).append(xfND(_transportCd));
        sb.append(dm).append(xfND(_firmtransportCd));
        sb.append(dm).append(xfND(_sourceCd));
        sb.append(dm).append(xfND(_sourceName));
        sb.append(dm).append(xfND(_schDate));
        sb.append(dm).append(xfND(_receiveDate));
        sb.append(dm).append(xfND(_schreceiveDate));
        sb.append(dm).append(xfND(_schreceiveNum));
        sb.append(dm).append(xfND(_transportPriority));
        sb.append(dm).append(xfND(_itemSort));
        sb.append(dm).append(xfND(_useType));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendFlg));
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
    public ECenterStockInfoSend clone() {
        return (ECenterStockInfoSend)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点別在庫情報送信(国産)ID
     * @return The value of the column 'CENTER_STOCK_INFO_SEND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterStockInfoSendId() {
        checkSpecifiedProperty("centerStockInfoSendId");
        return _centerStockInfoSendId;
    }

    /**
     * [set] CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点別在庫情報送信(国産)ID
     * @param centerStockInfoSendId The value of the column 'CENTER_STOCK_INFO_SEND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterStockInfoSendId(Long centerStockInfoSendId) {
        registerModifiedProperty("centerStockInfoSendId");
        _centerStockInfoSendId = centerStockInfoSendId;
    }

    /**
     * [get] SEQNO: {NotNull, bigint(19)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQNO'. (basically NotNull if selected: for the constraint)
     */
    public Long getSeqno() {
        checkSpecifiedProperty("seqno");
        return _seqno;
    }

    /**
     * [set] SEQNO: {NotNull, bigint(19)} <br>
     * シーケンス番号
     * @param seqno The value of the column 'SEQNO'. (basically NotNull if update: for the constraint)
     */
    public void setSeqno(Long seqno) {
        registerModifiedProperty("seqno");
        _seqno = seqno;
    }

    /**
     * [get] PROCESS_DT: {NotNull, varchar(8)} <br>
     * 処理日
     * @return The value of the column 'PROCESS_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getProcessDt() {
        checkSpecifiedProperty("processDt");
        return convertEmptyToNull(_processDt);
    }

    /**
     * [set] PROCESS_DT: {NotNull, varchar(8)} <br>
     * 処理日
     * @param processDt The value of the column 'PROCESS_DT'. (basically NotNull if update: for the constraint)
     */
    public void setProcessDt(String processDt) {
        registerModifiedProperty("processDt");
        _processDt = processDt;
    }

    /**
     * [get] WAREHOUSE_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] WAREHOUSE_NAME: {NotNull, varchar(60)} <br>
     * 拠点名称
     * @return The value of the column 'WAREHOUSE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehouseName() {
        checkSpecifiedProperty("warehouseName");
        return convertEmptyToNull(_warehouseName);
    }

    /**
     * [set] WAREHOUSE_NAME: {NotNull, varchar(60)} <br>
     * 拠点名称
     * @param warehouseName The value of the column 'WAREHOUSE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setWarehouseName(String warehouseName) {
        registerModifiedProperty("warehouseName");
        _warehouseName = warehouseName;
    }

    /**
     * [get] ITEM_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'ITEM_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getItemCd() {
        checkSpecifiedProperty("itemCd");
        return convertEmptyToNull(_itemCd);
    }

    /**
     * [set] ITEM_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param itemCd The value of the column 'ITEM_CD'. (basically NotNull if update: for the constraint)
     */
    public void setItemCd(String itemCd) {
        registerModifiedProperty("itemCd");
        _itemCd = itemCd;
    }

    /**
     * [get] ITEM_NAME: {NotNull, varchar(60)} <br>
     * 銘柄名称
     * @return The value of the column 'ITEM_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getItemName() {
        checkSpecifiedProperty("itemName");
        return convertEmptyToNull(_itemName);
    }

    /**
     * [set] ITEM_NAME: {NotNull, varchar(60)} <br>
     * 銘柄名称
     * @param itemName The value of the column 'ITEM_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setItemName(String itemName) {
        registerModifiedProperty("itemName");
        _itemName = itemName;
    }

    /**
     * [get] LIMIT_DATE: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LIMIT_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDate() {
        checkSpecifiedProperty("limitDate");
        return convertEmptyToNull(_limitDate);
    }

    /**
     * [set] LIMIT_DATE: {varchar(8)} <br>
     * 製造年月日
     * @param limitDate The value of the column 'LIMIT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDate(String limitDate) {
        registerModifiedProperty("limitDate");
        _limitDate = limitDate;
    }

    /**
     * [get] DESIGN_CD: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesignCd() {
        checkSpecifiedProperty("designCd");
        return convertEmptyToNull(_designCd);
    }

    /**
     * [set] DESIGN_CD: {varchar(30)} <br>
     * デザイン区分
     * @param designCd The value of the column 'DESIGN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesignCd(String designCd) {
        registerModifiedProperty("designCd");
        _designCd = designCd;
    }

    /**
     * [get] INV_TYPE: {NotNull, varchar(60)} <br>
     * 在庫区分
     * @return The value of the column 'INV_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getInvType() {
        checkSpecifiedProperty("invType");
        return convertEmptyToNull(_invType);
    }

    /**
     * [set] INV_TYPE: {NotNull, varchar(60)} <br>
     * 在庫区分
     * @param invType The value of the column 'INV_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setInvType(String invType) {
        registerModifiedProperty("invType");
        _invType = invType;
    }

    /**
     * [get] INV_NUM: {decimal(16, 6)} <br>
     * 在庫数量
     * @return The value of the column 'INV_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvNum() {
        checkSpecifiedProperty("invNum");
        return _invNum;
    }

    /**
     * [set] INV_NUM: {decimal(16, 6)} <br>
     * 在庫数量
     * @param invNum The value of the column 'INV_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvNum(java.math.BigDecimal invNum) {
        registerModifiedProperty("invNum");
        _invNum = invNum;
    }

    /**
     * [get] TRANSPORT_CD: {varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportCd() {
        checkSpecifiedProperty("transportCd");
        return convertEmptyToNull(_transportCd);
    }

    /**
     * [set] TRANSPORT_CD: {varchar(30)} <br>
     * 輸送番号
     * @param transportCd The value of the column 'TRANSPORT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportCd(String transportCd) {
        registerModifiedProperty("transportCd");
        _transportCd = transportCd;
    }

    /**
     * [get] FIRMTRANSPORT_CD: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMTRANSPORT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirmtransportCd() {
        checkSpecifiedProperty("firmtransportCd");
        return convertEmptyToNull(_firmtransportCd);
    }

    /**
     * [set] FIRMTRANSPORT_CD: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmtransportCd The value of the column 'FIRMTRANSPORT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirmtransportCd(String firmtransportCd) {
        registerModifiedProperty("firmtransportCd");
        _firmtransportCd = firmtransportCd;
    }

    /**
     * [get] SOURCE_CD: {varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SOURCE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSourceCd() {
        checkSpecifiedProperty("sourceCd");
        return convertEmptyToNull(_sourceCd);
    }

    /**
     * [set] SOURCE_CD: {varchar(30)} <br>
     * 発送元CD
     * @param sourceCd The value of the column 'SOURCE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSourceCd(String sourceCd) {
        registerModifiedProperty("sourceCd");
        _sourceCd = sourceCd;
    }

    /**
     * [get] SOURCE_NAME: {varchar(100)} <br>
     * 発送元名称
     * @return The value of the column 'SOURCE_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSourceName() {
        checkSpecifiedProperty("sourceName");
        return convertEmptyToNull(_sourceName);
    }

    /**
     * [set] SOURCE_NAME: {varchar(100)} <br>
     * 発送元名称
     * @param sourceName The value of the column 'SOURCE_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSourceName(String sourceName) {
        registerModifiedProperty("sourceName");
        _sourceName = sourceName;
    }

    /**
     * [get] SCH_DATE: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SCH_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSchDate() {
        checkSpecifiedProperty("schDate");
        return convertEmptyToNull(_schDate);
    }

    /**
     * [set] SCH_DATE: {varchar(8)} <br>
     * 発送予定日
     * @param schDate The value of the column 'SCH_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSchDate(String schDate) {
        registerModifiedProperty("schDate");
        _schDate = schDate;
    }

    /**
     * [get] RECEIVE_DATE: {varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'RECEIVE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveDate() {
        checkSpecifiedProperty("receiveDate");
        return convertEmptyToNull(_receiveDate);
    }

    /**
     * [set] RECEIVE_DATE: {varchar(8)} <br>
     * 入庫日
     * @param receiveDate The value of the column 'RECEIVE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveDate(String receiveDate) {
        registerModifiedProperty("receiveDate");
        _receiveDate = receiveDate;
    }

    /**
     * [get] SCHRECEIVE_DATE: {varchar(8)} <br>
     * 入庫予定日
     * @return The value of the column 'SCHRECEIVE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSchreceiveDate() {
        checkSpecifiedProperty("schreceiveDate");
        return convertEmptyToNull(_schreceiveDate);
    }

    /**
     * [set] SCHRECEIVE_DATE: {varchar(8)} <br>
     * 入庫予定日
     * @param schreceiveDate The value of the column 'SCHRECEIVE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSchreceiveDate(String schreceiveDate) {
        registerModifiedProperty("schreceiveDate");
        _schreceiveDate = schreceiveDate;
    }

    /**
     * [get] SCHRECEIVE_NUM: {decimal(16, 6)} <br>
     * 受入予定数量
     * @return The value of the column 'SCHRECEIVE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSchreceiveNum() {
        checkSpecifiedProperty("schreceiveNum");
        return _schreceiveNum;
    }

    /**
     * [set] SCHRECEIVE_NUM: {decimal(16, 6)} <br>
     * 受入予定数量
     * @param schreceiveNum The value of the column 'SCHRECEIVE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSchreceiveNum(java.math.BigDecimal schreceiveNum) {
        registerModifiedProperty("schreceiveNum");
        _schreceiveNum = schreceiveNum;
    }

    /**
     * [get] TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)} <br>
     * 出力順(組織)
     * @return The value of the column 'TRANSPORT_PRIORITY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTransportPriority() {
        checkSpecifiedProperty("transportPriority");
        return _transportPriority;
    }

    /**
     * [set] TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)} <br>
     * 出力順(組織)
     * @param transportPriority The value of the column 'TRANSPORT_PRIORITY'. (basically NotNull if update: for the constraint)
     */
    public void setTransportPriority(java.math.BigDecimal transportPriority) {
        registerModifiedProperty("transportPriority");
        _transportPriority = transportPriority;
    }

    /**
     * [get] ITEM_SORT: {NotNull, decimal(16, 6)} <br>
     * 一般出力順
     * @return The value of the column 'ITEM_SORT'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getItemSort() {
        checkSpecifiedProperty("itemSort");
        return _itemSort;
    }

    /**
     * [set] ITEM_SORT: {NotNull, decimal(16, 6)} <br>
     * 一般出力順
     * @param itemSort The value of the column 'ITEM_SORT'. (basically NotNull if update: for the constraint)
     */
    public void setItemSort(java.math.BigDecimal itemSort) {
        registerModifiedProperty("itemSort");
        _itemSort = itemSort;
    }

    /**
     * [get] USE_TYPE: {NotNull, decimal(16, 6)} <br>
     * 使用区分
     * @return The value of the column 'USE_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getUseType() {
        checkSpecifiedProperty("useType");
        return _useType;
    }

    /**
     * [set] USE_TYPE: {NotNull, decimal(16, 6)} <br>
     * 使用区分
     * @param useType The value of the column 'USE_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setUseType(java.math.BigDecimal useType) {
        registerModifiedProperty("useType");
        _useType = useType;
    }

    /**
     * [get] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSendCd() {
        checkSpecifiedProperty("sendCd");
        return convertEmptyToNull(_sendCd);
    }

    /**
     * [set] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendCd(String sendCd) {
        registerModifiedProperty("sendCd");
        _sendCd = sendCd;
    }

    /**
     * [get] SEND_FLG: {char(1)} <br>
     * 処理済フラグ
     * @return The value of the column 'SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSendFlg() {
        checkSpecifiedProperty("sendFlg");
        return convertEmptyToNull(_sendFlg);
    }

    /**
     * [set] SEND_FLG: {char(1)} <br>
     * 処理済フラグ
     * @param sendFlg The value of the column 'SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendFlg(String sendFlg) {
        registerModifiedProperty("sendFlg");
        _sendFlg = sendFlg;
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
