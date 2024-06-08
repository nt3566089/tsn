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
 * The entity of T_TRREVERSESTOCK as TABLE. <br>
 * 逆転補充情報
 * <pre>
 * [primary-key]
 *     TRREVERSESTOCK_ID
 *
 * [column]
 *     TRREVERSESTOCK_ID, TRCASESTOCKDETAIL_ID, CENTER_SYMBOL_ID, SORTSTOCKDATE, SORTSTOCKKBN, SOTEDUNIT, SORTLOCCD, PRODUCT_CD, STMANUFACTUREDATE, SOMANUFACTUREDATE, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRREVERSESTOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trreversestockId = entity.getTrreversestockId();
 * Long trcasestockdetailId = entity.getTrcasestockdetailId();
 * java.math.BigDecimal centerSymbolId = entity.getCenterSymbolId();
 * String sortstockdate = entity.getSortstockdate();
 * String sortstockkbn = entity.getSortstockkbn();
 * String sotedunit = entity.getSotedunit();
 * String sortloccd = entity.getSortloccd();
 * String productCd = entity.getProductCd();
 * String stmanufacturedate = entity.getStmanufacturedate();
 * String somanufacturedate = entity.getSomanufacturedate();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrreversestockId(trreversestockId);
 * entity.setTrcasestockdetailId(trcasestockdetailId);
 * entity.setCenterSymbolId(centerSymbolId);
 * entity.setSortstockdate(sortstockdate);
 * entity.setSortstockkbn(sortstockkbn);
 * entity.setSotedunit(sotedunit);
 * entity.setSortloccd(sortloccd);
 * entity.setProductCd(productCd);
 * entity.setStmanufacturedate(stmanufacturedate);
 * entity.setSomanufacturedate(somanufacturedate);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
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
public abstract class BsTTrreversestock extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRREVERSESTOCK_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trreversestockId;

    /** TRCASESTOCKDETAIL_ID: {NotNull, bigint(19)} */
    protected Long _trcasestockdetailId;

    /** CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _centerSymbolId;

    /** SORTSTOCKDATE: {NotNull, varchar(8)} */
    protected String _sortstockdate;

    /** SORTSTOCKKBN: {NotNull, varchar(30)} */
    protected String _sortstockkbn;

    /** SOTEDUNIT: {NotNull, varchar(30)} */
    protected String _sotedunit;

    /** SORTLOCCD: {NotNull, varchar(255)} */
    protected String _sortloccd;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** STMANUFACTUREDATE: {varchar(8)} */
    protected String _stmanufacturedate;

    /** SOMANUFACTUREDATE: {varchar(8)} */
    protected String _somanufacturedate;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

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
        return "T_TRREVERSESTOCK";
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
        if (_trreversestockId == null) { return false; }
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
    /** M_CENTER by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] M_CENTER by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

    /** M_CLIENT by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] M_CLIENT by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
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
        if (obj instanceof BsTTrreversestock) {
            BsTTrreversestock other = (BsTTrreversestock)obj;
            if (!xSV(_trreversestockId, other._trreversestockId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trreversestockId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trreversestockId));
        sb.append(dm).append(xfND(_trcasestockdetailId));
        sb.append(dm).append(xfND(_centerSymbolId));
        sb.append(dm).append(xfND(_sortstockdate));
        sb.append(dm).append(xfND(_sortstockkbn));
        sb.append(dm).append(xfND(_sotedunit));
        sb.append(dm).append(xfND(_sortloccd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_stmanufacturedate));
        sb.append(dm).append(xfND(_somanufacturedate));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
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
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrreversestock clone() {
        return (TTrreversestock)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRREVERSESTOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 逆転補充情報ID
     * @return The value of the column 'TRREVERSESTOCK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrreversestockId() {
        checkSpecifiedProperty("trreversestockId");
        return _trreversestockId;
    }

    /**
     * [set] TRREVERSESTOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 逆転補充情報ID
     * @param trreversestockId The value of the column 'TRREVERSESTOCK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrreversestockId(Long trreversestockId) {
        registerModifiedProperty("trreversestockId");
        _trreversestockId = trreversestockId;
    }

    /**
     * [get] TRCASESTOCKDETAIL_ID: {NotNull, bigint(19)} <br>
     * ケース補充明細情報ID
     * @return The value of the column 'TRCASESTOCKDETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrcasestockdetailId() {
        checkSpecifiedProperty("trcasestockdetailId");
        return _trcasestockdetailId;
    }

    /**
     * [set] TRCASESTOCKDETAIL_ID: {NotNull, bigint(19)} <br>
     * ケース補充明細情報ID
     * @param trcasestockdetailId The value of the column 'TRCASESTOCKDETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrcasestockdetailId(Long trcasestockdetailId) {
        registerModifiedProperty("trcasestockdetailId");
        _trcasestockdetailId = trcasestockdetailId;
    }

    /**
     * [get] CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)} <br>
     * 拠点シンボルID
     * @return The value of the column 'CENTER_SYMBOL_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getCenterSymbolId() {
        checkSpecifiedProperty("centerSymbolId");
        return _centerSymbolId;
    }

    /**
     * [set] CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)} <br>
     * 拠点シンボルID
     * @param centerSymbolId The value of the column 'CENTER_SYMBOL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterSymbolId(java.math.BigDecimal centerSymbolId) {
        registerModifiedProperty("centerSymbolId");
        _centerSymbolId = centerSymbolId;
    }

    /**
     * [get] SORTSTOCKDATE: {NotNull, varchar(8)} <br>
     * ラック間製品移動日
     * @return The value of the column 'SORTSTOCKDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getSortstockdate() {
        checkSpecifiedProperty("sortstockdate");
        return convertEmptyToNull(_sortstockdate);
    }

    /**
     * [set] SORTSTOCKDATE: {NotNull, varchar(8)} <br>
     * ラック間製品移動日
     * @param sortstockdate The value of the column 'SORTSTOCKDATE'. (basically NotNull if update: for the constraint)
     */
    public void setSortstockdate(String sortstockdate) {
        registerModifiedProperty("sortstockdate");
        _sortstockdate = sortstockdate;
    }

    /**
     * [get] SORTSTOCKKBN: {NotNull, varchar(30)} <br>
     * 仕分補充区分
     * @return The value of the column 'SORTSTOCKKBN'. (basically NotNull if selected: for the constraint)
     */
    public String getSortstockkbn() {
        checkSpecifiedProperty("sortstockkbn");
        return convertEmptyToNull(_sortstockkbn);
    }

    /**
     * [set] SORTSTOCKKBN: {NotNull, varchar(30)} <br>
     * 仕分補充区分
     * @param sortstockkbn The value of the column 'SORTSTOCKKBN'. (basically NotNull if update: for the constraint)
     */
    public void setSortstockkbn(String sortstockkbn) {
        registerModifiedProperty("sortstockkbn");
        _sortstockkbn = sortstockkbn;
    }

    /**
     * [get] SOTEDUNIT: {NotNull, varchar(30)} <br>
     * 補充先
     * @return The value of the column 'SOTEDUNIT'. (basically NotNull if selected: for the constraint)
     */
    public String getSotedunit() {
        checkSpecifiedProperty("sotedunit");
        return convertEmptyToNull(_sotedunit);
    }

    /**
     * [set] SOTEDUNIT: {NotNull, varchar(30)} <br>
     * 補充先
     * @param sotedunit The value of the column 'SOTEDUNIT'. (basically NotNull if update: for the constraint)
     */
    public void setSotedunit(String sotedunit) {
        registerModifiedProperty("sotedunit");
        _sotedunit = sotedunit;
    }

    /**
     * [get] SORTLOCCD: {NotNull, varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'SORTLOCCD'. (basically NotNull if selected: for the constraint)
     */
    public String getSortloccd() {
        checkSpecifiedProperty("sortloccd");
        return convertEmptyToNull(_sortloccd);
    }

    /**
     * [set] SORTLOCCD: {NotNull, varchar(255)} <br>
     * 仕分ロケ
     * @param sortloccd The value of the column 'SORTLOCCD'. (basically NotNull if update: for the constraint)
     */
    public void setSortloccd(String sortloccd) {
        registerModifiedProperty("sortloccd");
        _sortloccd = sortloccd;
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
     * [get] STMANUFACTUREDATE: {varchar(8)} <br>
     * 補充製品製造年月日
     * @return The value of the column 'STMANUFACTUREDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getStmanufacturedate() {
        checkSpecifiedProperty("stmanufacturedate");
        return convertEmptyToNull(_stmanufacturedate);
    }

    /**
     * [set] STMANUFACTUREDATE: {varchar(8)} <br>
     * 補充製品製造年月日
     * @param stmanufacturedate The value of the column 'STMANUFACTUREDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStmanufacturedate(String stmanufacturedate) {
        registerModifiedProperty("stmanufacturedate");
        _stmanufacturedate = stmanufacturedate;
    }

    /**
     * [get] SOMANUFACTUREDATE: {varchar(8)} <br>
     * 仕分ロケ内製造年月日
     * @return The value of the column 'SOMANUFACTUREDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSomanufacturedate() {
        checkSpecifiedProperty("somanufacturedate");
        return convertEmptyToNull(_somanufacturedate);
    }

    /**
     * [set] SOMANUFACTUREDATE: {varchar(8)} <br>
     * 仕分ロケ内製造年月日
     * @param somanufacturedate The value of the column 'SOMANUFACTUREDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSomanufacturedate(String somanufacturedate) {
        registerModifiedProperty("somanufacturedate");
        _somanufacturedate = somanufacturedate;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
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
