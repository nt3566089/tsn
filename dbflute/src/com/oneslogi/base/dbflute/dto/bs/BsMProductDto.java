package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_PRODUCT as TABLE. <br>
 * 銘柄マスタ
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, CLIENT_ID, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, LOT_MANAG_FLG, LIMIT_DT_MANAG_FLG, RECEIVE_LIMIT_NUM, SHIPPING_LIMIT_NUM, MERGE_CLS, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, SHIPPING_STOP_FLG, FIXED_POINT, SHAPE_GRP_ID, NMFC_CODE, FREIGHT_CLS, COUNNTRY_OF_ORIGIN, UNIT_VAL, HTS_CD, ITEMGROUP, ACTFLG, INVTYPE, SETITEMFLG, OWNERITEMCD, SUPPLIERITEMCD, POSITEMCD, ITFCD, MANUITEMCD, PRICE_BUY, PRICE_WHOLESALE, PRICE_SALE, ALLOCPOLICYKEY, SLOTPOLICYKEY, INWORKINGKEY, OUTWORKINGKEY, ABCTYPE, QTY1TYPE, UNIT1, UNIT1STYLE, LENGTH1, WIDTH1, HEIGHT1, GROSSWEIGHT1, NETWEIGHT1, CUBE1, LITER1, UNIT2, UNIT2STYLE, LENGTH2, WIDTH2, HEIGHT2, GROSSWEIGHT2, NETWEIGHT2, CUBE2, LITER2, UNIT3, UNIT3STYLE, LENGTH3, WIDTH3, HEIGHT3, GROSSWEIGHT3, NETWEIGHT3, CUBE3, LITER3, P_QTY, P_HEIGHT, P_ODD, P_DESCRIPTION, NOTES, QTY2USEDFLG, QTY2STYLE, QTY3USEDFLG, QTY3STYLE, SP_CALCFLG, SP_LOTATRB1USEDFLG, SP_OPERATOR1, SP_LOTATRB2USEDFLG, SP_OPERATOR2, SP_LOTATRB3USEDFLG, SP_OPERATOR3, SP_RATE, LOTATRB1TITLE, LOTATRB2TITLE, LOTATRB3TITLE, LOTATRB4TITLE, LOTATRB5TITLE, LOTATRB6TITLE, LOTATRB7TITLE, LOTATRB8TITLE, LOTATRB9TITLE, LOTATRB10TITLE, F_USER1, F_USER2, F_USER3, F_USER4, F_USER5, ITEM40, PRICE_INSURANCE, LIMITDAY, DELIVERABLEDAY, PRINTDATEFLG, SUPPLIERCD, DISPATCHQTYTYPE, TARIFFQTYTYPE, USERUSE1, USERUSE2, USERUSE3, USERUSE4, USERUSE5, LOT1NULLFLG, LOT2NULLFLG, LOT3NULLFLG, LOT4NULLFLG, LOT5NULLFLG, OTHERLOT1NULLFLG, OTHERLOT2NULLFLG, OTHERLOT3NULLFLG, OTHERLOT4NULLFLG, OTHERLOT5NULLFLG, ITEMPRINTNAME, PRICELEVEL, ITEMCATALOGURL, USERNUM1, USERNUM2, USERNUM3, USERNUM4, USERNUM5, USERDATE1, USERDATE2, USERDATE3, USERDATE4, USERDATE5, CGGDID, BRCTG, CTWEIGHT, BXOSZL, BXOSZW, BXOSZH, BXCPY, BXWEIGHT, ITEM_ADMIN, SNAME, FractionPieceWeight, TaxEquivalentNumber, SYHNKBNJT, IOID_CLS, ITFCD_CLS, MANUITEMCD_CLS, CTCPY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CLIENT, M_PRODUCT, M_SHAPE_GRP, B_CLASS_DTL(ByDelFlg), M_PRODUCT_TERM(AsOne), M_SET_PARENT(AsOne)
 *
 * [referrer-table]
 *     M_LOCATION, M_MFWHxITEM, M_PRODUCT_SHAPE, M_SET_STRUCTURE, T_ALLOC_INST_B, T_ALLOC_LOT, T_INVENTORY_B, T_KEEPING_LOT, T_LAST_LOT, T_LOT, T_MOVE_INST_B, T_RECEIVE_PLAN_B, T_SERIAL_NO, T_SHIPPING_INST_B, T_STOCK, T_TRINVCHECKINFO, T_YTRSODETAIL, W_HT_INVENTORY_INPUT_PROD, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SHIPPING, W_HT_SHIPPING_PICKING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT, M_PRODUCT, M_PRODUCT_TERM, M_SET_PARENT
 *
 * [foreign-property]
 *     mClient, mProductSelf, mShapeGrp, bClassDtlByDelFlg, bClassDtlByLimitDtManagFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotManagFlg, bClassDtlByLotReverseFlg, bClassDtlByMergeCls, bClassDtlByShippingStopFlg, bClassDtlByFreightCls, mProductSelfAsOne, mProductTermAsOne, mSetParentAsOne
 *
 * [referrer-property]
 *     mLocationList, mMfwhxitemList, mProductShapeList, mSetStructureList, tAllocInstBList, tAllocLotList, tInventoryBList, tKeepingLotList, tLastLotList, tLotList, tMoveInstBList, tReceivePlanBList, tSerialNoList, tShippingInstBList, tStockList, tTrinvcheckinfoList, tYtrsodetailList, wHtInventoryInputProdList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtShippingList, wHtShippingPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMProductDto implements Serializable {

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
    /** PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT} */
    @JsonKey
    protected Long _productId;

    /** CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {NotNull, varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** PRODUCT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** JAN_CD: {IX, varchar(30)} */
    @JsonKey
    protected String _janCd;

    /** LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} */
    @JsonKey
    protected String _lotManagFlg;

    /** LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} */
    @JsonKey
    protected String _limitDtManagFlg;

    /** RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _receiveLimitNum;

    /** SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _shippingLimitNum;

    /** MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} */
    @JsonKey
    protected String _mergeCls;

    /** LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} */
    @JsonKey
    protected String _lotReverseFlg;

    /** LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} */
    @JsonKey
    protected String _limitDtReverseFlg;

    /** SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} */
    @JsonKey
    protected String _shippingStopFlg;

    /** FIXED_POINT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _fixedPoint;

    /** SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP} */
    @JsonKey
    protected Long _shapeGrpId;

    /** NMFC_CODE: {varchar(30)} */
    @JsonKey
    protected String _nmfcCode;

    /** FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls} */
    @JsonKey
    protected String _freightCls;

    /** COUNNTRY_OF_ORIGIN: {varchar(30)} */
    @JsonKey
    protected String _counntryOfOrigin;

    /** UNIT_VAL: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _unitVal;

    /** HTS_CD: {varchar(30)} */
    @JsonKey
    protected String _htsCd;

    /** ITEMGROUP: {varchar(60)} */
    @JsonKey
    protected String _itemgroup;

    /** ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} */
    @JsonKey
    protected java.math.BigDecimal _actflg;

    /** INVTYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _invtype;

    /** SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _setitemflg;

    /** OWNERITEMCD: {varchar(30)} */
    @JsonKey
    protected String _owneritemcd;

    /** SUPPLIERITEMCD: {varchar(30)} */
    @JsonKey
    protected String _supplieritemcd;

    /** POSITEMCD: {varchar(30)} */
    @JsonKey
    protected String _positemcd;

    /** ITFCD: {varchar(30)} */
    @JsonKey
    protected String _itfcd;

    /** MANUITEMCD: {varchar(30)} */
    @JsonKey
    protected String _manuitemcd;

    /** PRICE_BUY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _priceBuy;

    /** PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _priceWholesale;

    /** PRICE_SALE: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _priceSale;

    /** ALLOCPOLICYKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _allocpolicykey;

    /** SLOTPOLICYKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _slotpolicykey;

    /** INWORKINGKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _inworkingkey;

    /** OUTWORKINGKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _outworkingkey;

    /** ABCTYPE: {varchar(30)} */
    @JsonKey
    protected String _abctype;

    /** QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _qty1type;

    /** UNIT1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _unit1;

    /** UNIT1STYLE: {varchar(60)} */
    @JsonKey
    protected String _unit1style;

    /** LENGTH1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _length1;

    /** WIDTH1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _width1;

    /** HEIGHT1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _height1;

    /** GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _grossweight1;

    /** NETWEIGHT1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _netweight1;

    /** CUBE1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _cube1;

    /** LITER1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _liter1;

    /** UNIT2: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _unit2;

    /** UNIT2STYLE: {varchar(60)} */
    @JsonKey
    protected String _unit2style;

    /** LENGTH2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _length2;

    /** WIDTH2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _width2;

    /** HEIGHT2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _height2;

    /** GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _grossweight2;

    /** NETWEIGHT2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _netweight2;

    /** CUBE2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _cube2;

    /** LITER2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _liter2;

    /** UNIT3: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _unit3;

    /** UNIT3STYLE: {varchar(60)} */
    @JsonKey
    protected String _unit3style;

    /** LENGTH3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _length3;

    /** WIDTH3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _width3;

    /** HEIGHT3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _height3;

    /** GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _grossweight3;

    /** NETWEIGHT3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _netweight3;

    /** CUBE3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _cube3;

    /** LITER3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _liter3;

    /** P_QTY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _pQty;

    /** P_HEIGHT: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _pHeight;

    /** P_ODD: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _pOdd;

    /** P_DESCRIPTION: {varchar(4000)} */
    @JsonKey
    protected String _pDescription;

    /** NOTES: {varchar(4000)} */
    @JsonKey
    protected String _notes;

    /** QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _qty2usedflg;

    /** QTY2STYLE: {varchar(60)} */
    @JsonKey
    protected String _qty2style;

    /** QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _qty3usedflg;

    /** QTY3STYLE: {varchar(60)} */
    @JsonKey
    protected String _qty3style;

    /** SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _spCalcflg;

    /** SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _spLotatrb1usedflg;

    /** SP_OPERATOR1: {varchar(30)} */
    @JsonKey
    protected String _spOperator1;

    /** SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _spLotatrb2usedflg;

    /** SP_OPERATOR2: {varchar(30)} */
    @JsonKey
    protected String _spOperator2;

    /** SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _spLotatrb3usedflg;

    /** SP_OPERATOR3: {varchar(30)} */
    @JsonKey
    protected String _spOperator3;

    /** SP_RATE: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _spRate;

    /** LOTATRB1TITLE: {varchar(60)} */
    @JsonKey
    protected String _lotatrb1title;

    /** LOTATRB2TITLE: {varchar(60)} */
    @JsonKey
    protected String _lotatrb2title;

    /** LOTATRB3TITLE: {varchar(60)} */
    @JsonKey
    protected String _lotatrb3title;

    /** LOTATRB4TITLE: {varchar(60)} */
    @JsonKey
    protected String _lotatrb4title;

    /** LOTATRB5TITLE: {varchar(60)} */
    @JsonKey
    protected String _lotatrb5title;

    /** LOTATRB6TITLE: {varchar(60)} */
    @JsonKey
    protected String _lotatrb6title;

    /** LOTATRB7TITLE: {varchar(60)} */
    @JsonKey
    protected String _lotatrb7title;

    /** LOTATRB8TITLE: {varchar(60)} */
    @JsonKey
    protected String _lotatrb8title;

    /** LOTATRB9TITLE: {varchar(60)} */
    @JsonKey
    protected String _lotatrb9title;

    /** LOTATRB10TITLE: {varchar(60)} */
    @JsonKey
    protected String _lotatrb10title;

    /** F_USER1: {varchar(30)} */
    @JsonKey
    protected String _fUser1;

    /** F_USER2: {varchar(30)} */
    @JsonKey
    protected String _fUser2;

    /** F_USER3: {varchar(30)} */
    @JsonKey
    protected String _fUser3;

    /** F_USER4: {varchar(30)} */
    @JsonKey
    protected String _fUser4;

    /** F_USER5: {varchar(30)} */
    @JsonKey
    protected String _fUser5;

    /** ITEM40: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _item40;

    /** PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _priceInsurance;

    /** LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _limitday;

    /** DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _deliverableday;

    /** PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _printdateflg;

    /** SUPPLIERCD: {varchar(30)} */
    @JsonKey
    protected String _suppliercd;

    /** DISPATCHQTYTYPE: {varchar(30)} */
    @JsonKey
    protected String _dispatchqtytype;

    /** TARIFFQTYTYPE: {varchar(30)} */
    @JsonKey
    protected String _tariffqtytype;

    /** USERUSE1: {varchar(60)} */
    @JsonKey
    protected String _useruse1;

    /** USERUSE2: {varchar(60)} */
    @JsonKey
    protected String _useruse2;

    /** USERUSE3: {varchar(60)} */
    @JsonKey
    protected String _useruse3;

    /** USERUSE4: {varchar(60)} */
    @JsonKey
    protected String _useruse4;

    /** USERUSE5: {varchar(60)} */
    @JsonKey
    protected String _useruse5;

    /** LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _lot1nullflg;

    /** LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _lot2nullflg;

    /** LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _lot3nullflg;

    /** LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _lot4nullflg;

    /** LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _lot5nullflg;

    /** OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _otherlot1nullflg;

    /** OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _otherlot2nullflg;

    /** OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _otherlot3nullflg;

    /** OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _otherlot4nullflg;

    /** OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _otherlot5nullflg;

    /** ITEMPRINTNAME: {varchar(255)} */
    @JsonKey
    protected String _itemprintname;

    /** PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _pricelevel;

    /** ITEMCATALOGURL: {varchar(255)} */
    @JsonKey
    protected String _itemcatalogurl;

    /** USERNUM1: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _usernum1;

    /** USERNUM2: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _usernum2;

    /** USERNUM3: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _usernum3;

    /** USERNUM4: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _usernum4;

    /** USERNUM5: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _usernum5;

    /** USERDATE1: {varchar(8)} */
    @JsonKey
    protected String _userdate1;

    /** USERDATE2: {varchar(8)} */
    @JsonKey
    protected String _userdate2;

    /** USERDATE3: {varchar(8)} */
    @JsonKey
    protected String _userdate3;

    /** USERDATE4: {varchar(8)} */
    @JsonKey
    protected String _userdate4;

    /** USERDATE5: {varchar(8)} */
    @JsonKey
    protected String _userdate5;

    /** CGGDID: {varchar(30)} */
    @JsonKey
    protected String _cggdid;

    /** BRCTG: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _brctg;

    /** CTWEIGHT: {bigint(19)} */
    @JsonKey
    protected Long _ctweight;

    /** BXOSZL: {bigint(19)} */
    @JsonKey
    protected Long _bxoszl;

    /** BXOSZW: {bigint(19)} */
    @JsonKey
    protected Long _bxoszw;

    /** BXOSZH: {bigint(19)} */
    @JsonKey
    protected Long _bxoszh;

    /** BXCPY: {bigint(19)} */
    @JsonKey
    protected Long _bxcpy;

    /** BXWEIGHT: {bigint(19)} */
    @JsonKey
    protected Long _bxweight;

    /** ITEM_ADMIN: {NotNull, varchar(255)} */
    @JsonKey
    protected String _itemAdmin;

    /** SNAME: {varchar(60)} */
    @JsonKey
    protected String _sname;

    /** FractionPieceWeight: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _fractionpieceweight;

    /** TaxEquivalentNumber: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _taxequivalentnumber;

    /** SYHNKBNJT: {varchar(30)} */
    @JsonKey
    protected String _syhnkbnjt;

    /** IOID_CLS: {varchar(30)} */
    @JsonKey
    protected String _ioidCls;

    /** ITFCD_CLS: {varchar(30)} */
    @JsonKey
    protected String _itfcdCls;

    /** MANUITEMCD_CLS: {varchar(30)} */
    @JsonKey
    protected String _manuitemcdCls;

    /** CTCPY: {bigint(19)} */
    @JsonKey
    protected Long _ctcpy;

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
    public BsMProductDto() {
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
    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MProductDto _mProductSelf;

    public MProductDto getMProductSelf() {
        return _mProductSelf;
    }

    public void setMProductSelf(MProductDto mProductSelf) {
        this._mProductSelf = mProductSelf;
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

    protected BClassDtlDto _bClassDtlByLimitDtManagFlg;

    public BClassDtlDto getBClassDtlByLimitDtManagFlg() {
        return _bClassDtlByLimitDtManagFlg;
    }

    public void setBClassDtlByLimitDtManagFlg(BClassDtlDto bClassDtlByLimitDtManagFlg) {
        this._bClassDtlByLimitDtManagFlg = bClassDtlByLimitDtManagFlg;
    }

    protected BClassDtlDto _bClassDtlByLimitDtReverseFlg;

    public BClassDtlDto getBClassDtlByLimitDtReverseFlg() {
        return _bClassDtlByLimitDtReverseFlg;
    }

    public void setBClassDtlByLimitDtReverseFlg(BClassDtlDto bClassDtlByLimitDtReverseFlg) {
        this._bClassDtlByLimitDtReverseFlg = bClassDtlByLimitDtReverseFlg;
    }

    protected BClassDtlDto _bClassDtlByLotManagFlg;

    public BClassDtlDto getBClassDtlByLotManagFlg() {
        return _bClassDtlByLotManagFlg;
    }

    public void setBClassDtlByLotManagFlg(BClassDtlDto bClassDtlByLotManagFlg) {
        this._bClassDtlByLotManagFlg = bClassDtlByLotManagFlg;
    }

    protected BClassDtlDto _bClassDtlByLotReverseFlg;

    public BClassDtlDto getBClassDtlByLotReverseFlg() {
        return _bClassDtlByLotReverseFlg;
    }

    public void setBClassDtlByLotReverseFlg(BClassDtlDto bClassDtlByLotReverseFlg) {
        this._bClassDtlByLotReverseFlg = bClassDtlByLotReverseFlg;
    }

    protected BClassDtlDto _bClassDtlByMergeCls;

    public BClassDtlDto getBClassDtlByMergeCls() {
        return _bClassDtlByMergeCls;
    }

    public void setBClassDtlByMergeCls(BClassDtlDto bClassDtlByMergeCls) {
        this._bClassDtlByMergeCls = bClassDtlByMergeCls;
    }

    protected BClassDtlDto _bClassDtlByShippingStopFlg;

    public BClassDtlDto getBClassDtlByShippingStopFlg() {
        return _bClassDtlByShippingStopFlg;
    }

    public void setBClassDtlByShippingStopFlg(BClassDtlDto bClassDtlByShippingStopFlg) {
        this._bClassDtlByShippingStopFlg = bClassDtlByShippingStopFlg;
    }

    protected BClassDtlDto _bClassDtlByFreightCls;

    public BClassDtlDto getBClassDtlByFreightCls() {
        return _bClassDtlByFreightCls;
    }

    public void setBClassDtlByFreightCls(BClassDtlDto bClassDtlByFreightCls) {
        this._bClassDtlByFreightCls = bClassDtlByFreightCls;
    }

    protected MProductDto _mProductSelfAsOne;

    public MProductDto getMProductSelfAsOne() {
        return _mProductSelfAsOne;
    }

    public void setMProductSelfAsOne(MProductDto MProductSelfAsOne) {
        this._mProductSelfAsOne = MProductSelfAsOne;
    }

    protected MProductTermDto _mProductTermAsOne;

    public MProductTermDto getMProductTermAsOne() {
        return _mProductTermAsOne;
    }

    public void setMProductTermAsOne(MProductTermDto MProductTermAsOne) {
        this._mProductTermAsOne = MProductTermAsOne;
    }

    protected MSetParentDto _mSetParentAsOne;

    public MSetParentDto getMSetParentAsOne() {
        return _mSetParentAsOne;
    }

    public void setMSetParentAsOne(MSetParentDto MSetParentAsOne) {
        this._mSetParentAsOne = MSetParentAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MLocationDto> _mLocationList;

    public List<MLocationDto> getMLocationList() {
        if (_mLocationList == null) { _mLocationList = new ArrayList<MLocationDto>(); }
        return _mLocationList;
    }

    public void setMLocationList(List<MLocationDto> mLocationList) {
        this._mLocationList = mLocationList;
    }

    protected List<MMfwhxitemDto> _mMfwhxitemList;

    public List<MMfwhxitemDto> getMMfwhxitemList() {
        if (_mMfwhxitemList == null) { _mMfwhxitemList = new ArrayList<MMfwhxitemDto>(); }
        return _mMfwhxitemList;
    }

    public void setMMfwhxitemList(List<MMfwhxitemDto> mMfwhxitemList) {
        this._mMfwhxitemList = mMfwhxitemList;
    }

    protected List<MProductShapeDto> _mProductShapeList;

    public List<MProductShapeDto> getMProductShapeList() {
        if (_mProductShapeList == null) { _mProductShapeList = new ArrayList<MProductShapeDto>(); }
        return _mProductShapeList;
    }

    public void setMProductShapeList(List<MProductShapeDto> mProductShapeList) {
        this._mProductShapeList = mProductShapeList;
    }

    protected List<MSetStructureDto> _mSetStructureList;

    public List<MSetStructureDto> getMSetStructureList() {
        if (_mSetStructureList == null) { _mSetStructureList = new ArrayList<MSetStructureDto>(); }
        return _mSetStructureList;
    }

    public void setMSetStructureList(List<MSetStructureDto> mSetStructureList) {
        this._mSetStructureList = mSetStructureList;
    }

    protected List<TAllocInstBDto> _tAllocInstBList;

    public List<TAllocInstBDto> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = new ArrayList<TAllocInstBDto>(); }
        return _tAllocInstBList;
    }

    public void setTAllocInstBList(List<TAllocInstBDto> tAllocInstBList) {
        this._tAllocInstBList = tAllocInstBList;
    }

    protected List<TAllocLotDto> _tAllocLotList;

    public List<TAllocLotDto> getTAllocLotList() {
        if (_tAllocLotList == null) { _tAllocLotList = new ArrayList<TAllocLotDto>(); }
        return _tAllocLotList;
    }

    public void setTAllocLotList(List<TAllocLotDto> tAllocLotList) {
        this._tAllocLotList = tAllocLotList;
    }

    protected List<TInventoryBDto> _tInventoryBList;

    public List<TInventoryBDto> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = new ArrayList<TInventoryBDto>(); }
        return _tInventoryBList;
    }

    public void setTInventoryBList(List<TInventoryBDto> tInventoryBList) {
        this._tInventoryBList = tInventoryBList;
    }

    protected List<TKeepingLotDto> _tKeepingLotList;

    public List<TKeepingLotDto> getTKeepingLotList() {
        if (_tKeepingLotList == null) { _tKeepingLotList = new ArrayList<TKeepingLotDto>(); }
        return _tKeepingLotList;
    }

    public void setTKeepingLotList(List<TKeepingLotDto> tKeepingLotList) {
        this._tKeepingLotList = tKeepingLotList;
    }

    protected List<TLastLotDto> _tLastLotList;

    public List<TLastLotDto> getTLastLotList() {
        if (_tLastLotList == null) { _tLastLotList = new ArrayList<TLastLotDto>(); }
        return _tLastLotList;
    }

    public void setTLastLotList(List<TLastLotDto> tLastLotList) {
        this._tLastLotList = tLastLotList;
    }

    protected List<TLotDto> _tLotList;

    public List<TLotDto> getTLotList() {
        if (_tLotList == null) { _tLotList = new ArrayList<TLotDto>(); }
        return _tLotList;
    }

    public void setTLotList(List<TLotDto> tLotList) {
        this._tLotList = tLotList;
    }

    protected List<TMoveInstBDto> _tMoveInstBList;

    public List<TMoveInstBDto> getTMoveInstBList() {
        if (_tMoveInstBList == null) { _tMoveInstBList = new ArrayList<TMoveInstBDto>(); }
        return _tMoveInstBList;
    }

    public void setTMoveInstBList(List<TMoveInstBDto> tMoveInstBList) {
        this._tMoveInstBList = tMoveInstBList;
    }

    protected List<TReceivePlanBDto> _tReceivePlanBList;

    public List<TReceivePlanBDto> getTReceivePlanBList() {
        if (_tReceivePlanBList == null) { _tReceivePlanBList = new ArrayList<TReceivePlanBDto>(); }
        return _tReceivePlanBList;
    }

    public void setTReceivePlanBList(List<TReceivePlanBDto> tReceivePlanBList) {
        this._tReceivePlanBList = tReceivePlanBList;
    }

    protected List<TSerialNoDto> _tSerialNoList;

    public List<TSerialNoDto> getTSerialNoList() {
        if (_tSerialNoList == null) { _tSerialNoList = new ArrayList<TSerialNoDto>(); }
        return _tSerialNoList;
    }

    public void setTSerialNoList(List<TSerialNoDto> tSerialNoList) {
        this._tSerialNoList = tSerialNoList;
    }

    protected List<TShippingInstBDto> _tShippingInstBList;

    public List<TShippingInstBDto> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = new ArrayList<TShippingInstBDto>(); }
        return _tShippingInstBList;
    }

    public void setTShippingInstBList(List<TShippingInstBDto> tShippingInstBList) {
        this._tShippingInstBList = tShippingInstBList;
    }

    protected List<TStockDto> _tStockList;

    public List<TStockDto> getTStockList() {
        if (_tStockList == null) { _tStockList = new ArrayList<TStockDto>(); }
        return _tStockList;
    }

    public void setTStockList(List<TStockDto> tStockList) {
        this._tStockList = tStockList;
    }

    protected List<TTrinvcheckinfoDto> _tTrinvcheckinfoList;

    public List<TTrinvcheckinfoDto> getTTrinvcheckinfoList() {
        if (_tTrinvcheckinfoList == null) { _tTrinvcheckinfoList = new ArrayList<TTrinvcheckinfoDto>(); }
        return _tTrinvcheckinfoList;
    }

    public void setTTrinvcheckinfoList(List<TTrinvcheckinfoDto> tTrinvcheckinfoList) {
        this._tTrinvcheckinfoList = tTrinvcheckinfoList;
    }

    protected List<TYtrsodetailDto> _tYtrsodetailList;

    public List<TYtrsodetailDto> getTYtrsodetailList() {
        if (_tYtrsodetailList == null) { _tYtrsodetailList = new ArrayList<TYtrsodetailDto>(); }
        return _tYtrsodetailList;
    }

    public void setTYtrsodetailList(List<TYtrsodetailDto> tYtrsodetailList) {
        this._tYtrsodetailList = tYtrsodetailList;
    }

    protected List<WHtInventoryInputProdDto> _wHtInventoryInputProdList;

    public List<WHtInventoryInputProdDto> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = new ArrayList<WHtInventoryInputProdDto>(); }
        return _wHtInventoryInputProdList;
    }

    public void setWHtInventoryInputProdList(List<WHtInventoryInputProdDto> wHtInventoryInputProdList) {
        this._wHtInventoryInputProdList = wHtInventoryInputProdList;
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
        if (other == null || !(other instanceof BsMProductDto)) { return false; }
        final BsMProductDto otherEntity = (BsMProductDto)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_PRODUCT");
        result = xCH(result, getProductId());
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
        sb.append(c).append(getProductId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getLotManagFlg());
        sb.append(c).append(getLimitDtManagFlg());
        sb.append(c).append(getReceiveLimitNum());
        sb.append(c).append(getShippingLimitNum());
        sb.append(c).append(getMergeCls());
        sb.append(c).append(getLotReverseFlg());
        sb.append(c).append(getLimitDtReverseFlg());
        sb.append(c).append(getShippingStopFlg());
        sb.append(c).append(getFixedPoint());
        sb.append(c).append(getShapeGrpId());
        sb.append(c).append(getNmfcCode());
        sb.append(c).append(getFreightCls());
        sb.append(c).append(getCounntryOfOrigin());
        sb.append(c).append(getUnitVal());
        sb.append(c).append(getHtsCd());
        sb.append(c).append(getItemgroup());
        sb.append(c).append(getActflg());
        sb.append(c).append(getInvtype());
        sb.append(c).append(getSetitemflg());
        sb.append(c).append(getOwneritemcd());
        sb.append(c).append(getSupplieritemcd());
        sb.append(c).append(getPositemcd());
        sb.append(c).append(getItfcd());
        sb.append(c).append(getManuitemcd());
        sb.append(c).append(getPriceBuy());
        sb.append(c).append(getPriceWholesale());
        sb.append(c).append(getPriceSale());
        sb.append(c).append(getAllocpolicykey());
        sb.append(c).append(getSlotpolicykey());
        sb.append(c).append(getInworkingkey());
        sb.append(c).append(getOutworkingkey());
        sb.append(c).append(getAbctype());
        sb.append(c).append(getQty1type());
        sb.append(c).append(getUnit1());
        sb.append(c).append(getUnit1style());
        sb.append(c).append(getLength1());
        sb.append(c).append(getWidth1());
        sb.append(c).append(getHeight1());
        sb.append(c).append(getGrossweight1());
        sb.append(c).append(getNetweight1());
        sb.append(c).append(getCube1());
        sb.append(c).append(getLiter1());
        sb.append(c).append(getUnit2());
        sb.append(c).append(getUnit2style());
        sb.append(c).append(getLength2());
        sb.append(c).append(getWidth2());
        sb.append(c).append(getHeight2());
        sb.append(c).append(getGrossweight2());
        sb.append(c).append(getNetweight2());
        sb.append(c).append(getCube2());
        sb.append(c).append(getLiter2());
        sb.append(c).append(getUnit3());
        sb.append(c).append(getUnit3style());
        sb.append(c).append(getLength3());
        sb.append(c).append(getWidth3());
        sb.append(c).append(getHeight3());
        sb.append(c).append(getGrossweight3());
        sb.append(c).append(getNetweight3());
        sb.append(c).append(getCube3());
        sb.append(c).append(getLiter3());
        sb.append(c).append(getPQty());
        sb.append(c).append(getPHeight());
        sb.append(c).append(getPOdd());
        sb.append(c).append(getPDescription());
        sb.append(c).append(getNotes());
        sb.append(c).append(getQty2usedflg());
        sb.append(c).append(getQty2style());
        sb.append(c).append(getQty3usedflg());
        sb.append(c).append(getQty3style());
        sb.append(c).append(getSpCalcflg());
        sb.append(c).append(getSpLotatrb1usedflg());
        sb.append(c).append(getSpOperator1());
        sb.append(c).append(getSpLotatrb2usedflg());
        sb.append(c).append(getSpOperator2());
        sb.append(c).append(getSpLotatrb3usedflg());
        sb.append(c).append(getSpOperator3());
        sb.append(c).append(getSpRate());
        sb.append(c).append(getLotatrb1title());
        sb.append(c).append(getLotatrb2title());
        sb.append(c).append(getLotatrb3title());
        sb.append(c).append(getLotatrb4title());
        sb.append(c).append(getLotatrb5title());
        sb.append(c).append(getLotatrb6title());
        sb.append(c).append(getLotatrb7title());
        sb.append(c).append(getLotatrb8title());
        sb.append(c).append(getLotatrb9title());
        sb.append(c).append(getLotatrb10title());
        sb.append(c).append(getFUser1());
        sb.append(c).append(getFUser2());
        sb.append(c).append(getFUser3());
        sb.append(c).append(getFUser4());
        sb.append(c).append(getFUser5());
        sb.append(c).append(getItem40());
        sb.append(c).append(getPriceInsurance());
        sb.append(c).append(getLimitday());
        sb.append(c).append(getDeliverableday());
        sb.append(c).append(getPrintdateflg());
        sb.append(c).append(getSuppliercd());
        sb.append(c).append(getDispatchqtytype());
        sb.append(c).append(getTariffqtytype());
        sb.append(c).append(getUseruse1());
        sb.append(c).append(getUseruse2());
        sb.append(c).append(getUseruse3());
        sb.append(c).append(getUseruse4());
        sb.append(c).append(getUseruse5());
        sb.append(c).append(getLot1nullflg());
        sb.append(c).append(getLot2nullflg());
        sb.append(c).append(getLot3nullflg());
        sb.append(c).append(getLot4nullflg());
        sb.append(c).append(getLot5nullflg());
        sb.append(c).append(getOtherlot1nullflg());
        sb.append(c).append(getOtherlot2nullflg());
        sb.append(c).append(getOtherlot3nullflg());
        sb.append(c).append(getOtherlot4nullflg());
        sb.append(c).append(getOtherlot5nullflg());
        sb.append(c).append(getItemprintname());
        sb.append(c).append(getPricelevel());
        sb.append(c).append(getItemcatalogurl());
        sb.append(c).append(getUsernum1());
        sb.append(c).append(getUsernum2());
        sb.append(c).append(getUsernum3());
        sb.append(c).append(getUsernum4());
        sb.append(c).append(getUsernum5());
        sb.append(c).append(getUserdate1());
        sb.append(c).append(getUserdate2());
        sb.append(c).append(getUserdate3());
        sb.append(c).append(getUserdate4());
        sb.append(c).append(getUserdate5());
        sb.append(c).append(getCggdid());
        sb.append(c).append(getBrctg());
        sb.append(c).append(getCtweight());
        sb.append(c).append(getBxoszl());
        sb.append(c).append(getBxoszw());
        sb.append(c).append(getBxoszh());
        sb.append(c).append(getBxcpy());
        sb.append(c).append(getBxweight());
        sb.append(c).append(getItemAdmin());
        sb.append(c).append(getSname());
        sb.append(c).append(getFractionpieceweight());
        sb.append(c).append(getTaxequivalentnumber());
        sb.append(c).append(getSyhnkbnjt());
        sb.append(c).append(getIoidCls());
        sb.append(c).append(getItfcdCls());
        sb.append(c).append(getManuitemcdCls());
        sb.append(c).append(getCtcpy());
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
     * [get] PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {NotNull, varchar(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {NotNull, varchar(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] PRODUCT_ABBR: {varchar(60)} <br>
     * 商品略称
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public String getProductAbbr() {
        return _productAbbr;
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(60)} <br>
     * 商品略称
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public void setProductAbbr(String productAbbr) {
        __modifiedProperties.add("productAbbr");
        this._productAbbr = productAbbr;
    }

    /**
     * [get] JAN_CD: {IX, varchar(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {IX, varchar(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @return The value of the column 'LOT_MANAG_FLG'. (NullAllowed)
     */
    public String getLotManagFlg() {
        return _lotManagFlg;
    }

    /**
     * [set] LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param lotManagFlg The value of the column 'LOT_MANAG_FLG'. (NullAllowed)
     */
    public void setLotManagFlg(String lotManagFlg) {
        __modifiedProperties.add("lotManagFlg");
        this._lotManagFlg = lotManagFlg;
    }

    /**
     * [get] LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @return The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed)
     */
    public String getLimitDtManagFlg() {
        return _limitDtManagFlg;
    }

    /**
     * [set] LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param limitDtManagFlg The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed)
     */
    public void setLimitDtManagFlg(String limitDtManagFlg) {
        __modifiedProperties.add("limitDtManagFlg");
        this._limitDtManagFlg = limitDtManagFlg;
    }

    /**
     * [get] RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]} <br>
     * 入荷期限日数
     * @return The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed)
     */
    public Long getReceiveLimitNum() {
        return _receiveLimitNum;
    }

    /**
     * [set] RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]} <br>
     * 入荷期限日数
     * @param receiveLimitNum The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed)
     */
    public void setReceiveLimitNum(Long receiveLimitNum) {
        __modifiedProperties.add("receiveLimitNum");
        this._receiveLimitNum = receiveLimitNum;
    }

    /**
     * [get] SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]} <br>
     * 出荷期限日数
     * @return The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed)
     */
    public Long getShippingLimitNum() {
        return _shippingLimitNum;
    }

    /**
     * [set] SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]} <br>
     * 出荷期限日数
     * @param shippingLimitNum The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed)
     */
    public void setShippingLimitNum(Long shippingLimitNum) {
        __modifiedProperties.add("shippingLimitNum");
        this._shippingLimitNum = shippingLimitNum;
    }

    /**
     * [get] MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @return The value of the column 'MERGE_CLS'. (NullAllowed)
     */
    public String getMergeCls() {
        return _mergeCls;
    }

    /**
     * [set] MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param mergeCls The value of the column 'MERGE_CLS'. (NullAllowed)
     */
    public void setMergeCls(String mergeCls) {
        __modifiedProperties.add("mergeCls");
        this._mergeCls = mergeCls;
    }

    /**
     * [get] LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @return The value of the column 'LOT_REVERSE_FLG'. (NullAllowed)
     */
    public String getLotReverseFlg() {
        return _lotReverseFlg;
    }

    /**
     * [set] LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param lotReverseFlg The value of the column 'LOT_REVERSE_FLG'. (NullAllowed)
     */
    public void setLotReverseFlg(String lotReverseFlg) {
        __modifiedProperties.add("lotReverseFlg");
        this._lotReverseFlg = lotReverseFlg;
    }

    /**
     * [get] LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @return The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed)
     */
    public String getLimitDtReverseFlg() {
        return _limitDtReverseFlg;
    }

    /**
     * [set] LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param limitDtReverseFlg The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed)
     */
    public void setLimitDtReverseFlg(String limitDtReverseFlg) {
        __modifiedProperties.add("limitDtReverseFlg");
        this._limitDtReverseFlg = limitDtReverseFlg;
    }

    /**
     * [get] SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @return The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed)
     */
    public String getShippingStopFlg() {
        return _shippingStopFlg;
    }

    /**
     * [set] SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param shippingStopFlg The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed)
     */
    public void setShippingStopFlg(String shippingStopFlg) {
        __modifiedProperties.add("shippingStopFlg");
        this._shippingStopFlg = shippingStopFlg;
    }

    /**
     * [get] FIXED_POINT: {decimal(16, 6)} <br>
     * 定点
     * @return The value of the column 'FIXED_POINT'. (NullAllowed)
     */
    public java.math.BigDecimal getFixedPoint() {
        return _fixedPoint;
    }

    /**
     * [set] FIXED_POINT: {decimal(16, 6)} <br>
     * 定点
     * @param fixedPoint The value of the column 'FIXED_POINT'. (NullAllowed)
     */
    public void setFixedPoint(java.math.BigDecimal fixedPoint) {
        __modifiedProperties.add("fixedPoint");
        this._fixedPoint = fixedPoint;
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
     * [get] NMFC_CODE: {varchar(30)} <br>
     * NMFC Code
     * @return The value of the column 'NMFC_CODE'. (NullAllowed)
     */
    public String getNmfcCode() {
        return _nmfcCode;
    }

    /**
     * [set] NMFC_CODE: {varchar(30)} <br>
     * NMFC Code
     * @param nmfcCode The value of the column 'NMFC_CODE'. (NullAllowed)
     */
    public void setNmfcCode(String nmfcCode) {
        __modifiedProperties.add("nmfcCode");
        this._nmfcCode = nmfcCode;
    }

    /**
     * [get] FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @return The value of the column 'FREIGHT_CLS'. (NullAllowed)
     */
    public String getFreightCls() {
        return _freightCls;
    }

    /**
     * [set] FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @param freightCls The value of the column 'FREIGHT_CLS'. (NullAllowed)
     */
    public void setFreightCls(String freightCls) {
        __modifiedProperties.add("freightCls");
        this._freightCls = freightCls;
    }

    /**
     * [get] COUNNTRY_OF_ORIGIN: {varchar(30)} <br>
     * Country of Origin
     * @return The value of the column 'COUNNTRY_OF_ORIGIN'. (NullAllowed)
     */
    public String getCounntryOfOrigin() {
        return _counntryOfOrigin;
    }

    /**
     * [set] COUNNTRY_OF_ORIGIN: {varchar(30)} <br>
     * Country of Origin
     * @param counntryOfOrigin The value of the column 'COUNNTRY_OF_ORIGIN'. (NullAllowed)
     */
    public void setCounntryOfOrigin(String counntryOfOrigin) {
        __modifiedProperties.add("counntryOfOrigin");
        this._counntryOfOrigin = counntryOfOrigin;
    }

    /**
     * [get] UNIT_VAL: {decimal(16, 6)} <br>
     * Unit Value
     * @return The value of the column 'UNIT_VAL'. (NullAllowed)
     */
    public java.math.BigDecimal getUnitVal() {
        return _unitVal;
    }

    /**
     * [set] UNIT_VAL: {decimal(16, 6)} <br>
     * Unit Value
     * @param unitVal The value of the column 'UNIT_VAL'. (NullAllowed)
     */
    public void setUnitVal(java.math.BigDecimal unitVal) {
        __modifiedProperties.add("unitVal");
        this._unitVal = unitVal;
    }

    /**
     * [get] HTS_CD: {varchar(30)} <br>
     * Harmonized Code
     * @return The value of the column 'HTS_CD'. (NullAllowed)
     */
    public String getHtsCd() {
        return _htsCd;
    }

    /**
     * [set] HTS_CD: {varchar(30)} <br>
     * Harmonized Code
     * @param htsCd The value of the column 'HTS_CD'. (NullAllowed)
     */
    public void setHtsCd(String htsCd) {
        __modifiedProperties.add("htsCd");
        this._htsCd = htsCd;
    }

    /**
     * [get] ITEMGROUP: {varchar(60)} <br>
     * 銘柄グループ
     * @return The value of the column 'ITEMGROUP'. (NullAllowed)
     */
    public String getItemgroup() {
        return _itemgroup;
    }

    /**
     * [set] ITEMGROUP: {varchar(60)} <br>
     * 銘柄グループ
     * @param itemgroup The value of the column 'ITEMGROUP'. (NullAllowed)
     */
    public void setItemgroup(String itemgroup) {
        __modifiedProperties.add("itemgroup");
        this._itemgroup = itemgroup;
    }

    /**
     * [get] ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 活動中フラグ
     * @return The value of the column 'ACTFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getActflg() {
        return _actflg;
    }

    /**
     * [set] ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 活動中フラグ
     * @param actflg The value of the column 'ACTFLG'. (NullAllowed)
     */
    public void setActflg(java.math.BigDecimal actflg) {
        __modifiedProperties.add("actflg");
        this._actflg = actflg;
    }

    /**
     * [get] INVTYPE: {NotNull, varchar(30)} <br>
     * 銘柄在庫タイプ
     * @return The value of the column 'INVTYPE'. (NullAllowed)
     */
    public String getInvtype() {
        return _invtype;
    }

    /**
     * [set] INVTYPE: {NotNull, varchar(30)} <br>
     * 銘柄在庫タイプ
     * @param invtype The value of the column 'INVTYPE'. (NullAllowed)
     */
    public void setInvtype(String invtype) {
        __modifiedProperties.add("invtype");
        this._invtype = invtype;
    }

    /**
     * [get] SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * セット品フラグ
     * @return The value of the column 'SETITEMFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getSetitemflg() {
        return _setitemflg;
    }

    /**
     * [set] SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * セット品フラグ
     * @param setitemflg The value of the column 'SETITEMFLG'. (NullAllowed)
     */
    public void setSetitemflg(java.math.BigDecimal setitemflg) {
        __modifiedProperties.add("setitemflg");
        this._setitemflg = setitemflg;
    }

    /**
     * [get] OWNERITEMCD: {varchar(30)} <br>
     * 返品親銘柄CD
     * @return The value of the column 'OWNERITEMCD'. (NullAllowed)
     */
    public String getOwneritemcd() {
        return _owneritemcd;
    }

    /**
     * [set] OWNERITEMCD: {varchar(30)} <br>
     * 返品親銘柄CD
     * @param owneritemcd The value of the column 'OWNERITEMCD'. (NullAllowed)
     */
    public void setOwneritemcd(String owneritemcd) {
        __modifiedProperties.add("owneritemcd");
        this._owneritemcd = owneritemcd;
    }

    /**
     * [get] SUPPLIERITEMCD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'SUPPLIERITEMCD'. (NullAllowed)
     */
    public String getSupplieritemcd() {
        return _supplieritemcd;
    }

    /**
     * [set] SUPPLIERITEMCD: {varchar(30)} <br>
     * 銘柄CD
     * @param supplieritemcd The value of the column 'SUPPLIERITEMCD'. (NullAllowed)
     */
    public void setSupplieritemcd(String supplieritemcd) {
        __modifiedProperties.add("supplieritemcd");
        this._supplieritemcd = supplieritemcd;
    }

    /**
     * [get] POSITEMCD: {varchar(30)} <br>
     * 個装バーコード
     * @return The value of the column 'POSITEMCD'. (NullAllowed)
     */
    public String getPositemcd() {
        return _positemcd;
    }

    /**
     * [set] POSITEMCD: {varchar(30)} <br>
     * 個装バーコード
     * @param positemcd The value of the column 'POSITEMCD'. (NullAllowed)
     */
    public void setPositemcd(String positemcd) {
        __modifiedProperties.add("positemcd");
        this._positemcd = positemcd;
    }

    /**
     * [get] ITFCD: {varchar(30)} <br>
     * カートンバーコード
     * @return The value of the column 'ITFCD'. (NullAllowed)
     */
    public String getItfcd() {
        return _itfcd;
    }

    /**
     * [set] ITFCD: {varchar(30)} <br>
     * カートンバーコード
     * @param itfcd The value of the column 'ITFCD'. (NullAllowed)
     */
    public void setItfcd(String itfcd) {
        __modifiedProperties.add("itfcd");
        this._itfcd = itfcd;
    }

    /**
     * [get] MANUITEMCD: {varchar(30)} <br>
     * 段ボールバーコード
     * @return The value of the column 'MANUITEMCD'. (NullAllowed)
     */
    public String getManuitemcd() {
        return _manuitemcd;
    }

    /**
     * [set] MANUITEMCD: {varchar(30)} <br>
     * 段ボールバーコード
     * @param manuitemcd The value of the column 'MANUITEMCD'. (NullAllowed)
     */
    public void setManuitemcd(String manuitemcd) {
        __modifiedProperties.add("manuitemcd");
        this._manuitemcd = manuitemcd;
    }

    /**
     * [get] PRICE_BUY: {NotNull, bigint(19), default=[(0)]} <br>
     * 装置本数
     * @return The value of the column 'PRICE_BUY'. (NullAllowed)
     */
    public Long getPriceBuy() {
        return _priceBuy;
    }

    /**
     * [set] PRICE_BUY: {NotNull, bigint(19), default=[(0)]} <br>
     * 装置本数
     * @param priceBuy The value of the column 'PRICE_BUY'. (NullAllowed)
     */
    public void setPriceBuy(Long priceBuy) {
        __modifiedProperties.add("priceBuy");
        this._priceBuy = priceBuy;
    }

    /**
     * [get] PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小受注単位
     * @return The value of the column 'PRICE_WHOLESALE'. (NullAllowed)
     */
    public Long getPriceWholesale() {
        return _priceWholesale;
    }

    /**
     * [set] PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小受注単位
     * @param priceWholesale The value of the column 'PRICE_WHOLESALE'. (NullAllowed)
     */
    public void setPriceWholesale(Long priceWholesale) {
        __modifiedProperties.add("priceWholesale");
        this._priceWholesale = priceWholesale;
    }

    /**
     * [get] PRICE_SALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 定価
     * @return The value of the column 'PRICE_SALE'. (NullAllowed)
     */
    public Long getPriceSale() {
        return _priceSale;
    }

    /**
     * [set] PRICE_SALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 定価
     * @param priceSale The value of the column 'PRICE_SALE'. (NullAllowed)
     */
    public void setPriceSale(Long priceSale) {
        __modifiedProperties.add("priceSale");
        this._priceSale = priceSale;
    }

    /**
     * [get] ALLOCPOLICYKEY: {decimal(16, 6)} <br>
     * PM/BATフラグ
     * @return The value of the column 'ALLOCPOLICYKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getAllocpolicykey() {
        return _allocpolicykey;
    }

    /**
     * [set] ALLOCPOLICYKEY: {decimal(16, 6)} <br>
     * PM/BATフラグ
     * @param allocpolicykey The value of the column 'ALLOCPOLICYKEY'. (NullAllowed)
     */
    public void setAllocpolicykey(java.math.BigDecimal allocpolicykey) {
        __modifiedProperties.add("allocpolicykey");
        this._allocpolicykey = allocpolicykey;
    }

    /**
     * [get] SLOTPOLICYKEY: {decimal(16, 6)} <br>
     * 賞味期限月数
     * @return The value of the column 'SLOTPOLICYKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getSlotpolicykey() {
        return _slotpolicykey;
    }

    /**
     * [set] SLOTPOLICYKEY: {decimal(16, 6)} <br>
     * 賞味期限月数
     * @param slotpolicykey The value of the column 'SLOTPOLICYKEY'. (NullAllowed)
     */
    public void setSlotpolicykey(java.math.BigDecimal slotpolicykey) {
        __modifiedProperties.add("slotpolicykey");
        this._slotpolicykey = slotpolicykey;
    }

    /**
     * [get] INWORKINGKEY: {decimal(16, 6)} <br>
     * シンボル貼付データ有無フラグ
     * @return The value of the column 'INWORKINGKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getInworkingkey() {
        return _inworkingkey;
    }

    /**
     * [set] INWORKINGKEY: {decimal(16, 6)} <br>
     * シンボル貼付データ有無フラグ
     * @param inworkingkey The value of the column 'INWORKINGKEY'. (NullAllowed)
     */
    public void setInworkingkey(java.math.BigDecimal inworkingkey) {
        __modifiedProperties.add("inworkingkey");
        this._inworkingkey = inworkingkey;
    }

    /**
     * [get] OUTWORKINGKEY: {decimal(16, 6)} <br>
     * 販物受信フラグ
     * @return The value of the column 'OUTWORKINGKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getOutworkingkey() {
        return _outworkingkey;
    }

    /**
     * [set] OUTWORKINGKEY: {decimal(16, 6)} <br>
     * 販物受信フラグ
     * @param outworkingkey The value of the column 'OUTWORKINGKEY'. (NullAllowed)
     */
    public void setOutworkingkey(java.math.BigDecimal outworkingkey) {
        __modifiedProperties.add("outworkingkey");
        this._outworkingkey = outworkingkey;
    }

    /**
     * [get] ABCTYPE: {varchar(30)} <br>
     * たばこ区分
     * @return The value of the column 'ABCTYPE'. (NullAllowed)
     */
    public String getAbctype() {
        return _abctype;
    }

    /**
     * [set] ABCTYPE: {varchar(30)} <br>
     * たばこ区分
     * @param abctype The value of the column 'ABCTYPE'. (NullAllowed)
     */
    public void setAbctype(String abctype) {
        __modifiedProperties.add("abctype");
        this._abctype = abctype;
    }

    /**
     * [get] QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 数量１単位レベル
     * @return The value of the column 'QTY1TYPE'. (NullAllowed)
     */
    public java.math.BigDecimal getQty1type() {
        return _qty1type;
    }

    /**
     * [set] QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 数量１単位レベル
     * @param qty1type The value of the column 'QTY1TYPE'. (NullAllowed)
     */
    public void setQty1type(java.math.BigDecimal qty1type) {
        __modifiedProperties.add("qty1type");
        this._qty1type = qty1type;
    }

    /**
     * [get] UNIT1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 1ケース当カートン数
     * @return The value of the column 'UNIT1'. (NullAllowed)
     */
    public java.math.BigDecimal getUnit1() {
        return _unit1;
    }

    /**
     * [set] UNIT1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 1ケース当カートン数
     * @param unit1 The value of the column 'UNIT1'. (NullAllowed)
     */
    public void setUnit1(java.math.BigDecimal unit1) {
        __modifiedProperties.add("unit1");
        this._unit1 = unit1;
    }

    /**
     * [get] UNIT1STYLE: {varchar(60)} <br>
     * ケース単位
     * @return The value of the column 'UNIT1STYLE'. (NullAllowed)
     */
    public String getUnit1style() {
        return _unit1style;
    }

    /**
     * [set] UNIT1STYLE: {varchar(60)} <br>
     * ケース単位
     * @param unit1style The value of the column 'UNIT1STYLE'. (NullAllowed)
     */
    public void setUnit1style(String unit1style) {
        __modifiedProperties.add("unit1style");
        this._unit1style = unit1style;
    }

    /**
     * [get] LENGTH1: {NotNull, bigint(19), default=[(0)]} <br>
     * 縦１
     * @return The value of the column 'LENGTH1'. (NullAllowed)
     */
    public Long getLength1() {
        return _length1;
    }

    /**
     * [set] LENGTH1: {NotNull, bigint(19), default=[(0)]} <br>
     * 縦１
     * @param length1 The value of the column 'LENGTH1'. (NullAllowed)
     */
    public void setLength1(Long length1) {
        __modifiedProperties.add("length1");
        this._length1 = length1;
    }

    /**
     * [get] WIDTH1: {NotNull, bigint(19), default=[(0)]} <br>
     * 横１
     * @return The value of the column 'WIDTH1'. (NullAllowed)
     */
    public Long getWidth1() {
        return _width1;
    }

    /**
     * [set] WIDTH1: {NotNull, bigint(19), default=[(0)]} <br>
     * 横１
     * @param width1 The value of the column 'WIDTH1'. (NullAllowed)
     */
    public void setWidth1(Long width1) {
        __modifiedProperties.add("width1");
        this._width1 = width1;
    }

    /**
     * [get] HEIGHT1: {NotNull, bigint(19), default=[(0)]} <br>
     * 高さ１
     * @return The value of the column 'HEIGHT1'. (NullAllowed)
     */
    public Long getHeight1() {
        return _height1;
    }

    /**
     * [set] HEIGHT1: {NotNull, bigint(19), default=[(0)]} <br>
     * 高さ１
     * @param height1 The value of the column 'HEIGHT1'. (NullAllowed)
     */
    public void setHeight1(Long height1) {
        __modifiedProperties.add("height1");
        this._height1 = height1;
    }

    /**
     * [get] GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]} <br>
     * グロス重量１
     * @return The value of the column 'GROSSWEIGHT1'. (NullAllowed)
     */
    public Long getGrossweight1() {
        return _grossweight1;
    }

    /**
     * [set] GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]} <br>
     * グロス重量１
     * @param grossweight1 The value of the column 'GROSSWEIGHT1'. (NullAllowed)
     */
    public void setGrossweight1(Long grossweight1) {
        __modifiedProperties.add("grossweight1");
        this._grossweight1 = grossweight1;
    }

    /**
     * [get] NETWEIGHT1: {NotNull, bigint(19), default=[(0)]} <br>
     * ネット重量１
     * @return The value of the column 'NETWEIGHT1'. (NullAllowed)
     */
    public Long getNetweight1() {
        return _netweight1;
    }

    /**
     * [set] NETWEIGHT1: {NotNull, bigint(19), default=[(0)]} <br>
     * ネット重量１
     * @param netweight1 The value of the column 'NETWEIGHT1'. (NullAllowed)
     */
    public void setNetweight1(Long netweight1) {
        __modifiedProperties.add("netweight1");
        this._netweight1 = netweight1;
    }

    /**
     * [get] CUBE1: {NotNull, bigint(19), default=[(0)]} <br>
     * 体積（容積）１
     * @return The value of the column 'CUBE1'. (NullAllowed)
     */
    public Long getCube1() {
        return _cube1;
    }

    /**
     * [set] CUBE1: {NotNull, bigint(19), default=[(0)]} <br>
     * 体積（容積）１
     * @param cube1 The value of the column 'CUBE1'. (NullAllowed)
     */
    public void setCube1(Long cube1) {
        __modifiedProperties.add("cube1");
        this._cube1 = cube1;
    }

    /**
     * [get] LITER1: {NotNull, bigint(19), default=[(0)]} <br>
     * 内容量１
     * @return The value of the column 'LITER1'. (NullAllowed)
     */
    public Long getLiter1() {
        return _liter1;
    }

    /**
     * [set] LITER1: {NotNull, bigint(19), default=[(0)]} <br>
     * 内容量１
     * @param liter1 The value of the column 'LITER1'. (NullAllowed)
     */
    public void setLiter1(Long liter1) {
        __modifiedProperties.add("liter1");
        this._liter1 = liter1;
    }

    /**
     * [get] UNIT2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 1カートン当個数
     * @return The value of the column 'UNIT2'. (NullAllowed)
     */
    public java.math.BigDecimal getUnit2() {
        return _unit2;
    }

    /**
     * [set] UNIT2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 1カートン当個数
     * @param unit2 The value of the column 'UNIT2'. (NullAllowed)
     */
    public void setUnit2(java.math.BigDecimal unit2) {
        __modifiedProperties.add("unit2");
        this._unit2 = unit2;
    }

    /**
     * [get] UNIT2STYLE: {varchar(60)} <br>
     * カートン単位
     * @return The value of the column 'UNIT2STYLE'. (NullAllowed)
     */
    public String getUnit2style() {
        return _unit2style;
    }

    /**
     * [set] UNIT2STYLE: {varchar(60)} <br>
     * カートン単位
     * @param unit2style The value of the column 'UNIT2STYLE'. (NullAllowed)
     */
    public void setUnit2style(String unit2style) {
        __modifiedProperties.add("unit2style");
        this._unit2style = unit2style;
    }

    /**
     * [get] LENGTH2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン寸法(L)
     * @return The value of the column 'LENGTH2'. (NullAllowed)
     */
    public Long getLength2() {
        return _length2;
    }

    /**
     * [set] LENGTH2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン寸法(L)
     * @param length2 The value of the column 'LENGTH2'. (NullAllowed)
     */
    public void setLength2(Long length2) {
        __modifiedProperties.add("length2");
        this._length2 = length2;
    }

    /**
     * [get] WIDTH2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン寸法(W)
     * @return The value of the column 'WIDTH2'. (NullAllowed)
     */
    public Long getWidth2() {
        return _width2;
    }

    /**
     * [set] WIDTH2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン寸法(W)
     * @param width2 The value of the column 'WIDTH2'. (NullAllowed)
     */
    public void setWidth2(Long width2) {
        __modifiedProperties.add("width2");
        this._width2 = width2;
    }

    /**
     * [get] HEIGHT2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン寸法(H)
     * @return The value of the column 'HEIGHT2'. (NullAllowed)
     */
    public Long getHeight2() {
        return _height2;
    }

    /**
     * [set] HEIGHT2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン寸法(H)
     * @param height2 The value of the column 'HEIGHT2'. (NullAllowed)
     */
    public void setHeight2(Long height2) {
        __modifiedProperties.add("height2");
        this._height2 = height2;
    }

    /**
     * [get] GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]} <br>
     * グロス重量２
     * @return The value of the column 'GROSSWEIGHT2'. (NullAllowed)
     */
    public Long getGrossweight2() {
        return _grossweight2;
    }

    /**
     * [set] GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]} <br>
     * グロス重量２
     * @param grossweight2 The value of the column 'GROSSWEIGHT2'. (NullAllowed)
     */
    public void setGrossweight2(Long grossweight2) {
        __modifiedProperties.add("grossweight2");
        this._grossweight2 = grossweight2;
    }

    /**
     * [get] NETWEIGHT2: {NotNull, bigint(19), default=[(0)]} <br>
     * ネット重量２
     * @return The value of the column 'NETWEIGHT2'. (NullAllowed)
     */
    public Long getNetweight2() {
        return _netweight2;
    }

    /**
     * [set] NETWEIGHT2: {NotNull, bigint(19), default=[(0)]} <br>
     * ネット重量２
     * @param netweight2 The value of the column 'NETWEIGHT2'. (NullAllowed)
     */
    public void setNetweight2(Long netweight2) {
        __modifiedProperties.add("netweight2");
        this._netweight2 = netweight2;
    }

    /**
     * [get] CUBE2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン容積
     * @return The value of the column 'CUBE2'. (NullAllowed)
     */
    public Long getCube2() {
        return _cube2;
    }

    /**
     * [set] CUBE2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン容積
     * @param cube2 The value of the column 'CUBE2'. (NullAllowed)
     */
    public void setCube2(Long cube2) {
        __modifiedProperties.add("cube2");
        this._cube2 = cube2;
    }

    /**
     * [get] LITER2: {NotNull, bigint(19), default=[(0)]} <br>
     * 内容量２
     * @return The value of the column 'LITER2'. (NullAllowed)
     */
    public Long getLiter2() {
        return _liter2;
    }

    /**
     * [set] LITER2: {NotNull, bigint(19), default=[(0)]} <br>
     * 内容量２
     * @param liter2 The value of the column 'LITER2'. (NullAllowed)
     */
    public void setLiter2(Long liter2) {
        __modifiedProperties.add("liter2");
        this._liter2 = liter2;
    }

    /**
     * [get] UNIT3: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個数
     * @return The value of the column 'UNIT3'. (NullAllowed)
     */
    public java.math.BigDecimal getUnit3() {
        return _unit3;
    }

    /**
     * [set] UNIT3: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個数
     * @param unit3 The value of the column 'UNIT3'. (NullAllowed)
     */
    public void setUnit3(java.math.BigDecimal unit3) {
        __modifiedProperties.add("unit3");
        this._unit3 = unit3;
    }

    /**
     * [get] UNIT3STYLE: {varchar(60)} <br>
     * 個装単位
     * @return The value of the column 'UNIT3STYLE'. (NullAllowed)
     */
    public String getUnit3style() {
        return _unit3style;
    }

    /**
     * [set] UNIT3STYLE: {varchar(60)} <br>
     * 個装単位
     * @param unit3style The value of the column 'UNIT3STYLE'. (NullAllowed)
     */
    public void setUnit3style(String unit3style) {
        __modifiedProperties.add("unit3style");
        this._unit3style = unit3style;
    }

    /**
     * [get] LENGTH3: {NotNull, bigint(19), default=[(0)]} <br>
     * 縦３
     * @return The value of the column 'LENGTH3'. (NullAllowed)
     */
    public Long getLength3() {
        return _length3;
    }

    /**
     * [set] LENGTH3: {NotNull, bigint(19), default=[(0)]} <br>
     * 縦３
     * @param length3 The value of the column 'LENGTH3'. (NullAllowed)
     */
    public void setLength3(Long length3) {
        __modifiedProperties.add("length3");
        this._length3 = length3;
    }

    /**
     * [get] WIDTH3: {NotNull, bigint(19), default=[(0)]} <br>
     * 横３
     * @return The value of the column 'WIDTH3'. (NullAllowed)
     */
    public Long getWidth3() {
        return _width3;
    }

    /**
     * [set] WIDTH3: {NotNull, bigint(19), default=[(0)]} <br>
     * 横３
     * @param width3 The value of the column 'WIDTH3'. (NullAllowed)
     */
    public void setWidth3(Long width3) {
        __modifiedProperties.add("width3");
        this._width3 = width3;
    }

    /**
     * [get] HEIGHT3: {NotNull, bigint(19), default=[(0)]} <br>
     * 高さ３
     * @return The value of the column 'HEIGHT3'. (NullAllowed)
     */
    public Long getHeight3() {
        return _height3;
    }

    /**
     * [set] HEIGHT3: {NotNull, bigint(19), default=[(0)]} <br>
     * 高さ３
     * @param height3 The value of the column 'HEIGHT3'. (NullAllowed)
     */
    public void setHeight3(Long height3) {
        __modifiedProperties.add("height3");
        this._height3 = height3;
    }

    /**
     * [get] GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]} <br>
     * グロス重量３
     * @return The value of the column 'GROSSWEIGHT3'. (NullAllowed)
     */
    public Long getGrossweight3() {
        return _grossweight3;
    }

    /**
     * [set] GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]} <br>
     * グロス重量３
     * @param grossweight3 The value of the column 'GROSSWEIGHT3'. (NullAllowed)
     */
    public void setGrossweight3(Long grossweight3) {
        __modifiedProperties.add("grossweight3");
        this._grossweight3 = grossweight3;
    }

    /**
     * [get] NETWEIGHT3: {NotNull, bigint(19), default=[(0)]} <br>
     * ネット重量３
     * @return The value of the column 'NETWEIGHT3'. (NullAllowed)
     */
    public Long getNetweight3() {
        return _netweight3;
    }

    /**
     * [set] NETWEIGHT3: {NotNull, bigint(19), default=[(0)]} <br>
     * ネット重量３
     * @param netweight3 The value of the column 'NETWEIGHT3'. (NullAllowed)
     */
    public void setNetweight3(Long netweight3) {
        __modifiedProperties.add("netweight3");
        this._netweight3 = netweight3;
    }

    /**
     * [get] CUBE3: {NotNull, bigint(19), default=[(0)]} <br>
     * 体積（容積）３
     * @return The value of the column 'CUBE3'. (NullAllowed)
     */
    public Long getCube3() {
        return _cube3;
    }

    /**
     * [set] CUBE3: {NotNull, bigint(19), default=[(0)]} <br>
     * 体積（容積）３
     * @param cube3 The value of the column 'CUBE3'. (NullAllowed)
     */
    public void setCube3(Long cube3) {
        __modifiedProperties.add("cube3");
        this._cube3 = cube3;
    }

    /**
     * [get] LITER3: {NotNull, bigint(19), default=[(0)]} <br>
     * 内容量３
     * @return The value of the column 'LITER3'. (NullAllowed)
     */
    public Long getLiter3() {
        return _liter3;
    }

    /**
     * [set] LITER3: {NotNull, bigint(19), default=[(0)]} <br>
     * 内容量３
     * @param liter3 The value of the column 'LITER3'. (NullAllowed)
     */
    public void setLiter3(Long liter3) {
        __modifiedProperties.add("liter3");
        this._liter3 = liter3;
    }

    /**
     * [get] P_QTY: {decimal(16, 6), default=[(0)]} <br>
     * 1パレット当ケース数
     * @return The value of the column 'P_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getPQty() {
        return _pQty;
    }

    /**
     * [set] P_QTY: {decimal(16, 6), default=[(0)]} <br>
     * 1パレット当ケース数
     * @param pQty The value of the column 'P_QTY'. (NullAllowed)
     */
    public void setPQty(java.math.BigDecimal pQty) {
        __modifiedProperties.add("PQty");
        this._pQty = pQty;
    }

    /**
     * [get] P_HEIGHT: {decimal(16, 6), default=[(0)]} <br>
     * パレット積付段数
     * @return The value of the column 'P_HEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getPHeight() {
        return _pHeight;
    }

    /**
     * [set] P_HEIGHT: {decimal(16, 6), default=[(0)]} <br>
     * パレット積付段数
     * @param pHeight The value of the column 'P_HEIGHT'. (NullAllowed)
     */
    public void setPHeight(java.math.BigDecimal pHeight) {
        __modifiedProperties.add("PHeight");
        this._pHeight = pHeight;
    }

    /**
     * [get] P_ODD: {decimal(16, 6), default=[(0)]} <br>
     * パレット平面積付数量
     * @return The value of the column 'P_ODD'. (NullAllowed)
     */
    public java.math.BigDecimal getPOdd() {
        return _pOdd;
    }

    /**
     * [set] P_ODD: {decimal(16, 6), default=[(0)]} <br>
     * パレット平面積付数量
     * @param pOdd The value of the column 'P_ODD'. (NullAllowed)
     */
    public void setPOdd(java.math.BigDecimal pOdd) {
        __modifiedProperties.add("POdd");
        this._pOdd = pOdd;
    }

    /**
     * [get] P_DESCRIPTION: {varchar(4000)} <br>
     * パレット積付方法の説明
     * @return The value of the column 'P_DESCRIPTION'. (NullAllowed)
     */
    public String getPDescription() {
        return _pDescription;
    }

    /**
     * [set] P_DESCRIPTION: {varchar(4000)} <br>
     * パレット積付方法の説明
     * @param pDescription The value of the column 'P_DESCRIPTION'. (NullAllowed)
     */
    public void setPDescription(String pDescription) {
        __modifiedProperties.add("PDescription");
        this._pDescription = pDescription;
    }

    /**
     * [get] NOTES: {varchar(4000)} <br>
     * 備考
     * @return The value of the column 'NOTES'. (NullAllowed)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * 備考
     * @param notes The value of the column 'NOTES'. (NullAllowed)
     */
    public void setNotes(String notes) {
        __modifiedProperties.add("notes");
        this._notes = notes;
    }

    /**
     * [get] QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 数量２使用フラグ
     * @return The value of the column 'QTY2USEDFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getQty2usedflg() {
        return _qty2usedflg;
    }

    /**
     * [set] QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 数量２使用フラグ
     * @param qty2usedflg The value of the column 'QTY2USEDFLG'. (NullAllowed)
     */
    public void setQty2usedflg(java.math.BigDecimal qty2usedflg) {
        __modifiedProperties.add("qty2usedflg");
        this._qty2usedflg = qty2usedflg;
    }

    /**
     * [get] QTY2STYLE: {varchar(60)} <br>
     * 数量２単位
     * @return The value of the column 'QTY2STYLE'. (NullAllowed)
     */
    public String getQty2style() {
        return _qty2style;
    }

    /**
     * [set] QTY2STYLE: {varchar(60)} <br>
     * 数量２単位
     * @param qty2style The value of the column 'QTY2STYLE'. (NullAllowed)
     */
    public void setQty2style(String qty2style) {
        __modifiedProperties.add("qty2style");
        this._qty2style = qty2style;
    }

    /**
     * [get] QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 数量３使用フラグ
     * @return The value of the column 'QTY3USEDFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getQty3usedflg() {
        return _qty3usedflg;
    }

    /**
     * [set] QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 数量３使用フラグ
     * @param qty3usedflg The value of the column 'QTY3USEDFLG'. (NullAllowed)
     */
    public void setQty3usedflg(java.math.BigDecimal qty3usedflg) {
        __modifiedProperties.add("qty3usedflg");
        this._qty3usedflg = qty3usedflg;
    }

    /**
     * [get] QTY3STYLE: {varchar(60)} <br>
     * 数量３単位
     * @return The value of the column 'QTY3STYLE'. (NullAllowed)
     */
    public String getQty3style() {
        return _qty3style;
    }

    /**
     * [set] QTY3STYLE: {varchar(60)} <br>
     * 数量３単位
     * @param qty3style The value of the column 'QTY3STYLE'. (NullAllowed)
     */
    public void setQty3style(String qty3style) {
        __modifiedProperties.add("qty3style");
        this._qty3style = qty3style;
    }

    /**
     * [get] SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 送信済フラグ
     * @return The value of the column 'SP_CALCFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getSpCalcflg() {
        return _spCalcflg;
    }

    /**
     * [set] SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 送信済フラグ
     * @param spCalcflg The value of the column 'SP_CALCFLG'. (NullAllowed)
     */
    public void setSpCalcflg(java.math.BigDecimal spCalcflg) {
        __modifiedProperties.add("spCalcflg");
        this._spCalcflg = spCalcflg;
    }

    /**
     * [get] SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 特殊計算（管理１をする）
     * @return The value of the column 'SP_LOTATRB1USEDFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getSpLotatrb1usedflg() {
        return _spLotatrb1usedflg;
    }

    /**
     * [set] SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 特殊計算（管理１をする）
     * @param spLotatrb1usedflg The value of the column 'SP_LOTATRB1USEDFLG'. (NullAllowed)
     */
    public void setSpLotatrb1usedflg(java.math.BigDecimal spLotatrb1usedflg) {
        __modifiedProperties.add("spLotatrb1usedflg");
        this._spLotatrb1usedflg = spLotatrb1usedflg;
    }

    /**
     * [get] SP_OPERATOR1: {varchar(30)} <br>
     * 段ボールCD
     * @return The value of the column 'SP_OPERATOR1'. (NullAllowed)
     */
    public String getSpOperator1() {
        return _spOperator1;
    }

    /**
     * [set] SP_OPERATOR1: {varchar(30)} <br>
     * 段ボールCD
     * @param spOperator1 The value of the column 'SP_OPERATOR1'. (NullAllowed)
     */
    public void setSpOperator1(String spOperator1) {
        __modifiedProperties.add("spOperator1");
        this._spOperator1 = spOperator1;
    }

    /**
     * [get] SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 特殊計算（管理２をする）
     * @return The value of the column 'SP_LOTATRB2USEDFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getSpLotatrb2usedflg() {
        return _spLotatrb2usedflg;
    }

    /**
     * [set] SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 特殊計算（管理２をする）
     * @param spLotatrb2usedflg The value of the column 'SP_LOTATRB2USEDFLG'. (NullAllowed)
     */
    public void setSpLotatrb2usedflg(java.math.BigDecimal spLotatrb2usedflg) {
        __modifiedProperties.add("spLotatrb2usedflg");
        this._spLotatrb2usedflg = spLotatrb2usedflg;
    }

    /**
     * [get] SP_OPERATOR2: {varchar(30)} <br>
     * 特殊計算演算子２
     * @return The value of the column 'SP_OPERATOR2'. (NullAllowed)
     */
    public String getSpOperator2() {
        return _spOperator2;
    }

    /**
     * [set] SP_OPERATOR2: {varchar(30)} <br>
     * 特殊計算演算子２
     * @param spOperator2 The value of the column 'SP_OPERATOR2'. (NullAllowed)
     */
    public void setSpOperator2(String spOperator2) {
        __modifiedProperties.add("spOperator2");
        this._spOperator2 = spOperator2;
    }

    /**
     * [get] SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 特殊計算（管理３をする）
     * @return The value of the column 'SP_LOTATRB3USEDFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getSpLotatrb3usedflg() {
        return _spLotatrb3usedflg;
    }

    /**
     * [set] SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 特殊計算（管理３をする）
     * @param spLotatrb3usedflg The value of the column 'SP_LOTATRB3USEDFLG'. (NullAllowed)
     */
    public void setSpLotatrb3usedflg(java.math.BigDecimal spLotatrb3usedflg) {
        __modifiedProperties.add("spLotatrb3usedflg");
        this._spLotatrb3usedflg = spLotatrb3usedflg;
    }

    /**
     * [get] SP_OPERATOR3: {varchar(30)} <br>
     * 特殊計算演算子３
     * @return The value of the column 'SP_OPERATOR3'. (NullAllowed)
     */
    public String getSpOperator3() {
        return _spOperator3;
    }

    /**
     * [set] SP_OPERATOR3: {varchar(30)} <br>
     * 特殊計算演算子３
     * @param spOperator3 The value of the column 'SP_OPERATOR3'. (NullAllowed)
     */
    public void setSpOperator3(String spOperator3) {
        __modifiedProperties.add("spOperator3");
        this._spOperator3 = spOperator3;
    }

    /**
     * [get] SP_RATE: {NotNull, bigint(19), default=[(0)]} <br>
     * 特殊計算（率）
     * @return The value of the column 'SP_RATE'. (NullAllowed)
     */
    public Long getSpRate() {
        return _spRate;
    }

    /**
     * [set] SP_RATE: {NotNull, bigint(19), default=[(0)]} <br>
     * 特殊計算（率）
     * @param spRate The value of the column 'SP_RATE'. (NullAllowed)
     */
    public void setSpRate(Long spRate) {
        __modifiedProperties.add("spRate");
        this._spRate = spRate;
    }

    /**
     * [get] LOTATRB1TITLE: {varchar(60)} <br>
     * 庫内作業集約CD
     * @return The value of the column 'LOTATRB1TITLE'. (NullAllowed)
     */
    public String getLotatrb1title() {
        return _lotatrb1title;
    }

    /**
     * [set] LOTATRB1TITLE: {varchar(60)} <br>
     * 庫内作業集約CD
     * @param lotatrb1title The value of the column 'LOTATRB1TITLE'. (NullAllowed)
     */
    public void setLotatrb1title(String lotatrb1title) {
        __modifiedProperties.add("lotatrb1title");
        this._lotatrb1title = lotatrb1title;
    }

    /**
     * [get] LOTATRB2TITLE: {varchar(60)} <br>
     * 管理２タイトル
     * @return The value of the column 'LOTATRB2TITLE'. (NullAllowed)
     */
    public String getLotatrb2title() {
        return _lotatrb2title;
    }

    /**
     * [set] LOTATRB2TITLE: {varchar(60)} <br>
     * 管理２タイトル
     * @param lotatrb2title The value of the column 'LOTATRB2TITLE'. (NullAllowed)
     */
    public void setLotatrb2title(String lotatrb2title) {
        __modifiedProperties.add("lotatrb2title");
        this._lotatrb2title = lotatrb2title;
    }

    /**
     * [get] LOTATRB3TITLE: {varchar(60)} <br>
     * 管理３タイトル
     * @return The value of the column 'LOTATRB3TITLE'. (NullAllowed)
     */
    public String getLotatrb3title() {
        return _lotatrb3title;
    }

    /**
     * [set] LOTATRB3TITLE: {varchar(60)} <br>
     * 管理３タイトル
     * @param lotatrb3title The value of the column 'LOTATRB3TITLE'. (NullAllowed)
     */
    public void setLotatrb3title(String lotatrb3title) {
        __modifiedProperties.add("lotatrb3title");
        this._lotatrb3title = lotatrb3title;
    }

    /**
     * [get] LOTATRB4TITLE: {varchar(60)} <br>
     * 管理４タイトル
     * @return The value of the column 'LOTATRB4TITLE'. (NullAllowed)
     */
    public String getLotatrb4title() {
        return _lotatrb4title;
    }

    /**
     * [set] LOTATRB4TITLE: {varchar(60)} <br>
     * 管理４タイトル
     * @param lotatrb4title The value of the column 'LOTATRB4TITLE'. (NullAllowed)
     */
    public void setLotatrb4title(String lotatrb4title) {
        __modifiedProperties.add("lotatrb4title");
        this._lotatrb4title = lotatrb4title;
    }

    /**
     * [get] LOTATRB5TITLE: {varchar(60)} <br>
     * 管理５タイトル
     * @return The value of the column 'LOTATRB5TITLE'. (NullAllowed)
     */
    public String getLotatrb5title() {
        return _lotatrb5title;
    }

    /**
     * [set] LOTATRB5TITLE: {varchar(60)} <br>
     * 管理５タイトル
     * @param lotatrb5title The value of the column 'LOTATRB5TITLE'. (NullAllowed)
     */
    public void setLotatrb5title(String lotatrb5title) {
        __modifiedProperties.add("lotatrb5title");
        this._lotatrb5title = lotatrb5title;
    }

    /**
     * [get] LOTATRB6TITLE: {varchar(60)} <br>
     * その他属性１タイトル
     * @return The value of the column 'LOTATRB6TITLE'. (NullAllowed)
     */
    public String getLotatrb6title() {
        return _lotatrb6title;
    }

    /**
     * [set] LOTATRB6TITLE: {varchar(60)} <br>
     * その他属性１タイトル
     * @param lotatrb6title The value of the column 'LOTATRB6TITLE'. (NullAllowed)
     */
    public void setLotatrb6title(String lotatrb6title) {
        __modifiedProperties.add("lotatrb6title");
        this._lotatrb6title = lotatrb6title;
    }

    /**
     * [get] LOTATRB7TITLE: {varchar(60)} <br>
     * その他属性２タイトル
     * @return The value of the column 'LOTATRB7TITLE'. (NullAllowed)
     */
    public String getLotatrb7title() {
        return _lotatrb7title;
    }

    /**
     * [set] LOTATRB7TITLE: {varchar(60)} <br>
     * その他属性２タイトル
     * @param lotatrb7title The value of the column 'LOTATRB7TITLE'. (NullAllowed)
     */
    public void setLotatrb7title(String lotatrb7title) {
        __modifiedProperties.add("lotatrb7title");
        this._lotatrb7title = lotatrb7title;
    }

    /**
     * [get] LOTATRB8TITLE: {varchar(60)} <br>
     * その他属性３タイトル
     * @return The value of the column 'LOTATRB8TITLE'. (NullAllowed)
     */
    public String getLotatrb8title() {
        return _lotatrb8title;
    }

    /**
     * [set] LOTATRB8TITLE: {varchar(60)} <br>
     * その他属性３タイトル
     * @param lotatrb8title The value of the column 'LOTATRB8TITLE'. (NullAllowed)
     */
    public void setLotatrb8title(String lotatrb8title) {
        __modifiedProperties.add("lotatrb8title");
        this._lotatrb8title = lotatrb8title;
    }

    /**
     * [get] LOTATRB9TITLE: {varchar(60)} <br>
     * その他属性４タイトル
     * @return The value of the column 'LOTATRB9TITLE'. (NullAllowed)
     */
    public String getLotatrb9title() {
        return _lotatrb9title;
    }

    /**
     * [set] LOTATRB9TITLE: {varchar(60)} <br>
     * その他属性４タイトル
     * @param lotatrb9title The value of the column 'LOTATRB9TITLE'. (NullAllowed)
     */
    public void setLotatrb9title(String lotatrb9title) {
        __modifiedProperties.add("lotatrb9title");
        this._lotatrb9title = lotatrb9title;
    }

    /**
     * [get] LOTATRB10TITLE: {varchar(60)} <br>
     * その他属性５タイトル
     * @return The value of the column 'LOTATRB10TITLE'. (NullAllowed)
     */
    public String getLotatrb10title() {
        return _lotatrb10title;
    }

    /**
     * [set] LOTATRB10TITLE: {varchar(60)} <br>
     * その他属性５タイトル
     * @param lotatrb10title The value of the column 'LOTATRB10TITLE'. (NullAllowed)
     */
    public void setLotatrb10title(String lotatrb10title) {
        __modifiedProperties.add("lotatrb10title");
        this._lotatrb10title = lotatrb10title;
    }

    /**
     * [get] F_USER1: {varchar(30)} <br>
     * 特販業者CD(1)
     * @return The value of the column 'F_USER1'. (NullAllowed)
     */
    public String getFUser1() {
        return _fUser1;
    }

    /**
     * [set] F_USER1: {varchar(30)} <br>
     * 特販業者CD(1)
     * @param fUser1 The value of the column 'F_USER1'. (NullAllowed)
     */
    public void setFUser1(String fUser1) {
        __modifiedProperties.add("FUser1");
        this._fUser1 = fUser1;
    }

    /**
     * [get] F_USER2: {varchar(30)} <br>
     * 特販業者CD(2)
     * @return The value of the column 'F_USER2'. (NullAllowed)
     */
    public String getFUser2() {
        return _fUser2;
    }

    /**
     * [set] F_USER2: {varchar(30)} <br>
     * 特販業者CD(2)
     * @param fUser2 The value of the column 'F_USER2'. (NullAllowed)
     */
    public void setFUser2(String fUser2) {
        __modifiedProperties.add("FUser2");
        this._fUser2 = fUser2;
    }

    /**
     * [get] F_USER3: {varchar(30)} <br>
     * 特販業者CD(3)
     * @return The value of the column 'F_USER3'. (NullAllowed)
     */
    public String getFUser3() {
        return _fUser3;
    }

    /**
     * [set] F_USER3: {varchar(30)} <br>
     * 特販業者CD(3)
     * @param fUser3 The value of the column 'F_USER3'. (NullAllowed)
     */
    public void setFUser3(String fUser3) {
        __modifiedProperties.add("FUser3");
        this._fUser3 = fUser3;
    }

    /**
     * [get] F_USER4: {varchar(30)} <br>
     * 特販業者CD(4)
     * @return The value of the column 'F_USER4'. (NullAllowed)
     */
    public String getFUser4() {
        return _fUser4;
    }

    /**
     * [set] F_USER4: {varchar(30)} <br>
     * 特販業者CD(4)
     * @param fUser4 The value of the column 'F_USER4'. (NullAllowed)
     */
    public void setFUser4(String fUser4) {
        __modifiedProperties.add("FUser4");
        this._fUser4 = fUser4;
    }

    /**
     * [get] F_USER5: {varchar(30)} <br>
     * 特販業者CD(5)
     * @return The value of the column 'F_USER5'. (NullAllowed)
     */
    public String getFUser5() {
        return _fUser5;
    }

    /**
     * [set] F_USER5: {varchar(30)} <br>
     * 特販業者CD(5)
     * @param fUser5 The value of the column 'F_USER5'. (NullAllowed)
     */
    public void setFUser5(String fUser5) {
        __modifiedProperties.add("FUser5");
        this._fUser5 = fUser5;
    }

    /**
     * [get] ITEM40: {decimal(16, 6), default=[(0)]} <br>
     * ４０銘柄CD
     * @return The value of the column 'ITEM40'. (NullAllowed)
     */
    public java.math.BigDecimal getItem40() {
        return _item40;
    }

    /**
     * [set] ITEM40: {decimal(16, 6), default=[(0)]} <br>
     * ４０銘柄CD
     * @param item40 The value of the column 'ITEM40'. (NullAllowed)
     */
    public void setItem40(java.math.BigDecimal item40) {
        __modifiedProperties.add("item40");
        this._item40 = item40;
    }

    /**
     * [get] PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]} <br>
     * 寄託価格
     * @return The value of the column 'PRICE_INSURANCE'. (NullAllowed)
     */
    public Long getPriceInsurance() {
        return _priceInsurance;
    }

    /**
     * [set] PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]} <br>
     * 寄託価格
     * @param priceInsurance The value of the column 'PRICE_INSURANCE'. (NullAllowed)
     */
    public void setPriceInsurance(Long priceInsurance) {
        __modifiedProperties.add("priceInsurance");
        this._priceInsurance = priceInsurance;
    }

    /**
     * [get] LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 賞味期限日数
     * @return The value of the column 'LIMITDAY'. (NullAllowed)
     */
    public java.math.BigDecimal getLimitday() {
        return _limitday;
    }

    /**
     * [set] LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 賞味期限日数
     * @param limitday The value of the column 'LIMITDAY'. (NullAllowed)
     */
    public void setLimitday(java.math.BigDecimal limitday) {
        __modifiedProperties.add("limitday");
        this._limitday = limitday;
    }

    /**
     * [get] DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]} <br>
     * 納品許容日数
     * @return The value of the column 'DELIVERABLEDAY'. (NullAllowed)
     */
    public Long getDeliverableday() {
        return _deliverableday;
    }

    /**
     * [set] DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]} <br>
     * 納品許容日数
     * @param deliverableday The value of the column 'DELIVERABLEDAY'. (NullAllowed)
     */
    public void setDeliverableday(Long deliverableday) {
        __modifiedProperties.add("deliverableday");
        this._deliverableday = deliverableday;
    }

    /**
     * [get] PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 印字日付（管理日）フラグ
     * @return The value of the column 'PRINTDATEFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getPrintdateflg() {
        return _printdateflg;
    }

    /**
     * [set] PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 印字日付（管理日）フラグ
     * @param printdateflg The value of the column 'PRINTDATEFLG'. (NullAllowed)
     */
    public void setPrintdateflg(java.math.BigDecimal printdateflg) {
        __modifiedProperties.add("printdateflg");
        this._printdateflg = printdateflg;
    }

    /**
     * [get] SUPPLIERCD: {varchar(30)} <br>
     * 取引先（調達先）CD
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public String getSuppliercd() {
        return _suppliercd;
    }

    /**
     * [set] SUPPLIERCD: {varchar(30)} <br>
     * 取引先（調達先）CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public void setSuppliercd(String suppliercd) {
        __modifiedProperties.add("suppliercd");
        this._suppliercd = suppliercd;
    }

    /**
     * [get] DISPATCHQTYTYPE: {varchar(30)} <br>
     * ITMS配車数量タイプ
     * @return The value of the column 'DISPATCHQTYTYPE'. (NullAllowed)
     */
    public String getDispatchqtytype() {
        return _dispatchqtytype;
    }

    /**
     * [set] DISPATCHQTYTYPE: {varchar(30)} <br>
     * ITMS配車数量タイプ
     * @param dispatchqtytype The value of the column 'DISPATCHQTYTYPE'. (NullAllowed)
     */
    public void setDispatchqtytype(String dispatchqtytype) {
        __modifiedProperties.add("dispatchqtytype");
        this._dispatchqtytype = dispatchqtytype;
    }

    /**
     * [get] TARIFFQTYTYPE: {varchar(30)} <br>
     * 運用区分
     * @return The value of the column 'TARIFFQTYTYPE'. (NullAllowed)
     */
    public String getTariffqtytype() {
        return _tariffqtytype;
    }

    /**
     * [set] TARIFFQTYTYPE: {varchar(30)} <br>
     * 運用区分
     * @param tariffqtytype The value of the column 'TARIFFQTYTYPE'. (NullAllowed)
     */
    public void setTariffqtytype(String tariffqtytype) {
        __modifiedProperties.add("tariffqtytype");
        this._tariffqtytype = tariffqtytype;
    }

    /**
     * [get] USERUSE1: {varchar(60)} <br>
     * メーカー・CD
     * @return The value of the column 'USERUSE1'. (NullAllowed)
     */
    public String getUseruse1() {
        return _useruse1;
    }

    /**
     * [set] USERUSE1: {varchar(60)} <br>
     * メーカー・CD
     * @param useruse1 The value of the column 'USERUSE1'. (NullAllowed)
     */
    public void setUseruse1(String useruse1) {
        __modifiedProperties.add("useruse1");
        this._useruse1 = useruse1;
    }

    /**
     * [get] USERUSE2: {varchar(60)} <br>
     * 国CD
     * @return The value of the column 'USERUSE2'. (NullAllowed)
     */
    public String getUseruse2() {
        return _useruse2;
    }

    /**
     * [set] USERUSE2: {varchar(60)} <br>
     * 国CD
     * @param useruse2 The value of the column 'USERUSE2'. (NullAllowed)
     */
    public void setUseruse2(String useruse2) {
        __modifiedProperties.add("useruse2");
        this._useruse2 = useruse2;
    }

    /**
     * [get] USERUSE3: {varchar(60)} <br>
     * レコード更新処理区分
     * @return The value of the column 'USERUSE3'. (NullAllowed)
     */
    public String getUseruse3() {
        return _useruse3;
    }

    /**
     * [set] USERUSE3: {varchar(60)} <br>
     * レコード更新処理区分
     * @param useruse3 The value of the column 'USERUSE3'. (NullAllowed)
     */
    public void setUseruse3(String useruse3) {
        __modifiedProperties.add("useruse3");
        this._useruse3 = useruse3;
    }

    /**
     * [get] USERUSE4: {varchar(60)} <br>
     * 親銘柄CD
     * @return The value of the column 'USERUSE4'. (NullAllowed)
     */
    public String getUseruse4() {
        return _useruse4;
    }

    /**
     * [set] USERUSE4: {varchar(60)} <br>
     * 親銘柄CD
     * @param useruse4 The value of the column 'USERUSE4'. (NullAllowed)
     */
    public void setUseruse4(String useruse4) {
        __modifiedProperties.add("useruse4");
        this._useruse4 = useruse4;
    }

    /**
     * [get] USERUSE5: {varchar(60)} <br>
     * 出納用銘柄CD
     * @return The value of the column 'USERUSE5'. (NullAllowed)
     */
    public String getUseruse5() {
        return _useruse5;
    }

    /**
     * [set] USERUSE5: {varchar(60)} <br>
     * 出納用銘柄CD
     * @param useruse5 The value of the column 'USERUSE5'. (NullAllowed)
     */
    public void setUseruse5(String useruse5) {
        __modifiedProperties.add("useruse5");
        this._useruse5 = useruse5;
    }

    /**
     * [get] LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理１必須フラグ
     * @return The value of the column 'LOT1NULLFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getLot1nullflg() {
        return _lot1nullflg;
    }

    /**
     * [set] LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理１必須フラグ
     * @param lot1nullflg The value of the column 'LOT1NULLFLG'. (NullAllowed)
     */
    public void setLot1nullflg(java.math.BigDecimal lot1nullflg) {
        __modifiedProperties.add("lot1nullflg");
        this._lot1nullflg = lot1nullflg;
    }

    /**
     * [get] LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理２必須フラグ
     * @return The value of the column 'LOT2NULLFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getLot2nullflg() {
        return _lot2nullflg;
    }

    /**
     * [set] LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理２必須フラグ
     * @param lot2nullflg The value of the column 'LOT2NULLFLG'. (NullAllowed)
     */
    public void setLot2nullflg(java.math.BigDecimal lot2nullflg) {
        __modifiedProperties.add("lot2nullflg");
        this._lot2nullflg = lot2nullflg;
    }

    /**
     * [get] LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理３必須フラグ
     * @return The value of the column 'LOT3NULLFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getLot3nullflg() {
        return _lot3nullflg;
    }

    /**
     * [set] LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理３必須フラグ
     * @param lot3nullflg The value of the column 'LOT3NULLFLG'. (NullAllowed)
     */
    public void setLot3nullflg(java.math.BigDecimal lot3nullflg) {
        __modifiedProperties.add("lot3nullflg");
        this._lot3nullflg = lot3nullflg;
    }

    /**
     * [get] LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理４必須フラグ
     * @return The value of the column 'LOT4NULLFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getLot4nullflg() {
        return _lot4nullflg;
    }

    /**
     * [set] LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理４必須フラグ
     * @param lot4nullflg The value of the column 'LOT4NULLFLG'. (NullAllowed)
     */
    public void setLot4nullflg(java.math.BigDecimal lot4nullflg) {
        __modifiedProperties.add("lot4nullflg");
        this._lot4nullflg = lot4nullflg;
    }

    /**
     * [get] LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理５必須フラグ
     * @return The value of the column 'LOT5NULLFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getLot5nullflg() {
        return _lot5nullflg;
    }

    /**
     * [set] LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理５必須フラグ
     * @param lot5nullflg The value of the column 'LOT5NULLFLG'. (NullAllowed)
     */
    public void setLot5nullflg(java.math.BigDecimal lot5nullflg) {
        __modifiedProperties.add("lot5nullflg");
        this._lot5nullflg = lot5nullflg;
    }

    /**
     * [get] OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性１必須フラグ
     * @return The value of the column 'OTHERLOT1NULLFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getOtherlot1nullflg() {
        return _otherlot1nullflg;
    }

    /**
     * [set] OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性１必須フラグ
     * @param otherlot1nullflg The value of the column 'OTHERLOT1NULLFLG'. (NullAllowed)
     */
    public void setOtherlot1nullflg(java.math.BigDecimal otherlot1nullflg) {
        __modifiedProperties.add("otherlot1nullflg");
        this._otherlot1nullflg = otherlot1nullflg;
    }

    /**
     * [get] OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性２必須フラグ
     * @return The value of the column 'OTHERLOT2NULLFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getOtherlot2nullflg() {
        return _otherlot2nullflg;
    }

    /**
     * [set] OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性２必須フラグ
     * @param otherlot2nullflg The value of the column 'OTHERLOT2NULLFLG'. (NullAllowed)
     */
    public void setOtherlot2nullflg(java.math.BigDecimal otherlot2nullflg) {
        __modifiedProperties.add("otherlot2nullflg");
        this._otherlot2nullflg = otherlot2nullflg;
    }

    /**
     * [get] OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性３必須フラグ
     * @return The value of the column 'OTHERLOT3NULLFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getOtherlot3nullflg() {
        return _otherlot3nullflg;
    }

    /**
     * [set] OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性３必須フラグ
     * @param otherlot3nullflg The value of the column 'OTHERLOT3NULLFLG'. (NullAllowed)
     */
    public void setOtherlot3nullflg(java.math.BigDecimal otherlot3nullflg) {
        __modifiedProperties.add("otherlot3nullflg");
        this._otherlot3nullflg = otherlot3nullflg;
    }

    /**
     * [get] OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性４必須フラグ
     * @return The value of the column 'OTHERLOT4NULLFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getOtherlot4nullflg() {
        return _otherlot4nullflg;
    }

    /**
     * [set] OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性４必須フラグ
     * @param otherlot4nullflg The value of the column 'OTHERLOT4NULLFLG'. (NullAllowed)
     */
    public void setOtherlot4nullflg(java.math.BigDecimal otherlot4nullflg) {
        __modifiedProperties.add("otherlot4nullflg");
        this._otherlot4nullflg = otherlot4nullflg;
    }

    /**
     * [get] OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性５必須フラグ
     * @return The value of the column 'OTHERLOT5NULLFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getOtherlot5nullflg() {
        return _otherlot5nullflg;
    }

    /**
     * [set] OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性５必須フラグ
     * @param otherlot5nullflg The value of the column 'OTHERLOT5NULLFLG'. (NullAllowed)
     */
    public void setOtherlot5nullflg(java.math.BigDecimal otherlot5nullflg) {
        __modifiedProperties.add("otherlot5nullflg");
        this._otherlot5nullflg = otherlot5nullflg;
    }

    /**
     * [get] ITEMPRINTNAME: {varchar(255)} <br>
     * 銘柄表示（印刷）名称
     * @return The value of the column 'ITEMPRINTNAME'. (NullAllowed)
     */
    public String getItemprintname() {
        return _itemprintname;
    }

    /**
     * [set] ITEMPRINTNAME: {varchar(255)} <br>
     * 銘柄表示（印刷）名称
     * @param itemprintname The value of the column 'ITEMPRINTNAME'. (NullAllowed)
     */
    public void setItemprintname(String itemprintname) {
        __modifiedProperties.add("itemprintname");
        this._itemprintname = itemprintname;
    }

    /**
     * [get] PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 銘柄単価設定レベル
     * @return The value of the column 'PRICELEVEL'. (NullAllowed)
     */
    public java.math.BigDecimal getPricelevel() {
        return _pricelevel;
    }

    /**
     * [set] PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 銘柄単価設定レベル
     * @param pricelevel The value of the column 'PRICELEVEL'. (NullAllowed)
     */
    public void setPricelevel(java.math.BigDecimal pricelevel) {
        __modifiedProperties.add("pricelevel");
        this._pricelevel = pricelevel;
    }

    /**
     * [get] ITEMCATALOGURL: {varchar(255)} <br>
     * 銘柄紹介URL
     * @return The value of the column 'ITEMCATALOGURL'. (NullAllowed)
     */
    public String getItemcatalogurl() {
        return _itemcatalogurl;
    }

    /**
     * [set] ITEMCATALOGURL: {varchar(255)} <br>
     * 銘柄紹介URL
     * @param itemcatalogurl The value of the column 'ITEMCATALOGURL'. (NullAllowed)
     */
    public void setItemcatalogurl(String itemcatalogurl) {
        __modifiedProperties.add("itemcatalogurl");
        this._itemcatalogurl = itemcatalogurl;
    }

    /**
     * [get] USERNUM1: {bigint(19), default=[(0)]} <br>
     * 国産・輸入区分
     * @return The value of the column 'USERNUM1'. (NullAllowed)
     */
    public Long getUsernum1() {
        return _usernum1;
    }

    /**
     * [set] USERNUM1: {bigint(19), default=[(0)]} <br>
     * 国産・輸入区分
     * @param usernum1 The value of the column 'USERNUM1'. (NullAllowed)
     */
    public void setUsernum1(Long usernum1) {
        __modifiedProperties.add("usernum1");
        this._usernum1 = usernum1;
    }

    /**
     * [get] USERNUM2: {bigint(19), default=[(0)]} <br>
     * カートン形状
     * @return The value of the column 'USERNUM2'. (NullAllowed)
     */
    public Long getUsernum2() {
        return _usernum2;
    }

    /**
     * [set] USERNUM2: {bigint(19), default=[(0)]} <br>
     * カートン形状
     * @param usernum2 The value of the column 'USERNUM2'. (NullAllowed)
     */
    public void setUsernum2(Long usernum2) {
        __modifiedProperties.add("usernum2");
        this._usernum2 = usernum2;
    }

    /**
     * [get] USERNUM3: {bigint(19), default=[(0)]} <br>
     * 一般出力順
     * @return The value of the column 'USERNUM3'. (NullAllowed)
     */
    public Long getUsernum3() {
        return _usernum3;
    }

    /**
     * [set] USERNUM3: {bigint(19), default=[(0)]} <br>
     * 一般出力順
     * @param usernum3 The value of the column 'USERNUM3'. (NullAllowed)
     */
    public void setUsernum3(Long usernum3) {
        __modifiedProperties.add("usernum3");
        this._usernum3 = usernum3;
    }

    /**
     * [get] USERNUM4: {bigint(19), default=[(0)]} <br>
     * CAP銘柄区分
     * @return The value of the column 'USERNUM4'. (NullAllowed)
     */
    public Long getUsernum4() {
        return _usernum4;
    }

    /**
     * [set] USERNUM4: {bigint(19), default=[(0)]} <br>
     * CAP銘柄区分
     * @param usernum4 The value of the column 'USERNUM4'. (NullAllowed)
     */
    public void setUsernum4(Long usernum4) {
        __modifiedProperties.add("usernum4");
        this._usernum4 = usernum4;
    }

    /**
     * [get] USERNUM5: {bigint(19), default=[(0)]} <br>
     * 製品包装形態
     * @return The value of the column 'USERNUM5'. (NullAllowed)
     */
    public Long getUsernum5() {
        return _usernum5;
    }

    /**
     * [set] USERNUM5: {bigint(19), default=[(0)]} <br>
     * 製品包装形態
     * @param usernum5 The value of the column 'USERNUM5'. (NullAllowed)
     */
    public void setUsernum5(Long usernum5) {
        __modifiedProperties.add("usernum5");
        this._usernum5 = usernum5;
    }

    /**
     * [get] USERDATE1: {varchar(8)} <br>
     * 適用開始年月日
     * @return The value of the column 'USERDATE1'. (NullAllowed)
     */
    public String getUserdate1() {
        return _userdate1;
    }

    /**
     * [set] USERDATE1: {varchar(8)} <br>
     * 適用開始年月日
     * @param userdate1 The value of the column 'USERDATE1'. (NullAllowed)
     */
    public void setUserdate1(String userdate1) {
        __modifiedProperties.add("userdate1");
        this._userdate1 = userdate1;
    }

    /**
     * [get] USERDATE2: {varchar(8)} <br>
     * 適用終了年月日
     * @return The value of the column 'USERDATE2'. (NullAllowed)
     */
    public String getUserdate2() {
        return _userdate2;
    }

    /**
     * [set] USERDATE2: {varchar(8)} <br>
     * 適用終了年月日
     * @param userdate2 The value of the column 'USERDATE2'. (NullAllowed)
     */
    public void setUserdate2(String userdate2) {
        __modifiedProperties.add("userdate2");
        this._userdate2 = userdate2;
    }

    /**
     * [get] USERDATE3: {varchar(8)} <br>
     * 廃止年月日
     * @return The value of the column 'USERDATE3'. (NullAllowed)
     */
    public String getUserdate3() {
        return _userdate3;
    }

    /**
     * [set] USERDATE3: {varchar(8)} <br>
     * 廃止年月日
     * @param userdate3 The value of the column 'USERDATE3'. (NullAllowed)
     */
    public void setUserdate3(String userdate3) {
        __modifiedProperties.add("userdate3");
        this._userdate3 = userdate3;
    }

    /**
     * [get] USERDATE4: {varchar(8)} <br>
     * 取扱中止年月日
     * @return The value of the column 'USERDATE4'. (NullAllowed)
     */
    public String getUserdate4() {
        return _userdate4;
    }

    /**
     * [set] USERDATE4: {varchar(8)} <br>
     * 取扱中止年月日
     * @param userdate4 The value of the column 'USERDATE4'. (NullAllowed)
     */
    public void setUserdate4(String userdate4) {
        __modifiedProperties.add("userdate4");
        this._userdate4 = userdate4;
    }

    /**
     * [get] USERDATE5: {varchar(8)} <br>
     * 発売年月日
     * @return The value of the column 'USERDATE5'. (NullAllowed)
     */
    public String getUserdate5() {
        return _userdate5;
    }

    /**
     * [set] USERDATE5: {varchar(8)} <br>
     * 発売年月日
     * @param userdate5 The value of the column 'USERDATE5'. (NullAllowed)
     */
    public void setUserdate5(String userdate5) {
        __modifiedProperties.add("userdate5");
        this._userdate5 = userdate5;
    }

    /**
     * [get] CGGDID: {varchar(30)} <br>
     * たばこ・商品区分
     * @return The value of the column 'CGGDID'. (NullAllowed)
     */
    public String getCggdid() {
        return _cggdid;
    }

    /**
     * [set] CGGDID: {varchar(30)} <br>
     * たばこ・商品区分
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed)
     */
    public void setCggdid(String cggdid) {
        __modifiedProperties.add("cggdid");
        this._cggdid = cggdid;
    }

    /**
     * [get] BRCTG: {NotNull, bigint(19), default=[(0)]} <br>
     * 銘柄カテゴリ
     * @return The value of the column 'BRCTG'. (NullAllowed)
     */
    public Long getBrctg() {
        return _brctg;
    }

    /**
     * [set] BRCTG: {NotNull, bigint(19), default=[(0)]} <br>
     * 銘柄カテゴリ
     * @param brctg The value of the column 'BRCTG'. (NullAllowed)
     */
    public void setBrctg(Long brctg) {
        __modifiedProperties.add("brctg");
        this._brctg = brctg;
    }

    /**
     * [get] CTWEIGHT: {bigint(19)} <br>
     * カートン重量(g)
     * @return The value of the column 'CTWEIGHT'. (NullAllowed)
     */
    public Long getCtweight() {
        return _ctweight;
    }

    /**
     * [set] CTWEIGHT: {bigint(19)} <br>
     * カートン重量(g)
     * @param ctweight The value of the column 'CTWEIGHT'. (NullAllowed)
     */
    public void setCtweight(Long ctweight) {
        __modifiedProperties.add("ctweight");
        this._ctweight = ctweight;
    }

    /**
     * [get] BXOSZL: {bigint(19)} <br>
     * 段ボール(外寸)(L)
     * @return The value of the column 'BXOSZL'. (NullAllowed)
     */
    public Long getBxoszl() {
        return _bxoszl;
    }

    /**
     * [set] BXOSZL: {bigint(19)} <br>
     * 段ボール(外寸)(L)
     * @param bxoszl The value of the column 'BXOSZL'. (NullAllowed)
     */
    public void setBxoszl(Long bxoszl) {
        __modifiedProperties.add("bxoszl");
        this._bxoszl = bxoszl;
    }

    /**
     * [get] BXOSZW: {bigint(19)} <br>
     * 段ボール(外寸)(W)
     * @return The value of the column 'BXOSZW'. (NullAllowed)
     */
    public Long getBxoszw() {
        return _bxoszw;
    }

    /**
     * [set] BXOSZW: {bigint(19)} <br>
     * 段ボール(外寸)(W)
     * @param bxoszw The value of the column 'BXOSZW'. (NullAllowed)
     */
    public void setBxoszw(Long bxoszw) {
        __modifiedProperties.add("bxoszw");
        this._bxoszw = bxoszw;
    }

    /**
     * [get] BXOSZH: {bigint(19)} <br>
     * 段ボール(外寸)(H)
     * @return The value of the column 'BXOSZH'. (NullAllowed)
     */
    public Long getBxoszh() {
        return _bxoszh;
    }

    /**
     * [set] BXOSZH: {bigint(19)} <br>
     * 段ボール(外寸)(H)
     * @param bxoszh The value of the column 'BXOSZH'. (NullAllowed)
     */
    public void setBxoszh(Long bxoszh) {
        __modifiedProperties.add("bxoszh");
        this._bxoszh = bxoszh;
    }

    /**
     * [get] BXCPY: {bigint(19)} <br>
     * 段ボール(外寸)体積(cm³)
     * @return The value of the column 'BXCPY'. (NullAllowed)
     */
    public Long getBxcpy() {
        return _bxcpy;
    }

    /**
     * [set] BXCPY: {bigint(19)} <br>
     * 段ボール(外寸)体積(cm³)
     * @param bxcpy The value of the column 'BXCPY'. (NullAllowed)
     */
    public void setBxcpy(Long bxcpy) {
        __modifiedProperties.add("bxcpy");
        this._bxcpy = bxcpy;
    }

    /**
     * [get] BXWEIGHT: {bigint(19)} <br>
     * 段ボール(外寸)重量(g)
     * @return The value of the column 'BXWEIGHT'. (NullAllowed)
     */
    public Long getBxweight() {
        return _bxweight;
    }

    /**
     * [set] BXWEIGHT: {bigint(19)} <br>
     * 段ボール(外寸)重量(g)
     * @param bxweight The value of the column 'BXWEIGHT'. (NullAllowed)
     */
    public void setBxweight(Long bxweight) {
        __modifiedProperties.add("bxweight");
        this._bxweight = bxweight;
    }

    /**
     * [get] ITEM_ADMIN: {NotNull, varchar(255)} <br>
     * 銘柄管理社
     * @return The value of the column 'ITEM_ADMIN'. (NullAllowed)
     */
    public String getItemAdmin() {
        return _itemAdmin;
    }

    /**
     * [set] ITEM_ADMIN: {NotNull, varchar(255)} <br>
     * 銘柄管理社
     * @param itemAdmin The value of the column 'ITEM_ADMIN'. (NullAllowed)
     */
    public void setItemAdmin(String itemAdmin) {
        __modifiedProperties.add("itemAdmin");
        this._itemAdmin = itemAdmin;
    }

    /**
     * [get] SNAME: {varchar(60)} <br>
     * 銘柄名正称(全角)
     * @return The value of the column 'SNAME'. (NullAllowed)
     */
    public String getSname() {
        return _sname;
    }

    /**
     * [set] SNAME: {varchar(60)} <br>
     * 銘柄名正称(全角)
     * @param sname The value of the column 'SNAME'. (NullAllowed)
     */
    public void setSname(String sname) {
        __modifiedProperties.add("sname");
        this._sname = sname;
    }

    /**
     * [get] FractionPieceWeight: {decimal(16, 6)} <br>
     * 端数有り個数重量
     * @return The value of the column 'FractionPieceWeight'. (NullAllowed)
     */
    public java.math.BigDecimal getFractionpieceweight() {
        return _fractionpieceweight;
    }

    /**
     * [set] FractionPieceWeight: {decimal(16, 6)} <br>
     * 端数有り個数重量
     * @param fractionpieceweight The value of the column 'FractionPieceWeight'. (NullAllowed)
     */
    public void setFractionpieceweight(java.math.BigDecimal fractionpieceweight) {
        __modifiedProperties.add("fractionpieceweight");
        this._fractionpieceweight = fractionpieceweight;
    }

    /**
     * [get] TaxEquivalentNumber: {decimal(16, 6)} <br>
     * たばこ税換算本数
     * @return The value of the column 'TaxEquivalentNumber'. (NullAllowed)
     */
    public java.math.BigDecimal getTaxequivalentnumber() {
        return _taxequivalentnumber;
    }

    /**
     * [set] TaxEquivalentNumber: {decimal(16, 6)} <br>
     * たばこ税換算本数
     * @param taxequivalentnumber The value of the column 'TaxEquivalentNumber'. (NullAllowed)
     */
    public void setTaxequivalentnumber(java.math.BigDecimal taxequivalentnumber) {
        __modifiedProperties.add("taxequivalentnumber");
        this._taxequivalentnumber = taxequivalentnumber;
    }

    /**
     * [get] SYHNKBNJT: {varchar(30)} <br>
     * ＪＴ輸入使用区分
     * @return The value of the column 'SYHNKBNJT'. (NullAllowed)
     */
    public String getSyhnkbnjt() {
        return _syhnkbnjt;
    }

    /**
     * [set] SYHNKBNJT: {varchar(30)} <br>
     * ＪＴ輸入使用区分
     * @param syhnkbnjt The value of the column 'SYHNKBNJT'. (NullAllowed)
     */
    public void setSyhnkbnjt(String syhnkbnjt) {
        __modifiedProperties.add("syhnkbnjt");
        this._syhnkbnjt = syhnkbnjt;
    }

    /**
     * [get] IOID_CLS: {varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'IOID_CLS'. (NullAllowed)
     */
    public String getIoidCls() {
        return _ioidCls;
    }

    /**
     * [set] IOID_CLS: {varchar(30)} <br>
     * 内外区分
     * @param ioidCls The value of the column 'IOID_CLS'. (NullAllowed)
     */
    public void setIoidCls(String ioidCls) {
        __modifiedProperties.add("ioidCls");
        this._ioidCls = ioidCls;
    }

    /**
     * [get] ITFCD_CLS: {varchar(30)} <br>
     * カートンバーコード区分
     * @return The value of the column 'ITFCD_CLS'. (NullAllowed)
     */
    public String getItfcdCls() {
        return _itfcdCls;
    }

    /**
     * [set] ITFCD_CLS: {varchar(30)} <br>
     * カートンバーコード区分
     * @param itfcdCls The value of the column 'ITFCD_CLS'. (NullAllowed)
     */
    public void setItfcdCls(String itfcdCls) {
        __modifiedProperties.add("itfcdCls");
        this._itfcdCls = itfcdCls;
    }

    /**
     * [get] MANUITEMCD_CLS: {varchar(30)} <br>
     * 段ボールバーコード区分
     * @return The value of the column 'MANUITEMCD_CLS'. (NullAllowed)
     */
    public String getManuitemcdCls() {
        return _manuitemcdCls;
    }

    /**
     * [set] MANUITEMCD_CLS: {varchar(30)} <br>
     * 段ボールバーコード区分
     * @param manuitemcdCls The value of the column 'MANUITEMCD_CLS'. (NullAllowed)
     */
    public void setManuitemcdCls(String manuitemcdCls) {
        __modifiedProperties.add("manuitemcdCls");
        this._manuitemcdCls = manuitemcdCls;
    }

    /**
     * [get] CTCPY: {bigint(19)} <br>
     * カートン体積(cm³)
     * @return The value of the column 'CTCPY'. (NullAllowed)
     */
    public Long getCtcpy() {
        return _ctcpy;
    }

    /**
     * [set] CTCPY: {bigint(19)} <br>
     * カートン体積(cm³)
     * @param ctcpy The value of the column 'CTCPY'. (NullAllowed)
     */
    public void setCtcpy(Long ctcpy) {
        __modifiedProperties.add("ctcpy");
        this._ctcpy = ctcpy;
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
