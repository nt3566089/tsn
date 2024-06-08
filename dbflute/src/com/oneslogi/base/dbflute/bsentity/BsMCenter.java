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
 * The entity of M_CENTER as TABLE. <br>
 * 拠点マスタ
 * <pre>
 * [primary-key]
 *     CENTER_ID
 *
 * [column]
 *     CENTER_ID, CENTER_CD, CENTER_NM, CENTER_ABBR, CULTURE_ID, TIME_ZONE_ID, WarehouseGroup, VirtualWhouseFlg, Aname, Address1, Address2, Address3, PostNo, CountryCd, PortCd, DistrictCd, Phone1, Phone2, Fax1, Fax2, WarehouseFlg, RefName, SubcontractFlg, WeightCapacity, Capacity, HULFT_ID, WarehouseCls, CMLRASID, OWN_OR_ANOTHER_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_TIME_ZONE, B_CULTURE, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_BOX, M_BOX_GRP, M_CARRIER, M_CARRIER_SLIP_SGW, M_CARRIER_SLIP_YMT, M_CARRIER_SLIP_YUPK, M_CBLK, M_CBRCTG, M_CDRCATT, M_CENTER_CLASS, M_CENTER_COL, M_CENTER_CUSTOMER, M_CENTER_ITEM, M_CENTER_SCREEN, M_CLIENT_CENTER, M_CLIN, M_CORG, M_DELIVERY_COURSE, M_LOCATION, M_MFINVOPERATION, M_MFMONTHCHG, M_MFSTOCKITEM, M_MFWHSTRCT, M_MFWHxITEM, M_NUMBERING_CENTER, M_USER_CENTER, M_USER_LOGIN, M_WAREHOUSE, M_WEB_HT_INFO, T_ALLOC_INST_H, T_CCOPAM, T_CENTER_SYMBOL, T_CORDHDR, T_CSRWHADM, T_EC_ORDER_H, T_INVENTORY_H, T_MFLASTSHIPLOT, T_MOVE_INST_H, T_PACKING_H, T_PALLET, T_PICKING_H, T_PIC_MTHD_RCMD, T_RECEIVE_PLAN_H, T_SERIAL_NO, T_SHIPPING_INST_H, T_SPLINFO, T_STORE_RECORD_H, T_TRALLINV, T_TRALLINVHISTORY, T_TRCASEINVENTORY, T_TRCASENUM, T_TRCASESTOCK, T_TRHANBAIINV, T_TRINVCHECKINFO, T_TRINVCORRECT, T_TRINVREANSWER, T_TRINVREQUEST, T_TRITEMCONVRESULT, T_TRJUKYUINV, T_TRMANUFACTUREDATE, T_TRMANUFACTUREDATEDETAIL, T_TRMANUFACTUREDATEHISTORY, T_TRPALLETTRACE, T_TRREVERSESTOCK, T_TRSTOCKDIFFHISTORY, T_TRSYMBOLTRACE, T_TRSYMBOLTRACEEXTEND, T_TRTRACE, T_YTRSO, W_HT_INVENTORY_INPUT_PROD, W_HT_LOADING, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SERIAL_RECEIVE_INSP, W_HT_SERIAL_SHIPPING_INSP, W_HT_SHIPPING, W_HT_SHIPPING_PICKING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT
 *
 * [foreign property]
 *     bTimeZone, bCulture, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mBoxList, mBoxGrpList, mCarrierList, mCarrierSlipSgwList, mCarrierSlipYmtList, mCarrierSlipYupkList, mCblkList, mCbrctgList, mCdrcattList, mCenterClassList, mCenterColList, mCenterCustomerList, mCenterItemList, mCenterScreenList, mClientCenterList, mClinList, mCorgList, mDeliveryCourseList, mLocationList, mMfinvoperationList, mMfmonthchgList, mMfstockitemList, mMfwhstrctList, mMfwhxitemList, mNumberingCenterList, mUserCenterList, mUserLoginList, mWarehouseList, mWebHtInfoList, tAllocInstHList, tCcopamList, tCenterSymbolList, tCordhdrList, tCsrwhadmList, tEcOrderHList, tInventoryHList, tMflastshiplotList, tMoveInstHList, tPackingHList, tPalletList, tPickingHList, tPicMthdRcmdList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tSplinfoList, tStoreRecordHList, tTrallinvList, tTrallinvhistoryList, tTrcaseinventoryList, tTrcasenumList, tTrcasestockList, tTrhanbaiinvList, tTrinvcheckinfoList, tTrinvcorrectList, tTrinvreanswerList, tTrinvrequestList, tTritemconvresultList, tTrjukyuinvList, tTrmanufacturedateList, tTrmanufacturedatedetailList, tTrmanufacturedatehistoryList, tTrpallettraceList, tTrreversestockList, tTrstockdiffhistoryList, tTrsymboltraceList, tTrsymboltraceextendList, tTrtraceList, tYtrsoList, wHtInventoryInputProdList, wHtLoadingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wSglRowShipInspHList, wShippingInterruptList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String centerAbbr = entity.getCenterAbbr();
 * Long cultureId = entity.getCultureId();
 * Long timeZoneId = entity.getTimeZoneId();
 * String warehousegroup = entity.getWarehousegroup();
 * String virtualwhouseflg = entity.getVirtualwhouseflg();
 * String aname = entity.getAname();
 * String address1 = entity.getAddress1();
 * String address2 = entity.getAddress2();
 * String address3 = entity.getAddress3();
 * String postno = entity.getPostno();
 * String countrycd = entity.getCountrycd();
 * String portcd = entity.getPortcd();
 * String districtcd = entity.getDistrictcd();
 * String phone1 = entity.getPhone1();
 * String phone2 = entity.getPhone2();
 * String fax1 = entity.getFax1();
 * String fax2 = entity.getFax2();
 * String warehouseflg = entity.getWarehouseflg();
 * String refname = entity.getRefname();
 * java.math.BigDecimal subcontractflg = entity.getSubcontractflg();
 * java.math.BigDecimal weightcapacity = entity.getWeightcapacity();
 * java.math.BigDecimal capacity = entity.getCapacity();
 * Long hulftId = entity.getHulftId();
 * String warehousecls = entity.getWarehousecls();
 * String cmlrasid = entity.getCmlrasid();
 * String ownOrAnotherFlg = entity.getOwnOrAnotherFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setCultureId(cultureId);
 * entity.setTimeZoneId(timeZoneId);
 * entity.setWarehousegroup(warehousegroup);
 * entity.setVirtualwhouseflg(virtualwhouseflg);
 * entity.setAname(aname);
 * entity.setAddress1(address1);
 * entity.setAddress2(address2);
 * entity.setAddress3(address3);
 * entity.setPostno(postno);
 * entity.setCountrycd(countrycd);
 * entity.setPortcd(portcd);
 * entity.setDistrictcd(districtcd);
 * entity.setPhone1(phone1);
 * entity.setPhone2(phone2);
 * entity.setFax1(fax1);
 * entity.setFax2(fax2);
 * entity.setWarehouseflg(warehouseflg);
 * entity.setRefname(refname);
 * entity.setSubcontractflg(subcontractflg);
 * entity.setWeightcapacity(weightcapacity);
 * entity.setCapacity(capacity);
 * entity.setHulftId(hulftId);
 * entity.setWarehousecls(warehousecls);
 * entity.setCmlrasid(cmlrasid);
 * entity.setOwnOrAnotherFlg(ownOrAnotherFlg);
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
public abstract class BsMCenter extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CENTER_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _centerId;

    /** CENTER_CD: {UQ, NotNull, varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {NotNull, varchar(60)} */
    protected String _centerNm;

    /** CENTER_ABBR: {varchar(60)} */
    protected String _centerAbbr;

    /** CULTURE_ID: {IX, bigint(19), FK to B_CULTURE} */
    protected Long _cultureId;

    /** TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE} */
    protected Long _timeZoneId;

    /** WarehouseGroup: {varchar(255)} */
    protected String _warehousegroup;

    /** VirtualWhouseFlg: {char(1)} */
    protected String _virtualwhouseflg;

    /** Aname: {varchar(255)} */
    protected String _aname;

    /** Address1: {varchar(255)} */
    protected String _address1;

    /** Address2: {varchar(255)} */
    protected String _address2;

    /** Address3: {varchar(255)} */
    protected String _address3;

    /** PostNo: {varchar(255)} */
    protected String _postno;

    /** CountryCd: {varchar(255)} */
    protected String _countrycd;

    /** PortCd: {varchar(255)} */
    protected String _portcd;

    /** DistrictCd: {varchar(255)} */
    protected String _districtcd;

    /** Phone1: {varchar(255)} */
    protected String _phone1;

    /** Phone2: {varchar(255)} */
    protected String _phone2;

    /** Fax1: {varchar(255)} */
    protected String _fax1;

    /** Fax2: {varchar(255)} */
    protected String _fax2;

    /** WarehouseFlg: {char(1)} */
    protected String _warehouseflg;

    /** RefName: {varchar(255)} */
    protected String _refname;

    /** SubcontractFlg: {decimal(16, 6)} */
    protected java.math.BigDecimal _subcontractflg;

    /** WeightCapacity: {decimal(16, 6)} */
    protected java.math.BigDecimal _weightcapacity;

    /** Capacity: {decimal(16, 6)} */
    protected java.math.BigDecimal _capacity;

    /** HULFT_ID: {bigint(19)} */
    protected Long _hulftId;

    /** WarehouseCls: {char(1)} */
    protected String _warehousecls;

    /** CMLRASID: {varchar(30)} */
    protected String _cmlrasid;

    /** OWN_OR_ANOTHER_FLG: {varchar(30)} */
    protected String _ownOrAnotherFlg;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
        return "M_CENTER";
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
        if (_centerId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param centerCd : UQ, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(String centerCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("centerCd");
        setCenterCd(centerCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
    /** B_TIME_ZONE by my TIME_ZONE_ID, named 'BTimeZone'. */
    protected BTimeZone _bTimeZone;

    /**
     * [get] B_TIME_ZONE by my TIME_ZONE_ID, named 'BTimeZone'. <br>
     * @return The entity of foreign property 'BTimeZone'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BTimeZone getBTimeZone() {
        return _bTimeZone;
    }

    /**
     * [set] B_TIME_ZONE by my TIME_ZONE_ID, named 'BTimeZone'.
     * @param bTimeZone The entity of foreign property 'BTimeZone'. (NullAllowed)
     */
    public void setBTimeZone(BTimeZone bTimeZone) {
        _bTimeZone = bTimeZone;
    }

    /** B_CULTURE by my CULTURE_ID, named 'BCulture'. */
    protected BCulture _bCulture;

    /**
     * [get] B_CULTURE by my CULTURE_ID, named 'BCulture'. <br>
     * @return The entity of foreign property 'BCulture'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BCulture getBCulture() {
        return _bCulture;
    }

    /**
     * [set] B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @param bCulture The entity of foreign property 'BCulture'. (NullAllowed)
     */
    public void setBCulture(BCulture bCulture) {
        _bCulture = bCulture;
    }

    /** B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. */
    protected BClassDtl _bClassDtlByDelFlg;

    /**
     * [get] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    /**
     * [set] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @param bClassDtlByDelFlg The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelFlg(BClassDtl bClassDtlByDelFlg) {
        _bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_BOX by CENTER_ID, named 'MBoxList'. */
    protected List<MBox> _mBoxList;

    /**
     * [get] M_BOX by CENTER_ID, named 'MBoxList'.
     * @return The entity list of referrer property 'MBoxList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MBox> getMBoxList() {
        if (_mBoxList == null) { _mBoxList = newReferrerList(); }
        return _mBoxList;
    }

    /**
     * [set] M_BOX by CENTER_ID, named 'MBoxList'.
     * @param mBoxList The entity list of referrer property 'MBoxList'. (NullAllowed)
     */
    public void setMBoxList(List<MBox> mBoxList) {
        _mBoxList = mBoxList;
    }

    /** M_BOX_GRP by CENTER_ID, named 'MBoxGrpList'. */
    protected List<MBoxGrp> _mBoxGrpList;

    /**
     * [get] M_BOX_GRP by CENTER_ID, named 'MBoxGrpList'.
     * @return The entity list of referrer property 'MBoxGrpList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MBoxGrp> getMBoxGrpList() {
        if (_mBoxGrpList == null) { _mBoxGrpList = newReferrerList(); }
        return _mBoxGrpList;
    }

    /**
     * [set] M_BOX_GRP by CENTER_ID, named 'MBoxGrpList'.
     * @param mBoxGrpList The entity list of referrer property 'MBoxGrpList'. (NullAllowed)
     */
    public void setMBoxGrpList(List<MBoxGrp> mBoxGrpList) {
        _mBoxGrpList = mBoxGrpList;
    }

    /** M_CARRIER by CENTER_ID, named 'MCarrierList'. */
    protected List<MCarrier> _mCarrierList;

    /**
     * [get] M_CARRIER by CENTER_ID, named 'MCarrierList'.
     * @return The entity list of referrer property 'MCarrierList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrier> getMCarrierList() {
        if (_mCarrierList == null) { _mCarrierList = newReferrerList(); }
        return _mCarrierList;
    }

    /**
     * [set] M_CARRIER by CENTER_ID, named 'MCarrierList'.
     * @param mCarrierList The entity list of referrer property 'MCarrierList'. (NullAllowed)
     */
    public void setMCarrierList(List<MCarrier> mCarrierList) {
        _mCarrierList = mCarrierList;
    }

    /** M_CARRIER_SLIP_SGW by CENTER_ID, named 'MCarrierSlipSgwList'. */
    protected List<MCarrierSlipSgw> _mCarrierSlipSgwList;

    /**
     * [get] M_CARRIER_SLIP_SGW by CENTER_ID, named 'MCarrierSlipSgwList'.
     * @return The entity list of referrer property 'MCarrierSlipSgwList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierSlipSgw> getMCarrierSlipSgwList() {
        if (_mCarrierSlipSgwList == null) { _mCarrierSlipSgwList = newReferrerList(); }
        return _mCarrierSlipSgwList;
    }

    /**
     * [set] M_CARRIER_SLIP_SGW by CENTER_ID, named 'MCarrierSlipSgwList'.
     * @param mCarrierSlipSgwList The entity list of referrer property 'MCarrierSlipSgwList'. (NullAllowed)
     */
    public void setMCarrierSlipSgwList(List<MCarrierSlipSgw> mCarrierSlipSgwList) {
        _mCarrierSlipSgwList = mCarrierSlipSgwList;
    }

    /** M_CARRIER_SLIP_YMT by CENTER_ID, named 'MCarrierSlipYmtList'. */
    protected List<MCarrierSlipYmt> _mCarrierSlipYmtList;

    /**
     * [get] M_CARRIER_SLIP_YMT by CENTER_ID, named 'MCarrierSlipYmtList'.
     * @return The entity list of referrer property 'MCarrierSlipYmtList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierSlipYmt> getMCarrierSlipYmtList() {
        if (_mCarrierSlipYmtList == null) { _mCarrierSlipYmtList = newReferrerList(); }
        return _mCarrierSlipYmtList;
    }

    /**
     * [set] M_CARRIER_SLIP_YMT by CENTER_ID, named 'MCarrierSlipYmtList'.
     * @param mCarrierSlipYmtList The entity list of referrer property 'MCarrierSlipYmtList'. (NullAllowed)
     */
    public void setMCarrierSlipYmtList(List<MCarrierSlipYmt> mCarrierSlipYmtList) {
        _mCarrierSlipYmtList = mCarrierSlipYmtList;
    }

    /** M_CARRIER_SLIP_YUPK by CENTER_ID, named 'MCarrierSlipYupkList'. */
    protected List<MCarrierSlipYupk> _mCarrierSlipYupkList;

    /**
     * [get] M_CARRIER_SLIP_YUPK by CENTER_ID, named 'MCarrierSlipYupkList'.
     * @return The entity list of referrer property 'MCarrierSlipYupkList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierSlipYupk> getMCarrierSlipYupkList() {
        if (_mCarrierSlipYupkList == null) { _mCarrierSlipYupkList = newReferrerList(); }
        return _mCarrierSlipYupkList;
    }

    /**
     * [set] M_CARRIER_SLIP_YUPK by CENTER_ID, named 'MCarrierSlipYupkList'.
     * @param mCarrierSlipYupkList The entity list of referrer property 'MCarrierSlipYupkList'. (NullAllowed)
     */
    public void setMCarrierSlipYupkList(List<MCarrierSlipYupk> mCarrierSlipYupkList) {
        _mCarrierSlipYupkList = mCarrierSlipYupkList;
    }

    /** M_CBLK by CENTER_ID, named 'MCblkList'. */
    protected List<MCblk> _mCblkList;

    /**
     * [get] M_CBLK by CENTER_ID, named 'MCblkList'.
     * @return The entity list of referrer property 'MCblkList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCblk> getMCblkList() {
        if (_mCblkList == null) { _mCblkList = newReferrerList(); }
        return _mCblkList;
    }

    /**
     * [set] M_CBLK by CENTER_ID, named 'MCblkList'.
     * @param mCblkList The entity list of referrer property 'MCblkList'. (NullAllowed)
     */
    public void setMCblkList(List<MCblk> mCblkList) {
        _mCblkList = mCblkList;
    }

    /** M_CBRCTG by CENTER_ID, named 'MCbrctgList'. */
    protected List<MCbrctg> _mCbrctgList;

    /**
     * [get] M_CBRCTG by CENTER_ID, named 'MCbrctgList'.
     * @return The entity list of referrer property 'MCbrctgList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCbrctg> getMCbrctgList() {
        if (_mCbrctgList == null) { _mCbrctgList = newReferrerList(); }
        return _mCbrctgList;
    }

    /**
     * [set] M_CBRCTG by CENTER_ID, named 'MCbrctgList'.
     * @param mCbrctgList The entity list of referrer property 'MCbrctgList'. (NullAllowed)
     */
    public void setMCbrctgList(List<MCbrctg> mCbrctgList) {
        _mCbrctgList = mCbrctgList;
    }

    /** M_CDRCATT by CENTER_ID, named 'MCdrcattList'. */
    protected List<MCdrcatt> _mCdrcattList;

    /**
     * [get] M_CDRCATT by CENTER_ID, named 'MCdrcattList'.
     * @return The entity list of referrer property 'MCdrcattList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCdrcatt> getMCdrcattList() {
        if (_mCdrcattList == null) { _mCdrcattList = newReferrerList(); }
        return _mCdrcattList;
    }

    /**
     * [set] M_CDRCATT by CENTER_ID, named 'MCdrcattList'.
     * @param mCdrcattList The entity list of referrer property 'MCdrcattList'. (NullAllowed)
     */
    public void setMCdrcattList(List<MCdrcatt> mCdrcattList) {
        _mCdrcattList = mCdrcattList;
    }

    /** M_CENTER_CLASS by CENTER_ID, named 'MCenterClassList'. */
    protected List<MCenterClass> _mCenterClassList;

    /**
     * [get] M_CENTER_CLASS by CENTER_ID, named 'MCenterClassList'.
     * @return The entity list of referrer property 'MCenterClassList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterClass> getMCenterClassList() {
        if (_mCenterClassList == null) { _mCenterClassList = newReferrerList(); }
        return _mCenterClassList;
    }

    /**
     * [set] M_CENTER_CLASS by CENTER_ID, named 'MCenterClassList'.
     * @param mCenterClassList The entity list of referrer property 'MCenterClassList'. (NullAllowed)
     */
    public void setMCenterClassList(List<MCenterClass> mCenterClassList) {
        _mCenterClassList = mCenterClassList;
    }

    /** M_CENTER_COL by CENTER_ID, named 'MCenterColList'. */
    protected List<MCenterCol> _mCenterColList;

    /**
     * [get] M_CENTER_COL by CENTER_ID, named 'MCenterColList'.
     * @return The entity list of referrer property 'MCenterColList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterCol> getMCenterColList() {
        if (_mCenterColList == null) { _mCenterColList = newReferrerList(); }
        return _mCenterColList;
    }

    /**
     * [set] M_CENTER_COL by CENTER_ID, named 'MCenterColList'.
     * @param mCenterColList The entity list of referrer property 'MCenterColList'. (NullAllowed)
     */
    public void setMCenterColList(List<MCenterCol> mCenterColList) {
        _mCenterColList = mCenterColList;
    }

    /** M_CENTER_CUSTOMER by CENTER_ID, named 'MCenterCustomerList'. */
    protected List<MCenterCustomer> _mCenterCustomerList;

    /**
     * [get] M_CENTER_CUSTOMER by CENTER_ID, named 'MCenterCustomerList'.
     * @return The entity list of referrer property 'MCenterCustomerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterCustomer> getMCenterCustomerList() {
        if (_mCenterCustomerList == null) { _mCenterCustomerList = newReferrerList(); }
        return _mCenterCustomerList;
    }

    /**
     * [set] M_CENTER_CUSTOMER by CENTER_ID, named 'MCenterCustomerList'.
     * @param mCenterCustomerList The entity list of referrer property 'MCenterCustomerList'. (NullAllowed)
     */
    public void setMCenterCustomerList(List<MCenterCustomer> mCenterCustomerList) {
        _mCenterCustomerList = mCenterCustomerList;
    }

    /** M_CENTER_ITEM by CENTER_ID, named 'MCenterItemList'. */
    protected List<MCenterItem> _mCenterItemList;

    /**
     * [get] M_CENTER_ITEM by CENTER_ID, named 'MCenterItemList'.
     * @return The entity list of referrer property 'MCenterItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterItem> getMCenterItemList() {
        if (_mCenterItemList == null) { _mCenterItemList = newReferrerList(); }
        return _mCenterItemList;
    }

    /**
     * [set] M_CENTER_ITEM by CENTER_ID, named 'MCenterItemList'.
     * @param mCenterItemList The entity list of referrer property 'MCenterItemList'. (NullAllowed)
     */
    public void setMCenterItemList(List<MCenterItem> mCenterItemList) {
        _mCenterItemList = mCenterItemList;
    }

    /** M_CENTER_SCREEN by CENTER_ID, named 'MCenterScreenList'. */
    protected List<MCenterScreen> _mCenterScreenList;

    /**
     * [get] M_CENTER_SCREEN by CENTER_ID, named 'MCenterScreenList'.
     * @return The entity list of referrer property 'MCenterScreenList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterScreen> getMCenterScreenList() {
        if (_mCenterScreenList == null) { _mCenterScreenList = newReferrerList(); }
        return _mCenterScreenList;
    }

    /**
     * [set] M_CENTER_SCREEN by CENTER_ID, named 'MCenterScreenList'.
     * @param mCenterScreenList The entity list of referrer property 'MCenterScreenList'. (NullAllowed)
     */
    public void setMCenterScreenList(List<MCenterScreen> mCenterScreenList) {
        _mCenterScreenList = mCenterScreenList;
    }

    /** M_CLIENT_CENTER by CENTER_ID, named 'MClientCenterList'. */
    protected List<MClientCenter> _mClientCenterList;

    /**
     * [get] M_CLIENT_CENTER by CENTER_ID, named 'MClientCenterList'.
     * @return The entity list of referrer property 'MClientCenterList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientCenter> getMClientCenterList() {
        if (_mClientCenterList == null) { _mClientCenterList = newReferrerList(); }
        return _mClientCenterList;
    }

    /**
     * [set] M_CLIENT_CENTER by CENTER_ID, named 'MClientCenterList'.
     * @param mClientCenterList The entity list of referrer property 'MClientCenterList'. (NullAllowed)
     */
    public void setMClientCenterList(List<MClientCenter> mClientCenterList) {
        _mClientCenterList = mClientCenterList;
    }

    /** M_CLIN by CENTER_ID, named 'MClinList'. */
    protected List<MClin> _mClinList;

    /**
     * [get] M_CLIN by CENTER_ID, named 'MClinList'.
     * @return The entity list of referrer property 'MClinList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClin> getMClinList() {
        if (_mClinList == null) { _mClinList = newReferrerList(); }
        return _mClinList;
    }

    /**
     * [set] M_CLIN by CENTER_ID, named 'MClinList'.
     * @param mClinList The entity list of referrer property 'MClinList'. (NullAllowed)
     */
    public void setMClinList(List<MClin> mClinList) {
        _mClinList = mClinList;
    }

    /** M_CORG by CENTER_ID, named 'MCorgList'. */
    protected List<MCorg> _mCorgList;

    /**
     * [get] M_CORG by CENTER_ID, named 'MCorgList'.
     * @return The entity list of referrer property 'MCorgList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCorg> getMCorgList() {
        if (_mCorgList == null) { _mCorgList = newReferrerList(); }
        return _mCorgList;
    }

    /**
     * [set] M_CORG by CENTER_ID, named 'MCorgList'.
     * @param mCorgList The entity list of referrer property 'MCorgList'. (NullAllowed)
     */
    public void setMCorgList(List<MCorg> mCorgList) {
        _mCorgList = mCorgList;
    }

    /** M_DELIVERY_COURSE by CENTER_ID, named 'MDeliveryCourseList'. */
    protected List<MDeliveryCourse> _mDeliveryCourseList;

    /**
     * [get] M_DELIVERY_COURSE by CENTER_ID, named 'MDeliveryCourseList'.
     * @return The entity list of referrer property 'MDeliveryCourseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MDeliveryCourse> getMDeliveryCourseList() {
        if (_mDeliveryCourseList == null) { _mDeliveryCourseList = newReferrerList(); }
        return _mDeliveryCourseList;
    }

    /**
     * [set] M_DELIVERY_COURSE by CENTER_ID, named 'MDeliveryCourseList'.
     * @param mDeliveryCourseList The entity list of referrer property 'MDeliveryCourseList'. (NullAllowed)
     */
    public void setMDeliveryCourseList(List<MDeliveryCourse> mDeliveryCourseList) {
        _mDeliveryCourseList = mDeliveryCourseList;
    }

    /** M_LOCATION by CENTER_ID, named 'MLocationList'. */
    protected List<MLocation> _mLocationList;

    /**
     * [get] M_LOCATION by CENTER_ID, named 'MLocationList'.
     * @return The entity list of referrer property 'MLocationList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MLocation> getMLocationList() {
        if (_mLocationList == null) { _mLocationList = newReferrerList(); }
        return _mLocationList;
    }

    /**
     * [set] M_LOCATION by CENTER_ID, named 'MLocationList'.
     * @param mLocationList The entity list of referrer property 'MLocationList'. (NullAllowed)
     */
    public void setMLocationList(List<MLocation> mLocationList) {
        _mLocationList = mLocationList;
    }

    /** M_MFINVOPERATION by CENTER_ID, named 'MMfinvoperationList'. */
    protected List<MMfinvoperation> _mMfinvoperationList;

    /**
     * [get] M_MFINVOPERATION by CENTER_ID, named 'MMfinvoperationList'.
     * @return The entity list of referrer property 'MMfinvoperationList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MMfinvoperation> getMMfinvoperationList() {
        if (_mMfinvoperationList == null) { _mMfinvoperationList = newReferrerList(); }
        return _mMfinvoperationList;
    }

    /**
     * [set] M_MFINVOPERATION by CENTER_ID, named 'MMfinvoperationList'.
     * @param mMfinvoperationList The entity list of referrer property 'MMfinvoperationList'. (NullAllowed)
     */
    public void setMMfinvoperationList(List<MMfinvoperation> mMfinvoperationList) {
        _mMfinvoperationList = mMfinvoperationList;
    }

    /** M_MFMONTHCHG by CENTER_ID, named 'MMfmonthchgList'. */
    protected List<MMfmonthchg> _mMfmonthchgList;

    /**
     * [get] M_MFMONTHCHG by CENTER_ID, named 'MMfmonthchgList'.
     * @return The entity list of referrer property 'MMfmonthchgList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MMfmonthchg> getMMfmonthchgList() {
        if (_mMfmonthchgList == null) { _mMfmonthchgList = newReferrerList(); }
        return _mMfmonthchgList;
    }

    /**
     * [set] M_MFMONTHCHG by CENTER_ID, named 'MMfmonthchgList'.
     * @param mMfmonthchgList The entity list of referrer property 'MMfmonthchgList'. (NullAllowed)
     */
    public void setMMfmonthchgList(List<MMfmonthchg> mMfmonthchgList) {
        _mMfmonthchgList = mMfmonthchgList;
    }

    /** M_MFSTOCKITEM by CENTER_ID, named 'MMfstockitemList'. */
    protected List<MMfstockitem> _mMfstockitemList;

    /**
     * [get] M_MFSTOCKITEM by CENTER_ID, named 'MMfstockitemList'.
     * @return The entity list of referrer property 'MMfstockitemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MMfstockitem> getMMfstockitemList() {
        if (_mMfstockitemList == null) { _mMfstockitemList = newReferrerList(); }
        return _mMfstockitemList;
    }

    /**
     * [set] M_MFSTOCKITEM by CENTER_ID, named 'MMfstockitemList'.
     * @param mMfstockitemList The entity list of referrer property 'MMfstockitemList'. (NullAllowed)
     */
    public void setMMfstockitemList(List<MMfstockitem> mMfstockitemList) {
        _mMfstockitemList = mMfstockitemList;
    }

    /** M_MFWHSTRCT by CENTER_ID, named 'MMfwhstrctList'. */
    protected List<MMfwhstrct> _mMfwhstrctList;

    /**
     * [get] M_MFWHSTRCT by CENTER_ID, named 'MMfwhstrctList'.
     * @return The entity list of referrer property 'MMfwhstrctList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MMfwhstrct> getMMfwhstrctList() {
        if (_mMfwhstrctList == null) { _mMfwhstrctList = newReferrerList(); }
        return _mMfwhstrctList;
    }

    /**
     * [set] M_MFWHSTRCT by CENTER_ID, named 'MMfwhstrctList'.
     * @param mMfwhstrctList The entity list of referrer property 'MMfwhstrctList'. (NullAllowed)
     */
    public void setMMfwhstrctList(List<MMfwhstrct> mMfwhstrctList) {
        _mMfwhstrctList = mMfwhstrctList;
    }

    /** M_MFWHxITEM by CENTER_ID, named 'MMfwhxitemList'. */
    protected List<MMfwhxitem> _mMfwhxitemList;

    /**
     * [get] M_MFWHxITEM by CENTER_ID, named 'MMfwhxitemList'.
     * @return The entity list of referrer property 'MMfwhxitemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MMfwhxitem> getMMfwhxitemList() {
        if (_mMfwhxitemList == null) { _mMfwhxitemList = newReferrerList(); }
        return _mMfwhxitemList;
    }

    /**
     * [set] M_MFWHxITEM by CENTER_ID, named 'MMfwhxitemList'.
     * @param mMfwhxitemList The entity list of referrer property 'MMfwhxitemList'. (NullAllowed)
     */
    public void setMMfwhxitemList(List<MMfwhxitem> mMfwhxitemList) {
        _mMfwhxitemList = mMfwhxitemList;
    }

    /** M_NUMBERING_CENTER by CENTER_ID, named 'MNumberingCenterList'. */
    protected List<MNumberingCenter> _mNumberingCenterList;

    /**
     * [get] M_NUMBERING_CENTER by CENTER_ID, named 'MNumberingCenterList'.
     * @return The entity list of referrer property 'MNumberingCenterList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MNumberingCenter> getMNumberingCenterList() {
        if (_mNumberingCenterList == null) { _mNumberingCenterList = newReferrerList(); }
        return _mNumberingCenterList;
    }

    /**
     * [set] M_NUMBERING_CENTER by CENTER_ID, named 'MNumberingCenterList'.
     * @param mNumberingCenterList The entity list of referrer property 'MNumberingCenterList'. (NullAllowed)
     */
    public void setMNumberingCenterList(List<MNumberingCenter> mNumberingCenterList) {
        _mNumberingCenterList = mNumberingCenterList;
    }

    /** M_USER_CENTER by CENTER_ID, named 'MUserCenterList'. */
    protected List<MUserCenter> _mUserCenterList;

    /**
     * [get] M_USER_CENTER by CENTER_ID, named 'MUserCenterList'.
     * @return The entity list of referrer property 'MUserCenterList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MUserCenter> getMUserCenterList() {
        if (_mUserCenterList == null) { _mUserCenterList = newReferrerList(); }
        return _mUserCenterList;
    }

    /**
     * [set] M_USER_CENTER by CENTER_ID, named 'MUserCenterList'.
     * @param mUserCenterList The entity list of referrer property 'MUserCenterList'. (NullAllowed)
     */
    public void setMUserCenterList(List<MUserCenter> mUserCenterList) {
        _mUserCenterList = mUserCenterList;
    }

    /** M_USER_LOGIN by CENTER_ID, named 'MUserLoginList'. */
    protected List<MUserLogin> _mUserLoginList;

    /**
     * [get] M_USER_LOGIN by CENTER_ID, named 'MUserLoginList'.
     * @return The entity list of referrer property 'MUserLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MUserLogin> getMUserLoginList() {
        if (_mUserLoginList == null) { _mUserLoginList = newReferrerList(); }
        return _mUserLoginList;
    }

    /**
     * [set] M_USER_LOGIN by CENTER_ID, named 'MUserLoginList'.
     * @param mUserLoginList The entity list of referrer property 'MUserLoginList'. (NullAllowed)
     */
    public void setMUserLoginList(List<MUserLogin> mUserLoginList) {
        _mUserLoginList = mUserLoginList;
    }

    /** M_WAREHOUSE by CENTER_ID, named 'MWarehouseList'. */
    protected List<MWarehouse> _mWarehouseList;

    /**
     * [get] M_WAREHOUSE by CENTER_ID, named 'MWarehouseList'.
     * @return The entity list of referrer property 'MWarehouseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MWarehouse> getMWarehouseList() {
        if (_mWarehouseList == null) { _mWarehouseList = newReferrerList(); }
        return _mWarehouseList;
    }

    /**
     * [set] M_WAREHOUSE by CENTER_ID, named 'MWarehouseList'.
     * @param mWarehouseList The entity list of referrer property 'MWarehouseList'. (NullAllowed)
     */
    public void setMWarehouseList(List<MWarehouse> mWarehouseList) {
        _mWarehouseList = mWarehouseList;
    }

    /** M_WEB_HT_INFO by CENTER_ID, named 'MWebHtInfoList'. */
    protected List<MWebHtInfo> _mWebHtInfoList;

    /**
     * [get] M_WEB_HT_INFO by CENTER_ID, named 'MWebHtInfoList'.
     * @return The entity list of referrer property 'MWebHtInfoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MWebHtInfo> getMWebHtInfoList() {
        if (_mWebHtInfoList == null) { _mWebHtInfoList = newReferrerList(); }
        return _mWebHtInfoList;
    }

    /**
     * [set] M_WEB_HT_INFO by CENTER_ID, named 'MWebHtInfoList'.
     * @param mWebHtInfoList The entity list of referrer property 'MWebHtInfoList'. (NullAllowed)
     */
    public void setMWebHtInfoList(List<MWebHtInfo> mWebHtInfoList) {
        _mWebHtInfoList = mWebHtInfoList;
    }

    /** T_ALLOC_INST_H by CENTER_ID, named 'TAllocInstHList'. */
    protected List<TAllocInstH> _tAllocInstHList;

    /**
     * [get] T_ALLOC_INST_H by CENTER_ID, named 'TAllocInstHList'.
     * @return The entity list of referrer property 'TAllocInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstH> getTAllocInstHList() {
        if (_tAllocInstHList == null) { _tAllocInstHList = newReferrerList(); }
        return _tAllocInstHList;
    }

    /**
     * [set] T_ALLOC_INST_H by CENTER_ID, named 'TAllocInstHList'.
     * @param tAllocInstHList The entity list of referrer property 'TAllocInstHList'. (NullAllowed)
     */
    public void setTAllocInstHList(List<TAllocInstH> tAllocInstHList) {
        _tAllocInstHList = tAllocInstHList;
    }

    /** T_CCOPAM by CENTER_ID, named 'TCcopamList'. */
    protected List<TCcopam> _tCcopamList;

    /**
     * [get] T_CCOPAM by CENTER_ID, named 'TCcopamList'.
     * @return The entity list of referrer property 'TCcopamList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TCcopam> getTCcopamList() {
        if (_tCcopamList == null) { _tCcopamList = newReferrerList(); }
        return _tCcopamList;
    }

    /**
     * [set] T_CCOPAM by CENTER_ID, named 'TCcopamList'.
     * @param tCcopamList The entity list of referrer property 'TCcopamList'. (NullAllowed)
     */
    public void setTCcopamList(List<TCcopam> tCcopamList) {
        _tCcopamList = tCcopamList;
    }

    /** T_CENTER_SYMBOL by CENTER_ID, named 'TCenterSymbolList'. */
    protected List<TCenterSymbol> _tCenterSymbolList;

    /**
     * [get] T_CENTER_SYMBOL by CENTER_ID, named 'TCenterSymbolList'.
     * @return The entity list of referrer property 'TCenterSymbolList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TCenterSymbol> getTCenterSymbolList() {
        if (_tCenterSymbolList == null) { _tCenterSymbolList = newReferrerList(); }
        return _tCenterSymbolList;
    }

    /**
     * [set] T_CENTER_SYMBOL by CENTER_ID, named 'TCenterSymbolList'.
     * @param tCenterSymbolList The entity list of referrer property 'TCenterSymbolList'. (NullAllowed)
     */
    public void setTCenterSymbolList(List<TCenterSymbol> tCenterSymbolList) {
        _tCenterSymbolList = tCenterSymbolList;
    }

    /** T_CORDHDR by CENTER_ID, named 'TCordhdrList'. */
    protected List<TCordhdr> _tCordhdrList;

    /**
     * [get] T_CORDHDR by CENTER_ID, named 'TCordhdrList'.
     * @return The entity list of referrer property 'TCordhdrList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TCordhdr> getTCordhdrList() {
        if (_tCordhdrList == null) { _tCordhdrList = newReferrerList(); }
        return _tCordhdrList;
    }

    /**
     * [set] T_CORDHDR by CENTER_ID, named 'TCordhdrList'.
     * @param tCordhdrList The entity list of referrer property 'TCordhdrList'. (NullAllowed)
     */
    public void setTCordhdrList(List<TCordhdr> tCordhdrList) {
        _tCordhdrList = tCordhdrList;
    }

    /** T_CSRWHADM by CENTER_ID, named 'TCsrwhadmList'. */
    protected List<TCsrwhadm> _tCsrwhadmList;

    /**
     * [get] T_CSRWHADM by CENTER_ID, named 'TCsrwhadmList'.
     * @return The entity list of referrer property 'TCsrwhadmList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TCsrwhadm> getTCsrwhadmList() {
        if (_tCsrwhadmList == null) { _tCsrwhadmList = newReferrerList(); }
        return _tCsrwhadmList;
    }

    /**
     * [set] T_CSRWHADM by CENTER_ID, named 'TCsrwhadmList'.
     * @param tCsrwhadmList The entity list of referrer property 'TCsrwhadmList'. (NullAllowed)
     */
    public void setTCsrwhadmList(List<TCsrwhadm> tCsrwhadmList) {
        _tCsrwhadmList = tCsrwhadmList;
    }

    /** T_EC_ORDER_H by CENTER_ID, named 'TEcOrderHList'. */
    protected List<TEcOrderH> _tEcOrderHList;

    /**
     * [get] T_EC_ORDER_H by CENTER_ID, named 'TEcOrderHList'.
     * @return The entity list of referrer property 'TEcOrderHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TEcOrderH> getTEcOrderHList() {
        if (_tEcOrderHList == null) { _tEcOrderHList = newReferrerList(); }
        return _tEcOrderHList;
    }

    /**
     * [set] T_EC_ORDER_H by CENTER_ID, named 'TEcOrderHList'.
     * @param tEcOrderHList The entity list of referrer property 'TEcOrderHList'. (NullAllowed)
     */
    public void setTEcOrderHList(List<TEcOrderH> tEcOrderHList) {
        _tEcOrderHList = tEcOrderHList;
    }

    /** T_INVENTORY_H by CENTER_ID, named 'TInventoryHList'. */
    protected List<TInventoryH> _tInventoryHList;

    /**
     * [get] T_INVENTORY_H by CENTER_ID, named 'TInventoryHList'.
     * @return The entity list of referrer property 'TInventoryHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryH> getTInventoryHList() {
        if (_tInventoryHList == null) { _tInventoryHList = newReferrerList(); }
        return _tInventoryHList;
    }

    /**
     * [set] T_INVENTORY_H by CENTER_ID, named 'TInventoryHList'.
     * @param tInventoryHList The entity list of referrer property 'TInventoryHList'. (NullAllowed)
     */
    public void setTInventoryHList(List<TInventoryH> tInventoryHList) {
        _tInventoryHList = tInventoryHList;
    }

    /** T_MFLASTSHIPLOT by CENTER_ID, named 'TMflastshiplotList'. */
    protected List<TMflastshiplot> _tMflastshiplotList;

    /**
     * [get] T_MFLASTSHIPLOT by CENTER_ID, named 'TMflastshiplotList'.
     * @return The entity list of referrer property 'TMflastshiplotList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMflastshiplot> getTMflastshiplotList() {
        if (_tMflastshiplotList == null) { _tMflastshiplotList = newReferrerList(); }
        return _tMflastshiplotList;
    }

    /**
     * [set] T_MFLASTSHIPLOT by CENTER_ID, named 'TMflastshiplotList'.
     * @param tMflastshiplotList The entity list of referrer property 'TMflastshiplotList'. (NullAllowed)
     */
    public void setTMflastshiplotList(List<TMflastshiplot> tMflastshiplotList) {
        _tMflastshiplotList = tMflastshiplotList;
    }

    /** T_MOVE_INST_H by CENTER_ID, named 'TMoveInstHList'. */
    protected List<TMoveInstH> _tMoveInstHList;

    /**
     * [get] T_MOVE_INST_H by CENTER_ID, named 'TMoveInstHList'.
     * @return The entity list of referrer property 'TMoveInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstH> getTMoveInstHList() {
        if (_tMoveInstHList == null) { _tMoveInstHList = newReferrerList(); }
        return _tMoveInstHList;
    }

    /**
     * [set] T_MOVE_INST_H by CENTER_ID, named 'TMoveInstHList'.
     * @param tMoveInstHList The entity list of referrer property 'TMoveInstHList'. (NullAllowed)
     */
    public void setTMoveInstHList(List<TMoveInstH> tMoveInstHList) {
        _tMoveInstHList = tMoveInstHList;
    }

    /** T_PACKING_H by CENTER_ID, named 'TPackingHList'. */
    protected List<TPackingH> _tPackingHList;

    /**
     * [get] T_PACKING_H by CENTER_ID, named 'TPackingHList'.
     * @return The entity list of referrer property 'TPackingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingH> getTPackingHList() {
        if (_tPackingHList == null) { _tPackingHList = newReferrerList(); }
        return _tPackingHList;
    }

    /**
     * [set] T_PACKING_H by CENTER_ID, named 'TPackingHList'.
     * @param tPackingHList The entity list of referrer property 'TPackingHList'. (NullAllowed)
     */
    public void setTPackingHList(List<TPackingH> tPackingHList) {
        _tPackingHList = tPackingHList;
    }

    /** T_PALLET by CENTER_ID, named 'TPalletList'. */
    protected List<TPallet> _tPalletList;

    /**
     * [get] T_PALLET by CENTER_ID, named 'TPalletList'.
     * @return The entity list of referrer property 'TPalletList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPallet> getTPalletList() {
        if (_tPalletList == null) { _tPalletList = newReferrerList(); }
        return _tPalletList;
    }

    /**
     * [set] T_PALLET by CENTER_ID, named 'TPalletList'.
     * @param tPalletList The entity list of referrer property 'TPalletList'. (NullAllowed)
     */
    public void setTPalletList(List<TPallet> tPalletList) {
        _tPalletList = tPalletList;
    }

    /** T_PICKING_H by CENTER_ID, named 'TPickingHList'. */
    protected List<TPickingH> _tPickingHList;

    /**
     * [get] T_PICKING_H by CENTER_ID, named 'TPickingHList'.
     * @return The entity list of referrer property 'TPickingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingH> getTPickingHList() {
        if (_tPickingHList == null) { _tPickingHList = newReferrerList(); }
        return _tPickingHList;
    }

    /**
     * [set] T_PICKING_H by CENTER_ID, named 'TPickingHList'.
     * @param tPickingHList The entity list of referrer property 'TPickingHList'. (NullAllowed)
     */
    public void setTPickingHList(List<TPickingH> tPickingHList) {
        _tPickingHList = tPickingHList;
    }

    /** T_PIC_MTHD_RCMD by CENTER_ID, named 'TPicMthdRcmdList'. */
    protected List<TPicMthdRcmd> _tPicMthdRcmdList;

    /**
     * [get] T_PIC_MTHD_RCMD by CENTER_ID, named 'TPicMthdRcmdList'.
     * @return The entity list of referrer property 'TPicMthdRcmdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPicMthdRcmd> getTPicMthdRcmdList() {
        if (_tPicMthdRcmdList == null) { _tPicMthdRcmdList = newReferrerList(); }
        return _tPicMthdRcmdList;
    }

    /**
     * [set] T_PIC_MTHD_RCMD by CENTER_ID, named 'TPicMthdRcmdList'.
     * @param tPicMthdRcmdList The entity list of referrer property 'TPicMthdRcmdList'. (NullAllowed)
     */
    public void setTPicMthdRcmdList(List<TPicMthdRcmd> tPicMthdRcmdList) {
        _tPicMthdRcmdList = tPicMthdRcmdList;
    }

    /** T_RECEIVE_PLAN_H by CENTER_ID, named 'TReceivePlanHList'. */
    protected List<TReceivePlanH> _tReceivePlanHList;

    /**
     * [get] T_RECEIVE_PLAN_H by CENTER_ID, named 'TReceivePlanHList'.
     * @return The entity list of referrer property 'TReceivePlanHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanH> getTReceivePlanHList() {
        if (_tReceivePlanHList == null) { _tReceivePlanHList = newReferrerList(); }
        return _tReceivePlanHList;
    }

    /**
     * [set] T_RECEIVE_PLAN_H by CENTER_ID, named 'TReceivePlanHList'.
     * @param tReceivePlanHList The entity list of referrer property 'TReceivePlanHList'. (NullAllowed)
     */
    public void setTReceivePlanHList(List<TReceivePlanH> tReceivePlanHList) {
        _tReceivePlanHList = tReceivePlanHList;
    }

    /** T_SERIAL_NO by CENTER_ID, named 'TSerialNoList'. */
    protected List<TSerialNo> _tSerialNoList;

    /**
     * [get] T_SERIAL_NO by CENTER_ID, named 'TSerialNoList'.
     * @return The entity list of referrer property 'TSerialNoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TSerialNo> getTSerialNoList() {
        if (_tSerialNoList == null) { _tSerialNoList = newReferrerList(); }
        return _tSerialNoList;
    }

    /**
     * [set] T_SERIAL_NO by CENTER_ID, named 'TSerialNoList'.
     * @param tSerialNoList The entity list of referrer property 'TSerialNoList'. (NullAllowed)
     */
    public void setTSerialNoList(List<TSerialNo> tSerialNoList) {
        _tSerialNoList = tSerialNoList;
    }

    /** T_SHIPPING_INST_H by CENTER_ID, named 'TShippingInstHList'. */
    protected List<TShippingInstH> _tShippingInstHList;

    /**
     * [get] T_SHIPPING_INST_H by CENTER_ID, named 'TShippingInstHList'.
     * @return The entity list of referrer property 'TShippingInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstH> getTShippingInstHList() {
        if (_tShippingInstHList == null) { _tShippingInstHList = newReferrerList(); }
        return _tShippingInstHList;
    }

    /**
     * [set] T_SHIPPING_INST_H by CENTER_ID, named 'TShippingInstHList'.
     * @param tShippingInstHList The entity list of referrer property 'TShippingInstHList'. (NullAllowed)
     */
    public void setTShippingInstHList(List<TShippingInstH> tShippingInstHList) {
        _tShippingInstHList = tShippingInstHList;
    }

    /** T_SPLINFO by CENTER_ID, named 'TSplinfoList'. */
    protected List<TSplinfo> _tSplinfoList;

    /**
     * [get] T_SPLINFO by CENTER_ID, named 'TSplinfoList'.
     * @return The entity list of referrer property 'TSplinfoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TSplinfo> getTSplinfoList() {
        if (_tSplinfoList == null) { _tSplinfoList = newReferrerList(); }
        return _tSplinfoList;
    }

    /**
     * [set] T_SPLINFO by CENTER_ID, named 'TSplinfoList'.
     * @param tSplinfoList The entity list of referrer property 'TSplinfoList'. (NullAllowed)
     */
    public void setTSplinfoList(List<TSplinfo> tSplinfoList) {
        _tSplinfoList = tSplinfoList;
    }

    /** T_STORE_RECORD_H by CENTER_ID, named 'TStoreRecordHList'. */
    protected List<TStoreRecordH> _tStoreRecordHList;

    /**
     * [get] T_STORE_RECORD_H by CENTER_ID, named 'TStoreRecordHList'.
     * @return The entity list of referrer property 'TStoreRecordHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreRecordH> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = newReferrerList(); }
        return _tStoreRecordHList;
    }

    /**
     * [set] T_STORE_RECORD_H by CENTER_ID, named 'TStoreRecordHList'.
     * @param tStoreRecordHList The entity list of referrer property 'TStoreRecordHList'. (NullAllowed)
     */
    public void setTStoreRecordHList(List<TStoreRecordH> tStoreRecordHList) {
        _tStoreRecordHList = tStoreRecordHList;
    }

    /** T_TRALLINV by CENTER_ID, named 'TTrallinvList'. */
    protected List<TTrallinv> _tTrallinvList;

    /**
     * [get] T_TRALLINV by CENTER_ID, named 'TTrallinvList'.
     * @return The entity list of referrer property 'TTrallinvList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrallinv> getTTrallinvList() {
        if (_tTrallinvList == null) { _tTrallinvList = newReferrerList(); }
        return _tTrallinvList;
    }

    /**
     * [set] T_TRALLINV by CENTER_ID, named 'TTrallinvList'.
     * @param tTrallinvList The entity list of referrer property 'TTrallinvList'. (NullAllowed)
     */
    public void setTTrallinvList(List<TTrallinv> tTrallinvList) {
        _tTrallinvList = tTrallinvList;
    }

    /** T_TRALLINVHISTORY by CENTER_ID, named 'TTrallinvhistoryList'. */
    protected List<TTrallinvhistory> _tTrallinvhistoryList;

    /**
     * [get] T_TRALLINVHISTORY by CENTER_ID, named 'TTrallinvhistoryList'.
     * @return The entity list of referrer property 'TTrallinvhistoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrallinvhistory> getTTrallinvhistoryList() {
        if (_tTrallinvhistoryList == null) { _tTrallinvhistoryList = newReferrerList(); }
        return _tTrallinvhistoryList;
    }

    /**
     * [set] T_TRALLINVHISTORY by CENTER_ID, named 'TTrallinvhistoryList'.
     * @param tTrallinvhistoryList The entity list of referrer property 'TTrallinvhistoryList'. (NullAllowed)
     */
    public void setTTrallinvhistoryList(List<TTrallinvhistory> tTrallinvhistoryList) {
        _tTrallinvhistoryList = tTrallinvhistoryList;
    }

    /** T_TRCASEINVENTORY by CENTER_ID, named 'TTrcaseinventoryList'. */
    protected List<TTrcaseinventory> _tTrcaseinventoryList;

    /**
     * [get] T_TRCASEINVENTORY by CENTER_ID, named 'TTrcaseinventoryList'.
     * @return The entity list of referrer property 'TTrcaseinventoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrcaseinventory> getTTrcaseinventoryList() {
        if (_tTrcaseinventoryList == null) { _tTrcaseinventoryList = newReferrerList(); }
        return _tTrcaseinventoryList;
    }

    /**
     * [set] T_TRCASEINVENTORY by CENTER_ID, named 'TTrcaseinventoryList'.
     * @param tTrcaseinventoryList The entity list of referrer property 'TTrcaseinventoryList'. (NullAllowed)
     */
    public void setTTrcaseinventoryList(List<TTrcaseinventory> tTrcaseinventoryList) {
        _tTrcaseinventoryList = tTrcaseinventoryList;
    }

    /** T_TRCASENUM by CENTER_ID, named 'TTrcasenumList'. */
    protected List<TTrcasenum> _tTrcasenumList;

    /**
     * [get] T_TRCASENUM by CENTER_ID, named 'TTrcasenumList'.
     * @return The entity list of referrer property 'TTrcasenumList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrcasenum> getTTrcasenumList() {
        if (_tTrcasenumList == null) { _tTrcasenumList = newReferrerList(); }
        return _tTrcasenumList;
    }

    /**
     * [set] T_TRCASENUM by CENTER_ID, named 'TTrcasenumList'.
     * @param tTrcasenumList The entity list of referrer property 'TTrcasenumList'. (NullAllowed)
     */
    public void setTTrcasenumList(List<TTrcasenum> tTrcasenumList) {
        _tTrcasenumList = tTrcasenumList;
    }

    /** T_TRCASESTOCK by CENTER_ID, named 'TTrcasestockList'. */
    protected List<TTrcasestock> _tTrcasestockList;

    /**
     * [get] T_TRCASESTOCK by CENTER_ID, named 'TTrcasestockList'.
     * @return The entity list of referrer property 'TTrcasestockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrcasestock> getTTrcasestockList() {
        if (_tTrcasestockList == null) { _tTrcasestockList = newReferrerList(); }
        return _tTrcasestockList;
    }

    /**
     * [set] T_TRCASESTOCK by CENTER_ID, named 'TTrcasestockList'.
     * @param tTrcasestockList The entity list of referrer property 'TTrcasestockList'. (NullAllowed)
     */
    public void setTTrcasestockList(List<TTrcasestock> tTrcasestockList) {
        _tTrcasestockList = tTrcasestockList;
    }

    /** T_TRHANBAIINV by CENTER_ID, named 'TTrhanbaiinvList'. */
    protected List<TTrhanbaiinv> _tTrhanbaiinvList;

    /**
     * [get] T_TRHANBAIINV by CENTER_ID, named 'TTrhanbaiinvList'.
     * @return The entity list of referrer property 'TTrhanbaiinvList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrhanbaiinv> getTTrhanbaiinvList() {
        if (_tTrhanbaiinvList == null) { _tTrhanbaiinvList = newReferrerList(); }
        return _tTrhanbaiinvList;
    }

    /**
     * [set] T_TRHANBAIINV by CENTER_ID, named 'TTrhanbaiinvList'.
     * @param tTrhanbaiinvList The entity list of referrer property 'TTrhanbaiinvList'. (NullAllowed)
     */
    public void setTTrhanbaiinvList(List<TTrhanbaiinv> tTrhanbaiinvList) {
        _tTrhanbaiinvList = tTrhanbaiinvList;
    }

    /** T_TRINVCHECKINFO by CENTER_ID, named 'TTrinvcheckinfoList'. */
    protected List<TTrinvcheckinfo> _tTrinvcheckinfoList;

    /**
     * [get] T_TRINVCHECKINFO by CENTER_ID, named 'TTrinvcheckinfoList'.
     * @return The entity list of referrer property 'TTrinvcheckinfoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrinvcheckinfo> getTTrinvcheckinfoList() {
        if (_tTrinvcheckinfoList == null) { _tTrinvcheckinfoList = newReferrerList(); }
        return _tTrinvcheckinfoList;
    }

    /**
     * [set] T_TRINVCHECKINFO by CENTER_ID, named 'TTrinvcheckinfoList'.
     * @param tTrinvcheckinfoList The entity list of referrer property 'TTrinvcheckinfoList'. (NullAllowed)
     */
    public void setTTrinvcheckinfoList(List<TTrinvcheckinfo> tTrinvcheckinfoList) {
        _tTrinvcheckinfoList = tTrinvcheckinfoList;
    }

    /** T_TRINVCORRECT by CENTER_ID, named 'TTrinvcorrectList'. */
    protected List<TTrinvcorrect> _tTrinvcorrectList;

    /**
     * [get] T_TRINVCORRECT by CENTER_ID, named 'TTrinvcorrectList'.
     * @return The entity list of referrer property 'TTrinvcorrectList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrinvcorrect> getTTrinvcorrectList() {
        if (_tTrinvcorrectList == null) { _tTrinvcorrectList = newReferrerList(); }
        return _tTrinvcorrectList;
    }

    /**
     * [set] T_TRINVCORRECT by CENTER_ID, named 'TTrinvcorrectList'.
     * @param tTrinvcorrectList The entity list of referrer property 'TTrinvcorrectList'. (NullAllowed)
     */
    public void setTTrinvcorrectList(List<TTrinvcorrect> tTrinvcorrectList) {
        _tTrinvcorrectList = tTrinvcorrectList;
    }

    /** T_TRINVREANSWER by CENTER_ID, named 'TTrinvreanswerList'. */
    protected List<TTrinvreanswer> _tTrinvreanswerList;

    /**
     * [get] T_TRINVREANSWER by CENTER_ID, named 'TTrinvreanswerList'.
     * @return The entity list of referrer property 'TTrinvreanswerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrinvreanswer> getTTrinvreanswerList() {
        if (_tTrinvreanswerList == null) { _tTrinvreanswerList = newReferrerList(); }
        return _tTrinvreanswerList;
    }

    /**
     * [set] T_TRINVREANSWER by CENTER_ID, named 'TTrinvreanswerList'.
     * @param tTrinvreanswerList The entity list of referrer property 'TTrinvreanswerList'. (NullAllowed)
     */
    public void setTTrinvreanswerList(List<TTrinvreanswer> tTrinvreanswerList) {
        _tTrinvreanswerList = tTrinvreanswerList;
    }

    /** T_TRINVREQUEST by CENTER_ID, named 'TTrinvrequestList'. */
    protected List<TTrinvrequest> _tTrinvrequestList;

    /**
     * [get] T_TRINVREQUEST by CENTER_ID, named 'TTrinvrequestList'.
     * @return The entity list of referrer property 'TTrinvrequestList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrinvrequest> getTTrinvrequestList() {
        if (_tTrinvrequestList == null) { _tTrinvrequestList = newReferrerList(); }
        return _tTrinvrequestList;
    }

    /**
     * [set] T_TRINVREQUEST by CENTER_ID, named 'TTrinvrequestList'.
     * @param tTrinvrequestList The entity list of referrer property 'TTrinvrequestList'. (NullAllowed)
     */
    public void setTTrinvrequestList(List<TTrinvrequest> tTrinvrequestList) {
        _tTrinvrequestList = tTrinvrequestList;
    }

    /** T_TRITEMCONVRESULT by CENTER_ID, named 'TTritemconvresultList'. */
    protected List<TTritemconvresult> _tTritemconvresultList;

    /**
     * [get] T_TRITEMCONVRESULT by CENTER_ID, named 'TTritemconvresultList'.
     * @return The entity list of referrer property 'TTritemconvresultList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTritemconvresult> getTTritemconvresultList() {
        if (_tTritemconvresultList == null) { _tTritemconvresultList = newReferrerList(); }
        return _tTritemconvresultList;
    }

    /**
     * [set] T_TRITEMCONVRESULT by CENTER_ID, named 'TTritemconvresultList'.
     * @param tTritemconvresultList The entity list of referrer property 'TTritemconvresultList'. (NullAllowed)
     */
    public void setTTritemconvresultList(List<TTritemconvresult> tTritemconvresultList) {
        _tTritemconvresultList = tTritemconvresultList;
    }

    /** T_TRJUKYUINV by CENTER_ID, named 'TTrjukyuinvList'. */
    protected List<TTrjukyuinv> _tTrjukyuinvList;

    /**
     * [get] T_TRJUKYUINV by CENTER_ID, named 'TTrjukyuinvList'.
     * @return The entity list of referrer property 'TTrjukyuinvList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrjukyuinv> getTTrjukyuinvList() {
        if (_tTrjukyuinvList == null) { _tTrjukyuinvList = newReferrerList(); }
        return _tTrjukyuinvList;
    }

    /**
     * [set] T_TRJUKYUINV by CENTER_ID, named 'TTrjukyuinvList'.
     * @param tTrjukyuinvList The entity list of referrer property 'TTrjukyuinvList'. (NullAllowed)
     */
    public void setTTrjukyuinvList(List<TTrjukyuinv> tTrjukyuinvList) {
        _tTrjukyuinvList = tTrjukyuinvList;
    }

    /** T_TRMANUFACTUREDATE by CENTER_ID, named 'TTrmanufacturedateList'. */
    protected List<TTrmanufacturedate> _tTrmanufacturedateList;

    /**
     * [get] T_TRMANUFACTUREDATE by CENTER_ID, named 'TTrmanufacturedateList'.
     * @return The entity list of referrer property 'TTrmanufacturedateList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrmanufacturedate> getTTrmanufacturedateList() {
        if (_tTrmanufacturedateList == null) { _tTrmanufacturedateList = newReferrerList(); }
        return _tTrmanufacturedateList;
    }

    /**
     * [set] T_TRMANUFACTUREDATE by CENTER_ID, named 'TTrmanufacturedateList'.
     * @param tTrmanufacturedateList The entity list of referrer property 'TTrmanufacturedateList'. (NullAllowed)
     */
    public void setTTrmanufacturedateList(List<TTrmanufacturedate> tTrmanufacturedateList) {
        _tTrmanufacturedateList = tTrmanufacturedateList;
    }

    /** T_TRMANUFACTUREDATEDETAIL by CENTER_ID, named 'TTrmanufacturedatedetailList'. */
    protected List<TTrmanufacturedatedetail> _tTrmanufacturedatedetailList;

    /**
     * [get] T_TRMANUFACTUREDATEDETAIL by CENTER_ID, named 'TTrmanufacturedatedetailList'.
     * @return The entity list of referrer property 'TTrmanufacturedatedetailList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrmanufacturedatedetail> getTTrmanufacturedatedetailList() {
        if (_tTrmanufacturedatedetailList == null) { _tTrmanufacturedatedetailList = newReferrerList(); }
        return _tTrmanufacturedatedetailList;
    }

    /**
     * [set] T_TRMANUFACTUREDATEDETAIL by CENTER_ID, named 'TTrmanufacturedatedetailList'.
     * @param tTrmanufacturedatedetailList The entity list of referrer property 'TTrmanufacturedatedetailList'. (NullAllowed)
     */
    public void setTTrmanufacturedatedetailList(List<TTrmanufacturedatedetail> tTrmanufacturedatedetailList) {
        _tTrmanufacturedatedetailList = tTrmanufacturedatedetailList;
    }

    /** T_TRMANUFACTUREDATEHISTORY by CENTER_ID, named 'TTrmanufacturedatehistoryList'. */
    protected List<TTrmanufacturedatehistory> _tTrmanufacturedatehistoryList;

    /**
     * [get] T_TRMANUFACTUREDATEHISTORY by CENTER_ID, named 'TTrmanufacturedatehistoryList'.
     * @return The entity list of referrer property 'TTrmanufacturedatehistoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrmanufacturedatehistory> getTTrmanufacturedatehistoryList() {
        if (_tTrmanufacturedatehistoryList == null) { _tTrmanufacturedatehistoryList = newReferrerList(); }
        return _tTrmanufacturedatehistoryList;
    }

    /**
     * [set] T_TRMANUFACTUREDATEHISTORY by CENTER_ID, named 'TTrmanufacturedatehistoryList'.
     * @param tTrmanufacturedatehistoryList The entity list of referrer property 'TTrmanufacturedatehistoryList'. (NullAllowed)
     */
    public void setTTrmanufacturedatehistoryList(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList) {
        _tTrmanufacturedatehistoryList = tTrmanufacturedatehistoryList;
    }

    /** T_TRPALLETTRACE by CENTER_ID, named 'TTrpallettraceList'. */
    protected List<TTrpallettrace> _tTrpallettraceList;

    /**
     * [get] T_TRPALLETTRACE by CENTER_ID, named 'TTrpallettraceList'.
     * @return The entity list of referrer property 'TTrpallettraceList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrpallettrace> getTTrpallettraceList() {
        if (_tTrpallettraceList == null) { _tTrpallettraceList = newReferrerList(); }
        return _tTrpallettraceList;
    }

    /**
     * [set] T_TRPALLETTRACE by CENTER_ID, named 'TTrpallettraceList'.
     * @param tTrpallettraceList The entity list of referrer property 'TTrpallettraceList'. (NullAllowed)
     */
    public void setTTrpallettraceList(List<TTrpallettrace> tTrpallettraceList) {
        _tTrpallettraceList = tTrpallettraceList;
    }

    /** T_TRREVERSESTOCK by CENTER_ID, named 'TTrreversestockList'. */
    protected List<TTrreversestock> _tTrreversestockList;

    /**
     * [get] T_TRREVERSESTOCK by CENTER_ID, named 'TTrreversestockList'.
     * @return The entity list of referrer property 'TTrreversestockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrreversestock> getTTrreversestockList() {
        if (_tTrreversestockList == null) { _tTrreversestockList = newReferrerList(); }
        return _tTrreversestockList;
    }

    /**
     * [set] T_TRREVERSESTOCK by CENTER_ID, named 'TTrreversestockList'.
     * @param tTrreversestockList The entity list of referrer property 'TTrreversestockList'. (NullAllowed)
     */
    public void setTTrreversestockList(List<TTrreversestock> tTrreversestockList) {
        _tTrreversestockList = tTrreversestockList;
    }

    /** T_TRSTOCKDIFFHISTORY by CENTER_ID, named 'TTrstockdiffhistoryList'. */
    protected List<TTrstockdiffhistory> _tTrstockdiffhistoryList;

    /**
     * [get] T_TRSTOCKDIFFHISTORY by CENTER_ID, named 'TTrstockdiffhistoryList'.
     * @return The entity list of referrer property 'TTrstockdiffhistoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrstockdiffhistory> getTTrstockdiffhistoryList() {
        if (_tTrstockdiffhistoryList == null) { _tTrstockdiffhistoryList = newReferrerList(); }
        return _tTrstockdiffhistoryList;
    }

    /**
     * [set] T_TRSTOCKDIFFHISTORY by CENTER_ID, named 'TTrstockdiffhistoryList'.
     * @param tTrstockdiffhistoryList The entity list of referrer property 'TTrstockdiffhistoryList'. (NullAllowed)
     */
    public void setTTrstockdiffhistoryList(List<TTrstockdiffhistory> tTrstockdiffhistoryList) {
        _tTrstockdiffhistoryList = tTrstockdiffhistoryList;
    }

    /** T_TRSYMBOLTRACE by CENTER_ID, named 'TTrsymboltraceList'. */
    protected List<TTrsymboltrace> _tTrsymboltraceList;

    /**
     * [get] T_TRSYMBOLTRACE by CENTER_ID, named 'TTrsymboltraceList'.
     * @return The entity list of referrer property 'TTrsymboltraceList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrsymboltrace> getTTrsymboltraceList() {
        if (_tTrsymboltraceList == null) { _tTrsymboltraceList = newReferrerList(); }
        return _tTrsymboltraceList;
    }

    /**
     * [set] T_TRSYMBOLTRACE by CENTER_ID, named 'TTrsymboltraceList'.
     * @param tTrsymboltraceList The entity list of referrer property 'TTrsymboltraceList'. (NullAllowed)
     */
    public void setTTrsymboltraceList(List<TTrsymboltrace> tTrsymboltraceList) {
        _tTrsymboltraceList = tTrsymboltraceList;
    }

    /** T_TRSYMBOLTRACEEXTEND by CENTER_ID, named 'TTrsymboltraceextendList'. */
    protected List<TTrsymboltraceextend> _tTrsymboltraceextendList;

    /**
     * [get] T_TRSYMBOLTRACEEXTEND by CENTER_ID, named 'TTrsymboltraceextendList'.
     * @return The entity list of referrer property 'TTrsymboltraceextendList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrsymboltraceextend> getTTrsymboltraceextendList() {
        if (_tTrsymboltraceextendList == null) { _tTrsymboltraceextendList = newReferrerList(); }
        return _tTrsymboltraceextendList;
    }

    /**
     * [set] T_TRSYMBOLTRACEEXTEND by CENTER_ID, named 'TTrsymboltraceextendList'.
     * @param tTrsymboltraceextendList The entity list of referrer property 'TTrsymboltraceextendList'. (NullAllowed)
     */
    public void setTTrsymboltraceextendList(List<TTrsymboltraceextend> tTrsymboltraceextendList) {
        _tTrsymboltraceextendList = tTrsymboltraceextendList;
    }

    /** T_TRTRACE by CENTER_ID, named 'TTrtraceList'. */
    protected List<TTrtrace> _tTrtraceList;

    /**
     * [get] T_TRTRACE by CENTER_ID, named 'TTrtraceList'.
     * @return The entity list of referrer property 'TTrtraceList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrtrace> getTTrtraceList() {
        if (_tTrtraceList == null) { _tTrtraceList = newReferrerList(); }
        return _tTrtraceList;
    }

    /**
     * [set] T_TRTRACE by CENTER_ID, named 'TTrtraceList'.
     * @param tTrtraceList The entity list of referrer property 'TTrtraceList'. (NullAllowed)
     */
    public void setTTrtraceList(List<TTrtrace> tTrtraceList) {
        _tTrtraceList = tTrtraceList;
    }

    /** T_YTRSO by CENTER_ID, named 'TYtrsoList'. */
    protected List<TYtrso> _tYtrsoList;

    /**
     * [get] T_YTRSO by CENTER_ID, named 'TYtrsoList'.
     * @return The entity list of referrer property 'TYtrsoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TYtrso> getTYtrsoList() {
        if (_tYtrsoList == null) { _tYtrsoList = newReferrerList(); }
        return _tYtrsoList;
    }

    /**
     * [set] T_YTRSO by CENTER_ID, named 'TYtrsoList'.
     * @param tYtrsoList The entity list of referrer property 'TYtrsoList'. (NullAllowed)
     */
    public void setTYtrsoList(List<TYtrso> tYtrsoList) {
        _tYtrsoList = tYtrsoList;
    }

    /** W_HT_INVENTORY_INPUT_PROD by CENTER_ID, named 'WHtInventoryInputProdList'. */
    protected List<WHtInventoryInputProd> _wHtInventoryInputProdList;

    /**
     * [get] W_HT_INVENTORY_INPUT_PROD by CENTER_ID, named 'WHtInventoryInputProdList'.
     * @return The entity list of referrer property 'WHtInventoryInputProdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtInventoryInputProd> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = newReferrerList(); }
        return _wHtInventoryInputProdList;
    }

    /**
     * [set] W_HT_INVENTORY_INPUT_PROD by CENTER_ID, named 'WHtInventoryInputProdList'.
     * @param wHtInventoryInputProdList The entity list of referrer property 'WHtInventoryInputProdList'. (NullAllowed)
     */
    public void setWHtInventoryInputProdList(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        _wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    /** W_HT_LOADING by CENTER_ID, named 'WHtLoadingList'. */
    protected List<WHtLoading> _wHtLoadingList;

    /**
     * [get] W_HT_LOADING by CENTER_ID, named 'WHtLoadingList'.
     * @return The entity list of referrer property 'WHtLoadingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtLoading> getWHtLoadingList() {
        if (_wHtLoadingList == null) { _wHtLoadingList = newReferrerList(); }
        return _wHtLoadingList;
    }

    /**
     * [set] W_HT_LOADING by CENTER_ID, named 'WHtLoadingList'.
     * @param wHtLoadingList The entity list of referrer property 'WHtLoadingList'. (NullAllowed)
     */
    public void setWHtLoadingList(List<WHtLoading> wHtLoadingList) {
        _wHtLoadingList = wHtLoadingList;
    }

    /** W_HT_RECEIVE_INSPECTION by CENTER_ID, named 'WHtReceiveInspectionList'. */
    protected List<WHtReceiveInspection> _wHtReceiveInspectionList;

    /**
     * [get] W_HT_RECEIVE_INSPECTION by CENTER_ID, named 'WHtReceiveInspectionList'.
     * @return The entity list of referrer property 'WHtReceiveInspectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveInspection> getWHtReceiveInspectionList() {
        if (_wHtReceiveInspectionList == null) { _wHtReceiveInspectionList = newReferrerList(); }
        return _wHtReceiveInspectionList;
    }

    /**
     * [set] W_HT_RECEIVE_INSPECTION by CENTER_ID, named 'WHtReceiveInspectionList'.
     * @param wHtReceiveInspectionList The entity list of referrer property 'WHtReceiveInspectionList'. (NullAllowed)
     */
    public void setWHtReceiveInspectionList(List<WHtReceiveInspection> wHtReceiveInspectionList) {
        _wHtReceiveInspectionList = wHtReceiveInspectionList;
    }

    /** W_HT_RECEIVE_NO_PLAN_INSP by CENTER_ID, named 'WHtReceiveNoPlanInspList'. */
    protected List<WHtReceiveNoPlanInsp> _wHtReceiveNoPlanInspList;

    /**
     * [get] W_HT_RECEIVE_NO_PLAN_INSP by CENTER_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveNoPlanInsp> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = newReferrerList(); }
        return _wHtReceiveNoPlanInspList;
    }

    /**
     * [set] W_HT_RECEIVE_NO_PLAN_INSP by CENTER_ID, named 'WHtReceiveNoPlanInspList'.
     * @param wHtReceiveNoPlanInspList The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NullAllowed)
     */
    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        _wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    /** W_HT_RECEIVE_STORE by CENTER_ID, named 'WHtReceiveStoreList'. */
    protected List<WHtReceiveStore> _wHtReceiveStoreList;

    /**
     * [get] W_HT_RECEIVE_STORE by CENTER_ID, named 'WHtReceiveStoreList'.
     * @return The entity list of referrer property 'WHtReceiveStoreList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveStore> getWHtReceiveStoreList() {
        if (_wHtReceiveStoreList == null) { _wHtReceiveStoreList = newReferrerList(); }
        return _wHtReceiveStoreList;
    }

    /**
     * [set] W_HT_RECEIVE_STORE by CENTER_ID, named 'WHtReceiveStoreList'.
     * @param wHtReceiveStoreList The entity list of referrer property 'WHtReceiveStoreList'. (NullAllowed)
     */
    public void setWHtReceiveStoreList(List<WHtReceiveStore> wHtReceiveStoreList) {
        _wHtReceiveStoreList = wHtReceiveStoreList;
    }

    /** W_HT_SERIAL_RECEIVE_INSP by CENTER_ID, named 'WHtSerialReceiveInspList'. */
    protected List<WHtSerialReceiveInsp> _wHtSerialReceiveInspList;

    /**
     * [get] W_HT_SERIAL_RECEIVE_INSP by CENTER_ID, named 'WHtSerialReceiveInspList'.
     * @return The entity list of referrer property 'WHtSerialReceiveInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtSerialReceiveInsp> getWHtSerialReceiveInspList() {
        if (_wHtSerialReceiveInspList == null) { _wHtSerialReceiveInspList = newReferrerList(); }
        return _wHtSerialReceiveInspList;
    }

    /**
     * [set] W_HT_SERIAL_RECEIVE_INSP by CENTER_ID, named 'WHtSerialReceiveInspList'.
     * @param wHtSerialReceiveInspList The entity list of referrer property 'WHtSerialReceiveInspList'. (NullAllowed)
     */
    public void setWHtSerialReceiveInspList(List<WHtSerialReceiveInsp> wHtSerialReceiveInspList) {
        _wHtSerialReceiveInspList = wHtSerialReceiveInspList;
    }

    /** W_HT_SERIAL_SHIPPING_INSP by CENTER_ID, named 'WHtSerialShippingInspList'. */
    protected List<WHtSerialShippingInsp> _wHtSerialShippingInspList;

    /**
     * [get] W_HT_SERIAL_SHIPPING_INSP by CENTER_ID, named 'WHtSerialShippingInspList'.
     * @return The entity list of referrer property 'WHtSerialShippingInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtSerialShippingInsp> getWHtSerialShippingInspList() {
        if (_wHtSerialShippingInspList == null) { _wHtSerialShippingInspList = newReferrerList(); }
        return _wHtSerialShippingInspList;
    }

    /**
     * [set] W_HT_SERIAL_SHIPPING_INSP by CENTER_ID, named 'WHtSerialShippingInspList'.
     * @param wHtSerialShippingInspList The entity list of referrer property 'WHtSerialShippingInspList'. (NullAllowed)
     */
    public void setWHtSerialShippingInspList(List<WHtSerialShippingInsp> wHtSerialShippingInspList) {
        _wHtSerialShippingInspList = wHtSerialShippingInspList;
    }

    /** W_HT_SHIPPING by CENTER_ID, named 'WHtShippingList'. */
    protected List<WHtShipping> _wHtShippingList;

    /**
     * [get] W_HT_SHIPPING by CENTER_ID, named 'WHtShippingList'.
     * @return The entity list of referrer property 'WHtShippingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtShipping> getWHtShippingList() {
        if (_wHtShippingList == null) { _wHtShippingList = newReferrerList(); }
        return _wHtShippingList;
    }

    /**
     * [set] W_HT_SHIPPING by CENTER_ID, named 'WHtShippingList'.
     * @param wHtShippingList The entity list of referrer property 'WHtShippingList'. (NullAllowed)
     */
    public void setWHtShippingList(List<WHtShipping> wHtShippingList) {
        _wHtShippingList = wHtShippingList;
    }

    /** W_HT_SHIPPING_PICKING by CENTER_ID, named 'WHtShippingPickingList'. */
    protected List<WHtShippingPicking> _wHtShippingPickingList;

    /**
     * [get] W_HT_SHIPPING_PICKING by CENTER_ID, named 'WHtShippingPickingList'.
     * @return The entity list of referrer property 'WHtShippingPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtShippingPicking> getWHtShippingPickingList() {
        if (_wHtShippingPickingList == null) { _wHtShippingPickingList = newReferrerList(); }
        return _wHtShippingPickingList;
    }

    /**
     * [set] W_HT_SHIPPING_PICKING by CENTER_ID, named 'WHtShippingPickingList'.
     * @param wHtShippingPickingList The entity list of referrer property 'WHtShippingPickingList'. (NullAllowed)
     */
    public void setWHtShippingPickingList(List<WHtShippingPicking> wHtShippingPickingList) {
        _wHtShippingPickingList = wHtShippingPickingList;
    }

    /** W_SGL_ROW_SHIP_INSP_H by CENTER_ID, named 'WSglRowShipInspHList'. */
    protected List<WSglRowShipInspH> _wSglRowShipInspHList;

    /**
     * [get] W_SGL_ROW_SHIP_INSP_H by CENTER_ID, named 'WSglRowShipInspHList'.
     * @return The entity list of referrer property 'WSglRowShipInspHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WSglRowShipInspH> getWSglRowShipInspHList() {
        if (_wSglRowShipInspHList == null) { _wSglRowShipInspHList = newReferrerList(); }
        return _wSglRowShipInspHList;
    }

    /**
     * [set] W_SGL_ROW_SHIP_INSP_H by CENTER_ID, named 'WSglRowShipInspHList'.
     * @param wSglRowShipInspHList The entity list of referrer property 'WSglRowShipInspHList'. (NullAllowed)
     */
    public void setWSglRowShipInspHList(List<WSglRowShipInspH> wSglRowShipInspHList) {
        _wSglRowShipInspHList = wSglRowShipInspHList;
    }

    /** W_SHIPPING_INTERRUPT by CENTER_ID, named 'WShippingInterruptList'. */
    protected List<WShippingInterrupt> _wShippingInterruptList;

    /**
     * [get] W_SHIPPING_INTERRUPT by CENTER_ID, named 'WShippingInterruptList'.
     * @return The entity list of referrer property 'WShippingInterruptList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WShippingInterrupt> getWShippingInterruptList() {
        if (_wShippingInterruptList == null) { _wShippingInterruptList = newReferrerList(); }
        return _wShippingInterruptList;
    }

    /**
     * [set] W_SHIPPING_INTERRUPT by CENTER_ID, named 'WShippingInterruptList'.
     * @param wShippingInterruptList The entity list of referrer property 'WShippingInterruptList'. (NullAllowed)
     */
    public void setWShippingInterruptList(List<WShippingInterrupt> wShippingInterruptList) {
        _wShippingInterruptList = wShippingInterruptList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMCenter) {
            BsMCenter other = (BsMCenter)obj;
            if (!xSV(_centerId, other._centerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _centerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bTimeZone != null)
        { sb.append(li).append(xbRDS(_bTimeZone, "bTimeZone")); }
        if (_bCulture != null)
        { sb.append(li).append(xbRDS(_bCulture, "bCulture")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_mBoxList != null) { for (MBox et : _mBoxList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mBoxList")); } } }
        if (_mBoxGrpList != null) { for (MBoxGrp et : _mBoxGrpList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mBoxGrpList")); } } }
        if (_mCarrierList != null) { for (MCarrier et : _mCarrierList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierList")); } } }
        if (_mCarrierSlipSgwList != null) { for (MCarrierSlipSgw et : _mCarrierSlipSgwList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierSlipSgwList")); } } }
        if (_mCarrierSlipYmtList != null) { for (MCarrierSlipYmt et : _mCarrierSlipYmtList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierSlipYmtList")); } } }
        if (_mCarrierSlipYupkList != null) { for (MCarrierSlipYupk et : _mCarrierSlipYupkList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierSlipYupkList")); } } }
        if (_mCblkList != null) { for (MCblk et : _mCblkList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCblkList")); } } }
        if (_mCbrctgList != null) { for (MCbrctg et : _mCbrctgList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCbrctgList")); } } }
        if (_mCdrcattList != null) { for (MCdrcatt et : _mCdrcattList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCdrcattList")); } } }
        if (_mCenterClassList != null) { for (MCenterClass et : _mCenterClassList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterClassList")); } } }
        if (_mCenterColList != null) { for (MCenterCol et : _mCenterColList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterColList")); } } }
        if (_mCenterCustomerList != null) { for (MCenterCustomer et : _mCenterCustomerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterCustomerList")); } } }
        if (_mCenterItemList != null) { for (MCenterItem et : _mCenterItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterItemList")); } } }
        if (_mCenterScreenList != null) { for (MCenterScreen et : _mCenterScreenList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterScreenList")); } } }
        if (_mClientCenterList != null) { for (MClientCenter et : _mClientCenterList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientCenterList")); } } }
        if (_mClinList != null) { for (MClin et : _mClinList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClinList")); } } }
        if (_mCorgList != null) { for (MCorg et : _mCorgList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCorgList")); } } }
        if (_mDeliveryCourseList != null) { for (MDeliveryCourse et : _mDeliveryCourseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mDeliveryCourseList")); } } }
        if (_mLocationList != null) { for (MLocation et : _mLocationList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mLocationList")); } } }
        if (_mMfinvoperationList != null) { for (MMfinvoperation et : _mMfinvoperationList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mMfinvoperationList")); } } }
        if (_mMfmonthchgList != null) { for (MMfmonthchg et : _mMfmonthchgList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mMfmonthchgList")); } } }
        if (_mMfstockitemList != null) { for (MMfstockitem et : _mMfstockitemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mMfstockitemList")); } } }
        if (_mMfwhstrctList != null) { for (MMfwhstrct et : _mMfwhstrctList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mMfwhstrctList")); } } }
        if (_mMfwhxitemList != null) { for (MMfwhxitem et : _mMfwhxitemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mMfwhxitemList")); } } }
        if (_mNumberingCenterList != null) { for (MNumberingCenter et : _mNumberingCenterList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mNumberingCenterList")); } } }
        if (_mUserCenterList != null) { for (MUserCenter et : _mUserCenterList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mUserCenterList")); } } }
        if (_mUserLoginList != null) { for (MUserLogin et : _mUserLoginList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mUserLoginList")); } } }
        if (_mWarehouseList != null) { for (MWarehouse et : _mWarehouseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mWarehouseList")); } } }
        if (_mWebHtInfoList != null) { for (MWebHtInfo et : _mWebHtInfoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mWebHtInfoList")); } } }
        if (_tAllocInstHList != null) { for (TAllocInstH et : _tAllocInstHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstHList")); } } }
        if (_tCcopamList != null) { for (TCcopam et : _tCcopamList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tCcopamList")); } } }
        if (_tCenterSymbolList != null) { for (TCenterSymbol et : _tCenterSymbolList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tCenterSymbolList")); } } }
        if (_tCordhdrList != null) { for (TCordhdr et : _tCordhdrList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tCordhdrList")); } } }
        if (_tCsrwhadmList != null) { for (TCsrwhadm et : _tCsrwhadmList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tCsrwhadmList")); } } }
        if (_tEcOrderHList != null) { for (TEcOrderH et : _tEcOrderHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tEcOrderHList")); } } }
        if (_tInventoryHList != null) { for (TInventoryH et : _tInventoryHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryHList")); } } }
        if (_tMflastshiplotList != null) { for (TMflastshiplot et : _tMflastshiplotList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMflastshiplotList")); } } }
        if (_tMoveInstHList != null) { for (TMoveInstH et : _tMoveInstHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveInstHList")); } } }
        if (_tPackingHList != null) { for (TPackingH et : _tPackingHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPackingHList")); } } }
        if (_tPalletList != null) { for (TPallet et : _tPalletList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPalletList")); } } }
        if (_tPickingHList != null) { for (TPickingH et : _tPickingHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingHList")); } } }
        if (_tPicMthdRcmdList != null) { for (TPicMthdRcmd et : _tPicMthdRcmdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPicMthdRcmdList")); } } }
        if (_tReceivePlanHList != null) { for (TReceivePlanH et : _tReceivePlanHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanHList")); } } }
        if (_tSerialNoList != null) { for (TSerialNo et : _tSerialNoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tSerialNoList")); } } }
        if (_tShippingInstHList != null) { for (TShippingInstH et : _tShippingInstHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstHList")); } } }
        if (_tSplinfoList != null) { for (TSplinfo et : _tSplinfoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tSplinfoList")); } } }
        if (_tStoreRecordHList != null) { for (TStoreRecordH et : _tStoreRecordHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStoreRecordHList")); } } }
        if (_tTrallinvList != null) { for (TTrallinv et : _tTrallinvList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrallinvList")); } } }
        if (_tTrallinvhistoryList != null) { for (TTrallinvhistory et : _tTrallinvhistoryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrallinvhistoryList")); } } }
        if (_tTrcaseinventoryList != null) { for (TTrcaseinventory et : _tTrcaseinventoryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrcaseinventoryList")); } } }
        if (_tTrcasenumList != null) { for (TTrcasenum et : _tTrcasenumList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrcasenumList")); } } }
        if (_tTrcasestockList != null) { for (TTrcasestock et : _tTrcasestockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrcasestockList")); } } }
        if (_tTrhanbaiinvList != null) { for (TTrhanbaiinv et : _tTrhanbaiinvList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrhanbaiinvList")); } } }
        if (_tTrinvcheckinfoList != null) { for (TTrinvcheckinfo et : _tTrinvcheckinfoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrinvcheckinfoList")); } } }
        if (_tTrinvcorrectList != null) { for (TTrinvcorrect et : _tTrinvcorrectList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrinvcorrectList")); } } }
        if (_tTrinvreanswerList != null) { for (TTrinvreanswer et : _tTrinvreanswerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrinvreanswerList")); } } }
        if (_tTrinvrequestList != null) { for (TTrinvrequest et : _tTrinvrequestList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrinvrequestList")); } } }
        if (_tTritemconvresultList != null) { for (TTritemconvresult et : _tTritemconvresultList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTritemconvresultList")); } } }
        if (_tTrjukyuinvList != null) { for (TTrjukyuinv et : _tTrjukyuinvList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrjukyuinvList")); } } }
        if (_tTrmanufacturedateList != null) { for (TTrmanufacturedate et : _tTrmanufacturedateList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrmanufacturedateList")); } } }
        if (_tTrmanufacturedatedetailList != null) { for (TTrmanufacturedatedetail et : _tTrmanufacturedatedetailList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrmanufacturedatedetailList")); } } }
        if (_tTrmanufacturedatehistoryList != null) { for (TTrmanufacturedatehistory et : _tTrmanufacturedatehistoryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrmanufacturedatehistoryList")); } } }
        if (_tTrpallettraceList != null) { for (TTrpallettrace et : _tTrpallettraceList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrpallettraceList")); } } }
        if (_tTrreversestockList != null) { for (TTrreversestock et : _tTrreversestockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrreversestockList")); } } }
        if (_tTrstockdiffhistoryList != null) { for (TTrstockdiffhistory et : _tTrstockdiffhistoryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrstockdiffhistoryList")); } } }
        if (_tTrsymboltraceList != null) { for (TTrsymboltrace et : _tTrsymboltraceList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrsymboltraceList")); } } }
        if (_tTrsymboltraceextendList != null) { for (TTrsymboltraceextend et : _tTrsymboltraceextendList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrsymboltraceextendList")); } } }
        if (_tTrtraceList != null) { for (TTrtrace et : _tTrtraceList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrtraceList")); } } }
        if (_tYtrsoList != null) { for (TYtrso et : _tYtrsoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tYtrsoList")); } } }
        if (_wHtInventoryInputProdList != null) { for (WHtInventoryInputProd et : _wHtInventoryInputProdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtInventoryInputProdList")); } } }
        if (_wHtLoadingList != null) { for (WHtLoading et : _wHtLoadingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtLoadingList")); } } }
        if (_wHtReceiveInspectionList != null) { for (WHtReceiveInspection et : _wHtReceiveInspectionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveInspectionList")); } } }
        if (_wHtReceiveNoPlanInspList != null) { for (WHtReceiveNoPlanInsp et : _wHtReceiveNoPlanInspList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveNoPlanInspList")); } } }
        if (_wHtReceiveStoreList != null) { for (WHtReceiveStore et : _wHtReceiveStoreList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveStoreList")); } } }
        if (_wHtSerialReceiveInspList != null) { for (WHtSerialReceiveInsp et : _wHtSerialReceiveInspList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtSerialReceiveInspList")); } } }
        if (_wHtSerialShippingInspList != null) { for (WHtSerialShippingInsp et : _wHtSerialShippingInspList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtSerialShippingInspList")); } } }
        if (_wHtShippingList != null) { for (WHtShipping et : _wHtShippingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtShippingList")); } } }
        if (_wHtShippingPickingList != null) { for (WHtShippingPicking et : _wHtShippingPickingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtShippingPickingList")); } } }
        if (_wSglRowShipInspHList != null) { for (WSglRowShipInspH et : _wSglRowShipInspHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wSglRowShipInspHList")); } } }
        if (_wShippingInterruptList != null) { for (WShippingInterrupt et : _wShippingInterruptList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wShippingInterruptList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_centerAbbr));
        sb.append(dm).append(xfND(_cultureId));
        sb.append(dm).append(xfND(_timeZoneId));
        sb.append(dm).append(xfND(_warehousegroup));
        sb.append(dm).append(xfND(_virtualwhouseflg));
        sb.append(dm).append(xfND(_aname));
        sb.append(dm).append(xfND(_address1));
        sb.append(dm).append(xfND(_address2));
        sb.append(dm).append(xfND(_address3));
        sb.append(dm).append(xfND(_postno));
        sb.append(dm).append(xfND(_countrycd));
        sb.append(dm).append(xfND(_portcd));
        sb.append(dm).append(xfND(_districtcd));
        sb.append(dm).append(xfND(_phone1));
        sb.append(dm).append(xfND(_phone2));
        sb.append(dm).append(xfND(_fax1));
        sb.append(dm).append(xfND(_fax2));
        sb.append(dm).append(xfND(_warehouseflg));
        sb.append(dm).append(xfND(_refname));
        sb.append(dm).append(xfND(_subcontractflg));
        sb.append(dm).append(xfND(_weightcapacity));
        sb.append(dm).append(xfND(_capacity));
        sb.append(dm).append(xfND(_hulftId));
        sb.append(dm).append(xfND(_warehousecls));
        sb.append(dm).append(xfND(_cmlrasid));
        sb.append(dm).append(xfND(_ownOrAnotherFlg));
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
        if (_bTimeZone != null)
        { sb.append(dm).append("bTimeZone"); }
        if (_bCulture != null)
        { sb.append(dm).append("bCulture"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_mBoxList != null && !_mBoxList.isEmpty())
        { sb.append(dm).append("mBoxList"); }
        if (_mBoxGrpList != null && !_mBoxGrpList.isEmpty())
        { sb.append(dm).append("mBoxGrpList"); }
        if (_mCarrierList != null && !_mCarrierList.isEmpty())
        { sb.append(dm).append("mCarrierList"); }
        if (_mCarrierSlipSgwList != null && !_mCarrierSlipSgwList.isEmpty())
        { sb.append(dm).append("mCarrierSlipSgwList"); }
        if (_mCarrierSlipYmtList != null && !_mCarrierSlipYmtList.isEmpty())
        { sb.append(dm).append("mCarrierSlipYmtList"); }
        if (_mCarrierSlipYupkList != null && !_mCarrierSlipYupkList.isEmpty())
        { sb.append(dm).append("mCarrierSlipYupkList"); }
        if (_mCblkList != null && !_mCblkList.isEmpty())
        { sb.append(dm).append("mCblkList"); }
        if (_mCbrctgList != null && !_mCbrctgList.isEmpty())
        { sb.append(dm).append("mCbrctgList"); }
        if (_mCdrcattList != null && !_mCdrcattList.isEmpty())
        { sb.append(dm).append("mCdrcattList"); }
        if (_mCenterClassList != null && !_mCenterClassList.isEmpty())
        { sb.append(dm).append("mCenterClassList"); }
        if (_mCenterColList != null && !_mCenterColList.isEmpty())
        { sb.append(dm).append("mCenterColList"); }
        if (_mCenterCustomerList != null && !_mCenterCustomerList.isEmpty())
        { sb.append(dm).append("mCenterCustomerList"); }
        if (_mCenterItemList != null && !_mCenterItemList.isEmpty())
        { sb.append(dm).append("mCenterItemList"); }
        if (_mCenterScreenList != null && !_mCenterScreenList.isEmpty())
        { sb.append(dm).append("mCenterScreenList"); }
        if (_mClientCenterList != null && !_mClientCenterList.isEmpty())
        { sb.append(dm).append("mClientCenterList"); }
        if (_mClinList != null && !_mClinList.isEmpty())
        { sb.append(dm).append("mClinList"); }
        if (_mCorgList != null && !_mCorgList.isEmpty())
        { sb.append(dm).append("mCorgList"); }
        if (_mDeliveryCourseList != null && !_mDeliveryCourseList.isEmpty())
        { sb.append(dm).append("mDeliveryCourseList"); }
        if (_mLocationList != null && !_mLocationList.isEmpty())
        { sb.append(dm).append("mLocationList"); }
        if (_mMfinvoperationList != null && !_mMfinvoperationList.isEmpty())
        { sb.append(dm).append("mMfinvoperationList"); }
        if (_mMfmonthchgList != null && !_mMfmonthchgList.isEmpty())
        { sb.append(dm).append("mMfmonthchgList"); }
        if (_mMfstockitemList != null && !_mMfstockitemList.isEmpty())
        { sb.append(dm).append("mMfstockitemList"); }
        if (_mMfwhstrctList != null && !_mMfwhstrctList.isEmpty())
        { sb.append(dm).append("mMfwhstrctList"); }
        if (_mMfwhxitemList != null && !_mMfwhxitemList.isEmpty())
        { sb.append(dm).append("mMfwhxitemList"); }
        if (_mNumberingCenterList != null && !_mNumberingCenterList.isEmpty())
        { sb.append(dm).append("mNumberingCenterList"); }
        if (_mUserCenterList != null && !_mUserCenterList.isEmpty())
        { sb.append(dm).append("mUserCenterList"); }
        if (_mUserLoginList != null && !_mUserLoginList.isEmpty())
        { sb.append(dm).append("mUserLoginList"); }
        if (_mWarehouseList != null && !_mWarehouseList.isEmpty())
        { sb.append(dm).append("mWarehouseList"); }
        if (_mWebHtInfoList != null && !_mWebHtInfoList.isEmpty())
        { sb.append(dm).append("mWebHtInfoList"); }
        if (_tAllocInstHList != null && !_tAllocInstHList.isEmpty())
        { sb.append(dm).append("tAllocInstHList"); }
        if (_tCcopamList != null && !_tCcopamList.isEmpty())
        { sb.append(dm).append("tCcopamList"); }
        if (_tCenterSymbolList != null && !_tCenterSymbolList.isEmpty())
        { sb.append(dm).append("tCenterSymbolList"); }
        if (_tCordhdrList != null && !_tCordhdrList.isEmpty())
        { sb.append(dm).append("tCordhdrList"); }
        if (_tCsrwhadmList != null && !_tCsrwhadmList.isEmpty())
        { sb.append(dm).append("tCsrwhadmList"); }
        if (_tEcOrderHList != null && !_tEcOrderHList.isEmpty())
        { sb.append(dm).append("tEcOrderHList"); }
        if (_tInventoryHList != null && !_tInventoryHList.isEmpty())
        { sb.append(dm).append("tInventoryHList"); }
        if (_tMflastshiplotList != null && !_tMflastshiplotList.isEmpty())
        { sb.append(dm).append("tMflastshiplotList"); }
        if (_tMoveInstHList != null && !_tMoveInstHList.isEmpty())
        { sb.append(dm).append("tMoveInstHList"); }
        if (_tPackingHList != null && !_tPackingHList.isEmpty())
        { sb.append(dm).append("tPackingHList"); }
        if (_tPalletList != null && !_tPalletList.isEmpty())
        { sb.append(dm).append("tPalletList"); }
        if (_tPickingHList != null && !_tPickingHList.isEmpty())
        { sb.append(dm).append("tPickingHList"); }
        if (_tPicMthdRcmdList != null && !_tPicMthdRcmdList.isEmpty())
        { sb.append(dm).append("tPicMthdRcmdList"); }
        if (_tReceivePlanHList != null && !_tReceivePlanHList.isEmpty())
        { sb.append(dm).append("tReceivePlanHList"); }
        if (_tSerialNoList != null && !_tSerialNoList.isEmpty())
        { sb.append(dm).append("tSerialNoList"); }
        if (_tShippingInstHList != null && !_tShippingInstHList.isEmpty())
        { sb.append(dm).append("tShippingInstHList"); }
        if (_tSplinfoList != null && !_tSplinfoList.isEmpty())
        { sb.append(dm).append("tSplinfoList"); }
        if (_tStoreRecordHList != null && !_tStoreRecordHList.isEmpty())
        { sb.append(dm).append("tStoreRecordHList"); }
        if (_tTrallinvList != null && !_tTrallinvList.isEmpty())
        { sb.append(dm).append("tTrallinvList"); }
        if (_tTrallinvhistoryList != null && !_tTrallinvhistoryList.isEmpty())
        { sb.append(dm).append("tTrallinvhistoryList"); }
        if (_tTrcaseinventoryList != null && !_tTrcaseinventoryList.isEmpty())
        { sb.append(dm).append("tTrcaseinventoryList"); }
        if (_tTrcasenumList != null && !_tTrcasenumList.isEmpty())
        { sb.append(dm).append("tTrcasenumList"); }
        if (_tTrcasestockList != null && !_tTrcasestockList.isEmpty())
        { sb.append(dm).append("tTrcasestockList"); }
        if (_tTrhanbaiinvList != null && !_tTrhanbaiinvList.isEmpty())
        { sb.append(dm).append("tTrhanbaiinvList"); }
        if (_tTrinvcheckinfoList != null && !_tTrinvcheckinfoList.isEmpty())
        { sb.append(dm).append("tTrinvcheckinfoList"); }
        if (_tTrinvcorrectList != null && !_tTrinvcorrectList.isEmpty())
        { sb.append(dm).append("tTrinvcorrectList"); }
        if (_tTrinvreanswerList != null && !_tTrinvreanswerList.isEmpty())
        { sb.append(dm).append("tTrinvreanswerList"); }
        if (_tTrinvrequestList != null && !_tTrinvrequestList.isEmpty())
        { sb.append(dm).append("tTrinvrequestList"); }
        if (_tTritemconvresultList != null && !_tTritemconvresultList.isEmpty())
        { sb.append(dm).append("tTritemconvresultList"); }
        if (_tTrjukyuinvList != null && !_tTrjukyuinvList.isEmpty())
        { sb.append(dm).append("tTrjukyuinvList"); }
        if (_tTrmanufacturedateList != null && !_tTrmanufacturedateList.isEmpty())
        { sb.append(dm).append("tTrmanufacturedateList"); }
        if (_tTrmanufacturedatedetailList != null && !_tTrmanufacturedatedetailList.isEmpty())
        { sb.append(dm).append("tTrmanufacturedatedetailList"); }
        if (_tTrmanufacturedatehistoryList != null && !_tTrmanufacturedatehistoryList.isEmpty())
        { sb.append(dm).append("tTrmanufacturedatehistoryList"); }
        if (_tTrpallettraceList != null && !_tTrpallettraceList.isEmpty())
        { sb.append(dm).append("tTrpallettraceList"); }
        if (_tTrreversestockList != null && !_tTrreversestockList.isEmpty())
        { sb.append(dm).append("tTrreversestockList"); }
        if (_tTrstockdiffhistoryList != null && !_tTrstockdiffhistoryList.isEmpty())
        { sb.append(dm).append("tTrstockdiffhistoryList"); }
        if (_tTrsymboltraceList != null && !_tTrsymboltraceList.isEmpty())
        { sb.append(dm).append("tTrsymboltraceList"); }
        if (_tTrsymboltraceextendList != null && !_tTrsymboltraceextendList.isEmpty())
        { sb.append(dm).append("tTrsymboltraceextendList"); }
        if (_tTrtraceList != null && !_tTrtraceList.isEmpty())
        { sb.append(dm).append("tTrtraceList"); }
        if (_tYtrsoList != null && !_tYtrsoList.isEmpty())
        { sb.append(dm).append("tYtrsoList"); }
        if (_wHtInventoryInputProdList != null && !_wHtInventoryInputProdList.isEmpty())
        { sb.append(dm).append("wHtInventoryInputProdList"); }
        if (_wHtLoadingList != null && !_wHtLoadingList.isEmpty())
        { sb.append(dm).append("wHtLoadingList"); }
        if (_wHtReceiveInspectionList != null && !_wHtReceiveInspectionList.isEmpty())
        { sb.append(dm).append("wHtReceiveInspectionList"); }
        if (_wHtReceiveNoPlanInspList != null && !_wHtReceiveNoPlanInspList.isEmpty())
        { sb.append(dm).append("wHtReceiveNoPlanInspList"); }
        if (_wHtReceiveStoreList != null && !_wHtReceiveStoreList.isEmpty())
        { sb.append(dm).append("wHtReceiveStoreList"); }
        if (_wHtSerialReceiveInspList != null && !_wHtSerialReceiveInspList.isEmpty())
        { sb.append(dm).append("wHtSerialReceiveInspList"); }
        if (_wHtSerialShippingInspList != null && !_wHtSerialShippingInspList.isEmpty())
        { sb.append(dm).append("wHtSerialShippingInspList"); }
        if (_wHtShippingList != null && !_wHtShippingList.isEmpty())
        { sb.append(dm).append("wHtShippingList"); }
        if (_wHtShippingPickingList != null && !_wHtShippingPickingList.isEmpty())
        { sb.append(dm).append("wHtShippingPickingList"); }
        if (_wSglRowShipInspHList != null && !_wSglRowShipInspHList.isEmpty())
        { sb.append(dm).append("wSglRowShipInspHList"); }
        if (_wShippingInterruptList != null && !_wShippingInterruptList.isEmpty())
        { sb.append(dm).append("wShippingInterruptList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCenter clone() {
        return (MCenter)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CENTER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {UQ, NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {UQ, NotNull, varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (basically NotNull if update: for the constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {NotNull, varchar(60)} <br>
     * 拠点名称
     * @return The value of the column 'CENTER_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {NotNull, varchar(60)} <br>
     * 拠点名称
     * @param centerNm The value of the column 'CENTER_NM'. (basically NotNull if update: for the constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] CENTER_ABBR: {varchar(60)} <br>
     * 拠点略称
     * @return The value of the column 'CENTER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterAbbr() {
        checkSpecifiedProperty("centerAbbr");
        return convertEmptyToNull(_centerAbbr);
    }

    /**
     * [set] CENTER_ABBR: {varchar(60)} <br>
     * 拠点略称
     * @param centerAbbr The value of the column 'CENTER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterAbbr(String centerAbbr) {
        registerModifiedProperty("centerAbbr");
        _centerAbbr = centerAbbr;
    }

    /**
     * [get] CULTURE_ID: {IX, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCultureId() {
        checkSpecifiedProperty("cultureId");
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {IX, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCultureId(Long cultureId) {
        registerModifiedProperty("cultureId");
        _cultureId = cultureId;
    }

    /**
     * [get] TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE} <br>
     * タイムゾーンID
     * @return The value of the column 'TIME_ZONE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTimeZoneId() {
        checkSpecifiedProperty("timeZoneId");
        return _timeZoneId;
    }

    /**
     * [set] TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE} <br>
     * タイムゾーンID
     * @param timeZoneId The value of the column 'TIME_ZONE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimeZoneId(Long timeZoneId) {
        registerModifiedProperty("timeZoneId");
        _timeZoneId = timeZoneId;
    }

    /**
     * [get] WarehouseGroup: {varchar(255)} <br>
     * 拠点グループ
     * @return The value of the column 'WarehouseGroup'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousegroup() {
        checkSpecifiedProperty("warehousegroup");
        return convertEmptyToNull(_warehousegroup);
    }

    /**
     * [set] WarehouseGroup: {varchar(255)} <br>
     * 拠点グループ
     * @param warehousegroup The value of the column 'WarehouseGroup'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousegroup(String warehousegroup) {
        registerModifiedProperty("warehousegroup");
        _warehousegroup = warehousegroup;
    }

    /**
     * [get] VirtualWhouseFlg: {char(1)} <br>
     * 論理拠点フラグ
     * @return The value of the column 'VirtualWhouseFlg'. (NullAllowed even if selected: for no constraint)
     */
    public String getVirtualwhouseflg() {
        checkSpecifiedProperty("virtualwhouseflg");
        return convertEmptyToNull(_virtualwhouseflg);
    }

    /**
     * [set] VirtualWhouseFlg: {char(1)} <br>
     * 論理拠点フラグ
     * @param virtualwhouseflg The value of the column 'VirtualWhouseFlg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVirtualwhouseflg(String virtualwhouseflg) {
        registerModifiedProperty("virtualwhouseflg");
        _virtualwhouseflg = virtualwhouseflg;
    }

    /**
     * [get] Aname: {varchar(255)} <br>
     * 検索名称
     * @return The value of the column 'Aname'. (NullAllowed even if selected: for no constraint)
     */
    public String getAname() {
        checkSpecifiedProperty("aname");
        return convertEmptyToNull(_aname);
    }

    /**
     * [set] Aname: {varchar(255)} <br>
     * 検索名称
     * @param aname The value of the column 'Aname'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAname(String aname) {
        registerModifiedProperty("aname");
        _aname = aname;
    }

    /**
     * [get] Address1: {varchar(255)} <br>
     * 住所１
     * @return The value of the column 'Address1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress1() {
        checkSpecifiedProperty("address1");
        return convertEmptyToNull(_address1);
    }

    /**
     * [set] Address1: {varchar(255)} <br>
     * 住所１
     * @param address1 The value of the column 'Address1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress1(String address1) {
        registerModifiedProperty("address1");
        _address1 = address1;
    }

    /**
     * [get] Address2: {varchar(255)} <br>
     * 住所２
     * @return The value of the column 'Address2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress2() {
        checkSpecifiedProperty("address2");
        return convertEmptyToNull(_address2);
    }

    /**
     * [set] Address2: {varchar(255)} <br>
     * 住所２
     * @param address2 The value of the column 'Address2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress2(String address2) {
        registerModifiedProperty("address2");
        _address2 = address2;
    }

    /**
     * [get] Address3: {varchar(255)} <br>
     * 住所３
     * @return The value of the column 'Address3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress3() {
        checkSpecifiedProperty("address3");
        return convertEmptyToNull(_address3);
    }

    /**
     * [set] Address3: {varchar(255)} <br>
     * 住所３
     * @param address3 The value of the column 'Address3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress3(String address3) {
        registerModifiedProperty("address3");
        _address3 = address3;
    }

    /**
     * [get] PostNo: {varchar(255)} <br>
     * 郵便番号
     * @return The value of the column 'PostNo'. (NullAllowed even if selected: for no constraint)
     */
    public String getPostno() {
        checkSpecifiedProperty("postno");
        return convertEmptyToNull(_postno);
    }

    /**
     * [set] PostNo: {varchar(255)} <br>
     * 郵便番号
     * @param postno The value of the column 'PostNo'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPostno(String postno) {
        registerModifiedProperty("postno");
        _postno = postno;
    }

    /**
     * [get] CountryCd: {varchar(255)} <br>
     * 国CD
     * @return The value of the column 'CountryCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getCountrycd() {
        checkSpecifiedProperty("countrycd");
        return convertEmptyToNull(_countrycd);
    }

    /**
     * [set] CountryCd: {varchar(255)} <br>
     * 国CD
     * @param countrycd The value of the column 'CountryCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCountrycd(String countrycd) {
        registerModifiedProperty("countrycd");
        _countrycd = countrycd;
    }

    /**
     * [get] PortCd: {varchar(255)} <br>
     * 入出港CD
     * @return The value of the column 'PortCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getPortcd() {
        checkSpecifiedProperty("portcd");
        return convertEmptyToNull(_portcd);
    }

    /**
     * [set] PortCd: {varchar(255)} <br>
     * 入出港CD
     * @param portcd The value of the column 'PortCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPortcd(String portcd) {
        registerModifiedProperty("portcd");
        _portcd = portcd;
    }

    /**
     * [get] DistrictCd: {varchar(255)} <br>
     * スキーマ名称
     * @return The value of the column 'DistrictCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistrictcd() {
        checkSpecifiedProperty("districtcd");
        return convertEmptyToNull(_districtcd);
    }

    /**
     * [set] DistrictCd: {varchar(255)} <br>
     * スキーマ名称
     * @param districtcd The value of the column 'DistrictCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistrictcd(String districtcd) {
        registerModifiedProperty("districtcd");
        _districtcd = districtcd;
    }

    /**
     * [get] Phone1: {varchar(255)} <br>
     * 電話番号１
     * @return The value of the column 'Phone1'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhone1() {
        checkSpecifiedProperty("phone1");
        return convertEmptyToNull(_phone1);
    }

    /**
     * [set] Phone1: {varchar(255)} <br>
     * 電話番号１
     * @param phone1 The value of the column 'Phone1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhone1(String phone1) {
        registerModifiedProperty("phone1");
        _phone1 = phone1;
    }

    /**
     * [get] Phone2: {varchar(255)} <br>
     * 電話番号２
     * @return The value of the column 'Phone2'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhone2() {
        checkSpecifiedProperty("phone2");
        return convertEmptyToNull(_phone2);
    }

    /**
     * [set] Phone2: {varchar(255)} <br>
     * 電話番号２
     * @param phone2 The value of the column 'Phone2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhone2(String phone2) {
        registerModifiedProperty("phone2");
        _phone2 = phone2;
    }

    /**
     * [get] Fax1: {varchar(255)} <br>
     * FAX番号１
     * @return The value of the column 'Fax1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFax1() {
        checkSpecifiedProperty("fax1");
        return convertEmptyToNull(_fax1);
    }

    /**
     * [set] Fax1: {varchar(255)} <br>
     * FAX番号１
     * @param fax1 The value of the column 'Fax1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFax1(String fax1) {
        registerModifiedProperty("fax1");
        _fax1 = fax1;
    }

    /**
     * [get] Fax2: {varchar(255)} <br>
     * FAX番号２
     * @return The value of the column 'Fax2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFax2() {
        checkSpecifiedProperty("fax2");
        return convertEmptyToNull(_fax2);
    }

    /**
     * [set] Fax2: {varchar(255)} <br>
     * FAX番号２
     * @param fax2 The value of the column 'Fax2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFax2(String fax2) {
        registerModifiedProperty("fax2");
        _fax2 = fax2;
    }

    /**
     * [get] WarehouseFlg: {char(1)} <br>
     * 倉庫識別
     * @return The value of the column 'WarehouseFlg'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseflg() {
        checkSpecifiedProperty("warehouseflg");
        return convertEmptyToNull(_warehouseflg);
    }

    /**
     * [set] WarehouseFlg: {char(1)} <br>
     * 倉庫識別
     * @param warehouseflg The value of the column 'WarehouseFlg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseflg(String warehouseflg) {
        registerModifiedProperty("warehouseflg");
        _warehouseflg = warehouseflg;
    }

    /**
     * [get] RefName: {varchar(255)} <br>
     * 融通輸送倉庫CD
     * @return The value of the column 'RefName'. (NullAllowed even if selected: for no constraint)
     */
    public String getRefname() {
        checkSpecifiedProperty("refname");
        return convertEmptyToNull(_refname);
    }

    /**
     * [set] RefName: {varchar(255)} <br>
     * 融通輸送倉庫CD
     * @param refname The value of the column 'RefName'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRefname(String refname) {
        registerModifiedProperty("refname");
        _refname = refname;
    }

    /**
     * [get] SubcontractFlg: {decimal(16, 6)} <br>
     * 外部倉庫フラグ
     * @return The value of the column 'SubcontractFlg'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSubcontractflg() {
        checkSpecifiedProperty("subcontractflg");
        return _subcontractflg;
    }

    /**
     * [set] SubcontractFlg: {decimal(16, 6)} <br>
     * 外部倉庫フラグ
     * @param subcontractflg The value of the column 'SubcontractFlg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSubcontractflg(java.math.BigDecimal subcontractflg) {
        registerModifiedProperty("subcontractflg");
        _subcontractflg = subcontractflg;
    }

    /**
     * [get] WeightCapacity: {decimal(16, 6)} <br>
     * 許容重量
     * @return The value of the column 'WeightCapacity'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getWeightcapacity() {
        checkSpecifiedProperty("weightcapacity");
        return _weightcapacity;
    }

    /**
     * [set] WeightCapacity: {decimal(16, 6)} <br>
     * 許容重量
     * @param weightcapacity The value of the column 'WeightCapacity'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWeightcapacity(java.math.BigDecimal weightcapacity) {
        registerModifiedProperty("weightcapacity");
        _weightcapacity = weightcapacity;
    }

    /**
     * [get] Capacity: {decimal(16, 6)} <br>
     * 許容容積
     * @return The value of the column 'Capacity'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCapacity() {
        checkSpecifiedProperty("capacity");
        return _capacity;
    }

    /**
     * [set] Capacity: {decimal(16, 6)} <br>
     * 許容容積
     * @param capacity The value of the column 'Capacity'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCapacity(java.math.BigDecimal capacity) {
        registerModifiedProperty("capacity");
        _capacity = capacity;
    }

    /**
     * [get] HULFT_ID: {bigint(19)} <br>
     * HULFT-ID
     * @return The value of the column 'HULFT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getHulftId() {
        checkSpecifiedProperty("hulftId");
        return _hulftId;
    }

    /**
     * [set] HULFT_ID: {bigint(19)} <br>
     * HULFT-ID
     * @param hulftId The value of the column 'HULFT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHulftId(Long hulftId) {
        registerModifiedProperty("hulftId");
        _hulftId = hulftId;
    }

    /**
     * [get] WarehouseCls: {char(1)} <br>
     * 倉庫区分
     * @return The value of the column 'WarehouseCls'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousecls() {
        checkSpecifiedProperty("warehousecls");
        return convertEmptyToNull(_warehousecls);
    }

    /**
     * [set] WarehouseCls: {char(1)} <br>
     * 倉庫区分
     * @param warehousecls The value of the column 'WarehouseCls'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousecls(String warehousecls) {
        registerModifiedProperty("warehousecls");
        _warehousecls = warehousecls;
    }

    /**
     * [get] CMLRASID: {varchar(30)} <br>
     * 共通下位管理区分
     * @return The value of the column 'CMLRASID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCmlrasid() {
        checkSpecifiedProperty("cmlrasid");
        return convertEmptyToNull(_cmlrasid);
    }

    /**
     * [set] CMLRASID: {varchar(30)} <br>
     * 共通下位管理区分
     * @param cmlrasid The value of the column 'CMLRASID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCmlrasid(String cmlrasid) {
        registerModifiedProperty("cmlrasid");
        _cmlrasid = cmlrasid;
    }

    /**
     * [get] OWN_OR_ANOTHER_FLG: {varchar(30)} <br>
     * 自社他社区分
     * @return The value of the column 'OWN_OR_ANOTHER_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnOrAnotherFlg() {
        checkSpecifiedProperty("ownOrAnotherFlg");
        return convertEmptyToNull(_ownOrAnotherFlg);
    }

    /**
     * [set] OWN_OR_ANOTHER_FLG: {varchar(30)} <br>
     * 自社他社区分
     * @param ownOrAnotherFlg The value of the column 'OWN_OR_ANOTHER_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnOrAnotherFlg(String ownOrAnotherFlg) {
        registerModifiedProperty("ownOrAnotherFlg");
        _ownOrAnotherFlg = ownOrAnotherFlg;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
