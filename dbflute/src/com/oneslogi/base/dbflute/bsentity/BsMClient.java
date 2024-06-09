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
 * The entity of M_CLIENT as TABLE. <br>
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
 * [foreign table]
 *     M_CUSTOMER, M_SHAPE_GRP, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_CBRCTG, M_CDRCATT, M_CLIENT_CENTER, M_CLIENT_COL, M_CLIENT_ITEM, M_CLIENT_SCREEN, M_CUSTOMER, M_IMPORT_TYPE, M_MFINVOPERATION, M_MFMONTHCHG, M_MFPICKCTL, M_MFRCVDESIGN, M_MFRCVITEM, M_MFWHxITEM, M_PRODUCT, M_SHAPE_GRP, M_USER_CLIENT, M_USER_LOGIN, M_WEB_HT_INFO, T_ALLOC_INST_H, T_CCOPAM, T_CENTER_SYMBOL, T_CORDHDR, T_EC_ORDER_H, T_INVENTORY_H, T_MFLASTSHIPLOT, T_MOVE_INST_H, T_PACKING_H, T_PALLET, T_PICKING_H, T_PIC_MTHD_RCMD, T_RECEIVE_PLAN_H, T_SERIAL_NO, T_SHIPPING_INST_H, T_SPLINFO, T_STOCK, T_STORE_RECORD_H, T_TRALLINV, T_TRALLINVHISTORY, T_TRCASEINVENTORY, T_TRCASENUM, T_TRCASESTOCK, T_TRHANBAIINV, T_TRINVCHECKINFO, T_TRINVCORRECT, T_TRINVREANSWER, T_TRINVREQUEST, T_TRITEMCONVRESULT, T_TRJUKYUINV, T_TRMANUFACTUREDATE, T_TRMANUFACTUREDATEDETAIL, T_TRMANUFACTUREDATEHISTORY, T_TRPALLETTRACE, T_TRREVERSESTOCK, T_TRSTOCKDIFFHISTORY, T_TRSYMBOLTRACE, T_TRSYMBOLTRACEEXTEND, T_TRTRACE, T_YTRSO, W_HT_INVENTORY_INPUT_PROD, W_HT_LOADING, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SERIAL_RECEIVE_INSP, W_HT_SERIAL_SHIPPING_INSP, W_HT_SHIPPING, W_HT_SHIPPING_PICKING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT
 *
 * [foreign property]
 *     mCustomer, mShapeGrp, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mCbrctgList, mCdrcattList, mClientCenterList, mClientColList, mClientItemList, mClientScreenList, mCustomerList, mImportTypeList, mMfinvoperationList, mMfmonthchgList, mMfpickctlList, mMfrcvdesignList, mMfrcvitemList, mMfwhxitemList, mProductList, mShapeGrpList, mUserClientList, mUserLoginList, mWebHtInfoList, tAllocInstHList, tCcopamList, tCenterSymbolList, tCordhdrList, tEcOrderHList, tInventoryHList, tMflastshiplotList, tMoveInstHList, tPackingHList, tPalletList, tPickingHList, tPicMthdRcmdList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tSplinfoList, tStockList, tStoreRecordHList, tTrallinvList, tTrallinvhistoryList, tTrcaseinventoryList, tTrcasenumList, tTrcasestockList, tTrhanbaiinvList, tTrinvcheckinfoList, tTrinvcorrectList, tTrinvreanswerList, tTrinvrequestList, tTritemconvresultList, tTrjukyuinvList, tTrmanufacturedateList, tTrmanufacturedatedetailList, tTrmanufacturedatehistoryList, tTrpallettraceList, tTrreversestockList, tTrstockdiffhistoryList, tTrsymboltraceList, tTrsymboltraceextendList, tTrtraceList, tYtrsoList, wHtInventoryInputProdList, wHtLoadingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wSglRowShipInspHList, wShippingInterruptList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * String clientAbbr = entity.getClientAbbr();
 * Long customerId = entity.getCustomerId();
 * Long shapeGrpId = entity.getShapeGrpId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setClientAbbr(clientAbbr);
 * entity.setCustomerId(customerId);
 * entity.setShapeGrpId(shapeGrpId);
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
public abstract class BsMClient extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _clientId;

    /** CLIENT_CD: {UQ, NotNull, varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {NotNull, varchar(60)} */
    protected String _clientNm;

    /** CLIENT_ABBR: {varchar(60)} */
    protected String _clientAbbr;

    /** CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    protected Long _customerId;

    /** SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP} */
    protected Long _shapeGrpId;

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
        return "M_CLIENT";
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
        if (_clientId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param clientCd : UQ, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(String clientCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("clientCd");
        setClientCd(clientCd);
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
    /** M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'. */
    protected MCustomer _mCustomer;

    /**
     * [get] M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'. <br>
     * @return The entity of foreign property 'MCustomer'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomer() {
        return _mCustomer;
    }

    /**
     * [set] M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @param mCustomer The entity of foreign property 'MCustomer'. (NullAllowed)
     */
    public void setMCustomer(MCustomer mCustomer) {
        _mCustomer = mCustomer;
    }

    /** M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'. */
    protected MShapeGrp _mShapeGrp;

    /**
     * [get] M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'. <br>
     * @return The entity of foreign property 'MShapeGrp'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MShapeGrp getMShapeGrp() {
        return _mShapeGrp;
    }

    /**
     * [set] M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @param mShapeGrp The entity of foreign property 'MShapeGrp'. (NullAllowed)
     */
    public void setMShapeGrp(MShapeGrp mShapeGrp) {
        _mShapeGrp = mShapeGrp;
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
    /** M_CBRCTG by CLIENT_ID, named 'MCbrctgList'. */
    protected List<MCbrctg> _mCbrctgList;

    /**
     * [get] M_CBRCTG by CLIENT_ID, named 'MCbrctgList'.
     * @return The entity list of referrer property 'MCbrctgList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCbrctg> getMCbrctgList() {
        if (_mCbrctgList == null) { _mCbrctgList = newReferrerList(); }
        return _mCbrctgList;
    }

    /**
     * [set] M_CBRCTG by CLIENT_ID, named 'MCbrctgList'.
     * @param mCbrctgList The entity list of referrer property 'MCbrctgList'. (NullAllowed)
     */
    public void setMCbrctgList(List<MCbrctg> mCbrctgList) {
        _mCbrctgList = mCbrctgList;
    }

    /** M_CDRCATT by CLIENT_ID, named 'MCdrcattList'. */
    protected List<MCdrcatt> _mCdrcattList;

    /**
     * [get] M_CDRCATT by CLIENT_ID, named 'MCdrcattList'.
     * @return The entity list of referrer property 'MCdrcattList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCdrcatt> getMCdrcattList() {
        if (_mCdrcattList == null) { _mCdrcattList = newReferrerList(); }
        return _mCdrcattList;
    }

    /**
     * [set] M_CDRCATT by CLIENT_ID, named 'MCdrcattList'.
     * @param mCdrcattList The entity list of referrer property 'MCdrcattList'. (NullAllowed)
     */
    public void setMCdrcattList(List<MCdrcatt> mCdrcattList) {
        _mCdrcattList = mCdrcattList;
    }

    /** M_CLIENT_CENTER by CLIENT_ID, named 'MClientCenterList'. */
    protected List<MClientCenter> _mClientCenterList;

    /**
     * [get] M_CLIENT_CENTER by CLIENT_ID, named 'MClientCenterList'.
     * @return The entity list of referrer property 'MClientCenterList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientCenter> getMClientCenterList() {
        if (_mClientCenterList == null) { _mClientCenterList = newReferrerList(); }
        return _mClientCenterList;
    }

    /**
     * [set] M_CLIENT_CENTER by CLIENT_ID, named 'MClientCenterList'.
     * @param mClientCenterList The entity list of referrer property 'MClientCenterList'. (NullAllowed)
     */
    public void setMClientCenterList(List<MClientCenter> mClientCenterList) {
        _mClientCenterList = mClientCenterList;
    }

    /** M_CLIENT_COL by CLIENT_ID, named 'MClientColList'. */
    protected List<MClientCol> _mClientColList;

    /**
     * [get] M_CLIENT_COL by CLIENT_ID, named 'MClientColList'.
     * @return The entity list of referrer property 'MClientColList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientCol> getMClientColList() {
        if (_mClientColList == null) { _mClientColList = newReferrerList(); }
        return _mClientColList;
    }

    /**
     * [set] M_CLIENT_COL by CLIENT_ID, named 'MClientColList'.
     * @param mClientColList The entity list of referrer property 'MClientColList'. (NullAllowed)
     */
    public void setMClientColList(List<MClientCol> mClientColList) {
        _mClientColList = mClientColList;
    }

    /** M_CLIENT_ITEM by CLIENT_ID, named 'MClientItemList'. */
    protected List<MClientItem> _mClientItemList;

    /**
     * [get] M_CLIENT_ITEM by CLIENT_ID, named 'MClientItemList'.
     * @return The entity list of referrer property 'MClientItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientItem> getMClientItemList() {
        if (_mClientItemList == null) { _mClientItemList = newReferrerList(); }
        return _mClientItemList;
    }

    /**
     * [set] M_CLIENT_ITEM by CLIENT_ID, named 'MClientItemList'.
     * @param mClientItemList The entity list of referrer property 'MClientItemList'. (NullAllowed)
     */
    public void setMClientItemList(List<MClientItem> mClientItemList) {
        _mClientItemList = mClientItemList;
    }

    /** M_CLIENT_SCREEN by CLIENT_ID, named 'MClientScreenList'. */
    protected List<MClientScreen> _mClientScreenList;

    /**
     * [get] M_CLIENT_SCREEN by CLIENT_ID, named 'MClientScreenList'.
     * @return The entity list of referrer property 'MClientScreenList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientScreen> getMClientScreenList() {
        if (_mClientScreenList == null) { _mClientScreenList = newReferrerList(); }
        return _mClientScreenList;
    }

    /**
     * [set] M_CLIENT_SCREEN by CLIENT_ID, named 'MClientScreenList'.
     * @param mClientScreenList The entity list of referrer property 'MClientScreenList'. (NullAllowed)
     */
    public void setMClientScreenList(List<MClientScreen> mClientScreenList) {
        _mClientScreenList = mClientScreenList;
    }

    /** M_CUSTOMER by CLIENT_ID, named 'MCustomerList'. */
    protected List<MCustomer> _mCustomerList;

    /**
     * [get] M_CUSTOMER by CLIENT_ID, named 'MCustomerList'.
     * @return The entity list of referrer property 'MCustomerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCustomer> getMCustomerList() {
        if (_mCustomerList == null) { _mCustomerList = newReferrerList(); }
        return _mCustomerList;
    }

    /**
     * [set] M_CUSTOMER by CLIENT_ID, named 'MCustomerList'.
     * @param mCustomerList The entity list of referrer property 'MCustomerList'. (NullAllowed)
     */
    public void setMCustomerList(List<MCustomer> mCustomerList) {
        _mCustomerList = mCustomerList;
    }

    /** M_IMPORT_TYPE by CLIENT_ID, named 'MImportTypeList'. */
    protected List<MImportType> _mImportTypeList;

    /**
     * [get] M_IMPORT_TYPE by CLIENT_ID, named 'MImportTypeList'.
     * @return The entity list of referrer property 'MImportTypeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MImportType> getMImportTypeList() {
        if (_mImportTypeList == null) { _mImportTypeList = newReferrerList(); }
        return _mImportTypeList;
    }

    /**
     * [set] M_IMPORT_TYPE by CLIENT_ID, named 'MImportTypeList'.
     * @param mImportTypeList The entity list of referrer property 'MImportTypeList'. (NullAllowed)
     */
    public void setMImportTypeList(List<MImportType> mImportTypeList) {
        _mImportTypeList = mImportTypeList;
    }

    /** M_MFINVOPERATION by CLIENT_ID, named 'MMfinvoperationList'. */
    protected List<MMfinvoperation> _mMfinvoperationList;

    /**
     * [get] M_MFINVOPERATION by CLIENT_ID, named 'MMfinvoperationList'.
     * @return The entity list of referrer property 'MMfinvoperationList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MMfinvoperation> getMMfinvoperationList() {
        if (_mMfinvoperationList == null) { _mMfinvoperationList = newReferrerList(); }
        return _mMfinvoperationList;
    }

    /**
     * [set] M_MFINVOPERATION by CLIENT_ID, named 'MMfinvoperationList'.
     * @param mMfinvoperationList The entity list of referrer property 'MMfinvoperationList'. (NullAllowed)
     */
    public void setMMfinvoperationList(List<MMfinvoperation> mMfinvoperationList) {
        _mMfinvoperationList = mMfinvoperationList;
    }

    /** M_MFMONTHCHG by CLIENT_ID, named 'MMfmonthchgList'. */
    protected List<MMfmonthchg> _mMfmonthchgList;

    /**
     * [get] M_MFMONTHCHG by CLIENT_ID, named 'MMfmonthchgList'.
     * @return The entity list of referrer property 'MMfmonthchgList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MMfmonthchg> getMMfmonthchgList() {
        if (_mMfmonthchgList == null) { _mMfmonthchgList = newReferrerList(); }
        return _mMfmonthchgList;
    }

    /**
     * [set] M_MFMONTHCHG by CLIENT_ID, named 'MMfmonthchgList'.
     * @param mMfmonthchgList The entity list of referrer property 'MMfmonthchgList'. (NullAllowed)
     */
    public void setMMfmonthchgList(List<MMfmonthchg> mMfmonthchgList) {
        _mMfmonthchgList = mMfmonthchgList;
    }

    /** M_MFPICKCTL by CLIENT_ID, named 'MMfpickctlList'. */
    protected List<MMfpickctl> _mMfpickctlList;

    /**
     * [get] M_MFPICKCTL by CLIENT_ID, named 'MMfpickctlList'.
     * @return The entity list of referrer property 'MMfpickctlList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MMfpickctl> getMMfpickctlList() {
        if (_mMfpickctlList == null) { _mMfpickctlList = newReferrerList(); }
        return _mMfpickctlList;
    }

    /**
     * [set] M_MFPICKCTL by CLIENT_ID, named 'MMfpickctlList'.
     * @param mMfpickctlList The entity list of referrer property 'MMfpickctlList'. (NullAllowed)
     */
    public void setMMfpickctlList(List<MMfpickctl> mMfpickctlList) {
        _mMfpickctlList = mMfpickctlList;
    }

    /** M_MFRCVDESIGN by CLIENT_ID, named 'MMfrcvdesignList'. */
    protected List<MMfrcvdesign> _mMfrcvdesignList;

    /**
     * [get] M_MFRCVDESIGN by CLIENT_ID, named 'MMfrcvdesignList'.
     * @return The entity list of referrer property 'MMfrcvdesignList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MMfrcvdesign> getMMfrcvdesignList() {
        if (_mMfrcvdesignList == null) { _mMfrcvdesignList = newReferrerList(); }
        return _mMfrcvdesignList;
    }

    /**
     * [set] M_MFRCVDESIGN by CLIENT_ID, named 'MMfrcvdesignList'.
     * @param mMfrcvdesignList The entity list of referrer property 'MMfrcvdesignList'. (NullAllowed)
     */
    public void setMMfrcvdesignList(List<MMfrcvdesign> mMfrcvdesignList) {
        _mMfrcvdesignList = mMfrcvdesignList;
    }

    /** M_MFRCVITEM by CLIENT_ID, named 'MMfrcvitemList'. */
    protected List<MMfrcvitem> _mMfrcvitemList;

    /**
     * [get] M_MFRCVITEM by CLIENT_ID, named 'MMfrcvitemList'.
     * @return The entity list of referrer property 'MMfrcvitemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MMfrcvitem> getMMfrcvitemList() {
        if (_mMfrcvitemList == null) { _mMfrcvitemList = newReferrerList(); }
        return _mMfrcvitemList;
    }

    /**
     * [set] M_MFRCVITEM by CLIENT_ID, named 'MMfrcvitemList'.
     * @param mMfrcvitemList The entity list of referrer property 'MMfrcvitemList'. (NullAllowed)
     */
    public void setMMfrcvitemList(List<MMfrcvitem> mMfrcvitemList) {
        _mMfrcvitemList = mMfrcvitemList;
    }

    /** M_MFWHxITEM by CLIENT_ID, named 'MMfwhxitemList'. */
    protected List<MMfwhxitem> _mMfwhxitemList;

    /**
     * [get] M_MFWHxITEM by CLIENT_ID, named 'MMfwhxitemList'.
     * @return The entity list of referrer property 'MMfwhxitemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MMfwhxitem> getMMfwhxitemList() {
        if (_mMfwhxitemList == null) { _mMfwhxitemList = newReferrerList(); }
        return _mMfwhxitemList;
    }

    /**
     * [set] M_MFWHxITEM by CLIENT_ID, named 'MMfwhxitemList'.
     * @param mMfwhxitemList The entity list of referrer property 'MMfwhxitemList'. (NullAllowed)
     */
    public void setMMfwhxitemList(List<MMfwhxitem> mMfwhxitemList) {
        _mMfwhxitemList = mMfwhxitemList;
    }

    /** M_PRODUCT by CLIENT_ID, named 'MProductList'. */
    protected List<MProduct> _mProductList;

    /**
     * [get] M_PRODUCT by CLIENT_ID, named 'MProductList'.
     * @return The entity list of referrer property 'MProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MProduct> getMProductList() {
        if (_mProductList == null) { _mProductList = newReferrerList(); }
        return _mProductList;
    }

    /**
     * [set] M_PRODUCT by CLIENT_ID, named 'MProductList'.
     * @param mProductList The entity list of referrer property 'MProductList'. (NullAllowed)
     */
    public void setMProductList(List<MProduct> mProductList) {
        _mProductList = mProductList;
    }

    /** M_SHAPE_GRP by CLIENT_ID, named 'MShapeGrpList'. */
    protected List<MShapeGrp> _mShapeGrpList;

    /**
     * [get] M_SHAPE_GRP by CLIENT_ID, named 'MShapeGrpList'.
     * @return The entity list of referrer property 'MShapeGrpList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MShapeGrp> getMShapeGrpList() {
        if (_mShapeGrpList == null) { _mShapeGrpList = newReferrerList(); }
        return _mShapeGrpList;
    }

    /**
     * [set] M_SHAPE_GRP by CLIENT_ID, named 'MShapeGrpList'.
     * @param mShapeGrpList The entity list of referrer property 'MShapeGrpList'. (NullAllowed)
     */
    public void setMShapeGrpList(List<MShapeGrp> mShapeGrpList) {
        _mShapeGrpList = mShapeGrpList;
    }

    /** M_USER_CLIENT by CLIENT_ID, named 'MUserClientList'. */
    protected List<MUserClient> _mUserClientList;

    /**
     * [get] M_USER_CLIENT by CLIENT_ID, named 'MUserClientList'.
     * @return The entity list of referrer property 'MUserClientList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MUserClient> getMUserClientList() {
        if (_mUserClientList == null) { _mUserClientList = newReferrerList(); }
        return _mUserClientList;
    }

    /**
     * [set] M_USER_CLIENT by CLIENT_ID, named 'MUserClientList'.
     * @param mUserClientList The entity list of referrer property 'MUserClientList'. (NullAllowed)
     */
    public void setMUserClientList(List<MUserClient> mUserClientList) {
        _mUserClientList = mUserClientList;
    }

    /** M_USER_LOGIN by CLIENT_ID, named 'MUserLoginList'. */
    protected List<MUserLogin> _mUserLoginList;

    /**
     * [get] M_USER_LOGIN by CLIENT_ID, named 'MUserLoginList'.
     * @return The entity list of referrer property 'MUserLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MUserLogin> getMUserLoginList() {
        if (_mUserLoginList == null) { _mUserLoginList = newReferrerList(); }
        return _mUserLoginList;
    }

    /**
     * [set] M_USER_LOGIN by CLIENT_ID, named 'MUserLoginList'.
     * @param mUserLoginList The entity list of referrer property 'MUserLoginList'. (NullAllowed)
     */
    public void setMUserLoginList(List<MUserLogin> mUserLoginList) {
        _mUserLoginList = mUserLoginList;
    }

    /** M_WEB_HT_INFO by CLIENT_ID, named 'MWebHtInfoList'. */
    protected List<MWebHtInfo> _mWebHtInfoList;

    /**
     * [get] M_WEB_HT_INFO by CLIENT_ID, named 'MWebHtInfoList'.
     * @return The entity list of referrer property 'MWebHtInfoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MWebHtInfo> getMWebHtInfoList() {
        if (_mWebHtInfoList == null) { _mWebHtInfoList = newReferrerList(); }
        return _mWebHtInfoList;
    }

    /**
     * [set] M_WEB_HT_INFO by CLIENT_ID, named 'MWebHtInfoList'.
     * @param mWebHtInfoList The entity list of referrer property 'MWebHtInfoList'. (NullAllowed)
     */
    public void setMWebHtInfoList(List<MWebHtInfo> mWebHtInfoList) {
        _mWebHtInfoList = mWebHtInfoList;
    }

    /** T_ALLOC_INST_H by CLIENT_ID, named 'TAllocInstHList'. */
    protected List<TAllocInstH> _tAllocInstHList;

    /**
     * [get] T_ALLOC_INST_H by CLIENT_ID, named 'TAllocInstHList'.
     * @return The entity list of referrer property 'TAllocInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstH> getTAllocInstHList() {
        if (_tAllocInstHList == null) { _tAllocInstHList = newReferrerList(); }
        return _tAllocInstHList;
    }

    /**
     * [set] T_ALLOC_INST_H by CLIENT_ID, named 'TAllocInstHList'.
     * @param tAllocInstHList The entity list of referrer property 'TAllocInstHList'. (NullAllowed)
     */
    public void setTAllocInstHList(List<TAllocInstH> tAllocInstHList) {
        _tAllocInstHList = tAllocInstHList;
    }

    /** T_CCOPAM by CLIENT_ID, named 'TCcopamList'. */
    protected List<TCcopam> _tCcopamList;

    /**
     * [get] T_CCOPAM by CLIENT_ID, named 'TCcopamList'.
     * @return The entity list of referrer property 'TCcopamList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TCcopam> getTCcopamList() {
        if (_tCcopamList == null) { _tCcopamList = newReferrerList(); }
        return _tCcopamList;
    }

    /**
     * [set] T_CCOPAM by CLIENT_ID, named 'TCcopamList'.
     * @param tCcopamList The entity list of referrer property 'TCcopamList'. (NullAllowed)
     */
    public void setTCcopamList(List<TCcopam> tCcopamList) {
        _tCcopamList = tCcopamList;
    }

    /** T_CENTER_SYMBOL by CLIENT_ID, named 'TCenterSymbolList'. */
    protected List<TCenterSymbol> _tCenterSymbolList;

    /**
     * [get] T_CENTER_SYMBOL by CLIENT_ID, named 'TCenterSymbolList'.
     * @return The entity list of referrer property 'TCenterSymbolList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TCenterSymbol> getTCenterSymbolList() {
        if (_tCenterSymbolList == null) { _tCenterSymbolList = newReferrerList(); }
        return _tCenterSymbolList;
    }

    /**
     * [set] T_CENTER_SYMBOL by CLIENT_ID, named 'TCenterSymbolList'.
     * @param tCenterSymbolList The entity list of referrer property 'TCenterSymbolList'. (NullAllowed)
     */
    public void setTCenterSymbolList(List<TCenterSymbol> tCenterSymbolList) {
        _tCenterSymbolList = tCenterSymbolList;
    }

    /** T_CORDHDR by CLIENT_ID, named 'TCordhdrList'. */
    protected List<TCordhdr> _tCordhdrList;

    /**
     * [get] T_CORDHDR by CLIENT_ID, named 'TCordhdrList'.
     * @return The entity list of referrer property 'TCordhdrList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TCordhdr> getTCordhdrList() {
        if (_tCordhdrList == null) { _tCordhdrList = newReferrerList(); }
        return _tCordhdrList;
    }

    /**
     * [set] T_CORDHDR by CLIENT_ID, named 'TCordhdrList'.
     * @param tCordhdrList The entity list of referrer property 'TCordhdrList'. (NullAllowed)
     */
    public void setTCordhdrList(List<TCordhdr> tCordhdrList) {
        _tCordhdrList = tCordhdrList;
    }

    /** T_EC_ORDER_H by CLIENT_ID, named 'TEcOrderHList'. */
    protected List<TEcOrderH> _tEcOrderHList;

    /**
     * [get] T_EC_ORDER_H by CLIENT_ID, named 'TEcOrderHList'.
     * @return The entity list of referrer property 'TEcOrderHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TEcOrderH> getTEcOrderHList() {
        if (_tEcOrderHList == null) { _tEcOrderHList = newReferrerList(); }
        return _tEcOrderHList;
    }

    /**
     * [set] T_EC_ORDER_H by CLIENT_ID, named 'TEcOrderHList'.
     * @param tEcOrderHList The entity list of referrer property 'TEcOrderHList'. (NullAllowed)
     */
    public void setTEcOrderHList(List<TEcOrderH> tEcOrderHList) {
        _tEcOrderHList = tEcOrderHList;
    }

    /** T_INVENTORY_H by CLIENT_ID, named 'TInventoryHList'. */
    protected List<TInventoryH> _tInventoryHList;

    /**
     * [get] T_INVENTORY_H by CLIENT_ID, named 'TInventoryHList'.
     * @return The entity list of referrer property 'TInventoryHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryH> getTInventoryHList() {
        if (_tInventoryHList == null) { _tInventoryHList = newReferrerList(); }
        return _tInventoryHList;
    }

    /**
     * [set] T_INVENTORY_H by CLIENT_ID, named 'TInventoryHList'.
     * @param tInventoryHList The entity list of referrer property 'TInventoryHList'. (NullAllowed)
     */
    public void setTInventoryHList(List<TInventoryH> tInventoryHList) {
        _tInventoryHList = tInventoryHList;
    }

    /** T_MFLASTSHIPLOT by CLIENT_ID, named 'TMflastshiplotList'. */
    protected List<TMflastshiplot> _tMflastshiplotList;

    /**
     * [get] T_MFLASTSHIPLOT by CLIENT_ID, named 'TMflastshiplotList'.
     * @return The entity list of referrer property 'TMflastshiplotList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMflastshiplot> getTMflastshiplotList() {
        if (_tMflastshiplotList == null) { _tMflastshiplotList = newReferrerList(); }
        return _tMflastshiplotList;
    }

    /**
     * [set] T_MFLASTSHIPLOT by CLIENT_ID, named 'TMflastshiplotList'.
     * @param tMflastshiplotList The entity list of referrer property 'TMflastshiplotList'. (NullAllowed)
     */
    public void setTMflastshiplotList(List<TMflastshiplot> tMflastshiplotList) {
        _tMflastshiplotList = tMflastshiplotList;
    }

    /** T_MOVE_INST_H by CLIENT_ID, named 'TMoveInstHList'. */
    protected List<TMoveInstH> _tMoveInstHList;

    /**
     * [get] T_MOVE_INST_H by CLIENT_ID, named 'TMoveInstHList'.
     * @return The entity list of referrer property 'TMoveInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstH> getTMoveInstHList() {
        if (_tMoveInstHList == null) { _tMoveInstHList = newReferrerList(); }
        return _tMoveInstHList;
    }

    /**
     * [set] T_MOVE_INST_H by CLIENT_ID, named 'TMoveInstHList'.
     * @param tMoveInstHList The entity list of referrer property 'TMoveInstHList'. (NullAllowed)
     */
    public void setTMoveInstHList(List<TMoveInstH> tMoveInstHList) {
        _tMoveInstHList = tMoveInstHList;
    }

    /** T_PACKING_H by CLIENT_ID, named 'TPackingHList'. */
    protected List<TPackingH> _tPackingHList;

    /**
     * [get] T_PACKING_H by CLIENT_ID, named 'TPackingHList'.
     * @return The entity list of referrer property 'TPackingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingH> getTPackingHList() {
        if (_tPackingHList == null) { _tPackingHList = newReferrerList(); }
        return _tPackingHList;
    }

    /**
     * [set] T_PACKING_H by CLIENT_ID, named 'TPackingHList'.
     * @param tPackingHList The entity list of referrer property 'TPackingHList'. (NullAllowed)
     */
    public void setTPackingHList(List<TPackingH> tPackingHList) {
        _tPackingHList = tPackingHList;
    }

    /** T_PALLET by CLIENT_ID, named 'TPalletList'. */
    protected List<TPallet> _tPalletList;

    /**
     * [get] T_PALLET by CLIENT_ID, named 'TPalletList'.
     * @return The entity list of referrer property 'TPalletList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPallet> getTPalletList() {
        if (_tPalletList == null) { _tPalletList = newReferrerList(); }
        return _tPalletList;
    }

    /**
     * [set] T_PALLET by CLIENT_ID, named 'TPalletList'.
     * @param tPalletList The entity list of referrer property 'TPalletList'. (NullAllowed)
     */
    public void setTPalletList(List<TPallet> tPalletList) {
        _tPalletList = tPalletList;
    }

    /** T_PICKING_H by CLIENT_ID, named 'TPickingHList'. */
    protected List<TPickingH> _tPickingHList;

    /**
     * [get] T_PICKING_H by CLIENT_ID, named 'TPickingHList'.
     * @return The entity list of referrer property 'TPickingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingH> getTPickingHList() {
        if (_tPickingHList == null) { _tPickingHList = newReferrerList(); }
        return _tPickingHList;
    }

    /**
     * [set] T_PICKING_H by CLIENT_ID, named 'TPickingHList'.
     * @param tPickingHList The entity list of referrer property 'TPickingHList'. (NullAllowed)
     */
    public void setTPickingHList(List<TPickingH> tPickingHList) {
        _tPickingHList = tPickingHList;
    }

    /** T_PIC_MTHD_RCMD by CLIENT_ID, named 'TPicMthdRcmdList'. */
    protected List<TPicMthdRcmd> _tPicMthdRcmdList;

    /**
     * [get] T_PIC_MTHD_RCMD by CLIENT_ID, named 'TPicMthdRcmdList'.
     * @return The entity list of referrer property 'TPicMthdRcmdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPicMthdRcmd> getTPicMthdRcmdList() {
        if (_tPicMthdRcmdList == null) { _tPicMthdRcmdList = newReferrerList(); }
        return _tPicMthdRcmdList;
    }

    /**
     * [set] T_PIC_MTHD_RCMD by CLIENT_ID, named 'TPicMthdRcmdList'.
     * @param tPicMthdRcmdList The entity list of referrer property 'TPicMthdRcmdList'. (NullAllowed)
     */
    public void setTPicMthdRcmdList(List<TPicMthdRcmd> tPicMthdRcmdList) {
        _tPicMthdRcmdList = tPicMthdRcmdList;
    }

    /** T_RECEIVE_PLAN_H by CLIENT_ID, named 'TReceivePlanHList'. */
    protected List<TReceivePlanH> _tReceivePlanHList;

    /**
     * [get] T_RECEIVE_PLAN_H by CLIENT_ID, named 'TReceivePlanHList'.
     * @return The entity list of referrer property 'TReceivePlanHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanH> getTReceivePlanHList() {
        if (_tReceivePlanHList == null) { _tReceivePlanHList = newReferrerList(); }
        return _tReceivePlanHList;
    }

    /**
     * [set] T_RECEIVE_PLAN_H by CLIENT_ID, named 'TReceivePlanHList'.
     * @param tReceivePlanHList The entity list of referrer property 'TReceivePlanHList'. (NullAllowed)
     */
    public void setTReceivePlanHList(List<TReceivePlanH> tReceivePlanHList) {
        _tReceivePlanHList = tReceivePlanHList;
    }

    /** T_SERIAL_NO by CLIENT_ID, named 'TSerialNoList'. */
    protected List<TSerialNo> _tSerialNoList;

    /**
     * [get] T_SERIAL_NO by CLIENT_ID, named 'TSerialNoList'.
     * @return The entity list of referrer property 'TSerialNoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TSerialNo> getTSerialNoList() {
        if (_tSerialNoList == null) { _tSerialNoList = newReferrerList(); }
        return _tSerialNoList;
    }

    /**
     * [set] T_SERIAL_NO by CLIENT_ID, named 'TSerialNoList'.
     * @param tSerialNoList The entity list of referrer property 'TSerialNoList'. (NullAllowed)
     */
    public void setTSerialNoList(List<TSerialNo> tSerialNoList) {
        _tSerialNoList = tSerialNoList;
    }

    /** T_SHIPPING_INST_H by CLIENT_ID, named 'TShippingInstHList'. */
    protected List<TShippingInstH> _tShippingInstHList;

    /**
     * [get] T_SHIPPING_INST_H by CLIENT_ID, named 'TShippingInstHList'.
     * @return The entity list of referrer property 'TShippingInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstH> getTShippingInstHList() {
        if (_tShippingInstHList == null) { _tShippingInstHList = newReferrerList(); }
        return _tShippingInstHList;
    }

    /**
     * [set] T_SHIPPING_INST_H by CLIENT_ID, named 'TShippingInstHList'.
     * @param tShippingInstHList The entity list of referrer property 'TShippingInstHList'. (NullAllowed)
     */
    public void setTShippingInstHList(List<TShippingInstH> tShippingInstHList) {
        _tShippingInstHList = tShippingInstHList;
    }

    /** T_SPLINFO by CLIENT_ID, named 'TSplinfoList'. */
    protected List<TSplinfo> _tSplinfoList;

    /**
     * [get] T_SPLINFO by CLIENT_ID, named 'TSplinfoList'.
     * @return The entity list of referrer property 'TSplinfoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TSplinfo> getTSplinfoList() {
        if (_tSplinfoList == null) { _tSplinfoList = newReferrerList(); }
        return _tSplinfoList;
    }

    /**
     * [set] T_SPLINFO by CLIENT_ID, named 'TSplinfoList'.
     * @param tSplinfoList The entity list of referrer property 'TSplinfoList'. (NullAllowed)
     */
    public void setTSplinfoList(List<TSplinfo> tSplinfoList) {
        _tSplinfoList = tSplinfoList;
    }

    /** T_STOCK by CLIENT_ID, named 'TStockList'. */
    protected List<TStock> _tStockList;

    /**
     * [get] T_STOCK by CLIENT_ID, named 'TStockList'.
     * @return The entity list of referrer property 'TStockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStock> getTStockList() {
        if (_tStockList == null) { _tStockList = newReferrerList(); }
        return _tStockList;
    }

    /**
     * [set] T_STOCK by CLIENT_ID, named 'TStockList'.
     * @param tStockList The entity list of referrer property 'TStockList'. (NullAllowed)
     */
    public void setTStockList(List<TStock> tStockList) {
        _tStockList = tStockList;
    }

    /** T_STORE_RECORD_H by CLIENT_ID, named 'TStoreRecordHList'. */
    protected List<TStoreRecordH> _tStoreRecordHList;

    /**
     * [get] T_STORE_RECORD_H by CLIENT_ID, named 'TStoreRecordHList'.
     * @return The entity list of referrer property 'TStoreRecordHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreRecordH> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = newReferrerList(); }
        return _tStoreRecordHList;
    }

    /**
     * [set] T_STORE_RECORD_H by CLIENT_ID, named 'TStoreRecordHList'.
     * @param tStoreRecordHList The entity list of referrer property 'TStoreRecordHList'. (NullAllowed)
     */
    public void setTStoreRecordHList(List<TStoreRecordH> tStoreRecordHList) {
        _tStoreRecordHList = tStoreRecordHList;
    }

    /** T_TRALLINV by CLIENT_ID, named 'TTrallinvList'. */
    protected List<TTrallinv> _tTrallinvList;

    /**
     * [get] T_TRALLINV by CLIENT_ID, named 'TTrallinvList'.
     * @return The entity list of referrer property 'TTrallinvList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrallinv> getTTrallinvList() {
        if (_tTrallinvList == null) { _tTrallinvList = newReferrerList(); }
        return _tTrallinvList;
    }

    /**
     * [set] T_TRALLINV by CLIENT_ID, named 'TTrallinvList'.
     * @param tTrallinvList The entity list of referrer property 'TTrallinvList'. (NullAllowed)
     */
    public void setTTrallinvList(List<TTrallinv> tTrallinvList) {
        _tTrallinvList = tTrallinvList;
    }

    /** T_TRALLINVHISTORY by CLIENT_ID, named 'TTrallinvhistoryList'. */
    protected List<TTrallinvhistory> _tTrallinvhistoryList;

    /**
     * [get] T_TRALLINVHISTORY by CLIENT_ID, named 'TTrallinvhistoryList'.
     * @return The entity list of referrer property 'TTrallinvhistoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrallinvhistory> getTTrallinvhistoryList() {
        if (_tTrallinvhistoryList == null) { _tTrallinvhistoryList = newReferrerList(); }
        return _tTrallinvhistoryList;
    }

    /**
     * [set] T_TRALLINVHISTORY by CLIENT_ID, named 'TTrallinvhistoryList'.
     * @param tTrallinvhistoryList The entity list of referrer property 'TTrallinvhistoryList'. (NullAllowed)
     */
    public void setTTrallinvhistoryList(List<TTrallinvhistory> tTrallinvhistoryList) {
        _tTrallinvhistoryList = tTrallinvhistoryList;
    }

    /** T_TRCASEINVENTORY by CLIENT_ID, named 'TTrcaseinventoryList'. */
    protected List<TTrcaseinventory> _tTrcaseinventoryList;

    /**
     * [get] T_TRCASEINVENTORY by CLIENT_ID, named 'TTrcaseinventoryList'.
     * @return The entity list of referrer property 'TTrcaseinventoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrcaseinventory> getTTrcaseinventoryList() {
        if (_tTrcaseinventoryList == null) { _tTrcaseinventoryList = newReferrerList(); }
        return _tTrcaseinventoryList;
    }

    /**
     * [set] T_TRCASEINVENTORY by CLIENT_ID, named 'TTrcaseinventoryList'.
     * @param tTrcaseinventoryList The entity list of referrer property 'TTrcaseinventoryList'. (NullAllowed)
     */
    public void setTTrcaseinventoryList(List<TTrcaseinventory> tTrcaseinventoryList) {
        _tTrcaseinventoryList = tTrcaseinventoryList;
    }

    /** T_TRCASENUM by CLIENT_ID, named 'TTrcasenumList'. */
    protected List<TTrcasenum> _tTrcasenumList;

    /**
     * [get] T_TRCASENUM by CLIENT_ID, named 'TTrcasenumList'.
     * @return The entity list of referrer property 'TTrcasenumList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrcasenum> getTTrcasenumList() {
        if (_tTrcasenumList == null) { _tTrcasenumList = newReferrerList(); }
        return _tTrcasenumList;
    }

    /**
     * [set] T_TRCASENUM by CLIENT_ID, named 'TTrcasenumList'.
     * @param tTrcasenumList The entity list of referrer property 'TTrcasenumList'. (NullAllowed)
     */
    public void setTTrcasenumList(List<TTrcasenum> tTrcasenumList) {
        _tTrcasenumList = tTrcasenumList;
    }

    /** T_TRCASESTOCK by CLIENT_ID, named 'TTrcasestockList'. */
    protected List<TTrcasestock> _tTrcasestockList;

    /**
     * [get] T_TRCASESTOCK by CLIENT_ID, named 'TTrcasestockList'.
     * @return The entity list of referrer property 'TTrcasestockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrcasestock> getTTrcasestockList() {
        if (_tTrcasestockList == null) { _tTrcasestockList = newReferrerList(); }
        return _tTrcasestockList;
    }

    /**
     * [set] T_TRCASESTOCK by CLIENT_ID, named 'TTrcasestockList'.
     * @param tTrcasestockList The entity list of referrer property 'TTrcasestockList'. (NullAllowed)
     */
    public void setTTrcasestockList(List<TTrcasestock> tTrcasestockList) {
        _tTrcasestockList = tTrcasestockList;
    }

    /** T_TRHANBAIINV by CLIENT_ID, named 'TTrhanbaiinvList'. */
    protected List<TTrhanbaiinv> _tTrhanbaiinvList;

    /**
     * [get] T_TRHANBAIINV by CLIENT_ID, named 'TTrhanbaiinvList'.
     * @return The entity list of referrer property 'TTrhanbaiinvList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrhanbaiinv> getTTrhanbaiinvList() {
        if (_tTrhanbaiinvList == null) { _tTrhanbaiinvList = newReferrerList(); }
        return _tTrhanbaiinvList;
    }

    /**
     * [set] T_TRHANBAIINV by CLIENT_ID, named 'TTrhanbaiinvList'.
     * @param tTrhanbaiinvList The entity list of referrer property 'TTrhanbaiinvList'. (NullAllowed)
     */
    public void setTTrhanbaiinvList(List<TTrhanbaiinv> tTrhanbaiinvList) {
        _tTrhanbaiinvList = tTrhanbaiinvList;
    }

    /** T_TRINVCHECKINFO by CLIENT_ID, named 'TTrinvcheckinfoList'. */
    protected List<TTrinvcheckinfo> _tTrinvcheckinfoList;

    /**
     * [get] T_TRINVCHECKINFO by CLIENT_ID, named 'TTrinvcheckinfoList'.
     * @return The entity list of referrer property 'TTrinvcheckinfoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrinvcheckinfo> getTTrinvcheckinfoList() {
        if (_tTrinvcheckinfoList == null) { _tTrinvcheckinfoList = newReferrerList(); }
        return _tTrinvcheckinfoList;
    }

    /**
     * [set] T_TRINVCHECKINFO by CLIENT_ID, named 'TTrinvcheckinfoList'.
     * @param tTrinvcheckinfoList The entity list of referrer property 'TTrinvcheckinfoList'. (NullAllowed)
     */
    public void setTTrinvcheckinfoList(List<TTrinvcheckinfo> tTrinvcheckinfoList) {
        _tTrinvcheckinfoList = tTrinvcheckinfoList;
    }

    /** T_TRINVCORRECT by CLIENT_ID, named 'TTrinvcorrectList'. */
    protected List<TTrinvcorrect> _tTrinvcorrectList;

    /**
     * [get] T_TRINVCORRECT by CLIENT_ID, named 'TTrinvcorrectList'.
     * @return The entity list of referrer property 'TTrinvcorrectList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrinvcorrect> getTTrinvcorrectList() {
        if (_tTrinvcorrectList == null) { _tTrinvcorrectList = newReferrerList(); }
        return _tTrinvcorrectList;
    }

    /**
     * [set] T_TRINVCORRECT by CLIENT_ID, named 'TTrinvcorrectList'.
     * @param tTrinvcorrectList The entity list of referrer property 'TTrinvcorrectList'. (NullAllowed)
     */
    public void setTTrinvcorrectList(List<TTrinvcorrect> tTrinvcorrectList) {
        _tTrinvcorrectList = tTrinvcorrectList;
    }

    /** T_TRINVREANSWER by CLIENT_ID, named 'TTrinvreanswerList'. */
    protected List<TTrinvreanswer> _tTrinvreanswerList;

    /**
     * [get] T_TRINVREANSWER by CLIENT_ID, named 'TTrinvreanswerList'.
     * @return The entity list of referrer property 'TTrinvreanswerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrinvreanswer> getTTrinvreanswerList() {
        if (_tTrinvreanswerList == null) { _tTrinvreanswerList = newReferrerList(); }
        return _tTrinvreanswerList;
    }

    /**
     * [set] T_TRINVREANSWER by CLIENT_ID, named 'TTrinvreanswerList'.
     * @param tTrinvreanswerList The entity list of referrer property 'TTrinvreanswerList'. (NullAllowed)
     */
    public void setTTrinvreanswerList(List<TTrinvreanswer> tTrinvreanswerList) {
        _tTrinvreanswerList = tTrinvreanswerList;
    }

    /** T_TRINVREQUEST by CLIENT_ID, named 'TTrinvrequestList'. */
    protected List<TTrinvrequest> _tTrinvrequestList;

    /**
     * [get] T_TRINVREQUEST by CLIENT_ID, named 'TTrinvrequestList'.
     * @return The entity list of referrer property 'TTrinvrequestList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrinvrequest> getTTrinvrequestList() {
        if (_tTrinvrequestList == null) { _tTrinvrequestList = newReferrerList(); }
        return _tTrinvrequestList;
    }

    /**
     * [set] T_TRINVREQUEST by CLIENT_ID, named 'TTrinvrequestList'.
     * @param tTrinvrequestList The entity list of referrer property 'TTrinvrequestList'. (NullAllowed)
     */
    public void setTTrinvrequestList(List<TTrinvrequest> tTrinvrequestList) {
        _tTrinvrequestList = tTrinvrequestList;
    }

    /** T_TRITEMCONVRESULT by CLIENT_ID, named 'TTritemconvresultList'. */
    protected List<TTritemconvresult> _tTritemconvresultList;

    /**
     * [get] T_TRITEMCONVRESULT by CLIENT_ID, named 'TTritemconvresultList'.
     * @return The entity list of referrer property 'TTritemconvresultList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTritemconvresult> getTTritemconvresultList() {
        if (_tTritemconvresultList == null) { _tTritemconvresultList = newReferrerList(); }
        return _tTritemconvresultList;
    }

    /**
     * [set] T_TRITEMCONVRESULT by CLIENT_ID, named 'TTritemconvresultList'.
     * @param tTritemconvresultList The entity list of referrer property 'TTritemconvresultList'. (NullAllowed)
     */
    public void setTTritemconvresultList(List<TTritemconvresult> tTritemconvresultList) {
        _tTritemconvresultList = tTritemconvresultList;
    }

    /** T_TRJUKYUINV by CLIENT_ID, named 'TTrjukyuinvList'. */
    protected List<TTrjukyuinv> _tTrjukyuinvList;

    /**
     * [get] T_TRJUKYUINV by CLIENT_ID, named 'TTrjukyuinvList'.
     * @return The entity list of referrer property 'TTrjukyuinvList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrjukyuinv> getTTrjukyuinvList() {
        if (_tTrjukyuinvList == null) { _tTrjukyuinvList = newReferrerList(); }
        return _tTrjukyuinvList;
    }

    /**
     * [set] T_TRJUKYUINV by CLIENT_ID, named 'TTrjukyuinvList'.
     * @param tTrjukyuinvList The entity list of referrer property 'TTrjukyuinvList'. (NullAllowed)
     */
    public void setTTrjukyuinvList(List<TTrjukyuinv> tTrjukyuinvList) {
        _tTrjukyuinvList = tTrjukyuinvList;
    }

    /** T_TRMANUFACTUREDATE by CLIENT_ID, named 'TTrmanufacturedateList'. */
    protected List<TTrmanufacturedate> _tTrmanufacturedateList;

    /**
     * [get] T_TRMANUFACTUREDATE by CLIENT_ID, named 'TTrmanufacturedateList'.
     * @return The entity list of referrer property 'TTrmanufacturedateList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrmanufacturedate> getTTrmanufacturedateList() {
        if (_tTrmanufacturedateList == null) { _tTrmanufacturedateList = newReferrerList(); }
        return _tTrmanufacturedateList;
    }

    /**
     * [set] T_TRMANUFACTUREDATE by CLIENT_ID, named 'TTrmanufacturedateList'.
     * @param tTrmanufacturedateList The entity list of referrer property 'TTrmanufacturedateList'. (NullAllowed)
     */
    public void setTTrmanufacturedateList(List<TTrmanufacturedate> tTrmanufacturedateList) {
        _tTrmanufacturedateList = tTrmanufacturedateList;
    }

    /** T_TRMANUFACTUREDATEDETAIL by CLIENT_ID, named 'TTrmanufacturedatedetailList'. */
    protected List<TTrmanufacturedatedetail> _tTrmanufacturedatedetailList;

    /**
     * [get] T_TRMANUFACTUREDATEDETAIL by CLIENT_ID, named 'TTrmanufacturedatedetailList'.
     * @return The entity list of referrer property 'TTrmanufacturedatedetailList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrmanufacturedatedetail> getTTrmanufacturedatedetailList() {
        if (_tTrmanufacturedatedetailList == null) { _tTrmanufacturedatedetailList = newReferrerList(); }
        return _tTrmanufacturedatedetailList;
    }

    /**
     * [set] T_TRMANUFACTUREDATEDETAIL by CLIENT_ID, named 'TTrmanufacturedatedetailList'.
     * @param tTrmanufacturedatedetailList The entity list of referrer property 'TTrmanufacturedatedetailList'. (NullAllowed)
     */
    public void setTTrmanufacturedatedetailList(List<TTrmanufacturedatedetail> tTrmanufacturedatedetailList) {
        _tTrmanufacturedatedetailList = tTrmanufacturedatedetailList;
    }

    /** T_TRMANUFACTUREDATEHISTORY by CLIENT_ID, named 'TTrmanufacturedatehistoryList'. */
    protected List<TTrmanufacturedatehistory> _tTrmanufacturedatehistoryList;

    /**
     * [get] T_TRMANUFACTUREDATEHISTORY by CLIENT_ID, named 'TTrmanufacturedatehistoryList'.
     * @return The entity list of referrer property 'TTrmanufacturedatehistoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrmanufacturedatehistory> getTTrmanufacturedatehistoryList() {
        if (_tTrmanufacturedatehistoryList == null) { _tTrmanufacturedatehistoryList = newReferrerList(); }
        return _tTrmanufacturedatehistoryList;
    }

    /**
     * [set] T_TRMANUFACTUREDATEHISTORY by CLIENT_ID, named 'TTrmanufacturedatehistoryList'.
     * @param tTrmanufacturedatehistoryList The entity list of referrer property 'TTrmanufacturedatehistoryList'. (NullAllowed)
     */
    public void setTTrmanufacturedatehistoryList(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList) {
        _tTrmanufacturedatehistoryList = tTrmanufacturedatehistoryList;
    }

    /** T_TRPALLETTRACE by CLIENT_ID, named 'TTrpallettraceList'. */
    protected List<TTrpallettrace> _tTrpallettraceList;

    /**
     * [get] T_TRPALLETTRACE by CLIENT_ID, named 'TTrpallettraceList'.
     * @return The entity list of referrer property 'TTrpallettraceList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrpallettrace> getTTrpallettraceList() {
        if (_tTrpallettraceList == null) { _tTrpallettraceList = newReferrerList(); }
        return _tTrpallettraceList;
    }

    /**
     * [set] T_TRPALLETTRACE by CLIENT_ID, named 'TTrpallettraceList'.
     * @param tTrpallettraceList The entity list of referrer property 'TTrpallettraceList'. (NullAllowed)
     */
    public void setTTrpallettraceList(List<TTrpallettrace> tTrpallettraceList) {
        _tTrpallettraceList = tTrpallettraceList;
    }

    /** T_TRREVERSESTOCK by CLIENT_ID, named 'TTrreversestockList'. */
    protected List<TTrreversestock> _tTrreversestockList;

    /**
     * [get] T_TRREVERSESTOCK by CLIENT_ID, named 'TTrreversestockList'.
     * @return The entity list of referrer property 'TTrreversestockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrreversestock> getTTrreversestockList() {
        if (_tTrreversestockList == null) { _tTrreversestockList = newReferrerList(); }
        return _tTrreversestockList;
    }

    /**
     * [set] T_TRREVERSESTOCK by CLIENT_ID, named 'TTrreversestockList'.
     * @param tTrreversestockList The entity list of referrer property 'TTrreversestockList'. (NullAllowed)
     */
    public void setTTrreversestockList(List<TTrreversestock> tTrreversestockList) {
        _tTrreversestockList = tTrreversestockList;
    }

    /** T_TRSTOCKDIFFHISTORY by CLIENT_ID, named 'TTrstockdiffhistoryList'. */
    protected List<TTrstockdiffhistory> _tTrstockdiffhistoryList;

    /**
     * [get] T_TRSTOCKDIFFHISTORY by CLIENT_ID, named 'TTrstockdiffhistoryList'.
     * @return The entity list of referrer property 'TTrstockdiffhistoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrstockdiffhistory> getTTrstockdiffhistoryList() {
        if (_tTrstockdiffhistoryList == null) { _tTrstockdiffhistoryList = newReferrerList(); }
        return _tTrstockdiffhistoryList;
    }

    /**
     * [set] T_TRSTOCKDIFFHISTORY by CLIENT_ID, named 'TTrstockdiffhistoryList'.
     * @param tTrstockdiffhistoryList The entity list of referrer property 'TTrstockdiffhistoryList'. (NullAllowed)
     */
    public void setTTrstockdiffhistoryList(List<TTrstockdiffhistory> tTrstockdiffhistoryList) {
        _tTrstockdiffhistoryList = tTrstockdiffhistoryList;
    }

    /** T_TRSYMBOLTRACE by CLIENT_ID, named 'TTrsymboltraceList'. */
    protected List<TTrsymboltrace> _tTrsymboltraceList;

    /**
     * [get] T_TRSYMBOLTRACE by CLIENT_ID, named 'TTrsymboltraceList'.
     * @return The entity list of referrer property 'TTrsymboltraceList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrsymboltrace> getTTrsymboltraceList() {
        if (_tTrsymboltraceList == null) { _tTrsymboltraceList = newReferrerList(); }
        return _tTrsymboltraceList;
    }

    /**
     * [set] T_TRSYMBOLTRACE by CLIENT_ID, named 'TTrsymboltraceList'.
     * @param tTrsymboltraceList The entity list of referrer property 'TTrsymboltraceList'. (NullAllowed)
     */
    public void setTTrsymboltraceList(List<TTrsymboltrace> tTrsymboltraceList) {
        _tTrsymboltraceList = tTrsymboltraceList;
    }

    /** T_TRSYMBOLTRACEEXTEND by CLIENT_ID, named 'TTrsymboltraceextendList'. */
    protected List<TTrsymboltraceextend> _tTrsymboltraceextendList;

    /**
     * [get] T_TRSYMBOLTRACEEXTEND by CLIENT_ID, named 'TTrsymboltraceextendList'.
     * @return The entity list of referrer property 'TTrsymboltraceextendList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrsymboltraceextend> getTTrsymboltraceextendList() {
        if (_tTrsymboltraceextendList == null) { _tTrsymboltraceextendList = newReferrerList(); }
        return _tTrsymboltraceextendList;
    }

    /**
     * [set] T_TRSYMBOLTRACEEXTEND by CLIENT_ID, named 'TTrsymboltraceextendList'.
     * @param tTrsymboltraceextendList The entity list of referrer property 'TTrsymboltraceextendList'. (NullAllowed)
     */
    public void setTTrsymboltraceextendList(List<TTrsymboltraceextend> tTrsymboltraceextendList) {
        _tTrsymboltraceextendList = tTrsymboltraceextendList;
    }

    /** T_TRTRACE by CLIENT_ID, named 'TTrtraceList'. */
    protected List<TTrtrace> _tTrtraceList;

    /**
     * [get] T_TRTRACE by CLIENT_ID, named 'TTrtraceList'.
     * @return The entity list of referrer property 'TTrtraceList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrtrace> getTTrtraceList() {
        if (_tTrtraceList == null) { _tTrtraceList = newReferrerList(); }
        return _tTrtraceList;
    }

    /**
     * [set] T_TRTRACE by CLIENT_ID, named 'TTrtraceList'.
     * @param tTrtraceList The entity list of referrer property 'TTrtraceList'. (NullAllowed)
     */
    public void setTTrtraceList(List<TTrtrace> tTrtraceList) {
        _tTrtraceList = tTrtraceList;
    }

    /** T_YTRSO by CLIENT_ID, named 'TYtrsoList'. */
    protected List<TYtrso> _tYtrsoList;

    /**
     * [get] T_YTRSO by CLIENT_ID, named 'TYtrsoList'.
     * @return The entity list of referrer property 'TYtrsoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TYtrso> getTYtrsoList() {
        if (_tYtrsoList == null) { _tYtrsoList = newReferrerList(); }
        return _tYtrsoList;
    }

    /**
     * [set] T_YTRSO by CLIENT_ID, named 'TYtrsoList'.
     * @param tYtrsoList The entity list of referrer property 'TYtrsoList'. (NullAllowed)
     */
    public void setTYtrsoList(List<TYtrso> tYtrsoList) {
        _tYtrsoList = tYtrsoList;
    }

    /** W_HT_INVENTORY_INPUT_PROD by CLIENT_ID, named 'WHtInventoryInputProdList'. */
    protected List<WHtInventoryInputProd> _wHtInventoryInputProdList;

    /**
     * [get] W_HT_INVENTORY_INPUT_PROD by CLIENT_ID, named 'WHtInventoryInputProdList'.
     * @return The entity list of referrer property 'WHtInventoryInputProdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtInventoryInputProd> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = newReferrerList(); }
        return _wHtInventoryInputProdList;
    }

    /**
     * [set] W_HT_INVENTORY_INPUT_PROD by CLIENT_ID, named 'WHtInventoryInputProdList'.
     * @param wHtInventoryInputProdList The entity list of referrer property 'WHtInventoryInputProdList'. (NullAllowed)
     */
    public void setWHtInventoryInputProdList(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        _wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    /** W_HT_LOADING by CLIENT_ID, named 'WHtLoadingList'. */
    protected List<WHtLoading> _wHtLoadingList;

    /**
     * [get] W_HT_LOADING by CLIENT_ID, named 'WHtLoadingList'.
     * @return The entity list of referrer property 'WHtLoadingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtLoading> getWHtLoadingList() {
        if (_wHtLoadingList == null) { _wHtLoadingList = newReferrerList(); }
        return _wHtLoadingList;
    }

    /**
     * [set] W_HT_LOADING by CLIENT_ID, named 'WHtLoadingList'.
     * @param wHtLoadingList The entity list of referrer property 'WHtLoadingList'. (NullAllowed)
     */
    public void setWHtLoadingList(List<WHtLoading> wHtLoadingList) {
        _wHtLoadingList = wHtLoadingList;
    }

    /** W_HT_RECEIVE_INSPECTION by CLIENT_ID, named 'WHtReceiveInspectionList'. */
    protected List<WHtReceiveInspection> _wHtReceiveInspectionList;

    /**
     * [get] W_HT_RECEIVE_INSPECTION by CLIENT_ID, named 'WHtReceiveInspectionList'.
     * @return The entity list of referrer property 'WHtReceiveInspectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveInspection> getWHtReceiveInspectionList() {
        if (_wHtReceiveInspectionList == null) { _wHtReceiveInspectionList = newReferrerList(); }
        return _wHtReceiveInspectionList;
    }

    /**
     * [set] W_HT_RECEIVE_INSPECTION by CLIENT_ID, named 'WHtReceiveInspectionList'.
     * @param wHtReceiveInspectionList The entity list of referrer property 'WHtReceiveInspectionList'. (NullAllowed)
     */
    public void setWHtReceiveInspectionList(List<WHtReceiveInspection> wHtReceiveInspectionList) {
        _wHtReceiveInspectionList = wHtReceiveInspectionList;
    }

    /** W_HT_RECEIVE_NO_PLAN_INSP by CLIENT_ID, named 'WHtReceiveNoPlanInspList'. */
    protected List<WHtReceiveNoPlanInsp> _wHtReceiveNoPlanInspList;

    /**
     * [get] W_HT_RECEIVE_NO_PLAN_INSP by CLIENT_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveNoPlanInsp> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = newReferrerList(); }
        return _wHtReceiveNoPlanInspList;
    }

    /**
     * [set] W_HT_RECEIVE_NO_PLAN_INSP by CLIENT_ID, named 'WHtReceiveNoPlanInspList'.
     * @param wHtReceiveNoPlanInspList The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NullAllowed)
     */
    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        _wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    /** W_HT_RECEIVE_STORE by CLIENT_ID, named 'WHtReceiveStoreList'. */
    protected List<WHtReceiveStore> _wHtReceiveStoreList;

    /**
     * [get] W_HT_RECEIVE_STORE by CLIENT_ID, named 'WHtReceiveStoreList'.
     * @return The entity list of referrer property 'WHtReceiveStoreList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveStore> getWHtReceiveStoreList() {
        if (_wHtReceiveStoreList == null) { _wHtReceiveStoreList = newReferrerList(); }
        return _wHtReceiveStoreList;
    }

    /**
     * [set] W_HT_RECEIVE_STORE by CLIENT_ID, named 'WHtReceiveStoreList'.
     * @param wHtReceiveStoreList The entity list of referrer property 'WHtReceiveStoreList'. (NullAllowed)
     */
    public void setWHtReceiveStoreList(List<WHtReceiveStore> wHtReceiveStoreList) {
        _wHtReceiveStoreList = wHtReceiveStoreList;
    }

    /** W_HT_SERIAL_RECEIVE_INSP by CLIENT_ID, named 'WHtSerialReceiveInspList'. */
    protected List<WHtSerialReceiveInsp> _wHtSerialReceiveInspList;

    /**
     * [get] W_HT_SERIAL_RECEIVE_INSP by CLIENT_ID, named 'WHtSerialReceiveInspList'.
     * @return The entity list of referrer property 'WHtSerialReceiveInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtSerialReceiveInsp> getWHtSerialReceiveInspList() {
        if (_wHtSerialReceiveInspList == null) { _wHtSerialReceiveInspList = newReferrerList(); }
        return _wHtSerialReceiveInspList;
    }

    /**
     * [set] W_HT_SERIAL_RECEIVE_INSP by CLIENT_ID, named 'WHtSerialReceiveInspList'.
     * @param wHtSerialReceiveInspList The entity list of referrer property 'WHtSerialReceiveInspList'. (NullAllowed)
     */
    public void setWHtSerialReceiveInspList(List<WHtSerialReceiveInsp> wHtSerialReceiveInspList) {
        _wHtSerialReceiveInspList = wHtSerialReceiveInspList;
    }

    /** W_HT_SERIAL_SHIPPING_INSP by CLIENT_ID, named 'WHtSerialShippingInspList'. */
    protected List<WHtSerialShippingInsp> _wHtSerialShippingInspList;

    /**
     * [get] W_HT_SERIAL_SHIPPING_INSP by CLIENT_ID, named 'WHtSerialShippingInspList'.
     * @return The entity list of referrer property 'WHtSerialShippingInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtSerialShippingInsp> getWHtSerialShippingInspList() {
        if (_wHtSerialShippingInspList == null) { _wHtSerialShippingInspList = newReferrerList(); }
        return _wHtSerialShippingInspList;
    }

    /**
     * [set] W_HT_SERIAL_SHIPPING_INSP by CLIENT_ID, named 'WHtSerialShippingInspList'.
     * @param wHtSerialShippingInspList The entity list of referrer property 'WHtSerialShippingInspList'. (NullAllowed)
     */
    public void setWHtSerialShippingInspList(List<WHtSerialShippingInsp> wHtSerialShippingInspList) {
        _wHtSerialShippingInspList = wHtSerialShippingInspList;
    }

    /** W_HT_SHIPPING by CLIENT_ID, named 'WHtShippingList'. */
    protected List<WHtShipping> _wHtShippingList;

    /**
     * [get] W_HT_SHIPPING by CLIENT_ID, named 'WHtShippingList'.
     * @return The entity list of referrer property 'WHtShippingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtShipping> getWHtShippingList() {
        if (_wHtShippingList == null) { _wHtShippingList = newReferrerList(); }
        return _wHtShippingList;
    }

    /**
     * [set] W_HT_SHIPPING by CLIENT_ID, named 'WHtShippingList'.
     * @param wHtShippingList The entity list of referrer property 'WHtShippingList'. (NullAllowed)
     */
    public void setWHtShippingList(List<WHtShipping> wHtShippingList) {
        _wHtShippingList = wHtShippingList;
    }

    /** W_HT_SHIPPING_PICKING by CLIENT_ID, named 'WHtShippingPickingList'. */
    protected List<WHtShippingPicking> _wHtShippingPickingList;

    /**
     * [get] W_HT_SHIPPING_PICKING by CLIENT_ID, named 'WHtShippingPickingList'.
     * @return The entity list of referrer property 'WHtShippingPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtShippingPicking> getWHtShippingPickingList() {
        if (_wHtShippingPickingList == null) { _wHtShippingPickingList = newReferrerList(); }
        return _wHtShippingPickingList;
    }

    /**
     * [set] W_HT_SHIPPING_PICKING by CLIENT_ID, named 'WHtShippingPickingList'.
     * @param wHtShippingPickingList The entity list of referrer property 'WHtShippingPickingList'. (NullAllowed)
     */
    public void setWHtShippingPickingList(List<WHtShippingPicking> wHtShippingPickingList) {
        _wHtShippingPickingList = wHtShippingPickingList;
    }

    /** W_SGL_ROW_SHIP_INSP_H by CLIENT_ID, named 'WSglRowShipInspHList'. */
    protected List<WSglRowShipInspH> _wSglRowShipInspHList;

    /**
     * [get] W_SGL_ROW_SHIP_INSP_H by CLIENT_ID, named 'WSglRowShipInspHList'.
     * @return The entity list of referrer property 'WSglRowShipInspHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WSglRowShipInspH> getWSglRowShipInspHList() {
        if (_wSglRowShipInspHList == null) { _wSglRowShipInspHList = newReferrerList(); }
        return _wSglRowShipInspHList;
    }

    /**
     * [set] W_SGL_ROW_SHIP_INSP_H by CLIENT_ID, named 'WSglRowShipInspHList'.
     * @param wSglRowShipInspHList The entity list of referrer property 'WSglRowShipInspHList'. (NullAllowed)
     */
    public void setWSglRowShipInspHList(List<WSglRowShipInspH> wSglRowShipInspHList) {
        _wSglRowShipInspHList = wSglRowShipInspHList;
    }

    /** W_SHIPPING_INTERRUPT by CLIENT_ID, named 'WShippingInterruptList'. */
    protected List<WShippingInterrupt> _wShippingInterruptList;

    /**
     * [get] W_SHIPPING_INTERRUPT by CLIENT_ID, named 'WShippingInterruptList'.
     * @return The entity list of referrer property 'WShippingInterruptList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WShippingInterrupt> getWShippingInterruptList() {
        if (_wShippingInterruptList == null) { _wShippingInterruptList = newReferrerList(); }
        return _wShippingInterruptList;
    }

    /**
     * [set] W_SHIPPING_INTERRUPT by CLIENT_ID, named 'WShippingInterruptList'.
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
        if (obj instanceof BsMClient) {
            BsMClient other = (BsMClient)obj;
            if (!xSV(_clientId, other._clientId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clientId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCustomer != null)
        { sb.append(li).append(xbRDS(_mCustomer, "mCustomer")); }
        if (_mShapeGrp != null)
        { sb.append(li).append(xbRDS(_mShapeGrp, "mShapeGrp")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_mCbrctgList != null) { for (MCbrctg et : _mCbrctgList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCbrctgList")); } } }
        if (_mCdrcattList != null) { for (MCdrcatt et : _mCdrcattList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCdrcattList")); } } }
        if (_mClientCenterList != null) { for (MClientCenter et : _mClientCenterList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientCenterList")); } } }
        if (_mClientColList != null) { for (MClientCol et : _mClientColList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientColList")); } } }
        if (_mClientItemList != null) { for (MClientItem et : _mClientItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientItemList")); } } }
        if (_mClientScreenList != null) { for (MClientScreen et : _mClientScreenList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientScreenList")); } } }
        if (_mCustomerList != null) { for (MCustomer et : _mCustomerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCustomerList")); } } }
        if (_mImportTypeList != null) { for (MImportType et : _mImportTypeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mImportTypeList")); } } }
        if (_mMfinvoperationList != null) { for (MMfinvoperation et : _mMfinvoperationList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mMfinvoperationList")); } } }
        if (_mMfmonthchgList != null) { for (MMfmonthchg et : _mMfmonthchgList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mMfmonthchgList")); } } }
        if (_mMfpickctlList != null) { for (MMfpickctl et : _mMfpickctlList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mMfpickctlList")); } } }
        if (_mMfrcvdesignList != null) { for (MMfrcvdesign et : _mMfrcvdesignList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mMfrcvdesignList")); } } }
        if (_mMfrcvitemList != null) { for (MMfrcvitem et : _mMfrcvitemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mMfrcvitemList")); } } }
        if (_mMfwhxitemList != null) { for (MMfwhxitem et : _mMfwhxitemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mMfwhxitemList")); } } }
        if (_mProductList != null) { for (MProduct et : _mProductList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mProductList")); } } }
        if (_mShapeGrpList != null) { for (MShapeGrp et : _mShapeGrpList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mShapeGrpList")); } } }
        if (_mUserClientList != null) { for (MUserClient et : _mUserClientList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mUserClientList")); } } }
        if (_mUserLoginList != null) { for (MUserLogin et : _mUserLoginList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mUserLoginList")); } } }
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
        if (_tStockList != null) { for (TStock et : _tStockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockList")); } } }
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
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_clientAbbr));
        sb.append(dm).append(xfND(_customerId));
        sb.append(dm).append(xfND(_shapeGrpId));
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
        if (_mCustomer != null)
        { sb.append(dm).append("mCustomer"); }
        if (_mShapeGrp != null)
        { sb.append(dm).append("mShapeGrp"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_mCbrctgList != null && !_mCbrctgList.isEmpty())
        { sb.append(dm).append("mCbrctgList"); }
        if (_mCdrcattList != null && !_mCdrcattList.isEmpty())
        { sb.append(dm).append("mCdrcattList"); }
        if (_mClientCenterList != null && !_mClientCenterList.isEmpty())
        { sb.append(dm).append("mClientCenterList"); }
        if (_mClientColList != null && !_mClientColList.isEmpty())
        { sb.append(dm).append("mClientColList"); }
        if (_mClientItemList != null && !_mClientItemList.isEmpty())
        { sb.append(dm).append("mClientItemList"); }
        if (_mClientScreenList != null && !_mClientScreenList.isEmpty())
        { sb.append(dm).append("mClientScreenList"); }
        if (_mCustomerList != null && !_mCustomerList.isEmpty())
        { sb.append(dm).append("mCustomerList"); }
        if (_mImportTypeList != null && !_mImportTypeList.isEmpty())
        { sb.append(dm).append("mImportTypeList"); }
        if (_mMfinvoperationList != null && !_mMfinvoperationList.isEmpty())
        { sb.append(dm).append("mMfinvoperationList"); }
        if (_mMfmonthchgList != null && !_mMfmonthchgList.isEmpty())
        { sb.append(dm).append("mMfmonthchgList"); }
        if (_mMfpickctlList != null && !_mMfpickctlList.isEmpty())
        { sb.append(dm).append("mMfpickctlList"); }
        if (_mMfrcvdesignList != null && !_mMfrcvdesignList.isEmpty())
        { sb.append(dm).append("mMfrcvdesignList"); }
        if (_mMfrcvitemList != null && !_mMfrcvitemList.isEmpty())
        { sb.append(dm).append("mMfrcvitemList"); }
        if (_mMfwhxitemList != null && !_mMfwhxitemList.isEmpty())
        { sb.append(dm).append("mMfwhxitemList"); }
        if (_mProductList != null && !_mProductList.isEmpty())
        { sb.append(dm).append("mProductList"); }
        if (_mShapeGrpList != null && !_mShapeGrpList.isEmpty())
        { sb.append(dm).append("mShapeGrpList"); }
        if (_mUserClientList != null && !_mUserClientList.isEmpty())
        { sb.append(dm).append("mUserClientList"); }
        if (_mUserLoginList != null && !_mUserLoginList.isEmpty())
        { sb.append(dm).append("mUserLoginList"); }
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
        if (_tStockList != null && !_tStockList.isEmpty())
        { sb.append(dm).append("tStockList"); }
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
    public MClient clone() {
        return (MClient)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {UQ, NotNull, varchar(30)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {UQ, NotNull, varchar(30)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {NotNull, varchar(60)} <br>
     * 荷主名称
     * @return The value of the column 'CLIENT_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {NotNull, varchar(60)} <br>
     * 荷主名称
     * @param clientNm The value of the column 'CLIENT_NM'. (basically NotNull if update: for the constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }

    /**
     * [get] CLIENT_ABBR: {varchar(60)} <br>
     * 荷主略称
     * @return The value of the column 'CLIENT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientAbbr() {
        checkSpecifiedProperty("clientAbbr");
        return convertEmptyToNull(_clientAbbr);
    }

    /**
     * [set] CLIENT_ABBR: {varchar(60)} <br>
     * 荷主略称
     * @param clientAbbr The value of the column 'CLIENT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientAbbr(String clientAbbr) {
        registerModifiedProperty("clientAbbr");
        _clientAbbr = clientAbbr;
    }

    /**
     * [get] CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 荷主取引先ID
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCustomerId() {
        checkSpecifiedProperty("customerId");
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 荷主取引先ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerId(Long customerId) {
        registerModifiedProperty("customerId");
        _customerId = customerId;
    }

    /**
     * [get] SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP} <br>
     * 荷姿グループID
     * @return The value of the column 'SHAPE_GRP_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShapeGrpId() {
        checkSpecifiedProperty("shapeGrpId");
        return _shapeGrpId;
    }

    /**
     * [set] SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP} <br>
     * 荷姿グループID
     * @param shapeGrpId The value of the column 'SHAPE_GRP_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeGrpId(Long shapeGrpId) {
        registerModifiedProperty("shapeGrpId");
        _shapeGrpId = shapeGrpId;
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
