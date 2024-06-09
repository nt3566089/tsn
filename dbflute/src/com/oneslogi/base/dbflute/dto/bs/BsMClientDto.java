package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_CLIENT as TABLE. <br>
 * 荷主マスタ
 * <pre>
 * [primary-key]
 *     CLIENT_ID
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CLIENT_NM, CLIENT_ABBR, CUSTOMER_ID, SHAPE_GRP_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CUSTOMER, M_SHAPE_GRP, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer-table]
 *     M_CBRCTG, M_CDRCATT, M_CLIENT_CENTER, M_CLIENT_COL, M_CLIENT_ITEM, M_CLIENT_SCREEN, M_CUSTOMER, M_IMPORT_TYPE, M_MFINVOPERATION, M_MFMONTHCHG, M_MFPICKCTL, M_MFRCVDESIGN, M_MFRCVITEM, M_MFWHxITEM, M_PRODUCT, M_SHAPE_GRP, M_USER_CLIENT, M_USER_LOGIN, M_WEB_HT_INFO, T_ALLOC_INST_H, T_CCOPAM, T_CENTER_SYMBOL, T_CORDHDR, T_EC_ORDER_H, T_INVENTORY_H, T_MFLASTSHIPLOT, T_MOVE_INST_H, T_PACKING_H, T_PALLET, T_PICKING_H, T_PIC_MTHD_RCMD, T_RECEIVE_PLAN_H, T_SERIAL_NO, T_SHIPPING_INST_H, T_SPLINFO, T_STOCK, T_STORE_RECORD_H, T_TRALLINV, T_TRALLINVHISTORY, T_TRCASEINVENTORY, T_TRCASENUM, T_TRCASESTOCK, T_TRHANBAIINV, T_TRINVCHECKINFO, T_TRINVCORRECT, T_TRINVREANSWER, T_TRINVREQUEST, T_TRITEMCONVRESULT, T_TRJUKYUINV, T_TRMANUFACTUREDATE, T_TRMANUFACTUREDATEDETAIL, T_TRMANUFACTUREDATEHISTORY, T_TRPALLETTRACE, T_TRREVERSESTOCK, T_TRSTOCKDIFFHISTORY, T_TRSYMBOLTRACE, T_TRSYMBOLTRACEEXTEND, T_TRTRACE, T_YTRSO, W_HT_INVENTORY_INPUT_PROD, W_HT_LOADING, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SERIAL_RECEIVE_INSP, W_HT_SERIAL_SHIPPING_INSP, W_HT_SHIPPING, W_HT_SHIPPING_PICKING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT
 *
 * [foreign-property]
 *     mCustomer, mShapeGrp, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     mCbrctgList, mCdrcattList, mClientCenterList, mClientColList, mClientItemList, mClientScreenList, mCustomerList, mImportTypeList, mMfinvoperationList, mMfmonthchgList, mMfpickctlList, mMfrcvdesignList, mMfrcvitemList, mMfwhxitemList, mProductList, mShapeGrpList, mUserClientList, mUserLoginList, mWebHtInfoList, tAllocInstHList, tCcopamList, tCenterSymbolList, tCordhdrList, tEcOrderHList, tInventoryHList, tMflastshiplotList, tMoveInstHList, tPackingHList, tPalletList, tPickingHList, tPicMthdRcmdList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tSplinfoList, tStockList, tStoreRecordHList, tTrallinvList, tTrallinvhistoryList, tTrcaseinventoryList, tTrcasenumList, tTrcasestockList, tTrhanbaiinvList, tTrinvcheckinfoList, tTrinvcorrectList, tTrinvreanswerList, tTrinvrequestList, tTritemconvresultList, tTrjukyuinvList, tTrmanufacturedateList, tTrmanufacturedatedetailList, tTrmanufacturedatehistoryList, tTrpallettraceList, tTrreversestockList, tTrstockdiffhistoryList, tTrsymboltraceList, tTrsymboltraceextendList, tTrtraceList, tYtrsoList, wHtInventoryInputProdList, wHtLoadingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMClientDto implements Serializable {

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
    /** CLIENT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _clientId;

    /** CLIENT_CD: {UQ, NotNull, varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** CLIENT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _clientAbbr;

    /** CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    @JsonKey
    protected Long _customerId;

    /** SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP} */
    @JsonKey
    protected Long _shapeGrpId;

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
    public BsMClientDto() {
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
    protected MCustomerDto _mCustomer;

    public MCustomerDto getMCustomer() {
        return _mCustomer;
    }

    public void setMCustomer(MCustomerDto mCustomer) {
        this._mCustomer = mCustomer;
    }

    protected MShapeGrpDto _mShapeGrp;

    public MShapeGrpDto getMShapeGrp() {
        return _mShapeGrp;
    }

    public void setMShapeGrp(MShapeGrpDto mShapeGrp) {
        this._mShapeGrp = mShapeGrp;
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

    protected List<MClientCenterDto> _mClientCenterList;

    public List<MClientCenterDto> getMClientCenterList() {
        if (_mClientCenterList == null) { _mClientCenterList = new ArrayList<MClientCenterDto>(); }
        return _mClientCenterList;
    }

    public void setMClientCenterList(List<MClientCenterDto> mClientCenterList) {
        this._mClientCenterList = mClientCenterList;
    }

    protected List<MClientColDto> _mClientColList;

    public List<MClientColDto> getMClientColList() {
        if (_mClientColList == null) { _mClientColList = new ArrayList<MClientColDto>(); }
        return _mClientColList;
    }

    public void setMClientColList(List<MClientColDto> mClientColList) {
        this._mClientColList = mClientColList;
    }

    protected List<MClientItemDto> _mClientItemList;

    public List<MClientItemDto> getMClientItemList() {
        if (_mClientItemList == null) { _mClientItemList = new ArrayList<MClientItemDto>(); }
        return _mClientItemList;
    }

    public void setMClientItemList(List<MClientItemDto> mClientItemList) {
        this._mClientItemList = mClientItemList;
    }

    protected List<MClientScreenDto> _mClientScreenList;

    public List<MClientScreenDto> getMClientScreenList() {
        if (_mClientScreenList == null) { _mClientScreenList = new ArrayList<MClientScreenDto>(); }
        return _mClientScreenList;
    }

    public void setMClientScreenList(List<MClientScreenDto> mClientScreenList) {
        this._mClientScreenList = mClientScreenList;
    }

    protected List<MCustomerDto> _mCustomerList;

    public List<MCustomerDto> getMCustomerList() {
        if (_mCustomerList == null) { _mCustomerList = new ArrayList<MCustomerDto>(); }
        return _mCustomerList;
    }

    public void setMCustomerList(List<MCustomerDto> mCustomerList) {
        this._mCustomerList = mCustomerList;
    }

    protected List<MImportTypeDto> _mImportTypeList;

    public List<MImportTypeDto> getMImportTypeList() {
        if (_mImportTypeList == null) { _mImportTypeList = new ArrayList<MImportTypeDto>(); }
        return _mImportTypeList;
    }

    public void setMImportTypeList(List<MImportTypeDto> mImportTypeList) {
        this._mImportTypeList = mImportTypeList;
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

    protected List<MMfpickctlDto> _mMfpickctlList;

    public List<MMfpickctlDto> getMMfpickctlList() {
        if (_mMfpickctlList == null) { _mMfpickctlList = new ArrayList<MMfpickctlDto>(); }
        return _mMfpickctlList;
    }

    public void setMMfpickctlList(List<MMfpickctlDto> mMfpickctlList) {
        this._mMfpickctlList = mMfpickctlList;
    }

    protected List<MMfrcvdesignDto> _mMfrcvdesignList;

    public List<MMfrcvdesignDto> getMMfrcvdesignList() {
        if (_mMfrcvdesignList == null) { _mMfrcvdesignList = new ArrayList<MMfrcvdesignDto>(); }
        return _mMfrcvdesignList;
    }

    public void setMMfrcvdesignList(List<MMfrcvdesignDto> mMfrcvdesignList) {
        this._mMfrcvdesignList = mMfrcvdesignList;
    }

    protected List<MMfrcvitemDto> _mMfrcvitemList;

    public List<MMfrcvitemDto> getMMfrcvitemList() {
        if (_mMfrcvitemList == null) { _mMfrcvitemList = new ArrayList<MMfrcvitemDto>(); }
        return _mMfrcvitemList;
    }

    public void setMMfrcvitemList(List<MMfrcvitemDto> mMfrcvitemList) {
        this._mMfrcvitemList = mMfrcvitemList;
    }

    protected List<MMfwhxitemDto> _mMfwhxitemList;

    public List<MMfwhxitemDto> getMMfwhxitemList() {
        if (_mMfwhxitemList == null) { _mMfwhxitemList = new ArrayList<MMfwhxitemDto>(); }
        return _mMfwhxitemList;
    }

    public void setMMfwhxitemList(List<MMfwhxitemDto> mMfwhxitemList) {
        this._mMfwhxitemList = mMfwhxitemList;
    }

    protected List<MProductDto> _mProductList;

    public List<MProductDto> getMProductList() {
        if (_mProductList == null) { _mProductList = new ArrayList<MProductDto>(); }
        return _mProductList;
    }

    public void setMProductList(List<MProductDto> mProductList) {
        this._mProductList = mProductList;
    }

    protected List<MShapeGrpDto> _mShapeGrpList;

    public List<MShapeGrpDto> getMShapeGrpList() {
        if (_mShapeGrpList == null) { _mShapeGrpList = new ArrayList<MShapeGrpDto>(); }
        return _mShapeGrpList;
    }

    public void setMShapeGrpList(List<MShapeGrpDto> mShapeGrpList) {
        this._mShapeGrpList = mShapeGrpList;
    }

    protected List<MUserClientDto> _mUserClientList;

    public List<MUserClientDto> getMUserClientList() {
        if (_mUserClientList == null) { _mUserClientList = new ArrayList<MUserClientDto>(); }
        return _mUserClientList;
    }

    public void setMUserClientList(List<MUserClientDto> mUserClientList) {
        this._mUserClientList = mUserClientList;
    }

    protected List<MUserLoginDto> _mUserLoginList;

    public List<MUserLoginDto> getMUserLoginList() {
        if (_mUserLoginList == null) { _mUserLoginList = new ArrayList<MUserLoginDto>(); }
        return _mUserLoginList;
    }

    public void setMUserLoginList(List<MUserLoginDto> mUserLoginList) {
        this._mUserLoginList = mUserLoginList;
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

    protected List<TStockDto> _tStockList;

    public List<TStockDto> getTStockList() {
        if (_tStockList == null) { _tStockList = new ArrayList<TStockDto>(); }
        return _tStockList;
    }

    public void setTStockList(List<TStockDto> tStockList) {
        this._tStockList = tStockList;
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
        if (other == null || !(other instanceof BsMClientDto)) { return false; }
        final BsMClientDto otherEntity = (BsMClientDto)other;
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CLIENT");
        result = xCH(result, getClientId());
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
        sb.append(c).append(getClientId());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getClientAbbr());
        sb.append(c).append(getCustomerId());
        sb.append(c).append(getShapeGrpId());
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
     * [get] CLIENT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {UQ, NotNull, varchar(30)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {UQ, NotNull, varchar(30)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {NotNull, varchar(60)} <br>
     * 荷主名称
     * @return The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] CLIENT_NM: {NotNull, varchar(60)} <br>
     * 荷主名称
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

    /**
     * [get] CLIENT_ABBR: {varchar(60)} <br>
     * 荷主略称
     * @return The value of the column 'CLIENT_ABBR'. (NullAllowed)
     */
    public String getClientAbbr() {
        return _clientAbbr;
    }

    /**
     * [set] CLIENT_ABBR: {varchar(60)} <br>
     * 荷主略称
     * @param clientAbbr The value of the column 'CLIENT_ABBR'. (NullAllowed)
     */
    public void setClientAbbr(String clientAbbr) {
        __modifiedProperties.add("clientAbbr");
        this._clientAbbr = clientAbbr;
    }

    /**
     * [get] CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 荷主取引先ID
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public Long getCustomerId() {
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 荷主取引先ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public void setCustomerId(Long customerId) {
        __modifiedProperties.add("customerId");
        this._customerId = customerId;
    }

    /**
     * [get] SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP} <br>
     * 荷姿グループID
     * @return The value of the column 'SHAPE_GRP_ID'. (NullAllowed)
     */
    public Long getShapeGrpId() {
        return _shapeGrpId;
    }

    /**
     * [set] SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP} <br>
     * 荷姿グループID
     * @param shapeGrpId The value of the column 'SHAPE_GRP_ID'. (NullAllowed)
     */
    public void setShapeGrpId(Long shapeGrpId) {
        __modifiedProperties.add("shapeGrpId");
        this._shapeGrpId = shapeGrpId;
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
