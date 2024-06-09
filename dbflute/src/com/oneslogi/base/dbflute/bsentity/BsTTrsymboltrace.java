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
 * The entity of T_TRSYMBOLTRACE as TABLE. <br>
 * 段ボール追跡情報
 * <pre>
 * [primary-key]
 *     TRSYMBOLTRACE_ID
 *
 * [column]
 *     TRSYMBOLTRACE_ID, SYMBOLTRACEKEY, TRSYMBOL_ID, CREATEDATETIME, WAREHOUSECD, TRACETYPE, INITNUM, CASEINNUM, ASSORTNUM, DIRECTIONNUM, CUSTOMERCD, DISTWAREHOUSECD, MIXEDFLG, LOCCD, PRODUCT_CD, LOT1, LOT2, LOT3, LOT4, OTHERLOT1, NOSHIPPINGFLG, IFITEMCD, SENDFLG, RCVKEY, PALLETNO, SOKEY, FAX1, ORIGINALPONO, MOSJTSENDFLG, SHIPDATE, DELIVNAME, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSYMBOLTRACE_ID
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
 * Long trsymboltraceId = entity.getTrsymboltraceId();
 * java.math.BigDecimal symboltracekey = entity.getSymboltracekey();
 * Long trsymbolId = entity.getTrsymbolId();
 * String createdatetime = entity.getCreatedatetime();
 * String warehousecd = entity.getWarehousecd();
 * String tracetype = entity.getTracetype();
 * Long initnum = entity.getInitnum();
 * Long caseinnum = entity.getCaseinnum();
 * Long assortnum = entity.getAssortnum();
 * Long directionnum = entity.getDirectionnum();
 * String customercd = entity.getCustomercd();
 * String distwarehousecd = entity.getDistwarehousecd();
 * String mixedflg = entity.getMixedflg();
 * String loccd = entity.getLoccd();
 * String productCd = entity.getProductCd();
 * String lot1 = entity.getLot1();
 * String lot2 = entity.getLot2();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String otherlot1 = entity.getOtherlot1();
 * java.math.BigDecimal noshippingflg = entity.getNoshippingflg();
 * String ifitemcd = entity.getIfitemcd();
 * java.math.BigDecimal sendflg = entity.getSendflg();
 * java.math.BigDecimal rcvkey = entity.getRcvkey();
 * java.math.BigDecimal palletno = entity.getPalletno();
 * java.math.BigDecimal sokey = entity.getSokey();
 * String fax1 = entity.getFax1();
 * String originalpono = entity.getOriginalpono();
 * String mosjtsendflg = entity.getMosjtsendflg();
 * String shipdate = entity.getShipdate();
 * String delivname = entity.getDelivname();
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
 * entity.setTrsymboltraceId(trsymboltraceId);
 * entity.setSymboltracekey(symboltracekey);
 * entity.setTrsymbolId(trsymbolId);
 * entity.setCreatedatetime(createdatetime);
 * entity.setWarehousecd(warehousecd);
 * entity.setTracetype(tracetype);
 * entity.setInitnum(initnum);
 * entity.setCaseinnum(caseinnum);
 * entity.setAssortnum(assortnum);
 * entity.setDirectionnum(directionnum);
 * entity.setCustomercd(customercd);
 * entity.setDistwarehousecd(distwarehousecd);
 * entity.setMixedflg(mixedflg);
 * entity.setLoccd(loccd);
 * entity.setProductCd(productCd);
 * entity.setLot1(lot1);
 * entity.setLot2(lot2);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setOtherlot1(otherlot1);
 * entity.setNoshippingflg(noshippingflg);
 * entity.setIfitemcd(ifitemcd);
 * entity.setSendflg(sendflg);
 * entity.setRcvkey(rcvkey);
 * entity.setPalletno(palletno);
 * entity.setSokey(sokey);
 * entity.setFax1(fax1);
 * entity.setOriginalpono(originalpono);
 * entity.setMosjtsendflg(mosjtsendflg);
 * entity.setShipdate(shipdate);
 * entity.setDelivname(delivname);
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
public abstract class BsTTrsymboltrace extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)} */
    protected Long _trsymboltraceId;

    /** SYMBOLTRACEKEY: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _symboltracekey;

    /** TRSYMBOL_ID: {IX+, bigint(19)} */
    protected Long _trsymbolId;

    /** CREATEDATETIME: {varchar(8)} */
    protected String _createdatetime;

    /** WAREHOUSECD: {IX, varchar(30)} */
    protected String _warehousecd;

    /** TRACETYPE: {varchar(30)} */
    protected String _tracetype;

    /** INITNUM: {bigint(19)} */
    protected Long _initnum;

    /** CASEINNUM: {bigint(19)} */
    protected Long _caseinnum;

    /** ASSORTNUM: {bigint(19)} */
    protected Long _assortnum;

    /** DIRECTIONNUM: {bigint(19)} */
    protected Long _directionnum;

    /** CUSTOMERCD: {varchar(30)} */
    protected String _customercd;

    /** DISTWAREHOUSECD: {varchar(30)} */
    protected String _distwarehousecd;

    /** MIXEDFLG: {char(1)} */
    protected String _mixedflg;

    /** LOCCD: {varchar(30)} */
    protected String _loccd;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT2: {varchar(60)} */
    protected String _lot2;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** OTHERLOT1: {varchar(60)} */
    protected String _otherlot1;

    /** NOSHIPPINGFLG: {decimal(16, 6)} */
    protected java.math.BigDecimal _noshippingflg;

    /** IFITEMCD: {varchar(30)} */
    protected String _ifitemcd;

    /** SENDFLG: {IX+, decimal(16, 6)} */
    protected java.math.BigDecimal _sendflg;

    /** RCVKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _rcvkey;

    /** PALLETNO: {decimal(16, 6)} */
    protected java.math.BigDecimal _palletno;

    /** SOKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _sokey;

    /** FAX1: {varchar(60)} */
    protected String _fax1;

    /** ORIGINALPONO: {varchar(60)} */
    protected String _originalpono;

    /** MOSJTSENDFLG: {char(1), default=[0]} */
    protected String _mosjtsendflg;

    /** SHIPDATE: {varchar(8)} */
    protected String _shipdate;

    /** DELIVNAME: {varchar(255)} */
    protected String _delivname;

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
        return "T_TRSYMBOLTRACE";
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
        if (_trsymboltraceId == null) { return false; }
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
        if (obj instanceof BsTTrsymboltrace) {
            BsTTrsymboltrace other = (BsTTrsymboltrace)obj;
            if (!xSV(_trsymboltraceId, other._trsymboltraceId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trsymboltraceId);
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
        sb.append(dm).append(xfND(_trsymboltraceId));
        sb.append(dm).append(xfND(_symboltracekey));
        sb.append(dm).append(xfND(_trsymbolId));
        sb.append(dm).append(xfND(_createdatetime));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_tracetype));
        sb.append(dm).append(xfND(_initnum));
        sb.append(dm).append(xfND(_caseinnum));
        sb.append(dm).append(xfND(_assortnum));
        sb.append(dm).append(xfND(_directionnum));
        sb.append(dm).append(xfND(_customercd));
        sb.append(dm).append(xfND(_distwarehousecd));
        sb.append(dm).append(xfND(_mixedflg));
        sb.append(dm).append(xfND(_loccd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_otherlot1));
        sb.append(dm).append(xfND(_noshippingflg));
        sb.append(dm).append(xfND(_ifitemcd));
        sb.append(dm).append(xfND(_sendflg));
        sb.append(dm).append(xfND(_rcvkey));
        sb.append(dm).append(xfND(_palletno));
        sb.append(dm).append(xfND(_sokey));
        sb.append(dm).append(xfND(_fax1));
        sb.append(dm).append(xfND(_originalpono));
        sb.append(dm).append(xfND(_mosjtsendflg));
        sb.append(dm).append(xfND(_shipdate));
        sb.append(dm).append(xfND(_delivname));
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
    public TTrsymboltrace clone() {
        return (TTrsymboltrace)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)} <br>
     * 段ボール追跡情報ID
     * @return The value of the column 'TRSYMBOLTRACE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrsymboltraceId() {
        checkSpecifiedProperty("trsymboltraceId");
        return _trsymboltraceId;
    }

    /**
     * [set] TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)} <br>
     * 段ボール追跡情報ID
     * @param trsymboltraceId The value of the column 'TRSYMBOLTRACE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrsymboltraceId(Long trsymboltraceId) {
        registerModifiedProperty("trsymboltraceId");
        _trsymboltraceId = trsymboltraceId;
    }

    /**
     * [get] SYMBOLTRACEKEY: {NotNull, decimal(16, 6)} <br>
     * 段ボール追跡キー
     * @return The value of the column 'SYMBOLTRACEKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSymboltracekey() {
        checkSpecifiedProperty("symboltracekey");
        return _symboltracekey;
    }

    /**
     * [set] SYMBOLTRACEKEY: {NotNull, decimal(16, 6)} <br>
     * 段ボール追跡キー
     * @param symboltracekey The value of the column 'SYMBOLTRACEKEY'. (basically NotNull if update: for the constraint)
     */
    public void setSymboltracekey(java.math.BigDecimal symboltracekey) {
        registerModifiedProperty("symboltracekey");
        _symboltracekey = symboltracekey;
    }

    /**
     * [get] TRSYMBOL_ID: {IX+, bigint(19)} <br>
     * 段ボール情報ID
     * @return The value of the column 'TRSYMBOL_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrsymbolId() {
        checkSpecifiedProperty("trsymbolId");
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {IX+, bigint(19)} <br>
     * 段ボール情報ID
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrsymbolId(Long trsymbolId) {
        registerModifiedProperty("trsymbolId");
        _trsymbolId = trsymbolId;
    }

    /**
     * [get] CREATEDATETIME: {varchar(8)} <br>
     * 作成日時
     * @return The value of the column 'CREATEDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreatedatetime() {
        checkSpecifiedProperty("createdatetime");
        return convertEmptyToNull(_createdatetime);
    }

    /**
     * [set] CREATEDATETIME: {varchar(8)} <br>
     * 作成日時
     * @param createdatetime The value of the column 'CREATEDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreatedatetime(String createdatetime) {
        registerModifiedProperty("createdatetime");
        _createdatetime = createdatetime;
    }

    /**
     * [get] WAREHOUSECD: {IX, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {IX, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] TRACETYPE: {varchar(30)} <br>
     * 追跡区分
     * @return The value of the column 'TRACETYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTracetype() {
        checkSpecifiedProperty("tracetype");
        return convertEmptyToNull(_tracetype);
    }

    /**
     * [set] TRACETYPE: {varchar(30)} <br>
     * 追跡区分
     * @param tracetype The value of the column 'TRACETYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTracetype(String tracetype) {
        registerModifiedProperty("tracetype");
        _tracetype = tracetype;
    }

    /**
     * [get] INITNUM: {bigint(19)} <br>
     * ケース初期数量
     * @return The value of the column 'INITNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInitnum() {
        checkSpecifiedProperty("initnum");
        return _initnum;
    }

    /**
     * [set] INITNUM: {bigint(19)} <br>
     * ケース初期数量
     * @param initnum The value of the column 'INITNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInitnum(Long initnum) {
        registerModifiedProperty("initnum");
        _initnum = initnum;
    }

    /**
     * [get] CASEINNUM: {bigint(19)} <br>
     * ケース内数量
     * @return The value of the column 'CASEINNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCaseinnum() {
        checkSpecifiedProperty("caseinnum");
        return _caseinnum;
    }

    /**
     * [set] CASEINNUM: {bigint(19)} <br>
     * ケース内数量
     * @param caseinnum The value of the column 'CASEINNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseinnum(Long caseinnum) {
        registerModifiedProperty("caseinnum");
        _caseinnum = caseinnum;
    }

    /**
     * [get] ASSORTNUM: {bigint(19)} <br>
     * 仕分数量
     * @return The value of the column 'ASSORTNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAssortnum() {
        checkSpecifiedProperty("assortnum");
        return _assortnum;
    }

    /**
     * [set] ASSORTNUM: {bigint(19)} <br>
     * 仕分数量
     * @param assortnum The value of the column 'ASSORTNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortnum(Long assortnum) {
        registerModifiedProperty("assortnum");
        _assortnum = assortnum;
    }

    /**
     * [get] DIRECTIONNUM: {bigint(19)} <br>
     * ケース内数量
     * @return The value of the column 'DIRECTIONNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDirectionnum() {
        checkSpecifiedProperty("directionnum");
        return _directionnum;
    }

    /**
     * [set] DIRECTIONNUM: {bigint(19)} <br>
     * ケース内数量
     * @param directionnum The value of the column 'DIRECTIONNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionnum(Long directionnum) {
        registerModifiedProperty("directionnum");
        _directionnum = directionnum;
    }

    /**
     * [get] CUSTOMERCD: {varchar(30)} <br>
     * お得意様CD
     * @return The value of the column 'CUSTOMERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomercd() {
        checkSpecifiedProperty("customercd");
        return convertEmptyToNull(_customercd);
    }

    /**
     * [set] CUSTOMERCD: {varchar(30)} <br>
     * お得意様CD
     * @param customercd The value of the column 'CUSTOMERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomercd(String customercd) {
        registerModifiedProperty("customercd");
        _customercd = customercd;
    }

    /**
     * [get] DISTWAREHOUSECD: {varchar(30)} <br>
     * 融通先CD
     * @return The value of the column 'DISTWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistwarehousecd() {
        checkSpecifiedProperty("distwarehousecd");
        return convertEmptyToNull(_distwarehousecd);
    }

    /**
     * [set] DISTWAREHOUSECD: {varchar(30)} <br>
     * 融通先CD
     * @param distwarehousecd The value of the column 'DISTWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistwarehousecd(String distwarehousecd) {
        registerModifiedProperty("distwarehousecd");
        _distwarehousecd = distwarehousecd;
    }

    /**
     * [get] MIXEDFLG: {char(1)} <br>
     * 疑いフラグ
     * @return The value of the column 'MIXEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMixedflg() {
        checkSpecifiedProperty("mixedflg");
        return convertEmptyToNull(_mixedflg);
    }

    /**
     * [set] MIXEDFLG: {char(1)} <br>
     * 疑いフラグ
     * @param mixedflg The value of the column 'MIXEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMixedflg(String mixedflg) {
        registerModifiedProperty("mixedflg");
        _mixedflg = mixedflg;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLoccd() {
        checkSpecifiedProperty("loccd");
        return convertEmptyToNull(_loccd);
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * ロケーションCD
     * @param loccd The value of the column 'LOCCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoccd(String loccd) {
        registerModifiedProperty("loccd");
        _loccd = loccd;
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
     * [get] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(60)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot4() {
        checkSpecifiedProperty("lot4");
        return convertEmptyToNull(_lot4);
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot4(String lot4) {
        registerModifiedProperty("lot4");
        _lot4 = lot4;
    }

    /**
     * [get] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @return The value of the column 'OTHERLOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot1() {
        checkSpecifiedProperty("otherlot1");
        return convertEmptyToNull(_otherlot1);
    }

    /**
     * [set] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot1(String otherlot1) {
        registerModifiedProperty("otherlot1");
        _otherlot1 = otherlot1;
    }

    /**
     * [get] NOSHIPPINGFLG: {decimal(16, 6)} <br>
     * 出庫禁止フラグ
     * @return The value of the column 'NOSHIPPINGFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNoshippingflg() {
        checkSpecifiedProperty("noshippingflg");
        return _noshippingflg;
    }

    /**
     * [set] NOSHIPPINGFLG: {decimal(16, 6)} <br>
     * 出庫禁止フラグ
     * @param noshippingflg The value of the column 'NOSHIPPINGFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNoshippingflg(java.math.BigDecimal noshippingflg) {
        registerModifiedProperty("noshippingflg");
        _noshippingflg = noshippingflg;
    }

    /**
     * [get] IFITEMCD: {varchar(30)} <br>
     * 需給CD
     * @return The value of the column 'IFITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getIfitemcd() {
        checkSpecifiedProperty("ifitemcd");
        return convertEmptyToNull(_ifitemcd);
    }

    /**
     * [set] IFITEMCD: {varchar(30)} <br>
     * 需給CD
     * @param ifitemcd The value of the column 'IFITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfitemcd(String ifitemcd) {
        registerModifiedProperty("ifitemcd");
        _ifitemcd = ifitemcd;
    }

    /**
     * [get] SENDFLG: {IX+, decimal(16, 6)} <br>
     * 製品追跡送信済フラグ
     * @return The value of the column 'SENDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSendflg() {
        checkSpecifiedProperty("sendflg");
        return _sendflg;
    }

    /**
     * [set] SENDFLG: {IX+, decimal(16, 6)} <br>
     * 製品追跡送信済フラグ
     * @param sendflg The value of the column 'SENDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendflg(java.math.BigDecimal sendflg) {
        registerModifiedProperty("sendflg");
        _sendflg = sendflg;
    }

    /**
     * [get] RCVKEY: {decimal(16, 6)} <br>
     * 入庫キー
     * @return The value of the column 'RCVKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRcvkey() {
        checkSpecifiedProperty("rcvkey");
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {decimal(16, 6)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        registerModifiedProperty("rcvkey");
        _rcvkey = rcvkey;
    }

    /**
     * [get] PALLETNO: {decimal(16, 6)} <br>
     * パレット管理番号
     * @return The value of the column 'PALLETNO'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPalletno() {
        checkSpecifiedProperty("palletno");
        return _palletno;
    }

    /**
     * [set] PALLETNO: {decimal(16, 6)} <br>
     * パレット管理番号
     * @param palletno The value of the column 'PALLETNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletno(java.math.BigDecimal palletno) {
        registerModifiedProperty("palletno");
        _palletno = palletno;
    }

    /**
     * [get] SOKEY: {decimal(16, 6)} <br>
     * 出庫指示Ｋｅｙ
     * @return The value of the column 'SOKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSokey() {
        checkSpecifiedProperty("sokey");
        return _sokey;
    }

    /**
     * [set] SOKEY: {decimal(16, 6)} <br>
     * 出庫指示Ｋｅｙ
     * @param sokey The value of the column 'SOKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSokey(java.math.BigDecimal sokey) {
        registerModifiedProperty("sokey");
        _sokey = sokey;
    }

    /**
     * [get] FAX1: {varchar(60)} <br>
     * 出庫経路区分
     * @return The value of the column 'FAX1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFax1() {
        checkSpecifiedProperty("fax1");
        return convertEmptyToNull(_fax1);
    }

    /**
     * [set] FAX1: {varchar(60)} <br>
     * 出庫経路区分
     * @param fax1 The value of the column 'FAX1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFax1(String fax1) {
        registerModifiedProperty("fax1");
        _fax1 = fax1;
    }

    /**
     * [get] ORIGINALPONO: {varchar(60)} <br>
     * 特約店CD
     * @return The value of the column 'ORIGINALPONO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOriginalpono() {
        checkSpecifiedProperty("originalpono");
        return convertEmptyToNull(_originalpono);
    }

    /**
     * [set] ORIGINALPONO: {varchar(60)} <br>
     * 特約店CD
     * @param originalpono The value of the column 'ORIGINALPONO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOriginalpono(String originalpono) {
        registerModifiedProperty("originalpono");
        _originalpono = originalpono;
    }

    /**
     * [get] MOSJTSENDFLG: {char(1), default=[0]} <br>
     * ＭＯＳ国産送信フラグ
     * @return The value of the column 'MOSJTSENDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMosjtsendflg() {
        checkSpecifiedProperty("mosjtsendflg");
        return convertEmptyToNull(_mosjtsendflg);
    }

    /**
     * [set] MOSJTSENDFLG: {char(1), default=[0]} <br>
     * ＭＯＳ国産送信フラグ
     * @param mosjtsendflg The value of the column 'MOSJTSENDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMosjtsendflg(String mosjtsendflg) {
        registerModifiedProperty("mosjtsendflg");
        _mosjtsendflg = mosjtsendflg;
    }

    /**
     * [get] SHIPDATE: {varchar(8)} <br>
     * 出庫実績日
     * @return The value of the column 'SHIPDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipdate() {
        checkSpecifiedProperty("shipdate");
        return convertEmptyToNull(_shipdate);
    }

    /**
     * [set] SHIPDATE: {varchar(8)} <br>
     * 出庫実績日
     * @param shipdate The value of the column 'SHIPDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipdate(String shipdate) {
        registerModifiedProperty("shipdate");
        _shipdate = shipdate;
    }

    /**
     * [get] DELIVNAME: {varchar(255)} <br>
     * 出庫先名称
     * @return The value of the column 'DELIVNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivname() {
        checkSpecifiedProperty("delivname");
        return convertEmptyToNull(_delivname);
    }

    /**
     * [set] DELIVNAME: {varchar(255)} <br>
     * 出庫先名称
     * @param delivname The value of the column 'DELIVNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivname(String delivname) {
        registerModifiedProperty("delivname");
        _delivname = delivname;
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
