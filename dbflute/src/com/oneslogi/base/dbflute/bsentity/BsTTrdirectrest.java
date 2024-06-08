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
 * The entity of T_TRDIRECTREST as TABLE. <br>
 * 方面別残数情報
 * <pre>
 * [primary-key]
 *     WAREHOUSECD, STOCKDATE, RECNO
 *
 * [column]
 *     WAREHOUSECD, STOCKDATE, RECNO, SOTEDUNIT, ZONE, ASSORTEDORDER, SOTEDLOC, PRODUCT_CD, DELIVERYDATE, DPWAREHOUSECD, DIRECTIONCD, PISTONTYPE, COMT, SROPRTCNT, CSROPRTCNT, CUTTOPDIRASSORD, STOCKCASESU, STOCKCARTONSU, SELLSHOPCNT, LINECD, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * String warehousecd = entity.getWarehousecd();
 * String stockdate = entity.getStockdate();
 * java.math.BigDecimal recno = entity.getRecno();
 * String sotedunit = entity.getSotedunit();
 * String zone = entity.getZone();
 * Long assortedorder = entity.getAssortedorder();
 * String sotedloc = entity.getSotedloc();
 * String productCd = entity.getProductCd();
 * String deliverydate = entity.getDeliverydate();
 * String dpwarehousecd = entity.getDpwarehousecd();
 * String directioncd = entity.getDirectioncd();
 * String pistontype = entity.getPistontype();
 * String comt = entity.getComt();
 * Long sroprtcnt = entity.getSroprtcnt();
 * Long csroprtcnt = entity.getCsroprtcnt();
 * Long cuttopdirassord = entity.getCuttopdirassord();
 * Long stockcasesu = entity.getStockcasesu();
 * Long stockcartonsu = entity.getStockcartonsu();
 * Long sellshopcnt = entity.getSellshopcnt();
 * String linecd = entity.getLinecd();
 * String vaExtdata1 = entity.getVaExtdata1();
 * String vaExtdata2 = entity.getVaExtdata2();
 * String vaExtdata3 = entity.getVaExtdata3();
 * String nvExtdata1 = entity.getNvExtdata1();
 * String nvExtdata2 = entity.getNvExtdata2();
 * String nvExtdata3 = entity.getNvExtdata3();
 * Long nmExtdata1 = entity.getNmExtdata1();
 * Long nmExtdata2 = entity.getNmExtdata2();
 * Long nmExtdata3 = entity.getNmExtdata3();
 * String dtExtdata1 = entity.getDtExtdata1();
 * String dtExtdata2 = entity.getDtExtdata2();
 * String dtExtdata3 = entity.getDtExtdata3();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setWarehousecd(warehousecd);
 * entity.setStockdate(stockdate);
 * entity.setRecno(recno);
 * entity.setSotedunit(sotedunit);
 * entity.setZone(zone);
 * entity.setAssortedorder(assortedorder);
 * entity.setSotedloc(sotedloc);
 * entity.setProductCd(productCd);
 * entity.setDeliverydate(deliverydate);
 * entity.setDpwarehousecd(dpwarehousecd);
 * entity.setDirectioncd(directioncd);
 * entity.setPistontype(pistontype);
 * entity.setComt(comt);
 * entity.setSroprtcnt(sroprtcnt);
 * entity.setCsroprtcnt(csroprtcnt);
 * entity.setCuttopdirassord(cuttopdirassord);
 * entity.setStockcasesu(stockcasesu);
 * entity.setStockcartonsu(stockcartonsu);
 * entity.setSellshopcnt(sellshopcnt);
 * entity.setLinecd(linecd);
 * entity.setVaExtdata1(vaExtdata1);
 * entity.setVaExtdata2(vaExtdata2);
 * entity.setVaExtdata3(vaExtdata3);
 * entity.setNvExtdata1(nvExtdata1);
 * entity.setNvExtdata2(nvExtdata2);
 * entity.setNvExtdata3(nvExtdata3);
 * entity.setNmExtdata1(nmExtdata1);
 * entity.setNmExtdata2(nmExtdata2);
 * entity.setNmExtdata3(nmExtdata3);
 * entity.setDtExtdata1(dtExtdata1);
 * entity.setDtExtdata2(dtExtdata2);
 * entity.setDtExtdata3(dtExtdata3);
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
public abstract class BsTTrdirectrest extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WAREHOUSECD: {PK, NotNull, varchar(30)} */
    protected String _warehousecd;

    /** STOCKDATE: {PK, NotNull, varchar(8)} */
    protected String _stockdate;

    /** RECNO: {PK, NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _recno;

    /** SOTEDUNIT: {varchar(30)} */
    protected String _sotedunit;

    /** ZONE: {varchar(30)} */
    protected String _zone;

    /** ASSORTEDORDER: {bigint(19)} */
    protected Long _assortedorder;

    /** SOTEDLOC: {varchar(255)} */
    protected String _sotedloc;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** DELIVERYDATE: {varchar(8)} */
    protected String _deliverydate;

    /** DPWAREHOUSECD: {varchar(30)} */
    protected String _dpwarehousecd;

    /** DIRECTIONCD: {varchar(30)} */
    protected String _directioncd;

    /** PISTONTYPE: {char(1)} */
    protected String _pistontype;

    /** COMT: {varchar(60)} */
    protected String _comt;

    /** SROPRTCNT: {bigint(19)} */
    protected Long _sroprtcnt;

    /** CSROPRTCNT: {bigint(19)} */
    protected Long _csroprtcnt;

    /** CUTTOPDIRASSORD: {bigint(19)} */
    protected Long _cuttopdirassord;

    /** STOCKCASESU: {bigint(19)} */
    protected Long _stockcasesu;

    /** STOCKCARTONSU: {bigint(19)} */
    protected Long _stockcartonsu;

    /** SELLSHOPCNT: {bigint(19)} */
    protected Long _sellshopcnt;

    /** LINECD: {varchar(30)} */
    protected String _linecd;

    /** VA_EXTDATA1: {varchar(30)} */
    protected String _vaExtdata1;

    /** VA_EXTDATA2: {varchar(30)} */
    protected String _vaExtdata2;

    /** VA_EXTDATA3: {varchar(30)} */
    protected String _vaExtdata3;

    /** NV_EXTDATA1: {varchar(60)} */
    protected String _nvExtdata1;

    /** NV_EXTDATA2: {varchar(60)} */
    protected String _nvExtdata2;

    /** NV_EXTDATA3: {varchar(60)} */
    protected String _nvExtdata3;

    /** NM_EXTDATA1: {bigint(19)} */
    protected Long _nmExtdata1;

    /** NM_EXTDATA2: {bigint(19)} */
    protected Long _nmExtdata2;

    /** NM_EXTDATA3: {bigint(19)} */
    protected Long _nmExtdata3;

    /** DT_EXTDATA1: {varchar(8)} */
    protected String _dtExtdata1;

    /** DT_EXTDATA2: {varchar(8)} */
    protected String _dtExtdata2;

    /** DT_EXTDATA3: {varchar(8)} */
    protected String _dtExtdata3;

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
        return "T_TRDIRECTREST";
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
        if (_warehousecd == null) { return false; }
        if (_stockdate == null) { return false; }
        if (_recno == null) { return false; }
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
        if (obj instanceof BsTTrdirectrest) {
            BsTTrdirectrest other = (BsTTrdirectrest)obj;
            if (!xSV(_warehousecd, other._warehousecd)) { return false; }
            if (!xSV(_stockdate, other._stockdate)) { return false; }
            if (!xSV(_recno, other._recno)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _warehousecd);
        hs = xCH(hs, _stockdate);
        hs = xCH(hs, _recno);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_stockdate));
        sb.append(dm).append(xfND(_recno));
        sb.append(dm).append(xfND(_sotedunit));
        sb.append(dm).append(xfND(_zone));
        sb.append(dm).append(xfND(_assortedorder));
        sb.append(dm).append(xfND(_sotedloc));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_deliverydate));
        sb.append(dm).append(xfND(_dpwarehousecd));
        sb.append(dm).append(xfND(_directioncd));
        sb.append(dm).append(xfND(_pistontype));
        sb.append(dm).append(xfND(_comt));
        sb.append(dm).append(xfND(_sroprtcnt));
        sb.append(dm).append(xfND(_csroprtcnt));
        sb.append(dm).append(xfND(_cuttopdirassord));
        sb.append(dm).append(xfND(_stockcasesu));
        sb.append(dm).append(xfND(_stockcartonsu));
        sb.append(dm).append(xfND(_sellshopcnt));
        sb.append(dm).append(xfND(_linecd));
        sb.append(dm).append(xfND(_vaExtdata1));
        sb.append(dm).append(xfND(_vaExtdata2));
        sb.append(dm).append(xfND(_vaExtdata3));
        sb.append(dm).append(xfND(_nvExtdata1));
        sb.append(dm).append(xfND(_nvExtdata2));
        sb.append(dm).append(xfND(_nvExtdata3));
        sb.append(dm).append(xfND(_nmExtdata1));
        sb.append(dm).append(xfND(_nmExtdata2));
        sb.append(dm).append(xfND(_nmExtdata3));
        sb.append(dm).append(xfND(_dtExtdata1));
        sb.append(dm).append(xfND(_dtExtdata2));
        sb.append(dm).append(xfND(_dtExtdata3));
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
    public TTrdirectrest clone() {
        return (TTrdirectrest)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WAREHOUSECD: {PK, NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {PK, NotNull, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] STOCKDATE: {PK, NotNull, varchar(8)} <br>
     * 在庫実績日
     * @return The value of the column 'STOCKDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getStockdate() {
        checkSpecifiedProperty("stockdate");
        return convertEmptyToNull(_stockdate);
    }

    /**
     * [set] STOCKDATE: {PK, NotNull, varchar(8)} <br>
     * 在庫実績日
     * @param stockdate The value of the column 'STOCKDATE'. (basically NotNull if update: for the constraint)
     */
    public void setStockdate(String stockdate) {
        registerModifiedProperty("stockdate");
        _stockdate = stockdate;
    }

    /**
     * [get] RECNO: {PK, NotNull, decimal(16, 6)} <br>
     * レコード番号
     * @return The value of the column 'RECNO'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRecno() {
        checkSpecifiedProperty("recno");
        return _recno;
    }

    /**
     * [set] RECNO: {PK, NotNull, decimal(16, 6)} <br>
     * レコード番号
     * @param recno The value of the column 'RECNO'. (basically NotNull if update: for the constraint)
     */
    public void setRecno(java.math.BigDecimal recno) {
        registerModifiedProperty("recno");
        _recno = recno;
    }

    /**
     * [get] SOTEDUNIT: {varchar(30)} <br>
     * 補充先
     * @return The value of the column 'SOTEDUNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getSotedunit() {
        checkSpecifiedProperty("sotedunit");
        return convertEmptyToNull(_sotedunit);
    }

    /**
     * [set] SOTEDUNIT: {varchar(30)} <br>
     * 補充先
     * @param sotedunit The value of the column 'SOTEDUNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSotedunit(String sotedunit) {
        registerModifiedProperty("sotedunit");
        _sotedunit = sotedunit;
    }

    /**
     * [get] ZONE: {varchar(30)} <br>
     * ゾーンCD
     * @return The value of the column 'ZONE'. (NullAllowed even if selected: for no constraint)
     */
    public String getZone() {
        checkSpecifiedProperty("zone");
        return convertEmptyToNull(_zone);
    }

    /**
     * [set] ZONE: {varchar(30)} <br>
     * ゾーンCD
     * @param zone The value of the column 'ZONE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZone(String zone) {
        registerModifiedProperty("zone");
        _zone = zone;
    }

    /**
     * [get] ASSORTEDORDER: {bigint(19)} <br>
     * 仕分順
     * @return The value of the column 'ASSORTEDORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAssortedorder() {
        checkSpecifiedProperty("assortedorder");
        return _assortedorder;
    }

    /**
     * [set] ASSORTEDORDER: {bigint(19)} <br>
     * 仕分順
     * @param assortedorder The value of the column 'ASSORTEDORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortedorder(Long assortedorder) {
        registerModifiedProperty("assortedorder");
        _assortedorder = assortedorder;
    }

    /**
     * [get] SOTEDLOC: {varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'SOTEDLOC'. (NullAllowed even if selected: for no constraint)
     */
    public String getSotedloc() {
        checkSpecifiedProperty("sotedloc");
        return convertEmptyToNull(_sotedloc);
    }

    /**
     * [set] SOTEDLOC: {varchar(255)} <br>
     * 仕分ロケ
     * @param sotedloc The value of the column 'SOTEDLOC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSotedloc(String sotedloc) {
        registerModifiedProperty("sotedloc");
        _sotedloc = sotedloc;
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
     * [get] DELIVERYDATE: {varchar(8)} <br>
     * 配達年月日
     * @return The value of the column 'DELIVERYDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliverydate() {
        checkSpecifiedProperty("deliverydate");
        return convertEmptyToNull(_deliverydate);
    }

    /**
     * [set] DELIVERYDATE: {varchar(8)} <br>
     * 配達年月日
     * @param deliverydate The value of the column 'DELIVERYDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliverydate(String deliverydate) {
        registerModifiedProperty("deliverydate");
        _deliverydate = deliverydate;
    }

    /**
     * [get] DPWAREHOUSECD: {varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDpwarehousecd() {
        checkSpecifiedProperty("dpwarehousecd");
        return convertEmptyToNull(_dpwarehousecd);
    }

    /**
     * [set] DPWAREHOUSECD: {varchar(30)} <br>
     * 配達拠点CD
     * @param dpwarehousecd The value of the column 'DPWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDpwarehousecd(String dpwarehousecd) {
        registerModifiedProperty("dpwarehousecd");
        _dpwarehousecd = dpwarehousecd;
    }

    /**
     * [get] DIRECTIONCD: {varchar(30)} <br>
     * 配達方面
     * @return The value of the column 'DIRECTIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectioncd() {
        checkSpecifiedProperty("directioncd");
        return convertEmptyToNull(_directioncd);
    }

    /**
     * [set] DIRECTIONCD: {varchar(30)} <br>
     * 配達方面
     * @param directioncd The value of the column 'DIRECTIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectioncd(String directioncd) {
        registerModifiedProperty("directioncd");
        _directioncd = directioncd;
    }

    /**
     * [get] PISTONTYPE: {char(1)} <br>
     * ピストン区分
     * @return The value of the column 'PISTONTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPistontype() {
        checkSpecifiedProperty("pistontype");
        return convertEmptyToNull(_pistontype);
    }

    /**
     * [set] PISTONTYPE: {char(1)} <br>
     * ピストン区分
     * @param pistontype The value of the column 'PISTONTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPistontype(String pistontype) {
        registerModifiedProperty("pistontype");
        _pistontype = pistontype;
    }

    /**
     * [get] COMT: {varchar(60)} <br>
     * コメント
     * @return The value of the column 'COMT'. (NullAllowed even if selected: for no constraint)
     */
    public String getComt() {
        checkSpecifiedProperty("comt");
        return convertEmptyToNull(_comt);
    }

    /**
     * [set] COMT: {varchar(60)} <br>
     * コメント
     * @param comt The value of the column 'COMT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setComt(String comt) {
        registerModifiedProperty("comt");
        _comt = comt;
    }

    /**
     * [get] SROPRTCNT: {bigint(19)} <br>
     * 仕分作業回数
     * @return The value of the column 'SROPRTCNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSroprtcnt() {
        checkSpecifiedProperty("sroprtcnt");
        return _sroprtcnt;
    }

    /**
     * [set] SROPRTCNT: {bigint(19)} <br>
     * 仕分作業回数
     * @param sroprtcnt The value of the column 'SROPRTCNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSroprtcnt(Long sroprtcnt) {
        registerModifiedProperty("sroprtcnt");
        _sroprtcnt = sroprtcnt;
    }

    /**
     * [get] CSROPRTCNT: {bigint(19)} <br>
     * 今回仕分作業回数
     * @return The value of the column 'CSROPRTCNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCsroprtcnt() {
        checkSpecifiedProperty("csroprtcnt");
        return _csroprtcnt;
    }

    /**
     * [set] CSROPRTCNT: {bigint(19)} <br>
     * 今回仕分作業回数
     * @param csroprtcnt The value of the column 'CSROPRTCNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCsroprtcnt(Long csroprtcnt) {
        registerModifiedProperty("csroprtcnt");
        _csroprtcnt = csroprtcnt;
    }

    /**
     * [get] CUTTOPDIRASSORD: {bigint(19)} <br>
     * 今回先頭方面仕分順
     * @return The value of the column 'CUTTOPDIRASSORD'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCuttopdirassord() {
        checkSpecifiedProperty("cuttopdirassord");
        return _cuttopdirassord;
    }

    /**
     * [set] CUTTOPDIRASSORD: {bigint(19)} <br>
     * 今回先頭方面仕分順
     * @param cuttopdirassord The value of the column 'CUTTOPDIRASSORD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCuttopdirassord(Long cuttopdirassord) {
        registerModifiedProperty("cuttopdirassord");
        _cuttopdirassord = cuttopdirassord;
    }

    /**
     * [get] STOCKCASESU: {bigint(19)} <br>
     * 残数（ケース）
     * @return The value of the column 'STOCKCASESU'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockcasesu() {
        checkSpecifiedProperty("stockcasesu");
        return _stockcasesu;
    }

    /**
     * [set] STOCKCASESU: {bigint(19)} <br>
     * 残数（ケース）
     * @param stockcasesu The value of the column 'STOCKCASESU'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockcasesu(Long stockcasesu) {
        registerModifiedProperty("stockcasesu");
        _stockcasesu = stockcasesu;
    }

    /**
     * [get] STOCKCARTONSU: {bigint(19)} <br>
     * 残数（カートン）
     * @return The value of the column 'STOCKCARTONSU'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockcartonsu() {
        checkSpecifiedProperty("stockcartonsu");
        return _stockcartonsu;
    }

    /**
     * [set] STOCKCARTONSU: {bigint(19)} <br>
     * 残数（カートン）
     * @param stockcartonsu The value of the column 'STOCKCARTONSU'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockcartonsu(Long stockcartonsu) {
        registerModifiedProperty("stockcartonsu");
        _stockcartonsu = stockcartonsu;
    }

    /**
     * [get] SELLSHOPCNT: {bigint(19)} <br>
     * 販売店数
     * @return The value of the column 'SELLSHOPCNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSellshopcnt() {
        checkSpecifiedProperty("sellshopcnt");
        return _sellshopcnt;
    }

    /**
     * [set] SELLSHOPCNT: {bigint(19)} <br>
     * 販売店数
     * @param sellshopcnt The value of the column 'SELLSHOPCNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSellshopcnt(Long sellshopcnt) {
        registerModifiedProperty("sellshopcnt");
        _sellshopcnt = sellshopcnt;
    }

    /**
     * [get] LINECD: {varchar(30)} <br>
     * 仕分ラインCD
     * @return The value of the column 'LINECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinecd() {
        checkSpecifiedProperty("linecd");
        return convertEmptyToNull(_linecd);
    }

    /**
     * [set] LINECD: {varchar(30)} <br>
     * 仕分ラインCD
     * @param linecd The value of the column 'LINECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinecd(String linecd) {
        registerModifiedProperty("linecd");
        _linecd = linecd;
    }

    /**
     * [get] VA_EXTDATA1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @return The value of the column 'VA_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata1() {
        checkSpecifiedProperty("vaExtdata1");
        return convertEmptyToNull(_vaExtdata1);
    }

    /**
     * [set] VA_EXTDATA1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @param vaExtdata1 The value of the column 'VA_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata1(String vaExtdata1) {
        registerModifiedProperty("vaExtdata1");
        _vaExtdata1 = vaExtdata1;
    }

    /**
     * [get] VA_EXTDATA2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @return The value of the column 'VA_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata2() {
        checkSpecifiedProperty("vaExtdata2");
        return convertEmptyToNull(_vaExtdata2);
    }

    /**
     * [set] VA_EXTDATA2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @param vaExtdata2 The value of the column 'VA_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata2(String vaExtdata2) {
        registerModifiedProperty("vaExtdata2");
        _vaExtdata2 = vaExtdata2;
    }

    /**
     * [get] VA_EXTDATA3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @return The value of the column 'VA_EXTDATA3'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata3() {
        checkSpecifiedProperty("vaExtdata3");
        return convertEmptyToNull(_vaExtdata3);
    }

    /**
     * [set] VA_EXTDATA3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @param vaExtdata3 The value of the column 'VA_EXTDATA3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata3(String vaExtdata3) {
        registerModifiedProperty("vaExtdata3");
        _vaExtdata3 = vaExtdata3;
    }

    /**
     * [get] NV_EXTDATA1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @return The value of the column 'NV_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getNvExtdata1() {
        checkSpecifiedProperty("nvExtdata1");
        return convertEmptyToNull(_nvExtdata1);
    }

    /**
     * [set] NV_EXTDATA1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @param nvExtdata1 The value of the column 'NV_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNvExtdata1(String nvExtdata1) {
        registerModifiedProperty("nvExtdata1");
        _nvExtdata1 = nvExtdata1;
    }

    /**
     * [get] NV_EXTDATA2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @return The value of the column 'NV_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public String getNvExtdata2() {
        checkSpecifiedProperty("nvExtdata2");
        return convertEmptyToNull(_nvExtdata2);
    }

    /**
     * [set] NV_EXTDATA2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @param nvExtdata2 The value of the column 'NV_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNvExtdata2(String nvExtdata2) {
        registerModifiedProperty("nvExtdata2");
        _nvExtdata2 = nvExtdata2;
    }

    /**
     * [get] NV_EXTDATA3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @return The value of the column 'NV_EXTDATA3'. (NullAllowed even if selected: for no constraint)
     */
    public String getNvExtdata3() {
        checkSpecifiedProperty("nvExtdata3");
        return convertEmptyToNull(_nvExtdata3);
    }

    /**
     * [set] NV_EXTDATA3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @param nvExtdata3 The value of the column 'NV_EXTDATA3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNvExtdata3(String nvExtdata3) {
        registerModifiedProperty("nvExtdata3");
        _nvExtdata3 = nvExtdata3;
    }

    /**
     * [get] NM_EXTDATA1: {bigint(19)} <br>
     * 数値拡張項目１
     * @return The value of the column 'NM_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNmExtdata1() {
        checkSpecifiedProperty("nmExtdata1");
        return _nmExtdata1;
    }

    /**
     * [set] NM_EXTDATA1: {bigint(19)} <br>
     * 数値拡張項目１
     * @param nmExtdata1 The value of the column 'NM_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmExtdata1(Long nmExtdata1) {
        registerModifiedProperty("nmExtdata1");
        _nmExtdata1 = nmExtdata1;
    }

    /**
     * [get] NM_EXTDATA2: {bigint(19)} <br>
     * 数値拡張項目２
     * @return The value of the column 'NM_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNmExtdata2() {
        checkSpecifiedProperty("nmExtdata2");
        return _nmExtdata2;
    }

    /**
     * [set] NM_EXTDATA2: {bigint(19)} <br>
     * 数値拡張項目２
     * @param nmExtdata2 The value of the column 'NM_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmExtdata2(Long nmExtdata2) {
        registerModifiedProperty("nmExtdata2");
        _nmExtdata2 = nmExtdata2;
    }

    /**
     * [get] NM_EXTDATA3: {bigint(19)} <br>
     * 数値拡張項目３
     * @return The value of the column 'NM_EXTDATA3'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNmExtdata3() {
        checkSpecifiedProperty("nmExtdata3");
        return _nmExtdata3;
    }

    /**
     * [set] NM_EXTDATA3: {bigint(19)} <br>
     * 数値拡張項目３
     * @param nmExtdata3 The value of the column 'NM_EXTDATA3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmExtdata3(Long nmExtdata3) {
        registerModifiedProperty("nmExtdata3");
        _nmExtdata3 = nmExtdata3;
    }

    /**
     * [get] DT_EXTDATA1: {varchar(8)} <br>
     * 日付拡張項目１
     * @return The value of the column 'DT_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata1() {
        checkSpecifiedProperty("dtExtdata1");
        return convertEmptyToNull(_dtExtdata1);
    }

    /**
     * [set] DT_EXTDATA1: {varchar(8)} <br>
     * 日付拡張項目１
     * @param dtExtdata1 The value of the column 'DT_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata1(String dtExtdata1) {
        registerModifiedProperty("dtExtdata1");
        _dtExtdata1 = dtExtdata1;
    }

    /**
     * [get] DT_EXTDATA2: {varchar(8)} <br>
     * 日付拡張項目２
     * @return The value of the column 'DT_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata2() {
        checkSpecifiedProperty("dtExtdata2");
        return convertEmptyToNull(_dtExtdata2);
    }

    /**
     * [set] DT_EXTDATA2: {varchar(8)} <br>
     * 日付拡張項目２
     * @param dtExtdata2 The value of the column 'DT_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata2(String dtExtdata2) {
        registerModifiedProperty("dtExtdata2");
        _dtExtdata2 = dtExtdata2;
    }

    /**
     * [get] DT_EXTDATA3: {varchar(8)} <br>
     * 日付拡張項目３
     * @return The value of the column 'DT_EXTDATA3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata3() {
        checkSpecifiedProperty("dtExtdata3");
        return convertEmptyToNull(_dtExtdata3);
    }

    /**
     * [set] DT_EXTDATA3: {varchar(8)} <br>
     * 日付拡張項目３
     * @param dtExtdata3 The value of the column 'DT_EXTDATA3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata3(String dtExtdata3) {
        registerModifiedProperty("dtExtdata3");
        _dtExtdata3 = dtExtdata3;
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