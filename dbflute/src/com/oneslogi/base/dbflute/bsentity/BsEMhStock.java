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
 * The entity of E_MH_STOCK as TABLE. <br>
 * 共通下位データ送信テーブル(棚在庫)
 * <pre>
 * [primary-key]
 *     MH_STOCK_ID
 *
 * [column]
 *     MH_STOCK_ID, COMPANY_CD, LINBLK, ZONE_CD, LOCNO, LOCKBN, PRODUCT_CD, TSTINVCB, TSTINVCT, TOSPLCBQA, TOSPLCTQA, TSPLCB, TSPLCT, PRESPLCBQA, PRESPLCTQA, TPRESPLCB, TPRESPLCT, TINVMDTCBS, TINVMDTCB, TINVMDTCTS, TINVMDTCT, CSPLNUN, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MH_STOCK_ID
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
 * Long mhStockId = entity.getMhStockId();
 * String companyCd = entity.getCompanyCd();
 * String linblk = entity.getLinblk();
 * String zoneCd = entity.getZoneCd();
 * String locno = entity.getLocno();
 * String lockbn = entity.getLockbn();
 * String productCd = entity.getProductCd();
 * Long tstinvcb = entity.getTstinvcb();
 * Long tstinvct = entity.getTstinvct();
 * Long tosplcbqa = entity.getTosplcbqa();
 * Long tosplctqa = entity.getTosplctqa();
 * Long tsplcb = entity.getTsplcb();
 * Long tsplct = entity.getTsplct();
 * Long presplcbqa = entity.getPresplcbqa();
 * Long presplctqa = entity.getPresplctqa();
 * Long tpresplcb = entity.getTpresplcb();
 * Long tpresplct = entity.getTpresplct();
 * String tinvmdtcbs = entity.getTinvmdtcbs();
 * Long tinvmdtcb = entity.getTinvmdtcb();
 * String tinvmdtcts = entity.getTinvmdtcts();
 * Long tinvmdtct = entity.getTinvmdtct();
 * Long csplnun = entity.getCsplnun();
 * String sendCd = entity.getSendCd();
 * String workFlg = entity.getWorkFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setMhStockId(mhStockId);
 * entity.setCompanyCd(companyCd);
 * entity.setLinblk(linblk);
 * entity.setZoneCd(zoneCd);
 * entity.setLocno(locno);
 * entity.setLockbn(lockbn);
 * entity.setProductCd(productCd);
 * entity.setTstinvcb(tstinvcb);
 * entity.setTstinvct(tstinvct);
 * entity.setTosplcbqa(tosplcbqa);
 * entity.setTosplctqa(tosplctqa);
 * entity.setTsplcb(tsplcb);
 * entity.setTsplct(tsplct);
 * entity.setPresplcbqa(presplcbqa);
 * entity.setPresplctqa(presplctqa);
 * entity.setTpresplcb(tpresplcb);
 * entity.setTpresplct(tpresplct);
 * entity.setTinvmdtcbs(tinvmdtcbs);
 * entity.setTinvmdtcb(tinvmdtcb);
 * entity.setTinvmdtcts(tinvmdtcts);
 * entity.setTinvmdtct(tinvmdtct);
 * entity.setCsplnun(csplnun);
 * entity.setSendCd(sendCd);
 * entity.setWorkFlg(workFlg);
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
public abstract class BsEMhStock extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _mhStockId;

    /** COMPANY_CD: {varchar(30)} */
    protected String _companyCd;

    /** LINBLK: {varchar(30)} */
    protected String _linblk;

    /** ZONE_CD: {varchar(30)} */
    protected String _zoneCd;

    /** LOCNO: {varchar(255)} */
    protected String _locno;

    /** LOCKBN: {char(1)} */
    protected String _lockbn;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** TSTINVCB: {bigint(19)} */
    protected Long _tstinvcb;

    /** TSTINVCT: {bigint(19)} */
    protected Long _tstinvct;

    /** TOSPLCBQA: {bigint(19)} */
    protected Long _tosplcbqa;

    /** TOSPLCTQA: {bigint(19)} */
    protected Long _tosplctqa;

    /** TSPLCB: {bigint(19)} */
    protected Long _tsplcb;

    /** TSPLCT: {bigint(19)} */
    protected Long _tsplct;

    /** PRESPLCBQA: {bigint(19)} */
    protected Long _presplcbqa;

    /** PRESPLCTQA: {bigint(19)} */
    protected Long _presplctqa;

    /** TPRESPLCB: {bigint(19)} */
    protected Long _tpresplcb;

    /** TPRESPLCT: {bigint(19)} */
    protected Long _tpresplct;

    /** TINVMDTCBS: {char(1)} */
    protected String _tinvmdtcbs;

    /** TINVMDTCB: {bigint(19)} */
    protected Long _tinvmdtcb;

    /** TINVMDTCTS: {char(1)} */
    protected String _tinvmdtcts;

    /** TINVMDTCT: {bigint(19)} */
    protected Long _tinvmdtct;

    /** CSPLNUN: {bigint(19)} */
    protected Long _csplnun;

    /** SEND_CD: {varchar(30)} */
    protected String _sendCd;

    /** WORK_FLG: {char(1)} */
    protected String _workFlg;

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
        return "E_MH_STOCK";
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
        if (_mhStockId == null) { return false; }
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
        if (obj instanceof BsEMhStock) {
            BsEMhStock other = (BsEMhStock)obj;
            if (!xSV(_mhStockId, other._mhStockId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _mhStockId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_mhStockId));
        sb.append(dm).append(xfND(_companyCd));
        sb.append(dm).append(xfND(_linblk));
        sb.append(dm).append(xfND(_zoneCd));
        sb.append(dm).append(xfND(_locno));
        sb.append(dm).append(xfND(_lockbn));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_tstinvcb));
        sb.append(dm).append(xfND(_tstinvct));
        sb.append(dm).append(xfND(_tosplcbqa));
        sb.append(dm).append(xfND(_tosplctqa));
        sb.append(dm).append(xfND(_tsplcb));
        sb.append(dm).append(xfND(_tsplct));
        sb.append(dm).append(xfND(_presplcbqa));
        sb.append(dm).append(xfND(_presplctqa));
        sb.append(dm).append(xfND(_tpresplcb));
        sb.append(dm).append(xfND(_tpresplct));
        sb.append(dm).append(xfND(_tinvmdtcbs));
        sb.append(dm).append(xfND(_tinvmdtcb));
        sb.append(dm).append(xfND(_tinvmdtcts));
        sb.append(dm).append(xfND(_tinvmdtct));
        sb.append(dm).append(xfND(_csplnun));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_workFlg));
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
    public EMhStock clone() {
        return (EMhStock)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通下位データ送信(棚在庫)ID
     * @return The value of the column 'MH_STOCK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMhStockId() {
        checkSpecifiedProperty("mhStockId");
        return _mhStockId;
    }

    /**
     * [set] MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通下位データ送信(棚在庫)ID
     * @param mhStockId The value of the column 'MH_STOCK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMhStockId(Long mhStockId) {
        registerModifiedProperty("mhStockId");
        _mhStockId = mhStockId;
    }

    /**
     * [get] COMPANY_CD: {varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'COMPANY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanyCd() {
        checkSpecifiedProperty("companyCd");
        return convertEmptyToNull(_companyCd);
    }

    /**
     * [set] COMPANY_CD: {varchar(30)} <br>
     * 組織CD
     * @param companyCd The value of the column 'COMPANY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanyCd(String companyCd) {
        registerModifiedProperty("companyCd");
        _companyCd = companyCd;
    }

    /**
     * [get] LINBLK: {varchar(30)} <br>
     * ライン/ブロック
     * @return The value of the column 'LINBLK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinblk() {
        checkSpecifiedProperty("linblk");
        return convertEmptyToNull(_linblk);
    }

    /**
     * [set] LINBLK: {varchar(30)} <br>
     * ライン/ブロック
     * @param linblk The value of the column 'LINBLK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinblk(String linblk) {
        registerModifiedProperty("linblk");
        _linblk = linblk;
    }

    /**
     * [get] ZONE_CD: {varchar(30)} <br>
     * ゾーンCD
     * @return The value of the column 'ZONE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZoneCd() {
        checkSpecifiedProperty("zoneCd");
        return convertEmptyToNull(_zoneCd);
    }

    /**
     * [set] ZONE_CD: {varchar(30)} <br>
     * ゾーンCD
     * @param zoneCd The value of the column 'ZONE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZoneCd(String zoneCd) {
        registerModifiedProperty("zoneCd");
        _zoneCd = zoneCd;
    }

    /**
     * [get] LOCNO: {varchar(255)} <br>
     * ロケーションＮｏ
     * @return The value of the column 'LOCNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocno() {
        checkSpecifiedProperty("locno");
        return convertEmptyToNull(_locno);
    }

    /**
     * [set] LOCNO: {varchar(255)} <br>
     * ロケーションＮｏ
     * @param locno The value of the column 'LOCNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocno(String locno) {
        registerModifiedProperty("locno");
        _locno = locno;
    }

    /**
     * [get] LOCKBN: {char(1)} <br>
     * ロケーション区分
     * @return The value of the column 'LOCKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getLockbn() {
        checkSpecifiedProperty("lockbn");
        return convertEmptyToNull(_lockbn);
    }

    /**
     * [set] LOCKBN: {char(1)} <br>
     * ロケーション区分
     * @param lockbn The value of the column 'LOCKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLockbn(String lockbn) {
        registerModifiedProperty("lockbn");
        _lockbn = lockbn;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] TSTINVCB: {bigint(19)} <br>
     * 当日開始在庫数(ダンボール)
     * @return The value of the column 'TSTINVCB'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTstinvcb() {
        checkSpecifiedProperty("tstinvcb");
        return _tstinvcb;
    }

    /**
     * [set] TSTINVCB: {bigint(19)} <br>
     * 当日開始在庫数(ダンボール)
     * @param tstinvcb The value of the column 'TSTINVCB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTstinvcb(Long tstinvcb) {
        registerModifiedProperty("tstinvcb");
        _tstinvcb = tstinvcb;
    }

    /**
     * [get] TSTINVCT: {bigint(19)} <br>
     * 当日開始在庫数(カートン)
     * @return The value of the column 'TSTINVCT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTstinvct() {
        checkSpecifiedProperty("tstinvct");
        return _tstinvct;
    }

    /**
     * [set] TSTINVCT: {bigint(19)} <br>
     * 当日開始在庫数(カートン)
     * @param tstinvct The value of the column 'TSTINVCT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTstinvct(Long tstinvct) {
        registerModifiedProperty("tstinvct");
        _tstinvct = tstinvct;
    }

    /**
     * [get] TOSPLCBQA: {bigint(19)} <br>
     * 今回当日補充数(ダンボール)
     * @return The value of the column 'TOSPLCBQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTosplcbqa() {
        checkSpecifiedProperty("tosplcbqa");
        return _tosplcbqa;
    }

    /**
     * [set] TOSPLCBQA: {bigint(19)} <br>
     * 今回当日補充数(ダンボール)
     * @param tosplcbqa The value of the column 'TOSPLCBQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTosplcbqa(Long tosplcbqa) {
        registerModifiedProperty("tosplcbqa");
        _tosplcbqa = tosplcbqa;
    }

    /**
     * [get] TOSPLCTQA: {bigint(19)} <br>
     * 今回当日補充数(カートン)
     * @return The value of the column 'TOSPLCTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTosplctqa() {
        checkSpecifiedProperty("tosplctqa");
        return _tosplctqa;
    }

    /**
     * [set] TOSPLCTQA: {bigint(19)} <br>
     * 今回当日補充数(カートン)
     * @param tosplctqa The value of the column 'TOSPLCTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTosplctqa(Long tosplctqa) {
        registerModifiedProperty("tosplctqa");
        _tosplctqa = tosplctqa;
    }

    /**
     * [get] TSPLCB: {bigint(19)} <br>
     * 当日補充数合計(ダンボール)
     * @return The value of the column 'TSPLCB'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTsplcb() {
        checkSpecifiedProperty("tsplcb");
        return _tsplcb;
    }

    /**
     * [set] TSPLCB: {bigint(19)} <br>
     * 当日補充数合計(ダンボール)
     * @param tsplcb The value of the column 'TSPLCB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTsplcb(Long tsplcb) {
        registerModifiedProperty("tsplcb");
        _tsplcb = tsplcb;
    }

    /**
     * [get] TSPLCT: {bigint(19)} <br>
     * 当日補充数合計(カートン)
     * @return The value of the column 'TSPLCT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTsplct() {
        checkSpecifiedProperty("tsplct");
        return _tsplct;
    }

    /**
     * [set] TSPLCT: {bigint(19)} <br>
     * 当日補充数合計(カートン)
     * @param tsplct The value of the column 'TSPLCT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTsplct(Long tsplct) {
        registerModifiedProperty("tsplct");
        _tsplct = tsplct;
    }

    /**
     * [get] PRESPLCBQA: {bigint(19)} <br>
     * 今回事前補充数(ダンボール)
     * @return The value of the column 'PRESPLCBQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPresplcbqa() {
        checkSpecifiedProperty("presplcbqa");
        return _presplcbqa;
    }

    /**
     * [set] PRESPLCBQA: {bigint(19)} <br>
     * 今回事前補充数(ダンボール)
     * @param presplcbqa The value of the column 'PRESPLCBQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPresplcbqa(Long presplcbqa) {
        registerModifiedProperty("presplcbqa");
        _presplcbqa = presplcbqa;
    }

    /**
     * [get] PRESPLCTQA: {bigint(19)} <br>
     * 今回事前補充数(カートン)
     * @return The value of the column 'PRESPLCTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPresplctqa() {
        checkSpecifiedProperty("presplctqa");
        return _presplctqa;
    }

    /**
     * [set] PRESPLCTQA: {bigint(19)} <br>
     * 今回事前補充数(カートン)
     * @param presplctqa The value of the column 'PRESPLCTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPresplctqa(Long presplctqa) {
        registerModifiedProperty("presplctqa");
        _presplctqa = presplctqa;
    }

    /**
     * [get] TPRESPLCB: {bigint(19)} <br>
     * 当日事前補充数合計(ダンボール)
     * @return The value of the column 'TPRESPLCB'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTpresplcb() {
        checkSpecifiedProperty("tpresplcb");
        return _tpresplcb;
    }

    /**
     * [set] TPRESPLCB: {bigint(19)} <br>
     * 当日事前補充数合計(ダンボール)
     * @param tpresplcb The value of the column 'TPRESPLCB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTpresplcb(Long tpresplcb) {
        registerModifiedProperty("tpresplcb");
        _tpresplcb = tpresplcb;
    }

    /**
     * [get] TPRESPLCT: {bigint(19)} <br>
     * 当日事前補充数合計(カートン)
     * @return The value of the column 'TPRESPLCT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTpresplct() {
        checkSpecifiedProperty("tpresplct");
        return _tpresplct;
    }

    /**
     * [set] TPRESPLCT: {bigint(19)} <br>
     * 当日事前補充数合計(カートン)
     * @param tpresplct The value of the column 'TPRESPLCT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTpresplct(Long tpresplct) {
        registerModifiedProperty("tpresplct");
        _tpresplct = tpresplct;
    }

    /**
     * [get] TINVMDTCBS: {char(1)} <br>
     * 当日在庫修正数合計(ダンボール)符号
     * @return The value of the column 'TINVMDTCBS'. (NullAllowed even if selected: for no constraint)
     */
    public String getTinvmdtcbs() {
        checkSpecifiedProperty("tinvmdtcbs");
        return convertEmptyToNull(_tinvmdtcbs);
    }

    /**
     * [set] TINVMDTCBS: {char(1)} <br>
     * 当日在庫修正数合計(ダンボール)符号
     * @param tinvmdtcbs The value of the column 'TINVMDTCBS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTinvmdtcbs(String tinvmdtcbs) {
        registerModifiedProperty("tinvmdtcbs");
        _tinvmdtcbs = tinvmdtcbs;
    }

    /**
     * [get] TINVMDTCB: {bigint(19)} <br>
     * 当日在庫修正数合計(ダンボール)
     * @return The value of the column 'TINVMDTCB'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTinvmdtcb() {
        checkSpecifiedProperty("tinvmdtcb");
        return _tinvmdtcb;
    }

    /**
     * [set] TINVMDTCB: {bigint(19)} <br>
     * 当日在庫修正数合計(ダンボール)
     * @param tinvmdtcb The value of the column 'TINVMDTCB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTinvmdtcb(Long tinvmdtcb) {
        registerModifiedProperty("tinvmdtcb");
        _tinvmdtcb = tinvmdtcb;
    }

    /**
     * [get] TINVMDTCTS: {char(1)} <br>
     * 当日在庫修正数合計(カートン)符号
     * @return The value of the column 'TINVMDTCTS'. (NullAllowed even if selected: for no constraint)
     */
    public String getTinvmdtcts() {
        checkSpecifiedProperty("tinvmdtcts");
        return convertEmptyToNull(_tinvmdtcts);
    }

    /**
     * [set] TINVMDTCTS: {char(1)} <br>
     * 当日在庫修正数合計(カートン)符号
     * @param tinvmdtcts The value of the column 'TINVMDTCTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTinvmdtcts(String tinvmdtcts) {
        registerModifiedProperty("tinvmdtcts");
        _tinvmdtcts = tinvmdtcts;
    }

    /**
     * [get] TINVMDTCT: {bigint(19)} <br>
     * 当日在庫修正数合計(カートン)
     * @return The value of the column 'TINVMDTCT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTinvmdtct() {
        checkSpecifiedProperty("tinvmdtct");
        return _tinvmdtct;
    }

    /**
     * [set] TINVMDTCT: {bigint(19)} <br>
     * 当日在庫修正数合計(カートン)
     * @param tinvmdtct The value of the column 'TINVMDTCT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTinvmdtct(Long tinvmdtct) {
        registerModifiedProperty("tinvmdtct");
        _tinvmdtct = tinvmdtct;
    }

    /**
     * [get] CSPLNUN: {bigint(19)} <br>
     * 今回補充回数
     * @return The value of the column 'CSPLNUN'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCsplnun() {
        checkSpecifiedProperty("csplnun");
        return _csplnun;
    }

    /**
     * [set] CSPLNUN: {bigint(19)} <br>
     * 今回補充回数
     * @param csplnun The value of the column 'CSPLNUN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCsplnun(Long csplnun) {
        registerModifiedProperty("csplnun");
        _csplnun = csplnun;
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
     * [get] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkFlg() {
        checkSpecifiedProperty("workFlg");
        return convertEmptyToNull(_workFlg);
    }

    /**
     * [set] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkFlg(String workFlg) {
        registerModifiedProperty("workFlg");
        _workFlg = workFlg;
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
