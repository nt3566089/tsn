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
 * The entity of E_DUTY_FREE_INOUT_RESULT as TABLE. <br>
 * 国内免税入出庫実績送信テーブル
 * <pre>
 * [primary-key]
 *     DUTY_FREE_INOUT_RESULT_ID
 *
 * [column]
 *     DUTY_FREE_INOUT_RESULT_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, SYMBOL_POS_KEY, WAREHOUSE_CD, SYMBOL_FACTORY_CD, SYMBOL_ITEM_CD, SYMBOL_SKU, SYMBOL_RECEIVE_CD, SYMBOL_PRODUCT_MARK, SYMBOL_ORDERNO, SYMBOL_PRINTERNO, SYMBOL_MAKENO, SYMBOL_LOT4, SYMBOL_MAKETIME, SYMBOL_CIRCULATION_ID, TRANSPORT_CD, PALLET_ID, INIT_NUM, CREATE_DATETIME, SORTING_DATETIME, TRACE_TYPE, LINE_BLOCK, ASSORT_ED_UNIT, ASSORT_ED_INDEX, OPERATION_CODE, CASE_IN_NUM, ASSORT_NUM, ASSORT_DIF_NUM, DIRECTION_CD, PISTON_TYPE, CUSTOMER_CD, DIRECTION_NUM, DIST_WAREHOUSE_CD, SYMBOL_RCV_KEY, ITEM_CD, DESIGN_CD, RESESRVE_AREA, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DUTY_FREE_INOUT_RESULT_ID
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
 * Long dutyFreeInoutResultId = entity.getDutyFreeInoutResultId();
 * String sendCd = entity.getSendCd();
 * Long sendRowId = entity.getSendRowId();
 * String workFlg = entity.getWorkFlg();
 * String symbolPosKey = entity.getSymbolPosKey();
 * String warehouseCd = entity.getWarehouseCd();
 * String symbolFactoryCd = entity.getSymbolFactoryCd();
 * String symbolItemCd = entity.getSymbolItemCd();
 * String symbolSku = entity.getSymbolSku();
 * String symbolReceiveCd = entity.getSymbolReceiveCd();
 * String symbolProductMark = entity.getSymbolProductMark();
 * String symbolOrderno = entity.getSymbolOrderno();
 * String symbolPrinterno = entity.getSymbolPrinterno();
 * String symbolMakeno = entity.getSymbolMakeno();
 * String symbolLot4 = entity.getSymbolLot4();
 * String symbolMaketime = entity.getSymbolMaketime();
 * String symbolCirculationId = entity.getSymbolCirculationId();
 * String transportCd = entity.getTransportCd();
 * String palletId = entity.getPalletId();
 * String initNum = entity.getInitNum();
 * String createDatetime = entity.getCreateDatetime();
 * String sortingDatetime = entity.getSortingDatetime();
 * String traceType = entity.getTraceType();
 * String lineBlock = entity.getLineBlock();
 * String assortEdUnit = entity.getAssortEdUnit();
 * String assortEdIndex = entity.getAssortEdIndex();
 * String operationCode = entity.getOperationCode();
 * String caseInNum = entity.getCaseInNum();
 * String assortNum = entity.getAssortNum();
 * String assortDifNum = entity.getAssortDifNum();
 * String directionCd = entity.getDirectionCd();
 * String pistonType = entity.getPistonType();
 * String customerCd = entity.getCustomerCd();
 * String directionNum = entity.getDirectionNum();
 * String distWarehouseCd = entity.getDistWarehouseCd();
 * String symbolRcvKey = entity.getSymbolRcvKey();
 * String itemCd = entity.getItemCd();
 * String designCd = entity.getDesignCd();
 * String resesrveArea = entity.getResesrveArea();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setDutyFreeInoutResultId(dutyFreeInoutResultId);
 * entity.setSendCd(sendCd);
 * entity.setSendRowId(sendRowId);
 * entity.setWorkFlg(workFlg);
 * entity.setSymbolPosKey(symbolPosKey);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setSymbolFactoryCd(symbolFactoryCd);
 * entity.setSymbolItemCd(symbolItemCd);
 * entity.setSymbolSku(symbolSku);
 * entity.setSymbolReceiveCd(symbolReceiveCd);
 * entity.setSymbolProductMark(symbolProductMark);
 * entity.setSymbolOrderno(symbolOrderno);
 * entity.setSymbolPrinterno(symbolPrinterno);
 * entity.setSymbolMakeno(symbolMakeno);
 * entity.setSymbolLot4(symbolLot4);
 * entity.setSymbolMaketime(symbolMaketime);
 * entity.setSymbolCirculationId(symbolCirculationId);
 * entity.setTransportCd(transportCd);
 * entity.setPalletId(palletId);
 * entity.setInitNum(initNum);
 * entity.setCreateDatetime(createDatetime);
 * entity.setSortingDatetime(sortingDatetime);
 * entity.setTraceType(traceType);
 * entity.setLineBlock(lineBlock);
 * entity.setAssortEdUnit(assortEdUnit);
 * entity.setAssortEdIndex(assortEdIndex);
 * entity.setOperationCode(operationCode);
 * entity.setCaseInNum(caseInNum);
 * entity.setAssortNum(assortNum);
 * entity.setAssortDifNum(assortDifNum);
 * entity.setDirectionCd(directionCd);
 * entity.setPistonType(pistonType);
 * entity.setCustomerCd(customerCd);
 * entity.setDirectionNum(directionNum);
 * entity.setDistWarehouseCd(distWarehouseCd);
 * entity.setSymbolRcvKey(symbolRcvKey);
 * entity.setItemCd(itemCd);
 * entity.setDesignCd(designCd);
 * entity.setResesrveArea(resesrveArea);
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
public abstract class BsEDutyFreeInoutResult extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _dutyFreeInoutResultId;

    /** SEND_CD: {NotNull, varchar(30)} */
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1), default=[0]} */
    protected String _workFlg;

    /** SYMBOL_POS_KEY: {varchar(255)} */
    protected String _symbolPosKey;

    /** WAREHOUSE_CD: {varchar(255)} */
    protected String _warehouseCd;

    /** SYMBOL_FACTORY_CD: {varchar(255)} */
    protected String _symbolFactoryCd;

    /** SYMBOL_ITEM_CD: {varchar(255)} */
    protected String _symbolItemCd;

    /** SYMBOL_SKU: {varchar(255)} */
    protected String _symbolSku;

    /** SYMBOL_RECEIVE_CD: {varchar(255)} */
    protected String _symbolReceiveCd;

    /** SYMBOL_PRODUCT_MARK: {varchar(255)} */
    protected String _symbolProductMark;

    /** SYMBOL_ORDERNO: {varchar(255)} */
    protected String _symbolOrderno;

    /** SYMBOL_PRINTERNO: {varchar(255)} */
    protected String _symbolPrinterno;

    /** SYMBOL_MAKENO: {varchar(255)} */
    protected String _symbolMakeno;

    /** SYMBOL_LOT4: {varchar(255)} */
    protected String _symbolLot4;

    /** SYMBOL_MAKETIME: {varchar(255)} */
    protected String _symbolMaketime;

    /** SYMBOL_CIRCULATION_ID: {varchar(255)} */
    protected String _symbolCirculationId;

    /** TRANSPORT_CD: {varchar(255)} */
    protected String _transportCd;

    /** PALLET_ID: {varchar(255)} */
    protected String _palletId;

    /** INIT_NUM: {varchar(255)} */
    protected String _initNum;

    /** CREATE_DATETIME: {varchar(255)} */
    protected String _createDatetime;

    /** SORTING_DATETIME: {varchar(255)} */
    protected String _sortingDatetime;

    /** TRACE_TYPE: {varchar(255)} */
    protected String _traceType;

    /** LINE_BLOCK: {varchar(255)} */
    protected String _lineBlock;

    /** ASSORT_ED_UNIT: {varchar(255)} */
    protected String _assortEdUnit;

    /** ASSORT_ED_INDEX: {varchar(255)} */
    protected String _assortEdIndex;

    /** OPERATION_CODE: {varchar(255)} */
    protected String _operationCode;

    /** CASE_IN_NUM: {varchar(255)} */
    protected String _caseInNum;

    /** ASSORT_NUM: {varchar(255)} */
    protected String _assortNum;

    /** ASSORT_DIF_NUM: {varchar(255)} */
    protected String _assortDifNum;

    /** DIRECTION_CD: {varchar(255)} */
    protected String _directionCd;

    /** PISTON_TYPE: {varchar(255)} */
    protected String _pistonType;

    /** CUSTOMER_CD: {varchar(255)} */
    protected String _customerCd;

    /** DIRECTION_NUM: {varchar(255)} */
    protected String _directionNum;

    /** DIST_WAREHOUSE_CD: {varchar(255)} */
    protected String _distWarehouseCd;

    /** SYMBOL_RCV_KEY: {varchar(255)} */
    protected String _symbolRcvKey;

    /** ITEM_CD: {varchar(255)} */
    protected String _itemCd;

    /** DESIGN_CD: {varchar(255)} */
    protected String _designCd;

    /** RESESRVE_AREA: {varchar(255)} */
    protected String _resesrveArea;

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
        return "E_DUTY_FREE_INOUT_RESULT";
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
        if (_dutyFreeInoutResultId == null) { return false; }
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
        if (obj instanceof BsEDutyFreeInoutResult) {
            BsEDutyFreeInoutResult other = (BsEDutyFreeInoutResult)obj;
            if (!xSV(_dutyFreeInoutResultId, other._dutyFreeInoutResultId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _dutyFreeInoutResultId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_dutyFreeInoutResultId));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendRowId));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_symbolPosKey));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_symbolFactoryCd));
        sb.append(dm).append(xfND(_symbolItemCd));
        sb.append(dm).append(xfND(_symbolSku));
        sb.append(dm).append(xfND(_symbolReceiveCd));
        sb.append(dm).append(xfND(_symbolProductMark));
        sb.append(dm).append(xfND(_symbolOrderno));
        sb.append(dm).append(xfND(_symbolPrinterno));
        sb.append(dm).append(xfND(_symbolMakeno));
        sb.append(dm).append(xfND(_symbolLot4));
        sb.append(dm).append(xfND(_symbolMaketime));
        sb.append(dm).append(xfND(_symbolCirculationId));
        sb.append(dm).append(xfND(_transportCd));
        sb.append(dm).append(xfND(_palletId));
        sb.append(dm).append(xfND(_initNum));
        sb.append(dm).append(xfND(_createDatetime));
        sb.append(dm).append(xfND(_sortingDatetime));
        sb.append(dm).append(xfND(_traceType));
        sb.append(dm).append(xfND(_lineBlock));
        sb.append(dm).append(xfND(_assortEdUnit));
        sb.append(dm).append(xfND(_assortEdIndex));
        sb.append(dm).append(xfND(_operationCode));
        sb.append(dm).append(xfND(_caseInNum));
        sb.append(dm).append(xfND(_assortNum));
        sb.append(dm).append(xfND(_assortDifNum));
        sb.append(dm).append(xfND(_directionCd));
        sb.append(dm).append(xfND(_pistonType));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_directionNum));
        sb.append(dm).append(xfND(_distWarehouseCd));
        sb.append(dm).append(xfND(_symbolRcvKey));
        sb.append(dm).append(xfND(_itemCd));
        sb.append(dm).append(xfND(_designCd));
        sb.append(dm).append(xfND(_resesrveArea));
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
    public EDutyFreeInoutResult clone() {
        return (EDutyFreeInoutResult)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 国内免税入出庫実績送信ID
     * @return The value of the column 'DUTY_FREE_INOUT_RESULT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDutyFreeInoutResultId() {
        checkSpecifiedProperty("dutyFreeInoutResultId");
        return _dutyFreeInoutResultId;
    }

    /**
     * [set] DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 国内免税入出庫実績送信ID
     * @param dutyFreeInoutResultId The value of the column 'DUTY_FREE_INOUT_RESULT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDutyFreeInoutResultId(Long dutyFreeInoutResultId) {
        registerModifiedProperty("dutyFreeInoutResultId");
        _dutyFreeInoutResultId = dutyFreeInoutResultId;
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
     * [get] SYMBOL_POS_KEY: {varchar(255)} <br>
     * 製品追跡キー
     * @return The value of the column 'SYMBOL_POS_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolPosKey() {
        checkSpecifiedProperty("symbolPosKey");
        return convertEmptyToNull(_symbolPosKey);
    }

    /**
     * [set] SYMBOL_POS_KEY: {varchar(255)} <br>
     * 製品追跡キー
     * @param symbolPosKey The value of the column 'SYMBOL_POS_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolPosKey(String symbolPosKey) {
        registerModifiedProperty("symbolPosKey");
        _symbolPosKey = symbolPosKey;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * 拠点CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] SYMBOL_FACTORY_CD: {varchar(255)} <br>
     * 工場CD
     * @return The value of the column 'SYMBOL_FACTORY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolFactoryCd() {
        checkSpecifiedProperty("symbolFactoryCd");
        return convertEmptyToNull(_symbolFactoryCd);
    }

    /**
     * [set] SYMBOL_FACTORY_CD: {varchar(255)} <br>
     * 工場CD
     * @param symbolFactoryCd The value of the column 'SYMBOL_FACTORY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolFactoryCd(String symbolFactoryCd) {
        registerModifiedProperty("symbolFactoryCd");
        _symbolFactoryCd = symbolFactoryCd;
    }

    /**
     * [get] SYMBOL_ITEM_CD: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'SYMBOL_ITEM_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolItemCd() {
        checkSpecifiedProperty("symbolItemCd");
        return convertEmptyToNull(_symbolItemCd);
    }

    /**
     * [set] SYMBOL_ITEM_CD: {varchar(255)} <br>
     * 銘柄CD
     * @param symbolItemCd The value of the column 'SYMBOL_ITEM_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolItemCd(String symbolItemCd) {
        registerModifiedProperty("symbolItemCd");
        _symbolItemCd = symbolItemCd;
    }

    /**
     * [get] SYMBOL_SKU: {varchar(255)} <br>
     * SKUCD
     * @return The value of the column 'SYMBOL_SKU'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolSku() {
        checkSpecifiedProperty("symbolSku");
        return convertEmptyToNull(_symbolSku);
    }

    /**
     * [set] SYMBOL_SKU: {varchar(255)} <br>
     * SKUCD
     * @param symbolSku The value of the column 'SYMBOL_SKU'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolSku(String symbolSku) {
        registerModifiedProperty("symbolSku");
        _symbolSku = symbolSku;
    }

    /**
     * [get] SYMBOL_RECEIVE_CD: {varchar(255)} <br>
     * 仕向地CD
     * @return The value of the column 'SYMBOL_RECEIVE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolReceiveCd() {
        checkSpecifiedProperty("symbolReceiveCd");
        return convertEmptyToNull(_symbolReceiveCd);
    }

    /**
     * [set] SYMBOL_RECEIVE_CD: {varchar(255)} <br>
     * 仕向地CD
     * @param symbolReceiveCd The value of the column 'SYMBOL_RECEIVE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolReceiveCd(String symbolReceiveCd) {
        registerModifiedProperty("symbolReceiveCd");
        _symbolReceiveCd = symbolReceiveCd;
    }

    /**
     * [get] SYMBOL_PRODUCT_MARK: {varchar(255)} <br>
     * 製造記号
     * @return The value of the column 'SYMBOL_PRODUCT_MARK'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolProductMark() {
        checkSpecifiedProperty("symbolProductMark");
        return convertEmptyToNull(_symbolProductMark);
    }

    /**
     * [set] SYMBOL_PRODUCT_MARK: {varchar(255)} <br>
     * 製造記号
     * @param symbolProductMark The value of the column 'SYMBOL_PRODUCT_MARK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolProductMark(String symbolProductMark) {
        registerModifiedProperty("symbolProductMark");
        _symbolProductMark = symbolProductMark;
    }

    /**
     * [get] SYMBOL_ORDERNO: {varchar(255)} <br>
     * 発注番号
     * @return The value of the column 'SYMBOL_ORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolOrderno() {
        checkSpecifiedProperty("symbolOrderno");
        return convertEmptyToNull(_symbolOrderno);
    }

    /**
     * [set] SYMBOL_ORDERNO: {varchar(255)} <br>
     * 発注番号
     * @param symbolOrderno The value of the column 'SYMBOL_ORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolOrderno(String symbolOrderno) {
        registerModifiedProperty("symbolOrderno");
        _symbolOrderno = symbolOrderno;
    }

    /**
     * [get] SYMBOL_PRINTERNO: {varchar(255)} <br>
     * 号機
     * @return The value of the column 'SYMBOL_PRINTERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolPrinterno() {
        checkSpecifiedProperty("symbolPrinterno");
        return convertEmptyToNull(_symbolPrinterno);
    }

    /**
     * [set] SYMBOL_PRINTERNO: {varchar(255)} <br>
     * 号機
     * @param symbolPrinterno The value of the column 'SYMBOL_PRINTERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolPrinterno(String symbolPrinterno) {
        registerModifiedProperty("symbolPrinterno");
        _symbolPrinterno = symbolPrinterno;
    }

    /**
     * [get] SYMBOL_MAKENO: {varchar(255)} <br>
     * 生出番号
     * @return The value of the column 'SYMBOL_MAKENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolMakeno() {
        checkSpecifiedProperty("symbolMakeno");
        return convertEmptyToNull(_symbolMakeno);
    }

    /**
     * [set] SYMBOL_MAKENO: {varchar(255)} <br>
     * 生出番号
     * @param symbolMakeno The value of the column 'SYMBOL_MAKENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolMakeno(String symbolMakeno) {
        registerModifiedProperty("symbolMakeno");
        _symbolMakeno = symbolMakeno;
    }

    /**
     * [get] SYMBOL_LOT4: {varchar(255)} <br>
     * 年月日
     * @return The value of the column 'SYMBOL_LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolLot4() {
        checkSpecifiedProperty("symbolLot4");
        return convertEmptyToNull(_symbolLot4);
    }

    /**
     * [set] SYMBOL_LOT4: {varchar(255)} <br>
     * 年月日
     * @param symbolLot4 The value of the column 'SYMBOL_LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolLot4(String symbolLot4) {
        registerModifiedProperty("symbolLot4");
        _symbolLot4 = symbolLot4;
    }

    /**
     * [get] SYMBOL_MAKETIME: {varchar(255)} <br>
     * 日付時刻
     * @return The value of the column 'SYMBOL_MAKETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolMaketime() {
        checkSpecifiedProperty("symbolMaketime");
        return convertEmptyToNull(_symbolMaketime);
    }

    /**
     * [set] SYMBOL_MAKETIME: {varchar(255)} <br>
     * 日付時刻
     * @param symbolMaketime The value of the column 'SYMBOL_MAKETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolMaketime(String symbolMaketime) {
        registerModifiedProperty("symbolMaketime");
        _symbolMaketime = symbolMaketime;
    }

    /**
     * [get] SYMBOL_CIRCULATION_ID: {varchar(255)} <br>
     * 流通識別
     * @return The value of the column 'SYMBOL_CIRCULATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolCirculationId() {
        checkSpecifiedProperty("symbolCirculationId");
        return convertEmptyToNull(_symbolCirculationId);
    }

    /**
     * [set] SYMBOL_CIRCULATION_ID: {varchar(255)} <br>
     * 流通識別
     * @param symbolCirculationId The value of the column 'SYMBOL_CIRCULATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolCirculationId(String symbolCirculationId) {
        registerModifiedProperty("symbolCirculationId");
        _symbolCirculationId = symbolCirculationId;
    }

    /**
     * [get] TRANSPORT_CD: {varchar(255)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportCd() {
        checkSpecifiedProperty("transportCd");
        return convertEmptyToNull(_transportCd);
    }

    /**
     * [set] TRANSPORT_CD: {varchar(255)} <br>
     * 輸送番号
     * @param transportCd The value of the column 'TRANSPORT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportCd(String transportCd) {
        registerModifiedProperty("transportCd");
        _transportCd = transportCd;
    }

    /**
     * [get] PALLET_ID: {varchar(255)} <br>
     * パレットID
     * @return The value of the column 'PALLET_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletId() {
        checkSpecifiedProperty("palletId");
        return convertEmptyToNull(_palletId);
    }

    /**
     * [set] PALLET_ID: {varchar(255)} <br>
     * パレットID
     * @param palletId The value of the column 'PALLET_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletId(String palletId) {
        registerModifiedProperty("palletId");
        _palletId = palletId;
    }

    /**
     * [get] INIT_NUM: {varchar(255)} <br>
     * 入庫時数量
     * @return The value of the column 'INIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getInitNum() {
        checkSpecifiedProperty("initNum");
        return convertEmptyToNull(_initNum);
    }

    /**
     * [set] INIT_NUM: {varchar(255)} <br>
     * 入庫時数量
     * @param initNum The value of the column 'INIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInitNum(String initNum) {
        registerModifiedProperty("initNum");
        _initNum = initNum;
    }

    /**
     * [get] CREATE_DATETIME: {varchar(255)} <br>
     * 作成年月日
     * @return The value of the column 'CREATE_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreateDatetime() {
        checkSpecifiedProperty("createDatetime");
        return convertEmptyToNull(_createDatetime);
    }

    /**
     * [set] CREATE_DATETIME: {varchar(255)} <br>
     * 作成年月日
     * @param createDatetime The value of the column 'CREATE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateDatetime(String createDatetime) {
        registerModifiedProperty("createDatetime");
        _createDatetime = createDatetime;
    }

    /**
     * [get] SORTING_DATETIME: {varchar(255)} <br>
     * 仕分年月日
     * @return The value of the column 'SORTING_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortingDatetime() {
        checkSpecifiedProperty("sortingDatetime");
        return convertEmptyToNull(_sortingDatetime);
    }

    /**
     * [set] SORTING_DATETIME: {varchar(255)} <br>
     * 仕分年月日
     * @param sortingDatetime The value of the column 'SORTING_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortingDatetime(String sortingDatetime) {
        registerModifiedProperty("sortingDatetime");
        _sortingDatetime = sortingDatetime;
    }

    /**
     * [get] TRACE_TYPE: {varchar(255)} <br>
     * 追跡区分
     * @return The value of the column 'TRACE_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTraceType() {
        checkSpecifiedProperty("traceType");
        return convertEmptyToNull(_traceType);
    }

    /**
     * [set] TRACE_TYPE: {varchar(255)} <br>
     * 追跡区分
     * @param traceType The value of the column 'TRACE_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTraceType(String traceType) {
        registerModifiedProperty("traceType");
        _traceType = traceType;
    }

    /**
     * [get] LINE_BLOCK: {varchar(255)} <br>
     * ライン・ブロック
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineBlock() {
        checkSpecifiedProperty("lineBlock");
        return convertEmptyToNull(_lineBlock);
    }

    /**
     * [set] LINE_BLOCK: {varchar(255)} <br>
     * ライン・ブロック
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineBlock(String lineBlock) {
        registerModifiedProperty("lineBlock");
        _lineBlock = lineBlock;
    }

    /**
     * [get] ASSORT_ED_UNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'ASSORT_ED_UNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortEdUnit() {
        checkSpecifiedProperty("assortEdUnit");
        return convertEmptyToNull(_assortEdUnit);
    }

    /**
     * [set] ASSORT_ED_UNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @param assortEdUnit The value of the column 'ASSORT_ED_UNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortEdUnit(String assortEdUnit) {
        registerModifiedProperty("assortEdUnit");
        _assortEdUnit = assortEdUnit;
    }

    /**
     * [get] ASSORT_ED_INDEX: {varchar(255)} <br>
     * 投入順
     * @return The value of the column 'ASSORT_ED_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortEdIndex() {
        checkSpecifiedProperty("assortEdIndex");
        return convertEmptyToNull(_assortEdIndex);
    }

    /**
     * [set] ASSORT_ED_INDEX: {varchar(255)} <br>
     * 投入順
     * @param assortEdIndex The value of the column 'ASSORT_ED_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortEdIndex(String assortEdIndex) {
        registerModifiedProperty("assortEdIndex");
        _assortEdIndex = assortEdIndex;
    }

    /**
     * [get] OPERATION_CODE: {varchar(255)} <br>
     * 操作数量符号
     * @return The value of the column 'OPERATION_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOperationCode() {
        checkSpecifiedProperty("operationCode");
        return convertEmptyToNull(_operationCode);
    }

    /**
     * [set] OPERATION_CODE: {varchar(255)} <br>
     * 操作数量符号
     * @param operationCode The value of the column 'OPERATION_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOperationCode(String operationCode) {
        registerModifiedProperty("operationCode");
        _operationCode = operationCode;
    }

    /**
     * [get] CASE_IN_NUM: {varchar(255)} <br>
     * ケース内数量
     * @return The value of the column 'CASE_IN_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseInNum() {
        checkSpecifiedProperty("caseInNum");
        return convertEmptyToNull(_caseInNum);
    }

    /**
     * [set] CASE_IN_NUM: {varchar(255)} <br>
     * ケース内数量
     * @param caseInNum The value of the column 'CASE_IN_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseInNum(String caseInNum) {
        registerModifiedProperty("caseInNum");
        _caseInNum = caseInNum;
    }

    /**
     * [get] ASSORT_NUM: {varchar(255)} <br>
     * 仕分数量
     * @return The value of the column 'ASSORT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortNum() {
        checkSpecifiedProperty("assortNum");
        return convertEmptyToNull(_assortNum);
    }

    /**
     * [set] ASSORT_NUM: {varchar(255)} <br>
     * 仕分数量
     * @param assortNum The value of the column 'ASSORT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortNum(String assortNum) {
        registerModifiedProperty("assortNum");
        _assortNum = assortNum;
    }

    /**
     * [get] ASSORT_DIF_NUM: {varchar(255)} <br>
     * 差異不良数量
     * @return The value of the column 'ASSORT_DIF_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortDifNum() {
        checkSpecifiedProperty("assortDifNum");
        return convertEmptyToNull(_assortDifNum);
    }

    /**
     * [set] ASSORT_DIF_NUM: {varchar(255)} <br>
     * 差異不良数量
     * @param assortDifNum The value of the column 'ASSORT_DIF_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortDifNum(String assortDifNum) {
        registerModifiedProperty("assortDifNum");
        _assortDifNum = assortDifNum;
    }

    /**
     * [get] DIRECTION_CD: {varchar(255)} <br>
     * 方面CD
     * @return The value of the column 'DIRECTION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectionCd() {
        checkSpecifiedProperty("directionCd");
        return convertEmptyToNull(_directionCd);
    }

    /**
     * [set] DIRECTION_CD: {varchar(255)} <br>
     * 方面CD
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
     * [get] DIRECTION_NUM: {varchar(255)} <br>
     * さしず数量
     * @return The value of the column 'DIRECTION_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectionNum() {
        checkSpecifiedProperty("directionNum");
        return convertEmptyToNull(_directionNum);
    }

    /**
     * [set] DIRECTION_NUM: {varchar(255)} <br>
     * さしず数量
     * @param directionNum The value of the column 'DIRECTION_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionNum(String directionNum) {
        registerModifiedProperty("directionNum");
        _directionNum = directionNum;
    }

    /**
     * [get] DIST_WAREHOUSE_CD: {varchar(255)} <br>
     * 融通先
     * @return The value of the column 'DIST_WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistWarehouseCd() {
        checkSpecifiedProperty("distWarehouseCd");
        return convertEmptyToNull(_distWarehouseCd);
    }

    /**
     * [set] DIST_WAREHOUSE_CD: {varchar(255)} <br>
     * 融通先
     * @param distWarehouseCd The value of the column 'DIST_WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistWarehouseCd(String distWarehouseCd) {
        registerModifiedProperty("distWarehouseCd");
        _distWarehouseCd = distWarehouseCd;
    }

    /**
     * [get] SYMBOL_RCV_KEY: {varchar(255)} <br>
     * 入庫キー
     * @return The value of the column 'SYMBOL_RCV_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolRcvKey() {
        checkSpecifiedProperty("symbolRcvKey");
        return convertEmptyToNull(_symbolRcvKey);
    }

    /**
     * [set] SYMBOL_RCV_KEY: {varchar(255)} <br>
     * 入庫キー
     * @param symbolRcvKey The value of the column 'SYMBOL_RCV_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolRcvKey(String symbolRcvKey) {
        registerModifiedProperty("symbolRcvKey");
        _symbolRcvKey = symbolRcvKey;
    }

    /**
     * [get] ITEM_CD: {varchar(255)} <br>
     * 倉庫内銘柄CD
     * @return The value of the column 'ITEM_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemCd() {
        checkSpecifiedProperty("itemCd");
        return convertEmptyToNull(_itemCd);
    }

    /**
     * [set] ITEM_CD: {varchar(255)} <br>
     * 倉庫内銘柄CD
     * @param itemCd The value of the column 'ITEM_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemCd(String itemCd) {
        registerModifiedProperty("itemCd");
        _itemCd = itemCd;
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
     * [get] RESESRVE_AREA: {varchar(255)} <br>
     * 予備領域
     * @return The value of the column 'RESESRVE_AREA'. (NullAllowed even if selected: for no constraint)
     */
    public String getResesrveArea() {
        checkSpecifiedProperty("resesrveArea");
        return convertEmptyToNull(_resesrveArea);
    }

    /**
     * [set] RESESRVE_AREA: {varchar(255)} <br>
     * 予備領域
     * @param resesrveArea The value of the column 'RESESRVE_AREA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setResesrveArea(String resesrveArea) {
        registerModifiedProperty("resesrveArea");
        _resesrveArea = resesrveArea;
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
