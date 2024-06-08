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
 * The entity of T_TRSOJTDETAIL as TABLE. <br>
 * 出庫指図明細
 * <pre>
 * [primary-key]
 *     SOJTLINEID
 *
 * [column]
 *     SOJTLINEID, SOJTID, SOJTLINENO, DATATYPE, PLANSEQ, PRODUCT_ID, LOT3, LOT4, EXPECTQTY1, PICKEDQTY1, POID, PALLET_ID, LOCATION_ID, LOT_ID, SOID, SODETAILID, TRSOADDFLG, PLANOUTSEQ, PLANPRICE1, PLANPRICE2, PLANITEMNAME, PLANDATA1, PLANDATA2, PLANDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOJTLINEID
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
 * Long sojtlineid = entity.getSojtlineid();
 * Long sojtid = entity.getSojtid();
 * Long sojtlineno = entity.getSojtlineno();
 * String datatype = entity.getDatatype();
 * Long planseq = entity.getPlanseq();
 * Long productId = entity.getProductId();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * Long expectqty1 = entity.getExpectqty1();
 * Long pickedqty1 = entity.getPickedqty1();
 * String poid = entity.getPoid();
 * Long palletId = entity.getPalletId();
 * Long locationId = entity.getLocationId();
 * Long lotId = entity.getLotId();
 * Long soid = entity.getSoid();
 * Long sodetailid = entity.getSodetailid();
 * String trsoaddflg = entity.getTrsoaddflg();
 * String planoutseq = entity.getPlanoutseq();
 * String planprice1 = entity.getPlanprice1();
 * String planprice2 = entity.getPlanprice2();
 * String planitemname = entity.getPlanitemname();
 * String plandata1 = entity.getPlandata1();
 * String plandata2 = entity.getPlandata2();
 * String plandata3 = entity.getPlandata3();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSojtlineid(sojtlineid);
 * entity.setSojtid(sojtid);
 * entity.setSojtlineno(sojtlineno);
 * entity.setDatatype(datatype);
 * entity.setPlanseq(planseq);
 * entity.setProductId(productId);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setExpectqty1(expectqty1);
 * entity.setPickedqty1(pickedqty1);
 * entity.setPoid(poid);
 * entity.setPalletId(palletId);
 * entity.setLocationId(locationId);
 * entity.setLotId(lotId);
 * entity.setSoid(soid);
 * entity.setSodetailid(sodetailid);
 * entity.setTrsoaddflg(trsoaddflg);
 * entity.setPlanoutseq(planoutseq);
 * entity.setPlanprice1(planprice1);
 * entity.setPlanprice2(planprice2);
 * entity.setPlanitemname(planitemname);
 * entity.setPlandata1(plandata1);
 * entity.setPlandata2(plandata2);
 * entity.setPlandata3(plandata3);
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
public abstract class BsTTrsojtdetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SOJTLINEID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _sojtlineid;

    /** SOJTID: {NotNull, bigint(19)} */
    protected Long _sojtid;

    /** SOJTLINENO: {NotNull, bigint(19)} */
    protected Long _sojtlineno;

    /** DATATYPE: {char(1)} */
    protected String _datatype;

    /** PLANSEQ: {bigint(19)} */
    protected Long _planseq;

    /** PRODUCT_ID: {bigint(19)} */
    protected Long _productId;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** EXPECTQTY1: {bigint(19)} */
    protected Long _expectqty1;

    /** PICKEDQTY1: {bigint(19)} */
    protected Long _pickedqty1;

    /** POID: {varchar(30)} */
    protected String _poid;

    /** PALLET_ID: {bigint(19)} */
    protected Long _palletId;

    /** LOCATION_ID: {bigint(19)} */
    protected Long _locationId;

    /** LOT_ID: {bigint(19)} */
    protected Long _lotId;

    /** SOID: {bigint(19)} */
    protected Long _soid;

    /** SODETAILID: {bigint(19)} */
    protected Long _sodetailid;

    /** TRSOADDFLG: {char(1)} */
    protected String _trsoaddflg;

    /** PLANOUTSEQ: {varchar(30)} */
    protected String _planoutseq;

    /** PLANPRICE1: {varchar(30)} */
    protected String _planprice1;

    /** PLANPRICE2: {varchar(30)} */
    protected String _planprice2;

    /** PLANITEMNAME: {varchar(60)} */
    protected String _planitemname;

    /** PLANDATA1: {char(1)} */
    protected String _plandata1;

    /** PLANDATA2: {varchar(30)} */
    protected String _plandata2;

    /** PLANDATA3: {varchar(30)} */
    protected String _plandata3;

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
        return "T_TRSOJTDETAIL";
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
        if (_sojtlineid == null) { return false; }
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
        if (obj instanceof BsTTrsojtdetail) {
            BsTTrsojtdetail other = (BsTTrsojtdetail)obj;
            if (!xSV(_sojtlineid, other._sojtlineid)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sojtlineid);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sojtlineid));
        sb.append(dm).append(xfND(_sojtid));
        sb.append(dm).append(xfND(_sojtlineno));
        sb.append(dm).append(xfND(_datatype));
        sb.append(dm).append(xfND(_planseq));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_expectqty1));
        sb.append(dm).append(xfND(_pickedqty1));
        sb.append(dm).append(xfND(_poid));
        sb.append(dm).append(xfND(_palletId));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_soid));
        sb.append(dm).append(xfND(_sodetailid));
        sb.append(dm).append(xfND(_trsoaddflg));
        sb.append(dm).append(xfND(_planoutseq));
        sb.append(dm).append(xfND(_planprice1));
        sb.append(dm).append(xfND(_planprice2));
        sb.append(dm).append(xfND(_planitemname));
        sb.append(dm).append(xfND(_plandata1));
        sb.append(dm).append(xfND(_plandata2));
        sb.append(dm).append(xfND(_plandata3));
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
    public TTrsojtdetail clone() {
        return (TTrsojtdetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SOJTLINEID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫指図明細ID
     * @return The value of the column 'SOJTLINEID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSojtlineid() {
        checkSpecifiedProperty("sojtlineid");
        return _sojtlineid;
    }

    /**
     * [set] SOJTLINEID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫指図明細ID
     * @param sojtlineid The value of the column 'SOJTLINEID'. (basically NotNull if update: for the constraint)
     */
    public void setSojtlineid(Long sojtlineid) {
        registerModifiedProperty("sojtlineid");
        _sojtlineid = sojtlineid;
    }

    /**
     * [get] SOJTID: {NotNull, bigint(19)} <br>
     * 出庫指図ID
     * @return The value of the column 'SOJTID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSojtid() {
        checkSpecifiedProperty("sojtid");
        return _sojtid;
    }

    /**
     * [set] SOJTID: {NotNull, bigint(19)} <br>
     * 出庫指図ID
     * @param sojtid The value of the column 'SOJTID'. (basically NotNull if update: for the constraint)
     */
    public void setSojtid(Long sojtid) {
        registerModifiedProperty("sojtid");
        _sojtid = sojtid;
    }

    /**
     * [get] SOJTLINENO: {NotNull, bigint(19)} <br>
     * 出庫指図行№
     * @return The value of the column 'SOJTLINENO'. (basically NotNull if selected: for the constraint)
     */
    public Long getSojtlineno() {
        checkSpecifiedProperty("sojtlineno");
        return _sojtlineno;
    }

    /**
     * [set] SOJTLINENO: {NotNull, bigint(19)} <br>
     * 出庫指図行№
     * @param sojtlineno The value of the column 'SOJTLINENO'. (basically NotNull if update: for the constraint)
     */
    public void setSojtlineno(Long sojtlineno) {
        registerModifiedProperty("sojtlineno");
        _sojtlineno = sojtlineno;
    }

    /**
     * [get] DATATYPE: {char(1)} <br>
     * データタイプ
     * @return The value of the column 'DATATYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDatatype() {
        checkSpecifiedProperty("datatype");
        return convertEmptyToNull(_datatype);
    }

    /**
     * [set] DATATYPE: {char(1)} <br>
     * データタイプ
     * @param datatype The value of the column 'DATATYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDatatype(String datatype) {
        registerModifiedProperty("datatype");
        _datatype = datatype;
    }

    /**
     * [get] PLANSEQ: {bigint(19)} <br>
     * 計画受信回数
     * @return The value of the column 'PLANSEQ'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPlanseq() {
        checkSpecifiedProperty("planseq");
        return _planseq;
    }

    /**
     * [set] PLANSEQ: {bigint(19)} <br>
     * 計画受信回数
     * @param planseq The value of the column 'PLANSEQ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanseq(Long planseq) {
        registerModifiedProperty("planseq");
        _planseq = planseq;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
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
     * [get] EXPECTQTY1: {bigint(19)} <br>
     * 個装数量
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getExpectqty1() {
        checkSpecifiedProperty("expectqty1");
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {bigint(19)} <br>
     * 個装数量
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectqty1(Long expectqty1) {
        registerModifiedProperty("expectqty1");
        _expectqty1 = expectqty1;
    }

    /**
     * [get] PICKEDQTY1: {bigint(19)} <br>
     * ピッキング済数量１（バラ）
     * @return The value of the column 'PICKEDQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickedqty1() {
        checkSpecifiedProperty("pickedqty1");
        return _pickedqty1;
    }

    /**
     * [set] PICKEDQTY1: {bigint(19)} <br>
     * ピッキング済数量１（バラ）
     * @param pickedqty1 The value of the column 'PICKEDQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickedqty1(Long pickedqty1) {
        registerModifiedProperty("pickedqty1");
        _pickedqty1 = pickedqty1;
    }

    /**
     * [get] POID: {varchar(30)} <br>
     * パレット番号（保税）
     * @return The value of the column 'POID'. (NullAllowed even if selected: for no constraint)
     */
    public String getPoid() {
        checkSpecifiedProperty("poid");
        return convertEmptyToNull(_poid);
    }

    /**
     * [set] POID: {varchar(30)} <br>
     * パレット番号（保税）
     * @param poid The value of the column 'POID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPoid(String poid) {
        registerModifiedProperty("poid");
        _poid = poid;
    }

    /**
     * [get] PALLET_ID: {bigint(19)} <br>
     * パレットID
     * @return The value of the column 'PALLET_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPalletId() {
        checkSpecifiedProperty("palletId");
        return _palletId;
    }

    /**
     * [set] PALLET_ID: {bigint(19)} <br>
     * パレットID
     * @param palletId The value of the column 'PALLET_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletId(Long palletId) {
        registerModifiedProperty("palletId");
        _palletId = palletId;
    }

    /**
     * [get] LOCATION_ID: {bigint(19)} <br>
     * ロケーションiD
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * ロケーションiD
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] SOID: {bigint(19)} <br>
     * 出庫予定ID
     * @return The value of the column 'SOID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSoid() {
        checkSpecifiedProperty("soid");
        return _soid;
    }

    /**
     * [set] SOID: {bigint(19)} <br>
     * 出庫予定ID
     * @param soid The value of the column 'SOID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSoid(Long soid) {
        registerModifiedProperty("soid");
        _soid = soid;
    }

    /**
     * [get] SODETAILID: {bigint(19)} <br>
     * 出庫予定明細ID
     * @return The value of the column 'SODETAILID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSodetailid() {
        checkSpecifiedProperty("sodetailid");
        return _sodetailid;
    }

    /**
     * [set] SODETAILID: {bigint(19)} <br>
     * 出庫予定明細ID
     * @param sodetailid The value of the column 'SODETAILID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSodetailid(Long sodetailid) {
        registerModifiedProperty("sodetailid");
        _sodetailid = sodetailid;
    }

    /**
     * [get] TRSOADDFLG: {char(1)} <br>
     * 出庫予定作成フラグ
     * @return The value of the column 'TRSOADDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrsoaddflg() {
        checkSpecifiedProperty("trsoaddflg");
        return convertEmptyToNull(_trsoaddflg);
    }

    /**
     * [set] TRSOADDFLG: {char(1)} <br>
     * 出庫予定作成フラグ
     * @param trsoaddflg The value of the column 'TRSOADDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrsoaddflg(String trsoaddflg) {
        registerModifiedProperty("trsoaddflg");
        _trsoaddflg = trsoaddflg;
    }

    /**
     * [get] PLANOUTSEQ: {varchar(30)} <br>
     * 伝票出力順
     * @return The value of the column 'PLANOUTSEQ'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanoutseq() {
        checkSpecifiedProperty("planoutseq");
        return convertEmptyToNull(_planoutseq);
    }

    /**
     * [set] PLANOUTSEQ: {varchar(30)} <br>
     * 伝票出力順
     * @param planoutseq The value of the column 'PLANOUTSEQ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanoutseq(String planoutseq) {
        registerModifiedProperty("planoutseq");
        _planoutseq = planoutseq;
    }

    /**
     * [get] PLANPRICE1: {varchar(30)} <br>
     * 単価
     * @return The value of the column 'PLANPRICE1'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanprice1() {
        checkSpecifiedProperty("planprice1");
        return convertEmptyToNull(_planprice1);
    }

    /**
     * [set] PLANPRICE1: {varchar(30)} <br>
     * 単価
     * @param planprice1 The value of the column 'PLANPRICE1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanprice1(String planprice1) {
        registerModifiedProperty("planprice1");
        _planprice1 = planprice1;
    }

    /**
     * [get] PLANPRICE2: {varchar(30)} <br>
     * 価格
     * @return The value of the column 'PLANPRICE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanprice2() {
        checkSpecifiedProperty("planprice2");
        return convertEmptyToNull(_planprice2);
    }

    /**
     * [set] PLANPRICE2: {varchar(30)} <br>
     * 価格
     * @param planprice2 The value of the column 'PLANPRICE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanprice2(String planprice2) {
        registerModifiedProperty("planprice2");
        _planprice2 = planprice2;
    }

    /**
     * [get] PLANITEMNAME: {varchar(60)} <br>
     * 銘柄名称
     * @return The value of the column 'PLANITEMNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanitemname() {
        checkSpecifiedProperty("planitemname");
        return convertEmptyToNull(_planitemname);
    }

    /**
     * [set] PLANITEMNAME: {varchar(60)} <br>
     * 銘柄名称
     * @param planitemname The value of the column 'PLANITEMNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanitemname(String planitemname) {
        registerModifiedProperty("planitemname");
        _planitemname = planitemname;
    }

    /**
     * [get] PLANDATA1: {char(1)} <br>
     * その他１
     * @return The value of the column 'PLANDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlandata1() {
        checkSpecifiedProperty("plandata1");
        return convertEmptyToNull(_plandata1);
    }

    /**
     * [set] PLANDATA1: {char(1)} <br>
     * その他１
     * @param plandata1 The value of the column 'PLANDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlandata1(String plandata1) {
        registerModifiedProperty("plandata1");
        _plandata1 = plandata1;
    }

    /**
     * [get] PLANDATA2: {varchar(30)} <br>
     * その他２
     * @return The value of the column 'PLANDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlandata2() {
        checkSpecifiedProperty("plandata2");
        return convertEmptyToNull(_plandata2);
    }

    /**
     * [set] PLANDATA2: {varchar(30)} <br>
     * その他２
     * @param plandata2 The value of the column 'PLANDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlandata2(String plandata2) {
        registerModifiedProperty("plandata2");
        _plandata2 = plandata2;
    }

    /**
     * [get] PLANDATA3: {varchar(30)} <br>
     * その他３
     * @return The value of the column 'PLANDATA3'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlandata3() {
        checkSpecifiedProperty("plandata3");
        return convertEmptyToNull(_plandata3);
    }

    /**
     * [set] PLANDATA3: {varchar(30)} <br>
     * その他３
     * @param plandata3 The value of the column 'PLANDATA3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlandata3(String plandata3) {
        registerModifiedProperty("plandata3");
        _plandata3 = plandata3;
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
