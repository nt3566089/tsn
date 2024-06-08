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
 * The entity of M_PRODUCT as TABLE. <br>
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
 * [foreign table]
 *     M_CLIENT, M_PRODUCT, M_SHAPE_GRP, B_CLASS_DTL(ByDelFlg), M_PRODUCT_TERM(AsOne), M_SET_PARENT(AsOne)
 *
 * [referrer table]
 *     M_LOCATION, M_MFWHxITEM, M_PRODUCT_SHAPE, M_SET_STRUCTURE, T_ALLOC_INST_B, T_ALLOC_LOT, T_INVENTORY_B, T_KEEPING_LOT, T_LAST_LOT, T_LOT, T_MOVE_INST_B, T_RECEIVE_PLAN_B, T_SERIAL_NO, T_SHIPPING_INST_B, T_STOCK, T_TRINVCHECKINFO, T_YTRSODETAIL, W_HT_INVENTORY_INPUT_PROD, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SHIPPING, W_HT_SHIPPING_PICKING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT, M_PRODUCT, M_PRODUCT_TERM, M_SET_PARENT
 *
 * [foreign property]
 *     mClient, mProductSelf, mShapeGrp, bClassDtlByDelFlg, bClassDtlByLimitDtManagFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotManagFlg, bClassDtlByLotReverseFlg, bClassDtlByMergeCls, bClassDtlByShippingStopFlg, bClassDtlByFreightCls, mProductSelfAsOne, mProductTermAsOne, mSetParentAsOne
 *
 * [referrer property]
 *     mLocationList, mMfwhxitemList, mProductShapeList, mSetStructureList, tAllocInstBList, tAllocLotList, tInventoryBList, tKeepingLotList, tLastLotList, tLotList, tMoveInstBList, tReceivePlanBList, tSerialNoList, tShippingInstBList, tStockList, tTrinvcheckinfoList, tYtrsodetailList, wHtInventoryInputProdList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtShippingList, wHtShippingPickingList, wSglRowShipInspHList, wShippingInterruptList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long productId = entity.getProductId();
 * Long clientId = entity.getClientId();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String productAbbr = entity.getProductAbbr();
 * String janCd = entity.getJanCd();
 * String lotManagFlg = entity.getLotManagFlg();
 * String limitDtManagFlg = entity.getLimitDtManagFlg();
 * Long receiveLimitNum = entity.getReceiveLimitNum();
 * Long shippingLimitNum = entity.getShippingLimitNum();
 * String mergeCls = entity.getMergeCls();
 * String lotReverseFlg = entity.getLotReverseFlg();
 * String limitDtReverseFlg = entity.getLimitDtReverseFlg();
 * String shippingStopFlg = entity.getShippingStopFlg();
 * java.math.BigDecimal fixedPoint = entity.getFixedPoint();
 * Long shapeGrpId = entity.getShapeGrpId();
 * String nmfcCode = entity.getNmfcCode();
 * String freightCls = entity.getFreightCls();
 * String counntryOfOrigin = entity.getCounntryOfOrigin();
 * java.math.BigDecimal unitVal = entity.getUnitVal();
 * String htsCd = entity.getHtsCd();
 * String itemgroup = entity.getItemgroup();
 * java.math.BigDecimal actflg = entity.getActflg();
 * String invtype = entity.getInvtype();
 * java.math.BigDecimal setitemflg = entity.getSetitemflg();
 * String owneritemcd = entity.getOwneritemcd();
 * String supplieritemcd = entity.getSupplieritemcd();
 * String positemcd = entity.getPositemcd();
 * String itfcd = entity.getItfcd();
 * String manuitemcd = entity.getManuitemcd();
 * Long priceBuy = entity.getPriceBuy();
 * Long priceWholesale = entity.getPriceWholesale();
 * Long priceSale = entity.getPriceSale();
 * java.math.BigDecimal allocpolicykey = entity.getAllocpolicykey();
 * java.math.BigDecimal slotpolicykey = entity.getSlotpolicykey();
 * java.math.BigDecimal inworkingkey = entity.getInworkingkey();
 * java.math.BigDecimal outworkingkey = entity.getOutworkingkey();
 * String abctype = entity.getAbctype();
 * java.math.BigDecimal qty1type = entity.getQty1type();
 * java.math.BigDecimal unit1 = entity.getUnit1();
 * String unit1style = entity.getUnit1style();
 * Long length1 = entity.getLength1();
 * Long width1 = entity.getWidth1();
 * Long height1 = entity.getHeight1();
 * Long grossweight1 = entity.getGrossweight1();
 * Long netweight1 = entity.getNetweight1();
 * Long cube1 = entity.getCube1();
 * Long liter1 = entity.getLiter1();
 * java.math.BigDecimal unit2 = entity.getUnit2();
 * String unit2style = entity.getUnit2style();
 * Long length2 = entity.getLength2();
 * Long width2 = entity.getWidth2();
 * Long height2 = entity.getHeight2();
 * Long grossweight2 = entity.getGrossweight2();
 * Long netweight2 = entity.getNetweight2();
 * Long cube2 = entity.getCube2();
 * Long liter2 = entity.getLiter2();
 * java.math.BigDecimal unit3 = entity.getUnit3();
 * String unit3style = entity.getUnit3style();
 * Long length3 = entity.getLength3();
 * Long width3 = entity.getWidth3();
 * Long height3 = entity.getHeight3();
 * Long grossweight3 = entity.getGrossweight3();
 * Long netweight3 = entity.getNetweight3();
 * Long cube3 = entity.getCube3();
 * Long liter3 = entity.getLiter3();
 * java.math.BigDecimal pQty = entity.getPQty();
 * java.math.BigDecimal pHeight = entity.getPHeight();
 * java.math.BigDecimal pOdd = entity.getPOdd();
 * String pDescription = entity.getPDescription();
 * String notes = entity.getNotes();
 * java.math.BigDecimal qty2usedflg = entity.getQty2usedflg();
 * String qty2style = entity.getQty2style();
 * java.math.BigDecimal qty3usedflg = entity.getQty3usedflg();
 * String qty3style = entity.getQty3style();
 * java.math.BigDecimal spCalcflg = entity.getSpCalcflg();
 * java.math.BigDecimal spLotatrb1usedflg = entity.getSpLotatrb1usedflg();
 * String spOperator1 = entity.getSpOperator1();
 * java.math.BigDecimal spLotatrb2usedflg = entity.getSpLotatrb2usedflg();
 * String spOperator2 = entity.getSpOperator2();
 * java.math.BigDecimal spLotatrb3usedflg = entity.getSpLotatrb3usedflg();
 * String spOperator3 = entity.getSpOperator3();
 * Long spRate = entity.getSpRate();
 * String lotatrb1title = entity.getLotatrb1title();
 * String lotatrb2title = entity.getLotatrb2title();
 * String lotatrb3title = entity.getLotatrb3title();
 * String lotatrb4title = entity.getLotatrb4title();
 * String lotatrb5title = entity.getLotatrb5title();
 * String lotatrb6title = entity.getLotatrb6title();
 * String lotatrb7title = entity.getLotatrb7title();
 * String lotatrb8title = entity.getLotatrb8title();
 * String lotatrb9title = entity.getLotatrb9title();
 * String lotatrb10title = entity.getLotatrb10title();
 * String fUser1 = entity.getFUser1();
 * String fUser2 = entity.getFUser2();
 * String fUser3 = entity.getFUser3();
 * String fUser4 = entity.getFUser4();
 * String fUser5 = entity.getFUser5();
 * java.math.BigDecimal item40 = entity.getItem40();
 * Long priceInsurance = entity.getPriceInsurance();
 * java.math.BigDecimal limitday = entity.getLimitday();
 * Long deliverableday = entity.getDeliverableday();
 * java.math.BigDecimal printdateflg = entity.getPrintdateflg();
 * String suppliercd = entity.getSuppliercd();
 * String dispatchqtytype = entity.getDispatchqtytype();
 * String tariffqtytype = entity.getTariffqtytype();
 * String useruse1 = entity.getUseruse1();
 * String useruse2 = entity.getUseruse2();
 * String useruse3 = entity.getUseruse3();
 * String useruse4 = entity.getUseruse4();
 * String useruse5 = entity.getUseruse5();
 * java.math.BigDecimal lot1nullflg = entity.getLot1nullflg();
 * java.math.BigDecimal lot2nullflg = entity.getLot2nullflg();
 * java.math.BigDecimal lot3nullflg = entity.getLot3nullflg();
 * java.math.BigDecimal lot4nullflg = entity.getLot4nullflg();
 * java.math.BigDecimal lot5nullflg = entity.getLot5nullflg();
 * java.math.BigDecimal otherlot1nullflg = entity.getOtherlot1nullflg();
 * java.math.BigDecimal otherlot2nullflg = entity.getOtherlot2nullflg();
 * java.math.BigDecimal otherlot3nullflg = entity.getOtherlot3nullflg();
 * java.math.BigDecimal otherlot4nullflg = entity.getOtherlot4nullflg();
 * java.math.BigDecimal otherlot5nullflg = entity.getOtherlot5nullflg();
 * String itemprintname = entity.getItemprintname();
 * java.math.BigDecimal pricelevel = entity.getPricelevel();
 * String itemcatalogurl = entity.getItemcatalogurl();
 * Long usernum1 = entity.getUsernum1();
 * Long usernum2 = entity.getUsernum2();
 * Long usernum3 = entity.getUsernum3();
 * Long usernum4 = entity.getUsernum4();
 * Long usernum5 = entity.getUsernum5();
 * String userdate1 = entity.getUserdate1();
 * String userdate2 = entity.getUserdate2();
 * String userdate3 = entity.getUserdate3();
 * String userdate4 = entity.getUserdate4();
 * String userdate5 = entity.getUserdate5();
 * String cggdid = entity.getCggdid();
 * Long brctg = entity.getBrctg();
 * Long ctweight = entity.getCtweight();
 * Long bxoszl = entity.getBxoszl();
 * Long bxoszw = entity.getBxoszw();
 * Long bxoszh = entity.getBxoszh();
 * Long bxcpy = entity.getBxcpy();
 * Long bxweight = entity.getBxweight();
 * String itemAdmin = entity.getItemAdmin();
 * String sname = entity.getSname();
 * java.math.BigDecimal fractionpieceweight = entity.getFractionpieceweight();
 * java.math.BigDecimal taxequivalentnumber = entity.getTaxequivalentnumber();
 * String syhnkbnjt = entity.getSyhnkbnjt();
 * String ioidCls = entity.getIoidCls();
 * String itfcdCls = entity.getItfcdCls();
 * String manuitemcdCls = entity.getManuitemcdCls();
 * Long ctcpy = entity.getCtcpy();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setProductId(productId);
 * entity.setClientId(clientId);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setProductAbbr(productAbbr);
 * entity.setJanCd(janCd);
 * entity.setLotManagFlg(lotManagFlg);
 * entity.setLimitDtManagFlg(limitDtManagFlg);
 * entity.setReceiveLimitNum(receiveLimitNum);
 * entity.setShippingLimitNum(shippingLimitNum);
 * entity.setMergeCls(mergeCls);
 * entity.setLotReverseFlg(lotReverseFlg);
 * entity.setLimitDtReverseFlg(limitDtReverseFlg);
 * entity.setShippingStopFlg(shippingStopFlg);
 * entity.setFixedPoint(fixedPoint);
 * entity.setShapeGrpId(shapeGrpId);
 * entity.setNmfcCode(nmfcCode);
 * entity.setFreightCls(freightCls);
 * entity.setCounntryOfOrigin(counntryOfOrigin);
 * entity.setUnitVal(unitVal);
 * entity.setHtsCd(htsCd);
 * entity.setItemgroup(itemgroup);
 * entity.setActflg(actflg);
 * entity.setInvtype(invtype);
 * entity.setSetitemflg(setitemflg);
 * entity.setOwneritemcd(owneritemcd);
 * entity.setSupplieritemcd(supplieritemcd);
 * entity.setPositemcd(positemcd);
 * entity.setItfcd(itfcd);
 * entity.setManuitemcd(manuitemcd);
 * entity.setPriceBuy(priceBuy);
 * entity.setPriceWholesale(priceWholesale);
 * entity.setPriceSale(priceSale);
 * entity.setAllocpolicykey(allocpolicykey);
 * entity.setSlotpolicykey(slotpolicykey);
 * entity.setInworkingkey(inworkingkey);
 * entity.setOutworkingkey(outworkingkey);
 * entity.setAbctype(abctype);
 * entity.setQty1type(qty1type);
 * entity.setUnit1(unit1);
 * entity.setUnit1style(unit1style);
 * entity.setLength1(length1);
 * entity.setWidth1(width1);
 * entity.setHeight1(height1);
 * entity.setGrossweight1(grossweight1);
 * entity.setNetweight1(netweight1);
 * entity.setCube1(cube1);
 * entity.setLiter1(liter1);
 * entity.setUnit2(unit2);
 * entity.setUnit2style(unit2style);
 * entity.setLength2(length2);
 * entity.setWidth2(width2);
 * entity.setHeight2(height2);
 * entity.setGrossweight2(grossweight2);
 * entity.setNetweight2(netweight2);
 * entity.setCube2(cube2);
 * entity.setLiter2(liter2);
 * entity.setUnit3(unit3);
 * entity.setUnit3style(unit3style);
 * entity.setLength3(length3);
 * entity.setWidth3(width3);
 * entity.setHeight3(height3);
 * entity.setGrossweight3(grossweight3);
 * entity.setNetweight3(netweight3);
 * entity.setCube3(cube3);
 * entity.setLiter3(liter3);
 * entity.setPQty(pQty);
 * entity.setPHeight(pHeight);
 * entity.setPOdd(pOdd);
 * entity.setPDescription(pDescription);
 * entity.setNotes(notes);
 * entity.setQty2usedflg(qty2usedflg);
 * entity.setQty2style(qty2style);
 * entity.setQty3usedflg(qty3usedflg);
 * entity.setQty3style(qty3style);
 * entity.setSpCalcflg(spCalcflg);
 * entity.setSpLotatrb1usedflg(spLotatrb1usedflg);
 * entity.setSpOperator1(spOperator1);
 * entity.setSpLotatrb2usedflg(spLotatrb2usedflg);
 * entity.setSpOperator2(spOperator2);
 * entity.setSpLotatrb3usedflg(spLotatrb3usedflg);
 * entity.setSpOperator3(spOperator3);
 * entity.setSpRate(spRate);
 * entity.setLotatrb1title(lotatrb1title);
 * entity.setLotatrb2title(lotatrb2title);
 * entity.setLotatrb3title(lotatrb3title);
 * entity.setLotatrb4title(lotatrb4title);
 * entity.setLotatrb5title(lotatrb5title);
 * entity.setLotatrb6title(lotatrb6title);
 * entity.setLotatrb7title(lotatrb7title);
 * entity.setLotatrb8title(lotatrb8title);
 * entity.setLotatrb9title(lotatrb9title);
 * entity.setLotatrb10title(lotatrb10title);
 * entity.setFUser1(fUser1);
 * entity.setFUser2(fUser2);
 * entity.setFUser3(fUser3);
 * entity.setFUser4(fUser4);
 * entity.setFUser5(fUser5);
 * entity.setItem40(item40);
 * entity.setPriceInsurance(priceInsurance);
 * entity.setLimitday(limitday);
 * entity.setDeliverableday(deliverableday);
 * entity.setPrintdateflg(printdateflg);
 * entity.setSuppliercd(suppliercd);
 * entity.setDispatchqtytype(dispatchqtytype);
 * entity.setTariffqtytype(tariffqtytype);
 * entity.setUseruse1(useruse1);
 * entity.setUseruse2(useruse2);
 * entity.setUseruse3(useruse3);
 * entity.setUseruse4(useruse4);
 * entity.setUseruse5(useruse5);
 * entity.setLot1nullflg(lot1nullflg);
 * entity.setLot2nullflg(lot2nullflg);
 * entity.setLot3nullflg(lot3nullflg);
 * entity.setLot4nullflg(lot4nullflg);
 * entity.setLot5nullflg(lot5nullflg);
 * entity.setOtherlot1nullflg(otherlot1nullflg);
 * entity.setOtherlot2nullflg(otherlot2nullflg);
 * entity.setOtherlot3nullflg(otherlot3nullflg);
 * entity.setOtherlot4nullflg(otherlot4nullflg);
 * entity.setOtherlot5nullflg(otherlot5nullflg);
 * entity.setItemprintname(itemprintname);
 * entity.setPricelevel(pricelevel);
 * entity.setItemcatalogurl(itemcatalogurl);
 * entity.setUsernum1(usernum1);
 * entity.setUsernum2(usernum2);
 * entity.setUsernum3(usernum3);
 * entity.setUsernum4(usernum4);
 * entity.setUsernum5(usernum5);
 * entity.setUserdate1(userdate1);
 * entity.setUserdate2(userdate2);
 * entity.setUserdate3(userdate3);
 * entity.setUserdate4(userdate4);
 * entity.setUserdate5(userdate5);
 * entity.setCggdid(cggdid);
 * entity.setBrctg(brctg);
 * entity.setCtweight(ctweight);
 * entity.setBxoszl(bxoszl);
 * entity.setBxoszw(bxoszw);
 * entity.setBxoszh(bxoszh);
 * entity.setBxcpy(bxcpy);
 * entity.setBxweight(bxweight);
 * entity.setItemAdmin(itemAdmin);
 * entity.setSname(sname);
 * entity.setFractionpieceweight(fractionpieceweight);
 * entity.setTaxequivalentnumber(taxequivalentnumber);
 * entity.setSyhnkbnjt(syhnkbnjt);
 * entity.setIoidCls(ioidCls);
 * entity.setItfcdCls(itfcdCls);
 * entity.setManuitemcdCls(manuitemcdCls);
 * entity.setCtcpy(ctcpy);
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
public abstract class BsMProduct extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT} */
    protected Long _productId;

    /** CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {NotNull, varchar(255)} */
    protected String _productNm;

    /** PRODUCT_ABBR: {varchar(60)} */
    protected String _productAbbr;

    /** JAN_CD: {IX, varchar(30)} */
    protected String _janCd;

    /** LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} */
    protected String _lotManagFlg;

    /** LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} */
    protected String _limitDtManagFlg;

    /** RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]} */
    protected Long _receiveLimitNum;

    /** SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]} */
    protected Long _shippingLimitNum;

    /** MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} */
    protected String _mergeCls;

    /** LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} */
    protected String _lotReverseFlg;

    /** LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} */
    protected String _limitDtReverseFlg;

    /** SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} */
    protected String _shippingStopFlg;

    /** FIXED_POINT: {decimal(16, 6)} */
    protected java.math.BigDecimal _fixedPoint;

    /** SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP} */
    protected Long _shapeGrpId;

    /** NMFC_CODE: {varchar(30)} */
    protected String _nmfcCode;

    /** FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls} */
    protected String _freightCls;

    /** COUNNTRY_OF_ORIGIN: {varchar(30)} */
    protected String _counntryOfOrigin;

    /** UNIT_VAL: {decimal(16, 6)} */
    protected java.math.BigDecimal _unitVal;

    /** HTS_CD: {varchar(30)} */
    protected String _htsCd;

    /** ITEMGROUP: {varchar(60)} */
    protected String _itemgroup;

    /** ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} */
    protected java.math.BigDecimal _actflg;

    /** INVTYPE: {NotNull, varchar(30)} */
    protected String _invtype;

    /** SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _setitemflg;

    /** OWNERITEMCD: {varchar(30)} */
    protected String _owneritemcd;

    /** SUPPLIERITEMCD: {varchar(30)} */
    protected String _supplieritemcd;

    /** POSITEMCD: {varchar(30)} */
    protected String _positemcd;

    /** ITFCD: {varchar(30)} */
    protected String _itfcd;

    /** MANUITEMCD: {varchar(30)} */
    protected String _manuitemcd;

    /** PRICE_BUY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _priceBuy;

    /** PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]} */
    protected Long _priceWholesale;

    /** PRICE_SALE: {NotNull, bigint(19), default=[(0)]} */
    protected Long _priceSale;

    /** ALLOCPOLICYKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _allocpolicykey;

    /** SLOTPOLICYKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _slotpolicykey;

    /** INWORKINGKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _inworkingkey;

    /** OUTWORKINGKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _outworkingkey;

    /** ABCTYPE: {varchar(30)} */
    protected String _abctype;

    /** QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _qty1type;

    /** UNIT1: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _unit1;

    /** UNIT1STYLE: {varchar(60)} */
    protected String _unit1style;

    /** LENGTH1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _length1;

    /** WIDTH1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _width1;

    /** HEIGHT1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _height1;

    /** GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _grossweight1;

    /** NETWEIGHT1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _netweight1;

    /** CUBE1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _cube1;

    /** LITER1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _liter1;

    /** UNIT2: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _unit2;

    /** UNIT2STYLE: {varchar(60)} */
    protected String _unit2style;

    /** LENGTH2: {NotNull, bigint(19), default=[(0)]} */
    protected Long _length2;

    /** WIDTH2: {NotNull, bigint(19), default=[(0)]} */
    protected Long _width2;

    /** HEIGHT2: {NotNull, bigint(19), default=[(0)]} */
    protected Long _height2;

    /** GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]} */
    protected Long _grossweight2;

    /** NETWEIGHT2: {NotNull, bigint(19), default=[(0)]} */
    protected Long _netweight2;

    /** CUBE2: {NotNull, bigint(19), default=[(0)]} */
    protected Long _cube2;

    /** LITER2: {NotNull, bigint(19), default=[(0)]} */
    protected Long _liter2;

    /** UNIT3: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _unit3;

    /** UNIT3STYLE: {varchar(60)} */
    protected String _unit3style;

    /** LENGTH3: {NotNull, bigint(19), default=[(0)]} */
    protected Long _length3;

    /** WIDTH3: {NotNull, bigint(19), default=[(0)]} */
    protected Long _width3;

    /** HEIGHT3: {NotNull, bigint(19), default=[(0)]} */
    protected Long _height3;

    /** GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]} */
    protected Long _grossweight3;

    /** NETWEIGHT3: {NotNull, bigint(19), default=[(0)]} */
    protected Long _netweight3;

    /** CUBE3: {NotNull, bigint(19), default=[(0)]} */
    protected Long _cube3;

    /** LITER3: {NotNull, bigint(19), default=[(0)]} */
    protected Long _liter3;

    /** P_QTY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _pQty;

    /** P_HEIGHT: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _pHeight;

    /** P_ODD: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _pOdd;

    /** P_DESCRIPTION: {varchar(4000)} */
    protected String _pDescription;

    /** NOTES: {varchar(4000)} */
    protected String _notes;

    /** QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _qty2usedflg;

    /** QTY2STYLE: {varchar(60)} */
    protected String _qty2style;

    /** QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _qty3usedflg;

    /** QTY3STYLE: {varchar(60)} */
    protected String _qty3style;

    /** SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _spCalcflg;

    /** SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _spLotatrb1usedflg;

    /** SP_OPERATOR1: {varchar(30)} */
    protected String _spOperator1;

    /** SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _spLotatrb2usedflg;

    /** SP_OPERATOR2: {varchar(30)} */
    protected String _spOperator2;

    /** SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _spLotatrb3usedflg;

    /** SP_OPERATOR3: {varchar(30)} */
    protected String _spOperator3;

    /** SP_RATE: {NotNull, bigint(19), default=[(0)]} */
    protected Long _spRate;

    /** LOTATRB1TITLE: {varchar(60)} */
    protected String _lotatrb1title;

    /** LOTATRB2TITLE: {varchar(60)} */
    protected String _lotatrb2title;

    /** LOTATRB3TITLE: {varchar(60)} */
    protected String _lotatrb3title;

    /** LOTATRB4TITLE: {varchar(60)} */
    protected String _lotatrb4title;

    /** LOTATRB5TITLE: {varchar(60)} */
    protected String _lotatrb5title;

    /** LOTATRB6TITLE: {varchar(60)} */
    protected String _lotatrb6title;

    /** LOTATRB7TITLE: {varchar(60)} */
    protected String _lotatrb7title;

    /** LOTATRB8TITLE: {varchar(60)} */
    protected String _lotatrb8title;

    /** LOTATRB9TITLE: {varchar(60)} */
    protected String _lotatrb9title;

    /** LOTATRB10TITLE: {varchar(60)} */
    protected String _lotatrb10title;

    /** F_USER1: {varchar(30)} */
    protected String _fUser1;

    /** F_USER2: {varchar(30)} */
    protected String _fUser2;

    /** F_USER3: {varchar(30)} */
    protected String _fUser3;

    /** F_USER4: {varchar(30)} */
    protected String _fUser4;

    /** F_USER5: {varchar(30)} */
    protected String _fUser5;

    /** ITEM40: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _item40;

    /** PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]} */
    protected Long _priceInsurance;

    /** LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _limitday;

    /** DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _deliverableday;

    /** PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _printdateflg;

    /** SUPPLIERCD: {varchar(30)} */
    protected String _suppliercd;

    /** DISPATCHQTYTYPE: {varchar(30)} */
    protected String _dispatchqtytype;

    /** TARIFFQTYTYPE: {varchar(30)} */
    protected String _tariffqtytype;

    /** USERUSE1: {varchar(60)} */
    protected String _useruse1;

    /** USERUSE2: {varchar(60)} */
    protected String _useruse2;

    /** USERUSE3: {varchar(60)} */
    protected String _useruse3;

    /** USERUSE4: {varchar(60)} */
    protected String _useruse4;

    /** USERUSE5: {varchar(60)} */
    protected String _useruse5;

    /** LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _lot1nullflg;

    /** LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _lot2nullflg;

    /** LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _lot3nullflg;

    /** LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _lot4nullflg;

    /** LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _lot5nullflg;

    /** OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _otherlot1nullflg;

    /** OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _otherlot2nullflg;

    /** OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _otherlot3nullflg;

    /** OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _otherlot4nullflg;

    /** OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _otherlot5nullflg;

    /** ITEMPRINTNAME: {varchar(255)} */
    protected String _itemprintname;

    /** PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _pricelevel;

    /** ITEMCATALOGURL: {varchar(255)} */
    protected String _itemcatalogurl;

    /** USERNUM1: {bigint(19), default=[(0)]} */
    protected Long _usernum1;

    /** USERNUM2: {bigint(19), default=[(0)]} */
    protected Long _usernum2;

    /** USERNUM3: {bigint(19), default=[(0)]} */
    protected Long _usernum3;

    /** USERNUM4: {bigint(19), default=[(0)]} */
    protected Long _usernum4;

    /** USERNUM5: {bigint(19), default=[(0)]} */
    protected Long _usernum5;

    /** USERDATE1: {varchar(8)} */
    protected String _userdate1;

    /** USERDATE2: {varchar(8)} */
    protected String _userdate2;

    /** USERDATE3: {varchar(8)} */
    protected String _userdate3;

    /** USERDATE4: {varchar(8)} */
    protected String _userdate4;

    /** USERDATE5: {varchar(8)} */
    protected String _userdate5;

    /** CGGDID: {varchar(30)} */
    protected String _cggdid;

    /** BRCTG: {NotNull, bigint(19), default=[(0)]} */
    protected Long _brctg;

    /** CTWEIGHT: {bigint(19)} */
    protected Long _ctweight;

    /** BXOSZL: {bigint(19)} */
    protected Long _bxoszl;

    /** BXOSZW: {bigint(19)} */
    protected Long _bxoszw;

    /** BXOSZH: {bigint(19)} */
    protected Long _bxoszh;

    /** BXCPY: {bigint(19)} */
    protected Long _bxcpy;

    /** BXWEIGHT: {bigint(19)} */
    protected Long _bxweight;

    /** ITEM_ADMIN: {NotNull, varchar(255)} */
    protected String _itemAdmin;

    /** SNAME: {varchar(60)} */
    protected String _sname;

    /** FractionPieceWeight: {decimal(16, 6)} */
    protected java.math.BigDecimal _fractionpieceweight;

    /** TaxEquivalentNumber: {decimal(16, 6)} */
    protected java.math.BigDecimal _taxequivalentnumber;

    /** SYHNKBNJT: {varchar(30)} */
    protected String _syhnkbnjt;

    /** IOID_CLS: {varchar(30)} */
    protected String _ioidCls;

    /** ITFCD_CLS: {varchar(30)} */
    protected String _itfcdCls;

    /** MANUITEMCD_CLS: {varchar(30)} */
    protected String _manuitemcdCls;

    /** CTCPY: {bigint(19)} */
    protected Long _ctcpy;

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
        return "M_PRODUCT";
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
        if (_productId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param clientId : UQ+, NotNull, bigint(19), FK to M_CLIENT. (NotNull)
     * @param productCd : +UQ, IX, NotNull, varchar(100). (NotNull)
     */
    public void uniqueBy(Long clientId, String productCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("clientId");
        __uniqueDrivenProperties.addPropertyName("productCd");
        setClientId(clientId);setProductCd(productCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of lotManagFlg as the classification of LotManagFlg. <br>
     * LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LotManagFlg getLotManagFlgAsLotManagFlg() {
        return CDef.LotManagFlg.codeOf(getLotManagFlg());
    }

    /**
     * Set the value of lotManagFlg as the classification of LotManagFlg. <br>
     * LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLotManagFlgAsLotManagFlg(CDef.LotManagFlg cdef) {
        setLotManagFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of limitDtManagFlg as the classification of LimitDtManagFlg. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LimitDtManagFlg getLimitDtManagFlgAsLimitDtManagFlg() {
        return CDef.LimitDtManagFlg.codeOf(getLimitDtManagFlg());
    }

    /**
     * Set the value of limitDtManagFlg as the classification of LimitDtManagFlg. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg cdef) {
        setLimitDtManagFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of mergeCls as the classification of MergeCls. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MergeCls getMergeClsAsMergeCls() {
        return CDef.MergeCls.codeOf(getMergeCls());
    }

    /**
     * Set the value of mergeCls as the classification of MergeCls. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMergeClsAsMergeCls(CDef.MergeCls cdef) {
        setMergeCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of lotReverseFlg as the classification of LotReverseFlg. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LotReverseFlg getLotReverseFlgAsLotReverseFlg() {
        return CDef.LotReverseFlg.codeOf(getLotReverseFlg());
    }

    /**
     * Set the value of lotReverseFlg as the classification of LotReverseFlg. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLotReverseFlgAsLotReverseFlg(CDef.LotReverseFlg cdef) {
        setLotReverseFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of limitDtReverseFlg as the classification of LimitDtReverseFlg. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LimitDtReverseFlg getLimitDtReverseFlgAsLimitDtReverseFlg() {
        return CDef.LimitDtReverseFlg.codeOf(getLimitDtReverseFlg());
    }

    /**
     * Set the value of limitDtReverseFlg as the classification of LimitDtReverseFlg. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLimitDtReverseFlgAsLimitDtReverseFlg(CDef.LimitDtReverseFlg cdef) {
        setLimitDtReverseFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of shippingStopFlg as the classification of ShippingStopFlg. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ShippingStopFlg getShippingStopFlgAsShippingStopFlg() {
        return CDef.ShippingStopFlg.codeOf(getShippingStopFlg());
    }

    /**
     * Set the value of shippingStopFlg as the classification of ShippingStopFlg. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setShippingStopFlgAsShippingStopFlg(CDef.ShippingStopFlg cdef) {
        setShippingStopFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of freightCls as the classification of FreightCls. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.FreightCls getFreightClsAsFreightCls() {
        return CDef.FreightCls.codeOf(getFreightCls());
    }

    /**
     * Set the value of freightCls as the classification of FreightCls. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setFreightClsAsFreightCls(CDef.FreightCls cdef) {
        setFreightCls(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of lotManagFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setLotManagFlg_$0() {
        setLotManagFlgAsLotManagFlg(CDef.LotManagFlg.$0);
    }

    /**
     * Set the value of lotManagFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setLotManagFlg_$1() {
        setLotManagFlgAsLotManagFlg(CDef.LotManagFlg.$1);
    }

    /**
     * Set the value of limitDtManagFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setLimitDtManagFlg_$0() {
        setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg.$0);
    }

    /**
     * Set the value of limitDtManagFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setLimitDtManagFlg_$1() {
        setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg.$1);
    }

    /**
     * Set the value of mergeCls as $00 (00). <br>
     * $00: マージしない
     */
    public void setMergeCls_$00() {
        setMergeClsAsMergeCls(CDef.MergeCls.$00);
    }

    /**
     * Set the value of mergeCls as $01 (01). <br>
     * $01: ピックロケのみ自動マージ
     */
    public void setMergeCls_$01() {
        setMergeClsAsMergeCls(CDef.MergeCls.$01);
    }

    /**
     * Set the value of mergeCls as $02 (02). <br>
     * $02: 自動マージ
     */
    public void setMergeCls_$02() {
        setMergeClsAsMergeCls(CDef.MergeCls.$02);
    }

    /**
     * Set the value of lotReverseFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setLotReverseFlg_$0() {
        setLotReverseFlgAsLotReverseFlg(CDef.LotReverseFlg.$0);
    }

    /**
     * Set the value of lotReverseFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setLotReverseFlg_$1() {
        setLotReverseFlgAsLotReverseFlg(CDef.LotReverseFlg.$1);
    }

    /**
     * Set the value of limitDtReverseFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setLimitDtReverseFlg_$0() {
        setLimitDtReverseFlgAsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$0);
    }

    /**
     * Set the value of limitDtReverseFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setLimitDtReverseFlg_$1() {
        setLimitDtReverseFlgAsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$1);
    }

    /**
     * Set the value of shippingStopFlg as $0 (0). <br>
     * $0: 出荷可能
     */
    public void setShippingStopFlg_$0() {
        setShippingStopFlgAsShippingStopFlg(CDef.ShippingStopFlg.$0);
    }

    /**
     * Set the value of shippingStopFlg as $1 (1). <br>
     * $1: 出荷停止
     */
    public void setShippingStopFlg_$1() {
        setShippingStopFlgAsShippingStopFlg(CDef.ShippingStopFlg.$1);
    }

    /**
     * Set the value of freightCls as $01 (01). <br>
     * $01: 50
     */
    public void setFreightCls_$01() {
        setFreightClsAsFreightCls(CDef.FreightCls.$01);
    }

    /**
     * Set the value of freightCls as $02 (02). <br>
     * $02: 55
     */
    public void setFreightCls_$02() {
        setFreightClsAsFreightCls(CDef.FreightCls.$02);
    }

    /**
     * Set the value of freightCls as $03 (03). <br>
     * $03: 60
     */
    public void setFreightCls_$03() {
        setFreightClsAsFreightCls(CDef.FreightCls.$03);
    }

    /**
     * Set the value of freightCls as $04 (04). <br>
     * $04: 65
     */
    public void setFreightCls_$04() {
        setFreightClsAsFreightCls(CDef.FreightCls.$04);
    }

    /**
     * Set the value of freightCls as $05 (05). <br>
     * $05: 70
     */
    public void setFreightCls_$05() {
        setFreightClsAsFreightCls(CDef.FreightCls.$05);
    }

    /**
     * Set the value of freightCls as $06 (06). <br>
     * $06: 77.5
     */
    public void setFreightCls_$06() {
        setFreightClsAsFreightCls(CDef.FreightCls.$06);
    }

    /**
     * Set the value of freightCls as $07 (07). <br>
     * $07: 85
     */
    public void setFreightCls_$07() {
        setFreightClsAsFreightCls(CDef.FreightCls.$07);
    }

    /**
     * Set the value of freightCls as $08 (08). <br>
     * $08: 92.5
     */
    public void setFreightCls_$08() {
        setFreightClsAsFreightCls(CDef.FreightCls.$08);
    }

    /**
     * Set the value of freightCls as $09 (09). <br>
     * $09: 100
     */
    public void setFreightCls_$09() {
        setFreightClsAsFreightCls(CDef.FreightCls.$09);
    }

    /**
     * Set the value of freightCls as $10 (10). <br>
     * $10: 110
     */
    public void setFreightCls_$10() {
        setFreightClsAsFreightCls(CDef.FreightCls.$10);
    }

    /**
     * Set the value of freightCls as $11 (11). <br>
     * $11: 125
     */
    public void setFreightCls_$11() {
        setFreightClsAsFreightCls(CDef.FreightCls.$11);
    }

    /**
     * Set the value of freightCls as $12 (12). <br>
     * $12: 150
     */
    public void setFreightCls_$12() {
        setFreightClsAsFreightCls(CDef.FreightCls.$12);
    }

    /**
     * Set the value of freightCls as $13 (13). <br>
     * $13: 175
     */
    public void setFreightCls_$13() {
        setFreightClsAsFreightCls(CDef.FreightCls.$13);
    }

    /**
     * Set the value of freightCls as $14 (14). <br>
     * $14: 200
     */
    public void setFreightCls_$14() {
        setFreightClsAsFreightCls(CDef.FreightCls.$14);
    }

    /**
     * Set the value of freightCls as $15 (15). <br>
     * $15: 250
     */
    public void setFreightCls_$15() {
        setFreightClsAsFreightCls(CDef.FreightCls.$15);
    }

    /**
     * Set the value of freightCls as $16 (16). <br>
     * $16: 300
     */
    public void setFreightCls_$16() {
        setFreightClsAsFreightCls(CDef.FreightCls.$16);
    }

    /**
     * Set the value of freightCls as $17 (17). <br>
     * $17: 400
     */
    public void setFreightCls_$17() {
        setFreightClsAsFreightCls(CDef.FreightCls.$17);
    }

    /**
     * Set the value of freightCls as $18 (18). <br>
     * $18: 500
     */
    public void setFreightCls_$18() {
        setFreightClsAsFreightCls(CDef.FreightCls.$18);
    }

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
     * Is the value of lotManagFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLotManagFlg$0() {
        CDef.LotManagFlg cdef = getLotManagFlgAsLotManagFlg();
        return cdef != null ? cdef.equals(CDef.LotManagFlg.$0) : false;
    }

    /**
     * Is the value of lotManagFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLotManagFlg$1() {
        CDef.LotManagFlg cdef = getLotManagFlgAsLotManagFlg();
        return cdef != null ? cdef.equals(CDef.LotManagFlg.$1) : false;
    }

    /**
     * Is the value of limitDtManagFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitDtManagFlg$0() {
        CDef.LimitDtManagFlg cdef = getLimitDtManagFlgAsLimitDtManagFlg();
        return cdef != null ? cdef.equals(CDef.LimitDtManagFlg.$0) : false;
    }

    /**
     * Is the value of limitDtManagFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitDtManagFlg$1() {
        CDef.LimitDtManagFlg cdef = getLimitDtManagFlgAsLimitDtManagFlg();
        return cdef != null ? cdef.equals(CDef.LimitDtManagFlg.$1) : false;
    }

    /**
     * Is the value of mergeCls $00? <br>
     * $00: マージしない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMergeCls$00() {
        CDef.MergeCls cdef = getMergeClsAsMergeCls();
        return cdef != null ? cdef.equals(CDef.MergeCls.$00) : false;
    }

    /**
     * Is the value of mergeCls $01? <br>
     * $01: ピックロケのみ自動マージ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMergeCls$01() {
        CDef.MergeCls cdef = getMergeClsAsMergeCls();
        return cdef != null ? cdef.equals(CDef.MergeCls.$01) : false;
    }

    /**
     * Is the value of mergeCls $02? <br>
     * $02: 自動マージ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMergeCls$02() {
        CDef.MergeCls cdef = getMergeClsAsMergeCls();
        return cdef != null ? cdef.equals(CDef.MergeCls.$02) : false;
    }

    /**
     * Is the value of lotReverseFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLotReverseFlg$0() {
        CDef.LotReverseFlg cdef = getLotReverseFlgAsLotReverseFlg();
        return cdef != null ? cdef.equals(CDef.LotReverseFlg.$0) : false;
    }

    /**
     * Is the value of lotReverseFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLotReverseFlg$1() {
        CDef.LotReverseFlg cdef = getLotReverseFlgAsLotReverseFlg();
        return cdef != null ? cdef.equals(CDef.LotReverseFlg.$1) : false;
    }

    /**
     * Is the value of limitDtReverseFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitDtReverseFlg$0() {
        CDef.LimitDtReverseFlg cdef = getLimitDtReverseFlgAsLimitDtReverseFlg();
        return cdef != null ? cdef.equals(CDef.LimitDtReverseFlg.$0) : false;
    }

    /**
     * Is the value of limitDtReverseFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitDtReverseFlg$1() {
        CDef.LimitDtReverseFlg cdef = getLimitDtReverseFlgAsLimitDtReverseFlg();
        return cdef != null ? cdef.equals(CDef.LimitDtReverseFlg.$1) : false;
    }

    /**
     * Is the value of shippingStopFlg $0? <br>
     * $0: 出荷可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStopFlg$0() {
        CDef.ShippingStopFlg cdef = getShippingStopFlgAsShippingStopFlg();
        return cdef != null ? cdef.equals(CDef.ShippingStopFlg.$0) : false;
    }

    /**
     * Is the value of shippingStopFlg $1? <br>
     * $1: 出荷停止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStopFlg$1() {
        CDef.ShippingStopFlg cdef = getShippingStopFlgAsShippingStopFlg();
        return cdef != null ? cdef.equals(CDef.ShippingStopFlg.$1) : false;
    }

    /**
     * Is the value of freightCls $01? <br>
     * $01: 50
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$01() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$01) : false;
    }

    /**
     * Is the value of freightCls $02? <br>
     * $02: 55
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$02() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$02) : false;
    }

    /**
     * Is the value of freightCls $03? <br>
     * $03: 60
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$03() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$03) : false;
    }

    /**
     * Is the value of freightCls $04? <br>
     * $04: 65
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$04() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$04) : false;
    }

    /**
     * Is the value of freightCls $05? <br>
     * $05: 70
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$05() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$05) : false;
    }

    /**
     * Is the value of freightCls $06? <br>
     * $06: 77.5
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$06() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$06) : false;
    }

    /**
     * Is the value of freightCls $07? <br>
     * $07: 85
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$07() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$07) : false;
    }

    /**
     * Is the value of freightCls $08? <br>
     * $08: 92.5
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$08() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$08) : false;
    }

    /**
     * Is the value of freightCls $09? <br>
     * $09: 100
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$09() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$09) : false;
    }

    /**
     * Is the value of freightCls $10? <br>
     * $10: 110
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$10() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$10) : false;
    }

    /**
     * Is the value of freightCls $11? <br>
     * $11: 125
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$11() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$11) : false;
    }

    /**
     * Is the value of freightCls $12? <br>
     * $12: 150
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$12() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$12) : false;
    }

    /**
     * Is the value of freightCls $13? <br>
     * $13: 175
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$13() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$13) : false;
    }

    /**
     * Is the value of freightCls $14? <br>
     * $14: 200
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$14() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$14) : false;
    }

    /**
     * Is the value of freightCls $15? <br>
     * $15: 250
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$15() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$15) : false;
    }

    /**
     * Is the value of freightCls $16? <br>
     * $16: 300
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$16() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$16) : false;
    }

    /**
     * Is the value of freightCls $17? <br>
     * $17: 400
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$17() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$17) : false;
    }

    /**
     * Is the value of freightCls $18? <br>
     * $18: 500
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$18() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$18) : false;
    }

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
     * Get the value of the column 'lotManagFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLotManagFlgName() {
        CDef.LotManagFlg cdef = getLotManagFlgAsLotManagFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'limitDtManagFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLimitDtManagFlgName() {
        CDef.LimitDtManagFlg cdef = getLimitDtManagFlgAsLimitDtManagFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'mergeCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMergeClsName() {
        CDef.MergeCls cdef = getMergeClsAsMergeCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'lotReverseFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLotReverseFlgName() {
        CDef.LotReverseFlg cdef = getLotReverseFlgAsLotReverseFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'limitDtReverseFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLimitDtReverseFlgName() {
        CDef.LimitDtReverseFlg cdef = getLimitDtReverseFlgAsLimitDtReverseFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'shippingStopFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getShippingStopFlgName() {
        CDef.ShippingStopFlg cdef = getShippingStopFlgAsShippingStopFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'freightCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getFreightClsName() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.name() : null;
    }

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
    /** M_CLIENT by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] M_CLIENT by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
    }

    /** M_PRODUCT by my PRODUCT_ID, named 'MProductSelf'. */
    protected MProduct _mProductSelf;

    /**
     * [get] M_PRODUCT by my PRODUCT_ID, named 'MProductSelf'. <br>
     * @return The entity of foreign property 'MProductSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProduct getMProductSelf() {
        return _mProductSelf;
    }

    /**
     * [set] M_PRODUCT by my PRODUCT_ID, named 'MProductSelf'.
     * @param mProductSelf The entity of foreign property 'MProductSelf'. (NullAllowed)
     */
    public void setMProductSelf(MProduct mProductSelf) {
        _mProductSelf = mProductSelf;
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

    /** B_CLASS_DTL by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'. */
    protected BClassDtl _bClassDtlByLimitDtManagFlg;

    /**
     * [get] B_CLASS_DTL by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLimitDtManagFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLimitDtManagFlg() {
        return _bClassDtlByLimitDtManagFlg;
    }

    /**
     * [set] B_CLASS_DTL by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'.
     * @param bClassDtlByLimitDtManagFlg The entity of foreign property 'BClassDtlByLimitDtManagFlg'. (NullAllowed)
     */
    public void setBClassDtlByLimitDtManagFlg(BClassDtl bClassDtlByLimitDtManagFlg) {
        _bClassDtlByLimitDtManagFlg = bClassDtlByLimitDtManagFlg;
    }

    /** B_CLASS_DTL by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'. */
    protected BClassDtl _bClassDtlByLimitDtReverseFlg;

    /**
     * [get] B_CLASS_DTL by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLimitDtReverseFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLimitDtReverseFlg() {
        return _bClassDtlByLimitDtReverseFlg;
    }

    /**
     * [set] B_CLASS_DTL by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * @param bClassDtlByLimitDtReverseFlg The entity of foreign property 'BClassDtlByLimitDtReverseFlg'. (NullAllowed)
     */
    public void setBClassDtlByLimitDtReverseFlg(BClassDtl bClassDtlByLimitDtReverseFlg) {
        _bClassDtlByLimitDtReverseFlg = bClassDtlByLimitDtReverseFlg;
    }

    /** B_CLASS_DTL by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'. */
    protected BClassDtl _bClassDtlByLotManagFlg;

    /**
     * [get] B_CLASS_DTL by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLotManagFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLotManagFlg() {
        return _bClassDtlByLotManagFlg;
    }

    /**
     * [set] B_CLASS_DTL by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'.
     * @param bClassDtlByLotManagFlg The entity of foreign property 'BClassDtlByLotManagFlg'. (NullAllowed)
     */
    public void setBClassDtlByLotManagFlg(BClassDtl bClassDtlByLotManagFlg) {
        _bClassDtlByLotManagFlg = bClassDtlByLotManagFlg;
    }

    /** B_CLASS_DTL by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'. */
    protected BClassDtl _bClassDtlByLotReverseFlg;

    /**
     * [get] B_CLASS_DTL by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLotReverseFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLotReverseFlg() {
        return _bClassDtlByLotReverseFlg;
    }

    /**
     * [set] B_CLASS_DTL by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
     * @param bClassDtlByLotReverseFlg The entity of foreign property 'BClassDtlByLotReverseFlg'. (NullAllowed)
     */
    public void setBClassDtlByLotReverseFlg(BClassDtl bClassDtlByLotReverseFlg) {
        _bClassDtlByLotReverseFlg = bClassDtlByLotReverseFlg;
    }

    /** B_CLASS_DTL by my MERGE_CLS, named 'BClassDtlByMergeCls'. */
    protected BClassDtl _bClassDtlByMergeCls;

    /**
     * [get] B_CLASS_DTL by my MERGE_CLS, named 'BClassDtlByMergeCls'. <br>
     * @return The entity of foreign property 'BClassDtlByMergeCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByMergeCls() {
        return _bClassDtlByMergeCls;
    }

    /**
     * [set] B_CLASS_DTL by my MERGE_CLS, named 'BClassDtlByMergeCls'.
     * @param bClassDtlByMergeCls The entity of foreign property 'BClassDtlByMergeCls'. (NullAllowed)
     */
    public void setBClassDtlByMergeCls(BClassDtl bClassDtlByMergeCls) {
        _bClassDtlByMergeCls = bClassDtlByMergeCls;
    }

    /** B_CLASS_DTL by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'. */
    protected BClassDtl _bClassDtlByShippingStopFlg;

    /**
     * [get] B_CLASS_DTL by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByShippingStopFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByShippingStopFlg() {
        return _bClassDtlByShippingStopFlg;
    }

    /**
     * [set] B_CLASS_DTL by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
     * @param bClassDtlByShippingStopFlg The entity of foreign property 'BClassDtlByShippingStopFlg'. (NullAllowed)
     */
    public void setBClassDtlByShippingStopFlg(BClassDtl bClassDtlByShippingStopFlg) {
        _bClassDtlByShippingStopFlg = bClassDtlByShippingStopFlg;
    }

    /** B_CLASS_DTL by my FREIGHT_CLS, named 'BClassDtlByFreightCls'. */
    protected BClassDtl _bClassDtlByFreightCls;

    /**
     * [get] B_CLASS_DTL by my FREIGHT_CLS, named 'BClassDtlByFreightCls'. <br>
     * @return The entity of foreign property 'BClassDtlByFreightCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByFreightCls() {
        return _bClassDtlByFreightCls;
    }

    /**
     * [set] B_CLASS_DTL by my FREIGHT_CLS, named 'BClassDtlByFreightCls'.
     * @param bClassDtlByFreightCls The entity of foreign property 'BClassDtlByFreightCls'. (NullAllowed)
     */
    public void setBClassDtlByFreightCls(BClassDtl bClassDtlByFreightCls) {
        _bClassDtlByFreightCls = bClassDtlByFreightCls;
    }

    /** M_PRODUCT by PRODUCT_ID, named 'MProductSelfAsOne'. */
    protected MProduct _mProductSelfAsOne;

    /**
     * [get] M_PRODUCT by PRODUCT_ID, named 'MProductSelfAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'MProductSelfAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MProduct getMProductSelfAsOne() {
        return _mProductSelfAsOne;
    }

    /**
     * [set] M_PRODUCT by PRODUCT_ID, named 'MProductSelfAsOne'.
     * @param MProductSelfAsOne The entity of foreign property(referrer-as-one) 'MProductSelfAsOne'. (NullAllowed)
     */
    public void setMProductSelfAsOne(MProduct MProductSelfAsOne) {
        _mProductSelfAsOne = MProductSelfAsOne;
    }

    /** M_PRODUCT_TERM by PRODUCT_ID, named 'MProductTermAsOne'. */
    protected MProductTerm _mProductTermAsOne;

    /**
     * [get] M_PRODUCT_TERM by PRODUCT_ID, named 'MProductTermAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'MProductTermAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MProductTerm getMProductTermAsOne() {
        return _mProductTermAsOne;
    }

    /**
     * [set] M_PRODUCT_TERM by PRODUCT_ID, named 'MProductTermAsOne'.
     * @param MProductTermAsOne The entity of foreign property(referrer-as-one) 'MProductTermAsOne'. (NullAllowed)
     */
    public void setMProductTermAsOne(MProductTerm MProductTermAsOne) {
        _mProductTermAsOne = MProductTermAsOne;
    }

    /** M_SET_PARENT by PRODUCT_ID, named 'MSetParentAsOne'. */
    protected MSetParent _mSetParentAsOne;

    /**
     * [get] M_SET_PARENT by PRODUCT_ID, named 'MSetParentAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'MSetParentAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MSetParent getMSetParentAsOne() {
        return _mSetParentAsOne;
    }

    /**
     * [set] M_SET_PARENT by PRODUCT_ID, named 'MSetParentAsOne'.
     * @param MSetParentAsOne The entity of foreign property(referrer-as-one) 'MSetParentAsOne'. (NullAllowed)
     */
    public void setMSetParentAsOne(MSetParent MSetParentAsOne) {
        _mSetParentAsOne = MSetParentAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_LOCATION by REPLENISH_PRODUCT_ID, named 'MLocationList'. */
    protected List<MLocation> _mLocationList;

    /**
     * [get] M_LOCATION by REPLENISH_PRODUCT_ID, named 'MLocationList'.
     * @return The entity list of referrer property 'MLocationList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MLocation> getMLocationList() {
        if (_mLocationList == null) { _mLocationList = newReferrerList(); }
        return _mLocationList;
    }

    /**
     * [set] M_LOCATION by REPLENISH_PRODUCT_ID, named 'MLocationList'.
     * @param mLocationList The entity list of referrer property 'MLocationList'. (NullAllowed)
     */
    public void setMLocationList(List<MLocation> mLocationList) {
        _mLocationList = mLocationList;
    }

    /** M_MFWHxITEM by PRODUCT_ID, named 'MMfwhxitemList'. */
    protected List<MMfwhxitem> _mMfwhxitemList;

    /**
     * [get] M_MFWHxITEM by PRODUCT_ID, named 'MMfwhxitemList'.
     * @return The entity list of referrer property 'MMfwhxitemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MMfwhxitem> getMMfwhxitemList() {
        if (_mMfwhxitemList == null) { _mMfwhxitemList = newReferrerList(); }
        return _mMfwhxitemList;
    }

    /**
     * [set] M_MFWHxITEM by PRODUCT_ID, named 'MMfwhxitemList'.
     * @param mMfwhxitemList The entity list of referrer property 'MMfwhxitemList'. (NullAllowed)
     */
    public void setMMfwhxitemList(List<MMfwhxitem> mMfwhxitemList) {
        _mMfwhxitemList = mMfwhxitemList;
    }

    /** M_PRODUCT_SHAPE by PRODUCT_ID, named 'MProductShapeList'. */
    protected List<MProductShape> _mProductShapeList;

    /**
     * [get] M_PRODUCT_SHAPE by PRODUCT_ID, named 'MProductShapeList'.
     * @return The entity list of referrer property 'MProductShapeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MProductShape> getMProductShapeList() {
        if (_mProductShapeList == null) { _mProductShapeList = newReferrerList(); }
        return _mProductShapeList;
    }

    /**
     * [set] M_PRODUCT_SHAPE by PRODUCT_ID, named 'MProductShapeList'.
     * @param mProductShapeList The entity list of referrer property 'MProductShapeList'. (NullAllowed)
     */
    public void setMProductShapeList(List<MProductShape> mProductShapeList) {
        _mProductShapeList = mProductShapeList;
    }

    /** M_SET_STRUCTURE by PRODUCT_ID, named 'MSetStructureList'. */
    protected List<MSetStructure> _mSetStructureList;

    /**
     * [get] M_SET_STRUCTURE by PRODUCT_ID, named 'MSetStructureList'.
     * @return The entity list of referrer property 'MSetStructureList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MSetStructure> getMSetStructureList() {
        if (_mSetStructureList == null) { _mSetStructureList = newReferrerList(); }
        return _mSetStructureList;
    }

    /**
     * [set] M_SET_STRUCTURE by PRODUCT_ID, named 'MSetStructureList'.
     * @param mSetStructureList The entity list of referrer property 'MSetStructureList'. (NullAllowed)
     */
    public void setMSetStructureList(List<MSetStructure> mSetStructureList) {
        _mSetStructureList = mSetStructureList;
    }

    /** T_ALLOC_INST_B by PRODUCT_ID, named 'TAllocInstBList'. */
    protected List<TAllocInstB> _tAllocInstBList;

    /**
     * [get] T_ALLOC_INST_B by PRODUCT_ID, named 'TAllocInstBList'.
     * @return The entity list of referrer property 'TAllocInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstB> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = newReferrerList(); }
        return _tAllocInstBList;
    }

    /**
     * [set] T_ALLOC_INST_B by PRODUCT_ID, named 'TAllocInstBList'.
     * @param tAllocInstBList The entity list of referrer property 'TAllocInstBList'. (NullAllowed)
     */
    public void setTAllocInstBList(List<TAllocInstB> tAllocInstBList) {
        _tAllocInstBList = tAllocInstBList;
    }

    /** T_ALLOC_LOT by PRODUCT_ID, named 'TAllocLotList'. */
    protected List<TAllocLot> _tAllocLotList;

    /**
     * [get] T_ALLOC_LOT by PRODUCT_ID, named 'TAllocLotList'.
     * @return The entity list of referrer property 'TAllocLotList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocLot> getTAllocLotList() {
        if (_tAllocLotList == null) { _tAllocLotList = newReferrerList(); }
        return _tAllocLotList;
    }

    /**
     * [set] T_ALLOC_LOT by PRODUCT_ID, named 'TAllocLotList'.
     * @param tAllocLotList The entity list of referrer property 'TAllocLotList'. (NullAllowed)
     */
    public void setTAllocLotList(List<TAllocLot> tAllocLotList) {
        _tAllocLotList = tAllocLotList;
    }

    /** T_INVENTORY_B by PRODUCT_ID, named 'TInventoryBList'. */
    protected List<TInventoryB> _tInventoryBList;

    /**
     * [get] T_INVENTORY_B by PRODUCT_ID, named 'TInventoryBList'.
     * @return The entity list of referrer property 'TInventoryBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryB> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = newReferrerList(); }
        return _tInventoryBList;
    }

    /**
     * [set] T_INVENTORY_B by PRODUCT_ID, named 'TInventoryBList'.
     * @param tInventoryBList The entity list of referrer property 'TInventoryBList'. (NullAllowed)
     */
    public void setTInventoryBList(List<TInventoryB> tInventoryBList) {
        _tInventoryBList = tInventoryBList;
    }

    /** T_KEEPING_LOT by PRODUCT_ID, named 'TKeepingLotList'. */
    protected List<TKeepingLot> _tKeepingLotList;

    /**
     * [get] T_KEEPING_LOT by PRODUCT_ID, named 'TKeepingLotList'.
     * @return The entity list of referrer property 'TKeepingLotList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TKeepingLot> getTKeepingLotList() {
        if (_tKeepingLotList == null) { _tKeepingLotList = newReferrerList(); }
        return _tKeepingLotList;
    }

    /**
     * [set] T_KEEPING_LOT by PRODUCT_ID, named 'TKeepingLotList'.
     * @param tKeepingLotList The entity list of referrer property 'TKeepingLotList'. (NullAllowed)
     */
    public void setTKeepingLotList(List<TKeepingLot> tKeepingLotList) {
        _tKeepingLotList = tKeepingLotList;
    }

    /** T_LAST_LOT by PRODUCT_ID, named 'TLastLotList'. */
    protected List<TLastLot> _tLastLotList;

    /**
     * [get] T_LAST_LOT by PRODUCT_ID, named 'TLastLotList'.
     * @return The entity list of referrer property 'TLastLotList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TLastLot> getTLastLotList() {
        if (_tLastLotList == null) { _tLastLotList = newReferrerList(); }
        return _tLastLotList;
    }

    /**
     * [set] T_LAST_LOT by PRODUCT_ID, named 'TLastLotList'.
     * @param tLastLotList The entity list of referrer property 'TLastLotList'. (NullAllowed)
     */
    public void setTLastLotList(List<TLastLot> tLastLotList) {
        _tLastLotList = tLastLotList;
    }

    /** T_LOT by PRODUCT_ID, named 'TLotList'. */
    protected List<TLot> _tLotList;

    /**
     * [get] T_LOT by PRODUCT_ID, named 'TLotList'.
     * @return The entity list of referrer property 'TLotList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TLot> getTLotList() {
        if (_tLotList == null) { _tLotList = newReferrerList(); }
        return _tLotList;
    }

    /**
     * [set] T_LOT by PRODUCT_ID, named 'TLotList'.
     * @param tLotList The entity list of referrer property 'TLotList'. (NullAllowed)
     */
    public void setTLotList(List<TLot> tLotList) {
        _tLotList = tLotList;
    }

    /** T_MOVE_INST_B by PRODUCT_ID, named 'TMoveInstBList'. */
    protected List<TMoveInstB> _tMoveInstBList;

    /**
     * [get] T_MOVE_INST_B by PRODUCT_ID, named 'TMoveInstBList'.
     * @return The entity list of referrer property 'TMoveInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstB> getTMoveInstBList() {
        if (_tMoveInstBList == null) { _tMoveInstBList = newReferrerList(); }
        return _tMoveInstBList;
    }

    /**
     * [set] T_MOVE_INST_B by PRODUCT_ID, named 'TMoveInstBList'.
     * @param tMoveInstBList The entity list of referrer property 'TMoveInstBList'. (NullAllowed)
     */
    public void setTMoveInstBList(List<TMoveInstB> tMoveInstBList) {
        _tMoveInstBList = tMoveInstBList;
    }

    /** T_RECEIVE_PLAN_B by PRODUCT_ID, named 'TReceivePlanBList'. */
    protected List<TReceivePlanB> _tReceivePlanBList;

    /**
     * [get] T_RECEIVE_PLAN_B by PRODUCT_ID, named 'TReceivePlanBList'.
     * @return The entity list of referrer property 'TReceivePlanBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanB> getTReceivePlanBList() {
        if (_tReceivePlanBList == null) { _tReceivePlanBList = newReferrerList(); }
        return _tReceivePlanBList;
    }

    /**
     * [set] T_RECEIVE_PLAN_B by PRODUCT_ID, named 'TReceivePlanBList'.
     * @param tReceivePlanBList The entity list of referrer property 'TReceivePlanBList'. (NullAllowed)
     */
    public void setTReceivePlanBList(List<TReceivePlanB> tReceivePlanBList) {
        _tReceivePlanBList = tReceivePlanBList;
    }

    /** T_SERIAL_NO by PRODUCT_ID, named 'TSerialNoList'. */
    protected List<TSerialNo> _tSerialNoList;

    /**
     * [get] T_SERIAL_NO by PRODUCT_ID, named 'TSerialNoList'.
     * @return The entity list of referrer property 'TSerialNoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TSerialNo> getTSerialNoList() {
        if (_tSerialNoList == null) { _tSerialNoList = newReferrerList(); }
        return _tSerialNoList;
    }

    /**
     * [set] T_SERIAL_NO by PRODUCT_ID, named 'TSerialNoList'.
     * @param tSerialNoList The entity list of referrer property 'TSerialNoList'. (NullAllowed)
     */
    public void setTSerialNoList(List<TSerialNo> tSerialNoList) {
        _tSerialNoList = tSerialNoList;
    }

    /** T_SHIPPING_INST_B by PRODUCT_ID, named 'TShippingInstBList'. */
    protected List<TShippingInstB> _tShippingInstBList;

    /**
     * [get] T_SHIPPING_INST_B by PRODUCT_ID, named 'TShippingInstBList'.
     * @return The entity list of referrer property 'TShippingInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstB> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = newReferrerList(); }
        return _tShippingInstBList;
    }

    /**
     * [set] T_SHIPPING_INST_B by PRODUCT_ID, named 'TShippingInstBList'.
     * @param tShippingInstBList The entity list of referrer property 'TShippingInstBList'. (NullAllowed)
     */
    public void setTShippingInstBList(List<TShippingInstB> tShippingInstBList) {
        _tShippingInstBList = tShippingInstBList;
    }

    /** T_STOCK by PRODUCT_ID, named 'TStockList'. */
    protected List<TStock> _tStockList;

    /**
     * [get] T_STOCK by PRODUCT_ID, named 'TStockList'.
     * @return The entity list of referrer property 'TStockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStock> getTStockList() {
        if (_tStockList == null) { _tStockList = newReferrerList(); }
        return _tStockList;
    }

    /**
     * [set] T_STOCK by PRODUCT_ID, named 'TStockList'.
     * @param tStockList The entity list of referrer property 'TStockList'. (NullAllowed)
     */
    public void setTStockList(List<TStock> tStockList) {
        _tStockList = tStockList;
    }

    /** T_TRINVCHECKINFO by PRODUCT_ID, named 'TTrinvcheckinfoList'. */
    protected List<TTrinvcheckinfo> _tTrinvcheckinfoList;

    /**
     * [get] T_TRINVCHECKINFO by PRODUCT_ID, named 'TTrinvcheckinfoList'.
     * @return The entity list of referrer property 'TTrinvcheckinfoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrinvcheckinfo> getTTrinvcheckinfoList() {
        if (_tTrinvcheckinfoList == null) { _tTrinvcheckinfoList = newReferrerList(); }
        return _tTrinvcheckinfoList;
    }

    /**
     * [set] T_TRINVCHECKINFO by PRODUCT_ID, named 'TTrinvcheckinfoList'.
     * @param tTrinvcheckinfoList The entity list of referrer property 'TTrinvcheckinfoList'. (NullAllowed)
     */
    public void setTTrinvcheckinfoList(List<TTrinvcheckinfo> tTrinvcheckinfoList) {
        _tTrinvcheckinfoList = tTrinvcheckinfoList;
    }

    /** T_YTRSODETAIL by PRODUCT_ID, named 'TYtrsodetailList'. */
    protected List<TYtrsodetail> _tYtrsodetailList;

    /**
     * [get] T_YTRSODETAIL by PRODUCT_ID, named 'TYtrsodetailList'.
     * @return The entity list of referrer property 'TYtrsodetailList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TYtrsodetail> getTYtrsodetailList() {
        if (_tYtrsodetailList == null) { _tYtrsodetailList = newReferrerList(); }
        return _tYtrsodetailList;
    }

    /**
     * [set] T_YTRSODETAIL by PRODUCT_ID, named 'TYtrsodetailList'.
     * @param tYtrsodetailList The entity list of referrer property 'TYtrsodetailList'. (NullAllowed)
     */
    public void setTYtrsodetailList(List<TYtrsodetail> tYtrsodetailList) {
        _tYtrsodetailList = tYtrsodetailList;
    }

    /** W_HT_INVENTORY_INPUT_PROD by PRODUCT_ID, named 'WHtInventoryInputProdList'. */
    protected List<WHtInventoryInputProd> _wHtInventoryInputProdList;

    /**
     * [get] W_HT_INVENTORY_INPUT_PROD by PRODUCT_ID, named 'WHtInventoryInputProdList'.
     * @return The entity list of referrer property 'WHtInventoryInputProdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtInventoryInputProd> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = newReferrerList(); }
        return _wHtInventoryInputProdList;
    }

    /**
     * [set] W_HT_INVENTORY_INPUT_PROD by PRODUCT_ID, named 'WHtInventoryInputProdList'.
     * @param wHtInventoryInputProdList The entity list of referrer property 'WHtInventoryInputProdList'. (NullAllowed)
     */
    public void setWHtInventoryInputProdList(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        _wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    /** W_HT_RECEIVE_INSPECTION by PRODUCT_ID, named 'WHtReceiveInspectionList'. */
    protected List<WHtReceiveInspection> _wHtReceiveInspectionList;

    /**
     * [get] W_HT_RECEIVE_INSPECTION by PRODUCT_ID, named 'WHtReceiveInspectionList'.
     * @return The entity list of referrer property 'WHtReceiveInspectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveInspection> getWHtReceiveInspectionList() {
        if (_wHtReceiveInspectionList == null) { _wHtReceiveInspectionList = newReferrerList(); }
        return _wHtReceiveInspectionList;
    }

    /**
     * [set] W_HT_RECEIVE_INSPECTION by PRODUCT_ID, named 'WHtReceiveInspectionList'.
     * @param wHtReceiveInspectionList The entity list of referrer property 'WHtReceiveInspectionList'. (NullAllowed)
     */
    public void setWHtReceiveInspectionList(List<WHtReceiveInspection> wHtReceiveInspectionList) {
        _wHtReceiveInspectionList = wHtReceiveInspectionList;
    }

    /** W_HT_RECEIVE_NO_PLAN_INSP by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'. */
    protected List<WHtReceiveNoPlanInsp> _wHtReceiveNoPlanInspList;

    /**
     * [get] W_HT_RECEIVE_NO_PLAN_INSP by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveNoPlanInsp> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = newReferrerList(); }
        return _wHtReceiveNoPlanInspList;
    }

    /**
     * [set] W_HT_RECEIVE_NO_PLAN_INSP by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'.
     * @param wHtReceiveNoPlanInspList The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NullAllowed)
     */
    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        _wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    /** W_HT_RECEIVE_STORE by PRODUCT_ID, named 'WHtReceiveStoreList'. */
    protected List<WHtReceiveStore> _wHtReceiveStoreList;

    /**
     * [get] W_HT_RECEIVE_STORE by PRODUCT_ID, named 'WHtReceiveStoreList'.
     * @return The entity list of referrer property 'WHtReceiveStoreList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveStore> getWHtReceiveStoreList() {
        if (_wHtReceiveStoreList == null) { _wHtReceiveStoreList = newReferrerList(); }
        return _wHtReceiveStoreList;
    }

    /**
     * [set] W_HT_RECEIVE_STORE by PRODUCT_ID, named 'WHtReceiveStoreList'.
     * @param wHtReceiveStoreList The entity list of referrer property 'WHtReceiveStoreList'. (NullAllowed)
     */
    public void setWHtReceiveStoreList(List<WHtReceiveStore> wHtReceiveStoreList) {
        _wHtReceiveStoreList = wHtReceiveStoreList;
    }

    /** W_HT_SHIPPING by PRODUCT_ID, named 'WHtShippingList'. */
    protected List<WHtShipping> _wHtShippingList;

    /**
     * [get] W_HT_SHIPPING by PRODUCT_ID, named 'WHtShippingList'.
     * @return The entity list of referrer property 'WHtShippingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtShipping> getWHtShippingList() {
        if (_wHtShippingList == null) { _wHtShippingList = newReferrerList(); }
        return _wHtShippingList;
    }

    /**
     * [set] W_HT_SHIPPING by PRODUCT_ID, named 'WHtShippingList'.
     * @param wHtShippingList The entity list of referrer property 'WHtShippingList'. (NullAllowed)
     */
    public void setWHtShippingList(List<WHtShipping> wHtShippingList) {
        _wHtShippingList = wHtShippingList;
    }

    /** W_HT_SHIPPING_PICKING by PRODUCT_ID, named 'WHtShippingPickingList'. */
    protected List<WHtShippingPicking> _wHtShippingPickingList;

    /**
     * [get] W_HT_SHIPPING_PICKING by PRODUCT_ID, named 'WHtShippingPickingList'.
     * @return The entity list of referrer property 'WHtShippingPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtShippingPicking> getWHtShippingPickingList() {
        if (_wHtShippingPickingList == null) { _wHtShippingPickingList = newReferrerList(); }
        return _wHtShippingPickingList;
    }

    /**
     * [set] W_HT_SHIPPING_PICKING by PRODUCT_ID, named 'WHtShippingPickingList'.
     * @param wHtShippingPickingList The entity list of referrer property 'WHtShippingPickingList'. (NullAllowed)
     */
    public void setWHtShippingPickingList(List<WHtShippingPicking> wHtShippingPickingList) {
        _wHtShippingPickingList = wHtShippingPickingList;
    }

    /** W_SGL_ROW_SHIP_INSP_H by PRODUCT_ID, named 'WSglRowShipInspHList'. */
    protected List<WSglRowShipInspH> _wSglRowShipInspHList;

    /**
     * [get] W_SGL_ROW_SHIP_INSP_H by PRODUCT_ID, named 'WSglRowShipInspHList'.
     * @return The entity list of referrer property 'WSglRowShipInspHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WSglRowShipInspH> getWSglRowShipInspHList() {
        if (_wSglRowShipInspHList == null) { _wSglRowShipInspHList = newReferrerList(); }
        return _wSglRowShipInspHList;
    }

    /**
     * [set] W_SGL_ROW_SHIP_INSP_H by PRODUCT_ID, named 'WSglRowShipInspHList'.
     * @param wSglRowShipInspHList The entity list of referrer property 'WSglRowShipInspHList'. (NullAllowed)
     */
    public void setWSglRowShipInspHList(List<WSglRowShipInspH> wSglRowShipInspHList) {
        _wSglRowShipInspHList = wSglRowShipInspHList;
    }

    /** W_SHIPPING_INTERRUPT by PRODUCT_ID, named 'WShippingInterruptList'. */
    protected List<WShippingInterrupt> _wShippingInterruptList;

    /**
     * [get] W_SHIPPING_INTERRUPT by PRODUCT_ID, named 'WShippingInterruptList'.
     * @return The entity list of referrer property 'WShippingInterruptList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WShippingInterrupt> getWShippingInterruptList() {
        if (_wShippingInterruptList == null) { _wShippingInterruptList = newReferrerList(); }
        return _wShippingInterruptList;
    }

    /**
     * [set] W_SHIPPING_INTERRUPT by PRODUCT_ID, named 'WShippingInterruptList'.
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
        if (obj instanceof BsMProduct) {
            BsMProduct other = (BsMProduct)obj;
            if (!xSV(_productId, other._productId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mProductSelf != null)
        { sb.append(li).append(xbRDS(_mProductSelf, "mProductSelf")); }
        if (_mShapeGrp != null)
        { sb.append(li).append(xbRDS(_mShapeGrp, "mShapeGrp")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_bClassDtlByLimitDtManagFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLimitDtManagFlg, "bClassDtlByLimitDtManagFlg")); }
        if (_bClassDtlByLimitDtReverseFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLimitDtReverseFlg, "bClassDtlByLimitDtReverseFlg")); }
        if (_bClassDtlByLotManagFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLotManagFlg, "bClassDtlByLotManagFlg")); }
        if (_bClassDtlByLotReverseFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLotReverseFlg, "bClassDtlByLotReverseFlg")); }
        if (_bClassDtlByMergeCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByMergeCls, "bClassDtlByMergeCls")); }
        if (_bClassDtlByShippingStopFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByShippingStopFlg, "bClassDtlByShippingStopFlg")); }
        if (_bClassDtlByFreightCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByFreightCls, "bClassDtlByFreightCls")); }
        if (_mProductSelfAsOne != null)
        { sb.append(li).append(xbRDS(_mProductSelfAsOne, "mProductSelfAsOne")); }
        if (_mProductTermAsOne != null)
        { sb.append(li).append(xbRDS(_mProductTermAsOne, "mProductTermAsOne")); }
        if (_mSetParentAsOne != null)
        { sb.append(li).append(xbRDS(_mSetParentAsOne, "mSetParentAsOne")); }
        if (_mLocationList != null) { for (MLocation et : _mLocationList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mLocationList")); } } }
        if (_mMfwhxitemList != null) { for (MMfwhxitem et : _mMfwhxitemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mMfwhxitemList")); } } }
        if (_mProductShapeList != null) { for (MProductShape et : _mProductShapeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mProductShapeList")); } } }
        if (_mSetStructureList != null) { for (MSetStructure et : _mSetStructureList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mSetStructureList")); } } }
        if (_tAllocInstBList != null) { for (TAllocInstB et : _tAllocInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstBList")); } } }
        if (_tAllocLotList != null) { for (TAllocLot et : _tAllocLotList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocLotList")); } } }
        if (_tInventoryBList != null) { for (TInventoryB et : _tInventoryBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryBList")); } } }
        if (_tKeepingLotList != null) { for (TKeepingLot et : _tKeepingLotList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tKeepingLotList")); } } }
        if (_tLastLotList != null) { for (TLastLot et : _tLastLotList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tLastLotList")); } } }
        if (_tLotList != null) { for (TLot et : _tLotList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tLotList")); } } }
        if (_tMoveInstBList != null) { for (TMoveInstB et : _tMoveInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveInstBList")); } } }
        if (_tReceivePlanBList != null) { for (TReceivePlanB et : _tReceivePlanBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanBList")); } } }
        if (_tSerialNoList != null) { for (TSerialNo et : _tSerialNoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tSerialNoList")); } } }
        if (_tShippingInstBList != null) { for (TShippingInstB et : _tShippingInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstBList")); } } }
        if (_tStockList != null) { for (TStock et : _tStockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockList")); } } }
        if (_tTrinvcheckinfoList != null) { for (TTrinvcheckinfo et : _tTrinvcheckinfoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrinvcheckinfoList")); } } }
        if (_tYtrsodetailList != null) { for (TYtrsodetail et : _tYtrsodetailList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tYtrsodetailList")); } } }
        if (_wHtInventoryInputProdList != null) { for (WHtInventoryInputProd et : _wHtInventoryInputProdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtInventoryInputProdList")); } } }
        if (_wHtReceiveInspectionList != null) { for (WHtReceiveInspection et : _wHtReceiveInspectionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveInspectionList")); } } }
        if (_wHtReceiveNoPlanInspList != null) { for (WHtReceiveNoPlanInsp et : _wHtReceiveNoPlanInspList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveNoPlanInspList")); } } }
        if (_wHtReceiveStoreList != null) { for (WHtReceiveStore et : _wHtReceiveStoreList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveStoreList")); } } }
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
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_lotManagFlg));
        sb.append(dm).append(xfND(_limitDtManagFlg));
        sb.append(dm).append(xfND(_receiveLimitNum));
        sb.append(dm).append(xfND(_shippingLimitNum));
        sb.append(dm).append(xfND(_mergeCls));
        sb.append(dm).append(xfND(_lotReverseFlg));
        sb.append(dm).append(xfND(_limitDtReverseFlg));
        sb.append(dm).append(xfND(_shippingStopFlg));
        sb.append(dm).append(xfND(_fixedPoint));
        sb.append(dm).append(xfND(_shapeGrpId));
        sb.append(dm).append(xfND(_nmfcCode));
        sb.append(dm).append(xfND(_freightCls));
        sb.append(dm).append(xfND(_counntryOfOrigin));
        sb.append(dm).append(xfND(_unitVal));
        sb.append(dm).append(xfND(_htsCd));
        sb.append(dm).append(xfND(_itemgroup));
        sb.append(dm).append(xfND(_actflg));
        sb.append(dm).append(xfND(_invtype));
        sb.append(dm).append(xfND(_setitemflg));
        sb.append(dm).append(xfND(_owneritemcd));
        sb.append(dm).append(xfND(_supplieritemcd));
        sb.append(dm).append(xfND(_positemcd));
        sb.append(dm).append(xfND(_itfcd));
        sb.append(dm).append(xfND(_manuitemcd));
        sb.append(dm).append(xfND(_priceBuy));
        sb.append(dm).append(xfND(_priceWholesale));
        sb.append(dm).append(xfND(_priceSale));
        sb.append(dm).append(xfND(_allocpolicykey));
        sb.append(dm).append(xfND(_slotpolicykey));
        sb.append(dm).append(xfND(_inworkingkey));
        sb.append(dm).append(xfND(_outworkingkey));
        sb.append(dm).append(xfND(_abctype));
        sb.append(dm).append(xfND(_qty1type));
        sb.append(dm).append(xfND(_unit1));
        sb.append(dm).append(xfND(_unit1style));
        sb.append(dm).append(xfND(_length1));
        sb.append(dm).append(xfND(_width1));
        sb.append(dm).append(xfND(_height1));
        sb.append(dm).append(xfND(_grossweight1));
        sb.append(dm).append(xfND(_netweight1));
        sb.append(dm).append(xfND(_cube1));
        sb.append(dm).append(xfND(_liter1));
        sb.append(dm).append(xfND(_unit2));
        sb.append(dm).append(xfND(_unit2style));
        sb.append(dm).append(xfND(_length2));
        sb.append(dm).append(xfND(_width2));
        sb.append(dm).append(xfND(_height2));
        sb.append(dm).append(xfND(_grossweight2));
        sb.append(dm).append(xfND(_netweight2));
        sb.append(dm).append(xfND(_cube2));
        sb.append(dm).append(xfND(_liter2));
        sb.append(dm).append(xfND(_unit3));
        sb.append(dm).append(xfND(_unit3style));
        sb.append(dm).append(xfND(_length3));
        sb.append(dm).append(xfND(_width3));
        sb.append(dm).append(xfND(_height3));
        sb.append(dm).append(xfND(_grossweight3));
        sb.append(dm).append(xfND(_netweight3));
        sb.append(dm).append(xfND(_cube3));
        sb.append(dm).append(xfND(_liter3));
        sb.append(dm).append(xfND(_pQty));
        sb.append(dm).append(xfND(_pHeight));
        sb.append(dm).append(xfND(_pOdd));
        sb.append(dm).append(xfND(_pDescription));
        sb.append(dm).append(xfND(_notes));
        sb.append(dm).append(xfND(_qty2usedflg));
        sb.append(dm).append(xfND(_qty2style));
        sb.append(dm).append(xfND(_qty3usedflg));
        sb.append(dm).append(xfND(_qty3style));
        sb.append(dm).append(xfND(_spCalcflg));
        sb.append(dm).append(xfND(_spLotatrb1usedflg));
        sb.append(dm).append(xfND(_spOperator1));
        sb.append(dm).append(xfND(_spLotatrb2usedflg));
        sb.append(dm).append(xfND(_spOperator2));
        sb.append(dm).append(xfND(_spLotatrb3usedflg));
        sb.append(dm).append(xfND(_spOperator3));
        sb.append(dm).append(xfND(_spRate));
        sb.append(dm).append(xfND(_lotatrb1title));
        sb.append(dm).append(xfND(_lotatrb2title));
        sb.append(dm).append(xfND(_lotatrb3title));
        sb.append(dm).append(xfND(_lotatrb4title));
        sb.append(dm).append(xfND(_lotatrb5title));
        sb.append(dm).append(xfND(_lotatrb6title));
        sb.append(dm).append(xfND(_lotatrb7title));
        sb.append(dm).append(xfND(_lotatrb8title));
        sb.append(dm).append(xfND(_lotatrb9title));
        sb.append(dm).append(xfND(_lotatrb10title));
        sb.append(dm).append(xfND(_fUser1));
        sb.append(dm).append(xfND(_fUser2));
        sb.append(dm).append(xfND(_fUser3));
        sb.append(dm).append(xfND(_fUser4));
        sb.append(dm).append(xfND(_fUser5));
        sb.append(dm).append(xfND(_item40));
        sb.append(dm).append(xfND(_priceInsurance));
        sb.append(dm).append(xfND(_limitday));
        sb.append(dm).append(xfND(_deliverableday));
        sb.append(dm).append(xfND(_printdateflg));
        sb.append(dm).append(xfND(_suppliercd));
        sb.append(dm).append(xfND(_dispatchqtytype));
        sb.append(dm).append(xfND(_tariffqtytype));
        sb.append(dm).append(xfND(_useruse1));
        sb.append(dm).append(xfND(_useruse2));
        sb.append(dm).append(xfND(_useruse3));
        sb.append(dm).append(xfND(_useruse4));
        sb.append(dm).append(xfND(_useruse5));
        sb.append(dm).append(xfND(_lot1nullflg));
        sb.append(dm).append(xfND(_lot2nullflg));
        sb.append(dm).append(xfND(_lot3nullflg));
        sb.append(dm).append(xfND(_lot4nullflg));
        sb.append(dm).append(xfND(_lot5nullflg));
        sb.append(dm).append(xfND(_otherlot1nullflg));
        sb.append(dm).append(xfND(_otherlot2nullflg));
        sb.append(dm).append(xfND(_otherlot3nullflg));
        sb.append(dm).append(xfND(_otherlot4nullflg));
        sb.append(dm).append(xfND(_otherlot5nullflg));
        sb.append(dm).append(xfND(_itemprintname));
        sb.append(dm).append(xfND(_pricelevel));
        sb.append(dm).append(xfND(_itemcatalogurl));
        sb.append(dm).append(xfND(_usernum1));
        sb.append(dm).append(xfND(_usernum2));
        sb.append(dm).append(xfND(_usernum3));
        sb.append(dm).append(xfND(_usernum4));
        sb.append(dm).append(xfND(_usernum5));
        sb.append(dm).append(xfND(_userdate1));
        sb.append(dm).append(xfND(_userdate2));
        sb.append(dm).append(xfND(_userdate3));
        sb.append(dm).append(xfND(_userdate4));
        sb.append(dm).append(xfND(_userdate5));
        sb.append(dm).append(xfND(_cggdid));
        sb.append(dm).append(xfND(_brctg));
        sb.append(dm).append(xfND(_ctweight));
        sb.append(dm).append(xfND(_bxoszl));
        sb.append(dm).append(xfND(_bxoszw));
        sb.append(dm).append(xfND(_bxoszh));
        sb.append(dm).append(xfND(_bxcpy));
        sb.append(dm).append(xfND(_bxweight));
        sb.append(dm).append(xfND(_itemAdmin));
        sb.append(dm).append(xfND(_sname));
        sb.append(dm).append(xfND(_fractionpieceweight));
        sb.append(dm).append(xfND(_taxequivalentnumber));
        sb.append(dm).append(xfND(_syhnkbnjt));
        sb.append(dm).append(xfND(_ioidCls));
        sb.append(dm).append(xfND(_itfcdCls));
        sb.append(dm).append(xfND(_manuitemcdCls));
        sb.append(dm).append(xfND(_ctcpy));
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
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mProductSelf != null)
        { sb.append(dm).append("mProductSelf"); }
        if (_mShapeGrp != null)
        { sb.append(dm).append("mShapeGrp"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_bClassDtlByLimitDtManagFlg != null)
        { sb.append(dm).append("bClassDtlByLimitDtManagFlg"); }
        if (_bClassDtlByLimitDtReverseFlg != null)
        { sb.append(dm).append("bClassDtlByLimitDtReverseFlg"); }
        if (_bClassDtlByLotManagFlg != null)
        { sb.append(dm).append("bClassDtlByLotManagFlg"); }
        if (_bClassDtlByLotReverseFlg != null)
        { sb.append(dm).append("bClassDtlByLotReverseFlg"); }
        if (_bClassDtlByMergeCls != null)
        { sb.append(dm).append("bClassDtlByMergeCls"); }
        if (_bClassDtlByShippingStopFlg != null)
        { sb.append(dm).append("bClassDtlByShippingStopFlg"); }
        if (_bClassDtlByFreightCls != null)
        { sb.append(dm).append("bClassDtlByFreightCls"); }
        if (_mProductSelfAsOne != null)
        { sb.append(dm).append("mProductSelfAsOne"); }
        if (_mProductTermAsOne != null)
        { sb.append(dm).append("mProductTermAsOne"); }
        if (_mSetParentAsOne != null)
        { sb.append(dm).append("mSetParentAsOne"); }
        if (_mLocationList != null && !_mLocationList.isEmpty())
        { sb.append(dm).append("mLocationList"); }
        if (_mMfwhxitemList != null && !_mMfwhxitemList.isEmpty())
        { sb.append(dm).append("mMfwhxitemList"); }
        if (_mProductShapeList != null && !_mProductShapeList.isEmpty())
        { sb.append(dm).append("mProductShapeList"); }
        if (_mSetStructureList != null && !_mSetStructureList.isEmpty())
        { sb.append(dm).append("mSetStructureList"); }
        if (_tAllocInstBList != null && !_tAllocInstBList.isEmpty())
        { sb.append(dm).append("tAllocInstBList"); }
        if (_tAllocLotList != null && !_tAllocLotList.isEmpty())
        { sb.append(dm).append("tAllocLotList"); }
        if (_tInventoryBList != null && !_tInventoryBList.isEmpty())
        { sb.append(dm).append("tInventoryBList"); }
        if (_tKeepingLotList != null && !_tKeepingLotList.isEmpty())
        { sb.append(dm).append("tKeepingLotList"); }
        if (_tLastLotList != null && !_tLastLotList.isEmpty())
        { sb.append(dm).append("tLastLotList"); }
        if (_tLotList != null && !_tLotList.isEmpty())
        { sb.append(dm).append("tLotList"); }
        if (_tMoveInstBList != null && !_tMoveInstBList.isEmpty())
        { sb.append(dm).append("tMoveInstBList"); }
        if (_tReceivePlanBList != null && !_tReceivePlanBList.isEmpty())
        { sb.append(dm).append("tReceivePlanBList"); }
        if (_tSerialNoList != null && !_tSerialNoList.isEmpty())
        { sb.append(dm).append("tSerialNoList"); }
        if (_tShippingInstBList != null && !_tShippingInstBList.isEmpty())
        { sb.append(dm).append("tShippingInstBList"); }
        if (_tStockList != null && !_tStockList.isEmpty())
        { sb.append(dm).append("tStockList"); }
        if (_tTrinvcheckinfoList != null && !_tTrinvcheckinfoList.isEmpty())
        { sb.append(dm).append("tTrinvcheckinfoList"); }
        if (_tYtrsodetailList != null && !_tYtrsodetailList.isEmpty())
        { sb.append(dm).append("tYtrsodetailList"); }
        if (_wHtInventoryInputProdList != null && !_wHtInventoryInputProdList.isEmpty())
        { sb.append(dm).append("wHtInventoryInputProdList"); }
        if (_wHtReceiveInspectionList != null && !_wHtReceiveInspectionList.isEmpty())
        { sb.append(dm).append("wHtReceiveInspectionList"); }
        if (_wHtReceiveNoPlanInspList != null && !_wHtReceiveNoPlanInspList.isEmpty())
        { sb.append(dm).append("wHtReceiveNoPlanInspList"); }
        if (_wHtReceiveStoreList != null && !_wHtReceiveStoreList.isEmpty())
        { sb.append(dm).append("wHtReceiveStoreList"); }
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
    public MProduct clone() {
        return (MProduct)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {NotNull, varchar(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {NotNull, varchar(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (basically NotNull if update: for the constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] PRODUCT_ABBR: {varchar(60)} <br>
     * 商品略称
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductAbbr() {
        checkSpecifiedProperty("productAbbr");
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(60)} <br>
     * 商品略称
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductAbbr(String productAbbr) {
        registerModifiedProperty("productAbbr");
        _productAbbr = productAbbr;
    }

    /**
     * [get] JAN_CD: {IX, varchar(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {IX, varchar(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @return The value of the column 'LOT_MANAG_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getLotManagFlg() {
        checkSpecifiedProperty("lotManagFlg");
        return convertEmptyToNull(_lotManagFlg);
    }

    /**
     * [set] LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param lotManagFlg The value of the column 'LOT_MANAG_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setLotManagFlg(String lotManagFlg) {
        registerModifiedProperty("lotManagFlg");
        _lotManagFlg = lotManagFlg;
    }

    /**
     * [get] LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @return The value of the column 'LIMIT_DT_MANAG_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getLimitDtManagFlg() {
        checkSpecifiedProperty("limitDtManagFlg");
        return convertEmptyToNull(_limitDtManagFlg);
    }

    /**
     * [set] LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param limitDtManagFlg The value of the column 'LIMIT_DT_MANAG_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setLimitDtManagFlg(String limitDtManagFlg) {
        registerModifiedProperty("limitDtManagFlg");
        _limitDtManagFlg = limitDtManagFlg;
    }

    /**
     * [get] RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]} <br>
     * 入荷期限日数
     * @return The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceiveLimitNum() {
        checkSpecifiedProperty("receiveLimitNum");
        return _receiveLimitNum;
    }

    /**
     * [set] RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]} <br>
     * 入荷期限日数
     * @param receiveLimitNum The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveLimitNum(Long receiveLimitNum) {
        registerModifiedProperty("receiveLimitNum");
        _receiveLimitNum = receiveLimitNum;
    }

    /**
     * [get] SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]} <br>
     * 出荷期限日数
     * @return The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingLimitNum() {
        checkSpecifiedProperty("shippingLimitNum");
        return _shippingLimitNum;
    }

    /**
     * [set] SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]} <br>
     * 出荷期限日数
     * @param shippingLimitNum The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingLimitNum(Long shippingLimitNum) {
        registerModifiedProperty("shippingLimitNum");
        _shippingLimitNum = shippingLimitNum;
    }

    /**
     * [get] MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @return The value of the column 'MERGE_CLS'. (basically NotNull if selected: for the constraint)
     */
    public String getMergeCls() {
        checkSpecifiedProperty("mergeCls");
        return convertEmptyToNull(_mergeCls);
    }

    /**
     * [set] MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param mergeCls The value of the column 'MERGE_CLS'. (basically NotNull if update: for the constraint)
     */
    public void setMergeCls(String mergeCls) {
        registerModifiedProperty("mergeCls");
        _mergeCls = mergeCls;
    }

    /**
     * [get] LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @return The value of the column 'LOT_REVERSE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotReverseFlg() {
        checkSpecifiedProperty("lotReverseFlg");
        return convertEmptyToNull(_lotReverseFlg);
    }

    /**
     * [set] LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param lotReverseFlg The value of the column 'LOT_REVERSE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotReverseFlg(String lotReverseFlg) {
        registerModifiedProperty("lotReverseFlg");
        _lotReverseFlg = lotReverseFlg;
    }

    /**
     * [get] LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @return The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDtReverseFlg() {
        checkSpecifiedProperty("limitDtReverseFlg");
        return convertEmptyToNull(_limitDtReverseFlg);
    }

    /**
     * [set] LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param limitDtReverseFlg The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDtReverseFlg(String limitDtReverseFlg) {
        registerModifiedProperty("limitDtReverseFlg");
        _limitDtReverseFlg = limitDtReverseFlg;
    }

    /**
     * [get] SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @return The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStopFlg() {
        checkSpecifiedProperty("shippingStopFlg");
        return convertEmptyToNull(_shippingStopFlg);
    }

    /**
     * [set] SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param shippingStopFlg The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStopFlg(String shippingStopFlg) {
        registerModifiedProperty("shippingStopFlg");
        _shippingStopFlg = shippingStopFlg;
    }

    /**
     * [get] FIXED_POINT: {decimal(16, 6)} <br>
     * 定点
     * @return The value of the column 'FIXED_POINT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getFixedPoint() {
        checkSpecifiedProperty("fixedPoint");
        return _fixedPoint;
    }

    /**
     * [set] FIXED_POINT: {decimal(16, 6)} <br>
     * 定点
     * @param fixedPoint The value of the column 'FIXED_POINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFixedPoint(java.math.BigDecimal fixedPoint) {
        registerModifiedProperty("fixedPoint");
        _fixedPoint = fixedPoint;
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
     * [get] NMFC_CODE: {varchar(30)} <br>
     * NMFC Code
     * @return The value of the column 'NMFC_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getNmfcCode() {
        checkSpecifiedProperty("nmfcCode");
        return convertEmptyToNull(_nmfcCode);
    }

    /**
     * [set] NMFC_CODE: {varchar(30)} <br>
     * NMFC Code
     * @param nmfcCode The value of the column 'NMFC_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmfcCode(String nmfcCode) {
        registerModifiedProperty("nmfcCode");
        _nmfcCode = nmfcCode;
    }

    /**
     * [get] FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @return The value of the column 'FREIGHT_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getFreightCls() {
        checkSpecifiedProperty("freightCls");
        return convertEmptyToNull(_freightCls);
    }

    /**
     * [set] FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @param freightCls The value of the column 'FREIGHT_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFreightCls(String freightCls) {
        registerModifiedProperty("freightCls");
        _freightCls = freightCls;
    }

    /**
     * [get] COUNNTRY_OF_ORIGIN: {varchar(30)} <br>
     * Country of Origin
     * @return The value of the column 'COUNNTRY_OF_ORIGIN'. (NullAllowed even if selected: for no constraint)
     */
    public String getCounntryOfOrigin() {
        checkSpecifiedProperty("counntryOfOrigin");
        return convertEmptyToNull(_counntryOfOrigin);
    }

    /**
     * [set] COUNNTRY_OF_ORIGIN: {varchar(30)} <br>
     * Country of Origin
     * @param counntryOfOrigin The value of the column 'COUNNTRY_OF_ORIGIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCounntryOfOrigin(String counntryOfOrigin) {
        registerModifiedProperty("counntryOfOrigin");
        _counntryOfOrigin = counntryOfOrigin;
    }

    /**
     * [get] UNIT_VAL: {decimal(16, 6)} <br>
     * Unit Value
     * @return The value of the column 'UNIT_VAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getUnitVal() {
        checkSpecifiedProperty("unitVal");
        return _unitVal;
    }

    /**
     * [set] UNIT_VAL: {decimal(16, 6)} <br>
     * Unit Value
     * @param unitVal The value of the column 'UNIT_VAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitVal(java.math.BigDecimal unitVal) {
        registerModifiedProperty("unitVal");
        _unitVal = unitVal;
    }

    /**
     * [get] HTS_CD: {varchar(30)} <br>
     * Harmonized Code
     * @return The value of the column 'HTS_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getHtsCd() {
        checkSpecifiedProperty("htsCd");
        return convertEmptyToNull(_htsCd);
    }

    /**
     * [set] HTS_CD: {varchar(30)} <br>
     * Harmonized Code
     * @param htsCd The value of the column 'HTS_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHtsCd(String htsCd) {
        registerModifiedProperty("htsCd");
        _htsCd = htsCd;
    }

    /**
     * [get] ITEMGROUP: {varchar(60)} <br>
     * 銘柄グループ
     * @return The value of the column 'ITEMGROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemgroup() {
        checkSpecifiedProperty("itemgroup");
        return convertEmptyToNull(_itemgroup);
    }

    /**
     * [set] ITEMGROUP: {varchar(60)} <br>
     * 銘柄グループ
     * @param itemgroup The value of the column 'ITEMGROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemgroup(String itemgroup) {
        registerModifiedProperty("itemgroup");
        _itemgroup = itemgroup;
    }

    /**
     * [get] ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 活動中フラグ
     * @return The value of the column 'ACTFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getActflg() {
        checkSpecifiedProperty("actflg");
        return _actflg;
    }

    /**
     * [set] ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 活動中フラグ
     * @param actflg The value of the column 'ACTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setActflg(java.math.BigDecimal actflg) {
        registerModifiedProperty("actflg");
        _actflg = actflg;
    }

    /**
     * [get] INVTYPE: {NotNull, varchar(30)} <br>
     * 銘柄在庫タイプ
     * @return The value of the column 'INVTYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getInvtype() {
        checkSpecifiedProperty("invtype");
        return convertEmptyToNull(_invtype);
    }

    /**
     * [set] INVTYPE: {NotNull, varchar(30)} <br>
     * 銘柄在庫タイプ
     * @param invtype The value of the column 'INVTYPE'. (basically NotNull if update: for the constraint)
     */
    public void setInvtype(String invtype) {
        registerModifiedProperty("invtype");
        _invtype = invtype;
    }

    /**
     * [get] SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * セット品フラグ
     * @return The value of the column 'SETITEMFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSetitemflg() {
        checkSpecifiedProperty("setitemflg");
        return _setitemflg;
    }

    /**
     * [set] SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * セット品フラグ
     * @param setitemflg The value of the column 'SETITEMFLG'. (basically NotNull if update: for the constraint)
     */
    public void setSetitemflg(java.math.BigDecimal setitemflg) {
        registerModifiedProperty("setitemflg");
        _setitemflg = setitemflg;
    }

    /**
     * [get] OWNERITEMCD: {varchar(30)} <br>
     * 返品親銘柄CD
     * @return The value of the column 'OWNERITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwneritemcd() {
        checkSpecifiedProperty("owneritemcd");
        return convertEmptyToNull(_owneritemcd);
    }

    /**
     * [set] OWNERITEMCD: {varchar(30)} <br>
     * 返品親銘柄CD
     * @param owneritemcd The value of the column 'OWNERITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwneritemcd(String owneritemcd) {
        registerModifiedProperty("owneritemcd");
        _owneritemcd = owneritemcd;
    }

    /**
     * [get] SUPPLIERITEMCD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'SUPPLIERITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplieritemcd() {
        checkSpecifiedProperty("supplieritemcd");
        return convertEmptyToNull(_supplieritemcd);
    }

    /**
     * [set] SUPPLIERITEMCD: {varchar(30)} <br>
     * 銘柄CD
     * @param supplieritemcd The value of the column 'SUPPLIERITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplieritemcd(String supplieritemcd) {
        registerModifiedProperty("supplieritemcd");
        _supplieritemcd = supplieritemcd;
    }

    /**
     * [get] POSITEMCD: {varchar(30)} <br>
     * 個装バーコード
     * @return The value of the column 'POSITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPositemcd() {
        checkSpecifiedProperty("positemcd");
        return convertEmptyToNull(_positemcd);
    }

    /**
     * [set] POSITEMCD: {varchar(30)} <br>
     * 個装バーコード
     * @param positemcd The value of the column 'POSITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPositemcd(String positemcd) {
        registerModifiedProperty("positemcd");
        _positemcd = positemcd;
    }

    /**
     * [get] ITFCD: {varchar(30)} <br>
     * カートンバーコード
     * @return The value of the column 'ITFCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getItfcd() {
        checkSpecifiedProperty("itfcd");
        return convertEmptyToNull(_itfcd);
    }

    /**
     * [set] ITFCD: {varchar(30)} <br>
     * カートンバーコード
     * @param itfcd The value of the column 'ITFCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItfcd(String itfcd) {
        registerModifiedProperty("itfcd");
        _itfcd = itfcd;
    }

    /**
     * [get] MANUITEMCD: {varchar(30)} <br>
     * 段ボールバーコード
     * @return The value of the column 'MANUITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getManuitemcd() {
        checkSpecifiedProperty("manuitemcd");
        return convertEmptyToNull(_manuitemcd);
    }

    /**
     * [set] MANUITEMCD: {varchar(30)} <br>
     * 段ボールバーコード
     * @param manuitemcd The value of the column 'MANUITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManuitemcd(String manuitemcd) {
        registerModifiedProperty("manuitemcd");
        _manuitemcd = manuitemcd;
    }

    /**
     * [get] PRICE_BUY: {NotNull, bigint(19), default=[(0)]} <br>
     * 装置本数
     * @return The value of the column 'PRICE_BUY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPriceBuy() {
        checkSpecifiedProperty("priceBuy");
        return _priceBuy;
    }

    /**
     * [set] PRICE_BUY: {NotNull, bigint(19), default=[(0)]} <br>
     * 装置本数
     * @param priceBuy The value of the column 'PRICE_BUY'. (basically NotNull if update: for the constraint)
     */
    public void setPriceBuy(Long priceBuy) {
        registerModifiedProperty("priceBuy");
        _priceBuy = priceBuy;
    }

    /**
     * [get] PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小受注単位
     * @return The value of the column 'PRICE_WHOLESALE'. (basically NotNull if selected: for the constraint)
     */
    public Long getPriceWholesale() {
        checkSpecifiedProperty("priceWholesale");
        return _priceWholesale;
    }

    /**
     * [set] PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小受注単位
     * @param priceWholesale The value of the column 'PRICE_WHOLESALE'. (basically NotNull if update: for the constraint)
     */
    public void setPriceWholesale(Long priceWholesale) {
        registerModifiedProperty("priceWholesale");
        _priceWholesale = priceWholesale;
    }

    /**
     * [get] PRICE_SALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 定価
     * @return The value of the column 'PRICE_SALE'. (basically NotNull if selected: for the constraint)
     */
    public Long getPriceSale() {
        checkSpecifiedProperty("priceSale");
        return _priceSale;
    }

    /**
     * [set] PRICE_SALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 定価
     * @param priceSale The value of the column 'PRICE_SALE'. (basically NotNull if update: for the constraint)
     */
    public void setPriceSale(Long priceSale) {
        registerModifiedProperty("priceSale");
        _priceSale = priceSale;
    }

    /**
     * [get] ALLOCPOLICYKEY: {decimal(16, 6)} <br>
     * PM/BATフラグ
     * @return The value of the column 'ALLOCPOLICYKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAllocpolicykey() {
        checkSpecifiedProperty("allocpolicykey");
        return _allocpolicykey;
    }

    /**
     * [set] ALLOCPOLICYKEY: {decimal(16, 6)} <br>
     * PM/BATフラグ
     * @param allocpolicykey The value of the column 'ALLOCPOLICYKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocpolicykey(java.math.BigDecimal allocpolicykey) {
        registerModifiedProperty("allocpolicykey");
        _allocpolicykey = allocpolicykey;
    }

    /**
     * [get] SLOTPOLICYKEY: {decimal(16, 6)} <br>
     * 賞味期限月数
     * @return The value of the column 'SLOTPOLICYKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSlotpolicykey() {
        checkSpecifiedProperty("slotpolicykey");
        return _slotpolicykey;
    }

    /**
     * [set] SLOTPOLICYKEY: {decimal(16, 6)} <br>
     * 賞味期限月数
     * @param slotpolicykey The value of the column 'SLOTPOLICYKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlotpolicykey(java.math.BigDecimal slotpolicykey) {
        registerModifiedProperty("slotpolicykey");
        _slotpolicykey = slotpolicykey;
    }

    /**
     * [get] INWORKINGKEY: {decimal(16, 6)} <br>
     * シンボル貼付データ有無フラグ
     * @return The value of the column 'INWORKINGKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInworkingkey() {
        checkSpecifiedProperty("inworkingkey");
        return _inworkingkey;
    }

    /**
     * [set] INWORKINGKEY: {decimal(16, 6)} <br>
     * シンボル貼付データ有無フラグ
     * @param inworkingkey The value of the column 'INWORKINGKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInworkingkey(java.math.BigDecimal inworkingkey) {
        registerModifiedProperty("inworkingkey");
        _inworkingkey = inworkingkey;
    }

    /**
     * [get] OUTWORKINGKEY: {decimal(16, 6)} <br>
     * 販物受信フラグ
     * @return The value of the column 'OUTWORKINGKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getOutworkingkey() {
        checkSpecifiedProperty("outworkingkey");
        return _outworkingkey;
    }

    /**
     * [set] OUTWORKINGKEY: {decimal(16, 6)} <br>
     * 販物受信フラグ
     * @param outworkingkey The value of the column 'OUTWORKINGKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOutworkingkey(java.math.BigDecimal outworkingkey) {
        registerModifiedProperty("outworkingkey");
        _outworkingkey = outworkingkey;
    }

    /**
     * [get] ABCTYPE: {varchar(30)} <br>
     * たばこ区分
     * @return The value of the column 'ABCTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getAbctype() {
        checkSpecifiedProperty("abctype");
        return convertEmptyToNull(_abctype);
    }

    /**
     * [set] ABCTYPE: {varchar(30)} <br>
     * たばこ区分
     * @param abctype The value of the column 'ABCTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAbctype(String abctype) {
        registerModifiedProperty("abctype");
        _abctype = abctype;
    }

    /**
     * [get] QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 数量１単位レベル
     * @return The value of the column 'QTY1TYPE'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getQty1type() {
        checkSpecifiedProperty("qty1type");
        return _qty1type;
    }

    /**
     * [set] QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 数量１単位レベル
     * @param qty1type The value of the column 'QTY1TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setQty1type(java.math.BigDecimal qty1type) {
        registerModifiedProperty("qty1type");
        _qty1type = qty1type;
    }

    /**
     * [get] UNIT1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 1ケース当カートン数
     * @return The value of the column 'UNIT1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getUnit1() {
        checkSpecifiedProperty("unit1");
        return _unit1;
    }

    /**
     * [set] UNIT1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 1ケース当カートン数
     * @param unit1 The value of the column 'UNIT1'. (basically NotNull if update: for the constraint)
     */
    public void setUnit1(java.math.BigDecimal unit1) {
        registerModifiedProperty("unit1");
        _unit1 = unit1;
    }

    /**
     * [get] UNIT1STYLE: {varchar(60)} <br>
     * ケース単位
     * @return The value of the column 'UNIT1STYLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnit1style() {
        checkSpecifiedProperty("unit1style");
        return convertEmptyToNull(_unit1style);
    }

    /**
     * [set] UNIT1STYLE: {varchar(60)} <br>
     * ケース単位
     * @param unit1style The value of the column 'UNIT1STYLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit1style(String unit1style) {
        registerModifiedProperty("unit1style");
        _unit1style = unit1style;
    }

    /**
     * [get] LENGTH1: {NotNull, bigint(19), default=[(0)]} <br>
     * 縦１
     * @return The value of the column 'LENGTH1'. (basically NotNull if selected: for the constraint)
     */
    public Long getLength1() {
        checkSpecifiedProperty("length1");
        return _length1;
    }

    /**
     * [set] LENGTH1: {NotNull, bigint(19), default=[(0)]} <br>
     * 縦１
     * @param length1 The value of the column 'LENGTH1'. (basically NotNull if update: for the constraint)
     */
    public void setLength1(Long length1) {
        registerModifiedProperty("length1");
        _length1 = length1;
    }

    /**
     * [get] WIDTH1: {NotNull, bigint(19), default=[(0)]} <br>
     * 横１
     * @return The value of the column 'WIDTH1'. (basically NotNull if selected: for the constraint)
     */
    public Long getWidth1() {
        checkSpecifiedProperty("width1");
        return _width1;
    }

    /**
     * [set] WIDTH1: {NotNull, bigint(19), default=[(0)]} <br>
     * 横１
     * @param width1 The value of the column 'WIDTH1'. (basically NotNull if update: for the constraint)
     */
    public void setWidth1(Long width1) {
        registerModifiedProperty("width1");
        _width1 = width1;
    }

    /**
     * [get] HEIGHT1: {NotNull, bigint(19), default=[(0)]} <br>
     * 高さ１
     * @return The value of the column 'HEIGHT1'. (basically NotNull if selected: for the constraint)
     */
    public Long getHeight1() {
        checkSpecifiedProperty("height1");
        return _height1;
    }

    /**
     * [set] HEIGHT1: {NotNull, bigint(19), default=[(0)]} <br>
     * 高さ１
     * @param height1 The value of the column 'HEIGHT1'. (basically NotNull if update: for the constraint)
     */
    public void setHeight1(Long height1) {
        registerModifiedProperty("height1");
        _height1 = height1;
    }

    /**
     * [get] GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]} <br>
     * グロス重量１
     * @return The value of the column 'GROSSWEIGHT1'. (basically NotNull if selected: for the constraint)
     */
    public Long getGrossweight1() {
        checkSpecifiedProperty("grossweight1");
        return _grossweight1;
    }

    /**
     * [set] GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]} <br>
     * グロス重量１
     * @param grossweight1 The value of the column 'GROSSWEIGHT1'. (basically NotNull if update: for the constraint)
     */
    public void setGrossweight1(Long grossweight1) {
        registerModifiedProperty("grossweight1");
        _grossweight1 = grossweight1;
    }

    /**
     * [get] NETWEIGHT1: {NotNull, bigint(19), default=[(0)]} <br>
     * ネット重量１
     * @return The value of the column 'NETWEIGHT1'. (basically NotNull if selected: for the constraint)
     */
    public Long getNetweight1() {
        checkSpecifiedProperty("netweight1");
        return _netweight1;
    }

    /**
     * [set] NETWEIGHT1: {NotNull, bigint(19), default=[(0)]} <br>
     * ネット重量１
     * @param netweight1 The value of the column 'NETWEIGHT1'. (basically NotNull if update: for the constraint)
     */
    public void setNetweight1(Long netweight1) {
        registerModifiedProperty("netweight1");
        _netweight1 = netweight1;
    }

    /**
     * [get] CUBE1: {NotNull, bigint(19), default=[(0)]} <br>
     * 体積（容積）１
     * @return The value of the column 'CUBE1'. (basically NotNull if selected: for the constraint)
     */
    public Long getCube1() {
        checkSpecifiedProperty("cube1");
        return _cube1;
    }

    /**
     * [set] CUBE1: {NotNull, bigint(19), default=[(0)]} <br>
     * 体積（容積）１
     * @param cube1 The value of the column 'CUBE1'. (basically NotNull if update: for the constraint)
     */
    public void setCube1(Long cube1) {
        registerModifiedProperty("cube1");
        _cube1 = cube1;
    }

    /**
     * [get] LITER1: {NotNull, bigint(19), default=[(0)]} <br>
     * 内容量１
     * @return The value of the column 'LITER1'. (basically NotNull if selected: for the constraint)
     */
    public Long getLiter1() {
        checkSpecifiedProperty("liter1");
        return _liter1;
    }

    /**
     * [set] LITER1: {NotNull, bigint(19), default=[(0)]} <br>
     * 内容量１
     * @param liter1 The value of the column 'LITER1'. (basically NotNull if update: for the constraint)
     */
    public void setLiter1(Long liter1) {
        registerModifiedProperty("liter1");
        _liter1 = liter1;
    }

    /**
     * [get] UNIT2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 1カートン当個数
     * @return The value of the column 'UNIT2'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getUnit2() {
        checkSpecifiedProperty("unit2");
        return _unit2;
    }

    /**
     * [set] UNIT2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 1カートン当個数
     * @param unit2 The value of the column 'UNIT2'. (basically NotNull if update: for the constraint)
     */
    public void setUnit2(java.math.BigDecimal unit2) {
        registerModifiedProperty("unit2");
        _unit2 = unit2;
    }

    /**
     * [get] UNIT2STYLE: {varchar(60)} <br>
     * カートン単位
     * @return The value of the column 'UNIT2STYLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnit2style() {
        checkSpecifiedProperty("unit2style");
        return convertEmptyToNull(_unit2style);
    }

    /**
     * [set] UNIT2STYLE: {varchar(60)} <br>
     * カートン単位
     * @param unit2style The value of the column 'UNIT2STYLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit2style(String unit2style) {
        registerModifiedProperty("unit2style");
        _unit2style = unit2style;
    }

    /**
     * [get] LENGTH2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン寸法(L)
     * @return The value of the column 'LENGTH2'. (basically NotNull if selected: for the constraint)
     */
    public Long getLength2() {
        checkSpecifiedProperty("length2");
        return _length2;
    }

    /**
     * [set] LENGTH2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン寸法(L)
     * @param length2 The value of the column 'LENGTH2'. (basically NotNull if update: for the constraint)
     */
    public void setLength2(Long length2) {
        registerModifiedProperty("length2");
        _length2 = length2;
    }

    /**
     * [get] WIDTH2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン寸法(W)
     * @return The value of the column 'WIDTH2'. (basically NotNull if selected: for the constraint)
     */
    public Long getWidth2() {
        checkSpecifiedProperty("width2");
        return _width2;
    }

    /**
     * [set] WIDTH2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン寸法(W)
     * @param width2 The value of the column 'WIDTH2'. (basically NotNull if update: for the constraint)
     */
    public void setWidth2(Long width2) {
        registerModifiedProperty("width2");
        _width2 = width2;
    }

    /**
     * [get] HEIGHT2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン寸法(H)
     * @return The value of the column 'HEIGHT2'. (basically NotNull if selected: for the constraint)
     */
    public Long getHeight2() {
        checkSpecifiedProperty("height2");
        return _height2;
    }

    /**
     * [set] HEIGHT2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン寸法(H)
     * @param height2 The value of the column 'HEIGHT2'. (basically NotNull if update: for the constraint)
     */
    public void setHeight2(Long height2) {
        registerModifiedProperty("height2");
        _height2 = height2;
    }

    /**
     * [get] GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]} <br>
     * グロス重量２
     * @return The value of the column 'GROSSWEIGHT2'. (basically NotNull if selected: for the constraint)
     */
    public Long getGrossweight2() {
        checkSpecifiedProperty("grossweight2");
        return _grossweight2;
    }

    /**
     * [set] GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]} <br>
     * グロス重量２
     * @param grossweight2 The value of the column 'GROSSWEIGHT2'. (basically NotNull if update: for the constraint)
     */
    public void setGrossweight2(Long grossweight2) {
        registerModifiedProperty("grossweight2");
        _grossweight2 = grossweight2;
    }

    /**
     * [get] NETWEIGHT2: {NotNull, bigint(19), default=[(0)]} <br>
     * ネット重量２
     * @return The value of the column 'NETWEIGHT2'. (basically NotNull if selected: for the constraint)
     */
    public Long getNetweight2() {
        checkSpecifiedProperty("netweight2");
        return _netweight2;
    }

    /**
     * [set] NETWEIGHT2: {NotNull, bigint(19), default=[(0)]} <br>
     * ネット重量２
     * @param netweight2 The value of the column 'NETWEIGHT2'. (basically NotNull if update: for the constraint)
     */
    public void setNetweight2(Long netweight2) {
        registerModifiedProperty("netweight2");
        _netweight2 = netweight2;
    }

    /**
     * [get] CUBE2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン容積
     * @return The value of the column 'CUBE2'. (basically NotNull if selected: for the constraint)
     */
    public Long getCube2() {
        checkSpecifiedProperty("cube2");
        return _cube2;
    }

    /**
     * [set] CUBE2: {NotNull, bigint(19), default=[(0)]} <br>
     * カートン容積
     * @param cube2 The value of the column 'CUBE2'. (basically NotNull if update: for the constraint)
     */
    public void setCube2(Long cube2) {
        registerModifiedProperty("cube2");
        _cube2 = cube2;
    }

    /**
     * [get] LITER2: {NotNull, bigint(19), default=[(0)]} <br>
     * 内容量２
     * @return The value of the column 'LITER2'. (basically NotNull if selected: for the constraint)
     */
    public Long getLiter2() {
        checkSpecifiedProperty("liter2");
        return _liter2;
    }

    /**
     * [set] LITER2: {NotNull, bigint(19), default=[(0)]} <br>
     * 内容量２
     * @param liter2 The value of the column 'LITER2'. (basically NotNull if update: for the constraint)
     */
    public void setLiter2(Long liter2) {
        registerModifiedProperty("liter2");
        _liter2 = liter2;
    }

    /**
     * [get] UNIT3: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個数
     * @return The value of the column 'UNIT3'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getUnit3() {
        checkSpecifiedProperty("unit3");
        return _unit3;
    }

    /**
     * [set] UNIT3: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個数
     * @param unit3 The value of the column 'UNIT3'. (basically NotNull if update: for the constraint)
     */
    public void setUnit3(java.math.BigDecimal unit3) {
        registerModifiedProperty("unit3");
        _unit3 = unit3;
    }

    /**
     * [get] UNIT3STYLE: {varchar(60)} <br>
     * 個装単位
     * @return The value of the column 'UNIT3STYLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnit3style() {
        checkSpecifiedProperty("unit3style");
        return convertEmptyToNull(_unit3style);
    }

    /**
     * [set] UNIT3STYLE: {varchar(60)} <br>
     * 個装単位
     * @param unit3style The value of the column 'UNIT3STYLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit3style(String unit3style) {
        registerModifiedProperty("unit3style");
        _unit3style = unit3style;
    }

    /**
     * [get] LENGTH3: {NotNull, bigint(19), default=[(0)]} <br>
     * 縦３
     * @return The value of the column 'LENGTH3'. (basically NotNull if selected: for the constraint)
     */
    public Long getLength3() {
        checkSpecifiedProperty("length3");
        return _length3;
    }

    /**
     * [set] LENGTH3: {NotNull, bigint(19), default=[(0)]} <br>
     * 縦３
     * @param length3 The value of the column 'LENGTH3'. (basically NotNull if update: for the constraint)
     */
    public void setLength3(Long length3) {
        registerModifiedProperty("length3");
        _length3 = length3;
    }

    /**
     * [get] WIDTH3: {NotNull, bigint(19), default=[(0)]} <br>
     * 横３
     * @return The value of the column 'WIDTH3'. (basically NotNull if selected: for the constraint)
     */
    public Long getWidth3() {
        checkSpecifiedProperty("width3");
        return _width3;
    }

    /**
     * [set] WIDTH3: {NotNull, bigint(19), default=[(0)]} <br>
     * 横３
     * @param width3 The value of the column 'WIDTH3'. (basically NotNull if update: for the constraint)
     */
    public void setWidth3(Long width3) {
        registerModifiedProperty("width3");
        _width3 = width3;
    }

    /**
     * [get] HEIGHT3: {NotNull, bigint(19), default=[(0)]} <br>
     * 高さ３
     * @return The value of the column 'HEIGHT3'. (basically NotNull if selected: for the constraint)
     */
    public Long getHeight3() {
        checkSpecifiedProperty("height3");
        return _height3;
    }

    /**
     * [set] HEIGHT3: {NotNull, bigint(19), default=[(0)]} <br>
     * 高さ３
     * @param height3 The value of the column 'HEIGHT3'. (basically NotNull if update: for the constraint)
     */
    public void setHeight3(Long height3) {
        registerModifiedProperty("height3");
        _height3 = height3;
    }

    /**
     * [get] GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]} <br>
     * グロス重量３
     * @return The value of the column 'GROSSWEIGHT3'. (basically NotNull if selected: for the constraint)
     */
    public Long getGrossweight3() {
        checkSpecifiedProperty("grossweight3");
        return _grossweight3;
    }

    /**
     * [set] GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]} <br>
     * グロス重量３
     * @param grossweight3 The value of the column 'GROSSWEIGHT3'. (basically NotNull if update: for the constraint)
     */
    public void setGrossweight3(Long grossweight3) {
        registerModifiedProperty("grossweight3");
        _grossweight3 = grossweight3;
    }

    /**
     * [get] NETWEIGHT3: {NotNull, bigint(19), default=[(0)]} <br>
     * ネット重量３
     * @return The value of the column 'NETWEIGHT3'. (basically NotNull if selected: for the constraint)
     */
    public Long getNetweight3() {
        checkSpecifiedProperty("netweight3");
        return _netweight3;
    }

    /**
     * [set] NETWEIGHT3: {NotNull, bigint(19), default=[(0)]} <br>
     * ネット重量３
     * @param netweight3 The value of the column 'NETWEIGHT3'. (basically NotNull if update: for the constraint)
     */
    public void setNetweight3(Long netweight3) {
        registerModifiedProperty("netweight3");
        _netweight3 = netweight3;
    }

    /**
     * [get] CUBE3: {NotNull, bigint(19), default=[(0)]} <br>
     * 体積（容積）３
     * @return The value of the column 'CUBE3'. (basically NotNull if selected: for the constraint)
     */
    public Long getCube3() {
        checkSpecifiedProperty("cube3");
        return _cube3;
    }

    /**
     * [set] CUBE3: {NotNull, bigint(19), default=[(0)]} <br>
     * 体積（容積）３
     * @param cube3 The value of the column 'CUBE3'. (basically NotNull if update: for the constraint)
     */
    public void setCube3(Long cube3) {
        registerModifiedProperty("cube3");
        _cube3 = cube3;
    }

    /**
     * [get] LITER3: {NotNull, bigint(19), default=[(0)]} <br>
     * 内容量３
     * @return The value of the column 'LITER3'. (basically NotNull if selected: for the constraint)
     */
    public Long getLiter3() {
        checkSpecifiedProperty("liter3");
        return _liter3;
    }

    /**
     * [set] LITER3: {NotNull, bigint(19), default=[(0)]} <br>
     * 内容量３
     * @param liter3 The value of the column 'LITER3'. (basically NotNull if update: for the constraint)
     */
    public void setLiter3(Long liter3) {
        registerModifiedProperty("liter3");
        _liter3 = liter3;
    }

    /**
     * [get] P_QTY: {decimal(16, 6), default=[(0)]} <br>
     * 1パレット当ケース数
     * @return The value of the column 'P_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPQty() {
        checkSpecifiedProperty("PQty");
        return _pQty;
    }

    /**
     * [set] P_QTY: {decimal(16, 6), default=[(0)]} <br>
     * 1パレット当ケース数
     * @param pQty The value of the column 'P_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPQty(java.math.BigDecimal pQty) {
        registerModifiedProperty("PQty");
        _pQty = pQty;
    }

    /**
     * [get] P_HEIGHT: {decimal(16, 6), default=[(0)]} <br>
     * パレット積付段数
     * @return The value of the column 'P_HEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPHeight() {
        checkSpecifiedProperty("PHeight");
        return _pHeight;
    }

    /**
     * [set] P_HEIGHT: {decimal(16, 6), default=[(0)]} <br>
     * パレット積付段数
     * @param pHeight The value of the column 'P_HEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPHeight(java.math.BigDecimal pHeight) {
        registerModifiedProperty("PHeight");
        _pHeight = pHeight;
    }

    /**
     * [get] P_ODD: {decimal(16, 6), default=[(0)]} <br>
     * パレット平面積付数量
     * @return The value of the column 'P_ODD'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPOdd() {
        checkSpecifiedProperty("POdd");
        return _pOdd;
    }

    /**
     * [set] P_ODD: {decimal(16, 6), default=[(0)]} <br>
     * パレット平面積付数量
     * @param pOdd The value of the column 'P_ODD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPOdd(java.math.BigDecimal pOdd) {
        registerModifiedProperty("POdd");
        _pOdd = pOdd;
    }

    /**
     * [get] P_DESCRIPTION: {varchar(4000)} <br>
     * パレット積付方法の説明
     * @return The value of the column 'P_DESCRIPTION'. (NullAllowed even if selected: for no constraint)
     */
    public String getPDescription() {
        checkSpecifiedProperty("PDescription");
        return convertEmptyToNull(_pDescription);
    }

    /**
     * [set] P_DESCRIPTION: {varchar(4000)} <br>
     * パレット積付方法の説明
     * @param pDescription The value of the column 'P_DESCRIPTION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPDescription(String pDescription) {
        registerModifiedProperty("PDescription");
        _pDescription = pDescription;
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
     * [get] QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 数量２使用フラグ
     * @return The value of the column 'QTY2USEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getQty2usedflg() {
        checkSpecifiedProperty("qty2usedflg");
        return _qty2usedflg;
    }

    /**
     * [set] QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 数量２使用フラグ
     * @param qty2usedflg The value of the column 'QTY2USEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setQty2usedflg(java.math.BigDecimal qty2usedflg) {
        registerModifiedProperty("qty2usedflg");
        _qty2usedflg = qty2usedflg;
    }

    /**
     * [get] QTY2STYLE: {varchar(60)} <br>
     * 数量２単位
     * @return The value of the column 'QTY2STYLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getQty2style() {
        checkSpecifiedProperty("qty2style");
        return convertEmptyToNull(_qty2style);
    }

    /**
     * [set] QTY2STYLE: {varchar(60)} <br>
     * 数量２単位
     * @param qty2style The value of the column 'QTY2STYLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty2style(String qty2style) {
        registerModifiedProperty("qty2style");
        _qty2style = qty2style;
    }

    /**
     * [get] QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 数量３使用フラグ
     * @return The value of the column 'QTY3USEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getQty3usedflg() {
        checkSpecifiedProperty("qty3usedflg");
        return _qty3usedflg;
    }

    /**
     * [set] QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 数量３使用フラグ
     * @param qty3usedflg The value of the column 'QTY3USEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setQty3usedflg(java.math.BigDecimal qty3usedflg) {
        registerModifiedProperty("qty3usedflg");
        _qty3usedflg = qty3usedflg;
    }

    /**
     * [get] QTY3STYLE: {varchar(60)} <br>
     * 数量３単位
     * @return The value of the column 'QTY3STYLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getQty3style() {
        checkSpecifiedProperty("qty3style");
        return convertEmptyToNull(_qty3style);
    }

    /**
     * [set] QTY3STYLE: {varchar(60)} <br>
     * 数量３単位
     * @param qty3style The value of the column 'QTY3STYLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty3style(String qty3style) {
        registerModifiedProperty("qty3style");
        _qty3style = qty3style;
    }

    /**
     * [get] SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 送信済フラグ
     * @return The value of the column 'SP_CALCFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSpCalcflg() {
        checkSpecifiedProperty("spCalcflg");
        return _spCalcflg;
    }

    /**
     * [set] SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 送信済フラグ
     * @param spCalcflg The value of the column 'SP_CALCFLG'. (basically NotNull if update: for the constraint)
     */
    public void setSpCalcflg(java.math.BigDecimal spCalcflg) {
        registerModifiedProperty("spCalcflg");
        _spCalcflg = spCalcflg;
    }

    /**
     * [get] SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 特殊計算（管理１をする）
     * @return The value of the column 'SP_LOTATRB1USEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSpLotatrb1usedflg() {
        checkSpecifiedProperty("spLotatrb1usedflg");
        return _spLotatrb1usedflg;
    }

    /**
     * [set] SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 特殊計算（管理１をする）
     * @param spLotatrb1usedflg The value of the column 'SP_LOTATRB1USEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setSpLotatrb1usedflg(java.math.BigDecimal spLotatrb1usedflg) {
        registerModifiedProperty("spLotatrb1usedflg");
        _spLotatrb1usedflg = spLotatrb1usedflg;
    }

    /**
     * [get] SP_OPERATOR1: {varchar(30)} <br>
     * 段ボールCD
     * @return The value of the column 'SP_OPERATOR1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpOperator1() {
        checkSpecifiedProperty("spOperator1");
        return convertEmptyToNull(_spOperator1);
    }

    /**
     * [set] SP_OPERATOR1: {varchar(30)} <br>
     * 段ボールCD
     * @param spOperator1 The value of the column 'SP_OPERATOR1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpOperator1(String spOperator1) {
        registerModifiedProperty("spOperator1");
        _spOperator1 = spOperator1;
    }

    /**
     * [get] SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 特殊計算（管理２をする）
     * @return The value of the column 'SP_LOTATRB2USEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSpLotatrb2usedflg() {
        checkSpecifiedProperty("spLotatrb2usedflg");
        return _spLotatrb2usedflg;
    }

    /**
     * [set] SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 特殊計算（管理２をする）
     * @param spLotatrb2usedflg The value of the column 'SP_LOTATRB2USEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setSpLotatrb2usedflg(java.math.BigDecimal spLotatrb2usedflg) {
        registerModifiedProperty("spLotatrb2usedflg");
        _spLotatrb2usedflg = spLotatrb2usedflg;
    }

    /**
     * [get] SP_OPERATOR2: {varchar(30)} <br>
     * 特殊計算演算子２
     * @return The value of the column 'SP_OPERATOR2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpOperator2() {
        checkSpecifiedProperty("spOperator2");
        return convertEmptyToNull(_spOperator2);
    }

    /**
     * [set] SP_OPERATOR2: {varchar(30)} <br>
     * 特殊計算演算子２
     * @param spOperator2 The value of the column 'SP_OPERATOR2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpOperator2(String spOperator2) {
        registerModifiedProperty("spOperator2");
        _spOperator2 = spOperator2;
    }

    /**
     * [get] SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 特殊計算（管理３をする）
     * @return The value of the column 'SP_LOTATRB3USEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSpLotatrb3usedflg() {
        checkSpecifiedProperty("spLotatrb3usedflg");
        return _spLotatrb3usedflg;
    }

    /**
     * [set] SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 特殊計算（管理３をする）
     * @param spLotatrb3usedflg The value of the column 'SP_LOTATRB3USEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setSpLotatrb3usedflg(java.math.BigDecimal spLotatrb3usedflg) {
        registerModifiedProperty("spLotatrb3usedflg");
        _spLotatrb3usedflg = spLotatrb3usedflg;
    }

    /**
     * [get] SP_OPERATOR3: {varchar(30)} <br>
     * 特殊計算演算子３
     * @return The value of the column 'SP_OPERATOR3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpOperator3() {
        checkSpecifiedProperty("spOperator3");
        return convertEmptyToNull(_spOperator3);
    }

    /**
     * [set] SP_OPERATOR3: {varchar(30)} <br>
     * 特殊計算演算子３
     * @param spOperator3 The value of the column 'SP_OPERATOR3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpOperator3(String spOperator3) {
        registerModifiedProperty("spOperator3");
        _spOperator3 = spOperator3;
    }

    /**
     * [get] SP_RATE: {NotNull, bigint(19), default=[(0)]} <br>
     * 特殊計算（率）
     * @return The value of the column 'SP_RATE'. (basically NotNull if selected: for the constraint)
     */
    public Long getSpRate() {
        checkSpecifiedProperty("spRate");
        return _spRate;
    }

    /**
     * [set] SP_RATE: {NotNull, bigint(19), default=[(0)]} <br>
     * 特殊計算（率）
     * @param spRate The value of the column 'SP_RATE'. (basically NotNull if update: for the constraint)
     */
    public void setSpRate(Long spRate) {
        registerModifiedProperty("spRate");
        _spRate = spRate;
    }

    /**
     * [get] LOTATRB1TITLE: {varchar(60)} <br>
     * 庫内作業集約CD
     * @return The value of the column 'LOTATRB1TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotatrb1title() {
        checkSpecifiedProperty("lotatrb1title");
        return convertEmptyToNull(_lotatrb1title);
    }

    /**
     * [set] LOTATRB1TITLE: {varchar(60)} <br>
     * 庫内作業集約CD
     * @param lotatrb1title The value of the column 'LOTATRB1TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotatrb1title(String lotatrb1title) {
        registerModifiedProperty("lotatrb1title");
        _lotatrb1title = lotatrb1title;
    }

    /**
     * [get] LOTATRB2TITLE: {varchar(60)} <br>
     * 管理２タイトル
     * @return The value of the column 'LOTATRB2TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotatrb2title() {
        checkSpecifiedProperty("lotatrb2title");
        return convertEmptyToNull(_lotatrb2title);
    }

    /**
     * [set] LOTATRB2TITLE: {varchar(60)} <br>
     * 管理２タイトル
     * @param lotatrb2title The value of the column 'LOTATRB2TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotatrb2title(String lotatrb2title) {
        registerModifiedProperty("lotatrb2title");
        _lotatrb2title = lotatrb2title;
    }

    /**
     * [get] LOTATRB3TITLE: {varchar(60)} <br>
     * 管理３タイトル
     * @return The value of the column 'LOTATRB3TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotatrb3title() {
        checkSpecifiedProperty("lotatrb3title");
        return convertEmptyToNull(_lotatrb3title);
    }

    /**
     * [set] LOTATRB3TITLE: {varchar(60)} <br>
     * 管理３タイトル
     * @param lotatrb3title The value of the column 'LOTATRB3TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotatrb3title(String lotatrb3title) {
        registerModifiedProperty("lotatrb3title");
        _lotatrb3title = lotatrb3title;
    }

    /**
     * [get] LOTATRB4TITLE: {varchar(60)} <br>
     * 管理４タイトル
     * @return The value of the column 'LOTATRB4TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotatrb4title() {
        checkSpecifiedProperty("lotatrb4title");
        return convertEmptyToNull(_lotatrb4title);
    }

    /**
     * [set] LOTATRB4TITLE: {varchar(60)} <br>
     * 管理４タイトル
     * @param lotatrb4title The value of the column 'LOTATRB4TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotatrb4title(String lotatrb4title) {
        registerModifiedProperty("lotatrb4title");
        _lotatrb4title = lotatrb4title;
    }

    /**
     * [get] LOTATRB5TITLE: {varchar(60)} <br>
     * 管理５タイトル
     * @return The value of the column 'LOTATRB5TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotatrb5title() {
        checkSpecifiedProperty("lotatrb5title");
        return convertEmptyToNull(_lotatrb5title);
    }

    /**
     * [set] LOTATRB5TITLE: {varchar(60)} <br>
     * 管理５タイトル
     * @param lotatrb5title The value of the column 'LOTATRB5TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotatrb5title(String lotatrb5title) {
        registerModifiedProperty("lotatrb5title");
        _lotatrb5title = lotatrb5title;
    }

    /**
     * [get] LOTATRB6TITLE: {varchar(60)} <br>
     * その他属性１タイトル
     * @return The value of the column 'LOTATRB6TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotatrb6title() {
        checkSpecifiedProperty("lotatrb6title");
        return convertEmptyToNull(_lotatrb6title);
    }

    /**
     * [set] LOTATRB6TITLE: {varchar(60)} <br>
     * その他属性１タイトル
     * @param lotatrb6title The value of the column 'LOTATRB6TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotatrb6title(String lotatrb6title) {
        registerModifiedProperty("lotatrb6title");
        _lotatrb6title = lotatrb6title;
    }

    /**
     * [get] LOTATRB7TITLE: {varchar(60)} <br>
     * その他属性２タイトル
     * @return The value of the column 'LOTATRB7TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotatrb7title() {
        checkSpecifiedProperty("lotatrb7title");
        return convertEmptyToNull(_lotatrb7title);
    }

    /**
     * [set] LOTATRB7TITLE: {varchar(60)} <br>
     * その他属性２タイトル
     * @param lotatrb7title The value of the column 'LOTATRB7TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotatrb7title(String lotatrb7title) {
        registerModifiedProperty("lotatrb7title");
        _lotatrb7title = lotatrb7title;
    }

    /**
     * [get] LOTATRB8TITLE: {varchar(60)} <br>
     * その他属性３タイトル
     * @return The value of the column 'LOTATRB8TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotatrb8title() {
        checkSpecifiedProperty("lotatrb8title");
        return convertEmptyToNull(_lotatrb8title);
    }

    /**
     * [set] LOTATRB8TITLE: {varchar(60)} <br>
     * その他属性３タイトル
     * @param lotatrb8title The value of the column 'LOTATRB8TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotatrb8title(String lotatrb8title) {
        registerModifiedProperty("lotatrb8title");
        _lotatrb8title = lotatrb8title;
    }

    /**
     * [get] LOTATRB9TITLE: {varchar(60)} <br>
     * その他属性４タイトル
     * @return The value of the column 'LOTATRB9TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotatrb9title() {
        checkSpecifiedProperty("lotatrb9title");
        return convertEmptyToNull(_lotatrb9title);
    }

    /**
     * [set] LOTATRB9TITLE: {varchar(60)} <br>
     * その他属性４タイトル
     * @param lotatrb9title The value of the column 'LOTATRB9TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotatrb9title(String lotatrb9title) {
        registerModifiedProperty("lotatrb9title");
        _lotatrb9title = lotatrb9title;
    }

    /**
     * [get] LOTATRB10TITLE: {varchar(60)} <br>
     * その他属性５タイトル
     * @return The value of the column 'LOTATRB10TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotatrb10title() {
        checkSpecifiedProperty("lotatrb10title");
        return convertEmptyToNull(_lotatrb10title);
    }

    /**
     * [set] LOTATRB10TITLE: {varchar(60)} <br>
     * その他属性５タイトル
     * @param lotatrb10title The value of the column 'LOTATRB10TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotatrb10title(String lotatrb10title) {
        registerModifiedProperty("lotatrb10title");
        _lotatrb10title = lotatrb10title;
    }

    /**
     * [get] F_USER1: {varchar(30)} <br>
     * 特販業者CD(1)
     * @return The value of the column 'F_USER1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser1() {
        checkSpecifiedProperty("FUser1");
        return convertEmptyToNull(_fUser1);
    }

    /**
     * [set] F_USER1: {varchar(30)} <br>
     * 特販業者CD(1)
     * @param fUser1 The value of the column 'F_USER1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser1(String fUser1) {
        registerModifiedProperty("FUser1");
        _fUser1 = fUser1;
    }

    /**
     * [get] F_USER2: {varchar(30)} <br>
     * 特販業者CD(2)
     * @return The value of the column 'F_USER2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser2() {
        checkSpecifiedProperty("FUser2");
        return convertEmptyToNull(_fUser2);
    }

    /**
     * [set] F_USER2: {varchar(30)} <br>
     * 特販業者CD(2)
     * @param fUser2 The value of the column 'F_USER2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser2(String fUser2) {
        registerModifiedProperty("FUser2");
        _fUser2 = fUser2;
    }

    /**
     * [get] F_USER3: {varchar(30)} <br>
     * 特販業者CD(3)
     * @return The value of the column 'F_USER3'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser3() {
        checkSpecifiedProperty("FUser3");
        return convertEmptyToNull(_fUser3);
    }

    /**
     * [set] F_USER3: {varchar(30)} <br>
     * 特販業者CD(3)
     * @param fUser3 The value of the column 'F_USER3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser3(String fUser3) {
        registerModifiedProperty("FUser3");
        _fUser3 = fUser3;
    }

    /**
     * [get] F_USER4: {varchar(30)} <br>
     * 特販業者CD(4)
     * @return The value of the column 'F_USER4'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser4() {
        checkSpecifiedProperty("FUser4");
        return convertEmptyToNull(_fUser4);
    }

    /**
     * [set] F_USER4: {varchar(30)} <br>
     * 特販業者CD(4)
     * @param fUser4 The value of the column 'F_USER4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser4(String fUser4) {
        registerModifiedProperty("FUser4");
        _fUser4 = fUser4;
    }

    /**
     * [get] F_USER5: {varchar(30)} <br>
     * 特販業者CD(5)
     * @return The value of the column 'F_USER5'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser5() {
        checkSpecifiedProperty("FUser5");
        return convertEmptyToNull(_fUser5);
    }

    /**
     * [set] F_USER5: {varchar(30)} <br>
     * 特販業者CD(5)
     * @param fUser5 The value of the column 'F_USER5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser5(String fUser5) {
        registerModifiedProperty("FUser5");
        _fUser5 = fUser5;
    }

    /**
     * [get] ITEM40: {decimal(16, 6), default=[(0)]} <br>
     * ４０銘柄CD
     * @return The value of the column 'ITEM40'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getItem40() {
        checkSpecifiedProperty("item40");
        return _item40;
    }

    /**
     * [set] ITEM40: {decimal(16, 6), default=[(0)]} <br>
     * ４０銘柄CD
     * @param item40 The value of the column 'ITEM40'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItem40(java.math.BigDecimal item40) {
        registerModifiedProperty("item40");
        _item40 = item40;
    }

    /**
     * [get] PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]} <br>
     * 寄託価格
     * @return The value of the column 'PRICE_INSURANCE'. (basically NotNull if selected: for the constraint)
     */
    public Long getPriceInsurance() {
        checkSpecifiedProperty("priceInsurance");
        return _priceInsurance;
    }

    /**
     * [set] PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]} <br>
     * 寄託価格
     * @param priceInsurance The value of the column 'PRICE_INSURANCE'. (basically NotNull if update: for the constraint)
     */
    public void setPriceInsurance(Long priceInsurance) {
        registerModifiedProperty("priceInsurance");
        _priceInsurance = priceInsurance;
    }

    /**
     * [get] LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 賞味期限日数
     * @return The value of the column 'LIMITDAY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getLimitday() {
        checkSpecifiedProperty("limitday");
        return _limitday;
    }

    /**
     * [set] LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 賞味期限日数
     * @param limitday The value of the column 'LIMITDAY'. (basically NotNull if update: for the constraint)
     */
    public void setLimitday(java.math.BigDecimal limitday) {
        registerModifiedProperty("limitday");
        _limitday = limitday;
    }

    /**
     * [get] DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]} <br>
     * 納品許容日数
     * @return The value of the column 'DELIVERABLEDAY'. (basically NotNull if selected: for the constraint)
     */
    public Long getDeliverableday() {
        checkSpecifiedProperty("deliverableday");
        return _deliverableday;
    }

    /**
     * [set] DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]} <br>
     * 納品許容日数
     * @param deliverableday The value of the column 'DELIVERABLEDAY'. (basically NotNull if update: for the constraint)
     */
    public void setDeliverableday(Long deliverableday) {
        registerModifiedProperty("deliverableday");
        _deliverableday = deliverableday;
    }

    /**
     * [get] PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 印字日付（管理日）フラグ
     * @return The value of the column 'PRINTDATEFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPrintdateflg() {
        checkSpecifiedProperty("printdateflg");
        return _printdateflg;
    }

    /**
     * [set] PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 印字日付（管理日）フラグ
     * @param printdateflg The value of the column 'PRINTDATEFLG'. (basically NotNull if update: for the constraint)
     */
    public void setPrintdateflg(java.math.BigDecimal printdateflg) {
        registerModifiedProperty("printdateflg");
        _printdateflg = printdateflg;
    }

    /**
     * [get] SUPPLIERCD: {varchar(30)} <br>
     * 取引先（調達先）CD
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSuppliercd() {
        checkSpecifiedProperty("suppliercd");
        return convertEmptyToNull(_suppliercd);
    }

    /**
     * [set] SUPPLIERCD: {varchar(30)} <br>
     * 取引先（調達先）CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuppliercd(String suppliercd) {
        registerModifiedProperty("suppliercd");
        _suppliercd = suppliercd;
    }

    /**
     * [get] DISPATCHQTYTYPE: {varchar(30)} <br>
     * ITMS配車数量タイプ
     * @return The value of the column 'DISPATCHQTYTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDispatchqtytype() {
        checkSpecifiedProperty("dispatchqtytype");
        return convertEmptyToNull(_dispatchqtytype);
    }

    /**
     * [set] DISPATCHQTYTYPE: {varchar(30)} <br>
     * ITMS配車数量タイプ
     * @param dispatchqtytype The value of the column 'DISPATCHQTYTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDispatchqtytype(String dispatchqtytype) {
        registerModifiedProperty("dispatchqtytype");
        _dispatchqtytype = dispatchqtytype;
    }

    /**
     * [get] TARIFFQTYTYPE: {varchar(30)} <br>
     * 運用区分
     * @return The value of the column 'TARIFFQTYTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTariffqtytype() {
        checkSpecifiedProperty("tariffqtytype");
        return convertEmptyToNull(_tariffqtytype);
    }

    /**
     * [set] TARIFFQTYTYPE: {varchar(30)} <br>
     * 運用区分
     * @param tariffqtytype The value of the column 'TARIFFQTYTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTariffqtytype(String tariffqtytype) {
        registerModifiedProperty("tariffqtytype");
        _tariffqtytype = tariffqtytype;
    }

    /**
     * [get] USERUSE1: {varchar(60)} <br>
     * メーカー・CD
     * @return The value of the column 'USERUSE1'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse1() {
        checkSpecifiedProperty("useruse1");
        return convertEmptyToNull(_useruse1);
    }

    /**
     * [set] USERUSE1: {varchar(60)} <br>
     * メーカー・CD
     * @param useruse1 The value of the column 'USERUSE1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse1(String useruse1) {
        registerModifiedProperty("useruse1");
        _useruse1 = useruse1;
    }

    /**
     * [get] USERUSE2: {varchar(60)} <br>
     * 国CD
     * @return The value of the column 'USERUSE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse2() {
        checkSpecifiedProperty("useruse2");
        return convertEmptyToNull(_useruse2);
    }

    /**
     * [set] USERUSE2: {varchar(60)} <br>
     * 国CD
     * @param useruse2 The value of the column 'USERUSE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse2(String useruse2) {
        registerModifiedProperty("useruse2");
        _useruse2 = useruse2;
    }

    /**
     * [get] USERUSE3: {varchar(60)} <br>
     * レコード更新処理区分
     * @return The value of the column 'USERUSE3'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse3() {
        checkSpecifiedProperty("useruse3");
        return convertEmptyToNull(_useruse3);
    }

    /**
     * [set] USERUSE3: {varchar(60)} <br>
     * レコード更新処理区分
     * @param useruse3 The value of the column 'USERUSE3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse3(String useruse3) {
        registerModifiedProperty("useruse3");
        _useruse3 = useruse3;
    }

    /**
     * [get] USERUSE4: {varchar(60)} <br>
     * 親銘柄CD
     * @return The value of the column 'USERUSE4'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse4() {
        checkSpecifiedProperty("useruse4");
        return convertEmptyToNull(_useruse4);
    }

    /**
     * [set] USERUSE4: {varchar(60)} <br>
     * 親銘柄CD
     * @param useruse4 The value of the column 'USERUSE4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse4(String useruse4) {
        registerModifiedProperty("useruse4");
        _useruse4 = useruse4;
    }

    /**
     * [get] USERUSE5: {varchar(60)} <br>
     * 出納用銘柄CD
     * @return The value of the column 'USERUSE5'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse5() {
        checkSpecifiedProperty("useruse5");
        return convertEmptyToNull(_useruse5);
    }

    /**
     * [set] USERUSE5: {varchar(60)} <br>
     * 出納用銘柄CD
     * @param useruse5 The value of the column 'USERUSE5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse5(String useruse5) {
        registerModifiedProperty("useruse5");
        _useruse5 = useruse5;
    }

    /**
     * [get] LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理１必須フラグ
     * @return The value of the column 'LOT1NULLFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getLot1nullflg() {
        checkSpecifiedProperty("lot1nullflg");
        return _lot1nullflg;
    }

    /**
     * [set] LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理１必須フラグ
     * @param lot1nullflg The value of the column 'LOT1NULLFLG'. (basically NotNull if update: for the constraint)
     */
    public void setLot1nullflg(java.math.BigDecimal lot1nullflg) {
        registerModifiedProperty("lot1nullflg");
        _lot1nullflg = lot1nullflg;
    }

    /**
     * [get] LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理２必須フラグ
     * @return The value of the column 'LOT2NULLFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getLot2nullflg() {
        checkSpecifiedProperty("lot2nullflg");
        return _lot2nullflg;
    }

    /**
     * [set] LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理２必須フラグ
     * @param lot2nullflg The value of the column 'LOT2NULLFLG'. (basically NotNull if update: for the constraint)
     */
    public void setLot2nullflg(java.math.BigDecimal lot2nullflg) {
        registerModifiedProperty("lot2nullflg");
        _lot2nullflg = lot2nullflg;
    }

    /**
     * [get] LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理３必須フラグ
     * @return The value of the column 'LOT3NULLFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getLot3nullflg() {
        checkSpecifiedProperty("lot3nullflg");
        return _lot3nullflg;
    }

    /**
     * [set] LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理３必須フラグ
     * @param lot3nullflg The value of the column 'LOT3NULLFLG'. (basically NotNull if update: for the constraint)
     */
    public void setLot3nullflg(java.math.BigDecimal lot3nullflg) {
        registerModifiedProperty("lot3nullflg");
        _lot3nullflg = lot3nullflg;
    }

    /**
     * [get] LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理４必須フラグ
     * @return The value of the column 'LOT4NULLFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getLot4nullflg() {
        checkSpecifiedProperty("lot4nullflg");
        return _lot4nullflg;
    }

    /**
     * [set] LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理４必須フラグ
     * @param lot4nullflg The value of the column 'LOT4NULLFLG'. (basically NotNull if update: for the constraint)
     */
    public void setLot4nullflg(java.math.BigDecimal lot4nullflg) {
        registerModifiedProperty("lot4nullflg");
        _lot4nullflg = lot4nullflg;
    }

    /**
     * [get] LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理５必須フラグ
     * @return The value of the column 'LOT5NULLFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getLot5nullflg() {
        checkSpecifiedProperty("lot5nullflg");
        return _lot5nullflg;
    }

    /**
     * [set] LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 管理５必須フラグ
     * @param lot5nullflg The value of the column 'LOT5NULLFLG'. (basically NotNull if update: for the constraint)
     */
    public void setLot5nullflg(java.math.BigDecimal lot5nullflg) {
        registerModifiedProperty("lot5nullflg");
        _lot5nullflg = lot5nullflg;
    }

    /**
     * [get] OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性１必須フラグ
     * @return The value of the column 'OTHERLOT1NULLFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getOtherlot1nullflg() {
        checkSpecifiedProperty("otherlot1nullflg");
        return _otherlot1nullflg;
    }

    /**
     * [set] OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性１必須フラグ
     * @param otherlot1nullflg The value of the column 'OTHERLOT1NULLFLG'. (basically NotNull if update: for the constraint)
     */
    public void setOtherlot1nullflg(java.math.BigDecimal otherlot1nullflg) {
        registerModifiedProperty("otherlot1nullflg");
        _otherlot1nullflg = otherlot1nullflg;
    }

    /**
     * [get] OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性２必須フラグ
     * @return The value of the column 'OTHERLOT2NULLFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getOtherlot2nullflg() {
        checkSpecifiedProperty("otherlot2nullflg");
        return _otherlot2nullflg;
    }

    /**
     * [set] OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性２必須フラグ
     * @param otherlot2nullflg The value of the column 'OTHERLOT2NULLFLG'. (basically NotNull if update: for the constraint)
     */
    public void setOtherlot2nullflg(java.math.BigDecimal otherlot2nullflg) {
        registerModifiedProperty("otherlot2nullflg");
        _otherlot2nullflg = otherlot2nullflg;
    }

    /**
     * [get] OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性３必須フラグ
     * @return The value of the column 'OTHERLOT3NULLFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getOtherlot3nullflg() {
        checkSpecifiedProperty("otherlot3nullflg");
        return _otherlot3nullflg;
    }

    /**
     * [set] OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性３必須フラグ
     * @param otherlot3nullflg The value of the column 'OTHERLOT3NULLFLG'. (basically NotNull if update: for the constraint)
     */
    public void setOtherlot3nullflg(java.math.BigDecimal otherlot3nullflg) {
        registerModifiedProperty("otherlot3nullflg");
        _otherlot3nullflg = otherlot3nullflg;
    }

    /**
     * [get] OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性４必須フラグ
     * @return The value of the column 'OTHERLOT4NULLFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getOtherlot4nullflg() {
        checkSpecifiedProperty("otherlot4nullflg");
        return _otherlot4nullflg;
    }

    /**
     * [set] OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性４必須フラグ
     * @param otherlot4nullflg The value of the column 'OTHERLOT4NULLFLG'. (basically NotNull if update: for the constraint)
     */
    public void setOtherlot4nullflg(java.math.BigDecimal otherlot4nullflg) {
        registerModifiedProperty("otherlot4nullflg");
        _otherlot4nullflg = otherlot4nullflg;
    }

    /**
     * [get] OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性５必須フラグ
     * @return The value of the column 'OTHERLOT5NULLFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getOtherlot5nullflg() {
        checkSpecifiedProperty("otherlot5nullflg");
        return _otherlot5nullflg;
    }

    /**
     * [set] OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * その他属性５必須フラグ
     * @param otherlot5nullflg The value of the column 'OTHERLOT5NULLFLG'. (basically NotNull if update: for the constraint)
     */
    public void setOtherlot5nullflg(java.math.BigDecimal otherlot5nullflg) {
        registerModifiedProperty("otherlot5nullflg");
        _otherlot5nullflg = otherlot5nullflg;
    }

    /**
     * [get] ITEMPRINTNAME: {varchar(255)} <br>
     * 銘柄表示（印刷）名称
     * @return The value of the column 'ITEMPRINTNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemprintname() {
        checkSpecifiedProperty("itemprintname");
        return convertEmptyToNull(_itemprintname);
    }

    /**
     * [set] ITEMPRINTNAME: {varchar(255)} <br>
     * 銘柄表示（印刷）名称
     * @param itemprintname The value of the column 'ITEMPRINTNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemprintname(String itemprintname) {
        registerModifiedProperty("itemprintname");
        _itemprintname = itemprintname;
    }

    /**
     * [get] PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 銘柄単価設定レベル
     * @return The value of the column 'PRICELEVEL'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPricelevel() {
        checkSpecifiedProperty("pricelevel");
        return _pricelevel;
    }

    /**
     * [set] PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 銘柄単価設定レベル
     * @param pricelevel The value of the column 'PRICELEVEL'. (basically NotNull if update: for the constraint)
     */
    public void setPricelevel(java.math.BigDecimal pricelevel) {
        registerModifiedProperty("pricelevel");
        _pricelevel = pricelevel;
    }

    /**
     * [get] ITEMCATALOGURL: {varchar(255)} <br>
     * 銘柄紹介URL
     * @return The value of the column 'ITEMCATALOGURL'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcatalogurl() {
        checkSpecifiedProperty("itemcatalogurl");
        return convertEmptyToNull(_itemcatalogurl);
    }

    /**
     * [set] ITEMCATALOGURL: {varchar(255)} <br>
     * 銘柄紹介URL
     * @param itemcatalogurl The value of the column 'ITEMCATALOGURL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcatalogurl(String itemcatalogurl) {
        registerModifiedProperty("itemcatalogurl");
        _itemcatalogurl = itemcatalogurl;
    }

    /**
     * [get] USERNUM1: {bigint(19), default=[(0)]} <br>
     * 国産・輸入区分
     * @return The value of the column 'USERNUM1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsernum1() {
        checkSpecifiedProperty("usernum1");
        return _usernum1;
    }

    /**
     * [set] USERNUM1: {bigint(19), default=[(0)]} <br>
     * 国産・輸入区分
     * @param usernum1 The value of the column 'USERNUM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum1(Long usernum1) {
        registerModifiedProperty("usernum1");
        _usernum1 = usernum1;
    }

    /**
     * [get] USERNUM2: {bigint(19), default=[(0)]} <br>
     * カートン形状
     * @return The value of the column 'USERNUM2'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsernum2() {
        checkSpecifiedProperty("usernum2");
        return _usernum2;
    }

    /**
     * [set] USERNUM2: {bigint(19), default=[(0)]} <br>
     * カートン形状
     * @param usernum2 The value of the column 'USERNUM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum2(Long usernum2) {
        registerModifiedProperty("usernum2");
        _usernum2 = usernum2;
    }

    /**
     * [get] USERNUM3: {bigint(19), default=[(0)]} <br>
     * 一般出力順
     * @return The value of the column 'USERNUM3'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsernum3() {
        checkSpecifiedProperty("usernum3");
        return _usernum3;
    }

    /**
     * [set] USERNUM3: {bigint(19), default=[(0)]} <br>
     * 一般出力順
     * @param usernum3 The value of the column 'USERNUM3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum3(Long usernum3) {
        registerModifiedProperty("usernum3");
        _usernum3 = usernum3;
    }

    /**
     * [get] USERNUM4: {bigint(19), default=[(0)]} <br>
     * CAP銘柄区分
     * @return The value of the column 'USERNUM4'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsernum4() {
        checkSpecifiedProperty("usernum4");
        return _usernum4;
    }

    /**
     * [set] USERNUM4: {bigint(19), default=[(0)]} <br>
     * CAP銘柄区分
     * @param usernum4 The value of the column 'USERNUM4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum4(Long usernum4) {
        registerModifiedProperty("usernum4");
        _usernum4 = usernum4;
    }

    /**
     * [get] USERNUM5: {bigint(19), default=[(0)]} <br>
     * 製品包装形態
     * @return The value of the column 'USERNUM5'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsernum5() {
        checkSpecifiedProperty("usernum5");
        return _usernum5;
    }

    /**
     * [set] USERNUM5: {bigint(19), default=[(0)]} <br>
     * 製品包装形態
     * @param usernum5 The value of the column 'USERNUM5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum5(Long usernum5) {
        registerModifiedProperty("usernum5");
        _usernum5 = usernum5;
    }

    /**
     * [get] USERDATE1: {varchar(8)} <br>
     * 適用開始年月日
     * @return The value of the column 'USERDATE1'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserdate1() {
        checkSpecifiedProperty("userdate1");
        return convertEmptyToNull(_userdate1);
    }

    /**
     * [set] USERDATE1: {varchar(8)} <br>
     * 適用開始年月日
     * @param userdate1 The value of the column 'USERDATE1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserdate1(String userdate1) {
        registerModifiedProperty("userdate1");
        _userdate1 = userdate1;
    }

    /**
     * [get] USERDATE2: {varchar(8)} <br>
     * 適用終了年月日
     * @return The value of the column 'USERDATE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserdate2() {
        checkSpecifiedProperty("userdate2");
        return convertEmptyToNull(_userdate2);
    }

    /**
     * [set] USERDATE2: {varchar(8)} <br>
     * 適用終了年月日
     * @param userdate2 The value of the column 'USERDATE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserdate2(String userdate2) {
        registerModifiedProperty("userdate2");
        _userdate2 = userdate2;
    }

    /**
     * [get] USERDATE3: {varchar(8)} <br>
     * 廃止年月日
     * @return The value of the column 'USERDATE3'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserdate3() {
        checkSpecifiedProperty("userdate3");
        return convertEmptyToNull(_userdate3);
    }

    /**
     * [set] USERDATE3: {varchar(8)} <br>
     * 廃止年月日
     * @param userdate3 The value of the column 'USERDATE3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserdate3(String userdate3) {
        registerModifiedProperty("userdate3");
        _userdate3 = userdate3;
    }

    /**
     * [get] USERDATE4: {varchar(8)} <br>
     * 取扱中止年月日
     * @return The value of the column 'USERDATE4'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserdate4() {
        checkSpecifiedProperty("userdate4");
        return convertEmptyToNull(_userdate4);
    }

    /**
     * [set] USERDATE4: {varchar(8)} <br>
     * 取扱中止年月日
     * @param userdate4 The value of the column 'USERDATE4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserdate4(String userdate4) {
        registerModifiedProperty("userdate4");
        _userdate4 = userdate4;
    }

    /**
     * [get] USERDATE5: {varchar(8)} <br>
     * 発売年月日
     * @return The value of the column 'USERDATE5'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserdate5() {
        checkSpecifiedProperty("userdate5");
        return convertEmptyToNull(_userdate5);
    }

    /**
     * [set] USERDATE5: {varchar(8)} <br>
     * 発売年月日
     * @param userdate5 The value of the column 'USERDATE5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserdate5(String userdate5) {
        registerModifiedProperty("userdate5");
        _userdate5 = userdate5;
    }

    /**
     * [get] CGGDID: {varchar(30)} <br>
     * たばこ・商品区分
     * @return The value of the column 'CGGDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCggdid() {
        checkSpecifiedProperty("cggdid");
        return convertEmptyToNull(_cggdid);
    }

    /**
     * [set] CGGDID: {varchar(30)} <br>
     * たばこ・商品区分
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCggdid(String cggdid) {
        registerModifiedProperty("cggdid");
        _cggdid = cggdid;
    }

    /**
     * [get] BRCTG: {NotNull, bigint(19), default=[(0)]} <br>
     * 銘柄カテゴリ
     * @return The value of the column 'BRCTG'. (basically NotNull if selected: for the constraint)
     */
    public Long getBrctg() {
        checkSpecifiedProperty("brctg");
        return _brctg;
    }

    /**
     * [set] BRCTG: {NotNull, bigint(19), default=[(0)]} <br>
     * 銘柄カテゴリ
     * @param brctg The value of the column 'BRCTG'. (basically NotNull if update: for the constraint)
     */
    public void setBrctg(Long brctg) {
        registerModifiedProperty("brctg");
        _brctg = brctg;
    }

    /**
     * [get] CTWEIGHT: {bigint(19)} <br>
     * カートン重量(g)
     * @return The value of the column 'CTWEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCtweight() {
        checkSpecifiedProperty("ctweight");
        return _ctweight;
    }

    /**
     * [set] CTWEIGHT: {bigint(19)} <br>
     * カートン重量(g)
     * @param ctweight The value of the column 'CTWEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtweight(Long ctweight) {
        registerModifiedProperty("ctweight");
        _ctweight = ctweight;
    }

    /**
     * [get] BXOSZL: {bigint(19)} <br>
     * 段ボール(外寸)(L)
     * @return The value of the column 'BXOSZL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBxoszl() {
        checkSpecifiedProperty("bxoszl");
        return _bxoszl;
    }

    /**
     * [set] BXOSZL: {bigint(19)} <br>
     * 段ボール(外寸)(L)
     * @param bxoszl The value of the column 'BXOSZL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxoszl(Long bxoszl) {
        registerModifiedProperty("bxoszl");
        _bxoszl = bxoszl;
    }

    /**
     * [get] BXOSZW: {bigint(19)} <br>
     * 段ボール(外寸)(W)
     * @return The value of the column 'BXOSZW'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBxoszw() {
        checkSpecifiedProperty("bxoszw");
        return _bxoszw;
    }

    /**
     * [set] BXOSZW: {bigint(19)} <br>
     * 段ボール(外寸)(W)
     * @param bxoszw The value of the column 'BXOSZW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxoszw(Long bxoszw) {
        registerModifiedProperty("bxoszw");
        _bxoszw = bxoszw;
    }

    /**
     * [get] BXOSZH: {bigint(19)} <br>
     * 段ボール(外寸)(H)
     * @return The value of the column 'BXOSZH'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBxoszh() {
        checkSpecifiedProperty("bxoszh");
        return _bxoszh;
    }

    /**
     * [set] BXOSZH: {bigint(19)} <br>
     * 段ボール(外寸)(H)
     * @param bxoszh The value of the column 'BXOSZH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxoszh(Long bxoszh) {
        registerModifiedProperty("bxoszh");
        _bxoszh = bxoszh;
    }

    /**
     * [get] BXCPY: {bigint(19)} <br>
     * 段ボール(外寸)体積(cm³)
     * @return The value of the column 'BXCPY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBxcpy() {
        checkSpecifiedProperty("bxcpy");
        return _bxcpy;
    }

    /**
     * [set] BXCPY: {bigint(19)} <br>
     * 段ボール(外寸)体積(cm³)
     * @param bxcpy The value of the column 'BXCPY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxcpy(Long bxcpy) {
        registerModifiedProperty("bxcpy");
        _bxcpy = bxcpy;
    }

    /**
     * [get] BXWEIGHT: {bigint(19)} <br>
     * 段ボール(外寸)重量(g)
     * @return The value of the column 'BXWEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBxweight() {
        checkSpecifiedProperty("bxweight");
        return _bxweight;
    }

    /**
     * [set] BXWEIGHT: {bigint(19)} <br>
     * 段ボール(外寸)重量(g)
     * @param bxweight The value of the column 'BXWEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxweight(Long bxweight) {
        registerModifiedProperty("bxweight");
        _bxweight = bxweight;
    }

    /**
     * [get] ITEM_ADMIN: {NotNull, varchar(255)} <br>
     * 銘柄管理社
     * @return The value of the column 'ITEM_ADMIN'. (basically NotNull if selected: for the constraint)
     */
    public String getItemAdmin() {
        checkSpecifiedProperty("itemAdmin");
        return convertEmptyToNull(_itemAdmin);
    }

    /**
     * [set] ITEM_ADMIN: {NotNull, varchar(255)} <br>
     * 銘柄管理社
     * @param itemAdmin The value of the column 'ITEM_ADMIN'. (basically NotNull if update: for the constraint)
     */
    public void setItemAdmin(String itemAdmin) {
        registerModifiedProperty("itemAdmin");
        _itemAdmin = itemAdmin;
    }

    /**
     * [get] SNAME: {varchar(60)} <br>
     * 銘柄名正称(全角)
     * @return The value of the column 'SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSname() {
        checkSpecifiedProperty("sname");
        return convertEmptyToNull(_sname);
    }

    /**
     * [set] SNAME: {varchar(60)} <br>
     * 銘柄名正称(全角)
     * @param sname The value of the column 'SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSname(String sname) {
        registerModifiedProperty("sname");
        _sname = sname;
    }

    /**
     * [get] FractionPieceWeight: {decimal(16, 6)} <br>
     * 端数有り個数重量
     * @return The value of the column 'FractionPieceWeight'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getFractionpieceweight() {
        checkSpecifiedProperty("fractionpieceweight");
        return _fractionpieceweight;
    }

    /**
     * [set] FractionPieceWeight: {decimal(16, 6)} <br>
     * 端数有り個数重量
     * @param fractionpieceweight The value of the column 'FractionPieceWeight'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFractionpieceweight(java.math.BigDecimal fractionpieceweight) {
        registerModifiedProperty("fractionpieceweight");
        _fractionpieceweight = fractionpieceweight;
    }

    /**
     * [get] TaxEquivalentNumber: {decimal(16, 6)} <br>
     * たばこ税換算本数
     * @return The value of the column 'TaxEquivalentNumber'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTaxequivalentnumber() {
        checkSpecifiedProperty("taxequivalentnumber");
        return _taxequivalentnumber;
    }

    /**
     * [set] TaxEquivalentNumber: {decimal(16, 6)} <br>
     * たばこ税換算本数
     * @param taxequivalentnumber The value of the column 'TaxEquivalentNumber'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTaxequivalentnumber(java.math.BigDecimal taxequivalentnumber) {
        registerModifiedProperty("taxequivalentnumber");
        _taxequivalentnumber = taxequivalentnumber;
    }

    /**
     * [get] SYHNKBNJT: {varchar(30)} <br>
     * ＪＴ輸入使用区分
     * @return The value of the column 'SYHNKBNJT'. (NullAllowed even if selected: for no constraint)
     */
    public String getSyhnkbnjt() {
        checkSpecifiedProperty("syhnkbnjt");
        return convertEmptyToNull(_syhnkbnjt);
    }

    /**
     * [set] SYHNKBNJT: {varchar(30)} <br>
     * ＪＴ輸入使用区分
     * @param syhnkbnjt The value of the column 'SYHNKBNJT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSyhnkbnjt(String syhnkbnjt) {
        registerModifiedProperty("syhnkbnjt");
        _syhnkbnjt = syhnkbnjt;
    }

    /**
     * [get] IOID_CLS: {varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'IOID_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getIoidCls() {
        checkSpecifiedProperty("ioidCls");
        return convertEmptyToNull(_ioidCls);
    }

    /**
     * [set] IOID_CLS: {varchar(30)} <br>
     * 内外区分
     * @param ioidCls The value of the column 'IOID_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIoidCls(String ioidCls) {
        registerModifiedProperty("ioidCls");
        _ioidCls = ioidCls;
    }

    /**
     * [get] ITFCD_CLS: {varchar(30)} <br>
     * カートンバーコード区分
     * @return The value of the column 'ITFCD_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getItfcdCls() {
        checkSpecifiedProperty("itfcdCls");
        return convertEmptyToNull(_itfcdCls);
    }

    /**
     * [set] ITFCD_CLS: {varchar(30)} <br>
     * カートンバーコード区分
     * @param itfcdCls The value of the column 'ITFCD_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItfcdCls(String itfcdCls) {
        registerModifiedProperty("itfcdCls");
        _itfcdCls = itfcdCls;
    }

    /**
     * [get] MANUITEMCD_CLS: {varchar(30)} <br>
     * 段ボールバーコード区分
     * @return The value of the column 'MANUITEMCD_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getManuitemcdCls() {
        checkSpecifiedProperty("manuitemcdCls");
        return convertEmptyToNull(_manuitemcdCls);
    }

    /**
     * [set] MANUITEMCD_CLS: {varchar(30)} <br>
     * 段ボールバーコード区分
     * @param manuitemcdCls The value of the column 'MANUITEMCD_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManuitemcdCls(String manuitemcdCls) {
        registerModifiedProperty("manuitemcdCls");
        _manuitemcdCls = manuitemcdCls;
    }

    /**
     * [get] CTCPY: {bigint(19)} <br>
     * カートン体積(cm³)
     * @return The value of the column 'CTCPY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCtcpy() {
        checkSpecifiedProperty("ctcpy");
        return _ctcpy;
    }

    /**
     * [set] CTCPY: {bigint(19)} <br>
     * カートン体積(cm³)
     * @param ctcpy The value of the column 'CTCPY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtcpy(Long ctcpy) {
        registerModifiedProperty("ctcpy");
        _ctcpy = ctcpy;
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
