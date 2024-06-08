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
 * The entity of E_CORDDTAAM_SEND as TABLE. <br>
 * さしず実績送信テーブル
 * <pre>
 * [primary-key]
 *     CORDDTAAM_SEND_ID
 *
 * [column]
 *     CORDDTAAM_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CENTER_CD, DELIVAY_CENTER_CD, DELIVERY_DATETIME, DIRECTION_CD, PISTON_TYPE, CAP_DIRECTION_CD, CAP_PISTON_TYPE, SORT_LINE_CD, SORT_ORDER, CUSTOMER_CD, CUSTOMER_NM, PRODUCT_CD, SLQACB, SLQACT, LINE_BLOCK, LOCATION_NO, LOCATION_TYPE, DELIVERY_PRINT_RANK, DELIVERY_SEQ_NO, DELIVERY_BRANCH_NO, SORT_WORK_DT, CSROPRTCNT, CUTTOPDIRASSORD, PRODUCT_TYPE, BOX_NO, BOX_NO_SEQ_NO, BOX_TYPE, MERGE_BOX_VISIBLE_TYPE, DM_VISIBLE_TYPE, TOTAL_BOX_CNT, BOX_CARTON_SUM, BOX_CARTON_SORT_NUM, TTTOPDEDRNK, LINE_BLOCK_BOX_NO, LINE_BLOCK_TOTAL_BOX_CNT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CORDDTAAM_SEND_ID
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
 * Long corddtaamSendId = entity.getCorddtaamSendId();
 * String sendCd = entity.getSendCd();
 * Long sendRowId = entity.getSendRowId();
 * String workFlg = entity.getWorkFlg();
 * String centerCd = entity.getCenterCd();
 * String delivayCenterCd = entity.getDelivayCenterCd();
 * String deliveryDatetime = entity.getDeliveryDatetime();
 * String directionCd = entity.getDirectionCd();
 * String pistonType = entity.getPistonType();
 * String capDirectionCd = entity.getCapDirectionCd();
 * String capPistonType = entity.getCapPistonType();
 * String sortLineCd = entity.getSortLineCd();
 * String sortOrder = entity.getSortOrder();
 * String customerCd = entity.getCustomerCd();
 * String customerNm = entity.getCustomerNm();
 * String productCd = entity.getProductCd();
 * String slqacb = entity.getSlqacb();
 * String slqact = entity.getSlqact();
 * String lineBlock = entity.getLineBlock();
 * String locationNo = entity.getLocationNo();
 * String locationType = entity.getLocationType();
 * String deliveryPrintRank = entity.getDeliveryPrintRank();
 * String deliverySeqNo = entity.getDeliverySeqNo();
 * String deliveryBranchNo = entity.getDeliveryBranchNo();
 * String sortWorkDt = entity.getSortWorkDt();
 * String csroprtcnt = entity.getCsroprtcnt();
 * String cuttopdirassord = entity.getCuttopdirassord();
 * String productType = entity.getProductType();
 * String boxNo = entity.getBoxNo();
 * String boxNoSeqNo = entity.getBoxNoSeqNo();
 * String boxType = entity.getBoxType();
 * String mergeBoxVisibleType = entity.getMergeBoxVisibleType();
 * String dmVisibleType = entity.getDmVisibleType();
 * String totalBoxCnt = entity.getTotalBoxCnt();
 * String boxCartonSum = entity.getBoxCartonSum();
 * String boxCartonSortNum = entity.getBoxCartonSortNum();
 * String tttopdedrnk = entity.getTttopdedrnk();
 * String lineBlockBoxNo = entity.getLineBlockBoxNo();
 * String lineBlockTotalBoxCnt = entity.getLineBlockTotalBoxCnt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCorddtaamSendId(corddtaamSendId);
 * entity.setSendCd(sendCd);
 * entity.setSendRowId(sendRowId);
 * entity.setWorkFlg(workFlg);
 * entity.setCenterCd(centerCd);
 * entity.setDelivayCenterCd(delivayCenterCd);
 * entity.setDeliveryDatetime(deliveryDatetime);
 * entity.setDirectionCd(directionCd);
 * entity.setPistonType(pistonType);
 * entity.setCapDirectionCd(capDirectionCd);
 * entity.setCapPistonType(capPistonType);
 * entity.setSortLineCd(sortLineCd);
 * entity.setSortOrder(sortOrder);
 * entity.setCustomerCd(customerCd);
 * entity.setCustomerNm(customerNm);
 * entity.setProductCd(productCd);
 * entity.setSlqacb(slqacb);
 * entity.setSlqact(slqact);
 * entity.setLineBlock(lineBlock);
 * entity.setLocationNo(locationNo);
 * entity.setLocationType(locationType);
 * entity.setDeliveryPrintRank(deliveryPrintRank);
 * entity.setDeliverySeqNo(deliverySeqNo);
 * entity.setDeliveryBranchNo(deliveryBranchNo);
 * entity.setSortWorkDt(sortWorkDt);
 * entity.setCsroprtcnt(csroprtcnt);
 * entity.setCuttopdirassord(cuttopdirassord);
 * entity.setProductType(productType);
 * entity.setBoxNo(boxNo);
 * entity.setBoxNoSeqNo(boxNoSeqNo);
 * entity.setBoxType(boxType);
 * entity.setMergeBoxVisibleType(mergeBoxVisibleType);
 * entity.setDmVisibleType(dmVisibleType);
 * entity.setTotalBoxCnt(totalBoxCnt);
 * entity.setBoxCartonSum(boxCartonSum);
 * entity.setBoxCartonSortNum(boxCartonSortNum);
 * entity.setTttopdedrnk(tttopdedrnk);
 * entity.setLineBlockBoxNo(lineBlockBoxNo);
 * entity.setLineBlockTotalBoxCnt(lineBlockTotalBoxCnt);
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
public abstract class BsECorddtaamSend extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _corddtaamSendId;

    /** SEND_CD: {NotNull, varchar(30)} */
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1), default=[0]} */
    protected String _workFlg;

    /** CENTER_CD: {NotNull, varchar(30)} */
    protected String _centerCd;

    /** DELIVAY_CENTER_CD: {varchar(255)} */
    protected String _delivayCenterCd;

    /** DELIVERY_DATETIME: {varchar(255)} */
    protected String _deliveryDatetime;

    /** DIRECTION_CD: {varchar(255)} */
    protected String _directionCd;

    /** PISTON_TYPE: {varchar(255)} */
    protected String _pistonType;

    /** CAP_DIRECTION_CD: {varchar(255)} */
    protected String _capDirectionCd;

    /** CAP_PISTON_TYPE: {varchar(255)} */
    protected String _capPistonType;

    /** SORT_LINE_CD: {varchar(255)} */
    protected String _sortLineCd;

    /** SORT_ORDER: {varchar(255)} */
    protected String _sortOrder;

    /** CUSTOMER_CD: {varchar(255)} */
    protected String _customerCd;

    /** CUSTOMER_NM: {varchar(255)} */
    protected String _customerNm;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** SLQACB: {varchar(255)} */
    protected String _slqacb;

    /** SLQACT: {varchar(255)} */
    protected String _slqact;

    /** LINE_BLOCK: {varchar(255)} */
    protected String _lineBlock;

    /** LOCATION_NO: {varchar(255)} */
    protected String _locationNo;

    /** LOCATION_TYPE: {varchar(255)} */
    protected String _locationType;

    /** DELIVERY_PRINT_RANK: {varchar(255)} */
    protected String _deliveryPrintRank;

    /** DELIVERY_SEQ_NO: {varchar(255)} */
    protected String _deliverySeqNo;

    /** DELIVERY_BRANCH_NO: {varchar(255)} */
    protected String _deliveryBranchNo;

    /** SORT_WORK_DT: {varchar(255)} */
    protected String _sortWorkDt;

    /** CSROPRTCNT: {varchar(255)} */
    protected String _csroprtcnt;

    /** CUTTOPDIRASSORD: {varchar(255)} */
    protected String _cuttopdirassord;

    /** PRODUCT_TYPE: {varchar(255)} */
    protected String _productType;

    /** BOX_NO: {varchar(255)} */
    protected String _boxNo;

    /** BOX_NO_SEQ_NO: {varchar(255)} */
    protected String _boxNoSeqNo;

    /** BOX_TYPE: {varchar(255)} */
    protected String _boxType;

    /** MERGE_BOX_VISIBLE_TYPE: {varchar(255)} */
    protected String _mergeBoxVisibleType;

    /** DM_VISIBLE_TYPE: {varchar(255)} */
    protected String _dmVisibleType;

    /** TOTAL_BOX_CNT: {varchar(255)} */
    protected String _totalBoxCnt;

    /** BOX_CARTON_SUM: {varchar(255)} */
    protected String _boxCartonSum;

    /** BOX_CARTON_SORT_NUM: {varchar(255)} */
    protected String _boxCartonSortNum;

    /** TTTOPDEDRNK: {varchar(255)} */
    protected String _tttopdedrnk;

    /** LINE_BLOCK_BOX_NO: {varchar(255)} */
    protected String _lineBlockBoxNo;

    /** LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)} */
    protected String _lineBlockTotalBoxCnt;

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
        return "E_CORDDTAAM_SEND";
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
        if (_corddtaamSendId == null) { return false; }
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
        if (obj instanceof BsECorddtaamSend) {
            BsECorddtaamSend other = (BsECorddtaamSend)obj;
            if (!xSV(_corddtaamSendId, other._corddtaamSendId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _corddtaamSendId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_corddtaamSendId));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendRowId));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_delivayCenterCd));
        sb.append(dm).append(xfND(_deliveryDatetime));
        sb.append(dm).append(xfND(_directionCd));
        sb.append(dm).append(xfND(_pistonType));
        sb.append(dm).append(xfND(_capDirectionCd));
        sb.append(dm).append(xfND(_capPistonType));
        sb.append(dm).append(xfND(_sortLineCd));
        sb.append(dm).append(xfND(_sortOrder));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_customerNm));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_slqacb));
        sb.append(dm).append(xfND(_slqact));
        sb.append(dm).append(xfND(_lineBlock));
        sb.append(dm).append(xfND(_locationNo));
        sb.append(dm).append(xfND(_locationType));
        sb.append(dm).append(xfND(_deliveryPrintRank));
        sb.append(dm).append(xfND(_deliverySeqNo));
        sb.append(dm).append(xfND(_deliveryBranchNo));
        sb.append(dm).append(xfND(_sortWorkDt));
        sb.append(dm).append(xfND(_csroprtcnt));
        sb.append(dm).append(xfND(_cuttopdirassord));
        sb.append(dm).append(xfND(_productType));
        sb.append(dm).append(xfND(_boxNo));
        sb.append(dm).append(xfND(_boxNoSeqNo));
        sb.append(dm).append(xfND(_boxType));
        sb.append(dm).append(xfND(_mergeBoxVisibleType));
        sb.append(dm).append(xfND(_dmVisibleType));
        sb.append(dm).append(xfND(_totalBoxCnt));
        sb.append(dm).append(xfND(_boxCartonSum));
        sb.append(dm).append(xfND(_boxCartonSortNum));
        sb.append(dm).append(xfND(_tttopdedrnk));
        sb.append(dm).append(xfND(_lineBlockBoxNo));
        sb.append(dm).append(xfND(_lineBlockTotalBoxCnt));
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
    public ECorddtaamSend clone() {
        return (ECorddtaamSend)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしず実績送信ID
     * @return The value of the column 'CORDDTAAM_SEND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCorddtaamSendId() {
        checkSpecifiedProperty("corddtaamSendId");
        return _corddtaamSendId;
    }

    /**
     * [set] CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしず実績送信ID
     * @param corddtaamSendId The value of the column 'CORDDTAAM_SEND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCorddtaamSendId(Long corddtaamSendId) {
        registerModifiedProperty("corddtaamSendId");
        _corddtaamSendId = corddtaamSendId;
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
     * [get] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (basically NotNull if update: for the constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] DELIVAY_CENTER_CD: {varchar(255)} <br>
     * 配達拠点CD
     * @return The value of the column 'DELIVAY_CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivayCenterCd() {
        checkSpecifiedProperty("delivayCenterCd");
        return convertEmptyToNull(_delivayCenterCd);
    }

    /**
     * [set] DELIVAY_CENTER_CD: {varchar(255)} <br>
     * 配達拠点CD
     * @param delivayCenterCd The value of the column 'DELIVAY_CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivayCenterCd(String delivayCenterCd) {
        registerModifiedProperty("delivayCenterCd");
        _delivayCenterCd = delivayCenterCd;
    }

    /**
     * [get] DELIVERY_DATETIME: {varchar(255)} <br>
     * 配達年月日
     * @return The value of the column 'DELIVERY_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryDatetime() {
        checkSpecifiedProperty("deliveryDatetime");
        return convertEmptyToNull(_deliveryDatetime);
    }

    /**
     * [set] DELIVERY_DATETIME: {varchar(255)} <br>
     * 配達年月日
     * @param deliveryDatetime The value of the column 'DELIVERY_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryDatetime(String deliveryDatetime) {
        registerModifiedProperty("deliveryDatetime");
        _deliveryDatetime = deliveryDatetime;
    }

    /**
     * [get] DIRECTION_CD: {varchar(255)} <br>
     * 配達方面
     * @return The value of the column 'DIRECTION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectionCd() {
        checkSpecifiedProperty("directionCd");
        return convertEmptyToNull(_directionCd);
    }

    /**
     * [set] DIRECTION_CD: {varchar(255)} <br>
     * 配達方面
     * @param directionCd The value of the column 'DIRECTION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionCd(String directionCd) {
        registerModifiedProperty("directionCd");
        _directionCd = directionCd;
    }

    /**
     * [get] PISTON_TYPE: {varchar(255)} <br>
     * ピストン区分
     * @return The value of the column 'PISTON_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPistonType() {
        checkSpecifiedProperty("pistonType");
        return convertEmptyToNull(_pistonType);
    }

    /**
     * [set] PISTON_TYPE: {varchar(255)} <br>
     * ピストン区分
     * @param pistonType The value of the column 'PISTON_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPistonType(String pistonType) {
        registerModifiedProperty("pistonType");
        _pistonType = pistonType;
    }

    /**
     * [get] CAP_DIRECTION_CD: {varchar(255)} <br>
     * CAP用配達方面
     * @return The value of the column 'CAP_DIRECTION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCapDirectionCd() {
        checkSpecifiedProperty("capDirectionCd");
        return convertEmptyToNull(_capDirectionCd);
    }

    /**
     * [set] CAP_DIRECTION_CD: {varchar(255)} <br>
     * CAP用配達方面
     * @param capDirectionCd The value of the column 'CAP_DIRECTION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCapDirectionCd(String capDirectionCd) {
        registerModifiedProperty("capDirectionCd");
        _capDirectionCd = capDirectionCd;
    }

    /**
     * [get] CAP_PISTON_TYPE: {varchar(255)} <br>
     * CAP用ピストン区分
     * @return The value of the column 'CAP_PISTON_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCapPistonType() {
        checkSpecifiedProperty("capPistonType");
        return convertEmptyToNull(_capPistonType);
    }

    /**
     * [set] CAP_PISTON_TYPE: {varchar(255)} <br>
     * CAP用ピストン区分
     * @param capPistonType The value of the column 'CAP_PISTON_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCapPistonType(String capPistonType) {
        registerModifiedProperty("capPistonType");
        _capPistonType = capPistonType;
    }

    /**
     * [get] SORT_LINE_CD: {varchar(255)} <br>
     * 仕分ラインCD
     * @return The value of the column 'SORT_LINE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortLineCd() {
        checkSpecifiedProperty("sortLineCd");
        return convertEmptyToNull(_sortLineCd);
    }

    /**
     * [set] SORT_LINE_CD: {varchar(255)} <br>
     * 仕分ラインCD
     * @param sortLineCd The value of the column 'SORT_LINE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortLineCd(String sortLineCd) {
        registerModifiedProperty("sortLineCd");
        _sortLineCd = sortLineCd;
    }

    /**
     * [get] SORT_ORDER: {varchar(255)} <br>
     * 仕分順
     * @return The value of the column 'SORT_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortOrder() {
        checkSpecifiedProperty("sortOrder");
        return convertEmptyToNull(_sortOrder);
    }

    /**
     * [set] SORT_ORDER: {varchar(255)} <br>
     * 仕分順
     * @param sortOrder The value of the column 'SORT_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortOrder(String sortOrder) {
        registerModifiedProperty("sortOrder");
        _sortOrder = sortOrder;
    }

    /**
     * [get] CUSTOMER_CD: {varchar(255)} <br>
     * お得意様CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerCd() {
        checkSpecifiedProperty("customerCd");
        return convertEmptyToNull(_customerCd);
    }

    /**
     * [set] CUSTOMER_CD: {varchar(255)} <br>
     * お得意様CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerCd(String customerCd) {
        registerModifiedProperty("customerCd");
        _customerCd = customerCd;
    }

    /**
     * [get] CUSTOMER_NM: {varchar(255)} <br>
     * お得意様名
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerNm() {
        checkSpecifiedProperty("customerNm");
        return convertEmptyToNull(_customerNm);
    }

    /**
     * [set] CUSTOMER_NM: {varchar(255)} <br>
     * お得意様名
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerNm(String customerNm) {
        registerModifiedProperty("customerNm");
        _customerNm = customerNm;
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
     * [get] SLQACB: {varchar(255)} <br>
     * 販売数量(ケース)
     * @return The value of the column 'SLQACB'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlqacb() {
        checkSpecifiedProperty("slqacb");
        return convertEmptyToNull(_slqacb);
    }

    /**
     * [set] SLQACB: {varchar(255)} <br>
     * 販売数量(ケース)
     * @param slqacb The value of the column 'SLQACB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlqacb(String slqacb) {
        registerModifiedProperty("slqacb");
        _slqacb = slqacb;
    }

    /**
     * [get] SLQACT: {varchar(255)} <br>
     * 販売数量(カートン)
     * @return The value of the column 'SLQACT'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlqact() {
        checkSpecifiedProperty("slqact");
        return convertEmptyToNull(_slqact);
    }

    /**
     * [set] SLQACT: {varchar(255)} <br>
     * 販売数量(カートン)
     * @param slqact The value of the column 'SLQACT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlqact(String slqact) {
        registerModifiedProperty("slqact");
        _slqact = slqact;
    }

    /**
     * [get] LINE_BLOCK: {varchar(255)} <br>
     * ライン/ブロック
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineBlock() {
        checkSpecifiedProperty("lineBlock");
        return convertEmptyToNull(_lineBlock);
    }

    /**
     * [set] LINE_BLOCK: {varchar(255)} <br>
     * ライン/ブロック
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineBlock(String lineBlock) {
        registerModifiedProperty("lineBlock");
        _lineBlock = lineBlock;
    }

    /**
     * [get] LOCATION_NO: {varchar(255)} <br>
     * ロケーションNo.
     * @return The value of the column 'LOCATION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationNo() {
        checkSpecifiedProperty("locationNo");
        return convertEmptyToNull(_locationNo);
    }

    /**
     * [set] LOCATION_NO: {varchar(255)} <br>
     * ロケーションNo.
     * @param locationNo The value of the column 'LOCATION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationNo(String locationNo) {
        registerModifiedProperty("locationNo");
        _locationNo = locationNo;
    }

    /**
     * [get] LOCATION_TYPE: {varchar(255)} <br>
     * ロケーション区分
     * @return The value of the column 'LOCATION_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationType() {
        checkSpecifiedProperty("locationType");
        return convertEmptyToNull(_locationType);
    }

    /**
     * [set] LOCATION_TYPE: {varchar(255)} <br>
     * ロケーション区分
     * @param locationType The value of the column 'LOCATION_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationType(String locationType) {
        registerModifiedProperty("locationType");
        _locationType = locationType;
    }

    /**
     * [get] DELIVERY_PRINT_RANK: {varchar(255)} <br>
     * 配達通番印刷順
     * @return The value of the column 'DELIVERY_PRINT_RANK'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryPrintRank() {
        checkSpecifiedProperty("deliveryPrintRank");
        return convertEmptyToNull(_deliveryPrintRank);
    }

    /**
     * [set] DELIVERY_PRINT_RANK: {varchar(255)} <br>
     * 配達通番印刷順
     * @param deliveryPrintRank The value of the column 'DELIVERY_PRINT_RANK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryPrintRank(String deliveryPrintRank) {
        registerModifiedProperty("deliveryPrintRank");
        _deliveryPrintRank = deliveryPrintRank;
    }

    /**
     * [get] DELIVERY_SEQ_NO: {varchar(255)} <br>
     * 配達通番
     * @return The value of the column 'DELIVERY_SEQ_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliverySeqNo() {
        checkSpecifiedProperty("deliverySeqNo");
        return convertEmptyToNull(_deliverySeqNo);
    }

    /**
     * [set] DELIVERY_SEQ_NO: {varchar(255)} <br>
     * 配達通番
     * @param deliverySeqNo The value of the column 'DELIVERY_SEQ_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliverySeqNo(String deliverySeqNo) {
        registerModifiedProperty("deliverySeqNo");
        _deliverySeqNo = deliverySeqNo;
    }

    /**
     * [get] DELIVERY_BRANCH_NO: {varchar(255)} <br>
     * 配達通番枝番
     * @return The value of the column 'DELIVERY_BRANCH_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryBranchNo() {
        checkSpecifiedProperty("deliveryBranchNo");
        return convertEmptyToNull(_deliveryBranchNo);
    }

    /**
     * [set] DELIVERY_BRANCH_NO: {varchar(255)} <br>
     * 配達通番枝番
     * @param deliveryBranchNo The value of the column 'DELIVERY_BRANCH_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryBranchNo(String deliveryBranchNo) {
        registerModifiedProperty("deliveryBranchNo");
        _deliveryBranchNo = deliveryBranchNo;
    }

    /**
     * [get] SORT_WORK_DT: {varchar(255)} <br>
     * 仕分作業回数
     * @return The value of the column 'SORT_WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortWorkDt() {
        checkSpecifiedProperty("sortWorkDt");
        return convertEmptyToNull(_sortWorkDt);
    }

    /**
     * [set] SORT_WORK_DT: {varchar(255)} <br>
     * 仕分作業回数
     * @param sortWorkDt The value of the column 'SORT_WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortWorkDt(String sortWorkDt) {
        registerModifiedProperty("sortWorkDt");
        _sortWorkDt = sortWorkDt;
    }

    /**
     * [get] CSROPRTCNT: {varchar(255)} <br>
     * 今回仕分作業回数
     * @return The value of the column 'CSROPRTCNT'. (NullAllowed even if selected: for no constraint)
     */
    public String getCsroprtcnt() {
        checkSpecifiedProperty("csroprtcnt");
        return convertEmptyToNull(_csroprtcnt);
    }

    /**
     * [set] CSROPRTCNT: {varchar(255)} <br>
     * 今回仕分作業回数
     * @param csroprtcnt The value of the column 'CSROPRTCNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCsroprtcnt(String csroprtcnt) {
        registerModifiedProperty("csroprtcnt");
        _csroprtcnt = csroprtcnt;
    }

    /**
     * [get] CUTTOPDIRASSORD: {varchar(255)} <br>
     * 今回先頭方面仕分順
     * @return The value of the column 'CUTTOPDIRASSORD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCuttopdirassord() {
        checkSpecifiedProperty("cuttopdirassord");
        return convertEmptyToNull(_cuttopdirassord);
    }

    /**
     * [set] CUTTOPDIRASSORD: {varchar(255)} <br>
     * 今回先頭方面仕分順
     * @param cuttopdirassord The value of the column 'CUTTOPDIRASSORD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCuttopdirassord(String cuttopdirassord) {
        registerModifiedProperty("cuttopdirassord");
        _cuttopdirassord = cuttopdirassord;
    }

    /**
     * [get] PRODUCT_TYPE: {varchar(255)} <br>
     * 商品タイプ
     * @return The value of the column 'PRODUCT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductType() {
        checkSpecifiedProperty("productType");
        return convertEmptyToNull(_productType);
    }

    /**
     * [set] PRODUCT_TYPE: {varchar(255)} <br>
     * 商品タイプ
     * @param productType The value of the column 'PRODUCT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductType(String productType) {
        registerModifiedProperty("productType");
        _productType = productType;
    }

    /**
     * [get] BOX_NO: {varchar(255)} <br>
     * 箱No.
     * @return The value of the column 'BOX_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxNo() {
        checkSpecifiedProperty("boxNo");
        return convertEmptyToNull(_boxNo);
    }

    /**
     * [set] BOX_NO: {varchar(255)} <br>
     * 箱No.
     * @param boxNo The value of the column 'BOX_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxNo(String boxNo) {
        registerModifiedProperty("boxNo");
        _boxNo = boxNo;
    }

    /**
     * [get] BOX_NO_SEQ_NO: {varchar(255)} <br>
     * 箱No.(通番)
     * @return The value of the column 'BOX_NO_SEQ_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxNoSeqNo() {
        checkSpecifiedProperty("boxNoSeqNo");
        return convertEmptyToNull(_boxNoSeqNo);
    }

    /**
     * [set] BOX_NO_SEQ_NO: {varchar(255)} <br>
     * 箱No.(通番)
     * @param boxNoSeqNo The value of the column 'BOX_NO_SEQ_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxNoSeqNo(String boxNoSeqNo) {
        registerModifiedProperty("boxNoSeqNo");
        _boxNoSeqNo = boxNoSeqNo;
    }

    /**
     * [get] BOX_TYPE: {varchar(255)} <br>
     * 箱タイプ
     * @return The value of the column 'BOX_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxType() {
        checkSpecifiedProperty("boxType");
        return convertEmptyToNull(_boxType);
    }

    /**
     * [set] BOX_TYPE: {varchar(255)} <br>
     * 箱タイプ
     * @param boxType The value of the column 'BOX_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxType(String boxType) {
        registerModifiedProperty("boxType");
        _boxType = boxType;
    }

    /**
     * [get] MERGE_BOX_VISIBLE_TYPE: {varchar(255)} <br>
     * マージ箱表示区分
     * @return The value of the column 'MERGE_BOX_VISIBLE_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getMergeBoxVisibleType() {
        checkSpecifiedProperty("mergeBoxVisibleType");
        return convertEmptyToNull(_mergeBoxVisibleType);
    }

    /**
     * [set] MERGE_BOX_VISIBLE_TYPE: {varchar(255)} <br>
     * マージ箱表示区分
     * @param mergeBoxVisibleType The value of the column 'MERGE_BOX_VISIBLE_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMergeBoxVisibleType(String mergeBoxVisibleType) {
        registerModifiedProperty("mergeBoxVisibleType");
        _mergeBoxVisibleType = mergeBoxVisibleType;
    }

    /**
     * [get] DM_VISIBLE_TYPE: {varchar(255)} <br>
     * DM表示区分
     * @return The value of the column 'DM_VISIBLE_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDmVisibleType() {
        checkSpecifiedProperty("dmVisibleType");
        return convertEmptyToNull(_dmVisibleType);
    }

    /**
     * [set] DM_VISIBLE_TYPE: {varchar(255)} <br>
     * DM表示区分
     * @param dmVisibleType The value of the column 'DM_VISIBLE_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDmVisibleType(String dmVisibleType) {
        registerModifiedProperty("dmVisibleType");
        _dmVisibleType = dmVisibleType;
    }

    /**
     * [get] TOTAL_BOX_CNT: {varchar(255)} <br>
     * トータル箱数
     * @return The value of the column 'TOTAL_BOX_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTotalBoxCnt() {
        checkSpecifiedProperty("totalBoxCnt");
        return convertEmptyToNull(_totalBoxCnt);
    }

    /**
     * [set] TOTAL_BOX_CNT: {varchar(255)} <br>
     * トータル箱数
     * @param totalBoxCnt The value of the column 'TOTAL_BOX_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalBoxCnt(String totalBoxCnt) {
        registerModifiedProperty("totalBoxCnt");
        _totalBoxCnt = totalBoxCnt;
    }

    /**
     * [get] BOX_CARTON_SUM: {varchar(255)} <br>
     * 箱内カートン数(総量)
     * @return The value of the column 'BOX_CARTON_SUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxCartonSum() {
        checkSpecifiedProperty("boxCartonSum");
        return convertEmptyToNull(_boxCartonSum);
    }

    /**
     * [set] BOX_CARTON_SUM: {varchar(255)} <br>
     * 箱内カートン数(総量)
     * @param boxCartonSum The value of the column 'BOX_CARTON_SUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxCartonSum(String boxCartonSum) {
        registerModifiedProperty("boxCartonSum");
        _boxCartonSum = boxCartonSum;
    }

    /**
     * [get] BOX_CARTON_SORT_NUM: {varchar(255)} <br>
     * 箱内カートン数(該当仕分場分)
     * @return The value of the column 'BOX_CARTON_SORT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxCartonSortNum() {
        checkSpecifiedProperty("boxCartonSortNum");
        return convertEmptyToNull(_boxCartonSortNum);
    }

    /**
     * [set] BOX_CARTON_SORT_NUM: {varchar(255)} <br>
     * 箱内カートン数(該当仕分場分)
     * @param boxCartonSortNum The value of the column 'BOX_CARTON_SORT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxCartonSortNum(String boxCartonSortNum) {
        registerModifiedProperty("boxCartonSortNum");
        _boxCartonSortNum = boxCartonSortNum;
    }

    /**
     * [get] TTTOPDEDRNK: {varchar(255)} <br>
     * 方面先頭個口区分
     * @return The value of the column 'TTTOPDEDRNK'. (NullAllowed even if selected: for no constraint)
     */
    public String getTttopdedrnk() {
        checkSpecifiedProperty("tttopdedrnk");
        return convertEmptyToNull(_tttopdedrnk);
    }

    /**
     * [set] TTTOPDEDRNK: {varchar(255)} <br>
     * 方面先頭個口区分
     * @param tttopdedrnk The value of the column 'TTTOPDEDRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTttopdedrnk(String tttopdedrnk) {
        registerModifiedProperty("tttopdedrnk");
        _tttopdedrnk = tttopdedrnk;
    }

    /**
     * [get] LINE_BLOCK_BOX_NO: {varchar(255)} <br>
     * ライン/ブロック箱No
     * @return The value of the column 'LINE_BLOCK_BOX_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineBlockBoxNo() {
        checkSpecifiedProperty("lineBlockBoxNo");
        return convertEmptyToNull(_lineBlockBoxNo);
    }

    /**
     * [set] LINE_BLOCK_BOX_NO: {varchar(255)} <br>
     * ライン/ブロック箱No
     * @param lineBlockBoxNo The value of the column 'LINE_BLOCK_BOX_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineBlockBoxNo(String lineBlockBoxNo) {
        registerModifiedProperty("lineBlockBoxNo");
        _lineBlockBoxNo = lineBlockBoxNo;
    }

    /**
     * [get] LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)} <br>
     * ライン/ブロックトータル箱数
     * @return The value of the column 'LINE_BLOCK_TOTAL_BOX_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineBlockTotalBoxCnt() {
        checkSpecifiedProperty("lineBlockTotalBoxCnt");
        return convertEmptyToNull(_lineBlockTotalBoxCnt);
    }

    /**
     * [set] LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)} <br>
     * ライン/ブロックトータル箱数
     * @param lineBlockTotalBoxCnt The value of the column 'LINE_BLOCK_TOTAL_BOX_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineBlockTotalBoxCnt(String lineBlockTotalBoxCnt) {
        registerModifiedProperty("lineBlockTotalBoxCnt");
        _lineBlockTotalBoxCnt = lineBlockTotalBoxCnt;
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
