package com.oneslogi.base.dbflute.dtomapper.bs;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.InstanceKeyEntity;
import org.dbflute.dbmeta.dtomap.DtoMapper;
import org.dbflute.dbmeta.dtomap.InstanceKeyDto;
import org.dbflute.helper.beans.DfBeanDesc;
import org.dbflute.helper.beans.DfPropertyDesc;
import org.dbflute.helper.beans.factory.DfBeanDescFactory;
import org.dbflute.jdbc.Classification;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.dto.*;
import com.oneslogi.base.dbflute.dtomapper.*;

/**
 * The DTO mapper of M_PRODUCT as TABLE. <br>
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
public abstract class BsMProductDtoMapper implements DtoMapper<MProduct, MProductDto>, Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final Map<Entity, Object> _relationDtoMap;
    protected final Map<Object, Entity> _relationEntityMap;
    protected boolean _exceptCommonColumn;
    protected boolean _reverseReference; // default: one-way reference
    protected boolean _instanceCache = true; // default: cached
    protected boolean _suppressMClient;
    protected boolean _suppressMProductSelf;
    protected boolean _suppressMShapeGrp;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressBClassDtlByLimitDtManagFlg;
    protected boolean _suppressBClassDtlByLimitDtReverseFlg;
    protected boolean _suppressBClassDtlByLotManagFlg;
    protected boolean _suppressBClassDtlByLotReverseFlg;
    protected boolean _suppressBClassDtlByMergeCls;
    protected boolean _suppressBClassDtlByShippingStopFlg;
    protected boolean _suppressBClassDtlByFreightCls;
    protected boolean _suppressMLocationList;
    protected boolean _suppressMMfwhxitemList;
    protected boolean _suppressMProductSelfAsOne;
    protected boolean _suppressMProductShapeList;
    protected boolean _suppressMProductTermAsOne;
    protected boolean _suppressMSetParentAsOne;
    protected boolean _suppressMSetStructureList;
    protected boolean _suppressTAllocInstBList;
    protected boolean _suppressTAllocLotList;
    protected boolean _suppressTInventoryBList;
    protected boolean _suppressTKeepingLotList;
    protected boolean _suppressTLastLotList;
    protected boolean _suppressTLotList;
    protected boolean _suppressTMoveInstBList;
    protected boolean _suppressTReceivePlanBList;
    protected boolean _suppressTSerialNoList;
    protected boolean _suppressTShippingInstBList;
    protected boolean _suppressTStockList;
    protected boolean _suppressTTrinvcheckinfoList;
    protected boolean _suppressTYtrsodetailList;
    protected boolean _suppressWHtInventoryInputProdList;
    protected boolean _suppressWHtReceiveInspectionList;
    protected boolean _suppressWHtReceiveNoPlanInspList;
    protected boolean _suppressWHtReceiveStoreList;
    protected boolean _suppressWHtShippingList;
    protected boolean _suppressWHtShippingPickingList;
    protected boolean _suppressWSglRowShipInspHList;
    protected boolean _suppressWShippingInterruptList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMProductDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMProductDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        _relationDtoMap = relationDtoMap;
        _relationEntityMap = relationEntityMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    // -----------------------------------------------------
    //                                                to DTO
    //                                                ------
    /**
     * {@inheritDoc}
     */
    public MProductDto mappingToDto(MProduct entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MProductDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MProductDto dto = new MProductDto();
        dto.setProductId(entity.getProductId());
        dto.setClientId(entity.getClientId());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setProductAbbr(entity.getProductAbbr());
        dto.setJanCd(entity.getJanCd());
        dto.setLotManagFlg(entity.getLotManagFlg());
        dto.setLimitDtManagFlg(entity.getLimitDtManagFlg());
        dto.setReceiveLimitNum(entity.getReceiveLimitNum());
        dto.setShippingLimitNum(entity.getShippingLimitNum());
        dto.setMergeCls(entity.getMergeCls());
        dto.setLotReverseFlg(entity.getLotReverseFlg());
        dto.setLimitDtReverseFlg(entity.getLimitDtReverseFlg());
        dto.setShippingStopFlg(entity.getShippingStopFlg());
        dto.setFixedPoint(entity.getFixedPoint());
        dto.setShapeGrpId(entity.getShapeGrpId());
        dto.setNmfcCode(entity.getNmfcCode());
        dto.setFreightCls(entity.getFreightCls());
        dto.setCounntryOfOrigin(entity.getCounntryOfOrigin());
        dto.setUnitVal(entity.getUnitVal());
        dto.setHtsCd(entity.getHtsCd());
        dto.setItemgroup(entity.getItemgroup());
        dto.setActflg(entity.getActflg());
        dto.setInvtype(entity.getInvtype());
        dto.setSetitemflg(entity.getSetitemflg());
        dto.setOwneritemcd(entity.getOwneritemcd());
        dto.setSupplieritemcd(entity.getSupplieritemcd());
        dto.setPositemcd(entity.getPositemcd());
        dto.setItfcd(entity.getItfcd());
        dto.setManuitemcd(entity.getManuitemcd());
        dto.setPriceBuy(entity.getPriceBuy());
        dto.setPriceWholesale(entity.getPriceWholesale());
        dto.setPriceSale(entity.getPriceSale());
        dto.setAllocpolicykey(entity.getAllocpolicykey());
        dto.setSlotpolicykey(entity.getSlotpolicykey());
        dto.setInworkingkey(entity.getInworkingkey());
        dto.setOutworkingkey(entity.getOutworkingkey());
        dto.setAbctype(entity.getAbctype());
        dto.setQty1type(entity.getQty1type());
        dto.setUnit1(entity.getUnit1());
        dto.setUnit1style(entity.getUnit1style());
        dto.setLength1(entity.getLength1());
        dto.setWidth1(entity.getWidth1());
        dto.setHeight1(entity.getHeight1());
        dto.setGrossweight1(entity.getGrossweight1());
        dto.setNetweight1(entity.getNetweight1());
        dto.setCube1(entity.getCube1());
        dto.setLiter1(entity.getLiter1());
        dto.setUnit2(entity.getUnit2());
        dto.setUnit2style(entity.getUnit2style());
        dto.setLength2(entity.getLength2());
        dto.setWidth2(entity.getWidth2());
        dto.setHeight2(entity.getHeight2());
        dto.setGrossweight2(entity.getGrossweight2());
        dto.setNetweight2(entity.getNetweight2());
        dto.setCube2(entity.getCube2());
        dto.setLiter2(entity.getLiter2());
        dto.setUnit3(entity.getUnit3());
        dto.setUnit3style(entity.getUnit3style());
        dto.setLength3(entity.getLength3());
        dto.setWidth3(entity.getWidth3());
        dto.setHeight3(entity.getHeight3());
        dto.setGrossweight3(entity.getGrossweight3());
        dto.setNetweight3(entity.getNetweight3());
        dto.setCube3(entity.getCube3());
        dto.setLiter3(entity.getLiter3());
        dto.setPQty(entity.getPQty());
        dto.setPHeight(entity.getPHeight());
        dto.setPOdd(entity.getPOdd());
        dto.setPDescription(entity.getPDescription());
        dto.setNotes(entity.getNotes());
        dto.setQty2usedflg(entity.getQty2usedflg());
        dto.setQty2style(entity.getQty2style());
        dto.setQty3usedflg(entity.getQty3usedflg());
        dto.setQty3style(entity.getQty3style());
        dto.setSpCalcflg(entity.getSpCalcflg());
        dto.setSpLotatrb1usedflg(entity.getSpLotatrb1usedflg());
        dto.setSpOperator1(entity.getSpOperator1());
        dto.setSpLotatrb2usedflg(entity.getSpLotatrb2usedflg());
        dto.setSpOperator2(entity.getSpOperator2());
        dto.setSpLotatrb3usedflg(entity.getSpLotatrb3usedflg());
        dto.setSpOperator3(entity.getSpOperator3());
        dto.setSpRate(entity.getSpRate());
        dto.setLotatrb1title(entity.getLotatrb1title());
        dto.setLotatrb2title(entity.getLotatrb2title());
        dto.setLotatrb3title(entity.getLotatrb3title());
        dto.setLotatrb4title(entity.getLotatrb4title());
        dto.setLotatrb5title(entity.getLotatrb5title());
        dto.setLotatrb6title(entity.getLotatrb6title());
        dto.setLotatrb7title(entity.getLotatrb7title());
        dto.setLotatrb8title(entity.getLotatrb8title());
        dto.setLotatrb9title(entity.getLotatrb9title());
        dto.setLotatrb10title(entity.getLotatrb10title());
        dto.setFUser1(entity.getFUser1());
        dto.setFUser2(entity.getFUser2());
        dto.setFUser3(entity.getFUser3());
        dto.setFUser4(entity.getFUser4());
        dto.setFUser5(entity.getFUser5());
        dto.setItem40(entity.getItem40());
        dto.setPriceInsurance(entity.getPriceInsurance());
        dto.setLimitday(entity.getLimitday());
        dto.setDeliverableday(entity.getDeliverableday());
        dto.setPrintdateflg(entity.getPrintdateflg());
        dto.setSuppliercd(entity.getSuppliercd());
        dto.setDispatchqtytype(entity.getDispatchqtytype());
        dto.setTariffqtytype(entity.getTariffqtytype());
        dto.setUseruse1(entity.getUseruse1());
        dto.setUseruse2(entity.getUseruse2());
        dto.setUseruse3(entity.getUseruse3());
        dto.setUseruse4(entity.getUseruse4());
        dto.setUseruse5(entity.getUseruse5());
        dto.setLot1nullflg(entity.getLot1nullflg());
        dto.setLot2nullflg(entity.getLot2nullflg());
        dto.setLot3nullflg(entity.getLot3nullflg());
        dto.setLot4nullflg(entity.getLot4nullflg());
        dto.setLot5nullflg(entity.getLot5nullflg());
        dto.setOtherlot1nullflg(entity.getOtherlot1nullflg());
        dto.setOtherlot2nullflg(entity.getOtherlot2nullflg());
        dto.setOtherlot3nullflg(entity.getOtherlot3nullflg());
        dto.setOtherlot4nullflg(entity.getOtherlot4nullflg());
        dto.setOtherlot5nullflg(entity.getOtherlot5nullflg());
        dto.setItemprintname(entity.getItemprintname());
        dto.setPricelevel(entity.getPricelevel());
        dto.setItemcatalogurl(entity.getItemcatalogurl());
        dto.setUsernum1(entity.getUsernum1());
        dto.setUsernum2(entity.getUsernum2());
        dto.setUsernum3(entity.getUsernum3());
        dto.setUsernum4(entity.getUsernum4());
        dto.setUsernum5(entity.getUsernum5());
        dto.setUserdate1(entity.getUserdate1());
        dto.setUserdate2(entity.getUserdate2());
        dto.setUserdate3(entity.getUserdate3());
        dto.setUserdate4(entity.getUserdate4());
        dto.setUserdate5(entity.getUserdate5());
        dto.setCggdid(entity.getCggdid());
        dto.setBrctg(entity.getBrctg());
        dto.setCtweight(entity.getCtweight());
        dto.setBxoszl(entity.getBxoszl());
        dto.setBxoszw(entity.getBxoszw());
        dto.setBxoszh(entity.getBxoszh());
        dto.setBxcpy(entity.getBxcpy());
        dto.setBxweight(entity.getBxweight());
        dto.setItemAdmin(entity.getItemAdmin());
        dto.setSname(entity.getSname());
        dto.setFractionpieceweight(entity.getFractionpieceweight());
        dto.setTaxequivalentnumber(entity.getTaxequivalentnumber());
        dto.setSyhnkbnjt(entity.getSyhnkbnjt());
        dto.setIoidCls(entity.getIoidCls());
        dto.setItfcdCls(entity.getItfcdCls());
        dto.setManuitemcdCls(entity.getManuitemcdCls());
        dto.setCtcpy(entity.getCtcpy());
        if (!exceptCommonColumn) {
            dto.setDelFlg(entity.getDelFlg());
        }
        if (!exceptCommonColumn) {
            dto.setVersionNo(entity.getVersionNo());
        }
        if (!exceptCommonColumn) {
            dto.setControlNo(entity.getControlNo());
        }
        if (!exceptCommonColumn) {
            dto.setAddDt(entity.getAddDt());
        }
        if (!exceptCommonColumn) {
            dto.setAddUser(entity.getAddUser());
        }
        if (!exceptCommonColumn) {
            dto.setAddProcess(entity.getAddProcess());
        }
        if (!exceptCommonColumn) {
            dto.setUpdDt(entity.getUpdDt());
        }
        if (!exceptCommonColumn) {
            dto.setUpdUser(entity.getUpdUser());
        }
        if (!exceptCommonColumn) {
            dto.setUpdProcess(entity.getUpdProcess());
        }
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressMClient && entity.getMClient() != null) {
            MClient relationEntity = entity.getMClient();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MClientDto relationDto = (MClientDto)cachedDto;
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getMProductList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProductList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getMProductList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        if (!_suppressMProductSelf && entity.getMProductSelf() != null) {
            MProduct relationEntity = entity.getMProductSelf();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProductDto relationDto = (MProductDto)cachedDto;
                dto.setMProductSelf(relationDto);
                if (reverseReference) {
                    relationDto.setMProductSelfAsOne(dto);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProductSelfAsOne();
                MProductDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProductSelf(relationDto);
                if (reverseReference) {
                    relationDto.setMProductSelfAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProductSelf());
                }
            }
        };
        if (!_suppressMShapeGrp && entity.getMShapeGrp() != null) {
            MShapeGrp relationEntity = entity.getMShapeGrp();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MShapeGrpDto relationDto = (MShapeGrpDto)cachedDto;
                dto.setMShapeGrp(relationDto);
                if (reverseReference) {
                    relationDto.getMProductList().add(dto);
                }
            } else {
                MShapeGrpDtoMapper mapper = new MShapeGrpDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProductList();
                MShapeGrpDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMShapeGrp(relationDto);
                if (reverseReference) {
                    relationDto.getMProductList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMShapeGrp());
                }
            }
        };
        if (!_suppressBClassDtlByDelFlg && entity.getBClassDtlByDelFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDelFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDelFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDelFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDelFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLimitDtManagFlg && entity.getBClassDtlByLimitDtManagFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLimitDtManagFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLimitDtManagFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLimitDtManagFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLimitDtManagFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLimitDtReverseFlg && entity.getBClassDtlByLimitDtReverseFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLimitDtReverseFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLimitDtReverseFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLimitDtReverseFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLimitDtReverseFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLotManagFlg && entity.getBClassDtlByLotManagFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLotManagFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLotManagFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLotManagFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLotManagFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLotReverseFlg && entity.getBClassDtlByLotReverseFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLotReverseFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLotReverseFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLotReverseFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLotReverseFlg());
                }
            }
        };
        if (!_suppressBClassDtlByMergeCls && entity.getBClassDtlByMergeCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByMergeCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByMergeCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByMergeCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByMergeCls());
                }
            }
        };
        if (!_suppressBClassDtlByShippingStopFlg && entity.getBClassDtlByShippingStopFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByShippingStopFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByShippingStopFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByShippingStopFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByShippingStopFlg());
                }
            }
        };
        if (!_suppressBClassDtlByFreightCls && entity.getBClassDtlByFreightCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByFreightCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByFreightCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByFreightCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByFreightCls());
                }
            }
        };
        if (!_suppressMLocationList && !entity.getMLocationList().isEmpty()) {
            MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MLocationDto> relationDtoList = mapper.mappingToDtoList(entity.getMLocationList());
            dto.setMLocationList(relationDtoList);
            if (reverseReference) {
                for (MLocationDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressMMfwhxitemList && !entity.getMMfwhxitemList().isEmpty()) {
            MMfwhxitemDtoMapper mapper = new MMfwhxitemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MMfwhxitemDto> relationDtoList = mapper.mappingToDtoList(entity.getMMfwhxitemList());
            dto.setMMfwhxitemList(relationDtoList);
            if (reverseReference) {
                for (MMfwhxitemDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressMProductSelfAsOne && entity.getMProductSelfAsOne() != null) {
            MProduct relationEntity = entity.getMProductSelfAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProductDto relationDto = (MProductDto)cachedDto;
                dto.setMProductSelfAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setMProductSelf(dto);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProductSelf();
                MProductDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProductSelfAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setMProductSelf(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProductSelfAsOne());
                }
            }
        };
        if (!_suppressMProductShapeList && !entity.getMProductShapeList().isEmpty()) {
            MProductShapeDtoMapper mapper = new MProductShapeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MProductShapeDto> relationDtoList = mapper.mappingToDtoList(entity.getMProductShapeList());
            dto.setMProductShapeList(relationDtoList);
            if (reverseReference) {
                for (MProductShapeDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressMProductTermAsOne && entity.getMProductTermAsOne() != null) {
            MProductTerm relationEntity = entity.getMProductTermAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProductTermDto relationDto = (MProductTermDto)cachedDto;
                dto.setMProductTermAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setMProduct(dto);
                }
            } else {
                MProductTermDtoMapper mapper = new MProductTermDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProduct();
                MProductTermDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProductTermAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setMProduct(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProductTermAsOne());
                }
            }
        };
        if (!_suppressMSetParentAsOne && entity.getMSetParentAsOne() != null) {
            MSetParent relationEntity = entity.getMSetParentAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MSetParentDto relationDto = (MSetParentDto)cachedDto;
                dto.setMSetParentAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setMProduct(dto);
                }
            } else {
                MSetParentDtoMapper mapper = new MSetParentDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProduct();
                MSetParentDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMSetParentAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setMProduct(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMSetParentAsOne());
                }
            }
        };
        if (!_suppressMSetStructureList && !entity.getMSetStructureList().isEmpty()) {
            MSetStructureDtoMapper mapper = new MSetStructureDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MSetStructureDto> relationDtoList = mapper.mappingToDtoList(entity.getMSetStructureList());
            dto.setMSetStructureList(relationDtoList);
            if (reverseReference) {
                for (MSetStructureDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTAllocInstBList && !entity.getTAllocInstBList().isEmpty()) {
            TAllocInstBDtoMapper mapper = new TAllocInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TAllocInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocInstBList());
            dto.setTAllocInstBList(relationDtoList);
            if (reverseReference) {
                for (TAllocInstBDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTAllocLotList && !entity.getTAllocLotList().isEmpty()) {
            TAllocLotDtoMapper mapper = new TAllocLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TAllocLotDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocLotList());
            dto.setTAllocLotList(relationDtoList);
            if (reverseReference) {
                for (TAllocLotDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTInventoryBList && !entity.getTInventoryBList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TInventoryBDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryBList());
            dto.setTInventoryBList(relationDtoList);
            if (reverseReference) {
                for (TInventoryBDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTKeepingLotList && !entity.getTKeepingLotList().isEmpty()) {
            TKeepingLotDtoMapper mapper = new TKeepingLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TKeepingLotDto> relationDtoList = mapper.mappingToDtoList(entity.getTKeepingLotList());
            dto.setTKeepingLotList(relationDtoList);
            if (reverseReference) {
                for (TKeepingLotDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTLastLotList && !entity.getTLastLotList().isEmpty()) {
            TLastLotDtoMapper mapper = new TLastLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TLastLotDto> relationDtoList = mapper.mappingToDtoList(entity.getTLastLotList());
            dto.setTLastLotList(relationDtoList);
            if (reverseReference) {
                for (TLastLotDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTLotList && !entity.getTLotList().isEmpty()) {
            TLotDtoMapper mapper = new TLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TLotDto> relationDtoList = mapper.mappingToDtoList(entity.getTLotList());
            dto.setTLotList(relationDtoList);
            if (reverseReference) {
                for (TLotDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTMoveInstBList && !entity.getTMoveInstBList().isEmpty()) {
            TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TMoveInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTMoveInstBList());
            dto.setTMoveInstBList(relationDtoList);
            if (reverseReference) {
                for (TMoveInstBDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTReceivePlanBList && !entity.getTReceivePlanBList().isEmpty()) {
            TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TReceivePlanBDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceivePlanBList());
            dto.setTReceivePlanBList(relationDtoList);
            if (reverseReference) {
                for (TReceivePlanBDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTSerialNoList && !entity.getTSerialNoList().isEmpty()) {
            TSerialNoDtoMapper mapper = new TSerialNoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TSerialNoDto> relationDtoList = mapper.mappingToDtoList(entity.getTSerialNoList());
            dto.setTSerialNoList(relationDtoList);
            if (reverseReference) {
                for (TSerialNoDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTShippingInstBList && !entity.getTShippingInstBList().isEmpty()) {
            TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TShippingInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstBList());
            dto.setTShippingInstBList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstBDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTStockList && !entity.getTStockList().isEmpty()) {
            TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TStockDto> relationDtoList = mapper.mappingToDtoList(entity.getTStockList());
            dto.setTStockList(relationDtoList);
            if (reverseReference) {
                for (TStockDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTTrinvcheckinfoList && !entity.getTTrinvcheckinfoList().isEmpty()) {
            TTrinvcheckinfoDtoMapper mapper = new TTrinvcheckinfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TTrinvcheckinfoDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrinvcheckinfoList());
            dto.setTTrinvcheckinfoList(relationDtoList);
            if (reverseReference) {
                for (TTrinvcheckinfoDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTYtrsodetailList && !entity.getTYtrsodetailList().isEmpty()) {
            TYtrsodetailDtoMapper mapper = new TYtrsodetailDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TYtrsodetailDto> relationDtoList = mapper.mappingToDtoList(entity.getTYtrsodetailList());
            dto.setTYtrsodetailList(relationDtoList);
            if (reverseReference) {
                for (TYtrsodetailDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWHtInventoryInputProdList && !entity.getWHtInventoryInputProdList().isEmpty()) {
            WHtInventoryInputProdDtoMapper mapper = new WHtInventoryInputProdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtInventoryInputProdDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtInventoryInputProdList());
            dto.setWHtInventoryInputProdList(relationDtoList);
            if (reverseReference) {
                for (WHtInventoryInputProdDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWHtReceiveInspectionList && !entity.getWHtReceiveInspectionList().isEmpty()) {
            WHtReceiveInspectionDtoMapper mapper = new WHtReceiveInspectionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtReceiveInspectionDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveInspectionList());
            dto.setWHtReceiveInspectionList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveInspectionDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspList && !entity.getWHtReceiveNoPlanInspList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtReceiveNoPlanInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveNoPlanInspList());
            dto.setWHtReceiveNoPlanInspList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInspDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWHtReceiveStoreList && !entity.getWHtReceiveStoreList().isEmpty()) {
            WHtReceiveStoreDtoMapper mapper = new WHtReceiveStoreDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtReceiveStoreDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveStoreList());
            dto.setWHtReceiveStoreList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveStoreDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWHtShippingList && !entity.getWHtShippingList().isEmpty()) {
            WHtShippingDtoMapper mapper = new WHtShippingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtShippingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtShippingList());
            dto.setWHtShippingList(relationDtoList);
            if (reverseReference) {
                for (WHtShippingDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWHtShippingPickingList && !entity.getWHtShippingPickingList().isEmpty()) {
            WHtShippingPickingDtoMapper mapper = new WHtShippingPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtShippingPickingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtShippingPickingList());
            dto.setWHtShippingPickingList(relationDtoList);
            if (reverseReference) {
                for (WHtShippingPickingDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWSglRowShipInspHList && !entity.getWSglRowShipInspHList().isEmpty()) {
            WSglRowShipInspHDtoMapper mapper = new WSglRowShipInspHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WSglRowShipInspHDto> relationDtoList = mapper.mappingToDtoList(entity.getWSglRowShipInspHList());
            dto.setWSglRowShipInspHList(relationDtoList);
            if (reverseReference) {
                for (WSglRowShipInspHDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWShippingInterruptList && !entity.getWShippingInterruptList().isEmpty()) {
            WShippingInterruptDtoMapper mapper = new WShippingInterruptDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WShippingInterruptDto> relationDtoList = mapper.mappingToDtoList(entity.getWShippingInterruptList());
            dto.setWShippingInterruptList(relationDtoList);
            if (reverseReference) {
                for (WShippingInterruptDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MProductDto> mappingToDtoList(List<MProduct> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MProductDto> dtoList = new ArrayList<MProductDto>();
        for (MProduct entity : entityList) {
            MProductDto dto = mappingToDto(entity);
            if (dto != null) {
                dtoList.add(dto);
            } else {
                if (isAcceptNullElementOnList()) {
                    dtoList.add(null);
                }
            }
        }
        return dtoList;
    }

    // -----------------------------------------------------
    //                                             to Entity
    //                                             ---------
    /**
     * {@inheritDoc}
     */
    public MProduct mappingToEntity(MProductDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MProduct)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MProduct entity = new MProduct();
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getProductAbbr(), "productAbbr")) {
            entity.setProductAbbr(dto.getProductAbbr());
        }
        if (needsMapping(dto, dto.getJanCd(), "janCd")) {
            entity.setJanCd(dto.getJanCd());
        }
        if (needsMapping(dto, dto.getLotManagFlg(), "lotManagFlg")) {
            entity.setLotManagFlgAsLotManagFlg(CDef.LotManagFlg.codeOf(dto.getLotManagFlg()));
        }
        if (needsMapping(dto, dto.getLimitDtManagFlg(), "limitDtManagFlg")) {
            entity.setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg.codeOf(dto.getLimitDtManagFlg()));
        }
        if (needsMapping(dto, dto.getReceiveLimitNum(), "receiveLimitNum")) {
            entity.setReceiveLimitNum(dto.getReceiveLimitNum());
        }
        if (needsMapping(dto, dto.getShippingLimitNum(), "shippingLimitNum")) {
            entity.setShippingLimitNum(dto.getShippingLimitNum());
        }
        if (needsMapping(dto, dto.getMergeCls(), "mergeCls")) {
            entity.setMergeClsAsMergeCls(CDef.MergeCls.codeOf(dto.getMergeCls()));
        }
        if (needsMapping(dto, dto.getLotReverseFlg(), "lotReverseFlg")) {
            entity.setLotReverseFlgAsLotReverseFlg(CDef.LotReverseFlg.codeOf(dto.getLotReverseFlg()));
        }
        if (needsMapping(dto, dto.getLimitDtReverseFlg(), "limitDtReverseFlg")) {
            entity.setLimitDtReverseFlgAsLimitDtReverseFlg(CDef.LimitDtReverseFlg.codeOf(dto.getLimitDtReverseFlg()));
        }
        if (needsMapping(dto, dto.getShippingStopFlg(), "shippingStopFlg")) {
            entity.setShippingStopFlgAsShippingStopFlg(CDef.ShippingStopFlg.codeOf(dto.getShippingStopFlg()));
        }
        if (needsMapping(dto, dto.getFixedPoint(), "fixedPoint")) {
            entity.setFixedPoint(dto.getFixedPoint());
        }
        if (needsMapping(dto, dto.getShapeGrpId(), "shapeGrpId")) {
            entity.setShapeGrpId(dto.getShapeGrpId());
        }
        if (needsMapping(dto, dto.getNmfcCode(), "nmfcCode")) {
            entity.setNmfcCode(dto.getNmfcCode());
        }
        if (needsMapping(dto, dto.getFreightCls(), "freightCls")) {
            entity.setFreightClsAsFreightCls(CDef.FreightCls.codeOf(dto.getFreightCls()));
        }
        if (needsMapping(dto, dto.getCounntryOfOrigin(), "counntryOfOrigin")) {
            entity.setCounntryOfOrigin(dto.getCounntryOfOrigin());
        }
        if (needsMapping(dto, dto.getUnitVal(), "unitVal")) {
            entity.setUnitVal(dto.getUnitVal());
        }
        if (needsMapping(dto, dto.getHtsCd(), "htsCd")) {
            entity.setHtsCd(dto.getHtsCd());
        }
        if (needsMapping(dto, dto.getItemgroup(), "itemgroup")) {
            entity.setItemgroup(dto.getItemgroup());
        }
        if (needsMapping(dto, dto.getActflg(), "actflg")) {
            entity.setActflg(dto.getActflg());
        }
        if (needsMapping(dto, dto.getInvtype(), "invtype")) {
            entity.setInvtype(dto.getInvtype());
        }
        if (needsMapping(dto, dto.getSetitemflg(), "setitemflg")) {
            entity.setSetitemflg(dto.getSetitemflg());
        }
        if (needsMapping(dto, dto.getOwneritemcd(), "owneritemcd")) {
            entity.setOwneritemcd(dto.getOwneritemcd());
        }
        if (needsMapping(dto, dto.getSupplieritemcd(), "supplieritemcd")) {
            entity.setSupplieritemcd(dto.getSupplieritemcd());
        }
        if (needsMapping(dto, dto.getPositemcd(), "positemcd")) {
            entity.setPositemcd(dto.getPositemcd());
        }
        if (needsMapping(dto, dto.getItfcd(), "itfcd")) {
            entity.setItfcd(dto.getItfcd());
        }
        if (needsMapping(dto, dto.getManuitemcd(), "manuitemcd")) {
            entity.setManuitemcd(dto.getManuitemcd());
        }
        if (needsMapping(dto, dto.getPriceBuy(), "priceBuy")) {
            entity.setPriceBuy(dto.getPriceBuy());
        }
        if (needsMapping(dto, dto.getPriceWholesale(), "priceWholesale")) {
            entity.setPriceWholesale(dto.getPriceWholesale());
        }
        if (needsMapping(dto, dto.getPriceSale(), "priceSale")) {
            entity.setPriceSale(dto.getPriceSale());
        }
        if (needsMapping(dto, dto.getAllocpolicykey(), "allocpolicykey")) {
            entity.setAllocpolicykey(dto.getAllocpolicykey());
        }
        if (needsMapping(dto, dto.getSlotpolicykey(), "slotpolicykey")) {
            entity.setSlotpolicykey(dto.getSlotpolicykey());
        }
        if (needsMapping(dto, dto.getInworkingkey(), "inworkingkey")) {
            entity.setInworkingkey(dto.getInworkingkey());
        }
        if (needsMapping(dto, dto.getOutworkingkey(), "outworkingkey")) {
            entity.setOutworkingkey(dto.getOutworkingkey());
        }
        if (needsMapping(dto, dto.getAbctype(), "abctype")) {
            entity.setAbctype(dto.getAbctype());
        }
        if (needsMapping(dto, dto.getQty1type(), "qty1type")) {
            entity.setQty1type(dto.getQty1type());
        }
        if (needsMapping(dto, dto.getUnit1(), "unit1")) {
            entity.setUnit1(dto.getUnit1());
        }
        if (needsMapping(dto, dto.getUnit1style(), "unit1style")) {
            entity.setUnit1style(dto.getUnit1style());
        }
        if (needsMapping(dto, dto.getLength1(), "length1")) {
            entity.setLength1(dto.getLength1());
        }
        if (needsMapping(dto, dto.getWidth1(), "width1")) {
            entity.setWidth1(dto.getWidth1());
        }
        if (needsMapping(dto, dto.getHeight1(), "height1")) {
            entity.setHeight1(dto.getHeight1());
        }
        if (needsMapping(dto, dto.getGrossweight1(), "grossweight1")) {
            entity.setGrossweight1(dto.getGrossweight1());
        }
        if (needsMapping(dto, dto.getNetweight1(), "netweight1")) {
            entity.setNetweight1(dto.getNetweight1());
        }
        if (needsMapping(dto, dto.getCube1(), "cube1")) {
            entity.setCube1(dto.getCube1());
        }
        if (needsMapping(dto, dto.getLiter1(), "liter1")) {
            entity.setLiter1(dto.getLiter1());
        }
        if (needsMapping(dto, dto.getUnit2(), "unit2")) {
            entity.setUnit2(dto.getUnit2());
        }
        if (needsMapping(dto, dto.getUnit2style(), "unit2style")) {
            entity.setUnit2style(dto.getUnit2style());
        }
        if (needsMapping(dto, dto.getLength2(), "length2")) {
            entity.setLength2(dto.getLength2());
        }
        if (needsMapping(dto, dto.getWidth2(), "width2")) {
            entity.setWidth2(dto.getWidth2());
        }
        if (needsMapping(dto, dto.getHeight2(), "height2")) {
            entity.setHeight2(dto.getHeight2());
        }
        if (needsMapping(dto, dto.getGrossweight2(), "grossweight2")) {
            entity.setGrossweight2(dto.getGrossweight2());
        }
        if (needsMapping(dto, dto.getNetweight2(), "netweight2")) {
            entity.setNetweight2(dto.getNetweight2());
        }
        if (needsMapping(dto, dto.getCube2(), "cube2")) {
            entity.setCube2(dto.getCube2());
        }
        if (needsMapping(dto, dto.getLiter2(), "liter2")) {
            entity.setLiter2(dto.getLiter2());
        }
        if (needsMapping(dto, dto.getUnit3(), "unit3")) {
            entity.setUnit3(dto.getUnit3());
        }
        if (needsMapping(dto, dto.getUnit3style(), "unit3style")) {
            entity.setUnit3style(dto.getUnit3style());
        }
        if (needsMapping(dto, dto.getLength3(), "length3")) {
            entity.setLength3(dto.getLength3());
        }
        if (needsMapping(dto, dto.getWidth3(), "width3")) {
            entity.setWidth3(dto.getWidth3());
        }
        if (needsMapping(dto, dto.getHeight3(), "height3")) {
            entity.setHeight3(dto.getHeight3());
        }
        if (needsMapping(dto, dto.getGrossweight3(), "grossweight3")) {
            entity.setGrossweight3(dto.getGrossweight3());
        }
        if (needsMapping(dto, dto.getNetweight3(), "netweight3")) {
            entity.setNetweight3(dto.getNetweight3());
        }
        if (needsMapping(dto, dto.getCube3(), "cube3")) {
            entity.setCube3(dto.getCube3());
        }
        if (needsMapping(dto, dto.getLiter3(), "liter3")) {
            entity.setLiter3(dto.getLiter3());
        }
        if (needsMapping(dto, dto.getPQty(), "PQty")) {
            entity.setPQty(dto.getPQty());
        }
        if (needsMapping(dto, dto.getPHeight(), "PHeight")) {
            entity.setPHeight(dto.getPHeight());
        }
        if (needsMapping(dto, dto.getPOdd(), "POdd")) {
            entity.setPOdd(dto.getPOdd());
        }
        if (needsMapping(dto, dto.getPDescription(), "PDescription")) {
            entity.setPDescription(dto.getPDescription());
        }
        if (needsMapping(dto, dto.getNotes(), "notes")) {
            entity.setNotes(dto.getNotes());
        }
        if (needsMapping(dto, dto.getQty2usedflg(), "qty2usedflg")) {
            entity.setQty2usedflg(dto.getQty2usedflg());
        }
        if (needsMapping(dto, dto.getQty2style(), "qty2style")) {
            entity.setQty2style(dto.getQty2style());
        }
        if (needsMapping(dto, dto.getQty3usedflg(), "qty3usedflg")) {
            entity.setQty3usedflg(dto.getQty3usedflg());
        }
        if (needsMapping(dto, dto.getQty3style(), "qty3style")) {
            entity.setQty3style(dto.getQty3style());
        }
        if (needsMapping(dto, dto.getSpCalcflg(), "spCalcflg")) {
            entity.setSpCalcflg(dto.getSpCalcflg());
        }
        if (needsMapping(dto, dto.getSpLotatrb1usedflg(), "spLotatrb1usedflg")) {
            entity.setSpLotatrb1usedflg(dto.getSpLotatrb1usedflg());
        }
        if (needsMapping(dto, dto.getSpOperator1(), "spOperator1")) {
            entity.setSpOperator1(dto.getSpOperator1());
        }
        if (needsMapping(dto, dto.getSpLotatrb2usedflg(), "spLotatrb2usedflg")) {
            entity.setSpLotatrb2usedflg(dto.getSpLotatrb2usedflg());
        }
        if (needsMapping(dto, dto.getSpOperator2(), "spOperator2")) {
            entity.setSpOperator2(dto.getSpOperator2());
        }
        if (needsMapping(dto, dto.getSpLotatrb3usedflg(), "spLotatrb3usedflg")) {
            entity.setSpLotatrb3usedflg(dto.getSpLotatrb3usedflg());
        }
        if (needsMapping(dto, dto.getSpOperator3(), "spOperator3")) {
            entity.setSpOperator3(dto.getSpOperator3());
        }
        if (needsMapping(dto, dto.getSpRate(), "spRate")) {
            entity.setSpRate(dto.getSpRate());
        }
        if (needsMapping(dto, dto.getLotatrb1title(), "lotatrb1title")) {
            entity.setLotatrb1title(dto.getLotatrb1title());
        }
        if (needsMapping(dto, dto.getLotatrb2title(), "lotatrb2title")) {
            entity.setLotatrb2title(dto.getLotatrb2title());
        }
        if (needsMapping(dto, dto.getLotatrb3title(), "lotatrb3title")) {
            entity.setLotatrb3title(dto.getLotatrb3title());
        }
        if (needsMapping(dto, dto.getLotatrb4title(), "lotatrb4title")) {
            entity.setLotatrb4title(dto.getLotatrb4title());
        }
        if (needsMapping(dto, dto.getLotatrb5title(), "lotatrb5title")) {
            entity.setLotatrb5title(dto.getLotatrb5title());
        }
        if (needsMapping(dto, dto.getLotatrb6title(), "lotatrb6title")) {
            entity.setLotatrb6title(dto.getLotatrb6title());
        }
        if (needsMapping(dto, dto.getLotatrb7title(), "lotatrb7title")) {
            entity.setLotatrb7title(dto.getLotatrb7title());
        }
        if (needsMapping(dto, dto.getLotatrb8title(), "lotatrb8title")) {
            entity.setLotatrb8title(dto.getLotatrb8title());
        }
        if (needsMapping(dto, dto.getLotatrb9title(), "lotatrb9title")) {
            entity.setLotatrb9title(dto.getLotatrb9title());
        }
        if (needsMapping(dto, dto.getLotatrb10title(), "lotatrb10title")) {
            entity.setLotatrb10title(dto.getLotatrb10title());
        }
        if (needsMapping(dto, dto.getFUser1(), "FUser1")) {
            entity.setFUser1(dto.getFUser1());
        }
        if (needsMapping(dto, dto.getFUser2(), "FUser2")) {
            entity.setFUser2(dto.getFUser2());
        }
        if (needsMapping(dto, dto.getFUser3(), "FUser3")) {
            entity.setFUser3(dto.getFUser3());
        }
        if (needsMapping(dto, dto.getFUser4(), "FUser4")) {
            entity.setFUser4(dto.getFUser4());
        }
        if (needsMapping(dto, dto.getFUser5(), "FUser5")) {
            entity.setFUser5(dto.getFUser5());
        }
        if (needsMapping(dto, dto.getItem40(), "item40")) {
            entity.setItem40(dto.getItem40());
        }
        if (needsMapping(dto, dto.getPriceInsurance(), "priceInsurance")) {
            entity.setPriceInsurance(dto.getPriceInsurance());
        }
        if (needsMapping(dto, dto.getLimitday(), "limitday")) {
            entity.setLimitday(dto.getLimitday());
        }
        if (needsMapping(dto, dto.getDeliverableday(), "deliverableday")) {
            entity.setDeliverableday(dto.getDeliverableday());
        }
        if (needsMapping(dto, dto.getPrintdateflg(), "printdateflg")) {
            entity.setPrintdateflg(dto.getPrintdateflg());
        }
        if (needsMapping(dto, dto.getSuppliercd(), "suppliercd")) {
            entity.setSuppliercd(dto.getSuppliercd());
        }
        if (needsMapping(dto, dto.getDispatchqtytype(), "dispatchqtytype")) {
            entity.setDispatchqtytype(dto.getDispatchqtytype());
        }
        if (needsMapping(dto, dto.getTariffqtytype(), "tariffqtytype")) {
            entity.setTariffqtytype(dto.getTariffqtytype());
        }
        if (needsMapping(dto, dto.getUseruse1(), "useruse1")) {
            entity.setUseruse1(dto.getUseruse1());
        }
        if (needsMapping(dto, dto.getUseruse2(), "useruse2")) {
            entity.setUseruse2(dto.getUseruse2());
        }
        if (needsMapping(dto, dto.getUseruse3(), "useruse3")) {
            entity.setUseruse3(dto.getUseruse3());
        }
        if (needsMapping(dto, dto.getUseruse4(), "useruse4")) {
            entity.setUseruse4(dto.getUseruse4());
        }
        if (needsMapping(dto, dto.getUseruse5(), "useruse5")) {
            entity.setUseruse5(dto.getUseruse5());
        }
        if (needsMapping(dto, dto.getLot1nullflg(), "lot1nullflg")) {
            entity.setLot1nullflg(dto.getLot1nullflg());
        }
        if (needsMapping(dto, dto.getLot2nullflg(), "lot2nullflg")) {
            entity.setLot2nullflg(dto.getLot2nullflg());
        }
        if (needsMapping(dto, dto.getLot3nullflg(), "lot3nullflg")) {
            entity.setLot3nullflg(dto.getLot3nullflg());
        }
        if (needsMapping(dto, dto.getLot4nullflg(), "lot4nullflg")) {
            entity.setLot4nullflg(dto.getLot4nullflg());
        }
        if (needsMapping(dto, dto.getLot5nullflg(), "lot5nullflg")) {
            entity.setLot5nullflg(dto.getLot5nullflg());
        }
        if (needsMapping(dto, dto.getOtherlot1nullflg(), "otherlot1nullflg")) {
            entity.setOtherlot1nullflg(dto.getOtherlot1nullflg());
        }
        if (needsMapping(dto, dto.getOtherlot2nullflg(), "otherlot2nullflg")) {
            entity.setOtherlot2nullflg(dto.getOtherlot2nullflg());
        }
        if (needsMapping(dto, dto.getOtherlot3nullflg(), "otherlot3nullflg")) {
            entity.setOtherlot3nullflg(dto.getOtherlot3nullflg());
        }
        if (needsMapping(dto, dto.getOtherlot4nullflg(), "otherlot4nullflg")) {
            entity.setOtherlot4nullflg(dto.getOtherlot4nullflg());
        }
        if (needsMapping(dto, dto.getOtherlot5nullflg(), "otherlot5nullflg")) {
            entity.setOtherlot5nullflg(dto.getOtherlot5nullflg());
        }
        if (needsMapping(dto, dto.getItemprintname(), "itemprintname")) {
            entity.setItemprintname(dto.getItemprintname());
        }
        if (needsMapping(dto, dto.getPricelevel(), "pricelevel")) {
            entity.setPricelevel(dto.getPricelevel());
        }
        if (needsMapping(dto, dto.getItemcatalogurl(), "itemcatalogurl")) {
            entity.setItemcatalogurl(dto.getItemcatalogurl());
        }
        if (needsMapping(dto, dto.getUsernum1(), "usernum1")) {
            entity.setUsernum1(dto.getUsernum1());
        }
        if (needsMapping(dto, dto.getUsernum2(), "usernum2")) {
            entity.setUsernum2(dto.getUsernum2());
        }
        if (needsMapping(dto, dto.getUsernum3(), "usernum3")) {
            entity.setUsernum3(dto.getUsernum3());
        }
        if (needsMapping(dto, dto.getUsernum4(), "usernum4")) {
            entity.setUsernum4(dto.getUsernum4());
        }
        if (needsMapping(dto, dto.getUsernum5(), "usernum5")) {
            entity.setUsernum5(dto.getUsernum5());
        }
        if (needsMapping(dto, dto.getUserdate1(), "userdate1")) {
            entity.setUserdate1(dto.getUserdate1());
        }
        if (needsMapping(dto, dto.getUserdate2(), "userdate2")) {
            entity.setUserdate2(dto.getUserdate2());
        }
        if (needsMapping(dto, dto.getUserdate3(), "userdate3")) {
            entity.setUserdate3(dto.getUserdate3());
        }
        if (needsMapping(dto, dto.getUserdate4(), "userdate4")) {
            entity.setUserdate4(dto.getUserdate4());
        }
        if (needsMapping(dto, dto.getUserdate5(), "userdate5")) {
            entity.setUserdate5(dto.getUserdate5());
        }
        if (needsMapping(dto, dto.getCggdid(), "cggdid")) {
            entity.setCggdid(dto.getCggdid());
        }
        if (needsMapping(dto, dto.getBrctg(), "brctg")) {
            entity.setBrctg(dto.getBrctg());
        }
        if (needsMapping(dto, dto.getCtweight(), "ctweight")) {
            entity.setCtweight(dto.getCtweight());
        }
        if (needsMapping(dto, dto.getBxoszl(), "bxoszl")) {
            entity.setBxoszl(dto.getBxoszl());
        }
        if (needsMapping(dto, dto.getBxoszw(), "bxoszw")) {
            entity.setBxoszw(dto.getBxoszw());
        }
        if (needsMapping(dto, dto.getBxoszh(), "bxoszh")) {
            entity.setBxoszh(dto.getBxoszh());
        }
        if (needsMapping(dto, dto.getBxcpy(), "bxcpy")) {
            entity.setBxcpy(dto.getBxcpy());
        }
        if (needsMapping(dto, dto.getBxweight(), "bxweight")) {
            entity.setBxweight(dto.getBxweight());
        }
        if (needsMapping(dto, dto.getItemAdmin(), "itemAdmin")) {
            entity.setItemAdmin(dto.getItemAdmin());
        }
        if (needsMapping(dto, dto.getSname(), "sname")) {
            entity.setSname(dto.getSname());
        }
        if (needsMapping(dto, dto.getFractionpieceweight(), "fractionpieceweight")) {
            entity.setFractionpieceweight(dto.getFractionpieceweight());
        }
        if (needsMapping(dto, dto.getTaxequivalentnumber(), "taxequivalentnumber")) {
            entity.setTaxequivalentnumber(dto.getTaxequivalentnumber());
        }
        if (needsMapping(dto, dto.getSyhnkbnjt(), "syhnkbnjt")) {
            entity.setSyhnkbnjt(dto.getSyhnkbnjt());
        }
        if (needsMapping(dto, dto.getIoidCls(), "ioidCls")) {
            entity.setIoidCls(dto.getIoidCls());
        }
        if (needsMapping(dto, dto.getItfcdCls(), "itfcdCls")) {
            entity.setItfcdCls(dto.getItfcdCls());
        }
        if (needsMapping(dto, dto.getManuitemcdCls(), "manuitemcdCls")) {
            entity.setManuitemcdCls(dto.getManuitemcdCls());
        }
        if (needsMapping(dto, dto.getCtcpy(), "ctcpy")) {
            entity.setCtcpy(dto.getCtcpy());
        }
        if (needsMapping(dto, dto.getDelFlg(), "delFlg") && !exceptCommonColumn) {
            entity.setDelFlgAsDelFlg(CDef.DelFlg.codeOf(dto.getDelFlg()));
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo") && !exceptCommonColumn) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getControlNo(), "controlNo") && !exceptCommonColumn) {
            entity.setControlNo(dto.getControlNo());
        }
        if (needsMapping(dto, dto.getAddDt(), "addDt") && !exceptCommonColumn) {
            entity.setAddDt(dto.getAddDt());
        }
        if (needsMapping(dto, dto.getAddUser(), "addUser") && !exceptCommonColumn) {
            entity.setAddUser(dto.getAddUser());
        }
        if (needsMapping(dto, dto.getAddProcess(), "addProcess") && !exceptCommonColumn) {
            entity.setAddProcess(dto.getAddProcess());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt") && !exceptCommonColumn) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getUpdUser(), "updUser") && !exceptCommonColumn) {
            entity.setUpdUser(dto.getUpdUser());
        }
        if (needsMapping(dto, dto.getUpdProcess(), "updProcess") && !exceptCommonColumn) {
            entity.setUpdProcess(dto.getUpdProcess());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressMClient && dto.getMClient() != null) {
            MClientDto relationDto = dto.getMClient();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MClient relationEntity = (MClient)cachedEntity;
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getMProductList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProductList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getMProductList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
                }
            }
        };
        if (!_suppressMProductSelf && dto.getMProductSelf() != null) {
            MProductDto relationDto = dto.getMProductSelf();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProduct relationEntity = (MProduct)cachedEntity;
                entity.setMProductSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.setMProductSelfAsOne(entity);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProductSelfAsOne();
                MProduct relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProductSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.setMProductSelfAsOne(entity);
                }
                if (instanceCache && entity.getMProductSelf().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProductSelf());
                }
            }
        };
        if (!_suppressMShapeGrp && dto.getMShapeGrp() != null) {
            MShapeGrpDto relationDto = dto.getMShapeGrp();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MShapeGrp relationEntity = (MShapeGrp)cachedEntity;
                entity.setMShapeGrp(relationEntity);
                if (reverseReference) {
                    relationEntity.getMProductList().add(entity);
                }
            } else {
                MShapeGrpDtoMapper mapper = new MShapeGrpDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProductList();
                MShapeGrp relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMShapeGrp(relationEntity);
                if (reverseReference) {
                    relationEntity.getMProductList().add(entity);
                }
                if (instanceCache && entity.getMShapeGrp().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMShapeGrp());
                }
            }
        };
        if (!_suppressBClassDtlByDelFlg && dto.getBClassDtlByDelFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDelFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDelFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDelFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDelFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDelFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLimitDtManagFlg && dto.getBClassDtlByLimitDtManagFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLimitDtManagFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLimitDtManagFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLimitDtManagFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLimitDtManagFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLimitDtManagFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLimitDtReverseFlg && dto.getBClassDtlByLimitDtReverseFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLimitDtReverseFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLimitDtReverseFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLimitDtReverseFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLimitDtReverseFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLimitDtReverseFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLotManagFlg && dto.getBClassDtlByLotManagFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLotManagFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLotManagFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLotManagFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLotManagFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLotManagFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLotReverseFlg && dto.getBClassDtlByLotReverseFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLotReverseFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLotReverseFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLotReverseFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLotReverseFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLotReverseFlg());
                }
            }
        };
        if (!_suppressBClassDtlByMergeCls && dto.getBClassDtlByMergeCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByMergeCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByMergeCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByMergeCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByMergeCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByMergeCls());
                }
            }
        };
        if (!_suppressBClassDtlByShippingStopFlg && dto.getBClassDtlByShippingStopFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByShippingStopFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByShippingStopFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByShippingStopFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByShippingStopFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByShippingStopFlg());
                }
            }
        };
        if (!_suppressBClassDtlByFreightCls && dto.getBClassDtlByFreightCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByFreightCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByFreightCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByFreightCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByFreightCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByFreightCls());
                }
            }
        };
        if (!_suppressMLocationList && !dto.getMLocationList().isEmpty()) {
            MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MLocation> relationEntityList = mapper.mappingToEntityList(dto.getMLocationList());
            entity.setMLocationList(relationEntityList);
            if (reverseReference) {
                for (MLocation relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressMMfwhxitemList && !dto.getMMfwhxitemList().isEmpty()) {
            MMfwhxitemDtoMapper mapper = new MMfwhxitemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MMfwhxitem> relationEntityList = mapper.mappingToEntityList(dto.getMMfwhxitemList());
            entity.setMMfwhxitemList(relationEntityList);
            if (reverseReference) {
                for (MMfwhxitem relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressMProductSelfAsOne && dto.getMProductSelfAsOne() != null) {
            MProductDto relationDto = dto.getMProductSelfAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProduct relationEntity = (MProduct)cachedEntity;
                entity.setMProductSelfAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setMProductSelf(entity);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProductSelf();
                MProduct relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProductSelfAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setMProductSelf(entity);
                }
                if (instanceCache && entity.getMProductSelfAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProductSelfAsOne());
                }
            }
        };
        if (!_suppressMProductShapeList && !dto.getMProductShapeList().isEmpty()) {
            MProductShapeDtoMapper mapper = new MProductShapeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MProductShape> relationEntityList = mapper.mappingToEntityList(dto.getMProductShapeList());
            entity.setMProductShapeList(relationEntityList);
            if (reverseReference) {
                for (MProductShape relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressMProductTermAsOne && dto.getMProductTermAsOne() != null) {
            MProductTermDto relationDto = dto.getMProductTermAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProductTerm relationEntity = (MProductTerm)cachedEntity;
                entity.setMProductTermAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setMProduct(entity);
                }
            } else {
                MProductTermDtoMapper mapper = new MProductTermDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProduct();
                MProductTerm relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProductTermAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setMProduct(entity);
                }
                if (instanceCache && entity.getMProductTermAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProductTermAsOne());
                }
            }
        };
        if (!_suppressMSetParentAsOne && dto.getMSetParentAsOne() != null) {
            MSetParentDto relationDto = dto.getMSetParentAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MSetParent relationEntity = (MSetParent)cachedEntity;
                entity.setMSetParentAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setMProduct(entity);
                }
            } else {
                MSetParentDtoMapper mapper = new MSetParentDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProduct();
                MSetParent relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMSetParentAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setMProduct(entity);
                }
                if (instanceCache && entity.getMSetParentAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMSetParentAsOne());
                }
            }
        };
        if (!_suppressMSetStructureList && !dto.getMSetStructureList().isEmpty()) {
            MSetStructureDtoMapper mapper = new MSetStructureDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MSetStructure> relationEntityList = mapper.mappingToEntityList(dto.getMSetStructureList());
            entity.setMSetStructureList(relationEntityList);
            if (reverseReference) {
                for (MSetStructure relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTAllocInstBList && !dto.getTAllocInstBList().isEmpty()) {
            TAllocInstBDtoMapper mapper = new TAllocInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TAllocInstB> relationEntityList = mapper.mappingToEntityList(dto.getTAllocInstBList());
            entity.setTAllocInstBList(relationEntityList);
            if (reverseReference) {
                for (TAllocInstB relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTAllocLotList && !dto.getTAllocLotList().isEmpty()) {
            TAllocLotDtoMapper mapper = new TAllocLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TAllocLot> relationEntityList = mapper.mappingToEntityList(dto.getTAllocLotList());
            entity.setTAllocLotList(relationEntityList);
            if (reverseReference) {
                for (TAllocLot relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTInventoryBList && !dto.getTInventoryBList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TInventoryB> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryBList());
            entity.setTInventoryBList(relationEntityList);
            if (reverseReference) {
                for (TInventoryB relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTKeepingLotList && !dto.getTKeepingLotList().isEmpty()) {
            TKeepingLotDtoMapper mapper = new TKeepingLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TKeepingLot> relationEntityList = mapper.mappingToEntityList(dto.getTKeepingLotList());
            entity.setTKeepingLotList(relationEntityList);
            if (reverseReference) {
                for (TKeepingLot relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTLastLotList && !dto.getTLastLotList().isEmpty()) {
            TLastLotDtoMapper mapper = new TLastLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TLastLot> relationEntityList = mapper.mappingToEntityList(dto.getTLastLotList());
            entity.setTLastLotList(relationEntityList);
            if (reverseReference) {
                for (TLastLot relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTLotList && !dto.getTLotList().isEmpty()) {
            TLotDtoMapper mapper = new TLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TLot> relationEntityList = mapper.mappingToEntityList(dto.getTLotList());
            entity.setTLotList(relationEntityList);
            if (reverseReference) {
                for (TLot relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTMoveInstBList && !dto.getTMoveInstBList().isEmpty()) {
            TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TMoveInstB> relationEntityList = mapper.mappingToEntityList(dto.getTMoveInstBList());
            entity.setTMoveInstBList(relationEntityList);
            if (reverseReference) {
                for (TMoveInstB relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTReceivePlanBList && !dto.getTReceivePlanBList().isEmpty()) {
            TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TReceivePlanB> relationEntityList = mapper.mappingToEntityList(dto.getTReceivePlanBList());
            entity.setTReceivePlanBList(relationEntityList);
            if (reverseReference) {
                for (TReceivePlanB relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTSerialNoList && !dto.getTSerialNoList().isEmpty()) {
            TSerialNoDtoMapper mapper = new TSerialNoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TSerialNo> relationEntityList = mapper.mappingToEntityList(dto.getTSerialNoList());
            entity.setTSerialNoList(relationEntityList);
            if (reverseReference) {
                for (TSerialNo relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTShippingInstBList && !dto.getTShippingInstBList().isEmpty()) {
            TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TShippingInstB> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstBList());
            entity.setTShippingInstBList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstB relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTStockList && !dto.getTStockList().isEmpty()) {
            TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TStock> relationEntityList = mapper.mappingToEntityList(dto.getTStockList());
            entity.setTStockList(relationEntityList);
            if (reverseReference) {
                for (TStock relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTTrinvcheckinfoList && !dto.getTTrinvcheckinfoList().isEmpty()) {
            TTrinvcheckinfoDtoMapper mapper = new TTrinvcheckinfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TTrinvcheckinfo> relationEntityList = mapper.mappingToEntityList(dto.getTTrinvcheckinfoList());
            entity.setTTrinvcheckinfoList(relationEntityList);
            if (reverseReference) {
                for (TTrinvcheckinfo relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTYtrsodetailList && !dto.getTYtrsodetailList().isEmpty()) {
            TYtrsodetailDtoMapper mapper = new TYtrsodetailDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TYtrsodetail> relationEntityList = mapper.mappingToEntityList(dto.getTYtrsodetailList());
            entity.setTYtrsodetailList(relationEntityList);
            if (reverseReference) {
                for (TYtrsodetail relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWHtInventoryInputProdList && !dto.getWHtInventoryInputProdList().isEmpty()) {
            WHtInventoryInputProdDtoMapper mapper = new WHtInventoryInputProdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtInventoryInputProd> relationEntityList = mapper.mappingToEntityList(dto.getWHtInventoryInputProdList());
            entity.setWHtInventoryInputProdList(relationEntityList);
            if (reverseReference) {
                for (WHtInventoryInputProd relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWHtReceiveInspectionList && !dto.getWHtReceiveInspectionList().isEmpty()) {
            WHtReceiveInspectionDtoMapper mapper = new WHtReceiveInspectionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtReceiveInspection> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveInspectionList());
            entity.setWHtReceiveInspectionList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveInspection relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspList && !dto.getWHtReceiveNoPlanInspList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtReceiveNoPlanInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveNoPlanInspList());
            entity.setWHtReceiveNoPlanInspList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInsp relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWHtReceiveStoreList && !dto.getWHtReceiveStoreList().isEmpty()) {
            WHtReceiveStoreDtoMapper mapper = new WHtReceiveStoreDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtReceiveStore> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveStoreList());
            entity.setWHtReceiveStoreList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveStore relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWHtShippingList && !dto.getWHtShippingList().isEmpty()) {
            WHtShippingDtoMapper mapper = new WHtShippingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtShipping> relationEntityList = mapper.mappingToEntityList(dto.getWHtShippingList());
            entity.setWHtShippingList(relationEntityList);
            if (reverseReference) {
                for (WHtShipping relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWHtShippingPickingList && !dto.getWHtShippingPickingList().isEmpty()) {
            WHtShippingPickingDtoMapper mapper = new WHtShippingPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtShippingPicking> relationEntityList = mapper.mappingToEntityList(dto.getWHtShippingPickingList());
            entity.setWHtShippingPickingList(relationEntityList);
            if (reverseReference) {
                for (WHtShippingPicking relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWSglRowShipInspHList && !dto.getWSglRowShipInspHList().isEmpty()) {
            WSglRowShipInspHDtoMapper mapper = new WSglRowShipInspHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WSglRowShipInspH> relationEntityList = mapper.mappingToEntityList(dto.getWSglRowShipInspHList());
            entity.setWSglRowShipInspHList(relationEntityList);
            if (reverseReference) {
                for (WSglRowShipInspH relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWShippingInterruptList && !dto.getWShippingInterruptList().isEmpty()) {
            WShippingInterruptDtoMapper mapper = new WShippingInterruptDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WShippingInterrupt> relationEntityList = mapper.mappingToEntityList(dto.getWShippingInterruptList());
            entity.setWShippingInterruptList(relationEntityList);
            if (reverseReference) {
                for (WShippingInterrupt relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        return entity;
    }

    /**
     * Does the property need to be mapped to an entity? <br>
     * If modified info of DTO has at least one property, only modified properties are mapped.
     * And if no property is modified, all properties are mapped (but the other option exists).
     * @param dto The instance of DTO. (NotNull)
     * @param value The value of DTO's property. (NotNull)
     * @param propName The property name of DTO. (NotNull)
     * @return The determination, true or false.
     */
    protected boolean needsMapping(MProductDto dto, Object value, String propName) {
        Set<String> modifiedProperties = dto.mymodifiedProperties();
        if (modifiedProperties.isEmpty()) {
            return isMappingToEntityContainsNull() || value != null;
        }
        return modifiedProperties.contains(propName);
    }

    /**
     * Does the mapping to an entity contain null values? (when no property is modified) <br>
     * Default is true that means a setter is called if the value is null.
     * But this method is valid only when no property is modified.
     * @return The determination, true or false.
     */
    protected boolean isMappingToEntityContainsNull() { // for extension
        return true; // as default
    }

    /**
     * {@inheritDoc}
     */
    public List<MProduct> mappingToEntityList(List<MProductDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MProduct> entityList = new ArrayList<MProduct>();
        for (MProductDto dto : dtoList) {
            MProduct entity = mappingToEntity(dto);
            if (entity != null) {
                entityList.add(entity);
            } else {
                if (isAcceptNullElementOnList()) {
                    entityList.add(null);
                }
            }
        }
        return entityList;
    }

    protected boolean isAcceptNullElementOnList() {
        return true; // as default
    }

    // -----------------------------------------------------
    //                                          Instance Key
    //                                          ------------
    protected Object createInstanceKeyDto(final Object dto, final int instanceHash) {
        return new InstanceKeyDto(dto, instanceHash);
    }

    protected InstanceKeyEntity createInstanceKeyEntity(Entity entity) {
        return new InstanceKeyEntity(entity);
    }

    public void disableInstanceCache() { // internal option
        _instanceCache = false;
    }

    // -----------------------------------------------------
    //                                      Derived Property
    //                                      ----------------
    protected void reflectDerivedProperty(Entity entity, Object dto, boolean toDto) {
        DfBeanDesc entityDesc = DfBeanDescFactory.getBeanDesc(entity.getClass());
        DfBeanDesc dtoDesc = DfBeanDescFactory.getBeanDesc(dto.getClass());
        DBMeta dbmeta = entity.asDBMeta();
        for (String propertyName : entityDesc.getProppertyNameList()) {
            if (isOutOfDerivedPropertyName(entity, dto, toDto, dbmeta, entityDesc, dtoDesc, propertyName)) {
                continue;
            }
            DfPropertyDesc entityProp = entityDesc.getPropertyDesc(propertyName);
            Class<?> propertyType = entityProp.getPropertyType();
            if (isOutOfDerivedPropertyType(entity, dto, toDto, propertyName, propertyType)) {
                continue;
            }
            if (entityProp.isReadable() && entityProp.isWritable()) {
                DfPropertyDesc dtoProp = dtoDesc.getPropertyDesc(propertyName);
                if (dtoProp.isReadable() && dtoProp.isWritable()) {
                    if (toDto) {
                        dtoProp.setValue(dto, entityProp.getValue(entity));
                    } else {
                        entityProp.setValue(entity, dtoProp.getValue(dto));
                    }
                }
            }
        }
    }

    protected boolean isOutOfDerivedPropertyName(Entity entity, Object dto, boolean toDto
                                               , DBMeta dbmeta, DfBeanDesc entityDesc, DfBeanDesc dtoDesc
                                               , String propertyName) {
        return dbmeta.hasColumn(propertyName)
                    || dbmeta.hasForeign(propertyName) || dbmeta.hasReferrer(propertyName)
                    || !dtoDesc.hasPropertyDesc(propertyName);
    }

    protected boolean isOutOfDerivedPropertyType(Entity entity, Object dto, boolean toDto
                                               , String propertyName, Class<?> propertyType) {
        return List.class.isAssignableFrom(propertyType)
                || Entity.class.isAssignableFrom(propertyType)
                || Classification.class.isAssignableFrom(propertyType);
    }

    // ===================================================================================
    //                                                                   Suppress Relation
    //                                                                   =================
    // (basically) to suppress infinity loop
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressMProductSelf() {
        _suppressMProductSelf = true;
    }
    public void suppressMShapeGrp() {
        _suppressMShapeGrp = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressBClassDtlByLimitDtManagFlg() {
        _suppressBClassDtlByLimitDtManagFlg = true;
    }
    public void suppressBClassDtlByLimitDtReverseFlg() {
        _suppressBClassDtlByLimitDtReverseFlg = true;
    }
    public void suppressBClassDtlByLotManagFlg() {
        _suppressBClassDtlByLotManagFlg = true;
    }
    public void suppressBClassDtlByLotReverseFlg() {
        _suppressBClassDtlByLotReverseFlg = true;
    }
    public void suppressBClassDtlByMergeCls() {
        _suppressBClassDtlByMergeCls = true;
    }
    public void suppressBClassDtlByShippingStopFlg() {
        _suppressBClassDtlByShippingStopFlg = true;
    }
    public void suppressBClassDtlByFreightCls() {
        _suppressBClassDtlByFreightCls = true;
    }
    public void suppressMLocationList() {
        _suppressMLocationList = true;
    }
    public void suppressMMfwhxitemList() {
        _suppressMMfwhxitemList = true;
    }
    public void suppressMProductSelfAsOne() {
        _suppressMProductSelfAsOne = true;
    }
    public void suppressMProductShapeList() {
        _suppressMProductShapeList = true;
    }
    public void suppressMProductTermAsOne() {
        _suppressMProductTermAsOne = true;
    }
    public void suppressMSetParentAsOne() {
        _suppressMSetParentAsOne = true;
    }
    public void suppressMSetStructureList() {
        _suppressMSetStructureList = true;
    }
    public void suppressTAllocInstBList() {
        _suppressTAllocInstBList = true;
    }
    public void suppressTAllocLotList() {
        _suppressTAllocLotList = true;
    }
    public void suppressTInventoryBList() {
        _suppressTInventoryBList = true;
    }
    public void suppressTKeepingLotList() {
        _suppressTKeepingLotList = true;
    }
    public void suppressTLastLotList() {
        _suppressTLastLotList = true;
    }
    public void suppressTLotList() {
        _suppressTLotList = true;
    }
    public void suppressTMoveInstBList() {
        _suppressTMoveInstBList = true;
    }
    public void suppressTReceivePlanBList() {
        _suppressTReceivePlanBList = true;
    }
    public void suppressTSerialNoList() {
        _suppressTSerialNoList = true;
    }
    public void suppressTShippingInstBList() {
        _suppressTShippingInstBList = true;
    }
    public void suppressTStockList() {
        _suppressTStockList = true;
    }
    public void suppressTTrinvcheckinfoList() {
        _suppressTTrinvcheckinfoList = true;
    }
    public void suppressTYtrsodetailList() {
        _suppressTYtrsodetailList = true;
    }
    public void suppressWHtInventoryInputProdList() {
        _suppressWHtInventoryInputProdList = true;
    }
    public void suppressWHtReceiveInspectionList() {
        _suppressWHtReceiveInspectionList = true;
    }
    public void suppressWHtReceiveNoPlanInspList() {
        _suppressWHtReceiveNoPlanInspList = true;
    }
    public void suppressWHtReceiveStoreList() {
        _suppressWHtReceiveStoreList = true;
    }
    public void suppressWHtShippingList() {
        _suppressWHtShippingList = true;
    }
    public void suppressWHtShippingPickingList() {
        _suppressWHtShippingPickingList = true;
    }
    public void suppressWSglRowShipInspHList() {
        _suppressWSglRowShipInspHList = true;
    }
    public void suppressWShippingInterruptList() {
        _suppressWShippingInterruptList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMClient();
        suppressMProductSelf();
        suppressMShapeGrp();
        suppressBClassDtlByDelFlg();
        suppressBClassDtlByLimitDtManagFlg();
        suppressBClassDtlByLimitDtReverseFlg();
        suppressBClassDtlByLotManagFlg();
        suppressBClassDtlByLotReverseFlg();
        suppressBClassDtlByMergeCls();
        suppressBClassDtlByShippingStopFlg();
        suppressBClassDtlByFreightCls();
        suppressMLocationList();
        suppressMMfwhxitemList();
        suppressMProductSelfAsOne();
        suppressMProductShapeList();
        suppressMProductTermAsOne();
        suppressMSetParentAsOne();
        suppressMSetStructureList();
        suppressTAllocInstBList();
        suppressTAllocLotList();
        suppressTInventoryBList();
        suppressTKeepingLotList();
        suppressTLastLotList();
        suppressTLotList();
        suppressTMoveInstBList();
        suppressTReceivePlanBList();
        suppressTSerialNoList();
        suppressTShippingInstBList();
        suppressTStockList();
        suppressTTrinvcheckinfoList();
        suppressTYtrsodetailList();
        suppressWHtInventoryInputProdList();
        suppressWHtReceiveInspectionList();
        suppressWHtReceiveNoPlanInspList();
        suppressWHtReceiveStoreList();
        suppressWHtShippingList();
        suppressWHtShippingPickingList();
        suppressWSglRowShipInspHList();
        suppressWShippingInterruptList();
    }
    protected void doSuppressClear() { // internal
        _suppressMClient = false;
        _suppressMProductSelf = false;
        _suppressMShapeGrp = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressBClassDtlByLimitDtManagFlg = false;
        _suppressBClassDtlByLimitDtReverseFlg = false;
        _suppressBClassDtlByLotManagFlg = false;
        _suppressBClassDtlByLotReverseFlg = false;
        _suppressBClassDtlByMergeCls = false;
        _suppressBClassDtlByShippingStopFlg = false;
        _suppressBClassDtlByFreightCls = false;
        _suppressMLocationList = false;
        _suppressMMfwhxitemList = false;
        _suppressMProductSelfAsOne = false;
        _suppressMProductShapeList = false;
        _suppressMProductTermAsOne = false;
        _suppressMSetParentAsOne = false;
        _suppressMSetStructureList = false;
        _suppressTAllocInstBList = false;
        _suppressTAllocLotList = false;
        _suppressTInventoryBList = false;
        _suppressTKeepingLotList = false;
        _suppressTLastLotList = false;
        _suppressTLotList = false;
        _suppressTMoveInstBList = false;
        _suppressTReceivePlanBList = false;
        _suppressTSerialNoList = false;
        _suppressTShippingInstBList = false;
        _suppressTStockList = false;
        _suppressTTrinvcheckinfoList = false;
        _suppressTYtrsodetailList = false;
        _suppressWHtInventoryInputProdList = false;
        _suppressWHtReceiveInspectionList = false;
        _suppressWHtReceiveNoPlanInspList = false;
        _suppressWHtReceiveStoreList = false;
        _suppressWHtShippingList = false;
        _suppressWHtShippingPickingList = false;
        _suppressWSglRowShipInspHList = false;
        _suppressWShippingInterruptList = false;
    }

    // ===================================================================================
    //                                                                      Mapping Option
    //                                                                      ==============
    /**
     * {@inheritDoc}
     */
    public void setBaseOnlyMapping(boolean baseOnlyMapping) {
        if (baseOnlyMapping) {
            doSuppressAll();
        } else {
            doSuppressClear();
        }
    }

    protected boolean isExceptCommonColumn() {
        return _exceptCommonColumn;
    }

    /**
     * {@inheritDoc}
     */
    public void setExceptCommonColumn(boolean exceptCommonColumn) {
        _exceptCommonColumn = exceptCommonColumn;
    }

    protected boolean isReverseReference() {
        return _reverseReference;
    }

    /**
     * {@inheritDoc}
     */
    public void setReverseReference(boolean reverseReference) {
        _reverseReference = reverseReference;
    }

    // -----------------------------------------------------
    //                                           Easy-to-Use
    //                                           -----------
    /**
     * Enable base-only mapping that means the mapping ignores all references.
     * @return this. (NotNull)
     */
    public MProductDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MProductDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MProductDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MProductDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MProductDtoMapper reverseReference() {
        setReverseReference(true);
        return (MProductDtoMapper)this;
    }
}
