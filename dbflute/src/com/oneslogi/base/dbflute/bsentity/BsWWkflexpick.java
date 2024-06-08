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
 * The entity of W_WKFLEXPICK as TABLE. <br>
 * 融通山出しリスト作業用ワーク
 * <pre>
 * [primary-key]
 *     ZIP_INPUT_ID
 *
 * [column]
 *     ZIP_INPUT_ID, PrintKey, FlexibityNo, FlexPickListNo, FlexPickListLNo, WarehouseCd, WarehouseName, ShipCd, Ship_Name, SchDate, TransportCd, PRODUCT_CD, Item_Name, ManufacturDate, DesignCd, QtyCase, QtyBowl, RootOutSeq, UserNum1, UserNum3, VA_ExtData1, VA_ExtData2, VA_ExtData3, NV_ExtData1, NV_ExtData2, NV_ExtData3, NM_ExtData1, NM_ExtData2, NM_ExtData3, DT_ExtData1, DT_ExtData2, DT_ExtData3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZIP_INPUT_ID
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
 * Long zipInputId = entity.getZipInputId();
 * Long printkey = entity.getPrintkey();
 * java.math.BigDecimal flexibityno = entity.getFlexibityno();
 * String flexpicklistno = entity.getFlexpicklistno();
 * java.math.BigDecimal flexpicklistlno = entity.getFlexpicklistlno();
 * String warehousecd = entity.getWarehousecd();
 * String warehousename = entity.getWarehousename();
 * String shipcd = entity.getShipcd();
 * String shipName = entity.getShipName();
 * String schdate = entity.getSchdate();
 * String transportcd = entity.getTransportcd();
 * String productCd = entity.getProductCd();
 * String itemName = entity.getItemName();
 * String manufacturdate = entity.getManufacturdate();
 * String designcd = entity.getDesigncd();
 * java.math.BigDecimal qtycase = entity.getQtycase();
 * java.math.BigDecimal qtybowl = entity.getQtybowl();
 * java.math.BigDecimal rootoutseq = entity.getRootoutseq();
 * Long usernum1 = entity.getUsernum1();
 * Long usernum3 = entity.getUsernum3();
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
 * entity.setZipInputId(zipInputId);
 * entity.setPrintkey(printkey);
 * entity.setFlexibityno(flexibityno);
 * entity.setFlexpicklistno(flexpicklistno);
 * entity.setFlexpicklistlno(flexpicklistlno);
 * entity.setWarehousecd(warehousecd);
 * entity.setWarehousename(warehousename);
 * entity.setShipcd(shipcd);
 * entity.setShipName(shipName);
 * entity.setSchdate(schdate);
 * entity.setTransportcd(transportcd);
 * entity.setProductCd(productCd);
 * entity.setItemName(itemName);
 * entity.setManufacturdate(manufacturdate);
 * entity.setDesigncd(designcd);
 * entity.setQtycase(qtycase);
 * entity.setQtybowl(qtybowl);
 * entity.setRootoutseq(rootoutseq);
 * entity.setUsernum1(usernum1);
 * entity.setUsernum3(usernum3);
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
public abstract class BsWWkflexpick extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _zipInputId;

    /** PrintKey: {NotNull, bigint(19)} */
    protected Long _printkey;

    /** FlexibityNo: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _flexibityno;

    /** FlexPickListNo: {NotNull, varchar(30)} */
    protected String _flexpicklistno;

    /** FlexPickListLNo: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _flexpicklistlno;

    /** WarehouseCd: {varchar(30)} */
    protected String _warehousecd;

    /** WarehouseName: {varchar(100)} */
    protected String _warehousename;

    /** ShipCd: {varchar(30)} */
    protected String _shipcd;

    /** Ship_Name: {varchar(100)} */
    protected String _shipName;

    /** SchDate: {varchar(8)} */
    protected String _schdate;

    /** TransportCd: {varchar(30)} */
    protected String _transportcd;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** Item_Name: {varchar(100)} */
    protected String _itemName;

    /** ManufacturDate: {varchar(8)} */
    protected String _manufacturdate;

    /** DesignCd: {varchar(30)} */
    protected String _designcd;

    /** QtyCase: {decimal(16, 6)} */
    protected java.math.BigDecimal _qtycase;

    /** QtyBowl: {decimal(16, 6)} */
    protected java.math.BigDecimal _qtybowl;

    /** RootOutSeq: {decimal(16, 6)} */
    protected java.math.BigDecimal _rootoutseq;

    /** UserNum1: {bigint(19)} */
    protected Long _usernum1;

    /** UserNum3: {bigint(19)} */
    protected Long _usernum3;

    /** VA_ExtData1: {varchar(30)} */
    protected String _vaExtdata1;

    /** VA_ExtData2: {varchar(30)} */
    protected String _vaExtdata2;

    /** VA_ExtData3: {varchar(30)} */
    protected String _vaExtdata3;

    /** NV_ExtData1: {varchar(60)} */
    protected String _nvExtdata1;

    /** NV_ExtData2: {varchar(60)} */
    protected String _nvExtdata2;

    /** NV_ExtData3: {varchar(60)} */
    protected String _nvExtdata3;

    /** NM_ExtData1: {bigint(19)} */
    protected Long _nmExtdata1;

    /** NM_ExtData2: {bigint(19)} */
    protected Long _nmExtdata2;

    /** NM_ExtData3: {bigint(19)} */
    protected Long _nmExtdata3;

    /** DT_ExtData1: {varchar(8)} */
    protected String _dtExtdata1;

    /** DT_ExtData2: {varchar(8)} */
    protected String _dtExtdata2;

    /** DT_ExtData3: {varchar(8)} */
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
        return "W_WKFLEXPICK";
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
        if (_zipInputId == null) { return false; }
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
        if (obj instanceof BsWWkflexpick) {
            BsWWkflexpick other = (BsWWkflexpick)obj;
            if (!xSV(_zipInputId, other._zipInputId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _zipInputId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_zipInputId));
        sb.append(dm).append(xfND(_printkey));
        sb.append(dm).append(xfND(_flexibityno));
        sb.append(dm).append(xfND(_flexpicklistno));
        sb.append(dm).append(xfND(_flexpicklistlno));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_warehousename));
        sb.append(dm).append(xfND(_shipcd));
        sb.append(dm).append(xfND(_shipName));
        sb.append(dm).append(xfND(_schdate));
        sb.append(dm).append(xfND(_transportcd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_itemName));
        sb.append(dm).append(xfND(_manufacturdate));
        sb.append(dm).append(xfND(_designcd));
        sb.append(dm).append(xfND(_qtycase));
        sb.append(dm).append(xfND(_qtybowl));
        sb.append(dm).append(xfND(_rootoutseq));
        sb.append(dm).append(xfND(_usernum1));
        sb.append(dm).append(xfND(_usernum3));
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
    public WWkflexpick clone() {
        return (WWkflexpick)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通山出しリスト作業用ワークID
     * @return The value of the column 'ZIP_INPUT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getZipInputId() {
        checkSpecifiedProperty("zipInputId");
        return _zipInputId;
    }

    /**
     * [set] ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通山出しリスト作業用ワークID
     * @param zipInputId The value of the column 'ZIP_INPUT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setZipInputId(Long zipInputId) {
        registerModifiedProperty("zipInputId");
        _zipInputId = zipInputId;
    }

    /**
     * [get] PrintKey: {NotNull, bigint(19)} <br>
     * 印刷キー
     * @return The value of the column 'PrintKey'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintkey() {
        checkSpecifiedProperty("printkey");
        return _printkey;
    }

    /**
     * [set] PrintKey: {NotNull, bigint(19)} <br>
     * 印刷キー
     * @param printkey The value of the column 'PrintKey'. (basically NotNull if update: for the constraint)
     */
    public void setPrintkey(Long printkey) {
        registerModifiedProperty("printkey");
        _printkey = printkey;
    }

    /**
     * [get] FlexibityNo: {NotNull, decimal(16, 6)} <br>
     * 融通No
     * @return The value of the column 'FlexibityNo'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getFlexibityno() {
        checkSpecifiedProperty("flexibityno");
        return _flexibityno;
    }

    /**
     * [set] FlexibityNo: {NotNull, decimal(16, 6)} <br>
     * 融通No
     * @param flexibityno The value of the column 'FlexibityNo'. (basically NotNull if update: for the constraint)
     */
    public void setFlexibityno(java.math.BigDecimal flexibityno) {
        registerModifiedProperty("flexibityno");
        _flexibityno = flexibityno;
    }

    /**
     * [get] FlexPickListNo: {NotNull, varchar(30)} <br>
     * 融通山出しリストNo.
     * @return The value of the column 'FlexPickListNo'. (basically NotNull if selected: for the constraint)
     */
    public String getFlexpicklistno() {
        checkSpecifiedProperty("flexpicklistno");
        return convertEmptyToNull(_flexpicklistno);
    }

    /**
     * [set] FlexPickListNo: {NotNull, varchar(30)} <br>
     * 融通山出しリストNo.
     * @param flexpicklistno The value of the column 'FlexPickListNo'. (basically NotNull if update: for the constraint)
     */
    public void setFlexpicklistno(String flexpicklistno) {
        registerModifiedProperty("flexpicklistno");
        _flexpicklistno = flexpicklistno;
    }

    /**
     * [get] FlexPickListLNo: {NotNull, decimal(16, 6)} <br>
     * 融通山出しリスト行No.
     * @return The value of the column 'FlexPickListLNo'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getFlexpicklistlno() {
        checkSpecifiedProperty("flexpicklistlno");
        return _flexpicklistlno;
    }

    /**
     * [set] FlexPickListLNo: {NotNull, decimal(16, 6)} <br>
     * 融通山出しリスト行No.
     * @param flexpicklistlno The value of the column 'FlexPickListLNo'. (basically NotNull if update: for the constraint)
     */
    public void setFlexpicklistlno(java.math.BigDecimal flexpicklistlno) {
        registerModifiedProperty("flexpicklistlno");
        _flexpicklistlno = flexpicklistlno;
    }

    /**
     * [get] WarehouseCd: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WarehouseCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WarehouseCd: {varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WarehouseCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] WarehouseName: {varchar(100)} <br>
     * 拠点名称
     * @return The value of the column 'WarehouseName'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousename() {
        checkSpecifiedProperty("warehousename");
        return convertEmptyToNull(_warehousename);
    }

    /**
     * [set] WarehouseName: {varchar(100)} <br>
     * 拠点名称
     * @param warehousename The value of the column 'WarehouseName'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousename(String warehousename) {
        registerModifiedProperty("warehousename");
        _warehousename = warehousename;
    }

    /**
     * [get] ShipCd: {varchar(30)} <br>
     * 発送先CD
     * @return The value of the column 'ShipCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipcd() {
        checkSpecifiedProperty("shipcd");
        return convertEmptyToNull(_shipcd);
    }

    /**
     * [set] ShipCd: {varchar(30)} <br>
     * 発送先CD
     * @param shipcd The value of the column 'ShipCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipcd(String shipcd) {
        registerModifiedProperty("shipcd");
        _shipcd = shipcd;
    }

    /**
     * [get] Ship_Name: {varchar(100)} <br>
     * 発送先名称
     * @return The value of the column 'Ship_Name'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipName() {
        checkSpecifiedProperty("shipName");
        return convertEmptyToNull(_shipName);
    }

    /**
     * [set] Ship_Name: {varchar(100)} <br>
     * 発送先名称
     * @param shipName The value of the column 'Ship_Name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipName(String shipName) {
        registerModifiedProperty("shipName");
        _shipName = shipName;
    }

    /**
     * [get] SchDate: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SchDate'. (NullAllowed even if selected: for no constraint)
     */
    public String getSchdate() {
        checkSpecifiedProperty("schdate");
        return convertEmptyToNull(_schdate);
    }

    /**
     * [set] SchDate: {varchar(8)} <br>
     * 発送予定日
     * @param schdate The value of the column 'SchDate'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSchdate(String schdate) {
        registerModifiedProperty("schdate");
        _schdate = schdate;
    }

    /**
     * [get] TransportCd: {varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TransportCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportcd() {
        checkSpecifiedProperty("transportcd");
        return convertEmptyToNull(_transportcd);
    }

    /**
     * [set] TransportCd: {varchar(30)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TransportCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportcd(String transportcd) {
        registerModifiedProperty("transportcd");
        _transportcd = transportcd;
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
     * [get] Item_Name: {varchar(100)} <br>
     * 銘柄名称
     * @return The value of the column 'Item_Name'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemName() {
        checkSpecifiedProperty("itemName");
        return convertEmptyToNull(_itemName);
    }

    /**
     * [set] Item_Name: {varchar(100)} <br>
     * 銘柄名称
     * @param itemName The value of the column 'Item_Name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemName(String itemName) {
        registerModifiedProperty("itemName");
        _itemName = itemName;
    }

    /**
     * [get] ManufacturDate: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'ManufacturDate'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufacturdate() {
        checkSpecifiedProperty("manufacturdate");
        return convertEmptyToNull(_manufacturdate);
    }

    /**
     * [set] ManufacturDate: {varchar(8)} <br>
     * 製造年月日
     * @param manufacturdate The value of the column 'ManufacturDate'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufacturdate(String manufacturdate) {
        registerModifiedProperty("manufacturdate");
        _manufacturdate = manufacturdate;
    }

    /**
     * [get] DesignCd: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DesignCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncd() {
        checkSpecifiedProperty("designcd");
        return convertEmptyToNull(_designcd);
    }

    /**
     * [set] DesignCd: {varchar(30)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DesignCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncd(String designcd) {
        registerModifiedProperty("designcd");
        _designcd = designcd;
    }

    /**
     * [get] QtyCase: {decimal(16, 6)} <br>
     * 数量（ケース）
     * @return The value of the column 'QtyCase'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getQtycase() {
        checkSpecifiedProperty("qtycase");
        return _qtycase;
    }

    /**
     * [set] QtyCase: {decimal(16, 6)} <br>
     * 数量（ケース）
     * @param qtycase The value of the column 'QtyCase'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQtycase(java.math.BigDecimal qtycase) {
        registerModifiedProperty("qtycase");
        _qtycase = qtycase;
    }

    /**
     * [get] QtyBowl: {decimal(16, 6)} <br>
     * 数量（カートン）
     * @return The value of the column 'QtyBowl'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getQtybowl() {
        checkSpecifiedProperty("qtybowl");
        return _qtybowl;
    }

    /**
     * [set] QtyBowl: {decimal(16, 6)} <br>
     * 数量（カートン）
     * @param qtybowl The value of the column 'QtyBowl'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQtybowl(java.math.BigDecimal qtybowl) {
        registerModifiedProperty("qtybowl");
        _qtybowl = qtybowl;
    }

    /**
     * [get] RootOutSeq: {decimal(16, 6)} <br>
     * 出庫ルート順
     * @return The value of the column 'RootOutSeq'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRootoutseq() {
        checkSpecifiedProperty("rootoutseq");
        return _rootoutseq;
    }

    /**
     * [set] RootOutSeq: {decimal(16, 6)} <br>
     * 出庫ルート順
     * @param rootoutseq The value of the column 'RootOutSeq'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRootoutseq(java.math.BigDecimal rootoutseq) {
        registerModifiedProperty("rootoutseq");
        _rootoutseq = rootoutseq;
    }

    /**
     * [get] UserNum1: {bigint(19)} <br>
     * 使用区分
     * @return The value of the column 'UserNum1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsernum1() {
        checkSpecifiedProperty("usernum1");
        return _usernum1;
    }

    /**
     * [set] UserNum1: {bigint(19)} <br>
     * 使用区分
     * @param usernum1 The value of the column 'UserNum1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum1(Long usernum1) {
        registerModifiedProperty("usernum1");
        _usernum1 = usernum1;
    }

    /**
     * [get] UserNum3: {bigint(19)} <br>
     * 一般出力順
     * @return The value of the column 'UserNum3'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsernum3() {
        checkSpecifiedProperty("usernum3");
        return _usernum3;
    }

    /**
     * [set] UserNum3: {bigint(19)} <br>
     * 一般出力順
     * @param usernum3 The value of the column 'UserNum3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum3(Long usernum3) {
        registerModifiedProperty("usernum3");
        _usernum3 = usernum3;
    }

    /**
     * [get] VA_ExtData1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @return The value of the column 'VA_ExtData1'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata1() {
        checkSpecifiedProperty("vaExtdata1");
        return convertEmptyToNull(_vaExtdata1);
    }

    /**
     * [set] VA_ExtData1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @param vaExtdata1 The value of the column 'VA_ExtData1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata1(String vaExtdata1) {
        registerModifiedProperty("vaExtdata1");
        _vaExtdata1 = vaExtdata1;
    }

    /**
     * [get] VA_ExtData2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @return The value of the column 'VA_ExtData2'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata2() {
        checkSpecifiedProperty("vaExtdata2");
        return convertEmptyToNull(_vaExtdata2);
    }

    /**
     * [set] VA_ExtData2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @param vaExtdata2 The value of the column 'VA_ExtData2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata2(String vaExtdata2) {
        registerModifiedProperty("vaExtdata2");
        _vaExtdata2 = vaExtdata2;
    }

    /**
     * [get] VA_ExtData3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @return The value of the column 'VA_ExtData3'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata3() {
        checkSpecifiedProperty("vaExtdata3");
        return convertEmptyToNull(_vaExtdata3);
    }

    /**
     * [set] VA_ExtData3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @param vaExtdata3 The value of the column 'VA_ExtData3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata3(String vaExtdata3) {
        registerModifiedProperty("vaExtdata3");
        _vaExtdata3 = vaExtdata3;
    }

    /**
     * [get] NV_ExtData1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @return The value of the column 'NV_ExtData1'. (NullAllowed even if selected: for no constraint)
     */
    public String getNvExtdata1() {
        checkSpecifiedProperty("nvExtdata1");
        return convertEmptyToNull(_nvExtdata1);
    }

    /**
     * [set] NV_ExtData1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @param nvExtdata1 The value of the column 'NV_ExtData1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNvExtdata1(String nvExtdata1) {
        registerModifiedProperty("nvExtdata1");
        _nvExtdata1 = nvExtdata1;
    }

    /**
     * [get] NV_ExtData2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @return The value of the column 'NV_ExtData2'. (NullAllowed even if selected: for no constraint)
     */
    public String getNvExtdata2() {
        checkSpecifiedProperty("nvExtdata2");
        return convertEmptyToNull(_nvExtdata2);
    }

    /**
     * [set] NV_ExtData2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @param nvExtdata2 The value of the column 'NV_ExtData2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNvExtdata2(String nvExtdata2) {
        registerModifiedProperty("nvExtdata2");
        _nvExtdata2 = nvExtdata2;
    }

    /**
     * [get] NV_ExtData3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @return The value of the column 'NV_ExtData3'. (NullAllowed even if selected: for no constraint)
     */
    public String getNvExtdata3() {
        checkSpecifiedProperty("nvExtdata3");
        return convertEmptyToNull(_nvExtdata3);
    }

    /**
     * [set] NV_ExtData3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @param nvExtdata3 The value of the column 'NV_ExtData3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNvExtdata3(String nvExtdata3) {
        registerModifiedProperty("nvExtdata3");
        _nvExtdata3 = nvExtdata3;
    }

    /**
     * [get] NM_ExtData1: {bigint(19)} <br>
     * 数値拡張項目１
     * @return The value of the column 'NM_ExtData1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNmExtdata1() {
        checkSpecifiedProperty("nmExtdata1");
        return _nmExtdata1;
    }

    /**
     * [set] NM_ExtData1: {bigint(19)} <br>
     * 数値拡張項目１
     * @param nmExtdata1 The value of the column 'NM_ExtData1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmExtdata1(Long nmExtdata1) {
        registerModifiedProperty("nmExtdata1");
        _nmExtdata1 = nmExtdata1;
    }

    /**
     * [get] NM_ExtData2: {bigint(19)} <br>
     * 数値拡張項目２
     * @return The value of the column 'NM_ExtData2'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNmExtdata2() {
        checkSpecifiedProperty("nmExtdata2");
        return _nmExtdata2;
    }

    /**
     * [set] NM_ExtData2: {bigint(19)} <br>
     * 数値拡張項目２
     * @param nmExtdata2 The value of the column 'NM_ExtData2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmExtdata2(Long nmExtdata2) {
        registerModifiedProperty("nmExtdata2");
        _nmExtdata2 = nmExtdata2;
    }

    /**
     * [get] NM_ExtData3: {bigint(19)} <br>
     * 数値拡張項目３
     * @return The value of the column 'NM_ExtData3'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNmExtdata3() {
        checkSpecifiedProperty("nmExtdata3");
        return _nmExtdata3;
    }

    /**
     * [set] NM_ExtData3: {bigint(19)} <br>
     * 数値拡張項目３
     * @param nmExtdata3 The value of the column 'NM_ExtData3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmExtdata3(Long nmExtdata3) {
        registerModifiedProperty("nmExtdata3");
        _nmExtdata3 = nmExtdata3;
    }

    /**
     * [get] DT_ExtData1: {varchar(8)} <br>
     * 日付拡張項目１
     * @return The value of the column 'DT_ExtData1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata1() {
        checkSpecifiedProperty("dtExtdata1");
        return convertEmptyToNull(_dtExtdata1);
    }

    /**
     * [set] DT_ExtData1: {varchar(8)} <br>
     * 日付拡張項目１
     * @param dtExtdata1 The value of the column 'DT_ExtData1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata1(String dtExtdata1) {
        registerModifiedProperty("dtExtdata1");
        _dtExtdata1 = dtExtdata1;
    }

    /**
     * [get] DT_ExtData2: {varchar(8)} <br>
     * 日付拡張項目２
     * @return The value of the column 'DT_ExtData2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata2() {
        checkSpecifiedProperty("dtExtdata2");
        return convertEmptyToNull(_dtExtdata2);
    }

    /**
     * [set] DT_ExtData2: {varchar(8)} <br>
     * 日付拡張項目２
     * @param dtExtdata2 The value of the column 'DT_ExtData2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata2(String dtExtdata2) {
        registerModifiedProperty("dtExtdata2");
        _dtExtdata2 = dtExtdata2;
    }

    /**
     * [get] DT_ExtData3: {varchar(8)} <br>
     * 日付拡張項目３
     * @return The value of the column 'DT_ExtData3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata3() {
        checkSpecifiedProperty("dtExtdata3");
        return convertEmptyToNull(_dtExtdata3);
    }

    /**
     * [set] DT_ExtData3: {varchar(8)} <br>
     * 日付拡張項目３
     * @param dtExtdata3 The value of the column 'DT_ExtData3'. (NullAllowed: null update allowed for no constraint)
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
