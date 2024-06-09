package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_CENTER as TABLE. <br>
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
 * [foreign-table]
 *     B_CULTURE, B_TIME_ZONE, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer-table]
 *     M_BOX, M_BOX_GRP, M_CARRIER, M_CARRIER_SLIP_SGW, M_CARRIER_SLIP_YMT, M_CARRIER_SLIP_YUPK, M_CBLK, M_CBRCTG, M_CDRCATT, M_CENTER_CLASS, M_CENTER_COL, M_CENTER_CUSTOMER, M_CENTER_ITEM, M_CENTER_SCREEN, M_CLIENT_CENTER, M_CLIN, M_CORG, M_DELIVERY_COURSE, M_LOCATION, M_MFINVOPERATION, M_MFMONTHCHG, M_MFSTOCKITEM, M_MFWHSTRCT, M_MFWHxITEM, M_NUMBERING_CENTER, M_USER_CENTER, M_USER_LOGIN, M_WAREHOUSE, M_WEB_HT_INFO, T_ALLOC_INST_H, T_CCOPAM, T_CENTER_SYMBOL, T_CORDHDR, T_CSRWHADM, T_EC_ORDER_H, T_INVENTORY_H, T_MFLASTSHIPLOT, T_MOVE_INST_H, T_PACKING_H, T_PALLET, T_PICKING_H, T_PIC_MTHD_RCMD, T_RECEIVE_PLAN_H, T_SERIAL_NO, T_SHIPPING_INST_H, T_SPLINFO, T_STORE_RECORD_H, T_TRALLINV, T_TRALLINVHISTORY, T_TRCASEINVENTORY, T_TRCASENUM, T_TRCASESTOCK, T_TRHANBAIINV, T_TRINVCHECKINFO, T_TRINVCORRECT, T_TRINVREANSWER, T_TRINVREQUEST, T_TRITEMCONVRESULT, T_TRJUKYUINV, T_TRMANUFACTUREDATE, T_TRMANUFACTUREDATEDETAIL, T_TRMANUFACTUREDATEHISTORY, T_TRPALLETTRACE, T_TRREVERSESTOCK, T_TRSTOCKDIFFHISTORY, T_TRSYMBOLTRACE, T_TRSYMBOLTRACEEXTEND, T_TRTRACE, T_YTRSO, W_HT_INVENTORY_INPUT_PROD, W_HT_LOADING, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SERIAL_RECEIVE_INSP, W_HT_SERIAL_SHIPPING_INSP, W_HT_SHIPPING, W_HT_SHIPPING_PICKING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT
 *
 * [foreign-property]
 *     bCulture, bTimeZone, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     mBoxList, mBoxGrpList, mCarrierList, mCarrierSlipSgwList, mCarrierSlipYmtList, mCarrierSlipYupkList, mCblkList, mCbrctgList, mCdrcattList, mCenterClassList, mCenterColList, mCenterCustomerList, mCenterItemList, mCenterScreenList, mClientCenterList, mClinList, mCorgList, mDeliveryCourseList, mLocationList, mMfinvoperationList, mMfmonthchgList, mMfstockitemList, mMfwhstrctList, mMfwhxitemList, mNumberingCenterList, mUserCenterList, mUserLoginList, mWarehouseList, mWebHtInfoList, tAllocInstHList, tCcopamList, tCenterSymbolList, tCordhdrList, tCsrwhadmList, tEcOrderHList, tInventoryHList, tMflastshiplotList, tMoveInstHList, tPackingHList, tPalletList, tPickingHList, tPicMthdRcmdList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tSplinfoList, tStoreRecordHList, tTrallinvList, tTrallinvhistoryList, tTrcaseinventoryList, tTrcasenumList, tTrcasestockList, tTrhanbaiinvList, tTrinvcheckinfoList, tTrinvcorrectList, tTrinvreanswerList, tTrinvrequestList, tTritemconvresultList, tTrjukyuinvList, tTrmanufacturedateList, tTrmanufacturedatedetailList, tTrmanufacturedatehistoryList, tTrpallettraceList, tTrreversestockList, tTrstockdiffhistoryList, tTrsymboltraceList, tTrsymboltraceextendList, tTrtraceList, tYtrsoList, wHtInventoryInputProdList, wHtLoadingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCenterDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** CENTER_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_CD: {UQ, NotNull, varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** CENTER_ABBR: {varchar(60)} */
    @JsonKey
    protected String _centerAbbr;

    /** CULTURE_ID: {IX, bigint(19), FK to B_CULTURE} */
    @JsonKey
    protected Long _cultureId;

    /** TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE} */
    @JsonKey
    protected Long _timeZoneId;

    /** WarehouseGroup: {varchar(255)} */
    @JsonKey
    protected String _warehousegroup;

    /** VirtualWhouseFlg: {char(1)} */
    @JsonKey
    protected String _virtualwhouseflg;

    /** Aname: {varchar(255)} */
    @JsonKey
    protected String _aname;

    /** Address1: {varchar(255)} */
    @JsonKey
    protected String _address1;

    /** Address2: {varchar(255)} */
    @JsonKey
    protected String _address2;

    /** Address3: {varchar(255)} */
    @JsonKey
    protected String _address3;

    /** PostNo: {varchar(255)} */
    @JsonKey
    protected String _postno;

    /** CountryCd: {varchar(255)} */
    @JsonKey
    protected String _countrycd;

    /** PortCd: {varchar(255)} */
    @JsonKey
    protected String _portcd;

    /** DistrictCd: {varchar(255)} */
    @JsonKey
    protected String _districtcd;

    /** Phone1: {varchar(255)} */
    @JsonKey
    protected String _phone1;

    /** Phone2: {varchar(255)} */
    @JsonKey
    protected String _phone2;

    /** Fax1: {varchar(255)} */
    @JsonKey
    protected String _fax1;

    /** Fax2: {varchar(255)} */
    @JsonKey
    protected String _fax2;

    /** WarehouseFlg: {char(1)} */
    @JsonKey
    protected String _warehouseflg;

    /** RefName: {varchar(255)} */
    @JsonKey
    protected String _refname;

    /** SubcontractFlg: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _subcontractflg;

    /** WeightCapacity: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _weightcapacity;

    /** Capacity: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _capacity;

    /** HULFT_ID: {bigint(19)} */
    @JsonKey
    protected Long _hulftId;

    /** WarehouseCls: {char(1)} */
    @JsonKey
    protected String _warehousecls;

    /** CMLRASID: {varchar(30)} */
    @JsonKey
    protected String _cmlrasid;

    /** OWN_OR_ANOTHER_FLG: {varchar(30)} */
    @JsonKey
    protected String _ownOrAnotherFlg;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCenterDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected BCultureDto _bCulture;

    public BCultureDto getBCulture() {
        return _bCulture;
    }

    public void setBCulture(BCultureDto bCulture) {
        this._bCulture = bCulture;
    }

    protected BTimeZoneDto _bTimeZone;

    public BTimeZoneDto getBTimeZone() {
        return _bTimeZone;
    }

    public void setBTimeZone(BTimeZoneDto bTimeZone) {
        this._bTimeZone = bTimeZone;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MBoxDto> _mBoxList;

    public List<MBoxDto> getMBoxList() {
        if (_mBoxList == null) { _mBoxList = new ArrayList<MBoxDto>(); }
        return _mBoxList;
    }

    public void setMBoxList(List<MBoxDto> mBoxList) {
        this._mBoxList = mBoxList;
    }

    protected List<MBoxGrpDto> _mBoxGrpList;

    public List<MBoxGrpDto> getMBoxGrpList() {
        if (_mBoxGrpList == null) { _mBoxGrpList = new ArrayList<MBoxGrpDto>(); }
        return _mBoxGrpList;
    }

    public void setMBoxGrpList(List<MBoxGrpDto> mBoxGrpList) {
        this._mBoxGrpList = mBoxGrpList;
    }

    protected List<MCarrierDto> _mCarrierList;

    public List<MCarrierDto> getMCarrierList() {
        if (_mCarrierList == null) { _mCarrierList = new ArrayList<MCarrierDto>(); }
        return _mCarrierList;
    }

    public void setMCarrierList(List<MCarrierDto> mCarrierList) {
        this._mCarrierList = mCarrierList;
    }

    protected List<MCarrierSlipSgwDto> _mCarrierSlipSgwList;

    public List<MCarrierSlipSgwDto> getMCarrierSlipSgwList() {
        if (_mCarrierSlipSgwList == null) { _mCarrierSlipSgwList = new ArrayList<MCarrierSlipSgwDto>(); }
        return _mCarrierSlipSgwList;
    }

    public void setMCarrierSlipSgwList(List<MCarrierSlipSgwDto> mCarrierSlipSgwList) {
        this._mCarrierSlipSgwList = mCarrierSlipSgwList;
    }

    protected List<MCarrierSlipYmtDto> _mCarrierSlipYmtList;

    public List<MCarrierSlipYmtDto> getMCarrierSlipYmtList() {
        if (_mCarrierSlipYmtList == null) { _mCarrierSlipYmtList = new ArrayList<MCarrierSlipYmtDto>(); }
        return _mCarrierSlipYmtList;
    }

    public void setMCarrierSlipYmtList(List<MCarrierSlipYmtDto> mCarrierSlipYmtList) {
        this._mCarrierSlipYmtList = mCarrierSlipYmtList;
    }

    protected List<MCarrierSlipYupkDto> _mCarrierSlipYupkList;

    public List<MCarrierSlipYupkDto> getMCarrierSlipYupkList() {
        if (_mCarrierSlipYupkList == null) { _mCarrierSlipYupkList = new ArrayList<MCarrierSlipYupkDto>(); }
        return _mCarrierSlipYupkList;
    }

    public void setMCarrierSlipYupkList(List<MCarrierSlipYupkDto> mCarrierSlipYupkList) {
        this._mCarrierSlipYupkList = mCarrierSlipYupkList;
    }

    protected List<MCblkDto> _mCblkList;

    public List<MCblkDto> getMCblkList() {
        if (_mCblkList == null) { _mCblkList = new ArrayList<MCblkDto>(); }
        return _mCblkList;
    }

    public void setMCblkList(List<MCblkDto> mCblkList) {
        this._mCblkList = mCblkList;
    }

    protected List<MCbrctgDto> _mCbrctgList;

    public List<MCbrctgDto> getMCbrctgList() {
        if (_mCbrctgList == null) { _mCbrctgList = new ArrayList<MCbrctgDto>(); }
        return _mCbrctgList;
    }

    public void setMCbrctgList(List<MCbrctgDto> mCbrctgList) {
        this._mCbrctgList = mCbrctgList;
    }

    protected List<MCdrcattDto> _mCdrcattList;

    public List<MCdrcattDto> getMCdrcattList() {
        if (_mCdrcattList == null) { _mCdrcattList = new ArrayList<MCdrcattDto>(); }
        return _mCdrcattList;
    }

    public void setMCdrcattList(List<MCdrcattDto> mCdrcattList) {
        this._mCdrcattList = mCdrcattList;
    }

    protected List<MCenterClassDto> _mCenterClassList;

    public List<MCenterClassDto> getMCenterClassList() {
        if (_mCenterClassList == null) { _mCenterClassList = new ArrayList<MCenterClassDto>(); }
        return _mCenterClassList;
    }

    public void setMCenterClassList(List<MCenterClassDto> mCenterClassList) {
        this._mCenterClassList = mCenterClassList;
    }

    protected List<MCenterColDto> _mCenterColList;

    public List<MCenterColDto> getMCenterColList() {
        if (_mCenterColList == null) { _mCenterColList = new ArrayList<MCenterColDto>(); }
        return _mCenterColList;
    }

    public void setMCenterColList(List<MCenterColDto> mCenterColList) {
        this._mCenterColList = mCenterColList;
    }

    protected List<MCenterCustomerDto> _mCenterCustomerList;

    public List<MCenterCustomerDto> getMCenterCustomerList() {
        if (_mCenterCustomerList == null) { _mCenterCustomerList = new ArrayList<MCenterCustomerDto>(); }
        return _mCenterCustomerList;
    }

    public void setMCenterCustomerList(List<MCenterCustomerDto> mCenterCustomerList) {
        this._mCenterCustomerList = mCenterCustomerList;
    }

    protected List<MCenterItemDto> _mCenterItemList;

    public List<MCenterItemDto> getMCenterItemList() {
        if (_mCenterItemList == null) { _mCenterItemList = new ArrayList<MCenterItemDto>(); }
        return _mCenterItemList;
    }

    public void setMCenterItemList(List<MCenterItemDto> mCenterItemList) {
        this._mCenterItemList = mCenterItemList;
    }

    protected List<MCenterScreenDto> _mCenterScreenList;

    public List<MCenterScreenDto> getMCenterScreenList() {
        if (_mCenterScreenList == null) { _mCenterScreenList = new ArrayList<MCenterScreenDto>(); }
        return _mCenterScreenList;
    }

    public void setMCenterScreenList(List<MCenterScreenDto> mCenterScreenList) {
        this._mCenterScreenList = mCenterScreenList;
    }

    protected List<MClientCenterDto> _mClientCenterList;

    public List<MClientCenterDto> getMClientCenterList() {
        if (_mClientCenterList == null) { _mClientCenterList = new ArrayList<MClientCenterDto>(); }
        return _mClientCenterList;
    }

    public void setMClientCenterList(List<MClientCenterDto> mClientCenterList) {
        this._mClientCenterList = mClientCenterList;
    }

    protected List<MClinDto> _mClinList;

    public List<MClinDto> getMClinList() {
        if (_mClinList == null) { _mClinList = new ArrayList<MClinDto>(); }
        return _mClinList;
    }

    public void setMClinList(List<MClinDto> mClinList) {
        this._mClinList = mClinList;
    }

    protected List<MCorgDto> _mCorgList;

    public List<MCorgDto> getMCorgList() {
        if (_mCorgList == null) { _mCorgList = new ArrayList<MCorgDto>(); }
        return _mCorgList;
    }

    public void setMCorgList(List<MCorgDto> mCorgList) {
        this._mCorgList = mCorgList;
    }

    protected List<MDeliveryCourseDto> _mDeliveryCourseList;

    public List<MDeliveryCourseDto> getMDeliveryCourseList() {
        if (_mDeliveryCourseList == null) { _mDeliveryCourseList = new ArrayList<MDeliveryCourseDto>(); }
        return _mDeliveryCourseList;
    }

    public void setMDeliveryCourseList(List<MDeliveryCourseDto> mDeliveryCourseList) {
        this._mDeliveryCourseList = mDeliveryCourseList;
    }

    protected List<MLocationDto> _mLocationList;

    public List<MLocationDto> getMLocationList() {
        if (_mLocationList == null) { _mLocationList = new ArrayList<MLocationDto>(); }
        return _mLocationList;
    }

    public void setMLocationList(List<MLocationDto> mLocationList) {
        this._mLocationList = mLocationList;
    }

    protected List<MMfinvoperationDto> _mMfinvoperationList;

    public List<MMfinvoperationDto> getMMfinvoperationList() {
        if (_mMfinvoperationList == null) { _mMfinvoperationList = new ArrayList<MMfinvoperationDto>(); }
        return _mMfinvoperationList;
    }

    public void setMMfinvoperationList(List<MMfinvoperationDto> mMfinvoperationList) {
        this._mMfinvoperationList = mMfinvoperationList;
    }

    protected List<MMfmonthchgDto> _mMfmonthchgList;

    public List<MMfmonthchgDto> getMMfmonthchgList() {
        if (_mMfmonthchgList == null) { _mMfmonthchgList = new ArrayList<MMfmonthchgDto>(); }
        return _mMfmonthchgList;
    }

    public void setMMfmonthchgList(List<MMfmonthchgDto> mMfmonthchgList) {
        this._mMfmonthchgList = mMfmonthchgList;
    }

    protected List<MMfstockitemDto> _mMfstockitemList;

    public List<MMfstockitemDto> getMMfstockitemList() {
        if (_mMfstockitemList == null) { _mMfstockitemList = new ArrayList<MMfstockitemDto>(); }
        return _mMfstockitemList;
    }

    public void setMMfstockitemList(List<MMfstockitemDto> mMfstockitemList) {
        this._mMfstockitemList = mMfstockitemList;
    }

    protected List<MMfwhstrctDto> _mMfwhstrctList;

    public List<MMfwhstrctDto> getMMfwhstrctList() {
        if (_mMfwhstrctList == null) { _mMfwhstrctList = new ArrayList<MMfwhstrctDto>(); }
        return _mMfwhstrctList;
    }

    public void setMMfwhstrctList(List<MMfwhstrctDto> mMfwhstrctList) {
        this._mMfwhstrctList = mMfwhstrctList;
    }

    protected List<MMfwhxitemDto> _mMfwhxitemList;

    public List<MMfwhxitemDto> getMMfwhxitemList() {
        if (_mMfwhxitemList == null) { _mMfwhxitemList = new ArrayList<MMfwhxitemDto>(); }
        return _mMfwhxitemList;
    }

    public void setMMfwhxitemList(List<MMfwhxitemDto> mMfwhxitemList) {
        this._mMfwhxitemList = mMfwhxitemList;
    }

    protected List<MNumberingCenterDto> _mNumberingCenterList;

    public List<MNumberingCenterDto> getMNumberingCenterList() {
        if (_mNumberingCenterList == null) { _mNumberingCenterList = new ArrayList<MNumberingCenterDto>(); }
        return _mNumberingCenterList;
    }

    public void setMNumberingCenterList(List<MNumberingCenterDto> mNumberingCenterList) {
        this._mNumberingCenterList = mNumberingCenterList;
    }

    protected List<MUserCenterDto> _mUserCenterList;

    public List<MUserCenterDto> getMUserCenterList() {
        if (_mUserCenterList == null) { _mUserCenterList = new ArrayList<MUserCenterDto>(); }
        return _mUserCenterList;
    }

    public void setMUserCenterList(List<MUserCenterDto> mUserCenterList) {
        this._mUserCenterList = mUserCenterList;
    }

    protected List<MUserLoginDto> _mUserLoginList;

    public List<MUserLoginDto> getMUserLoginList() {
        if (_mUserLoginList == null) { _mUserLoginList = new ArrayList<MUserLoginDto>(); }
        return _mUserLoginList;
    }

    public void setMUserLoginList(List<MUserLoginDto> mUserLoginList) {
        this._mUserLoginList = mUserLoginList;
    }

    protected List<MWarehouseDto> _mWarehouseList;

    public List<MWarehouseDto> getMWarehouseList() {
        if (_mWarehouseList == null) { _mWarehouseList = new ArrayList<MWarehouseDto>(); }
        return _mWarehouseList;
    }

    public void setMWarehouseList(List<MWarehouseDto> mWarehouseList) {
        this._mWarehouseList = mWarehouseList;
    }

    protected List<MWebHtInfoDto> _mWebHtInfoList;

    public List<MWebHtInfoDto> getMWebHtInfoList() {
        if (_mWebHtInfoList == null) { _mWebHtInfoList = new ArrayList<MWebHtInfoDto>(); }
        return _mWebHtInfoList;
    }

    public void setMWebHtInfoList(List<MWebHtInfoDto> mWebHtInfoList) {
        this._mWebHtInfoList = mWebHtInfoList;
    }

    protected List<TAllocInstHDto> _tAllocInstHList;

    public List<TAllocInstHDto> getTAllocInstHList() {
        if (_tAllocInstHList == null) { _tAllocInstHList = new ArrayList<TAllocInstHDto>(); }
        return _tAllocInstHList;
    }

    public void setTAllocInstHList(List<TAllocInstHDto> tAllocInstHList) {
        this._tAllocInstHList = tAllocInstHList;
    }

    protected List<TCcopamDto> _tCcopamList;

    public List<TCcopamDto> getTCcopamList() {
        if (_tCcopamList == null) { _tCcopamList = new ArrayList<TCcopamDto>(); }
        return _tCcopamList;
    }

    public void setTCcopamList(List<TCcopamDto> tCcopamList) {
        this._tCcopamList = tCcopamList;
    }

    protected List<TCenterSymbolDto> _tCenterSymbolList;

    public List<TCenterSymbolDto> getTCenterSymbolList() {
        if (_tCenterSymbolList == null) { _tCenterSymbolList = new ArrayList<TCenterSymbolDto>(); }
        return _tCenterSymbolList;
    }

    public void setTCenterSymbolList(List<TCenterSymbolDto> tCenterSymbolList) {
        this._tCenterSymbolList = tCenterSymbolList;
    }

    protected List<TCordhdrDto> _tCordhdrList;

    public List<TCordhdrDto> getTCordhdrList() {
        if (_tCordhdrList == null) { _tCordhdrList = new ArrayList<TCordhdrDto>(); }
        return _tCordhdrList;
    }

    public void setTCordhdrList(List<TCordhdrDto> tCordhdrList) {
        this._tCordhdrList = tCordhdrList;
    }

    protected List<TCsrwhadmDto> _tCsrwhadmList;

    public List<TCsrwhadmDto> getTCsrwhadmList() {
        if (_tCsrwhadmList == null) { _tCsrwhadmList = new ArrayList<TCsrwhadmDto>(); }
        return _tCsrwhadmList;
    }

    public void setTCsrwhadmList(List<TCsrwhadmDto> tCsrwhadmList) {
        this._tCsrwhadmList = tCsrwhadmList;
    }

    protected List<TEcOrderHDto> _tEcOrderHList;

    public List<TEcOrderHDto> getTEcOrderHList() {
        if (_tEcOrderHList == null) { _tEcOrderHList = new ArrayList<TEcOrderHDto>(); }
        return _tEcOrderHList;
    }

    public void setTEcOrderHList(List<TEcOrderHDto> tEcOrderHList) {
        this._tEcOrderHList = tEcOrderHList;
    }

    protected List<TInventoryHDto> _tInventoryHList;

    public List<TInventoryHDto> getTInventoryHList() {
        if (_tInventoryHList == null) { _tInventoryHList = new ArrayList<TInventoryHDto>(); }
        return _tInventoryHList;
    }

    public void setTInventoryHList(List<TInventoryHDto> tInventoryHList) {
        this._tInventoryHList = tInventoryHList;
    }

    protected List<TMflastshiplotDto> _tMflastshiplotList;

    public List<TMflastshiplotDto> getTMflastshiplotList() {
        if (_tMflastshiplotList == null) { _tMflastshiplotList = new ArrayList<TMflastshiplotDto>(); }
        return _tMflastshiplotList;
    }

    public void setTMflastshiplotList(List<TMflastshiplotDto> tMflastshiplotList) {
        this._tMflastshiplotList = tMflastshiplotList;
    }

    protected List<TMoveInstHDto> _tMoveInstHList;

    public List<TMoveInstHDto> getTMoveInstHList() {
        if (_tMoveInstHList == null) { _tMoveInstHList = new ArrayList<TMoveInstHDto>(); }
        return _tMoveInstHList;
    }

    public void setTMoveInstHList(List<TMoveInstHDto> tMoveInstHList) {
        this._tMoveInstHList = tMoveInstHList;
    }

    protected List<TPackingHDto> _tPackingHList;

    public List<TPackingHDto> getTPackingHList() {
        if (_tPackingHList == null) { _tPackingHList = new ArrayList<TPackingHDto>(); }
        return _tPackingHList;
    }

    public void setTPackingHList(List<TPackingHDto> tPackingHList) {
        this._tPackingHList = tPackingHList;
    }

    protected List<TPalletDto> _tPalletList;

    public List<TPalletDto> getTPalletList() {
        if (_tPalletList == null) { _tPalletList = new ArrayList<TPalletDto>(); }
        return _tPalletList;
    }

    public void setTPalletList(List<TPalletDto> tPalletList) {
        this._tPalletList = tPalletList;
    }

    protected List<TPickingHDto> _tPickingHList;

    public List<TPickingHDto> getTPickingHList() {
        if (_tPickingHList == null) { _tPickingHList = new ArrayList<TPickingHDto>(); }
        return _tPickingHList;
    }

    public void setTPickingHList(List<TPickingHDto> tPickingHList) {
        this._tPickingHList = tPickingHList;
    }

    protected List<TPicMthdRcmdDto> _tPicMthdRcmdList;

    public List<TPicMthdRcmdDto> getTPicMthdRcmdList() {
        if (_tPicMthdRcmdList == null) { _tPicMthdRcmdList = new ArrayList<TPicMthdRcmdDto>(); }
        return _tPicMthdRcmdList;
    }

    public void setTPicMthdRcmdList(List<TPicMthdRcmdDto> tPicMthdRcmdList) {
        this._tPicMthdRcmdList = tPicMthdRcmdList;
    }

    protected List<TReceivePlanHDto> _tReceivePlanHList;

    public List<TReceivePlanHDto> getTReceivePlanHList() {
        if (_tReceivePlanHList == null) { _tReceivePlanHList = new ArrayList<TReceivePlanHDto>(); }
        return _tReceivePlanHList;
    }

    public void setTReceivePlanHList(List<TReceivePlanHDto> tReceivePlanHList) {
        this._tReceivePlanHList = tReceivePlanHList;
    }

    protected List<TSerialNoDto> _tSerialNoList;

    public List<TSerialNoDto> getTSerialNoList() {
        if (_tSerialNoList == null) { _tSerialNoList = new ArrayList<TSerialNoDto>(); }
        return _tSerialNoList;
    }

    public void setTSerialNoList(List<TSerialNoDto> tSerialNoList) {
        this._tSerialNoList = tSerialNoList;
    }

    protected List<TShippingInstHDto> _tShippingInstHList;

    public List<TShippingInstHDto> getTShippingInstHList() {
        if (_tShippingInstHList == null) { _tShippingInstHList = new ArrayList<TShippingInstHDto>(); }
        return _tShippingInstHList;
    }

    public void setTShippingInstHList(List<TShippingInstHDto> tShippingInstHList) {
        this._tShippingInstHList = tShippingInstHList;
    }

    protected List<TSplinfoDto> _tSplinfoList;

    public List<TSplinfoDto> getTSplinfoList() {
        if (_tSplinfoList == null) { _tSplinfoList = new ArrayList<TSplinfoDto>(); }
        return _tSplinfoList;
    }

    public void setTSplinfoList(List<TSplinfoDto> tSplinfoList) {
        this._tSplinfoList = tSplinfoList;
    }

    protected List<TStoreRecordHDto> _tStoreRecordHList;

    public List<TStoreRecordHDto> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = new ArrayList<TStoreRecordHDto>(); }
        return _tStoreRecordHList;
    }

    public void setTStoreRecordHList(List<TStoreRecordHDto> tStoreRecordHList) {
        this._tStoreRecordHList = tStoreRecordHList;
    }

    protected List<TTrallinvDto> _tTrallinvList;

    public List<TTrallinvDto> getTTrallinvList() {
        if (_tTrallinvList == null) { _tTrallinvList = new ArrayList<TTrallinvDto>(); }
        return _tTrallinvList;
    }

    public void setTTrallinvList(List<TTrallinvDto> tTrallinvList) {
        this._tTrallinvList = tTrallinvList;
    }

    protected List<TTrallinvhistoryDto> _tTrallinvhistoryList;

    public List<TTrallinvhistoryDto> getTTrallinvhistoryList() {
        if (_tTrallinvhistoryList == null) { _tTrallinvhistoryList = new ArrayList<TTrallinvhistoryDto>(); }
        return _tTrallinvhistoryList;
    }

    public void setTTrallinvhistoryList(List<TTrallinvhistoryDto> tTrallinvhistoryList) {
        this._tTrallinvhistoryList = tTrallinvhistoryList;
    }

    protected List<TTrcaseinventoryDto> _tTrcaseinventoryList;

    public List<TTrcaseinventoryDto> getTTrcaseinventoryList() {
        if (_tTrcaseinventoryList == null) { _tTrcaseinventoryList = new ArrayList<TTrcaseinventoryDto>(); }
        return _tTrcaseinventoryList;
    }

    public void setTTrcaseinventoryList(List<TTrcaseinventoryDto> tTrcaseinventoryList) {
        this._tTrcaseinventoryList = tTrcaseinventoryList;
    }

    protected List<TTrcasenumDto> _tTrcasenumList;

    public List<TTrcasenumDto> getTTrcasenumList() {
        if (_tTrcasenumList == null) { _tTrcasenumList = new ArrayList<TTrcasenumDto>(); }
        return _tTrcasenumList;
    }

    public void setTTrcasenumList(List<TTrcasenumDto> tTrcasenumList) {
        this._tTrcasenumList = tTrcasenumList;
    }

    protected List<TTrcasestockDto> _tTrcasestockList;

    public List<TTrcasestockDto> getTTrcasestockList() {
        if (_tTrcasestockList == null) { _tTrcasestockList = new ArrayList<TTrcasestockDto>(); }
        return _tTrcasestockList;
    }

    public void setTTrcasestockList(List<TTrcasestockDto> tTrcasestockList) {
        this._tTrcasestockList = tTrcasestockList;
    }

    protected List<TTrhanbaiinvDto> _tTrhanbaiinvList;

    public List<TTrhanbaiinvDto> getTTrhanbaiinvList() {
        if (_tTrhanbaiinvList == null) { _tTrhanbaiinvList = new ArrayList<TTrhanbaiinvDto>(); }
        return _tTrhanbaiinvList;
    }

    public void setTTrhanbaiinvList(List<TTrhanbaiinvDto> tTrhanbaiinvList) {
        this._tTrhanbaiinvList = tTrhanbaiinvList;
    }

    protected List<TTrinvcheckinfoDto> _tTrinvcheckinfoList;

    public List<TTrinvcheckinfoDto> getTTrinvcheckinfoList() {
        if (_tTrinvcheckinfoList == null) { _tTrinvcheckinfoList = new ArrayList<TTrinvcheckinfoDto>(); }
        return _tTrinvcheckinfoList;
    }

    public void setTTrinvcheckinfoList(List<TTrinvcheckinfoDto> tTrinvcheckinfoList) {
        this._tTrinvcheckinfoList = tTrinvcheckinfoList;
    }

    protected List<TTrinvcorrectDto> _tTrinvcorrectList;

    public List<TTrinvcorrectDto> getTTrinvcorrectList() {
        if (_tTrinvcorrectList == null) { _tTrinvcorrectList = new ArrayList<TTrinvcorrectDto>(); }
        return _tTrinvcorrectList;
    }

    public void setTTrinvcorrectList(List<TTrinvcorrectDto> tTrinvcorrectList) {
        this._tTrinvcorrectList = tTrinvcorrectList;
    }

    protected List<TTrinvreanswerDto> _tTrinvreanswerList;

    public List<TTrinvreanswerDto> getTTrinvreanswerList() {
        if (_tTrinvreanswerList == null) { _tTrinvreanswerList = new ArrayList<TTrinvreanswerDto>(); }
        return _tTrinvreanswerList;
    }

    public void setTTrinvreanswerList(List<TTrinvreanswerDto> tTrinvreanswerList) {
        this._tTrinvreanswerList = tTrinvreanswerList;
    }

    protected List<TTrinvrequestDto> _tTrinvrequestList;

    public List<TTrinvrequestDto> getTTrinvrequestList() {
        if (_tTrinvrequestList == null) { _tTrinvrequestList = new ArrayList<TTrinvrequestDto>(); }
        return _tTrinvrequestList;
    }

    public void setTTrinvrequestList(List<TTrinvrequestDto> tTrinvrequestList) {
        this._tTrinvrequestList = tTrinvrequestList;
    }

    protected List<TTritemconvresultDto> _tTritemconvresultList;

    public List<TTritemconvresultDto> getTTritemconvresultList() {
        if (_tTritemconvresultList == null) { _tTritemconvresultList = new ArrayList<TTritemconvresultDto>(); }
        return _tTritemconvresultList;
    }

    public void setTTritemconvresultList(List<TTritemconvresultDto> tTritemconvresultList) {
        this._tTritemconvresultList = tTritemconvresultList;
    }

    protected List<TTrjukyuinvDto> _tTrjukyuinvList;

    public List<TTrjukyuinvDto> getTTrjukyuinvList() {
        if (_tTrjukyuinvList == null) { _tTrjukyuinvList = new ArrayList<TTrjukyuinvDto>(); }
        return _tTrjukyuinvList;
    }

    public void setTTrjukyuinvList(List<TTrjukyuinvDto> tTrjukyuinvList) {
        this._tTrjukyuinvList = tTrjukyuinvList;
    }

    protected List<TTrmanufacturedateDto> _tTrmanufacturedateList;

    public List<TTrmanufacturedateDto> getTTrmanufacturedateList() {
        if (_tTrmanufacturedateList == null) { _tTrmanufacturedateList = new ArrayList<TTrmanufacturedateDto>(); }
        return _tTrmanufacturedateList;
    }

    public void setTTrmanufacturedateList(List<TTrmanufacturedateDto> tTrmanufacturedateList) {
        this._tTrmanufacturedateList = tTrmanufacturedateList;
    }

    protected List<TTrmanufacturedatedetailDto> _tTrmanufacturedatedetailList;

    public List<TTrmanufacturedatedetailDto> getTTrmanufacturedatedetailList() {
        if (_tTrmanufacturedatedetailList == null) { _tTrmanufacturedatedetailList = new ArrayList<TTrmanufacturedatedetailDto>(); }
        return _tTrmanufacturedatedetailList;
    }

    public void setTTrmanufacturedatedetailList(List<TTrmanufacturedatedetailDto> tTrmanufacturedatedetailList) {
        this._tTrmanufacturedatedetailList = tTrmanufacturedatedetailList;
    }

    protected List<TTrmanufacturedatehistoryDto> _tTrmanufacturedatehistoryList;

    public List<TTrmanufacturedatehistoryDto> getTTrmanufacturedatehistoryList() {
        if (_tTrmanufacturedatehistoryList == null) { _tTrmanufacturedatehistoryList = new ArrayList<TTrmanufacturedatehistoryDto>(); }
        return _tTrmanufacturedatehistoryList;
    }

    public void setTTrmanufacturedatehistoryList(List<TTrmanufacturedatehistoryDto> tTrmanufacturedatehistoryList) {
        this._tTrmanufacturedatehistoryList = tTrmanufacturedatehistoryList;
    }

    protected List<TTrpallettraceDto> _tTrpallettraceList;

    public List<TTrpallettraceDto> getTTrpallettraceList() {
        if (_tTrpallettraceList == null) { _tTrpallettraceList = new ArrayList<TTrpallettraceDto>(); }
        return _tTrpallettraceList;
    }

    public void setTTrpallettraceList(List<TTrpallettraceDto> tTrpallettraceList) {
        this._tTrpallettraceList = tTrpallettraceList;
    }

    protected List<TTrreversestockDto> _tTrreversestockList;

    public List<TTrreversestockDto> getTTrreversestockList() {
        if (_tTrreversestockList == null) { _tTrreversestockList = new ArrayList<TTrreversestockDto>(); }
        return _tTrreversestockList;
    }

    public void setTTrreversestockList(List<TTrreversestockDto> tTrreversestockList) {
        this._tTrreversestockList = tTrreversestockList;
    }

    protected List<TTrstockdiffhistoryDto> _tTrstockdiffhistoryList;

    public List<TTrstockdiffhistoryDto> getTTrstockdiffhistoryList() {
        if (_tTrstockdiffhistoryList == null) { _tTrstockdiffhistoryList = new ArrayList<TTrstockdiffhistoryDto>(); }
        return _tTrstockdiffhistoryList;
    }

    public void setTTrstockdiffhistoryList(List<TTrstockdiffhistoryDto> tTrstockdiffhistoryList) {
        this._tTrstockdiffhistoryList = tTrstockdiffhistoryList;
    }

    protected List<TTrsymboltraceDto> _tTrsymboltraceList;

    public List<TTrsymboltraceDto> getTTrsymboltraceList() {
        if (_tTrsymboltraceList == null) { _tTrsymboltraceList = new ArrayList<TTrsymboltraceDto>(); }
        return _tTrsymboltraceList;
    }

    public void setTTrsymboltraceList(List<TTrsymboltraceDto> tTrsymboltraceList) {
        this._tTrsymboltraceList = tTrsymboltraceList;
    }

    protected List<TTrsymboltraceextendDto> _tTrsymboltraceextendList;

    public List<TTrsymboltraceextendDto> getTTrsymboltraceextendList() {
        if (_tTrsymboltraceextendList == null) { _tTrsymboltraceextendList = new ArrayList<TTrsymboltraceextendDto>(); }
        return _tTrsymboltraceextendList;
    }

    public void setTTrsymboltraceextendList(List<TTrsymboltraceextendDto> tTrsymboltraceextendList) {
        this._tTrsymboltraceextendList = tTrsymboltraceextendList;
    }

    protected List<TTrtraceDto> _tTrtraceList;

    public List<TTrtraceDto> getTTrtraceList() {
        if (_tTrtraceList == null) { _tTrtraceList = new ArrayList<TTrtraceDto>(); }
        return _tTrtraceList;
    }

    public void setTTrtraceList(List<TTrtraceDto> tTrtraceList) {
        this._tTrtraceList = tTrtraceList;
    }

    protected List<TYtrsoDto> _tYtrsoList;

    public List<TYtrsoDto> getTYtrsoList() {
        if (_tYtrsoList == null) { _tYtrsoList = new ArrayList<TYtrsoDto>(); }
        return _tYtrsoList;
    }

    public void setTYtrsoList(List<TYtrsoDto> tYtrsoList) {
        this._tYtrsoList = tYtrsoList;
    }

    protected List<WHtInventoryInputProdDto> _wHtInventoryInputProdList;

    public List<WHtInventoryInputProdDto> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = new ArrayList<WHtInventoryInputProdDto>(); }
        return _wHtInventoryInputProdList;
    }

    public void setWHtInventoryInputProdList(List<WHtInventoryInputProdDto> wHtInventoryInputProdList) {
        this._wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    protected List<WHtLoadingDto> _wHtLoadingList;

    public List<WHtLoadingDto> getWHtLoadingList() {
        if (_wHtLoadingList == null) { _wHtLoadingList = new ArrayList<WHtLoadingDto>(); }
        return _wHtLoadingList;
    }

    public void setWHtLoadingList(List<WHtLoadingDto> wHtLoadingList) {
        this._wHtLoadingList = wHtLoadingList;
    }

    protected List<WHtReceiveInspectionDto> _wHtReceiveInspectionList;

    public List<WHtReceiveInspectionDto> getWHtReceiveInspectionList() {
        if (_wHtReceiveInspectionList == null) { _wHtReceiveInspectionList = new ArrayList<WHtReceiveInspectionDto>(); }
        return _wHtReceiveInspectionList;
    }

    public void setWHtReceiveInspectionList(List<WHtReceiveInspectionDto> wHtReceiveInspectionList) {
        this._wHtReceiveInspectionList = wHtReceiveInspectionList;
    }

    protected List<WHtReceiveNoPlanInspDto> _wHtReceiveNoPlanInspList;

    public List<WHtReceiveNoPlanInspDto> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = new ArrayList<WHtReceiveNoPlanInspDto>(); }
        return _wHtReceiveNoPlanInspList;
    }

    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInspDto> wHtReceiveNoPlanInspList) {
        this._wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    protected List<WHtReceiveStoreDto> _wHtReceiveStoreList;

    public List<WHtReceiveStoreDto> getWHtReceiveStoreList() {
        if (_wHtReceiveStoreList == null) { _wHtReceiveStoreList = new ArrayList<WHtReceiveStoreDto>(); }
        return _wHtReceiveStoreList;
    }

    public void setWHtReceiveStoreList(List<WHtReceiveStoreDto> wHtReceiveStoreList) {
        this._wHtReceiveStoreList = wHtReceiveStoreList;
    }

    protected List<WHtSerialReceiveInspDto> _wHtSerialReceiveInspList;

    public List<WHtSerialReceiveInspDto> getWHtSerialReceiveInspList() {
        if (_wHtSerialReceiveInspList == null) { _wHtSerialReceiveInspList = new ArrayList<WHtSerialReceiveInspDto>(); }
        return _wHtSerialReceiveInspList;
    }

    public void setWHtSerialReceiveInspList(List<WHtSerialReceiveInspDto> wHtSerialReceiveInspList) {
        this._wHtSerialReceiveInspList = wHtSerialReceiveInspList;
    }

    protected List<WHtSerialShippingInspDto> _wHtSerialShippingInspList;

    public List<WHtSerialShippingInspDto> getWHtSerialShippingInspList() {
        if (_wHtSerialShippingInspList == null) { _wHtSerialShippingInspList = new ArrayList<WHtSerialShippingInspDto>(); }
        return _wHtSerialShippingInspList;
    }

    public void setWHtSerialShippingInspList(List<WHtSerialShippingInspDto> wHtSerialShippingInspList) {
        this._wHtSerialShippingInspList = wHtSerialShippingInspList;
    }

    protected List<WHtShippingDto> _wHtShippingList;

    public List<WHtShippingDto> getWHtShippingList() {
        if (_wHtShippingList == null) { _wHtShippingList = new ArrayList<WHtShippingDto>(); }
        return _wHtShippingList;
    }

    public void setWHtShippingList(List<WHtShippingDto> wHtShippingList) {
        this._wHtShippingList = wHtShippingList;
    }

    protected List<WHtShippingPickingDto> _wHtShippingPickingList;

    public List<WHtShippingPickingDto> getWHtShippingPickingList() {
        if (_wHtShippingPickingList == null) { _wHtShippingPickingList = new ArrayList<WHtShippingPickingDto>(); }
        return _wHtShippingPickingList;
    }

    public void setWHtShippingPickingList(List<WHtShippingPickingDto> wHtShippingPickingList) {
        this._wHtShippingPickingList = wHtShippingPickingList;
    }

    protected List<WSglRowShipInspHDto> _wSglRowShipInspHList;

    public List<WSglRowShipInspHDto> getWSglRowShipInspHList() {
        if (_wSglRowShipInspHList == null) { _wSglRowShipInspHList = new ArrayList<WSglRowShipInspHDto>(); }
        return _wSglRowShipInspHList;
    }

    public void setWSglRowShipInspHList(List<WSglRowShipInspHDto> wSglRowShipInspHList) {
        this._wSglRowShipInspHList = wSglRowShipInspHList;
    }

    protected List<WShippingInterruptDto> _wShippingInterruptList;

    public List<WShippingInterruptDto> getWShippingInterruptList() {
        if (_wShippingInterruptList == null) { _wShippingInterruptList = new ArrayList<WShippingInterruptDto>(); }
        return _wShippingInterruptList;
    }

    public void setWShippingInterruptList(List<WShippingInterruptDto> wShippingInterruptList) {
        this._wShippingInterruptList = wShippingInterruptList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCenterDto)) { return false; }
        final BsMCenterDto otherEntity = (BsMCenterDto)other;
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CENTER");
        result = xCH(result, getCenterId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getCenterAbbr());
        sb.append(c).append(getCultureId());
        sb.append(c).append(getTimeZoneId());
        sb.append(c).append(getWarehousegroup());
        sb.append(c).append(getVirtualwhouseflg());
        sb.append(c).append(getAname());
        sb.append(c).append(getAddress1());
        sb.append(c).append(getAddress2());
        sb.append(c).append(getAddress3());
        sb.append(c).append(getPostno());
        sb.append(c).append(getCountrycd());
        sb.append(c).append(getPortcd());
        sb.append(c).append(getDistrictcd());
        sb.append(c).append(getPhone1());
        sb.append(c).append(getPhone2());
        sb.append(c).append(getFax1());
        sb.append(c).append(getFax2());
        sb.append(c).append(getWarehouseflg());
        sb.append(c).append(getRefname());
        sb.append(c).append(getSubcontractflg());
        sb.append(c).append(getWeightcapacity());
        sb.append(c).append(getCapacity());
        sb.append(c).append(getHulftId());
        sb.append(c).append(getWarehousecls());
        sb.append(c).append(getCmlrasid());
        sb.append(c).append(getOwnOrAnotherFlg());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CENTER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {UQ, NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {UQ, NotNull, varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {NotNull, varchar(60)} <br>
     * 拠点名称
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {NotNull, varchar(60)} <br>
     * 拠点名称
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] CENTER_ABBR: {varchar(60)} <br>
     * 拠点略称
     * @return The value of the column 'CENTER_ABBR'. (NullAllowed)
     */
    public String getCenterAbbr() {
        return _centerAbbr;
    }

    /**
     * [set] CENTER_ABBR: {varchar(60)} <br>
     * 拠点略称
     * @param centerAbbr The value of the column 'CENTER_ABBR'. (NullAllowed)
     */
    public void setCenterAbbr(String centerAbbr) {
        __modifiedProperties.add("centerAbbr");
        this._centerAbbr = centerAbbr;
    }

    /**
     * [get] CULTURE_ID: {IX, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (NullAllowed)
     */
    public Long getCultureId() {
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {IX, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (NullAllowed)
     */
    public void setCultureId(Long cultureId) {
        __modifiedProperties.add("cultureId");
        this._cultureId = cultureId;
    }

    /**
     * [get] TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE} <br>
     * タイムゾーンID
     * @return The value of the column 'TIME_ZONE_ID'. (NullAllowed)
     */
    public Long getTimeZoneId() {
        return _timeZoneId;
    }

    /**
     * [set] TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE} <br>
     * タイムゾーンID
     * @param timeZoneId The value of the column 'TIME_ZONE_ID'. (NullAllowed)
     */
    public void setTimeZoneId(Long timeZoneId) {
        __modifiedProperties.add("timeZoneId");
        this._timeZoneId = timeZoneId;
    }

    /**
     * [get] WarehouseGroup: {varchar(255)} <br>
     * 拠点グループ
     * @return The value of the column 'WarehouseGroup'. (NullAllowed)
     */
    public String getWarehousegroup() {
        return _warehousegroup;
    }

    /**
     * [set] WarehouseGroup: {varchar(255)} <br>
     * 拠点グループ
     * @param warehousegroup The value of the column 'WarehouseGroup'. (NullAllowed)
     */
    public void setWarehousegroup(String warehousegroup) {
        __modifiedProperties.add("warehousegroup");
        this._warehousegroup = warehousegroup;
    }

    /**
     * [get] VirtualWhouseFlg: {char(1)} <br>
     * 論理拠点フラグ
     * @return The value of the column 'VirtualWhouseFlg'. (NullAllowed)
     */
    public String getVirtualwhouseflg() {
        return _virtualwhouseflg;
    }

    /**
     * [set] VirtualWhouseFlg: {char(1)} <br>
     * 論理拠点フラグ
     * @param virtualwhouseflg The value of the column 'VirtualWhouseFlg'. (NullAllowed)
     */
    public void setVirtualwhouseflg(String virtualwhouseflg) {
        __modifiedProperties.add("virtualwhouseflg");
        this._virtualwhouseflg = virtualwhouseflg;
    }

    /**
     * [get] Aname: {varchar(255)} <br>
     * 検索名称
     * @return The value of the column 'Aname'. (NullAllowed)
     */
    public String getAname() {
        return _aname;
    }

    /**
     * [set] Aname: {varchar(255)} <br>
     * 検索名称
     * @param aname The value of the column 'Aname'. (NullAllowed)
     */
    public void setAname(String aname) {
        __modifiedProperties.add("aname");
        this._aname = aname;
    }

    /**
     * [get] Address1: {varchar(255)} <br>
     * 住所１
     * @return The value of the column 'Address1'. (NullAllowed)
     */
    public String getAddress1() {
        return _address1;
    }

    /**
     * [set] Address1: {varchar(255)} <br>
     * 住所１
     * @param address1 The value of the column 'Address1'. (NullAllowed)
     */
    public void setAddress1(String address1) {
        __modifiedProperties.add("address1");
        this._address1 = address1;
    }

    /**
     * [get] Address2: {varchar(255)} <br>
     * 住所２
     * @return The value of the column 'Address2'. (NullAllowed)
     */
    public String getAddress2() {
        return _address2;
    }

    /**
     * [set] Address2: {varchar(255)} <br>
     * 住所２
     * @param address2 The value of the column 'Address2'. (NullAllowed)
     */
    public void setAddress2(String address2) {
        __modifiedProperties.add("address2");
        this._address2 = address2;
    }

    /**
     * [get] Address3: {varchar(255)} <br>
     * 住所３
     * @return The value of the column 'Address3'. (NullAllowed)
     */
    public String getAddress3() {
        return _address3;
    }

    /**
     * [set] Address3: {varchar(255)} <br>
     * 住所３
     * @param address3 The value of the column 'Address3'. (NullAllowed)
     */
    public void setAddress3(String address3) {
        __modifiedProperties.add("address3");
        this._address3 = address3;
    }

    /**
     * [get] PostNo: {varchar(255)} <br>
     * 郵便番号
     * @return The value of the column 'PostNo'. (NullAllowed)
     */
    public String getPostno() {
        return _postno;
    }

    /**
     * [set] PostNo: {varchar(255)} <br>
     * 郵便番号
     * @param postno The value of the column 'PostNo'. (NullAllowed)
     */
    public void setPostno(String postno) {
        __modifiedProperties.add("postno");
        this._postno = postno;
    }

    /**
     * [get] CountryCd: {varchar(255)} <br>
     * 国CD
     * @return The value of the column 'CountryCd'. (NullAllowed)
     */
    public String getCountrycd() {
        return _countrycd;
    }

    /**
     * [set] CountryCd: {varchar(255)} <br>
     * 国CD
     * @param countrycd The value of the column 'CountryCd'. (NullAllowed)
     */
    public void setCountrycd(String countrycd) {
        __modifiedProperties.add("countrycd");
        this._countrycd = countrycd;
    }

    /**
     * [get] PortCd: {varchar(255)} <br>
     * 入出港CD
     * @return The value of the column 'PortCd'. (NullAllowed)
     */
    public String getPortcd() {
        return _portcd;
    }

    /**
     * [set] PortCd: {varchar(255)} <br>
     * 入出港CD
     * @param portcd The value of the column 'PortCd'. (NullAllowed)
     */
    public void setPortcd(String portcd) {
        __modifiedProperties.add("portcd");
        this._portcd = portcd;
    }

    /**
     * [get] DistrictCd: {varchar(255)} <br>
     * スキーマ名称
     * @return The value of the column 'DistrictCd'. (NullAllowed)
     */
    public String getDistrictcd() {
        return _districtcd;
    }

    /**
     * [set] DistrictCd: {varchar(255)} <br>
     * スキーマ名称
     * @param districtcd The value of the column 'DistrictCd'. (NullAllowed)
     */
    public void setDistrictcd(String districtcd) {
        __modifiedProperties.add("districtcd");
        this._districtcd = districtcd;
    }

    /**
     * [get] Phone1: {varchar(255)} <br>
     * 電話番号１
     * @return The value of the column 'Phone1'. (NullAllowed)
     */
    public String getPhone1() {
        return _phone1;
    }

    /**
     * [set] Phone1: {varchar(255)} <br>
     * 電話番号１
     * @param phone1 The value of the column 'Phone1'. (NullAllowed)
     */
    public void setPhone1(String phone1) {
        __modifiedProperties.add("phone1");
        this._phone1 = phone1;
    }

    /**
     * [get] Phone2: {varchar(255)} <br>
     * 電話番号２
     * @return The value of the column 'Phone2'. (NullAllowed)
     */
    public String getPhone2() {
        return _phone2;
    }

    /**
     * [set] Phone2: {varchar(255)} <br>
     * 電話番号２
     * @param phone2 The value of the column 'Phone2'. (NullAllowed)
     */
    public void setPhone2(String phone2) {
        __modifiedProperties.add("phone2");
        this._phone2 = phone2;
    }

    /**
     * [get] Fax1: {varchar(255)} <br>
     * FAX番号１
     * @return The value of the column 'Fax1'. (NullAllowed)
     */
    public String getFax1() {
        return _fax1;
    }

    /**
     * [set] Fax1: {varchar(255)} <br>
     * FAX番号１
     * @param fax1 The value of the column 'Fax1'. (NullAllowed)
     */
    public void setFax1(String fax1) {
        __modifiedProperties.add("fax1");
        this._fax1 = fax1;
    }

    /**
     * [get] Fax2: {varchar(255)} <br>
     * FAX番号２
     * @return The value of the column 'Fax2'. (NullAllowed)
     */
    public String getFax2() {
        return _fax2;
    }

    /**
     * [set] Fax2: {varchar(255)} <br>
     * FAX番号２
     * @param fax2 The value of the column 'Fax2'. (NullAllowed)
     */
    public void setFax2(String fax2) {
        __modifiedProperties.add("fax2");
        this._fax2 = fax2;
    }

    /**
     * [get] WarehouseFlg: {char(1)} <br>
     * 倉庫識別
     * @return The value of the column 'WarehouseFlg'. (NullAllowed)
     */
    public String getWarehouseflg() {
        return _warehouseflg;
    }

    /**
     * [set] WarehouseFlg: {char(1)} <br>
     * 倉庫識別
     * @param warehouseflg The value of the column 'WarehouseFlg'. (NullAllowed)
     */
    public void setWarehouseflg(String warehouseflg) {
        __modifiedProperties.add("warehouseflg");
        this._warehouseflg = warehouseflg;
    }

    /**
     * [get] RefName: {varchar(255)} <br>
     * 融通輸送倉庫CD
     * @return The value of the column 'RefName'. (NullAllowed)
     */
    public String getRefname() {
        return _refname;
    }

    /**
     * [set] RefName: {varchar(255)} <br>
     * 融通輸送倉庫CD
     * @param refname The value of the column 'RefName'. (NullAllowed)
     */
    public void setRefname(String refname) {
        __modifiedProperties.add("refname");
        this._refname = refname;
    }

    /**
     * [get] SubcontractFlg: {decimal(16, 6)} <br>
     * 外部倉庫フラグ
     * @return The value of the column 'SubcontractFlg'. (NullAllowed)
     */
    public java.math.BigDecimal getSubcontractflg() {
        return _subcontractflg;
    }

    /**
     * [set] SubcontractFlg: {decimal(16, 6)} <br>
     * 外部倉庫フラグ
     * @param subcontractflg The value of the column 'SubcontractFlg'. (NullAllowed)
     */
    public void setSubcontractflg(java.math.BigDecimal subcontractflg) {
        __modifiedProperties.add("subcontractflg");
        this._subcontractflg = subcontractflg;
    }

    /**
     * [get] WeightCapacity: {decimal(16, 6)} <br>
     * 許容重量
     * @return The value of the column 'WeightCapacity'. (NullAllowed)
     */
    public java.math.BigDecimal getWeightcapacity() {
        return _weightcapacity;
    }

    /**
     * [set] WeightCapacity: {decimal(16, 6)} <br>
     * 許容重量
     * @param weightcapacity The value of the column 'WeightCapacity'. (NullAllowed)
     */
    public void setWeightcapacity(java.math.BigDecimal weightcapacity) {
        __modifiedProperties.add("weightcapacity");
        this._weightcapacity = weightcapacity;
    }

    /**
     * [get] Capacity: {decimal(16, 6)} <br>
     * 許容容積
     * @return The value of the column 'Capacity'. (NullAllowed)
     */
    public java.math.BigDecimal getCapacity() {
        return _capacity;
    }

    /**
     * [set] Capacity: {decimal(16, 6)} <br>
     * 許容容積
     * @param capacity The value of the column 'Capacity'. (NullAllowed)
     */
    public void setCapacity(java.math.BigDecimal capacity) {
        __modifiedProperties.add("capacity");
        this._capacity = capacity;
    }

    /**
     * [get] HULFT_ID: {bigint(19)} <br>
     * HULFT-ID
     * @return The value of the column 'HULFT_ID'. (NullAllowed)
     */
    public Long getHulftId() {
        return _hulftId;
    }

    /**
     * [set] HULFT_ID: {bigint(19)} <br>
     * HULFT-ID
     * @param hulftId The value of the column 'HULFT_ID'. (NullAllowed)
     */
    public void setHulftId(Long hulftId) {
        __modifiedProperties.add("hulftId");
        this._hulftId = hulftId;
    }

    /**
     * [get] WarehouseCls: {char(1)} <br>
     * 倉庫区分
     * @return The value of the column 'WarehouseCls'. (NullAllowed)
     */
    public String getWarehousecls() {
        return _warehousecls;
    }

    /**
     * [set] WarehouseCls: {char(1)} <br>
     * 倉庫区分
     * @param warehousecls The value of the column 'WarehouseCls'. (NullAllowed)
     */
    public void setWarehousecls(String warehousecls) {
        __modifiedProperties.add("warehousecls");
        this._warehousecls = warehousecls;
    }

    /**
     * [get] CMLRASID: {varchar(30)} <br>
     * 共通下位管理区分
     * @return The value of the column 'CMLRASID'. (NullAllowed)
     */
    public String getCmlrasid() {
        return _cmlrasid;
    }

    /**
     * [set] CMLRASID: {varchar(30)} <br>
     * 共通下位管理区分
     * @param cmlrasid The value of the column 'CMLRASID'. (NullAllowed)
     */
    public void setCmlrasid(String cmlrasid) {
        __modifiedProperties.add("cmlrasid");
        this._cmlrasid = cmlrasid;
    }

    /**
     * [get] OWN_OR_ANOTHER_FLG: {varchar(30)} <br>
     * 自社他社区分
     * @return The value of the column 'OWN_OR_ANOTHER_FLG'. (NullAllowed)
     */
    public String getOwnOrAnotherFlg() {
        return _ownOrAnotherFlg;
    }

    /**
     * [set] OWN_OR_ANOTHER_FLG: {varchar(30)} <br>
     * 自社他社区分
     * @param ownOrAnotherFlg The value of the column 'OWN_OR_ANOTHER_FLG'. (NullAllowed)
     */
    public void setOwnOrAnotherFlg(String ownOrAnotherFlg) {
        __modifiedProperties.add("ownOrAnotherFlg");
        this._ownOrAnotherFlg = ownOrAnotherFlg;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
