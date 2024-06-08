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
 * The entity of W_WKSOCANCELPICK1 as TABLE. <br>
 * 棚出済リスト情報中間1
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PRINTKEY, WAREHOUSECD, WAREHOUSE_SNAME, PICKEDDATE, WORKALLOCATEID, FLOOR, LOCCD, PRODUCT_CD, ITEM_SNAME, LOT1, LOT4, LOT3, PICKEDQTY_C, PICKEDQTY_P, USERNUM3, PRINTPAGENO, SEQSORTKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
 * Long printkey = entity.getPrintkey();
 * String warehousecd = entity.getWarehousecd();
 * String warehouseSname = entity.getWarehouseSname();
 * String pickeddate = entity.getPickeddate();
 * java.math.BigDecimal workallocateid = entity.getWorkallocateid();
 * String floor = entity.getFloor();
 * String loccd = entity.getLoccd();
 * String productCd = entity.getProductCd();
 * String itemSname = entity.getItemSname();
 * String lot1 = entity.getLot1();
 * String lot4 = entity.getLot4();
 * String lot3 = entity.getLot3();
 * java.math.BigDecimal pickedqtyC = entity.getPickedqtyC();
 * java.math.BigDecimal pickedqtyP = entity.getPickedqtyP();
 * Long usernum3 = entity.getUsernum3();
 * Long printpageno = entity.getPrintpageno();
 * java.math.BigDecimal seqsortkey = entity.getSeqsortkey();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPrintkey(printkey);
 * entity.setWarehousecd(warehousecd);
 * entity.setWarehouseSname(warehouseSname);
 * entity.setPickeddate(pickeddate);
 * entity.setWorkallocateid(workallocateid);
 * entity.setFloor(floor);
 * entity.setLoccd(loccd);
 * entity.setProductCd(productCd);
 * entity.setItemSname(itemSname);
 * entity.setLot1(lot1);
 * entity.setLot4(lot4);
 * entity.setLot3(lot3);
 * entity.setPickedqtyC(pickedqtyC);
 * entity.setPickedqtyP(pickedqtyP);
 * entity.setUsernum3(usernum3);
 * entity.setPrintpageno(printpageno);
 * entity.setSeqsortkey(seqsortkey);
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
public abstract class BsWWksocancelpick1 extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRINTKEY: {NotNull, bigint identity(19)} */
    protected Long _printkey;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    protected String _warehousecd;

    /** WAREHOUSE_SNAME: {NotNull, varchar(100)} */
    protected String _warehouseSname;

    /** PICKEDDATE: {NotNull, varchar(8)} */
    protected String _pickeddate;

    /** WORKALLOCATEID: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _workallocateid;

    /** FLOOR: {NotNull, varchar(60)} */
    protected String _floor;

    /** LOCCD: {NotNull, varchar(30)} */
    protected String _loccd;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** ITEM_SNAME: {NotNull, varchar(100)} */
    protected String _itemSname;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT4: {NotNull, varchar(8)} */
    protected String _lot4;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** PICKEDQTY_C: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _pickedqtyC;

    /** PICKEDQTY_P: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _pickedqtyP;

    /** USERNUM3: {NotNull, bigint(19)} */
    protected Long _usernum3;

    /** PRINTPAGENO: {NotNull, bigint(19)} */
    protected Long _printpageno;

    /** SEQSORTKEY: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _seqsortkey;

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
        return "W_WKSOCANCELPICK1";
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
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
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
        if (obj instanceof BsWWksocancelpick1) {
            BsWWksocancelpick1 other = (BsWWksocancelpick1)obj;
            if (!xSV(_printkey, other._printkey)) { return false; }
            if (!xSV(_warehousecd, other._warehousecd)) { return false; }
            if (!xSV(_warehouseSname, other._warehouseSname)) { return false; }
            if (!xSV(_pickeddate, other._pickeddate)) { return false; }
            if (!xSV(_workallocateid, other._workallocateid)) { return false; }
            if (!xSV(_floor, other._floor)) { return false; }
            if (!xSV(_loccd, other._loccd)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_itemSname, other._itemSname)) { return false; }
            if (!xSV(_lot1, other._lot1)) { return false; }
            if (!xSV(_lot4, other._lot4)) { return false; }
            if (!xSV(_lot3, other._lot3)) { return false; }
            if (!xSV(_pickedqtyC, other._pickedqtyC)) { return false; }
            if (!xSV(_pickedqtyP, other._pickedqtyP)) { return false; }
            if (!xSV(_usernum3, other._usernum3)) { return false; }
            if (!xSV(_printpageno, other._printpageno)) { return false; }
            if (!xSV(_seqsortkey, other._seqsortkey)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_controlNo, other._controlNo)) { return false; }
            if (!xSV(_addDt, other._addDt)) { return false; }
            if (!xSV(_addUser, other._addUser)) { return false; }
            if (!xSV(_addProcess, other._addProcess)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_updUser, other._updUser)) { return false; }
            if (!xSV(_updProcess, other._updProcess)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _printkey);
        hs = xCH(hs, _warehousecd);
        hs = xCH(hs, _warehouseSname);
        hs = xCH(hs, _pickeddate);
        hs = xCH(hs, _workallocateid);
        hs = xCH(hs, _floor);
        hs = xCH(hs, _loccd);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _itemSname);
        hs = xCH(hs, _lot1);
        hs = xCH(hs, _lot4);
        hs = xCH(hs, _lot3);
        hs = xCH(hs, _pickedqtyC);
        hs = xCH(hs, _pickedqtyP);
        hs = xCH(hs, _usernum3);
        hs = xCH(hs, _printpageno);
        hs = xCH(hs, _seqsortkey);
        hs = xCH(hs, _delFlg);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _controlNo);
        hs = xCH(hs, _addDt);
        hs = xCH(hs, _addUser);
        hs = xCH(hs, _addProcess);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _updUser);
        hs = xCH(hs, _updProcess);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_printkey));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_warehouseSname));
        sb.append(dm).append(xfND(_pickeddate));
        sb.append(dm).append(xfND(_workallocateid));
        sb.append(dm).append(xfND(_floor));
        sb.append(dm).append(xfND(_loccd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_itemSname));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_pickedqtyC));
        sb.append(dm).append(xfND(_pickedqtyP));
        sb.append(dm).append(xfND(_usernum3));
        sb.append(dm).append(xfND(_printpageno));
        sb.append(dm).append(xfND(_seqsortkey));
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
    public WWksocancelpick1 clone() {
        return (WWksocancelpick1)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRINTKEY: {NotNull, bigint identity(19)} <br>
     * 印刷キー
     * @return The value of the column 'PRINTKEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintkey() {
        checkSpecifiedProperty("printkey");
        return _printkey;
    }

    /**
     * [set] PRINTKEY: {NotNull, bigint identity(19)} <br>
     * 印刷キー
     * @param printkey The value of the column 'PRINTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setPrintkey(Long printkey) {
        registerModifiedProperty("printkey");
        _printkey = printkey;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] WAREHOUSE_SNAME: {NotNull, varchar(100)} <br>
     * 拠点名称
     * @return The value of the column 'WAREHOUSE_SNAME'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehouseSname() {
        checkSpecifiedProperty("warehouseSname");
        return convertEmptyToNull(_warehouseSname);
    }

    /**
     * [set] WAREHOUSE_SNAME: {NotNull, varchar(100)} <br>
     * 拠点名称
     * @param warehouseSname The value of the column 'WAREHOUSE_SNAME'. (basically NotNull if update: for the constraint)
     */
    public void setWarehouseSname(String warehouseSname) {
        registerModifiedProperty("warehouseSname");
        _warehouseSname = warehouseSname;
    }

    /**
     * [get] PICKEDDATE: {NotNull, varchar(8)} <br>
     * 棚出検品日
     * @return The value of the column 'PICKEDDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getPickeddate() {
        checkSpecifiedProperty("pickeddate");
        return convertEmptyToNull(_pickeddate);
    }

    /**
     * [set] PICKEDDATE: {NotNull, varchar(8)} <br>
     * 棚出検品日
     * @param pickeddate The value of the column 'PICKEDDATE'. (basically NotNull if update: for the constraint)
     */
    public void setPickeddate(String pickeddate) {
        registerModifiedProperty("pickeddate");
        _pickeddate = pickeddate;
    }

    /**
     * [get] WORKALLOCATEID: {NotNull, decimal(16, 6)} <br>
     * 棚出リストキー
     * @return The value of the column 'WORKALLOCATEID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getWorkallocateid() {
        checkSpecifiedProperty("workallocateid");
        return _workallocateid;
    }

    /**
     * [set] WORKALLOCATEID: {NotNull, decimal(16, 6)} <br>
     * 棚出リストキー
     * @param workallocateid The value of the column 'WORKALLOCATEID'. (basically NotNull if update: for the constraint)
     */
    public void setWorkallocateid(java.math.BigDecimal workallocateid) {
        registerModifiedProperty("workallocateid");
        _workallocateid = workallocateid;
    }

    /**
     * [get] FLOOR: {NotNull, varchar(60)} <br>
     * フロア
     * @return The value of the column 'FLOOR'. (basically NotNull if selected: for the constraint)
     */
    public String getFloor() {
        checkSpecifiedProperty("floor");
        return convertEmptyToNull(_floor);
    }

    /**
     * [set] FLOOR: {NotNull, varchar(60)} <br>
     * フロア
     * @param floor The value of the column 'FLOOR'. (basically NotNull if update: for the constraint)
     */
    public void setFloor(String floor) {
        registerModifiedProperty("floor");
        _floor = floor;
    }

    /**
     * [get] LOCCD: {NotNull, varchar(30)} <br>
     * ロケCD
     * @return The value of the column 'LOCCD'. (basically NotNull if selected: for the constraint)
     */
    public String getLoccd() {
        checkSpecifiedProperty("loccd");
        return convertEmptyToNull(_loccd);
    }

    /**
     * [set] LOCCD: {NotNull, varchar(30)} <br>
     * ロケCD
     * @param loccd The value of the column 'LOCCD'. (basically NotNull if update: for the constraint)
     */
    public void setLoccd(String loccd) {
        registerModifiedProperty("loccd");
        _loccd = loccd;
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
     * [get] ITEM_SNAME: {NotNull, varchar(100)} <br>
     * 銘柄名称
     * @return The value of the column 'ITEM_SNAME'. (basically NotNull if selected: for the constraint)
     */
    public String getItemSname() {
        checkSpecifiedProperty("itemSname");
        return convertEmptyToNull(_itemSname);
    }

    /**
     * [set] ITEM_SNAME: {NotNull, varchar(100)} <br>
     * 銘柄名称
     * @param itemSname The value of the column 'ITEM_SNAME'. (basically NotNull if update: for the constraint)
     */
    public void setItemSname(String itemSname) {
        registerModifiedProperty("itemSname");
        _itemSname = itemSname;
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
     * [get] LOT4: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (basically NotNull if selected: for the constraint)
     */
    public String getLot4() {
        checkSpecifiedProperty("lot4");
        return convertEmptyToNull(_lot4);
    }

    /**
     * [set] LOT4: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (basically NotNull if update: for the constraint)
     */
    public void setLot4(String lot4) {
        registerModifiedProperty("lot4");
        _lot4 = lot4;
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
     * [get] PICKEDQTY_C: {NotNull, decimal(16, 6)} <br>
     * 棚出済数量（ケース）
     * @return The value of the column 'PICKEDQTY_C'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPickedqtyC() {
        checkSpecifiedProperty("pickedqtyC");
        return _pickedqtyC;
    }

    /**
     * [set] PICKEDQTY_C: {NotNull, decimal(16, 6)} <br>
     * 棚出済数量（ケース）
     * @param pickedqtyC The value of the column 'PICKEDQTY_C'. (basically NotNull if update: for the constraint)
     */
    public void setPickedqtyC(java.math.BigDecimal pickedqtyC) {
        registerModifiedProperty("pickedqtyC");
        _pickedqtyC = pickedqtyC;
    }

    /**
     * [get] PICKEDQTY_P: {NotNull, decimal(16, 6)} <br>
     * 棚出済数量（パレット）
     * @return The value of the column 'PICKEDQTY_P'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPickedqtyP() {
        checkSpecifiedProperty("pickedqtyP");
        return _pickedqtyP;
    }

    /**
     * [set] PICKEDQTY_P: {NotNull, decimal(16, 6)} <br>
     * 棚出済数量（パレット）
     * @param pickedqtyP The value of the column 'PICKEDQTY_P'. (basically NotNull if update: for the constraint)
     */
    public void setPickedqtyP(java.math.BigDecimal pickedqtyP) {
        registerModifiedProperty("pickedqtyP");
        _pickedqtyP = pickedqtyP;
    }

    /**
     * [get] USERNUM3: {NotNull, bigint(19)} <br>
     * 一般出力順
     * @return The value of the column 'USERNUM3'. (basically NotNull if selected: for the constraint)
     */
    public Long getUsernum3() {
        checkSpecifiedProperty("usernum3");
        return _usernum3;
    }

    /**
     * [set] USERNUM3: {NotNull, bigint(19)} <br>
     * 一般出力順
     * @param usernum3 The value of the column 'USERNUM3'. (basically NotNull if update: for the constraint)
     */
    public void setUsernum3(Long usernum3) {
        registerModifiedProperty("usernum3");
        _usernum3 = usernum3;
    }

    /**
     * [get] PRINTPAGENO: {NotNull, bigint(19)} <br>
     * 帳票改頁
     * @return The value of the column 'PRINTPAGENO'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintpageno() {
        checkSpecifiedProperty("printpageno");
        return _printpageno;
    }

    /**
     * [set] PRINTPAGENO: {NotNull, bigint(19)} <br>
     * 帳票改頁
     * @param printpageno The value of the column 'PRINTPAGENO'. (basically NotNull if update: for the constraint)
     */
    public void setPrintpageno(Long printpageno) {
        registerModifiedProperty("printpageno");
        _printpageno = printpageno;
    }

    /**
     * [get] SEQSORTKEY: {NotNull, decimal(16, 6)} <br>
     * 連番ソートキー
     * @return The value of the column 'SEQSORTKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSeqsortkey() {
        checkSpecifiedProperty("seqsortkey");
        return _seqsortkey;
    }

    /**
     * [set] SEQSORTKEY: {NotNull, decimal(16, 6)} <br>
     * 連番ソートキー
     * @param seqsortkey The value of the column 'SEQSORTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setSeqsortkey(java.math.BigDecimal seqsortkey) {
        registerModifiedProperty("seqsortkey");
        _seqsortkey = seqsortkey;
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
