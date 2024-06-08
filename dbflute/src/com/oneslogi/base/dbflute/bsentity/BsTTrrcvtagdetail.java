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
 * The entity of T_TRRCVTAGDETAIL as TABLE. <br>
 * 入庫受入指示明細
 * <pre>
 * [primary-key]
 *     TRRCVTAGDETAIL_ID
 *
 * [column]
 *     TRRCVTAGDETAIL_ID, RCVTAGKEY, ACCEPTKEY, ACCEPTLINENO, RCVKEY, RCVLINENO, STS, OWNERCD, ITEMADMIN, PRODUCT_CD, IFITEMCD, LOT1, LOT2, LOT3, LOT4, LOT5, OTHERLOT1, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, LOGISTICSCD, WAREHOUSECD, SLOTFLG, TOLOCCD, LOCCD, LOTKEY, TAGCD, ODDSFLG, INSTRUCTQTY1, INSTRUCTQTY2, INSTRUCTQTY3, LOADQTY1, LOADQTY2, LOADQTY3, LABELPRINTEDFLG, NOTES, SOKEY, SOLINENO, TRIGGERTYPE, PROSPECTFLG, PROSPECTUPDATEFLG, SLOTTYPE, SLOTTEDUSERCD, XDOCKORDERKEY, PICKKEY, FULLPALLETKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRRCVTAGDETAIL_ID
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
 * Long trrcvtagdetailId = entity.getTrrcvtagdetailId();
 * java.math.BigDecimal rcvtagkey = entity.getRcvtagkey();
 * java.math.BigDecimal acceptkey = entity.getAcceptkey();
 * Long acceptlineno = entity.getAcceptlineno();
 * java.math.BigDecimal rcvkey = entity.getRcvkey();
 * Long rcvlineno = entity.getRcvlineno();
 * Long sts = entity.getSts();
 * String ownercd = entity.getOwnercd();
 * String itemadmin = entity.getItemadmin();
 * String productCd = entity.getProductCd();
 * String ifitemcd = entity.getIfitemcd();
 * String lot1 = entity.getLot1();
 * String lot2 = entity.getLot2();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String lot5 = entity.getLot5();
 * String otherlot1 = entity.getOtherlot1();
 * String otherlot2 = entity.getOtherlot2();
 * String otherlot3 = entity.getOtherlot3();
 * String otherlot4 = entity.getOtherlot4();
 * java.math.BigDecimal otherlot5 = entity.getOtherlot5();
 * java.math.BigDecimal damageflg = entity.getDamageflg();
 * java.math.BigDecimal noshippingflg = entity.getNoshippingflg();
 * java.math.BigDecimal foreigncargoflg = entity.getForeigncargoflg();
 * java.math.BigDecimal customsreleaseflg = entity.getCustomsreleaseflg();
 * java.math.BigDecimal taxflg = entity.getTaxflg();
 * String logisticscd = entity.getLogisticscd();
 * String warehousecd = entity.getWarehousecd();
 * java.math.BigDecimal slotflg = entity.getSlotflg();
 * String toloccd = entity.getToloccd();
 * String loccd = entity.getLoccd();
 * Long lotkey = entity.getLotkey();
 * String tagcd = entity.getTagcd();
 * java.math.BigDecimal oddsflg = entity.getOddsflg();
 * java.math.BigDecimal instructqty1 = entity.getInstructqty1();
 * Long instructqty2 = entity.getInstructqty2();
 * Long instructqty3 = entity.getInstructqty3();
 * java.math.BigDecimal loadqty1 = entity.getLoadqty1();
 * Long loadqty2 = entity.getLoadqty2();
 * Long loadqty3 = entity.getLoadqty3();
 * java.math.BigDecimal labelprintedflg = entity.getLabelprintedflg();
 * String notes = entity.getNotes();
 * java.math.BigDecimal sokey = entity.getSokey();
 * Long solineno = entity.getSolineno();
 * String triggertype = entity.getTriggertype();
 * java.math.BigDecimal prospectflg = entity.getProspectflg();
 * java.math.BigDecimal prospectupdateflg = entity.getProspectupdateflg();
 * String slottype = entity.getSlottype();
 * String slottedusercd = entity.getSlottedusercd();
 * java.math.BigDecimal xdockorderkey = entity.getXdockorderkey();
 * Long pickkey = entity.getPickkey();
 * java.math.BigDecimal fullpalletkey = entity.getFullpalletkey();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrrcvtagdetailId(trrcvtagdetailId);
 * entity.setRcvtagkey(rcvtagkey);
 * entity.setAcceptkey(acceptkey);
 * entity.setAcceptlineno(acceptlineno);
 * entity.setRcvkey(rcvkey);
 * entity.setRcvlineno(rcvlineno);
 * entity.setSts(sts);
 * entity.setOwnercd(ownercd);
 * entity.setItemadmin(itemadmin);
 * entity.setProductCd(productCd);
 * entity.setIfitemcd(ifitemcd);
 * entity.setLot1(lot1);
 * entity.setLot2(lot2);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setLot5(lot5);
 * entity.setOtherlot1(otherlot1);
 * entity.setOtherlot2(otherlot2);
 * entity.setOtherlot3(otherlot3);
 * entity.setOtherlot4(otherlot4);
 * entity.setOtherlot5(otherlot5);
 * entity.setDamageflg(damageflg);
 * entity.setNoshippingflg(noshippingflg);
 * entity.setForeigncargoflg(foreigncargoflg);
 * entity.setCustomsreleaseflg(customsreleaseflg);
 * entity.setTaxflg(taxflg);
 * entity.setLogisticscd(logisticscd);
 * entity.setWarehousecd(warehousecd);
 * entity.setSlotflg(slotflg);
 * entity.setToloccd(toloccd);
 * entity.setLoccd(loccd);
 * entity.setLotkey(lotkey);
 * entity.setTagcd(tagcd);
 * entity.setOddsflg(oddsflg);
 * entity.setInstructqty1(instructqty1);
 * entity.setInstructqty2(instructqty2);
 * entity.setInstructqty3(instructqty3);
 * entity.setLoadqty1(loadqty1);
 * entity.setLoadqty2(loadqty2);
 * entity.setLoadqty3(loadqty3);
 * entity.setLabelprintedflg(labelprintedflg);
 * entity.setNotes(notes);
 * entity.setSokey(sokey);
 * entity.setSolineno(solineno);
 * entity.setTriggertype(triggertype);
 * entity.setProspectflg(prospectflg);
 * entity.setProspectupdateflg(prospectupdateflg);
 * entity.setSlottype(slottype);
 * entity.setSlottedusercd(slottedusercd);
 * entity.setXdockorderkey(xdockorderkey);
 * entity.setPickkey(pickkey);
 * entity.setFullpalletkey(fullpalletkey);
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
public abstract class BsTTrrcvtagdetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trrcvtagdetailId;

    /** RCVTAGKEY: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _rcvtagkey;

    /** ACCEPTKEY: {IX+, decimal(16, 6)} */
    protected java.math.BigDecimal _acceptkey;

    /** ACCEPTLINENO: {bigint(19)} */
    protected Long _acceptlineno;

    /** RCVKEY: {IX+, NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _rcvkey;

    /** RCVLINENO: {NotNull, bigint(19)} */
    protected Long _rcvlineno;

    /** STS: {IX, NotNull, bigint(19)} */
    protected Long _sts;

    /** OWNERCD: {IX+, NotNull, varchar(30)} */
    protected String _ownercd;

    /** ITEMADMIN: {NotNull, varchar(30)} */
    protected String _itemadmin;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** IFITEMCD: {varchar(30)} */
    protected String _ifitemcd;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT2: {varchar(60)} */
    protected String _lot2;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** LOT5: {varchar(8)} */
    protected String _lot5;

    /** OTHERLOT1: {varchar(60)} */
    protected String _otherlot1;

    /** OTHERLOT2: {varchar(60)} */
    protected String _otherlot2;

    /** OTHERLOT3: {varchar(60)} */
    protected String _otherlot3;

    /** OTHERLOT4: {varchar(60)} */
    protected String _otherlot4;

    /** OTHERLOT5: {decimal(16, 6)} */
    protected java.math.BigDecimal _otherlot5;

    /** DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _damageflg;

    /** NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _noshippingflg;

    /** FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _foreigncargoflg;

    /** CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _customsreleaseflg;

    /** TAXFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _taxflg;

    /** LOGISTICSCD: {varchar(30)} */
    protected String _logisticscd;

    /** WAREHOUSECD: {IX+, varchar(30)} */
    protected String _warehousecd;

    /** SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _slotflg;

    /** TOLOCCD: {varchar(30)} */
    protected String _toloccd;

    /** LOCCD: {varchar(30)} */
    protected String _loccd;

    /** LOTKEY: {IX, NotNull, bigint(19)} */
    protected Long _lotkey;

    /** TAGCD: {varchar(30)} */
    protected String _tagcd;

    /** ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _oddsflg;

    /** INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _instructqty1;

    /** INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]} */
    protected Long _instructqty2;

    /** INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]} */
    protected Long _instructqty3;

    /** LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _loadqty1;

    /** LOADQTY2: {NotNull, bigint(19), default=[(0)]} */
    protected Long _loadqty2;

    /** LOADQTY3: {NotNull, bigint(19), default=[(0)]} */
    protected Long _loadqty3;

    /** LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _labelprintedflg;

    /** NOTES: {varchar(4000)} */
    protected String _notes;

    /** SOKEY: {IX+, decimal(16, 6)} */
    protected java.math.BigDecimal _sokey;

    /** SOLINENO: {bigint(19)} */
    protected Long _solineno;

    /** TRIGGERTYPE: {varchar(30)} */
    protected String _triggertype;

    /** PROSPECTFLG: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _prospectflg;

    /** PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _prospectupdateflg;

    /** SLOTTYPE: {varchar(30)} */
    protected String _slottype;

    /** SLOTTEDUSERCD: {varchar(30)} */
    protected String _slottedusercd;

    /** XDOCKORDERKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _xdockorderkey;

    /** PICKKEY: {IX, bigint(19)} */
    protected Long _pickkey;

    /** FULLPALLETKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _fullpalletkey;

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
        return "T_TRRCVTAGDETAIL";
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
        if (_trrcvtagdetailId == null) { return false; }
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
        if (obj instanceof BsTTrrcvtagdetail) {
            BsTTrrcvtagdetail other = (BsTTrrcvtagdetail)obj;
            if (!xSV(_trrcvtagdetailId, other._trrcvtagdetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trrcvtagdetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trrcvtagdetailId));
        sb.append(dm).append(xfND(_rcvtagkey));
        sb.append(dm).append(xfND(_acceptkey));
        sb.append(dm).append(xfND(_acceptlineno));
        sb.append(dm).append(xfND(_rcvkey));
        sb.append(dm).append(xfND(_rcvlineno));
        sb.append(dm).append(xfND(_sts));
        sb.append(dm).append(xfND(_ownercd));
        sb.append(dm).append(xfND(_itemadmin));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_ifitemcd));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot5));
        sb.append(dm).append(xfND(_otherlot1));
        sb.append(dm).append(xfND(_otherlot2));
        sb.append(dm).append(xfND(_otherlot3));
        sb.append(dm).append(xfND(_otherlot4));
        sb.append(dm).append(xfND(_otherlot5));
        sb.append(dm).append(xfND(_damageflg));
        sb.append(dm).append(xfND(_noshippingflg));
        sb.append(dm).append(xfND(_foreigncargoflg));
        sb.append(dm).append(xfND(_customsreleaseflg));
        sb.append(dm).append(xfND(_taxflg));
        sb.append(dm).append(xfND(_logisticscd));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_slotflg));
        sb.append(dm).append(xfND(_toloccd));
        sb.append(dm).append(xfND(_loccd));
        sb.append(dm).append(xfND(_lotkey));
        sb.append(dm).append(xfND(_tagcd));
        sb.append(dm).append(xfND(_oddsflg));
        sb.append(dm).append(xfND(_instructqty1));
        sb.append(dm).append(xfND(_instructqty2));
        sb.append(dm).append(xfND(_instructqty3));
        sb.append(dm).append(xfND(_loadqty1));
        sb.append(dm).append(xfND(_loadqty2));
        sb.append(dm).append(xfND(_loadqty3));
        sb.append(dm).append(xfND(_labelprintedflg));
        sb.append(dm).append(xfND(_notes));
        sb.append(dm).append(xfND(_sokey));
        sb.append(dm).append(xfND(_solineno));
        sb.append(dm).append(xfND(_triggertype));
        sb.append(dm).append(xfND(_prospectflg));
        sb.append(dm).append(xfND(_prospectupdateflg));
        sb.append(dm).append(xfND(_slottype));
        sb.append(dm).append(xfND(_slottedusercd));
        sb.append(dm).append(xfND(_xdockorderkey));
        sb.append(dm).append(xfND(_pickkey));
        sb.append(dm).append(xfND(_fullpalletkey));
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
    public TTrrcvtagdetail clone() {
        return (TTrrcvtagdetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫受入指示明細ID
     * @return The value of the column 'TRRCVTAGDETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrrcvtagdetailId() {
        checkSpecifiedProperty("trrcvtagdetailId");
        return _trrcvtagdetailId;
    }

    /**
     * [set] TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫受入指示明細ID
     * @param trrcvtagdetailId The value of the column 'TRRCVTAGDETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrrcvtagdetailId(Long trrcvtagdetailId) {
        registerModifiedProperty("trrcvtagdetailId");
        _trrcvtagdetailId = trrcvtagdetailId;
    }

    /**
     * [get] RCVTAGKEY: {NotNull, decimal(16, 6)} <br>
     * 入庫積付指示Ｋｅｙ
     * @return The value of the column 'RCVTAGKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRcvtagkey() {
        checkSpecifiedProperty("rcvtagkey");
        return _rcvtagkey;
    }

    /**
     * [set] RCVTAGKEY: {NotNull, decimal(16, 6)} <br>
     * 入庫積付指示Ｋｅｙ
     * @param rcvtagkey The value of the column 'RCVTAGKEY'. (basically NotNull if update: for the constraint)
     */
    public void setRcvtagkey(java.math.BigDecimal rcvtagkey) {
        registerModifiedProperty("rcvtagkey");
        _rcvtagkey = rcvtagkey;
    }

    /**
     * [get] ACCEPTKEY: {IX+, decimal(16, 6)} <br>
     * 入庫受付Ｋｅｙ
     * @return The value of the column 'ACCEPTKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAcceptkey() {
        checkSpecifiedProperty("acceptkey");
        return _acceptkey;
    }

    /**
     * [set] ACCEPTKEY: {IX+, decimal(16, 6)} <br>
     * 入庫受付Ｋｅｙ
     * @param acceptkey The value of the column 'ACCEPTKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAcceptkey(java.math.BigDecimal acceptkey) {
        registerModifiedProperty("acceptkey");
        _acceptkey = acceptkey;
    }

    /**
     * [get] ACCEPTLINENO: {bigint(19)} <br>
     * 入庫受付行№
     * @return The value of the column 'ACCEPTLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAcceptlineno() {
        checkSpecifiedProperty("acceptlineno");
        return _acceptlineno;
    }

    /**
     * [set] ACCEPTLINENO: {bigint(19)} <br>
     * 入庫受付行№
     * @param acceptlineno The value of the column 'ACCEPTLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAcceptlineno(Long acceptlineno) {
        registerModifiedProperty("acceptlineno");
        _acceptlineno = acceptlineno;
    }

    /**
     * [get] RCVKEY: {IX+, NotNull, decimal(16, 6)} <br>
     * 入庫Ｋｅｙ
     * @return The value of the column 'RCVKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRcvkey() {
        checkSpecifiedProperty("rcvkey");
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {IX+, NotNull, decimal(16, 6)} <br>
     * 入庫Ｋｅｙ
     * @param rcvkey The value of the column 'RCVKEY'. (basically NotNull if update: for the constraint)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        registerModifiedProperty("rcvkey");
        _rcvkey = rcvkey;
    }

    /**
     * [get] RCVLINENO: {NotNull, bigint(19)} <br>
     * 入庫行№
     * @return The value of the column 'RCVLINENO'. (basically NotNull if selected: for the constraint)
     */
    public Long getRcvlineno() {
        checkSpecifiedProperty("rcvlineno");
        return _rcvlineno;
    }

    /**
     * [set] RCVLINENO: {NotNull, bigint(19)} <br>
     * 入庫行№
     * @param rcvlineno The value of the column 'RCVLINENO'. (basically NotNull if update: for the constraint)
     */
    public void setRcvlineno(Long rcvlineno) {
        registerModifiedProperty("rcvlineno");
        _rcvlineno = rcvlineno;
    }

    /**
     * [get] STS: {IX, NotNull, bigint(19)} <br>
     * ステータス
     * @return The value of the column 'STS'. (basically NotNull if selected: for the constraint)
     */
    public Long getSts() {
        checkSpecifiedProperty("sts");
        return _sts;
    }

    /**
     * [set] STS: {IX, NotNull, bigint(19)} <br>
     * ステータス
     * @param sts The value of the column 'STS'. (basically NotNull if update: for the constraint)
     */
    public void setSts(Long sts) {
        registerModifiedProperty("sts");
        _sts = sts;
    }

    /**
     * [get] OWNERCD: {IX+, NotNull, varchar(30)} <br>
     * 取引先（荷主）CD
     * @return The value of the column 'OWNERCD'. (basically NotNull if selected: for the constraint)
     */
    public String getOwnercd() {
        checkSpecifiedProperty("ownercd");
        return convertEmptyToNull(_ownercd);
    }

    /**
     * [set] OWNERCD: {IX+, NotNull, varchar(30)} <br>
     * 取引先（荷主）CD
     * @param ownercd The value of the column 'OWNERCD'. (basically NotNull if update: for the constraint)
     */
    public void setOwnercd(String ownercd) {
        registerModifiedProperty("ownercd");
        _ownercd = ownercd;
    }

    /**
     * [get] ITEMADMIN: {NotNull, varchar(30)} <br>
     * 銘柄管理社
     * @return The value of the column 'ITEMADMIN'. (basically NotNull if selected: for the constraint)
     */
    public String getItemadmin() {
        checkSpecifiedProperty("itemadmin");
        return convertEmptyToNull(_itemadmin);
    }

    /**
     * [set] ITEMADMIN: {NotNull, varchar(30)} <br>
     * 銘柄管理社
     * @param itemadmin The value of the column 'ITEMADMIN'. (basically NotNull if update: for the constraint)
     */
    public void setItemadmin(String itemadmin) {
        registerModifiedProperty("itemadmin");
        _itemadmin = itemadmin;
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
     * [get] IFITEMCD: {varchar(30)} <br>
     * I/F銘柄CD
     * @return The value of the column 'IFITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getIfitemcd() {
        checkSpecifiedProperty("ifitemcd");
        return convertEmptyToNull(_ifitemcd);
    }

    /**
     * [set] IFITEMCD: {varchar(30)} <br>
     * I/F銘柄CD
     * @param ifitemcd The value of the column 'IFITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfitemcd(String ifitemcd) {
        registerModifiedProperty("ifitemcd");
        _ifitemcd = ifitemcd;
    }

    /**
     * [get] LOT1: {varchar(60)} <br>
     * 管理１
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(60)} <br>
     * 管理１
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(60)} <br>
     * 管理２
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * 管理２
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * 管理３
     * @return The value of the column 'LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * 管理３
     * @param lot3 The value of the column 'LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 管理４（日付属性１）
     * @return The value of the column 'LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot4() {
        checkSpecifiedProperty("lot4");
        return convertEmptyToNull(_lot4);
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 管理４（日付属性１）
     * @param lot4 The value of the column 'LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot4(String lot4) {
        registerModifiedProperty("lot4");
        _lot4 = lot4;
    }

    /**
     * [get] LOT5: {varchar(8)} <br>
     * 管理５（日付属性２）
     * @return The value of the column 'LOT5'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot5() {
        checkSpecifiedProperty("lot5");
        return convertEmptyToNull(_lot5);
    }

    /**
     * [set] LOT5: {varchar(8)} <br>
     * 管理５（日付属性２）
     * @param lot5 The value of the column 'LOT5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot5(String lot5) {
        registerModifiedProperty("lot5");
        _lot5 = lot5;
    }

    /**
     * [get] OTHERLOT1: {varchar(60)} <br>
     * その他属性１
     * @return The value of the column 'OTHERLOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot1() {
        checkSpecifiedProperty("otherlot1");
        return convertEmptyToNull(_otherlot1);
    }

    /**
     * [set] OTHERLOT1: {varchar(60)} <br>
     * その他属性１
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot1(String otherlot1) {
        registerModifiedProperty("otherlot1");
        _otherlot1 = otherlot1;
    }

    /**
     * [get] OTHERLOT2: {varchar(60)} <br>
     * その他属性２
     * @return The value of the column 'OTHERLOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot2() {
        checkSpecifiedProperty("otherlot2");
        return convertEmptyToNull(_otherlot2);
    }

    /**
     * [set] OTHERLOT2: {varchar(60)} <br>
     * その他属性２
     * @param otherlot2 The value of the column 'OTHERLOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot2(String otherlot2) {
        registerModifiedProperty("otherlot2");
        _otherlot2 = otherlot2;
    }

    /**
     * [get] OTHERLOT3: {varchar(60)} <br>
     * その他属性３
     * @return The value of the column 'OTHERLOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot3() {
        checkSpecifiedProperty("otherlot3");
        return convertEmptyToNull(_otherlot3);
    }

    /**
     * [set] OTHERLOT3: {varchar(60)} <br>
     * その他属性３
     * @param otherlot3 The value of the column 'OTHERLOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot3(String otherlot3) {
        registerModifiedProperty("otherlot3");
        _otherlot3 = otherlot3;
    }

    /**
     * [get] OTHERLOT4: {varchar(60)} <br>
     * その他属性４
     * @return The value of the column 'OTHERLOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot4() {
        checkSpecifiedProperty("otherlot4");
        return convertEmptyToNull(_otherlot4);
    }

    /**
     * [set] OTHERLOT4: {varchar(60)} <br>
     * その他属性４
     * @param otherlot4 The value of the column 'OTHERLOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot4(String otherlot4) {
        registerModifiedProperty("otherlot4");
        _otherlot4 = otherlot4;
    }

    /**
     * [get] OTHERLOT5: {decimal(16, 6)} <br>
     * その他属性５（数値）
     * @return The value of the column 'OTHERLOT5'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getOtherlot5() {
        checkSpecifiedProperty("otherlot5");
        return _otherlot5;
    }

    /**
     * [set] OTHERLOT5: {decimal(16, 6)} <br>
     * その他属性５（数値）
     * @param otherlot5 The value of the column 'OTHERLOT5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot5(java.math.BigDecimal otherlot5) {
        registerModifiedProperty("otherlot5");
        _otherlot5 = otherlot5;
    }

    /**
     * [get] DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 良品・不良品区分
     * @return The value of the column 'DAMAGEFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getDamageflg() {
        checkSpecifiedProperty("damageflg");
        return _damageflg;
    }

    /**
     * [set] DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 良品・不良品区分
     * @param damageflg The value of the column 'DAMAGEFLG'. (basically NotNull if update: for the constraint)
     */
    public void setDamageflg(java.math.BigDecimal damageflg) {
        registerModifiedProperty("damageflg");
        _damageflg = damageflg;
    }

    /**
     * [get] NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 出庫禁止フラグ
     * @return The value of the column 'NOSHIPPINGFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getNoshippingflg() {
        checkSpecifiedProperty("noshippingflg");
        return _noshippingflg;
    }

    /**
     * [set] NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 出庫禁止フラグ
     * @param noshippingflg The value of the column 'NOSHIPPINGFLG'. (basically NotNull if update: for the constraint)
     */
    public void setNoshippingflg(java.math.BigDecimal noshippingflg) {
        registerModifiedProperty("noshippingflg");
        _noshippingflg = noshippingflg;
    }

    /**
     * [get] FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getForeigncargoflg() {
        checkSpecifiedProperty("foreigncargoflg");
        return _foreigncargoflg;
    }

    /**
     * [set] FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (basically NotNull if update: for the constraint)
     */
    public void setForeigncargoflg(java.math.BigDecimal foreigncargoflg) {
        registerModifiedProperty("foreigncargoflg");
        _foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 通関済みフラグ
     * @return The value of the column 'CUSTOMSRELEASEFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getCustomsreleaseflg() {
        checkSpecifiedProperty("customsreleaseflg");
        return _customsreleaseflg;
    }

    /**
     * [set] CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 通関済みフラグ
     * @param customsreleaseflg The value of the column 'CUSTOMSRELEASEFLG'. (basically NotNull if update: for the constraint)
     */
    public void setCustomsreleaseflg(java.math.BigDecimal customsreleaseflg) {
        registerModifiedProperty("customsreleaseflg");
        _customsreleaseflg = customsreleaseflg;
    }

    /**
     * [get] TAXFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 税区分
     * @return The value of the column 'TAXFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTaxflg() {
        checkSpecifiedProperty("taxflg");
        return _taxflg;
    }

    /**
     * [set] TAXFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 税区分
     * @param taxflg The value of the column 'TAXFLG'. (basically NotNull if update: for the constraint)
     */
    public void setTaxflg(java.math.BigDecimal taxflg) {
        registerModifiedProperty("taxflg");
        _taxflg = taxflg;
    }

    /**
     * [get] LOGISTICSCD: {varchar(30)} <br>
     * 取引先（倉庫会社）CD
     * @return The value of the column 'LOGISTICSCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogisticscd() {
        checkSpecifiedProperty("logisticscd");
        return convertEmptyToNull(_logisticscd);
    }

    /**
     * [set] LOGISTICSCD: {varchar(30)} <br>
     * 取引先（倉庫会社）CD
     * @param logisticscd The value of the column 'LOGISTICSCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogisticscd(String logisticscd) {
        registerModifiedProperty("logisticscd");
        _logisticscd = logisticscd;
    }

    /**
     * [get] WAREHOUSECD: {IX+, varchar(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {IX+, varchar(30)} <br>
     * 倉庫CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 格納ロケーション指示フラグ
     * @return The value of the column 'SLOTFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSlotflg() {
        checkSpecifiedProperty("slotflg");
        return _slotflg;
    }

    /**
     * [set] SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 格納ロケーション指示フラグ
     * @param slotflg The value of the column 'SLOTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setSlotflg(java.math.BigDecimal slotflg) {
        registerModifiedProperty("slotflg");
        _slotflg = slotflg;
    }

    /**
     * [get] TOLOCCD: {varchar(30)} <br>
     * 格納指示ロケーションCD
     * @return The value of the column 'TOLOCCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getToloccd() {
        checkSpecifiedProperty("toloccd");
        return convertEmptyToNull(_toloccd);
    }

    /**
     * [set] TOLOCCD: {varchar(30)} <br>
     * 格納指示ロケーションCD
     * @param toloccd The value of the column 'TOLOCCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToloccd(String toloccd) {
        registerModifiedProperty("toloccd");
        _toloccd = toloccd;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * 格納実績ロケーションCD
     * @return The value of the column 'LOCCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLoccd() {
        checkSpecifiedProperty("loccd");
        return convertEmptyToNull(_loccd);
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * 格納実績ロケーションCD
     * @param loccd The value of the column 'LOCCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoccd(String loccd) {
        registerModifiedProperty("loccd");
        _loccd = loccd;
    }

    /**
     * [get] LOTKEY: {IX, NotNull, bigint(19)} <br>
     * 実績ロットＫｅｙ
     * @return The value of the column 'LOTKEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getLotkey() {
        checkSpecifiedProperty("lotkey");
        return _lotkey;
    }

    /**
     * [set] LOTKEY: {IX, NotNull, bigint(19)} <br>
     * 実績ロットＫｅｙ
     * @param lotkey The value of the column 'LOTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setLotkey(Long lotkey) {
        registerModifiedProperty("lotkey");
        _lotkey = lotkey;
    }

    /**
     * [get] TAGCD: {varchar(30)} <br>
     * 実績タグCD
     * @return The value of the column 'TAGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagcd() {
        checkSpecifiedProperty("tagcd");
        return convertEmptyToNull(_tagcd);
    }

    /**
     * [set] TAGCD: {varchar(30)} <br>
     * 実績タグCD
     * @param tagcd The value of the column 'TAGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagcd(String tagcd) {
        registerModifiedProperty("tagcd");
        _tagcd = tagcd;
    }

    /**
     * [get] ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 端数フラグ
     * @return The value of the column 'ODDSFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getOddsflg() {
        checkSpecifiedProperty("oddsflg");
        return _oddsflg;
    }

    /**
     * [set] ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 端数フラグ
     * @param oddsflg The value of the column 'ODDSFLG'. (basically NotNull if update: for the constraint)
     */
    public void setOddsflg(java.math.BigDecimal oddsflg) {
        registerModifiedProperty("oddsflg");
        _oddsflg = oddsflg;
    }

    /**
     * [get] INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫受入指示数量１（バラ）
     * @return The value of the column 'INSTRUCTQTY1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getInstructqty1() {
        checkSpecifiedProperty("instructqty1");
        return _instructqty1;
    }

    /**
     * [set] INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫受入指示数量１（バラ）
     * @param instructqty1 The value of the column 'INSTRUCTQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setInstructqty1(java.math.BigDecimal instructqty1) {
        registerModifiedProperty("instructqty1");
        _instructqty1 = instructqty1;
    }

    /**
     * [get] INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫受入指示数量２
     * @return The value of the column 'INSTRUCTQTY2'. (basically NotNull if selected: for the constraint)
     */
    public Long getInstructqty2() {
        checkSpecifiedProperty("instructqty2");
        return _instructqty2;
    }

    /**
     * [set] INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫受入指示数量２
     * @param instructqty2 The value of the column 'INSTRUCTQTY2'. (basically NotNull if update: for the constraint)
     */
    public void setInstructqty2(Long instructqty2) {
        registerModifiedProperty("instructqty2");
        _instructqty2 = instructqty2;
    }

    /**
     * [get] INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫受入指示数量３
     * @return The value of the column 'INSTRUCTQTY3'. (basically NotNull if selected: for the constraint)
     */
    public Long getInstructqty3() {
        checkSpecifiedProperty("instructqty3");
        return _instructqty3;
    }

    /**
     * [set] INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫受入指示数量３
     * @param instructqty3 The value of the column 'INSTRUCTQTY3'. (basically NotNull if update: for the constraint)
     */
    public void setInstructqty3(Long instructqty3) {
        registerModifiedProperty("instructqty3");
        _instructqty3 = instructqty3;
    }

    /**
     * [get] LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫積付格納数量１（バラ）
     * @return The value of the column 'LOADQTY1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getLoadqty1() {
        checkSpecifiedProperty("loadqty1");
        return _loadqty1;
    }

    /**
     * [set] LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫積付格納数量１（バラ）
     * @param loadqty1 The value of the column 'LOADQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setLoadqty1(java.math.BigDecimal loadqty1) {
        registerModifiedProperty("loadqty1");
        _loadqty1 = loadqty1;
    }

    /**
     * [get] LOADQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫積付格納数量２
     * @return The value of the column 'LOADQTY2'. (basically NotNull if selected: for the constraint)
     */
    public Long getLoadqty2() {
        checkSpecifiedProperty("loadqty2");
        return _loadqty2;
    }

    /**
     * [set] LOADQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫積付格納数量２
     * @param loadqty2 The value of the column 'LOADQTY2'. (basically NotNull if update: for the constraint)
     */
    public void setLoadqty2(Long loadqty2) {
        registerModifiedProperty("loadqty2");
        _loadqty2 = loadqty2;
    }

    /**
     * [get] LOADQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫積付格納数量３
     * @return The value of the column 'LOADQTY3'. (basically NotNull if selected: for the constraint)
     */
    public Long getLoadqty3() {
        checkSpecifiedProperty("loadqty3");
        return _loadqty3;
    }

    /**
     * [set] LOADQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫積付格納数量３
     * @param loadqty3 The value of the column 'LOADQTY3'. (basically NotNull if update: for the constraint)
     */
    public void setLoadqty3(Long loadqty3) {
        registerModifiedProperty("loadqty3");
        _loadqty3 = loadqty3;
    }

    /**
     * [get] LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} <br>
     * ラベル発行済フラグ
     * @return The value of the column 'LABELPRINTEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getLabelprintedflg() {
        checkSpecifiedProperty("labelprintedflg");
        return _labelprintedflg;
    }

    /**
     * [set] LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} <br>
     * ラベル発行済フラグ
     * @param labelprintedflg The value of the column 'LABELPRINTEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setLabelprintedflg(java.math.BigDecimal labelprintedflg) {
        registerModifiedProperty("labelprintedflg");
        _labelprintedflg = labelprintedflg;
    }

    /**
     * [get] NOTES: {varchar(4000)} <br>
     * 備考
     * @return The value of the column 'NOTES'. (NullAllowed even if selected: for no constraint)
     */
    public String getNotes() {
        checkSpecifiedProperty("notes");
        return convertEmptyToNull(_notes);
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * 備考
     * @param notes The value of the column 'NOTES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotes(String notes) {
        registerModifiedProperty("notes");
        _notes = notes;
    }

    /**
     * [get] SOKEY: {IX+, decimal(16, 6)} <br>
     * クロスドック出庫指示Ｋｅｙ
     * @return The value of the column 'SOKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSokey() {
        checkSpecifiedProperty("sokey");
        return _sokey;
    }

    /**
     * [set] SOKEY: {IX+, decimal(16, 6)} <br>
     * クロスドック出庫指示Ｋｅｙ
     * @param sokey The value of the column 'SOKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSokey(java.math.BigDecimal sokey) {
        registerModifiedProperty("sokey");
        _sokey = sokey;
    }

    /**
     * [get] SOLINENO: {bigint(19)} <br>
     * クロスドック出庫指示行№
     * @return The value of the column 'SOLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSolineno() {
        checkSpecifiedProperty("solineno");
        return _solineno;
    }

    /**
     * [set] SOLINENO: {bigint(19)} <br>
     * クロスドック出庫指示行№
     * @param solineno The value of the column 'SOLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSolineno(Long solineno) {
        registerModifiedProperty("solineno");
        _solineno = solineno;
    }

    /**
     * [get] TRIGGERTYPE: {varchar(30)} <br>
     * トリガー起動タイプ
     * @return The value of the column 'TRIGGERTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTriggertype() {
        checkSpecifiedProperty("triggertype");
        return convertEmptyToNull(_triggertype);
    }

    /**
     * [set] TRIGGERTYPE: {varchar(30)} <br>
     * トリガー起動タイプ
     * @param triggertype The value of the column 'TRIGGERTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTriggertype(String triggertype) {
        registerModifiedProperty("triggertype");
        _triggertype = triggertype;
    }

    /**
     * [get] PROSPECTFLG: {decimal(16, 6), default=[(0)]} <br>
     * 見込数量種別
     * @return The value of the column 'PROSPECTFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getProspectflg() {
        checkSpecifiedProperty("prospectflg");
        return _prospectflg;
    }

    /**
     * [set] PROSPECTFLG: {decimal(16, 6), default=[(0)]} <br>
     * 見込数量種別
     * @param prospectflg The value of the column 'PROSPECTFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProspectflg(java.math.BigDecimal prospectflg) {
        registerModifiedProperty("prospectflg");
        _prospectflg = prospectflg;
    }

    /**
     * [get] PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]} <br>
     * 見込数量更新フラグ
     * @return The value of the column 'PROSPECTUPDATEFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getProspectupdateflg() {
        checkSpecifiedProperty("prospectupdateflg");
        return _prospectupdateflg;
    }

    /**
     * [set] PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]} <br>
     * 見込数量更新フラグ
     * @param prospectupdateflg The value of the column 'PROSPECTUPDATEFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProspectupdateflg(java.math.BigDecimal prospectupdateflg) {
        registerModifiedProperty("prospectupdateflg");
        _prospectupdateflg = prospectupdateflg;
    }

    /**
     * [get] SLOTTYPE: {varchar(30)} <br>
     * 格納タイプ
     * @return The value of the column 'SLOTTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlottype() {
        checkSpecifiedProperty("slottype");
        return convertEmptyToNull(_slottype);
    }

    /**
     * [set] SLOTTYPE: {varchar(30)} <br>
     * 格納タイプ
     * @param slottype The value of the column 'SLOTTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlottype(String slottype) {
        registerModifiedProperty("slottype");
        _slottype = slottype;
    }

    /**
     * [get] SLOTTEDUSERCD: {varchar(30)} <br>
     * 格納担当者
     * @return The value of the column 'SLOTTEDUSERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlottedusercd() {
        checkSpecifiedProperty("slottedusercd");
        return convertEmptyToNull(_slottedusercd);
    }

    /**
     * [set] SLOTTEDUSERCD: {varchar(30)} <br>
     * 格納担当者
     * @param slottedusercd The value of the column 'SLOTTEDUSERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlottedusercd(String slottedusercd) {
        registerModifiedProperty("slottedusercd");
        _slottedusercd = slottedusercd;
    }

    /**
     * [get] XDOCKORDERKEY: {decimal(16, 6)} <br>
     * クロスドックオーダーキー
     * @return The value of the column 'XDOCKORDERKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getXdockorderkey() {
        checkSpecifiedProperty("xdockorderkey");
        return _xdockorderkey;
    }

    /**
     * [set] XDOCKORDERKEY: {decimal(16, 6)} <br>
     * クロスドックオーダーキー
     * @param xdockorderkey The value of the column 'XDOCKORDERKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setXdockorderkey(java.math.BigDecimal xdockorderkey) {
        registerModifiedProperty("xdockorderkey");
        _xdockorderkey = xdockorderkey;
    }

    /**
     * [get] PICKKEY: {IX, bigint(19)} <br>
     * ピッキング指示Ｋｅｙ
     * @return The value of the column 'PICKKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickkey() {
        checkSpecifiedProperty("pickkey");
        return _pickkey;
    }

    /**
     * [set] PICKKEY: {IX, bigint(19)} <br>
     * ピッキング指示Ｋｅｙ
     * @param pickkey The value of the column 'PICKKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickkey(Long pickkey) {
        registerModifiedProperty("pickkey");
        _pickkey = pickkey;
    }

    /**
     * [get] FULLPALLETKEY: {decimal(16, 6)} <br>
     * フルパレットキー
     * @return The value of the column 'FULLPALLETKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getFullpalletkey() {
        checkSpecifiedProperty("fullpalletkey");
        return _fullpalletkey;
    }

    /**
     * [set] FULLPALLETKEY: {decimal(16, 6)} <br>
     * フルパレットキー
     * @param fullpalletkey The value of the column 'FULLPALLETKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFullpalletkey(java.math.BigDecimal fullpalletkey) {
        registerModifiedProperty("fullpalletkey");
        _fullpalletkey = fullpalletkey;
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
