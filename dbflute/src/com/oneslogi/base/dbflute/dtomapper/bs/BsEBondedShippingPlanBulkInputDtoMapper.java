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
 * The DTO mapper of E_BONDED_SHIPPING_PLAN_BULK_INPUT as TABLE. <br>
 * 出庫指示受信テーブル（需給）
 * <pre>
 * [primary-key]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
 *
 * [column]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, SBWAREHOUSECD, CUSTORDERNO, ORDERTYPE, SHIPCD, CarryoutPlanCd, ShipToCd, ShipToNm, ReceivePlanYm, ShTypeCd, ShTypeNm, Refno, PickingComment, PhoneNo, BATJMfYm, RmaNo, OwnerOrderNo, PalletNo, PRODUCT_CD, DesignCd, ManufactureYm, FirmcarryNo, Qty, InOutKbn, StockType, CustomsReleaseDate, SupplierCvNo, IfItemCd, SendFlg, PalletOrder, PalletType, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
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
public abstract class BsEBondedShippingPlanBulkInputDtoMapper implements DtoMapper<EBondedShippingPlanBulkInput, EBondedShippingPlanBulkInputDto>, Serializable {

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
    public BsEBondedShippingPlanBulkInputDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEBondedShippingPlanBulkInputDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EBondedShippingPlanBulkInputDto mappingToDto(EBondedShippingPlanBulkInput entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EBondedShippingPlanBulkInputDto dto = new EBondedShippingPlanBulkInputDto();
        dto.setBondedShippingPlanBulkInputId(entity.getBondedShippingPlanBulkInputId());
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setImportFlg(entity.getImportFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setSbwarehousecd(entity.getSbwarehousecd());
        dto.setCustorderno(entity.getCustorderno());
        dto.setOrdertype(entity.getOrdertype());
        dto.setShipcd(entity.getShipcd());
        dto.setCarryoutplancd(entity.getCarryoutplancd());
        dto.setShiptocd(entity.getShiptocd());
        dto.setShiptonm(entity.getShiptonm());
        dto.setReceiveplanym(entity.getReceiveplanym());
        dto.setShtypecd(entity.getShtypecd());
        dto.setShtypenm(entity.getShtypenm());
        dto.setRefno(entity.getRefno());
        dto.setPickingcomment(entity.getPickingcomment());
        dto.setPhoneno(entity.getPhoneno());
        dto.setBatjmfym(entity.getBatjmfym());
        dto.setRmano(entity.getRmano());
        dto.setOwnerorderno(entity.getOwnerorderno());
        dto.setPalletno(entity.getPalletno());
        dto.setProductCd(entity.getProductCd());
        dto.setDesigncd(entity.getDesigncd());
        dto.setManufactureym(entity.getManufactureym());
        dto.setFirmcarryno(entity.getFirmcarryno());
        dto.setQty(entity.getQty());
        dto.setInoutkbn(entity.getInoutkbn());
        dto.setStocktype(entity.getStocktype());
        dto.setCustomsreleasedate(entity.getCustomsreleasedate());
        dto.setSuppliercvno(entity.getSuppliercvno());
        dto.setIfitemcd(entity.getIfitemcd());
        dto.setSendflg(entity.getSendflg());
        dto.setPalletorder(entity.getPalletorder());
        dto.setPallettype(entity.getPallettype());
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
    public List<EBondedShippingPlanBulkInputDto> mappingToDtoList(List<EBondedShippingPlanBulkInput> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EBondedShippingPlanBulkInputDto> dtoList = new ArrayList<EBondedShippingPlanBulkInputDto>();
        for (EBondedShippingPlanBulkInput entity : entityList) {
            EBondedShippingPlanBulkInputDto dto = mappingToDto(entity);
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
    public EBondedShippingPlanBulkInput mappingToEntity(EBondedShippingPlanBulkInputDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EBondedShippingPlanBulkInput entity = new EBondedShippingPlanBulkInput();
        if (needsMapping(dto, dto.getBondedShippingPlanBulkInputId(), "bondedShippingPlanBulkInputId")) {
            entity.setBondedShippingPlanBulkInputId(dto.getBondedShippingPlanBulkInputId());
        }
        if (needsMapping(dto, dto.getReceiveCd(), "receiveCd")) {
            entity.setReceiveCd(dto.getReceiveCd());
        }
        if (needsMapping(dto, dto.getReceiveRowId(), "receiveRowId")) {
            entity.setReceiveRowId(dto.getReceiveRowId());
        }
        if (needsMapping(dto, dto.getImportFlg(), "importFlg")) {
            entity.setImportFlg(dto.getImportFlg());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlg(dto.getErrorFlg());
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
        }
        if (needsMapping(dto, dto.getSbwarehousecd(), "sbwarehousecd")) {
            entity.setSbwarehousecd(dto.getSbwarehousecd());
        }
        if (needsMapping(dto, dto.getCustorderno(), "custorderno")) {
            entity.setCustorderno(dto.getCustorderno());
        }
        if (needsMapping(dto, dto.getOrdertype(), "ordertype")) {
            entity.setOrdertype(dto.getOrdertype());
        }
        if (needsMapping(dto, dto.getShipcd(), "shipcd")) {
            entity.setShipcd(dto.getShipcd());
        }
        if (needsMapping(dto, dto.getCarryoutplancd(), "carryoutplancd")) {
            entity.setCarryoutplancd(dto.getCarryoutplancd());
        }
        if (needsMapping(dto, dto.getShiptocd(), "shiptocd")) {
            entity.setShiptocd(dto.getShiptocd());
        }
        if (needsMapping(dto, dto.getShiptonm(), "shiptonm")) {
            entity.setShiptonm(dto.getShiptonm());
        }
        if (needsMapping(dto, dto.getReceiveplanym(), "receiveplanym")) {
            entity.setReceiveplanym(dto.getReceiveplanym());
        }
        if (needsMapping(dto, dto.getShtypecd(), "shtypecd")) {
            entity.setShtypecd(dto.getShtypecd());
        }
        if (needsMapping(dto, dto.getShtypenm(), "shtypenm")) {
            entity.setShtypenm(dto.getShtypenm());
        }
        if (needsMapping(dto, dto.getRefno(), "refno")) {
            entity.setRefno(dto.getRefno());
        }
        if (needsMapping(dto, dto.getPickingcomment(), "pickingcomment")) {
            entity.setPickingcomment(dto.getPickingcomment());
        }
        if (needsMapping(dto, dto.getPhoneno(), "phoneno")) {
            entity.setPhoneno(dto.getPhoneno());
        }
        if (needsMapping(dto, dto.getBatjmfym(), "batjmfym")) {
            entity.setBatjmfym(dto.getBatjmfym());
        }
        if (needsMapping(dto, dto.getRmano(), "rmano")) {
            entity.setRmano(dto.getRmano());
        }
        if (needsMapping(dto, dto.getOwnerorderno(), "ownerorderno")) {
            entity.setOwnerorderno(dto.getOwnerorderno());
        }
        if (needsMapping(dto, dto.getPalletno(), "palletno")) {
            entity.setPalletno(dto.getPalletno());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getDesigncd(), "designcd")) {
            entity.setDesigncd(dto.getDesigncd());
        }
        if (needsMapping(dto, dto.getManufactureym(), "manufactureym")) {
            entity.setManufactureym(dto.getManufactureym());
        }
        if (needsMapping(dto, dto.getFirmcarryno(), "firmcarryno")) {
            entity.setFirmcarryno(dto.getFirmcarryno());
        }
        if (needsMapping(dto, dto.getQty(), "qty")) {
            entity.setQty(dto.getQty());
        }
        if (needsMapping(dto, dto.getInoutkbn(), "inoutkbn")) {
            entity.setInoutkbn(dto.getInoutkbn());
        }
        if (needsMapping(dto, dto.getStocktype(), "stocktype")) {
            entity.setStocktype(dto.getStocktype());
        }
        if (needsMapping(dto, dto.getCustomsreleasedate(), "customsreleasedate")) {
            entity.setCustomsreleasedate(dto.getCustomsreleasedate());
        }
        if (needsMapping(dto, dto.getSuppliercvno(), "suppliercvno")) {
            entity.setSuppliercvno(dto.getSuppliercvno());
        }
        if (needsMapping(dto, dto.getIfitemcd(), "ifitemcd")) {
            entity.setIfitemcd(dto.getIfitemcd());
        }
        if (needsMapping(dto, dto.getSendflg(), "sendflg")) {
            entity.setSendflg(dto.getSendflg());
        }
        if (needsMapping(dto, dto.getPalletorder(), "palletorder")) {
            entity.setPalletorder(dto.getPalletorder());
        }
        if (needsMapping(dto, dto.getPallettype(), "pallettype")) {
            entity.setPallettype(dto.getPallettype());
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
    protected boolean needsMapping(EBondedShippingPlanBulkInputDto dto, Object value, String propName) {
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
    public List<EBondedShippingPlanBulkInput> mappingToEntityList(List<EBondedShippingPlanBulkInputDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EBondedShippingPlanBulkInput> entityList = new ArrayList<EBondedShippingPlanBulkInput>();
        for (EBondedShippingPlanBulkInputDto dto : dtoList) {
            EBondedShippingPlanBulkInput entity = mappingToEntity(dto);
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
    public EBondedShippingPlanBulkInputDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EBondedShippingPlanBulkInputDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EBondedShippingPlanBulkInputDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EBondedShippingPlanBulkInputDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EBondedShippingPlanBulkInputDtoMapper reverseReference() {
        setReverseReference(true);
        return (EBondedShippingPlanBulkInputDtoMapper)this;
    }
}
