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
 * The entity of M_COMMON_CARRIER as TABLE. <br>
 * 共通運送業者マスタ
 * <pre>
 * [primary-key]
 *     COMMON_CARRIER_ID
 *
 * [column]
 *     COMMON_CARRIER_ID, CARRIER_CD, CARRIER_NM, CARRIER_ABBR, ARRIVAL_STORE_BARCODE, ARRIVAL_STORE_START_BIT, ARRIVAL_STORE_END_BIT, ARRIVAL_STORE_FORMAT, TRACKING_BARCODE, TRACKING_START_BIT, TRACKING_END_BIT, BOL_OUTPUT_TARGET_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COMMON_CARRIER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByArrivalStoreFormat)
 *
 * [referrer table]
 *     M_CARRIER, M_CARRIER_ZIP
 *
 * [foreign property]
 *     bClassDtlByArrivalStoreFormat, bClassDtlByBolOutputTargetFlg
 *
 * [referrer property]
 *     mCarrierList, mCarrierZipList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long commonCarrierId = entity.getCommonCarrierId();
 * String carrierCd = entity.getCarrierCd();
 * String carrierNm = entity.getCarrierNm();
 * String carrierAbbr = entity.getCarrierAbbr();
 * String arrivalStoreBarcode = entity.getArrivalStoreBarcode();
 * String arrivalStoreStartBit = entity.getArrivalStoreStartBit();
 * String arrivalStoreEndBit = entity.getArrivalStoreEndBit();
 * String arrivalStoreFormat = entity.getArrivalStoreFormat();
 * String trackingBarcode = entity.getTrackingBarcode();
 * String trackingStartBit = entity.getTrackingStartBit();
 * String trackingEndBit = entity.getTrackingEndBit();
 * String bolOutputTargetFlg = entity.getBolOutputTargetFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCommonCarrierId(commonCarrierId);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierNm(carrierNm);
 * entity.setCarrierAbbr(carrierAbbr);
 * entity.setArrivalStoreBarcode(arrivalStoreBarcode);
 * entity.setArrivalStoreStartBit(arrivalStoreStartBit);
 * entity.setArrivalStoreEndBit(arrivalStoreEndBit);
 * entity.setArrivalStoreFormat(arrivalStoreFormat);
 * entity.setTrackingBarcode(trackingBarcode);
 * entity.setTrackingStartBit(trackingStartBit);
 * entity.setTrackingEndBit(trackingEndBit);
 * entity.setBolOutputTargetFlg(bolOutputTargetFlg);
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
public abstract class BsMCommonCarrier extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _commonCarrierId;

    /** CARRIER_CD: {IX, NotNull, varchar(30)} */
    protected String _carrierCd;

    /** CARRIER_NM: {NotNull, varchar(60)} */
    protected String _carrierNm;

    /** CARRIER_ABBR: {varchar(60)} */
    protected String _carrierAbbr;

    /** ARRIVAL_STORE_BARCODE: {varchar(30)} */
    protected String _arrivalStoreBarcode;

    /** ARRIVAL_STORE_START_BIT: {varchar(30)} */
    protected String _arrivalStoreStartBit;

    /** ARRIVAL_STORE_END_BIT: {varchar(30)} */
    protected String _arrivalStoreEndBit;

    /** ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat} */
    protected String _arrivalStoreFormat;

    /** TRACKING_BARCODE: {varchar(30)} */
    protected String _trackingBarcode;

    /** TRACKING_START_BIT: {varchar(30)} */
    protected String _trackingStartBit;

    /** TRACKING_END_BIT: {varchar(30)} */
    protected String _trackingEndBit;

    /** BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg} */
    protected String _bolOutputTargetFlg;

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
        return "M_COMMON_CARRIER";
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
        if (_commonCarrierId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of arrivalStoreFormat as the classification of ArrivalStoreFormat. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat} <br>
     * 着店CDフォーマット
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ArrivalStoreFormat getArrivalStoreFormatAsArrivalStoreFormat() {
        return CDef.ArrivalStoreFormat.codeOf(getArrivalStoreFormat());
    }

    /**
     * Set the value of arrivalStoreFormat as the classification of ArrivalStoreFormat. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat} <br>
     * 着店CDフォーマット
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setArrivalStoreFormatAsArrivalStoreFormat(CDef.ArrivalStoreFormat cdef) {
        setArrivalStoreFormat(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of bolOutputTargetFlg as the classification of BolOutputTargetFlg. <br>
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg} <br>
     * Bill of Lading出力対象フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.BolOutputTargetFlg getBolOutputTargetFlgAsBolOutputTargetFlg() {
        return CDef.BolOutputTargetFlg.codeOf(getBolOutputTargetFlg());
    }

    /**
     * Set the value of bolOutputTargetFlg as the classification of BolOutputTargetFlg. <br>
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg} <br>
     * Bill of Lading出力対象フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setBolOutputTargetFlgAsBolOutputTargetFlg(CDef.BolOutputTargetFlg cdef) {
        setBolOutputTargetFlg(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of arrivalStoreFormat as $YMTFMT (YMTFMT). <br>
     * $YMTFMT: ヤマト用変換フォーマット
     */
    public void setArrivalStoreFormat_$YMTFMT() {
        setArrivalStoreFormatAsArrivalStoreFormat(CDef.ArrivalStoreFormat.$YMTFMT);
    }

    /**
     * Set the value of arrivalStoreFormat as $YUPKFMT (YUPKFMT). <br>
     * $YUPKFMT: ゆうパック用変換フォーマット
     */
    public void setArrivalStoreFormat_$YUPKFMT() {
        setArrivalStoreFormatAsArrivalStoreFormat(CDef.ArrivalStoreFormat.$YUPKFMT);
    }

    /**
     * Set the value of bolOutputTargetFlg as $0 (0). <br>
     * $0: 対象外
     */
    public void setBolOutputTargetFlg_$0() {
        setBolOutputTargetFlgAsBolOutputTargetFlg(CDef.BolOutputTargetFlg.$0);
    }

    /**
     * Set the value of bolOutputTargetFlg as $1 (1). <br>
     * $1: 対象
     */
    public void setBolOutputTargetFlg_$1() {
        setBolOutputTargetFlgAsBolOutputTargetFlg(CDef.BolOutputTargetFlg.$1);
    }

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
     * Is the value of arrivalStoreFormat $YMTFMT? <br>
     * $YMTFMT: ヤマト用変換フォーマット
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isArrivalStoreFormat$YMTFMT() {
        CDef.ArrivalStoreFormat cdef = getArrivalStoreFormatAsArrivalStoreFormat();
        return cdef != null ? cdef.equals(CDef.ArrivalStoreFormat.$YMTFMT) : false;
    }

    /**
     * Is the value of arrivalStoreFormat $YUPKFMT? <br>
     * $YUPKFMT: ゆうパック用変換フォーマット
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isArrivalStoreFormat$YUPKFMT() {
        CDef.ArrivalStoreFormat cdef = getArrivalStoreFormatAsArrivalStoreFormat();
        return cdef != null ? cdef.equals(CDef.ArrivalStoreFormat.$YUPKFMT) : false;
    }

    /**
     * Is the value of bolOutputTargetFlg $0? <br>
     * $0: 対象外
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isBolOutputTargetFlg$0() {
        CDef.BolOutputTargetFlg cdef = getBolOutputTargetFlgAsBolOutputTargetFlg();
        return cdef != null ? cdef.equals(CDef.BolOutputTargetFlg.$0) : false;
    }

    /**
     * Is the value of bolOutputTargetFlg $1? <br>
     * $1: 対象
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isBolOutputTargetFlg$1() {
        CDef.BolOutputTargetFlg cdef = getBolOutputTargetFlgAsBolOutputTargetFlg();
        return cdef != null ? cdef.equals(CDef.BolOutputTargetFlg.$1) : false;
    }

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
     * Get the value of the column 'arrivalStoreFormat' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getArrivalStoreFormatName() {
        CDef.ArrivalStoreFormat cdef = getArrivalStoreFormatAsArrivalStoreFormat();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'bolOutputTargetFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getBolOutputTargetFlgName() {
        CDef.BolOutputTargetFlg cdef = getBolOutputTargetFlgAsBolOutputTargetFlg();
        return cdef != null ? cdef.name() : null;
    }

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
    /** B_CLASS_DTL by my ARRIVAL_STORE_FORMAT, named 'BClassDtlByArrivalStoreFormat'. */
    protected BClassDtl _bClassDtlByArrivalStoreFormat;

    /**
     * [get] B_CLASS_DTL by my ARRIVAL_STORE_FORMAT, named 'BClassDtlByArrivalStoreFormat'. <br>
     * @return The entity of foreign property 'BClassDtlByArrivalStoreFormat'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByArrivalStoreFormat() {
        return _bClassDtlByArrivalStoreFormat;
    }

    /**
     * [set] B_CLASS_DTL by my ARRIVAL_STORE_FORMAT, named 'BClassDtlByArrivalStoreFormat'.
     * @param bClassDtlByArrivalStoreFormat The entity of foreign property 'BClassDtlByArrivalStoreFormat'. (NullAllowed)
     */
    public void setBClassDtlByArrivalStoreFormat(BClassDtl bClassDtlByArrivalStoreFormat) {
        _bClassDtlByArrivalStoreFormat = bClassDtlByArrivalStoreFormat;
    }

    /** B_CLASS_DTL by my BOL_OUTPUT_TARGET_FLG, named 'BClassDtlByBolOutputTargetFlg'. */
    protected BClassDtl _bClassDtlByBolOutputTargetFlg;

    /**
     * [get] B_CLASS_DTL by my BOL_OUTPUT_TARGET_FLG, named 'BClassDtlByBolOutputTargetFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByBolOutputTargetFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByBolOutputTargetFlg() {
        return _bClassDtlByBolOutputTargetFlg;
    }

    /**
     * [set] B_CLASS_DTL by my BOL_OUTPUT_TARGET_FLG, named 'BClassDtlByBolOutputTargetFlg'.
     * @param bClassDtlByBolOutputTargetFlg The entity of foreign property 'BClassDtlByBolOutputTargetFlg'. (NullAllowed)
     */
    public void setBClassDtlByBolOutputTargetFlg(BClassDtl bClassDtlByBolOutputTargetFlg) {
        _bClassDtlByBolOutputTargetFlg = bClassDtlByBolOutputTargetFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_CARRIER by COMMON_CARRIER_ID, named 'MCarrierList'. */
    protected List<MCarrier> _mCarrierList;

    /**
     * [get] M_CARRIER by COMMON_CARRIER_ID, named 'MCarrierList'.
     * @return The entity list of referrer property 'MCarrierList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrier> getMCarrierList() {
        if (_mCarrierList == null) { _mCarrierList = newReferrerList(); }
        return _mCarrierList;
    }

    /**
     * [set] M_CARRIER by COMMON_CARRIER_ID, named 'MCarrierList'.
     * @param mCarrierList The entity list of referrer property 'MCarrierList'. (NullAllowed)
     */
    public void setMCarrierList(List<MCarrier> mCarrierList) {
        _mCarrierList = mCarrierList;
    }

    /** M_CARRIER_ZIP by COMMON_CARRIER_ID, named 'MCarrierZipList'. */
    protected List<MCarrierZip> _mCarrierZipList;

    /**
     * [get] M_CARRIER_ZIP by COMMON_CARRIER_ID, named 'MCarrierZipList'.
     * @return The entity list of referrer property 'MCarrierZipList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierZip> getMCarrierZipList() {
        if (_mCarrierZipList == null) { _mCarrierZipList = newReferrerList(); }
        return _mCarrierZipList;
    }

    /**
     * [set] M_CARRIER_ZIP by COMMON_CARRIER_ID, named 'MCarrierZipList'.
     * @param mCarrierZipList The entity list of referrer property 'MCarrierZipList'. (NullAllowed)
     */
    public void setMCarrierZipList(List<MCarrierZip> mCarrierZipList) {
        _mCarrierZipList = mCarrierZipList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMCommonCarrier) {
            BsMCommonCarrier other = (BsMCommonCarrier)obj;
            if (!xSV(_commonCarrierId, other._commonCarrierId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _commonCarrierId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bClassDtlByArrivalStoreFormat != null)
        { sb.append(li).append(xbRDS(_bClassDtlByArrivalStoreFormat, "bClassDtlByArrivalStoreFormat")); }
        if (_bClassDtlByBolOutputTargetFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByBolOutputTargetFlg, "bClassDtlByBolOutputTargetFlg")); }
        if (_mCarrierList != null) { for (MCarrier et : _mCarrierList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierList")); } } }
        if (_mCarrierZipList != null) { for (MCarrierZip et : _mCarrierZipList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierZipList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_commonCarrierId));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_carrierAbbr));
        sb.append(dm).append(xfND(_arrivalStoreBarcode));
        sb.append(dm).append(xfND(_arrivalStoreStartBit));
        sb.append(dm).append(xfND(_arrivalStoreEndBit));
        sb.append(dm).append(xfND(_arrivalStoreFormat));
        sb.append(dm).append(xfND(_trackingBarcode));
        sb.append(dm).append(xfND(_trackingStartBit));
        sb.append(dm).append(xfND(_trackingEndBit));
        sb.append(dm).append(xfND(_bolOutputTargetFlg));
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
        StringBuilder sb = new StringBuilder();
        if (_bClassDtlByArrivalStoreFormat != null)
        { sb.append(dm).append("bClassDtlByArrivalStoreFormat"); }
        if (_bClassDtlByBolOutputTargetFlg != null)
        { sb.append(dm).append("bClassDtlByBolOutputTargetFlg"); }
        if (_mCarrierList != null && !_mCarrierList.isEmpty())
        { sb.append(dm).append("mCarrierList"); }
        if (_mCarrierZipList != null && !_mCarrierZipList.isEmpty())
        { sb.append(dm).append("mCarrierZipList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCommonCarrier clone() {
        return (MCommonCarrier)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通運送業者ID
     * @return The value of the column 'COMMON_CARRIER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCommonCarrierId() {
        checkSpecifiedProperty("commonCarrierId");
        return _commonCarrierId;
    }

    /**
     * [set] COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通運送業者ID
     * @param commonCarrierId The value of the column 'COMMON_CARRIER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCommonCarrierId(Long commonCarrierId) {
        registerModifiedProperty("commonCarrierId");
        _commonCarrierId = commonCarrierId;
    }

    /**
     * [get] CARRIER_CD: {IX, NotNull, varchar(30)} <br>
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getCarrierCd() {
        checkSpecifiedProperty("carrierCd");
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] CARRIER_CD: {IX, NotNull, varchar(30)} <br>
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (basically NotNull if update: for the constraint)
     */
    public void setCarrierCd(String carrierCd) {
        registerModifiedProperty("carrierCd");
        _carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {NotNull, varchar(60)} <br>
     * 運送業者名称
     * @return The value of the column 'CARRIER_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getCarrierNm() {
        checkSpecifiedProperty("carrierNm");
        return convertEmptyToNull(_carrierNm);
    }

    /**
     * [set] CARRIER_NM: {NotNull, varchar(60)} <br>
     * 運送業者名称
     * @param carrierNm The value of the column 'CARRIER_NM'. (basically NotNull if update: for the constraint)
     */
    public void setCarrierNm(String carrierNm) {
        registerModifiedProperty("carrierNm");
        _carrierNm = carrierNm;
    }

    /**
     * [get] CARRIER_ABBR: {varchar(60)} <br>
     * 運送業者略称
     * @return The value of the column 'CARRIER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierAbbr() {
        checkSpecifiedProperty("carrierAbbr");
        return convertEmptyToNull(_carrierAbbr);
    }

    /**
     * [set] CARRIER_ABBR: {varchar(60)} <br>
     * 運送業者略称
     * @param carrierAbbr The value of the column 'CARRIER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierAbbr(String carrierAbbr) {
        registerModifiedProperty("carrierAbbr");
        _carrierAbbr = carrierAbbr;
    }

    /**
     * [get] ARRIVAL_STORE_BARCODE: {varchar(30)} <br>
     * 着店CDバーコード種別
     * @return The value of the column 'ARRIVAL_STORE_BARCODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getArrivalStoreBarcode() {
        checkSpecifiedProperty("arrivalStoreBarcode");
        return convertEmptyToNull(_arrivalStoreBarcode);
    }

    /**
     * [set] ARRIVAL_STORE_BARCODE: {varchar(30)} <br>
     * 着店CDバーコード種別
     * @param arrivalStoreBarcode The value of the column 'ARRIVAL_STORE_BARCODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArrivalStoreBarcode(String arrivalStoreBarcode) {
        registerModifiedProperty("arrivalStoreBarcode");
        _arrivalStoreBarcode = arrivalStoreBarcode;
    }

    /**
     * [get] ARRIVAL_STORE_START_BIT: {varchar(30)} <br>
     * 着店CDスタートビット
     * @return The value of the column 'ARRIVAL_STORE_START_BIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getArrivalStoreStartBit() {
        checkSpecifiedProperty("arrivalStoreStartBit");
        return convertEmptyToNull(_arrivalStoreStartBit);
    }

    /**
     * [set] ARRIVAL_STORE_START_BIT: {varchar(30)} <br>
     * 着店CDスタートビット
     * @param arrivalStoreStartBit The value of the column 'ARRIVAL_STORE_START_BIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArrivalStoreStartBit(String arrivalStoreStartBit) {
        registerModifiedProperty("arrivalStoreStartBit");
        _arrivalStoreStartBit = arrivalStoreStartBit;
    }

    /**
     * [get] ARRIVAL_STORE_END_BIT: {varchar(30)} <br>
     * 着店CDエンドビット
     * @return The value of the column 'ARRIVAL_STORE_END_BIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getArrivalStoreEndBit() {
        checkSpecifiedProperty("arrivalStoreEndBit");
        return convertEmptyToNull(_arrivalStoreEndBit);
    }

    /**
     * [set] ARRIVAL_STORE_END_BIT: {varchar(30)} <br>
     * 着店CDエンドビット
     * @param arrivalStoreEndBit The value of the column 'ARRIVAL_STORE_END_BIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArrivalStoreEndBit(String arrivalStoreEndBit) {
        registerModifiedProperty("arrivalStoreEndBit");
        _arrivalStoreEndBit = arrivalStoreEndBit;
    }

    /**
     * [get] ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat} <br>
     * 着店CDフォーマット
     * @return The value of the column 'ARRIVAL_STORE_FORMAT'. (NullAllowed even if selected: for no constraint)
     */
    public String getArrivalStoreFormat() {
        checkSpecifiedProperty("arrivalStoreFormat");
        return convertEmptyToNull(_arrivalStoreFormat);
    }

    /**
     * [set] ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat} <br>
     * 着店CDフォーマット
     * @param arrivalStoreFormat The value of the column 'ARRIVAL_STORE_FORMAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArrivalStoreFormat(String arrivalStoreFormat) {
        registerModifiedProperty("arrivalStoreFormat");
        _arrivalStoreFormat = arrivalStoreFormat;
    }

    /**
     * [get] TRACKING_BARCODE: {varchar(30)} <br>
     * 追跡番号バーコード種別
     * @return The value of the column 'TRACKING_BARCODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrackingBarcode() {
        checkSpecifiedProperty("trackingBarcode");
        return convertEmptyToNull(_trackingBarcode);
    }

    /**
     * [set] TRACKING_BARCODE: {varchar(30)} <br>
     * 追跡番号バーコード種別
     * @param trackingBarcode The value of the column 'TRACKING_BARCODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrackingBarcode(String trackingBarcode) {
        registerModifiedProperty("trackingBarcode");
        _trackingBarcode = trackingBarcode;
    }

    /**
     * [get] TRACKING_START_BIT: {varchar(30)} <br>
     * 追跡番号スタートビット
     * @return The value of the column 'TRACKING_START_BIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrackingStartBit() {
        checkSpecifiedProperty("trackingStartBit");
        return convertEmptyToNull(_trackingStartBit);
    }

    /**
     * [set] TRACKING_START_BIT: {varchar(30)} <br>
     * 追跡番号スタートビット
     * @param trackingStartBit The value of the column 'TRACKING_START_BIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrackingStartBit(String trackingStartBit) {
        registerModifiedProperty("trackingStartBit");
        _trackingStartBit = trackingStartBit;
    }

    /**
     * [get] TRACKING_END_BIT: {varchar(30)} <br>
     * 追跡番号エンドビット
     * @return The value of the column 'TRACKING_END_BIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrackingEndBit() {
        checkSpecifiedProperty("trackingEndBit");
        return convertEmptyToNull(_trackingEndBit);
    }

    /**
     * [set] TRACKING_END_BIT: {varchar(30)} <br>
     * 追跡番号エンドビット
     * @param trackingEndBit The value of the column 'TRACKING_END_BIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrackingEndBit(String trackingEndBit) {
        registerModifiedProperty("trackingEndBit");
        _trackingEndBit = trackingEndBit;
    }

    /**
     * [get] BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg} <br>
     * Bill of Lading出力対象フラグ
     * @return The value of the column 'BOL_OUTPUT_TARGET_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getBolOutputTargetFlg() {
        checkSpecifiedProperty("bolOutputTargetFlg");
        return convertEmptyToNull(_bolOutputTargetFlg);
    }

    /**
     * [set] BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg} <br>
     * Bill of Lading出力対象フラグ
     * @param bolOutputTargetFlg The value of the column 'BOL_OUTPUT_TARGET_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBolOutputTargetFlg(String bolOutputTargetFlg) {
        registerModifiedProperty("bolOutputTargetFlg");
        _bolOutputTargetFlg = bolOutputTargetFlg;
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
