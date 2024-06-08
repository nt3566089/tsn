package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of M_PRODUCT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MProductDbm _instance = new MProductDbm();
    private MProductDbm() {}
    public static MProductDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((MProduct)et).getProductId(), (et, vl) -> ((MProduct)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((MProduct)et).getClientId(), (et, vl) -> ((MProduct)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((MProduct)et).getProductCd(), (et, vl) -> ((MProduct)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((MProduct)et).getProductNm(), (et, vl) -> ((MProduct)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((MProduct)et).getProductAbbr(), (et, vl) -> ((MProduct)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((MProduct)et).getJanCd(), (et, vl) -> ((MProduct)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((MProduct)et).getLotManagFlg(), (et, vl) -> ((MProduct)et).setLotManagFlg((String)vl), "lotManagFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getLimitDtManagFlg(), (et, vl) -> ((MProduct)et).setLimitDtManagFlg((String)vl), "limitDtManagFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getReceiveLimitNum(), (et, vl) -> ((MProduct)et).setReceiveLimitNum(ctl(vl)), "receiveLimitNum");
        setupEpg(_epgMap, et -> ((MProduct)et).getShippingLimitNum(), (et, vl) -> ((MProduct)et).setShippingLimitNum(ctl(vl)), "shippingLimitNum");
        setupEpg(_epgMap, et -> ((MProduct)et).getMergeCls(), (et, vl) -> ((MProduct)et).setMergeCls((String)vl), "mergeCls");
        setupEpg(_epgMap, et -> ((MProduct)et).getLotReverseFlg(), (et, vl) -> ((MProduct)et).setLotReverseFlg((String)vl), "lotReverseFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getLimitDtReverseFlg(), (et, vl) -> ((MProduct)et).setLimitDtReverseFlg((String)vl), "limitDtReverseFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getShippingStopFlg(), (et, vl) -> ((MProduct)et).setShippingStopFlg((String)vl), "shippingStopFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getFixedPoint(), (et, vl) -> ((MProduct)et).setFixedPoint(ctb(vl)), "fixedPoint");
        setupEpg(_epgMap, et -> ((MProduct)et).getShapeGrpId(), (et, vl) -> ((MProduct)et).setShapeGrpId(ctl(vl)), "shapeGrpId");
        setupEpg(_epgMap, et -> ((MProduct)et).getNmfcCode(), (et, vl) -> ((MProduct)et).setNmfcCode((String)vl), "nmfcCode");
        setupEpg(_epgMap, et -> ((MProduct)et).getFreightCls(), (et, vl) -> ((MProduct)et).setFreightCls((String)vl), "freightCls");
        setupEpg(_epgMap, et -> ((MProduct)et).getCounntryOfOrigin(), (et, vl) -> ((MProduct)et).setCounntryOfOrigin((String)vl), "counntryOfOrigin");
        setupEpg(_epgMap, et -> ((MProduct)et).getUnitVal(), (et, vl) -> ((MProduct)et).setUnitVal(ctb(vl)), "unitVal");
        setupEpg(_epgMap, et -> ((MProduct)et).getHtsCd(), (et, vl) -> ((MProduct)et).setHtsCd((String)vl), "htsCd");
        setupEpg(_epgMap, et -> ((MProduct)et).getItemgroup(), (et, vl) -> ((MProduct)et).setItemgroup((String)vl), "itemgroup");
        setupEpg(_epgMap, et -> ((MProduct)et).getActflg(), (et, vl) -> ((MProduct)et).setActflg(ctb(vl)), "actflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getInvtype(), (et, vl) -> ((MProduct)et).setInvtype((String)vl), "invtype");
        setupEpg(_epgMap, et -> ((MProduct)et).getSetitemflg(), (et, vl) -> ((MProduct)et).setSetitemflg(ctb(vl)), "setitemflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getOwneritemcd(), (et, vl) -> ((MProduct)et).setOwneritemcd((String)vl), "owneritemcd");
        setupEpg(_epgMap, et -> ((MProduct)et).getSupplieritemcd(), (et, vl) -> ((MProduct)et).setSupplieritemcd((String)vl), "supplieritemcd");
        setupEpg(_epgMap, et -> ((MProduct)et).getPositemcd(), (et, vl) -> ((MProduct)et).setPositemcd((String)vl), "positemcd");
        setupEpg(_epgMap, et -> ((MProduct)et).getItfcd(), (et, vl) -> ((MProduct)et).setItfcd((String)vl), "itfcd");
        setupEpg(_epgMap, et -> ((MProduct)et).getManuitemcd(), (et, vl) -> ((MProduct)et).setManuitemcd((String)vl), "manuitemcd");
        setupEpg(_epgMap, et -> ((MProduct)et).getPriceBuy(), (et, vl) -> ((MProduct)et).setPriceBuy(ctl(vl)), "priceBuy");
        setupEpg(_epgMap, et -> ((MProduct)et).getPriceWholesale(), (et, vl) -> ((MProduct)et).setPriceWholesale(ctl(vl)), "priceWholesale");
        setupEpg(_epgMap, et -> ((MProduct)et).getPriceSale(), (et, vl) -> ((MProduct)et).setPriceSale(ctl(vl)), "priceSale");
        setupEpg(_epgMap, et -> ((MProduct)et).getAllocpolicykey(), (et, vl) -> ((MProduct)et).setAllocpolicykey(ctb(vl)), "allocpolicykey");
        setupEpg(_epgMap, et -> ((MProduct)et).getSlotpolicykey(), (et, vl) -> ((MProduct)et).setSlotpolicykey(ctb(vl)), "slotpolicykey");
        setupEpg(_epgMap, et -> ((MProduct)et).getInworkingkey(), (et, vl) -> ((MProduct)et).setInworkingkey(ctb(vl)), "inworkingkey");
        setupEpg(_epgMap, et -> ((MProduct)et).getOutworkingkey(), (et, vl) -> ((MProduct)et).setOutworkingkey(ctb(vl)), "outworkingkey");
        setupEpg(_epgMap, et -> ((MProduct)et).getAbctype(), (et, vl) -> ((MProduct)et).setAbctype((String)vl), "abctype");
        setupEpg(_epgMap, et -> ((MProduct)et).getQty1type(), (et, vl) -> ((MProduct)et).setQty1type(ctb(vl)), "qty1type");
        setupEpg(_epgMap, et -> ((MProduct)et).getUnit1(), (et, vl) -> ((MProduct)et).setUnit1(ctb(vl)), "unit1");
        setupEpg(_epgMap, et -> ((MProduct)et).getUnit1style(), (et, vl) -> ((MProduct)et).setUnit1style((String)vl), "unit1style");
        setupEpg(_epgMap, et -> ((MProduct)et).getLength1(), (et, vl) -> ((MProduct)et).setLength1(ctl(vl)), "length1");
        setupEpg(_epgMap, et -> ((MProduct)et).getWidth1(), (et, vl) -> ((MProduct)et).setWidth1(ctl(vl)), "width1");
        setupEpg(_epgMap, et -> ((MProduct)et).getHeight1(), (et, vl) -> ((MProduct)et).setHeight1(ctl(vl)), "height1");
        setupEpg(_epgMap, et -> ((MProduct)et).getGrossweight1(), (et, vl) -> ((MProduct)et).setGrossweight1(ctl(vl)), "grossweight1");
        setupEpg(_epgMap, et -> ((MProduct)et).getNetweight1(), (et, vl) -> ((MProduct)et).setNetweight1(ctl(vl)), "netweight1");
        setupEpg(_epgMap, et -> ((MProduct)et).getCube1(), (et, vl) -> ((MProduct)et).setCube1(ctl(vl)), "cube1");
        setupEpg(_epgMap, et -> ((MProduct)et).getLiter1(), (et, vl) -> ((MProduct)et).setLiter1(ctl(vl)), "liter1");
        setupEpg(_epgMap, et -> ((MProduct)et).getUnit2(), (et, vl) -> ((MProduct)et).setUnit2(ctb(vl)), "unit2");
        setupEpg(_epgMap, et -> ((MProduct)et).getUnit2style(), (et, vl) -> ((MProduct)et).setUnit2style((String)vl), "unit2style");
        setupEpg(_epgMap, et -> ((MProduct)et).getLength2(), (et, vl) -> ((MProduct)et).setLength2(ctl(vl)), "length2");
        setupEpg(_epgMap, et -> ((MProduct)et).getWidth2(), (et, vl) -> ((MProduct)et).setWidth2(ctl(vl)), "width2");
        setupEpg(_epgMap, et -> ((MProduct)et).getHeight2(), (et, vl) -> ((MProduct)et).setHeight2(ctl(vl)), "height2");
        setupEpg(_epgMap, et -> ((MProduct)et).getGrossweight2(), (et, vl) -> ((MProduct)et).setGrossweight2(ctl(vl)), "grossweight2");
        setupEpg(_epgMap, et -> ((MProduct)et).getNetweight2(), (et, vl) -> ((MProduct)et).setNetweight2(ctl(vl)), "netweight2");
        setupEpg(_epgMap, et -> ((MProduct)et).getCube2(), (et, vl) -> ((MProduct)et).setCube2(ctl(vl)), "cube2");
        setupEpg(_epgMap, et -> ((MProduct)et).getLiter2(), (et, vl) -> ((MProduct)et).setLiter2(ctl(vl)), "liter2");
        setupEpg(_epgMap, et -> ((MProduct)et).getUnit3(), (et, vl) -> ((MProduct)et).setUnit3(ctb(vl)), "unit3");
        setupEpg(_epgMap, et -> ((MProduct)et).getUnit3style(), (et, vl) -> ((MProduct)et).setUnit3style((String)vl), "unit3style");
        setupEpg(_epgMap, et -> ((MProduct)et).getLength3(), (et, vl) -> ((MProduct)et).setLength3(ctl(vl)), "length3");
        setupEpg(_epgMap, et -> ((MProduct)et).getWidth3(), (et, vl) -> ((MProduct)et).setWidth3(ctl(vl)), "width3");
        setupEpg(_epgMap, et -> ((MProduct)et).getHeight3(), (et, vl) -> ((MProduct)et).setHeight3(ctl(vl)), "height3");
        setupEpg(_epgMap, et -> ((MProduct)et).getGrossweight3(), (et, vl) -> ((MProduct)et).setGrossweight3(ctl(vl)), "grossweight3");
        setupEpg(_epgMap, et -> ((MProduct)et).getNetweight3(), (et, vl) -> ((MProduct)et).setNetweight3(ctl(vl)), "netweight3");
        setupEpg(_epgMap, et -> ((MProduct)et).getCube3(), (et, vl) -> ((MProduct)et).setCube3(ctl(vl)), "cube3");
        setupEpg(_epgMap, et -> ((MProduct)et).getLiter3(), (et, vl) -> ((MProduct)et).setLiter3(ctl(vl)), "liter3");
        setupEpg(_epgMap, et -> ((MProduct)et).getPQty(), (et, vl) -> ((MProduct)et).setPQty(ctb(vl)), "PQty");
        setupEpg(_epgMap, et -> ((MProduct)et).getPHeight(), (et, vl) -> ((MProduct)et).setPHeight(ctb(vl)), "PHeight");
        setupEpg(_epgMap, et -> ((MProduct)et).getPOdd(), (et, vl) -> ((MProduct)et).setPOdd(ctb(vl)), "POdd");
        setupEpg(_epgMap, et -> ((MProduct)et).getPDescription(), (et, vl) -> ((MProduct)et).setPDescription((String)vl), "PDescription");
        setupEpg(_epgMap, et -> ((MProduct)et).getNotes(), (et, vl) -> ((MProduct)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((MProduct)et).getQty2usedflg(), (et, vl) -> ((MProduct)et).setQty2usedflg(ctb(vl)), "qty2usedflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getQty2style(), (et, vl) -> ((MProduct)et).setQty2style((String)vl), "qty2style");
        setupEpg(_epgMap, et -> ((MProduct)et).getQty3usedflg(), (et, vl) -> ((MProduct)et).setQty3usedflg(ctb(vl)), "qty3usedflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getQty3style(), (et, vl) -> ((MProduct)et).setQty3style((String)vl), "qty3style");
        setupEpg(_epgMap, et -> ((MProduct)et).getSpCalcflg(), (et, vl) -> ((MProduct)et).setSpCalcflg(ctb(vl)), "spCalcflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getSpLotatrb1usedflg(), (et, vl) -> ((MProduct)et).setSpLotatrb1usedflg(ctb(vl)), "spLotatrb1usedflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getSpOperator1(), (et, vl) -> ((MProduct)et).setSpOperator1((String)vl), "spOperator1");
        setupEpg(_epgMap, et -> ((MProduct)et).getSpLotatrb2usedflg(), (et, vl) -> ((MProduct)et).setSpLotatrb2usedflg(ctb(vl)), "spLotatrb2usedflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getSpOperator2(), (et, vl) -> ((MProduct)et).setSpOperator2((String)vl), "spOperator2");
        setupEpg(_epgMap, et -> ((MProduct)et).getSpLotatrb3usedflg(), (et, vl) -> ((MProduct)et).setSpLotatrb3usedflg(ctb(vl)), "spLotatrb3usedflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getSpOperator3(), (et, vl) -> ((MProduct)et).setSpOperator3((String)vl), "spOperator3");
        setupEpg(_epgMap, et -> ((MProduct)et).getSpRate(), (et, vl) -> ((MProduct)et).setSpRate(ctl(vl)), "spRate");
        setupEpg(_epgMap, et -> ((MProduct)et).getLotatrb1title(), (et, vl) -> ((MProduct)et).setLotatrb1title((String)vl), "lotatrb1title");
        setupEpg(_epgMap, et -> ((MProduct)et).getLotatrb2title(), (et, vl) -> ((MProduct)et).setLotatrb2title((String)vl), "lotatrb2title");
        setupEpg(_epgMap, et -> ((MProduct)et).getLotatrb3title(), (et, vl) -> ((MProduct)et).setLotatrb3title((String)vl), "lotatrb3title");
        setupEpg(_epgMap, et -> ((MProduct)et).getLotatrb4title(), (et, vl) -> ((MProduct)et).setLotatrb4title((String)vl), "lotatrb4title");
        setupEpg(_epgMap, et -> ((MProduct)et).getLotatrb5title(), (et, vl) -> ((MProduct)et).setLotatrb5title((String)vl), "lotatrb5title");
        setupEpg(_epgMap, et -> ((MProduct)et).getLotatrb6title(), (et, vl) -> ((MProduct)et).setLotatrb6title((String)vl), "lotatrb6title");
        setupEpg(_epgMap, et -> ((MProduct)et).getLotatrb7title(), (et, vl) -> ((MProduct)et).setLotatrb7title((String)vl), "lotatrb7title");
        setupEpg(_epgMap, et -> ((MProduct)et).getLotatrb8title(), (et, vl) -> ((MProduct)et).setLotatrb8title((String)vl), "lotatrb8title");
        setupEpg(_epgMap, et -> ((MProduct)et).getLotatrb9title(), (et, vl) -> ((MProduct)et).setLotatrb9title((String)vl), "lotatrb9title");
        setupEpg(_epgMap, et -> ((MProduct)et).getLotatrb10title(), (et, vl) -> ((MProduct)et).setLotatrb10title((String)vl), "lotatrb10title");
        setupEpg(_epgMap, et -> ((MProduct)et).getFUser1(), (et, vl) -> ((MProduct)et).setFUser1((String)vl), "FUser1");
        setupEpg(_epgMap, et -> ((MProduct)et).getFUser2(), (et, vl) -> ((MProduct)et).setFUser2((String)vl), "FUser2");
        setupEpg(_epgMap, et -> ((MProduct)et).getFUser3(), (et, vl) -> ((MProduct)et).setFUser3((String)vl), "FUser3");
        setupEpg(_epgMap, et -> ((MProduct)et).getFUser4(), (et, vl) -> ((MProduct)et).setFUser4((String)vl), "FUser4");
        setupEpg(_epgMap, et -> ((MProduct)et).getFUser5(), (et, vl) -> ((MProduct)et).setFUser5((String)vl), "FUser5");
        setupEpg(_epgMap, et -> ((MProduct)et).getItem40(), (et, vl) -> ((MProduct)et).setItem40(ctb(vl)), "item40");
        setupEpg(_epgMap, et -> ((MProduct)et).getPriceInsurance(), (et, vl) -> ((MProduct)et).setPriceInsurance(ctl(vl)), "priceInsurance");
        setupEpg(_epgMap, et -> ((MProduct)et).getLimitday(), (et, vl) -> ((MProduct)et).setLimitday(ctb(vl)), "limitday");
        setupEpg(_epgMap, et -> ((MProduct)et).getDeliverableday(), (et, vl) -> ((MProduct)et).setDeliverableday(ctl(vl)), "deliverableday");
        setupEpg(_epgMap, et -> ((MProduct)et).getPrintdateflg(), (et, vl) -> ((MProduct)et).setPrintdateflg(ctb(vl)), "printdateflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getSuppliercd(), (et, vl) -> ((MProduct)et).setSuppliercd((String)vl), "suppliercd");
        setupEpg(_epgMap, et -> ((MProduct)et).getDispatchqtytype(), (et, vl) -> ((MProduct)et).setDispatchqtytype((String)vl), "dispatchqtytype");
        setupEpg(_epgMap, et -> ((MProduct)et).getTariffqtytype(), (et, vl) -> ((MProduct)et).setTariffqtytype((String)vl), "tariffqtytype");
        setupEpg(_epgMap, et -> ((MProduct)et).getUseruse1(), (et, vl) -> ((MProduct)et).setUseruse1((String)vl), "useruse1");
        setupEpg(_epgMap, et -> ((MProduct)et).getUseruse2(), (et, vl) -> ((MProduct)et).setUseruse2((String)vl), "useruse2");
        setupEpg(_epgMap, et -> ((MProduct)et).getUseruse3(), (et, vl) -> ((MProduct)et).setUseruse3((String)vl), "useruse3");
        setupEpg(_epgMap, et -> ((MProduct)et).getUseruse4(), (et, vl) -> ((MProduct)et).setUseruse4((String)vl), "useruse4");
        setupEpg(_epgMap, et -> ((MProduct)et).getUseruse5(), (et, vl) -> ((MProduct)et).setUseruse5((String)vl), "useruse5");
        setupEpg(_epgMap, et -> ((MProduct)et).getLot1nullflg(), (et, vl) -> ((MProduct)et).setLot1nullflg(ctb(vl)), "lot1nullflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getLot2nullflg(), (et, vl) -> ((MProduct)et).setLot2nullflg(ctb(vl)), "lot2nullflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getLot3nullflg(), (et, vl) -> ((MProduct)et).setLot3nullflg(ctb(vl)), "lot3nullflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getLot4nullflg(), (et, vl) -> ((MProduct)et).setLot4nullflg(ctb(vl)), "lot4nullflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getLot5nullflg(), (et, vl) -> ((MProduct)et).setLot5nullflg(ctb(vl)), "lot5nullflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getOtherlot1nullflg(), (et, vl) -> ((MProduct)et).setOtherlot1nullflg(ctb(vl)), "otherlot1nullflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getOtherlot2nullflg(), (et, vl) -> ((MProduct)et).setOtherlot2nullflg(ctb(vl)), "otherlot2nullflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getOtherlot3nullflg(), (et, vl) -> ((MProduct)et).setOtherlot3nullflg(ctb(vl)), "otherlot3nullflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getOtherlot4nullflg(), (et, vl) -> ((MProduct)et).setOtherlot4nullflg(ctb(vl)), "otherlot4nullflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getOtherlot5nullflg(), (et, vl) -> ((MProduct)et).setOtherlot5nullflg(ctb(vl)), "otherlot5nullflg");
        setupEpg(_epgMap, et -> ((MProduct)et).getItemprintname(), (et, vl) -> ((MProduct)et).setItemprintname((String)vl), "itemprintname");
        setupEpg(_epgMap, et -> ((MProduct)et).getPricelevel(), (et, vl) -> ((MProduct)et).setPricelevel(ctb(vl)), "pricelevel");
        setupEpg(_epgMap, et -> ((MProduct)et).getItemcatalogurl(), (et, vl) -> ((MProduct)et).setItemcatalogurl((String)vl), "itemcatalogurl");
        setupEpg(_epgMap, et -> ((MProduct)et).getUsernum1(), (et, vl) -> ((MProduct)et).setUsernum1(ctl(vl)), "usernum1");
        setupEpg(_epgMap, et -> ((MProduct)et).getUsernum2(), (et, vl) -> ((MProduct)et).setUsernum2(ctl(vl)), "usernum2");
        setupEpg(_epgMap, et -> ((MProduct)et).getUsernum3(), (et, vl) -> ((MProduct)et).setUsernum3(ctl(vl)), "usernum3");
        setupEpg(_epgMap, et -> ((MProduct)et).getUsernum4(), (et, vl) -> ((MProduct)et).setUsernum4(ctl(vl)), "usernum4");
        setupEpg(_epgMap, et -> ((MProduct)et).getUsernum5(), (et, vl) -> ((MProduct)et).setUsernum5(ctl(vl)), "usernum5");
        setupEpg(_epgMap, et -> ((MProduct)et).getUserdate1(), (et, vl) -> ((MProduct)et).setUserdate1((String)vl), "userdate1");
        setupEpg(_epgMap, et -> ((MProduct)et).getUserdate2(), (et, vl) -> ((MProduct)et).setUserdate2((String)vl), "userdate2");
        setupEpg(_epgMap, et -> ((MProduct)et).getUserdate3(), (et, vl) -> ((MProduct)et).setUserdate3((String)vl), "userdate3");
        setupEpg(_epgMap, et -> ((MProduct)et).getUserdate4(), (et, vl) -> ((MProduct)et).setUserdate4((String)vl), "userdate4");
        setupEpg(_epgMap, et -> ((MProduct)et).getUserdate5(), (et, vl) -> ((MProduct)et).setUserdate5((String)vl), "userdate5");
        setupEpg(_epgMap, et -> ((MProduct)et).getCggdid(), (et, vl) -> ((MProduct)et).setCggdid((String)vl), "cggdid");
        setupEpg(_epgMap, et -> ((MProduct)et).getBrctg(), (et, vl) -> ((MProduct)et).setBrctg(ctl(vl)), "brctg");
        setupEpg(_epgMap, et -> ((MProduct)et).getCtweight(), (et, vl) -> ((MProduct)et).setCtweight(ctl(vl)), "ctweight");
        setupEpg(_epgMap, et -> ((MProduct)et).getBxoszl(), (et, vl) -> ((MProduct)et).setBxoszl(ctl(vl)), "bxoszl");
        setupEpg(_epgMap, et -> ((MProduct)et).getBxoszw(), (et, vl) -> ((MProduct)et).setBxoszw(ctl(vl)), "bxoszw");
        setupEpg(_epgMap, et -> ((MProduct)et).getBxoszh(), (et, vl) -> ((MProduct)et).setBxoszh(ctl(vl)), "bxoszh");
        setupEpg(_epgMap, et -> ((MProduct)et).getBxcpy(), (et, vl) -> ((MProduct)et).setBxcpy(ctl(vl)), "bxcpy");
        setupEpg(_epgMap, et -> ((MProduct)et).getBxweight(), (et, vl) -> ((MProduct)et).setBxweight(ctl(vl)), "bxweight");
        setupEpg(_epgMap, et -> ((MProduct)et).getItemAdmin(), (et, vl) -> ((MProduct)et).setItemAdmin((String)vl), "itemAdmin");
        setupEpg(_epgMap, et -> ((MProduct)et).getSname(), (et, vl) -> ((MProduct)et).setSname((String)vl), "sname");
        setupEpg(_epgMap, et -> ((MProduct)et).getFractionpieceweight(), (et, vl) -> ((MProduct)et).setFractionpieceweight(ctb(vl)), "fractionpieceweight");
        setupEpg(_epgMap, et -> ((MProduct)et).getTaxequivalentnumber(), (et, vl) -> ((MProduct)et).setTaxequivalentnumber(ctb(vl)), "taxequivalentnumber");
        setupEpg(_epgMap, et -> ((MProduct)et).getSyhnkbnjt(), (et, vl) -> ((MProduct)et).setSyhnkbnjt((String)vl), "syhnkbnjt");
        setupEpg(_epgMap, et -> ((MProduct)et).getIoidCls(), (et, vl) -> ((MProduct)et).setIoidCls((String)vl), "ioidCls");
        setupEpg(_epgMap, et -> ((MProduct)et).getItfcdCls(), (et, vl) -> ((MProduct)et).setItfcdCls((String)vl), "itfcdCls");
        setupEpg(_epgMap, et -> ((MProduct)et).getManuitemcdCls(), (et, vl) -> ((MProduct)et).setManuitemcdCls((String)vl), "manuitemcdCls");
        setupEpg(_epgMap, et -> ((MProduct)et).getCtcpy(), (et, vl) -> ((MProduct)et).setCtcpy(ctl(vl)), "ctcpy");
        setupEpg(_epgMap, et -> ((MProduct)et).getDelFlg(), (et, vl) -> ((MProduct)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getVersionNo(), (et, vl) -> ((MProduct)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MProduct)et).getControlNo(), (et, vl) -> ((MProduct)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MProduct)et).getAddDt(), (et, vl) -> ((MProduct)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MProduct)et).getAddUser(), (et, vl) -> ((MProduct)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MProduct)et).getAddProcess(), (et, vl) -> ((MProduct)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MProduct)et).getUpdDt(), (et, vl) -> ((MProduct)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MProduct)et).getUpdUser(), (et, vl) -> ((MProduct)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MProduct)et).getUpdProcess(), (et, vl) -> ((MProduct)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MProduct)et).getMClient(), (et, vl) -> ((MProduct)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getMProductSelf(), (et, vl) -> ((MProduct)et).setMProductSelf((MProduct)vl), "MProductSelf");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getMShapeGrp(), (et, vl) -> ((MProduct)et).setMShapeGrp((MShapeGrp)vl), "MShapeGrp");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByDelFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByLimitDtManagFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByLimitDtManagFlg((BClassDtl)vl), "BClassDtlByLimitDtManagFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByLimitDtReverseFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByLimitDtReverseFlg((BClassDtl)vl), "BClassDtlByLimitDtReverseFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByLotManagFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByLotManagFlg((BClassDtl)vl), "BClassDtlByLotManagFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByLotReverseFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByLotReverseFlg((BClassDtl)vl), "BClassDtlByLotReverseFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByMergeCls(), (et, vl) -> ((MProduct)et).setBClassDtlByMergeCls((BClassDtl)vl), "BClassDtlByMergeCls");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByShippingStopFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByShippingStopFlg((BClassDtl)vl), "BClassDtlByShippingStopFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByFreightCls(), (et, vl) -> ((MProduct)et).setBClassDtlByFreightCls((BClassDtl)vl), "BClassDtlByFreightCls");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getMProductSelfAsOne(), (et, vl) -> ((MProduct)et).setMProductSelfAsOne((MProduct)vl), "MProductSelfAsOne");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getMProductTermAsOne(), (et, vl) -> ((MProduct)et).setMProductTermAsOne((MProductTerm)vl), "MProductTermAsOne");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getMSetParentAsOne(), (et, vl) -> ((MProduct)et).setMSetParentAsOne((MSetParent)vl), "MSetParentAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_PRODUCT";
    protected final String _tableDispName = "M_PRODUCT";
    protected final String _tablePropertyName = "MProduct";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_PRODUCT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "MProductSelf,MProductSelfAsOne,MProductTermAsOne,MSetParentAsOne", "MLocationList,MMfwhxitemList,MProductShapeList,MSetStructureList,TAllocInstBList,TAllocLotList,TInventoryBList,TKeepingLotList,TLastLotList,TLotList,TMoveInstBList,TReceivePlanBList,TSerialNoList,TShippingInstBList,TStockList,TTrinvcheckinfoList,TYtrsodetailList,WHtInventoryInputProdList,WHtReceiveInspectionList,WHtReceiveNoPlanInspList,WHtReceiveStoreList,WHtShippingList,WHtShippingPickingList,WSglRowShipInspHList,WShippingInterruptList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotManagFlg = cci("LOT_MANAG_FLG", "LOT_MANAG_FLG", null, null, String.class, "lotManagFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByLotManagFlg", null, CDef.DefMeta.LotManagFlg, false);
    protected final ColumnInfo _columnLimitDtManagFlg = cci("LIMIT_DT_MANAG_FLG", "LIMIT_DT_MANAG_FLG", null, null, String.class, "limitDtManagFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByLimitDtManagFlg", null, CDef.DefMeta.LimitDtManagFlg, false);
    protected final ColumnInfo _columnReceiveLimitNum = cci("RECEIVE_LIMIT_NUM", "RECEIVE_LIMIT_NUM", null, null, Long.class, "receiveLimitNum", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingLimitNum = cci("SHIPPING_LIMIT_NUM", "SHIPPING_LIMIT_NUM", null, null, Long.class, "shippingLimitNum", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMergeCls = cci("MERGE_CLS", "MERGE_CLS", null, null, String.class, "mergeCls", null, false, false, true, "varchar", 30, 0, null, "02", false, null, null, "BClassDtlByMergeCls", null, CDef.DefMeta.MergeCls, false);
    protected final ColumnInfo _columnLotReverseFlg = cci("LOT_REVERSE_FLG", "LOT_REVERSE_FLG", null, null, String.class, "lotReverseFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByLotReverseFlg", null, CDef.DefMeta.LotReverseFlg, false);
    protected final ColumnInfo _columnLimitDtReverseFlg = cci("LIMIT_DT_REVERSE_FLG", "LIMIT_DT_REVERSE_FLG", null, null, String.class, "limitDtReverseFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByLimitDtReverseFlg", null, CDef.DefMeta.LimitDtReverseFlg, false);
    protected final ColumnInfo _columnShippingStopFlg = cci("SHIPPING_STOP_FLG", "SHIPPING_STOP_FLG", null, null, String.class, "shippingStopFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByShippingStopFlg", null, CDef.DefMeta.ShippingStopFlg, false);
    protected final ColumnInfo _columnFixedPoint = cci("FIXED_POINT", "FIXED_POINT", null, null, java.math.BigDecimal.class, "fixedPoint", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeGrpId = cci("SHAPE_GRP_ID", "SHAPE_GRP_ID", null, null, Long.class, "shapeGrpId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MShapeGrp", null, null, false);
    protected final ColumnInfo _columnNmfcCode = cci("NMFC_CODE", "NMFC_CODE", null, null, String.class, "nmfcCode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFreightCls = cci("FREIGHT_CLS", "FREIGHT_CLS", null, null, String.class, "freightCls", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByFreightCls", null, CDef.DefMeta.FreightCls, false);
    protected final ColumnInfo _columnCounntryOfOrigin = cci("COUNNTRY_OF_ORIGIN", "COUNNTRY_OF_ORIGIN", null, null, String.class, "counntryOfOrigin", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitVal = cci("UNIT_VAL", "UNIT_VAL", null, null, java.math.BigDecimal.class, "unitVal", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHtsCd = cci("HTS_CD", "HTS_CD", null, null, String.class, "htsCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemgroup = cci("ITEMGROUP", "ITEMGROUP", null, null, String.class, "itemgroup", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnActflg = cci("ACTFLG", "ACTFLG", null, null, java.math.BigDecimal.class, "actflg", null, false, false, true, "decimal", 16, 6, null, "(1)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvtype = cci("INVTYPE", "INVTYPE", null, null, String.class, "invtype", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSetitemflg = cci("SETITEMFLG", "SETITEMFLG", null, null, java.math.BigDecimal.class, "setitemflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwneritemcd = cci("OWNERITEMCD", "OWNERITEMCD", null, null, String.class, "owneritemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplieritemcd = cci("SUPPLIERITEMCD", "SUPPLIERITEMCD", null, null, String.class, "supplieritemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPositemcd = cci("POSITEMCD", "POSITEMCD", null, null, String.class, "positemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItfcd = cci("ITFCD", "ITFCD", null, null, String.class, "itfcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManuitemcd = cci("MANUITEMCD", "MANUITEMCD", null, null, String.class, "manuitemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriceBuy = cci("PRICE_BUY", "PRICE_BUY", null, null, Long.class, "priceBuy", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriceWholesale = cci("PRICE_WHOLESALE", "PRICE_WHOLESALE", null, null, Long.class, "priceWholesale", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriceSale = cci("PRICE_SALE", "PRICE_SALE", null, null, Long.class, "priceSale", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocpolicykey = cci("ALLOCPOLICYKEY", "ALLOCPOLICYKEY", null, null, java.math.BigDecimal.class, "allocpolicykey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlotpolicykey = cci("SLOTPOLICYKEY", "SLOTPOLICYKEY", null, null, java.math.BigDecimal.class, "slotpolicykey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInworkingkey = cci("INWORKINGKEY", "INWORKINGKEY", null, null, java.math.BigDecimal.class, "inworkingkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOutworkingkey = cci("OUTWORKINGKEY", "OUTWORKINGKEY", null, null, java.math.BigDecimal.class, "outworkingkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAbctype = cci("ABCTYPE", "ABCTYPE", null, null, String.class, "abctype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty1type = cci("QTY1TYPE", "QTY1TYPE", null, null, java.math.BigDecimal.class, "qty1type", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit1 = cci("UNIT1", "UNIT1", null, null, java.math.BigDecimal.class, "unit1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit1style = cci("UNIT1STYLE", "UNIT1STYLE", null, null, String.class, "unit1style", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength1 = cci("LENGTH1", "LENGTH1", null, null, Long.class, "length1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWidth1 = cci("WIDTH1", "WIDTH1", null, null, Long.class, "width1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeight1 = cci("HEIGHT1", "HEIGHT1", null, null, Long.class, "height1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrossweight1 = cci("GROSSWEIGHT1", "GROSSWEIGHT1", null, null, Long.class, "grossweight1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNetweight1 = cci("NETWEIGHT1", "NETWEIGHT1", null, null, Long.class, "netweight1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCube1 = cci("CUBE1", "CUBE1", null, null, Long.class, "cube1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLiter1 = cci("LITER1", "LITER1", null, null, Long.class, "liter1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit2 = cci("UNIT2", "UNIT2", null, null, java.math.BigDecimal.class, "unit2", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit2style = cci("UNIT2STYLE", "UNIT2STYLE", null, null, String.class, "unit2style", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength2 = cci("LENGTH2", "LENGTH2", null, null, Long.class, "length2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWidth2 = cci("WIDTH2", "WIDTH2", null, null, Long.class, "width2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeight2 = cci("HEIGHT2", "HEIGHT2", null, null, Long.class, "height2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrossweight2 = cci("GROSSWEIGHT2", "GROSSWEIGHT2", null, null, Long.class, "grossweight2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNetweight2 = cci("NETWEIGHT2", "NETWEIGHT2", null, null, Long.class, "netweight2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCube2 = cci("CUBE2", "CUBE2", null, null, Long.class, "cube2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLiter2 = cci("LITER2", "LITER2", null, null, Long.class, "liter2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit3 = cci("UNIT3", "UNIT3", null, null, java.math.BigDecimal.class, "unit3", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit3style = cci("UNIT3STYLE", "UNIT3STYLE", null, null, String.class, "unit3style", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength3 = cci("LENGTH3", "LENGTH3", null, null, Long.class, "length3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWidth3 = cci("WIDTH3", "WIDTH3", null, null, Long.class, "width3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeight3 = cci("HEIGHT3", "HEIGHT3", null, null, Long.class, "height3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrossweight3 = cci("GROSSWEIGHT3", "GROSSWEIGHT3", null, null, Long.class, "grossweight3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNetweight3 = cci("NETWEIGHT3", "NETWEIGHT3", null, null, Long.class, "netweight3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCube3 = cci("CUBE3", "CUBE3", null, null, Long.class, "cube3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLiter3 = cci("LITER3", "LITER3", null, null, Long.class, "liter3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPQty = cci("P_QTY", "P_QTY", null, null, java.math.BigDecimal.class, "PQty", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPHeight = cci("P_HEIGHT", "P_HEIGHT", null, null, java.math.BigDecimal.class, "PHeight", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPOdd = cci("P_ODD", "P_ODD", null, null, java.math.BigDecimal.class, "POdd", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPDescription = cci("P_DESCRIPTION", "P_DESCRIPTION", null, null, String.class, "PDescription", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty2usedflg = cci("QTY2USEDFLG", "QTY2USEDFLG", null, null, java.math.BigDecimal.class, "qty2usedflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty2style = cci("QTY2STYLE", "QTY2STYLE", null, null, String.class, "qty2style", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty3usedflg = cci("QTY3USEDFLG", "QTY3USEDFLG", null, null, java.math.BigDecimal.class, "qty3usedflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty3style = cci("QTY3STYLE", "QTY3STYLE", null, null, String.class, "qty3style", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpCalcflg = cci("SP_CALCFLG", "SP_CALCFLG", null, null, java.math.BigDecimal.class, "spCalcflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpLotatrb1usedflg = cci("SP_LOTATRB1USEDFLG", "SP_LOTATRB1USEDFLG", null, null, java.math.BigDecimal.class, "spLotatrb1usedflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpOperator1 = cci("SP_OPERATOR1", "SP_OPERATOR1", null, null, String.class, "spOperator1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpLotatrb2usedflg = cci("SP_LOTATRB2USEDFLG", "SP_LOTATRB2USEDFLG", null, null, java.math.BigDecimal.class, "spLotatrb2usedflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpOperator2 = cci("SP_OPERATOR2", "SP_OPERATOR2", null, null, String.class, "spOperator2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpLotatrb3usedflg = cci("SP_LOTATRB3USEDFLG", "SP_LOTATRB3USEDFLG", null, null, java.math.BigDecimal.class, "spLotatrb3usedflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpOperator3 = cci("SP_OPERATOR3", "SP_OPERATOR3", null, null, String.class, "spOperator3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpRate = cci("SP_RATE", "SP_RATE", null, null, Long.class, "spRate", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotatrb1title = cci("LOTATRB1TITLE", "LOTATRB1TITLE", null, null, String.class, "lotatrb1title", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotatrb2title = cci("LOTATRB2TITLE", "LOTATRB2TITLE", null, null, String.class, "lotatrb2title", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotatrb3title = cci("LOTATRB3TITLE", "LOTATRB3TITLE", null, null, String.class, "lotatrb3title", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotatrb4title = cci("LOTATRB4TITLE", "LOTATRB4TITLE", null, null, String.class, "lotatrb4title", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotatrb5title = cci("LOTATRB5TITLE", "LOTATRB5TITLE", null, null, String.class, "lotatrb5title", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotatrb6title = cci("LOTATRB6TITLE", "LOTATRB6TITLE", null, null, String.class, "lotatrb6title", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotatrb7title = cci("LOTATRB7TITLE", "LOTATRB7TITLE", null, null, String.class, "lotatrb7title", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotatrb8title = cci("LOTATRB8TITLE", "LOTATRB8TITLE", null, null, String.class, "lotatrb8title", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotatrb9title = cci("LOTATRB9TITLE", "LOTATRB9TITLE", null, null, String.class, "lotatrb9title", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotatrb10title = cci("LOTATRB10TITLE", "LOTATRB10TITLE", null, null, String.class, "lotatrb10title", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser1 = cci("F_USER1", "F_USER1", null, null, String.class, "FUser1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser2 = cci("F_USER2", "F_USER2", null, null, String.class, "FUser2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser3 = cci("F_USER3", "F_USER3", null, null, String.class, "FUser3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser4 = cci("F_USER4", "F_USER4", null, null, String.class, "FUser4", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser5 = cci("F_USER5", "F_USER5", null, null, String.class, "FUser5", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItem40 = cci("ITEM40", "ITEM40", null, null, java.math.BigDecimal.class, "item40", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriceInsurance = cci("PRICE_INSURANCE", "PRICE_INSURANCE", null, null, Long.class, "priceInsurance", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitday = cci("LIMITDAY", "LIMITDAY", null, null, java.math.BigDecimal.class, "limitday", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliverableday = cci("DELIVERABLEDAY", "DELIVERABLEDAY", null, null, Long.class, "deliverableday", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintdateflg = cci("PRINTDATEFLG", "PRINTDATEFLG", null, null, java.math.BigDecimal.class, "printdateflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuppliercd = cci("SUPPLIERCD", "SUPPLIERCD", null, null, String.class, "suppliercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDispatchqtytype = cci("DISPATCHQTYTYPE", "DISPATCHQTYTYPE", null, null, String.class, "dispatchqtytype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTariffqtytype = cci("TARIFFQTYTYPE", "TARIFFQTYTYPE", null, null, String.class, "tariffqtytype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse1 = cci("USERUSE1", "USERUSE1", null, null, String.class, "useruse1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse2 = cci("USERUSE2", "USERUSE2", null, null, String.class, "useruse2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse3 = cci("USERUSE3", "USERUSE3", null, null, String.class, "useruse3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse4 = cci("USERUSE4", "USERUSE4", null, null, String.class, "useruse4", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse5 = cci("USERUSE5", "USERUSE5", null, null, String.class, "useruse5", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1nullflg = cci("LOT1NULLFLG", "LOT1NULLFLG", null, null, java.math.BigDecimal.class, "lot1nullflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2nullflg = cci("LOT2NULLFLG", "LOT2NULLFLG", null, null, java.math.BigDecimal.class, "lot2nullflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3nullflg = cci("LOT3NULLFLG", "LOT3NULLFLG", null, null, java.math.BigDecimal.class, "lot3nullflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4nullflg = cci("LOT4NULLFLG", "LOT4NULLFLG", null, null, java.math.BigDecimal.class, "lot4nullflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot5nullflg = cci("LOT5NULLFLG", "LOT5NULLFLG", null, null, java.math.BigDecimal.class, "lot5nullflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1nullflg = cci("OTHERLOT1NULLFLG", "OTHERLOT1NULLFLG", null, null, java.math.BigDecimal.class, "otherlot1nullflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot2nullflg = cci("OTHERLOT2NULLFLG", "OTHERLOT2NULLFLG", null, null, java.math.BigDecimal.class, "otherlot2nullflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot3nullflg = cci("OTHERLOT3NULLFLG", "OTHERLOT3NULLFLG", null, null, java.math.BigDecimal.class, "otherlot3nullflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot4nullflg = cci("OTHERLOT4NULLFLG", "OTHERLOT4NULLFLG", null, null, java.math.BigDecimal.class, "otherlot4nullflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot5nullflg = cci("OTHERLOT5NULLFLG", "OTHERLOT5NULLFLG", null, null, java.math.BigDecimal.class, "otherlot5nullflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemprintname = cci("ITEMPRINTNAME", "ITEMPRINTNAME", null, null, String.class, "itemprintname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPricelevel = cci("PRICELEVEL", "PRICELEVEL", null, null, java.math.BigDecimal.class, "pricelevel", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcatalogurl = cci("ITEMCATALOGURL", "ITEMCATALOGURL", null, null, String.class, "itemcatalogurl", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum1 = cci("USERNUM1", "USERNUM1", null, null, Long.class, "usernum1", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum2 = cci("USERNUM2", "USERNUM2", null, null, Long.class, "usernum2", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum4 = cci("USERNUM4", "USERNUM4", null, null, Long.class, "usernum4", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum5 = cci("USERNUM5", "USERNUM5", null, null, Long.class, "usernum5", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserdate1 = cci("USERDATE1", "USERDATE1", null, null, String.class, "userdate1", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserdate2 = cci("USERDATE2", "USERDATE2", null, null, String.class, "userdate2", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserdate3 = cci("USERDATE3", "USERDATE3", null, null, String.class, "userdate3", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserdate4 = cci("USERDATE4", "USERDATE4", null, null, String.class, "userdate4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserdate5 = cci("USERDATE5", "USERDATE5", null, null, String.class, "userdate5", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdid = cci("CGGDID", "CGGDID", null, null, String.class, "cggdid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrctg = cci("BRCTG", "BRCTG", null, null, Long.class, "brctg", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtweight = cci("CTWEIGHT", "CTWEIGHT", null, null, Long.class, "ctweight", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxoszl = cci("BXOSZL", "BXOSZL", null, null, Long.class, "bxoszl", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxoszw = cci("BXOSZW", "BXOSZW", null, null, Long.class, "bxoszw", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxoszh = cci("BXOSZH", "BXOSZH", null, null, Long.class, "bxoszh", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxcpy = cci("BXCPY", "BXCPY", null, null, Long.class, "bxcpy", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxweight = cci("BXWEIGHT", "BXWEIGHT", null, null, Long.class, "bxweight", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemAdmin = cci("ITEM_ADMIN", "ITEM_ADMIN", null, null, String.class, "itemAdmin", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSname = cci("SNAME", "SNAME", null, null, String.class, "sname", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFractionpieceweight = cci("FractionPieceWeight", "FractionPieceWeight", null, null, java.math.BigDecimal.class, "fractionpieceweight", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaxequivalentnumber = cci("TaxEquivalentNumber", "TaxEquivalentNumber", null, null, java.math.BigDecimal.class, "taxequivalentnumber", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSyhnkbnjt = cci("SYHNKBNJT", "SYHNKBNJT", null, null, String.class, "syhnkbnjt", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIoidCls = cci("IOID_CLS", "IOID_CLS", null, null, String.class, "ioidCls", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItfcdCls = cci("ITFCD_CLS", "ITFCD_CLS", null, null, String.class, "itfcdCls", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManuitemcdCls = cci("MANUITEMCD_CLS", "MANUITEMCD_CLS", null, null, String.class, "manuitemcdCls", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtcpy = cci("CTCPY", "CTCPY", null, null, Long.class, "ctcpy", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, "BClassDtlByDelFlg", null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * PRODUCT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * JAN_CD: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotManagFlg() { return _columnLotManagFlg; }
    /**
     * LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDtManagFlg() { return _columnLimitDtManagFlg; }
    /**
     * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveLimitNum() { return _columnReceiveLimitNum; }
    /**
     * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingLimitNum() { return _columnShippingLimitNum; }
    /**
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeCls() { return _columnMergeCls; }
    /**
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotReverseFlg() { return _columnLotReverseFlg; }
    /**
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDtReverseFlg() { return _columnLimitDtReverseFlg; }
    /**
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStopFlg() { return _columnShippingStopFlg; }
    /**
     * FIXED_POINT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFixedPoint() { return _columnFixedPoint; }
    /**
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeGrpId() { return _columnShapeGrpId; }
    /**
     * NMFC_CODE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmfcCode() { return _columnNmfcCode; }
    /**
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFreightCls() { return _columnFreightCls; }
    /**
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCounntryOfOrigin() { return _columnCounntryOfOrigin; }
    /**
     * UNIT_VAL: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitVal() { return _columnUnitVal; }
    /**
     * HTS_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtsCd() { return _columnHtsCd; }
    /**
     * ITEMGROUP: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemgroup() { return _columnItemgroup; }
    /**
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnActflg() { return _columnActflg; }
    /**
     * INVTYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvtype() { return _columnInvtype; }
    /**
     * SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSetitemflg() { return _columnSetitemflg; }
    /**
     * OWNERITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwneritemcd() { return _columnOwneritemcd; }
    /**
     * SUPPLIERITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplieritemcd() { return _columnSupplieritemcd; }
    /**
     * POSITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPositemcd() { return _columnPositemcd; }
    /**
     * ITFCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItfcd() { return _columnItfcd; }
    /**
     * MANUITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManuitemcd() { return _columnManuitemcd; }
    /**
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriceBuy() { return _columnPriceBuy; }
    /**
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriceWholesale() { return _columnPriceWholesale; }
    /**
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriceSale() { return _columnPriceSale; }
    /**
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocpolicykey() { return _columnAllocpolicykey; }
    /**
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlotpolicykey() { return _columnSlotpolicykey; }
    /**
     * INWORKINGKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInworkingkey() { return _columnInworkingkey; }
    /**
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOutworkingkey() { return _columnOutworkingkey; }
    /**
     * ABCTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAbctype() { return _columnAbctype; }
    /**
     * QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty1type() { return _columnQty1type; }
    /**
     * UNIT1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit1() { return _columnUnit1; }
    /**
     * UNIT1STYLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit1style() { return _columnUnit1style; }
    /**
     * LENGTH1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength1() { return _columnLength1; }
    /**
     * WIDTH1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWidth1() { return _columnWidth1; }
    /**
     * HEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeight1() { return _columnHeight1; }
    /**
     * GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrossweight1() { return _columnGrossweight1; }
    /**
     * NETWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNetweight1() { return _columnNetweight1; }
    /**
     * CUBE1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCube1() { return _columnCube1; }
    /**
     * LITER1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLiter1() { return _columnLiter1; }
    /**
     * UNIT2: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit2() { return _columnUnit2; }
    /**
     * UNIT2STYLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit2style() { return _columnUnit2style; }
    /**
     * LENGTH2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength2() { return _columnLength2; }
    /**
     * WIDTH2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWidth2() { return _columnWidth2; }
    /**
     * HEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeight2() { return _columnHeight2; }
    /**
     * GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrossweight2() { return _columnGrossweight2; }
    /**
     * NETWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNetweight2() { return _columnNetweight2; }
    /**
     * CUBE2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCube2() { return _columnCube2; }
    /**
     * LITER2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLiter2() { return _columnLiter2; }
    /**
     * UNIT3: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit3() { return _columnUnit3; }
    /**
     * UNIT3STYLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit3style() { return _columnUnit3style; }
    /**
     * LENGTH3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength3() { return _columnLength3; }
    /**
     * WIDTH3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWidth3() { return _columnWidth3; }
    /**
     * HEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeight3() { return _columnHeight3; }
    /**
     * GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrossweight3() { return _columnGrossweight3; }
    /**
     * NETWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNetweight3() { return _columnNetweight3; }
    /**
     * CUBE3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCube3() { return _columnCube3; }
    /**
     * LITER3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLiter3() { return _columnLiter3; }
    /**
     * P_QTY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPQty() { return _columnPQty; }
    /**
     * P_HEIGHT: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPHeight() { return _columnPHeight; }
    /**
     * P_ODD: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPOdd() { return _columnPOdd; }
    /**
     * P_DESCRIPTION: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPDescription() { return _columnPDescription; }
    /**
     * NOTES: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotes() { return _columnNotes; }
    /**
     * QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty2usedflg() { return _columnQty2usedflg; }
    /**
     * QTY2STYLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty2style() { return _columnQty2style; }
    /**
     * QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty3usedflg() { return _columnQty3usedflg; }
    /**
     * QTY3STYLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty3style() { return _columnQty3style; }
    /**
     * SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpCalcflg() { return _columnSpCalcflg; }
    /**
     * SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpLotatrb1usedflg() { return _columnSpLotatrb1usedflg; }
    /**
     * SP_OPERATOR1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpOperator1() { return _columnSpOperator1; }
    /**
     * SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpLotatrb2usedflg() { return _columnSpLotatrb2usedflg; }
    /**
     * SP_OPERATOR2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpOperator2() { return _columnSpOperator2; }
    /**
     * SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpLotatrb3usedflg() { return _columnSpLotatrb3usedflg; }
    /**
     * SP_OPERATOR3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpOperator3() { return _columnSpOperator3; }
    /**
     * SP_RATE: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpRate() { return _columnSpRate; }
    /**
     * LOTATRB1TITLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotatrb1title() { return _columnLotatrb1title; }
    /**
     * LOTATRB2TITLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotatrb2title() { return _columnLotatrb2title; }
    /**
     * LOTATRB3TITLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotatrb3title() { return _columnLotatrb3title; }
    /**
     * LOTATRB4TITLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotatrb4title() { return _columnLotatrb4title; }
    /**
     * LOTATRB5TITLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotatrb5title() { return _columnLotatrb5title; }
    /**
     * LOTATRB6TITLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotatrb6title() { return _columnLotatrb6title; }
    /**
     * LOTATRB7TITLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotatrb7title() { return _columnLotatrb7title; }
    /**
     * LOTATRB8TITLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotatrb8title() { return _columnLotatrb8title; }
    /**
     * LOTATRB9TITLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotatrb9title() { return _columnLotatrb9title; }
    /**
     * LOTATRB10TITLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotatrb10title() { return _columnLotatrb10title; }
    /**
     * F_USER1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser1() { return _columnFUser1; }
    /**
     * F_USER2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser2() { return _columnFUser2; }
    /**
     * F_USER3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser3() { return _columnFUser3; }
    /**
     * F_USER4: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser4() { return _columnFUser4; }
    /**
     * F_USER5: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser5() { return _columnFUser5; }
    /**
     * ITEM40: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItem40() { return _columnItem40; }
    /**
     * PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriceInsurance() { return _columnPriceInsurance; }
    /**
     * LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitday() { return _columnLimitday; }
    /**
     * DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliverableday() { return _columnDeliverableday; }
    /**
     * PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintdateflg() { return _columnPrintdateflg; }
    /**
     * SUPPLIERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppliercd() { return _columnSuppliercd; }
    /**
     * DISPATCHQTYTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDispatchqtytype() { return _columnDispatchqtytype; }
    /**
     * TARIFFQTYTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTariffqtytype() { return _columnTariffqtytype; }
    /**
     * USERUSE1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse1() { return _columnUseruse1; }
    /**
     * USERUSE2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse2() { return _columnUseruse2; }
    /**
     * USERUSE3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse3() { return _columnUseruse3; }
    /**
     * USERUSE4: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse4() { return _columnUseruse4; }
    /**
     * USERUSE5: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse5() { return _columnUseruse5; }
    /**
     * LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1nullflg() { return _columnLot1nullflg; }
    /**
     * LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2nullflg() { return _columnLot2nullflg; }
    /**
     * LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3nullflg() { return _columnLot3nullflg; }
    /**
     * LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4nullflg() { return _columnLot4nullflg; }
    /**
     * LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot5nullflg() { return _columnLot5nullflg; }
    /**
     * OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot1nullflg() { return _columnOtherlot1nullflg; }
    /**
     * OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot2nullflg() { return _columnOtherlot2nullflg; }
    /**
     * OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot3nullflg() { return _columnOtherlot3nullflg; }
    /**
     * OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot4nullflg() { return _columnOtherlot4nullflg; }
    /**
     * OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot5nullflg() { return _columnOtherlot5nullflg; }
    /**
     * ITEMPRINTNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemprintname() { return _columnItemprintname; }
    /**
     * PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPricelevel() { return _columnPricelevel; }
    /**
     * ITEMCATALOGURL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcatalogurl() { return _columnItemcatalogurl; }
    /**
     * USERNUM1: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum1() { return _columnUsernum1; }
    /**
     * USERNUM2: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum2() { return _columnUsernum2; }
    /**
     * USERNUM3: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum3() { return _columnUsernum3; }
    /**
     * USERNUM4: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum4() { return _columnUsernum4; }
    /**
     * USERNUM5: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum5() { return _columnUsernum5; }
    /**
     * USERDATE1: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserdate1() { return _columnUserdate1; }
    /**
     * USERDATE2: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserdate2() { return _columnUserdate2; }
    /**
     * USERDATE3: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserdate3() { return _columnUserdate3; }
    /**
     * USERDATE4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserdate4() { return _columnUserdate4; }
    /**
     * USERDATE5: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserdate5() { return _columnUserdate5; }
    /**
     * CGGDID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCggdid() { return _columnCggdid; }
    /**
     * BRCTG: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrctg() { return _columnBrctg; }
    /**
     * CTWEIGHT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtweight() { return _columnCtweight; }
    /**
     * BXOSZL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxoszl() { return _columnBxoszl; }
    /**
     * BXOSZW: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxoszw() { return _columnBxoszw; }
    /**
     * BXOSZH: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxoszh() { return _columnBxoszh; }
    /**
     * BXCPY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxcpy() { return _columnBxcpy; }
    /**
     * BXWEIGHT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxweight() { return _columnBxweight; }
    /**
     * ITEM_ADMIN: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemAdmin() { return _columnItemAdmin; }
    /**
     * SNAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSname() { return _columnSname; }
    /**
     * FractionPieceWeight: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFractionpieceweight() { return _columnFractionpieceweight; }
    /**
     * TaxEquivalentNumber: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaxequivalentnumber() { return _columnTaxequivalentnumber; }
    /**
     * SYHNKBNJT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSyhnkbnjt() { return _columnSyhnkbnjt; }
    /**
     * IOID_CLS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIoidCls() { return _columnIoidCls; }
    /**
     * ITFCD_CLS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItfcdCls() { return _columnItfcdCls; }
    /**
     * MANUITEMCD_CLS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManuitemcdCls() { return _columnManuitemcdCls; }
    /**
     * CTCPY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtcpy() { return _columnCtcpy; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductId());
        ls.add(columnClientId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnProductAbbr());
        ls.add(columnJanCd());
        ls.add(columnLotManagFlg());
        ls.add(columnLimitDtManagFlg());
        ls.add(columnReceiveLimitNum());
        ls.add(columnShippingLimitNum());
        ls.add(columnMergeCls());
        ls.add(columnLotReverseFlg());
        ls.add(columnLimitDtReverseFlg());
        ls.add(columnShippingStopFlg());
        ls.add(columnFixedPoint());
        ls.add(columnShapeGrpId());
        ls.add(columnNmfcCode());
        ls.add(columnFreightCls());
        ls.add(columnCounntryOfOrigin());
        ls.add(columnUnitVal());
        ls.add(columnHtsCd());
        ls.add(columnItemgroup());
        ls.add(columnActflg());
        ls.add(columnInvtype());
        ls.add(columnSetitemflg());
        ls.add(columnOwneritemcd());
        ls.add(columnSupplieritemcd());
        ls.add(columnPositemcd());
        ls.add(columnItfcd());
        ls.add(columnManuitemcd());
        ls.add(columnPriceBuy());
        ls.add(columnPriceWholesale());
        ls.add(columnPriceSale());
        ls.add(columnAllocpolicykey());
        ls.add(columnSlotpolicykey());
        ls.add(columnInworkingkey());
        ls.add(columnOutworkingkey());
        ls.add(columnAbctype());
        ls.add(columnQty1type());
        ls.add(columnUnit1());
        ls.add(columnUnit1style());
        ls.add(columnLength1());
        ls.add(columnWidth1());
        ls.add(columnHeight1());
        ls.add(columnGrossweight1());
        ls.add(columnNetweight1());
        ls.add(columnCube1());
        ls.add(columnLiter1());
        ls.add(columnUnit2());
        ls.add(columnUnit2style());
        ls.add(columnLength2());
        ls.add(columnWidth2());
        ls.add(columnHeight2());
        ls.add(columnGrossweight2());
        ls.add(columnNetweight2());
        ls.add(columnCube2());
        ls.add(columnLiter2());
        ls.add(columnUnit3());
        ls.add(columnUnit3style());
        ls.add(columnLength3());
        ls.add(columnWidth3());
        ls.add(columnHeight3());
        ls.add(columnGrossweight3());
        ls.add(columnNetweight3());
        ls.add(columnCube3());
        ls.add(columnLiter3());
        ls.add(columnPQty());
        ls.add(columnPHeight());
        ls.add(columnPOdd());
        ls.add(columnPDescription());
        ls.add(columnNotes());
        ls.add(columnQty2usedflg());
        ls.add(columnQty2style());
        ls.add(columnQty3usedflg());
        ls.add(columnQty3style());
        ls.add(columnSpCalcflg());
        ls.add(columnSpLotatrb1usedflg());
        ls.add(columnSpOperator1());
        ls.add(columnSpLotatrb2usedflg());
        ls.add(columnSpOperator2());
        ls.add(columnSpLotatrb3usedflg());
        ls.add(columnSpOperator3());
        ls.add(columnSpRate());
        ls.add(columnLotatrb1title());
        ls.add(columnLotatrb2title());
        ls.add(columnLotatrb3title());
        ls.add(columnLotatrb4title());
        ls.add(columnLotatrb5title());
        ls.add(columnLotatrb6title());
        ls.add(columnLotatrb7title());
        ls.add(columnLotatrb8title());
        ls.add(columnLotatrb9title());
        ls.add(columnLotatrb10title());
        ls.add(columnFUser1());
        ls.add(columnFUser2());
        ls.add(columnFUser3());
        ls.add(columnFUser4());
        ls.add(columnFUser5());
        ls.add(columnItem40());
        ls.add(columnPriceInsurance());
        ls.add(columnLimitday());
        ls.add(columnDeliverableday());
        ls.add(columnPrintdateflg());
        ls.add(columnSuppliercd());
        ls.add(columnDispatchqtytype());
        ls.add(columnTariffqtytype());
        ls.add(columnUseruse1());
        ls.add(columnUseruse2());
        ls.add(columnUseruse3());
        ls.add(columnUseruse4());
        ls.add(columnUseruse5());
        ls.add(columnLot1nullflg());
        ls.add(columnLot2nullflg());
        ls.add(columnLot3nullflg());
        ls.add(columnLot4nullflg());
        ls.add(columnLot5nullflg());
        ls.add(columnOtherlot1nullflg());
        ls.add(columnOtherlot2nullflg());
        ls.add(columnOtherlot3nullflg());
        ls.add(columnOtherlot4nullflg());
        ls.add(columnOtherlot5nullflg());
        ls.add(columnItemprintname());
        ls.add(columnPricelevel());
        ls.add(columnItemcatalogurl());
        ls.add(columnUsernum1());
        ls.add(columnUsernum2());
        ls.add(columnUsernum3());
        ls.add(columnUsernum4());
        ls.add(columnUsernum5());
        ls.add(columnUserdate1());
        ls.add(columnUserdate2());
        ls.add(columnUserdate3());
        ls.add(columnUserdate4());
        ls.add(columnUserdate5());
        ls.add(columnCggdid());
        ls.add(columnBrctg());
        ls.add(columnCtweight());
        ls.add(columnBxoszl());
        ls.add(columnBxoszw());
        ls.add(columnBxoszh());
        ls.add(columnBxcpy());
        ls.add(columnBxweight());
        ls.add(columnItemAdmin());
        ls.add(columnSname());
        ls.add(columnFractionpieceweight());
        ls.add(columnTaxequivalentnumber());
        ls.add(columnSyhnkbnjt());
        ls.add(columnIoidCls());
        ls.add(columnItfcdCls());
        ls.add(columnManuitemcdCls());
        ls.add(columnCtcpy());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnProductId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnClientId());
        ls.add(columnProductCd());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("M_PRODUCT_FK2", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MProductList", false);
    }
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProductSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProductSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("M_PRODUCT_FK1", "MProductSelf", this, MProductDbm.getInstance(), mp, 1, null, true, false, false, false, null, null, false, "MProductSelfAsOne", false);
    }
    /**
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShapeGrp() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeGrpId(), MShapeGrpDbm.getInstance().columnShapeGrpId());
        return cfi("M_PRODUCT_FK3", "MShapeGrp", this, MShapeGrpDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "MProductList", false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLimitDtManagFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLimitDtManagFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_LIMIT_DT_MANAG_FLG", "BClassDtlByLimitDtManagFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIMIT_DT_MANAG_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLimitDtReverseFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLimitDtReverseFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_LIMIT_DT_REVERSE_FLG", "BClassDtlByLimitDtReverseFlg", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIMIT_DT_REVERSE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLotManagFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotManagFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_LOT_MANAG_FLG", "BClassDtlByLotManagFlg", this, BClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LOT_MANAG_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLotReverseFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotReverseFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_LOT_REVERSE_FLG", "BClassDtlByLotReverseFlg", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LOT_REVERSE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my MERGE_CLS, named 'BClassDtlByMergeCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByMergeCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMergeCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_MERGE_CLS", "BClassDtlByMergeCls", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'MERGE_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByShippingStopFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingStopFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_SHIPPING_STOP_FLG", "BClassDtlByShippingStopFlg", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SHIPPING_STOP_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my FREIGHT_CLS, named 'BClassDtlByFreightCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByFreightCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFreightCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_FREIGHT_CLS", "BClassDtlByFreightCls", this, BClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'FREIGHT_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * M_PRODUCT by PRODUCT_ID, named 'MProductSelfAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMProductSelfAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("M_PRODUCT_FK1", "MProductSelfAsOne", this, MProductDbm.getInstance(), mp, 11, null, true, false, true, false, null, null, false, "MProductSelf", false);
    }
    /**
     * M_PRODUCT_TERM by PRODUCT_ID, named 'MProductTermAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMProductTermAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductTermDbm.getInstance().columnProductId());
        return cfi("M_PRODUCT_TERM_FK1", "MProductTermAsOne", this, MProductTermDbm.getInstance(), mp, 12, null, true, false, true, false, null, null, false, "MProduct", false);
    }
    /**
     * M_SET_PARENT by PRODUCT_ID, named 'MSetParentAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMSetParentAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MSetParentDbm.getInstance().columnProductId());
        return cfi("M_SET_PARENT_FK1", "MSetParentAsOne", this, MSetParentDbm.getInstance(), mp, 13, null, true, false, true, false, null, null, false, "MProduct", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_LOCATION by REPLENISH_PRODUCT_ID, named 'MLocationList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMLocationList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MLocationDbm.getInstance().columnReplenishProductId());
        return cri("M_LOCATION_FK2", "MLocationList", this, MLocationDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * M_MFWHxITEM by PRODUCT_ID, named 'MMfwhxitemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMMfwhxitemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MMfwhxitemDbm.getInstance().columnProductId());
        return cri("M_MFWHxITEM_FK1", "MMfwhxitemList", this, MMfwhxitemDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * M_PRODUCT_SHAPE by PRODUCT_ID, named 'MProductShapeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMProductShapeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductShapeDbm.getInstance().columnProductId());
        return cri("M_PRODUCT_SHAPE_FK2", "MProductShapeList", this, MProductShapeDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * M_SET_STRUCTURE by PRODUCT_ID, named 'MSetStructureList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMSetStructureList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MSetStructureDbm.getInstance().columnProductId());
        return cri("M_SET_STRUCTURE_FK2", "MSetStructureList", this, MSetStructureDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * T_ALLOC_INST_B by PRODUCT_ID, named 'TAllocInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TAllocInstBDbm.getInstance().columnProductId());
        return cri("T_ALLOC_INST_B_FK2", "TAllocInstBList", this, TAllocInstBDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * T_ALLOC_LOT by PRODUCT_ID, named 'TAllocLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TAllocLotDbm.getInstance().columnProductId());
        return cri("T_ALLOC_LOT_FK4", "TAllocLotList", this, TAllocLotDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * T_INVENTORY_B by PRODUCT_ID, named 'TInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TInventoryBDbm.getInstance().columnProductId());
        return cri("T_INVENTORY_B_FK3", "TInventoryBList", this, TInventoryBDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * T_KEEPING_LOT by PRODUCT_ID, named 'TKeepingLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTKeepingLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TKeepingLotDbm.getInstance().columnProductId());
        return cri("T_KEEPING_LOT_FK1", "TKeepingLotList", this, TKeepingLotDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * T_LAST_LOT by PRODUCT_ID, named 'TLastLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTLastLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TLastLotDbm.getInstance().columnProductId());
        return cri("T_LAST_LOT_FK3", "TLastLotList", this, TLastLotDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * T_LOT by PRODUCT_ID, named 'TLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TLotDbm.getInstance().columnProductId());
        return cri("T_LOT_FK1", "TLotList", this, TLotDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * T_MOVE_INST_B by PRODUCT_ID, named 'TMoveInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TMoveInstBDbm.getInstance().columnProductId());
        return cri("T_MOVE_INST_B_FK6", "TMoveInstBList", this, TMoveInstBDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * T_RECEIVE_PLAN_B by PRODUCT_ID, named 'TReceivePlanBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TReceivePlanBDbm.getInstance().columnProductId());
        return cri("T_RECEIVE_PLAN_B_FK4", "TReceivePlanBList", this, TReceivePlanBDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * T_SERIAL_NO by PRODUCT_ID, named 'TSerialNoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTSerialNoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TSerialNoDbm.getInstance().columnProductId());
        return cri("T_SERIAL_NO_FK2", "TSerialNoList", this, TSerialNoDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * T_SHIPPING_INST_B by PRODUCT_ID, named 'TShippingInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TShippingInstBDbm.getInstance().columnProductId());
        return cri("T_SHIPPING_INST_B_FK9", "TShippingInstBList", this, TShippingInstBDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * T_STOCK by PRODUCT_ID, named 'TStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TStockDbm.getInstance().columnProductId());
        return cri("T_STOCK_FK8", "TStockList", this, TStockDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * T_TRINVCHECKINFO by PRODUCT_ID, named 'TTrinvcheckinfoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrinvcheckinfoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TTrinvcheckinfoDbm.getInstance().columnProductId());
        return cri("T_TRINVCHECKINFO_FK3", "TTrinvcheckinfoList", this, TTrinvcheckinfoDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * T_YTRSODETAIL by PRODUCT_ID, named 'TYtrsodetailList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTYtrsodetailList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TYtrsodetailDbm.getInstance().columnProductId());
        return cri("T_YTRSODETAIL_FK1", "TYtrsodetailList", this, TYtrsodetailDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * W_HT_INVENTORY_INPUT_PROD by PRODUCT_ID, named 'WHtInventoryInputProdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtInventoryInputProdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WHtInventoryInputProdDbm.getInstance().columnProductId());
        return cri("W_HT_INVENTORY_INPUT_PROD_FK8", "WHtInventoryInputProdList", this, WHtInventoryInputProdDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * W_HT_RECEIVE_INSPECTION by PRODUCT_ID, named 'WHtReceiveInspectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveInspectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WHtReceiveInspectionDbm.getInstance().columnProductId());
        return cri("W_HT_RECEIVE_INSPECTION_FK1", "WHtReceiveInspectionList", this, WHtReceiveInspectionDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * W_HT_RECEIVE_NO_PLAN_INSP by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveNoPlanInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WHtReceiveNoPlanInspDbm.getInstance().columnProductId());
        return cri("W_HT_RECEIVE_NO_PLAN_INSP_FK1", "WHtReceiveNoPlanInspList", this, WHtReceiveNoPlanInspDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * W_HT_RECEIVE_STORE by PRODUCT_ID, named 'WHtReceiveStoreList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveStoreList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WHtReceiveStoreDbm.getInstance().columnProductId());
        return cri("W_HT_RECEIVE_STORE_FK5", "WHtReceiveStoreList", this, WHtReceiveStoreDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * W_HT_SHIPPING by PRODUCT_ID, named 'WHtShippingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WHtShippingDbm.getInstance().columnProductId());
        return cri("W_HT_SHIPPING_FK2", "WHtShippingList", this, WHtShippingDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * W_HT_SHIPPING_PICKING by PRODUCT_ID, named 'WHtShippingPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WHtShippingPickingDbm.getInstance().columnProductId());
        return cri("W_HT_SHIPPING_PICKING_FK5", "WHtShippingPickingList", this, WHtShippingPickingDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * W_SGL_ROW_SHIP_INSP_H by PRODUCT_ID, named 'WSglRowShipInspHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWSglRowShipInspHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WSglRowShipInspHDbm.getInstance().columnProductId());
        return cri("W_SGL_ROW_SHIP_INSP_H_FK1", "WSglRowShipInspHList", this, WSglRowShipInspHDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * W_SHIPPING_INTERRUPT by PRODUCT_ID, named 'WShippingInterruptList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWShippingInterruptList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WShippingInterruptDbm.getInstance().columnProductId());
        return cri("W_SHIPPING_INTERRUPT_FK3", "WShippingInterruptList", this, WShippingInterruptDbm.getInstance(), mp, false, "MProduct");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MProduct"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MProductCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MProduct> getEntityType() { return MProduct.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MProduct newEntity() { return new MProduct(); }
    public MProduct newMyEntity() { return new MProduct(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MProduct)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MProduct)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
