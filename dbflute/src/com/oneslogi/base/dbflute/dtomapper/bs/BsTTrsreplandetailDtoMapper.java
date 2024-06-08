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
 * The DTO mapper of T_TRSREPLANDETAIL as TABLE. <br>
 * 返品入庫予定明細
 * <pre>
 * [primary-key]
 *     TRSREPLANDETAIL_ID
 *
 * [column]
 *     TRSREPLANDETAIL_ID, TRSREPLAN_ID, RCVLINENO, SUPPLIERRCVLINENO, XDOCFLG, POKEY, POLINENO, POTYPE, OWNERPONO, OWNERPOLINENO, ORIGINALPONO, ORIGINALPOLINENO, PODATE, OWNERCD, ITEMADMIN, PRODUCT_CD, IFITEMCD, LOT1, LOT2, LOT3, LOT4, LOT5, OTHERLOT1, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, EXPECTQTY1, EXPECTQTY2, EXPECTQTY3, RECEIVEDQTY1, RECEIVEDQTY2, RECEIVEDQTY3, ADJUSTQTY1, ADJUSTQTY2, ADJUSTQTY3, RCVTAGQTY1, XDOCFREEQTY1, INSPECTEDQTY1, INSPECTEDQTY2, INSPECTEDQTY3, PRICE_BUY, PRICE_WHOLESALE, PRICE_SALE, NOTES, ICDATE, ORDERKEY, ORDERLINENO, OWNERORDERNO, OWNERORDERLINENO, CUSTORDERNO, CUSTORDERLINENO, ORDERTYPE, RCVQTYERRORFLG, LOGICFLG1, LOGICFLG2, LOGICFLG3, MOVELINENO, ASSYLINENO, PRODUCELINENO, CHECKLASTLOTFLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSREPLANDETAIL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrsreplandetailDtoMapper implements DtoMapper<TTrsreplandetail, TTrsreplandetailDto>, Serializable {

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

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrsreplandetailDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrsreplandetailDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrsreplandetailDto mappingToDto(TTrsreplandetail entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrsreplandetailDto dto = new TTrsreplandetailDto();
        dto.setTrsreplandetailId(entity.getTrsreplandetailId());
        dto.setTrsreplanId(entity.getTrsreplanId());
        dto.setRcvlineno(entity.getRcvlineno());
        dto.setSupplierrcvlineno(entity.getSupplierrcvlineno());
        dto.setXdocflg(entity.getXdocflg());
        dto.setPokey(entity.getPokey());
        dto.setPolineno(entity.getPolineno());
        dto.setPotype(entity.getPotype());
        dto.setOwnerpono(entity.getOwnerpono());
        dto.setOwnerpolineno(entity.getOwnerpolineno());
        dto.setOriginalpono(entity.getOriginalpono());
        dto.setOriginalpolineno(entity.getOriginalpolineno());
        dto.setPodate(entity.getPodate());
        dto.setOwnercd(entity.getOwnercd());
        dto.setItemadmin(entity.getItemadmin());
        dto.setProductCd(entity.getProductCd());
        dto.setIfitemcd(entity.getIfitemcd());
        dto.setLot1(entity.getLot1());
        dto.setLot2(entity.getLot2());
        dto.setLot3(entity.getLot3());
        dto.setLot4(entity.getLot4());
        dto.setLot5(entity.getLot5());
        dto.setOtherlot1(entity.getOtherlot1());
        dto.setOtherlot2(entity.getOtherlot2());
        dto.setOtherlot3(entity.getOtherlot3());
        dto.setOtherlot4(entity.getOtherlot4());
        dto.setOtherlot5(entity.getOtherlot5());
        dto.setDamageflg(entity.getDamageflg());
        dto.setNoshippingflg(entity.getNoshippingflg());
        dto.setForeigncargoflg(entity.getForeigncargoflg());
        dto.setCustomsreleaseflg(entity.getCustomsreleaseflg());
        dto.setTaxflg(entity.getTaxflg());
        dto.setExpectqty1(entity.getExpectqty1());
        dto.setExpectqty2(entity.getExpectqty2());
        dto.setExpectqty3(entity.getExpectqty3());
        dto.setReceivedqty1(entity.getReceivedqty1());
        dto.setReceivedqty2(entity.getReceivedqty2());
        dto.setReceivedqty3(entity.getReceivedqty3());
        dto.setAdjustqty1(entity.getAdjustqty1());
        dto.setAdjustqty2(entity.getAdjustqty2());
        dto.setAdjustqty3(entity.getAdjustqty3());
        dto.setRcvtagqty1(entity.getRcvtagqty1());
        dto.setXdocfreeqty1(entity.getXdocfreeqty1());
        dto.setInspectedqty1(entity.getInspectedqty1());
        dto.setInspectedqty2(entity.getInspectedqty2());
        dto.setInspectedqty3(entity.getInspectedqty3());
        dto.setPriceBuy(entity.getPriceBuy());
        dto.setPriceWholesale(entity.getPriceWholesale());
        dto.setPriceSale(entity.getPriceSale());
        dto.setNotes(entity.getNotes());
        dto.setIcdate(entity.getIcdate());
        dto.setOrderkey(entity.getOrderkey());
        dto.setOrderlineno(entity.getOrderlineno());
        dto.setOwnerorderno(entity.getOwnerorderno());
        dto.setOwnerorderlineno(entity.getOwnerorderlineno());
        dto.setCustorderno(entity.getCustorderno());
        dto.setCustorderlineno(entity.getCustorderlineno());
        dto.setOrdertype(entity.getOrdertype());
        dto.setRcvqtyerrorflg(entity.getRcvqtyerrorflg());
        dto.setLogicflg1(entity.getLogicflg1());
        dto.setLogicflg2(entity.getLogicflg2());
        dto.setLogicflg3(entity.getLogicflg3());
        dto.setMovelineno(entity.getMovelineno());
        dto.setAssylineno(entity.getAssylineno());
        dto.setProducelineno(entity.getProducelineno());
        dto.setChecklastlotflg(entity.getChecklastlotflg());
        dto.setCenterId(entity.getCenterId());
        dto.setClientId(entity.getClientId());
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
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TTrsreplandetailDto> mappingToDtoList(List<TTrsreplandetail> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrsreplandetailDto> dtoList = new ArrayList<TTrsreplandetailDto>();
        for (TTrsreplandetail entity : entityList) {
            TTrsreplandetailDto dto = mappingToDto(entity);
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
    public TTrsreplandetail mappingToEntity(TTrsreplandetailDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrsreplandetail entity = new TTrsreplandetail();
        if (needsMapping(dto, dto.getTrsreplandetailId(), "trsreplandetailId")) {
            entity.setTrsreplandetailId(dto.getTrsreplandetailId());
        }
        if (needsMapping(dto, dto.getTrsreplanId(), "trsreplanId")) {
            entity.setTrsreplanId(dto.getTrsreplanId());
        }
        if (needsMapping(dto, dto.getRcvlineno(), "rcvlineno")) {
            entity.setRcvlineno(dto.getRcvlineno());
        }
        if (needsMapping(dto, dto.getSupplierrcvlineno(), "supplierrcvlineno")) {
            entity.setSupplierrcvlineno(dto.getSupplierrcvlineno());
        }
        if (needsMapping(dto, dto.getXdocflg(), "xdocflg")) {
            entity.setXdocflg(dto.getXdocflg());
        }
        if (needsMapping(dto, dto.getPokey(), "pokey")) {
            entity.setPokey(dto.getPokey());
        }
        if (needsMapping(dto, dto.getPolineno(), "polineno")) {
            entity.setPolineno(dto.getPolineno());
        }
        if (needsMapping(dto, dto.getPotype(), "potype")) {
            entity.setPotype(dto.getPotype());
        }
        if (needsMapping(dto, dto.getOwnerpono(), "ownerpono")) {
            entity.setOwnerpono(dto.getOwnerpono());
        }
        if (needsMapping(dto, dto.getOwnerpolineno(), "ownerpolineno")) {
            entity.setOwnerpolineno(dto.getOwnerpolineno());
        }
        if (needsMapping(dto, dto.getOriginalpono(), "originalpono")) {
            entity.setOriginalpono(dto.getOriginalpono());
        }
        if (needsMapping(dto, dto.getOriginalpolineno(), "originalpolineno")) {
            entity.setOriginalpolineno(dto.getOriginalpolineno());
        }
        if (needsMapping(dto, dto.getPodate(), "podate")) {
            entity.setPodate(dto.getPodate());
        }
        if (needsMapping(dto, dto.getOwnercd(), "ownercd")) {
            entity.setOwnercd(dto.getOwnercd());
        }
        if (needsMapping(dto, dto.getItemadmin(), "itemadmin")) {
            entity.setItemadmin(dto.getItemadmin());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getIfitemcd(), "ifitemcd")) {
            entity.setIfitemcd(dto.getIfitemcd());
        }
        if (needsMapping(dto, dto.getLot1(), "lot1")) {
            entity.setLot1(dto.getLot1());
        }
        if (needsMapping(dto, dto.getLot2(), "lot2")) {
            entity.setLot2(dto.getLot2());
        }
        if (needsMapping(dto, dto.getLot3(), "lot3")) {
            entity.setLot3(dto.getLot3());
        }
        if (needsMapping(dto, dto.getLot4(), "lot4")) {
            entity.setLot4(dto.getLot4());
        }
        if (needsMapping(dto, dto.getLot5(), "lot5")) {
            entity.setLot5(dto.getLot5());
        }
        if (needsMapping(dto, dto.getOtherlot1(), "otherlot1")) {
            entity.setOtherlot1(dto.getOtherlot1());
        }
        if (needsMapping(dto, dto.getOtherlot2(), "otherlot2")) {
            entity.setOtherlot2(dto.getOtherlot2());
        }
        if (needsMapping(dto, dto.getOtherlot3(), "otherlot3")) {
            entity.setOtherlot3(dto.getOtherlot3());
        }
        if (needsMapping(dto, dto.getOtherlot4(), "otherlot4")) {
            entity.setOtherlot4(dto.getOtherlot4());
        }
        if (needsMapping(dto, dto.getOtherlot5(), "otherlot5")) {
            entity.setOtherlot5(dto.getOtherlot5());
        }
        if (needsMapping(dto, dto.getDamageflg(), "damageflg")) {
            entity.setDamageflg(dto.getDamageflg());
        }
        if (needsMapping(dto, dto.getNoshippingflg(), "noshippingflg")) {
            entity.setNoshippingflg(dto.getNoshippingflg());
        }
        if (needsMapping(dto, dto.getForeigncargoflg(), "foreigncargoflg")) {
            entity.setForeigncargoflg(dto.getForeigncargoflg());
        }
        if (needsMapping(dto, dto.getCustomsreleaseflg(), "customsreleaseflg")) {
            entity.setCustomsreleaseflg(dto.getCustomsreleaseflg());
        }
        if (needsMapping(dto, dto.getTaxflg(), "taxflg")) {
            entity.setTaxflg(dto.getTaxflg());
        }
        if (needsMapping(dto, dto.getExpectqty1(), "expectqty1")) {
            entity.setExpectqty1(dto.getExpectqty1());
        }
        if (needsMapping(dto, dto.getExpectqty2(), "expectqty2")) {
            entity.setExpectqty2(dto.getExpectqty2());
        }
        if (needsMapping(dto, dto.getExpectqty3(), "expectqty3")) {
            entity.setExpectqty3(dto.getExpectqty3());
        }
        if (needsMapping(dto, dto.getReceivedqty1(), "receivedqty1")) {
            entity.setReceivedqty1(dto.getReceivedqty1());
        }
        if (needsMapping(dto, dto.getReceivedqty2(), "receivedqty2")) {
            entity.setReceivedqty2(dto.getReceivedqty2());
        }
        if (needsMapping(dto, dto.getReceivedqty3(), "receivedqty3")) {
            entity.setReceivedqty3(dto.getReceivedqty3());
        }
        if (needsMapping(dto, dto.getAdjustqty1(), "adjustqty1")) {
            entity.setAdjustqty1(dto.getAdjustqty1());
        }
        if (needsMapping(dto, dto.getAdjustqty2(), "adjustqty2")) {
            entity.setAdjustqty2(dto.getAdjustqty2());
        }
        if (needsMapping(dto, dto.getAdjustqty3(), "adjustqty3")) {
            entity.setAdjustqty3(dto.getAdjustqty3());
        }
        if (needsMapping(dto, dto.getRcvtagqty1(), "rcvtagqty1")) {
            entity.setRcvtagqty1(dto.getRcvtagqty1());
        }
        if (needsMapping(dto, dto.getXdocfreeqty1(), "xdocfreeqty1")) {
            entity.setXdocfreeqty1(dto.getXdocfreeqty1());
        }
        if (needsMapping(dto, dto.getInspectedqty1(), "inspectedqty1")) {
            entity.setInspectedqty1(dto.getInspectedqty1());
        }
        if (needsMapping(dto, dto.getInspectedqty2(), "inspectedqty2")) {
            entity.setInspectedqty2(dto.getInspectedqty2());
        }
        if (needsMapping(dto, dto.getInspectedqty3(), "inspectedqty3")) {
            entity.setInspectedqty3(dto.getInspectedqty3());
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
        if (needsMapping(dto, dto.getNotes(), "notes")) {
            entity.setNotes(dto.getNotes());
        }
        if (needsMapping(dto, dto.getIcdate(), "icdate")) {
            entity.setIcdate(dto.getIcdate());
        }
        if (needsMapping(dto, dto.getOrderkey(), "orderkey")) {
            entity.setOrderkey(dto.getOrderkey());
        }
        if (needsMapping(dto, dto.getOrderlineno(), "orderlineno")) {
            entity.setOrderlineno(dto.getOrderlineno());
        }
        if (needsMapping(dto, dto.getOwnerorderno(), "ownerorderno")) {
            entity.setOwnerorderno(dto.getOwnerorderno());
        }
        if (needsMapping(dto, dto.getOwnerorderlineno(), "ownerorderlineno")) {
            entity.setOwnerorderlineno(dto.getOwnerorderlineno());
        }
        if (needsMapping(dto, dto.getCustorderno(), "custorderno")) {
            entity.setCustorderno(dto.getCustorderno());
        }
        if (needsMapping(dto, dto.getCustorderlineno(), "custorderlineno")) {
            entity.setCustorderlineno(dto.getCustorderlineno());
        }
        if (needsMapping(dto, dto.getOrdertype(), "ordertype")) {
            entity.setOrdertype(dto.getOrdertype());
        }
        if (needsMapping(dto, dto.getRcvqtyerrorflg(), "rcvqtyerrorflg")) {
            entity.setRcvqtyerrorflg(dto.getRcvqtyerrorflg());
        }
        if (needsMapping(dto, dto.getLogicflg1(), "logicflg1")) {
            entity.setLogicflg1(dto.getLogicflg1());
        }
        if (needsMapping(dto, dto.getLogicflg2(), "logicflg2")) {
            entity.setLogicflg2(dto.getLogicflg2());
        }
        if (needsMapping(dto, dto.getLogicflg3(), "logicflg3")) {
            entity.setLogicflg3(dto.getLogicflg3());
        }
        if (needsMapping(dto, dto.getMovelineno(), "movelineno")) {
            entity.setMovelineno(dto.getMovelineno());
        }
        if (needsMapping(dto, dto.getAssylineno(), "assylineno")) {
            entity.setAssylineno(dto.getAssylineno());
        }
        if (needsMapping(dto, dto.getProducelineno(), "producelineno")) {
            entity.setProducelineno(dto.getProducelineno());
        }
        if (needsMapping(dto, dto.getChecklastlotflg(), "checklastlotflg")) {
            entity.setChecklastlotflg(dto.getChecklastlotflg());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
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
    protected boolean needsMapping(TTrsreplandetailDto dto, Object value, String propName) {
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
    public List<TTrsreplandetail> mappingToEntityList(List<TTrsreplandetailDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrsreplandetail> entityList = new ArrayList<TTrsreplandetail>();
        for (TTrsreplandetailDto dto : dtoList) {
            TTrsreplandetail entity = mappingToEntity(dto);
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
    protected void doSuppressAll() { // internal
    }
    protected void doSuppressClear() { // internal
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
    public TTrsreplandetailDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrsreplandetailDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrsreplandetailDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrsreplandetailDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrsreplandetailDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrsreplandetailDtoMapper)this;
    }
}