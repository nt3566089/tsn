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
 * The entity of P_PRINT_REQUEST_BINARY as TABLE. <br>
 * 印刷データ情報(バイナリファイル)
 * <pre>
 * [primary-key]
 *     PRINT_REQUEST_BINARY_ID
 *
 * [column]
 *     PRINT_REQUEST_BINARY_ID, PRINT_REQUEST_ID, SRC_FILE_INDEX, REPORT_BINARY, PRINT_CUSTOM_RANGE_FLG, PRINT_FIRST_PAGE, PRINT_LAST_PAGE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_REQUEST_BINARY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_PRINT_REQUEST
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pPrintRequest
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long printRequestBinaryId = entity.getPrintRequestBinaryId();
 * Long printRequestId = entity.getPrintRequestId();
 * Long srcFileIndex = entity.getSrcFileIndex();
 * byte[] reportBinary = entity.getReportBinary();
 * String printCustomRangeFlg = entity.getPrintCustomRangeFlg();
 * Long printFirstPage = entity.getPrintFirstPage();
 * Long printLastPage = entity.getPrintLastPage();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPrintRequestBinaryId(printRequestBinaryId);
 * entity.setPrintRequestId(printRequestId);
 * entity.setSrcFileIndex(srcFileIndex);
 * entity.setReportBinary(reportBinary);
 * entity.setPrintCustomRangeFlg(printCustomRangeFlg);
 * entity.setPrintFirstPage(printFirstPage);
 * entity.setPrintLastPage(printLastPage);
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
public abstract class BsPPrintRequestBinary extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _printRequestBinaryId;

    /** PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} */
    protected Long _printRequestId;

    /** SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)} */
    protected Long _srcFileIndex;

    /** REPORT_BINARY: {varbinary(2147483647)} */
    protected byte[] _reportBinary;

    /** PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)} */
    protected String _printCustomRangeFlg;

    /** PRINT_FIRST_PAGE: {bigint(19)} */
    protected Long _printFirstPage;

    /** PRINT_LAST_PAGE: {bigint(19)} */
    protected Long _printLastPage;

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
        return "P_PRINT_REQUEST_BINARY";
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
        if (_printRequestBinaryId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param printRequestId : UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST. (NotNull)
     * @param srcFileIndex : +UQ, NotNull, bigint(19). (NotNull)
     */
    public void uniqueBy(Long printRequestId, Long srcFileIndex) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("printRequestId");
        __uniqueDrivenProperties.addPropertyName("srcFileIndex");
        setPrintRequestId(printRequestId);setSrcFileIndex(srcFileIndex);
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
    /** P_PRINT_REQUEST by my PRINT_REQUEST_ID, named 'PPrintRequest'. */
    protected PPrintRequest _pPrintRequest;

    /**
     * [get] P_PRINT_REQUEST by my PRINT_REQUEST_ID, named 'PPrintRequest'. <br>
     * @return The entity of foreign property 'PPrintRequest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public PPrintRequest getPPrintRequest() {
        return _pPrintRequest;
    }

    /**
     * [set] P_PRINT_REQUEST by my PRINT_REQUEST_ID, named 'PPrintRequest'.
     * @param pPrintRequest The entity of foreign property 'PPrintRequest'. (NullAllowed)
     */
    public void setPPrintRequest(PPrintRequest pPrintRequest) {
        _pPrintRequest = pPrintRequest;
    }

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
        if (obj instanceof BsPPrintRequestBinary) {
            BsPPrintRequestBinary other = (BsPPrintRequestBinary)obj;
            if (!xSV(_printRequestBinaryId, other._printRequestBinaryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _printRequestBinaryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_pPrintRequest != null)
        { sb.append(li).append(xbRDS(_pPrintRequest, "pPrintRequest")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_printRequestBinaryId));
        sb.append(dm).append(xfND(_printRequestId));
        sb.append(dm).append(xfND(_srcFileIndex));
        sb.append(dm).append(xfBA(_reportBinary));
        sb.append(dm).append(xfND(_printCustomRangeFlg));
        sb.append(dm).append(xfND(_printFirstPage));
        sb.append(dm).append(xfND(_printLastPage));
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
        if (_pPrintRequest != null)
        { sb.append(dm).append("pPrintRequest"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public PPrintRequestBinary clone() {
        return (PPrintRequestBinary)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷データ情報(バイナリ)ID
     * @return The value of the column 'PRINT_REQUEST_BINARY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintRequestBinaryId() {
        checkSpecifiedProperty("printRequestBinaryId");
        return _printRequestBinaryId;
    }

    /**
     * [set] PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷データ情報(バイナリ)ID
     * @param printRequestBinaryId The value of the column 'PRINT_REQUEST_BINARY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrintRequestBinaryId(Long printRequestBinaryId) {
        registerModifiedProperty("printRequestBinaryId");
        _printRequestBinaryId = printRequestBinaryId;
    }

    /**
     * [get] PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} <br>
     * 印刷情報ID
     * @return The value of the column 'PRINT_REQUEST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintRequestId() {
        checkSpecifiedProperty("printRequestId");
        return _printRequestId;
    }

    /**
     * [set] PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} <br>
     * 印刷情報ID
     * @param printRequestId The value of the column 'PRINT_REQUEST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrintRequestId(Long printRequestId) {
        registerModifiedProperty("printRequestId");
        _printRequestId = printRequestId;
    }

    /**
     * [get] SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)} <br>
     * ファイル番号
     * @return The value of the column 'SRC_FILE_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public Long getSrcFileIndex() {
        checkSpecifiedProperty("srcFileIndex");
        return _srcFileIndex;
    }

    /**
     * [set] SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)} <br>
     * ファイル番号
     * @param srcFileIndex The value of the column 'SRC_FILE_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setSrcFileIndex(Long srcFileIndex) {
        registerModifiedProperty("srcFileIndex");
        _srcFileIndex = srcFileIndex;
    }

    /**
     * [get] REPORT_BINARY: {varbinary(2147483647)} <br>
     * 帳票バイナリデータ
     * @return The value of the column 'REPORT_BINARY'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getReportBinary() {
        checkSpecifiedProperty("reportBinary");
        return _reportBinary;
    }

    /**
     * [set] REPORT_BINARY: {varbinary(2147483647)} <br>
     * 帳票バイナリデータ
     * @param reportBinary The value of the column 'REPORT_BINARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReportBinary(byte[] reportBinary) {
        registerModifiedProperty("reportBinary");
        _reportBinary = reportBinary;
    }

    /**
     * [get] PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)} <br>
     * ページ指定印刷有無
     * @return The value of the column 'PRINT_CUSTOM_RANGE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintCustomRangeFlg() {
        checkSpecifiedProperty("printCustomRangeFlg");
        return convertEmptyToNull(_printCustomRangeFlg);
    }

    /**
     * [set] PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)} <br>
     * ページ指定印刷有無
     * @param printCustomRangeFlg The value of the column 'PRINT_CUSTOM_RANGE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setPrintCustomRangeFlg(String printCustomRangeFlg) {
        registerModifiedProperty("printCustomRangeFlg");
        _printCustomRangeFlg = printCustomRangeFlg;
    }

    /**
     * [get] PRINT_FIRST_PAGE: {bigint(19)} <br>
     * 印刷開始ページ
     * @return The value of the column 'PRINT_FIRST_PAGE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPrintFirstPage() {
        checkSpecifiedProperty("printFirstPage");
        return _printFirstPage;
    }

    /**
     * [set] PRINT_FIRST_PAGE: {bigint(19)} <br>
     * 印刷開始ページ
     * @param printFirstPage The value of the column 'PRINT_FIRST_PAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintFirstPage(Long printFirstPage) {
        registerModifiedProperty("printFirstPage");
        _printFirstPage = printFirstPage;
    }

    /**
     * [get] PRINT_LAST_PAGE: {bigint(19)} <br>
     * 印刷終了ページ
     * @return The value of the column 'PRINT_LAST_PAGE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPrintLastPage() {
        checkSpecifiedProperty("printLastPage");
        return _printLastPage;
    }

    /**
     * [set] PRINT_LAST_PAGE: {bigint(19)} <br>
     * 印刷終了ページ
     * @param printLastPage The value of the column 'PRINT_LAST_PAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintLastPage(Long printLastPage) {
        registerModifiedProperty("printLastPage");
        _printLastPage = printLastPage;
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
