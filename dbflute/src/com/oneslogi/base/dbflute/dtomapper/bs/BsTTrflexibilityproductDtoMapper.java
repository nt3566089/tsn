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
 * The DTO mapper of T_TRFLEXIBILITYPRODUCT as TABLE. <br>
 * 融通輸送製品情報
 * <pre>
 * [primary-key]
 *     TRFLEXIBILITYPRODUCT_ID
 *
 * [column]
 *     TRFLEXIBILITYPRODUCT_ID, SUPPLIERCD, SHIPCD, SCHDATE, FLEXIBITYNO, TRANSPORTCD, RCVDATE, OWNERCD, INSTRACTDATETIME, RCVMAKEFLG, REFLINENO, PRODUCT_CD, MANUFACTUREDATE, DESIGNCD, QTYCASE, QTYBOWL, CASEINFOFLG, FACTORYCD, ITEMCD_CASE, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO, MACHINENO, CREATENO, LIMITDATE, DATETIME, DISTRIBUTIONCD, OPERATIONNUM, RCVKEY, FIRMCARRYNO, BATJPRODUCTIONYM, COMETODATE, RECEIVEDATE, CARDBOARDNO, RCVPALLETNO, TAXPALLETNO, ITEMCD_IN, ITEMCD_WH, DESIGNCD_IN, DESIGNCD_WH, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRFLEXIBILITYPRODUCT_ID
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
public abstract class BsTTrflexibilityproductDtoMapper implements DtoMapper<TTrflexibilityproduct, TTrflexibilityproductDto>, Serializable {

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
    public BsTTrflexibilityproductDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrflexibilityproductDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrflexibilityproductDto mappingToDto(TTrflexibilityproduct entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrflexibilityproductDto dto = new TTrflexibilityproductDto();
        dto.setTrflexibilityproductId(entity.getTrflexibilityproductId());
        dto.setSuppliercd(entity.getSuppliercd());
        dto.setShipcd(entity.getShipcd());
        dto.setSchdate(entity.getSchdate());
        dto.setFlexibityno(entity.getFlexibityno());
        dto.setTransportcd(entity.getTransportcd());
        dto.setRcvdate(entity.getRcvdate());
        dto.setOwnercd(entity.getOwnercd());
        dto.setInstractdatetime(entity.getInstractdatetime());
        dto.setRcvmakeflg(entity.getRcvmakeflg());
        dto.setReflineno(entity.getReflineno());
        dto.setProductCd(entity.getProductCd());
        dto.setManufacturedate(entity.getManufacturedate());
        dto.setDesigncd(entity.getDesigncd());
        dto.setQtycase(entity.getQtycase());
        dto.setQtybowl(entity.getQtybowl());
        dto.setCaseinfoflg(entity.getCaseinfoflg());
        dto.setFactorycd(entity.getFactorycd());
        dto.setItemcdCase(entity.getItemcdCase());
        dto.setSkucd(entity.getSkucd());
        dto.setDestinationcd(entity.getDestinationcd());
        dto.setManufacturecd(entity.getManufacturecd());
        dto.setOrderno(entity.getOrderno());
        dto.setMachineno(entity.getMachineno());
        dto.setCreateno(entity.getCreateno());
        dto.setLimitdate(entity.getLimitdate());
        dto.setDatetime(entity.getDatetime());
        dto.setDistributioncd(entity.getDistributioncd());
        dto.setOperationnum(entity.getOperationnum());
        dto.setRcvkey(entity.getRcvkey());
        dto.setFirmcarryno(entity.getFirmcarryno());
        dto.setBatjproductionym(entity.getBatjproductionym());
        dto.setCometodate(entity.getCometodate());
        dto.setReceivedate(entity.getReceivedate());
        dto.setCardboardno(entity.getCardboardno());
        dto.setRcvpalletno(entity.getRcvpalletno());
        dto.setTaxpalletno(entity.getTaxpalletno());
        dto.setItemcdIn(entity.getItemcdIn());
        dto.setItemcdWh(entity.getItemcdWh());
        dto.setDesigncdIn(entity.getDesigncdIn());
        dto.setDesigncdWh(entity.getDesigncdWh());
        dto.setVaExtdata1(entity.getVaExtdata1());
        dto.setVaExtdata2(entity.getVaExtdata2());
        dto.setVaExtdata3(entity.getVaExtdata3());
        dto.setNvExtdata1(entity.getNvExtdata1());
        dto.setNvExtdata2(entity.getNvExtdata2());
        dto.setNvExtdata3(entity.getNvExtdata3());
        dto.setNmExtdata1(entity.getNmExtdata1());
        dto.setNmExtdata2(entity.getNmExtdata2());
        dto.setNmExtdata3(entity.getNmExtdata3());
        dto.setDtExtdata1(entity.getDtExtdata1());
        dto.setDtExtdata2(entity.getDtExtdata2());
        dto.setDtExtdata3(entity.getDtExtdata3());
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
    public List<TTrflexibilityproductDto> mappingToDtoList(List<TTrflexibilityproduct> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrflexibilityproductDto> dtoList = new ArrayList<TTrflexibilityproductDto>();
        for (TTrflexibilityproduct entity : entityList) {
            TTrflexibilityproductDto dto = mappingToDto(entity);
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
    public TTrflexibilityproduct mappingToEntity(TTrflexibilityproductDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrflexibilityproduct entity = new TTrflexibilityproduct();
        if (needsMapping(dto, dto.getTrflexibilityproductId(), "trflexibilityproductId")) {
            entity.setTrflexibilityproductId(dto.getTrflexibilityproductId());
        }
        if (needsMapping(dto, dto.getSuppliercd(), "suppliercd")) {
            entity.setSuppliercd(dto.getSuppliercd());
        }
        if (needsMapping(dto, dto.getShipcd(), "shipcd")) {
            entity.setShipcd(dto.getShipcd());
        }
        if (needsMapping(dto, dto.getSchdate(), "schdate")) {
            entity.setSchdate(dto.getSchdate());
        }
        if (needsMapping(dto, dto.getFlexibityno(), "flexibityno")) {
            entity.setFlexibityno(dto.getFlexibityno());
        }
        if (needsMapping(dto, dto.getTransportcd(), "transportcd")) {
            entity.setTransportcd(dto.getTransportcd());
        }
        if (needsMapping(dto, dto.getRcvdate(), "rcvdate")) {
            entity.setRcvdate(dto.getRcvdate());
        }
        if (needsMapping(dto, dto.getOwnercd(), "ownercd")) {
            entity.setOwnercd(dto.getOwnercd());
        }
        if (needsMapping(dto, dto.getInstractdatetime(), "instractdatetime")) {
            entity.setInstractdatetime(dto.getInstractdatetime());
        }
        if (needsMapping(dto, dto.getRcvmakeflg(), "rcvmakeflg")) {
            entity.setRcvmakeflg(dto.getRcvmakeflg());
        }
        if (needsMapping(dto, dto.getReflineno(), "reflineno")) {
            entity.setReflineno(dto.getReflineno());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getManufacturedate(), "manufacturedate")) {
            entity.setManufacturedate(dto.getManufacturedate());
        }
        if (needsMapping(dto, dto.getDesigncd(), "designcd")) {
            entity.setDesigncd(dto.getDesigncd());
        }
        if (needsMapping(dto, dto.getQtycase(), "qtycase")) {
            entity.setQtycase(dto.getQtycase());
        }
        if (needsMapping(dto, dto.getQtybowl(), "qtybowl")) {
            entity.setQtybowl(dto.getQtybowl());
        }
        if (needsMapping(dto, dto.getCaseinfoflg(), "caseinfoflg")) {
            entity.setCaseinfoflg(dto.getCaseinfoflg());
        }
        if (needsMapping(dto, dto.getFactorycd(), "factorycd")) {
            entity.setFactorycd(dto.getFactorycd());
        }
        if (needsMapping(dto, dto.getItemcdCase(), "itemcdCase")) {
            entity.setItemcdCase(dto.getItemcdCase());
        }
        if (needsMapping(dto, dto.getSkucd(), "skucd")) {
            entity.setSkucd(dto.getSkucd());
        }
        if (needsMapping(dto, dto.getDestinationcd(), "destinationcd")) {
            entity.setDestinationcd(dto.getDestinationcd());
        }
        if (needsMapping(dto, dto.getManufacturecd(), "manufacturecd")) {
            entity.setManufacturecd(dto.getManufacturecd());
        }
        if (needsMapping(dto, dto.getOrderno(), "orderno")) {
            entity.setOrderno(dto.getOrderno());
        }
        if (needsMapping(dto, dto.getMachineno(), "machineno")) {
            entity.setMachineno(dto.getMachineno());
        }
        if (needsMapping(dto, dto.getCreateno(), "createno")) {
            entity.setCreateno(dto.getCreateno());
        }
        if (needsMapping(dto, dto.getLimitdate(), "limitdate")) {
            entity.setLimitdate(dto.getLimitdate());
        }
        if (needsMapping(dto, dto.getDatetime(), "datetime")) {
            entity.setDatetime(dto.getDatetime());
        }
        if (needsMapping(dto, dto.getDistributioncd(), "distributioncd")) {
            entity.setDistributioncd(dto.getDistributioncd());
        }
        if (needsMapping(dto, dto.getOperationnum(), "operationnum")) {
            entity.setOperationnum(dto.getOperationnum());
        }
        if (needsMapping(dto, dto.getRcvkey(), "rcvkey")) {
            entity.setRcvkey(dto.getRcvkey());
        }
        if (needsMapping(dto, dto.getFirmcarryno(), "firmcarryno")) {
            entity.setFirmcarryno(dto.getFirmcarryno());
        }
        if (needsMapping(dto, dto.getBatjproductionym(), "batjproductionym")) {
            entity.setBatjproductionym(dto.getBatjproductionym());
        }
        if (needsMapping(dto, dto.getCometodate(), "cometodate")) {
            entity.setCometodate(dto.getCometodate());
        }
        if (needsMapping(dto, dto.getReceivedate(), "receivedate")) {
            entity.setReceivedate(dto.getReceivedate());
        }
        if (needsMapping(dto, dto.getCardboardno(), "cardboardno")) {
            entity.setCardboardno(dto.getCardboardno());
        }
        if (needsMapping(dto, dto.getRcvpalletno(), "rcvpalletno")) {
            entity.setRcvpalletno(dto.getRcvpalletno());
        }
        if (needsMapping(dto, dto.getTaxpalletno(), "taxpalletno")) {
            entity.setTaxpalletno(dto.getTaxpalletno());
        }
        if (needsMapping(dto, dto.getItemcdIn(), "itemcdIn")) {
            entity.setItemcdIn(dto.getItemcdIn());
        }
        if (needsMapping(dto, dto.getItemcdWh(), "itemcdWh")) {
            entity.setItemcdWh(dto.getItemcdWh());
        }
        if (needsMapping(dto, dto.getDesigncdIn(), "designcdIn")) {
            entity.setDesigncdIn(dto.getDesigncdIn());
        }
        if (needsMapping(dto, dto.getDesigncdWh(), "designcdWh")) {
            entity.setDesigncdWh(dto.getDesigncdWh());
        }
        if (needsMapping(dto, dto.getVaExtdata1(), "vaExtdata1")) {
            entity.setVaExtdata1(dto.getVaExtdata1());
        }
        if (needsMapping(dto, dto.getVaExtdata2(), "vaExtdata2")) {
            entity.setVaExtdata2(dto.getVaExtdata2());
        }
        if (needsMapping(dto, dto.getVaExtdata3(), "vaExtdata3")) {
            entity.setVaExtdata3(dto.getVaExtdata3());
        }
        if (needsMapping(dto, dto.getNvExtdata1(), "nvExtdata1")) {
            entity.setNvExtdata1(dto.getNvExtdata1());
        }
        if (needsMapping(dto, dto.getNvExtdata2(), "nvExtdata2")) {
            entity.setNvExtdata2(dto.getNvExtdata2());
        }
        if (needsMapping(dto, dto.getNvExtdata3(), "nvExtdata3")) {
            entity.setNvExtdata3(dto.getNvExtdata3());
        }
        if (needsMapping(dto, dto.getNmExtdata1(), "nmExtdata1")) {
            entity.setNmExtdata1(dto.getNmExtdata1());
        }
        if (needsMapping(dto, dto.getNmExtdata2(), "nmExtdata2")) {
            entity.setNmExtdata2(dto.getNmExtdata2());
        }
        if (needsMapping(dto, dto.getNmExtdata3(), "nmExtdata3")) {
            entity.setNmExtdata3(dto.getNmExtdata3());
        }
        if (needsMapping(dto, dto.getDtExtdata1(), "dtExtdata1")) {
            entity.setDtExtdata1(dto.getDtExtdata1());
        }
        if (needsMapping(dto, dto.getDtExtdata2(), "dtExtdata2")) {
            entity.setDtExtdata2(dto.getDtExtdata2());
        }
        if (needsMapping(dto, dto.getDtExtdata3(), "dtExtdata3")) {
            entity.setDtExtdata3(dto.getDtExtdata3());
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
    protected boolean needsMapping(TTrflexibilityproductDto dto, Object value, String propName) {
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
    public List<TTrflexibilityproduct> mappingToEntityList(List<TTrflexibilityproductDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrflexibilityproduct> entityList = new ArrayList<TTrflexibilityproduct>();
        for (TTrflexibilityproductDto dto : dtoList) {
            TTrflexibilityproduct entity = mappingToEntity(dto);
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
    public TTrflexibilityproductDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrflexibilityproductDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrflexibilityproductDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrflexibilityproductDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrflexibilityproductDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrflexibilityproductDtoMapper)this;
    }
}
