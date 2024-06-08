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
 * The DTO mapper of E_SHOP_DOMESTIC_SEND as TABLE. <br>
 * 販売店仕分情報送信テーブル(国産)
 * <pre>
 * [primary-key]
 *     SHOP_DOMESTIC_SEND_ID
 *
 * [column]
 *     SHOP_DOMESTIC_SEND_ID, SEND_CD, SEND_ROW_CD, WORK_FLG, USERNUM1, TRACEKEY, WAREHOUSECD, WAREHOUSENAME, FACTORYCD, FACTORYNAME, PRODUCT_CD, ITEMNAME, SKUCD, RECEIVECD, PRODUCTMARK, ORDERNO, PRINTERNO, MAKENO, LOT4, MAKETIME, TRANSPORTCD, DISTRIBUTIONCD, PALLETID, INITNUM, CREATEDATETIME, ASSORTDATETIME, TRACETYPE, TRACETYPENAME, LINEBLOCK, ASSORTEDUNIT, ASSORTEDINDEX, OPERATIONCODE, CASEINNUM, ASSORTNUM, ASSORTDIFNUM, DIRECTIONCD, PISTONTYPE, CUSTOMERCD, DIRECTIONNUM, DISTWAREHOUSECD, DISTWAREHOUSENAME, INV_NUM, SORT_NUM, ADOPT_NUM, WH_ITEMCD, WH_ITEMNAME, WH_DESIGNCD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHOP_DOMESTIC_SEND_ID
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
public abstract class BsEShopDomesticSendDtoMapper implements DtoMapper<EShopDomesticSend, EShopDomesticSendDto>, Serializable {

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
    public BsEShopDomesticSendDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEShopDomesticSendDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EShopDomesticSendDto mappingToDto(EShopDomesticSend entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EShopDomesticSendDto dto = new EShopDomesticSendDto();
        dto.setShopDomesticSendId(entity.getShopDomesticSendId());
        dto.setSendCd(entity.getSendCd());
        dto.setSendRowCd(entity.getSendRowCd());
        dto.setWorkFlg(entity.getWorkFlg());
        dto.setUsernum1(entity.getUsernum1());
        dto.setTracekey(entity.getTracekey());
        dto.setWarehousecd(entity.getWarehousecd());
        dto.setWarehousename(entity.getWarehousename());
        dto.setFactorycd(entity.getFactorycd());
        dto.setFactoryname(entity.getFactoryname());
        dto.setProductCd(entity.getProductCd());
        dto.setItemname(entity.getItemname());
        dto.setSkucd(entity.getSkucd());
        dto.setReceivecd(entity.getReceivecd());
        dto.setProductmark(entity.getProductmark());
        dto.setOrderno(entity.getOrderno());
        dto.setPrinterno(entity.getPrinterno());
        dto.setMakeno(entity.getMakeno());
        dto.setLot4(entity.getLot4());
        dto.setMaketime(entity.getMaketime());
        dto.setTransportcd(entity.getTransportcd());
        dto.setDistributioncd(entity.getDistributioncd());
        dto.setPalletid(entity.getPalletid());
        dto.setInitnum(entity.getInitnum());
        dto.setCreatedatetime(entity.getCreatedatetime());
        dto.setAssortdatetime(entity.getAssortdatetime());
        dto.setTracetype(entity.getTracetype());
        dto.setTracetypename(entity.getTracetypename());
        dto.setLineblock(entity.getLineblock());
        dto.setAssortedunit(entity.getAssortedunit());
        dto.setAssortedindex(entity.getAssortedindex());
        dto.setOperationcode(entity.getOperationcode());
        dto.setCaseinnum(entity.getCaseinnum());
        dto.setAssortnum(entity.getAssortnum());
        dto.setAssortdifnum(entity.getAssortdifnum());
        dto.setDirectioncd(entity.getDirectioncd());
        dto.setPistontype(entity.getPistontype());
        dto.setCustomercd(entity.getCustomercd());
        dto.setDirectionnum(entity.getDirectionnum());
        dto.setDistwarehousecd(entity.getDistwarehousecd());
        dto.setDistwarehousename(entity.getDistwarehousename());
        dto.setInvNum(entity.getInvNum());
        dto.setSortNum(entity.getSortNum());
        dto.setAdoptNum(entity.getAdoptNum());
        dto.setWhItemcd(entity.getWhItemcd());
        dto.setWhItemname(entity.getWhItemname());
        dto.setWhDesigncd(entity.getWhDesigncd());
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
    public List<EShopDomesticSendDto> mappingToDtoList(List<EShopDomesticSend> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EShopDomesticSendDto> dtoList = new ArrayList<EShopDomesticSendDto>();
        for (EShopDomesticSend entity : entityList) {
            EShopDomesticSendDto dto = mappingToDto(entity);
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
    public EShopDomesticSend mappingToEntity(EShopDomesticSendDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EShopDomesticSend entity = new EShopDomesticSend();
        if (needsMapping(dto, dto.getShopDomesticSendId(), "shopDomesticSendId")) {
            entity.setShopDomesticSendId(dto.getShopDomesticSendId());
        }
        if (needsMapping(dto, dto.getSendCd(), "sendCd")) {
            entity.setSendCd(dto.getSendCd());
        }
        if (needsMapping(dto, dto.getSendRowCd(), "sendRowCd")) {
            entity.setSendRowCd(dto.getSendRowCd());
        }
        if (needsMapping(dto, dto.getWorkFlg(), "workFlg")) {
            entity.setWorkFlg(dto.getWorkFlg());
        }
        if (needsMapping(dto, dto.getUsernum1(), "usernum1")) {
            entity.setUsernum1(dto.getUsernum1());
        }
        if (needsMapping(dto, dto.getTracekey(), "tracekey")) {
            entity.setTracekey(dto.getTracekey());
        }
        if (needsMapping(dto, dto.getWarehousecd(), "warehousecd")) {
            entity.setWarehousecd(dto.getWarehousecd());
        }
        if (needsMapping(dto, dto.getWarehousename(), "warehousename")) {
            entity.setWarehousename(dto.getWarehousename());
        }
        if (needsMapping(dto, dto.getFactorycd(), "factorycd")) {
            entity.setFactorycd(dto.getFactorycd());
        }
        if (needsMapping(dto, dto.getFactoryname(), "factoryname")) {
            entity.setFactoryname(dto.getFactoryname());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getItemname(), "itemname")) {
            entity.setItemname(dto.getItemname());
        }
        if (needsMapping(dto, dto.getSkucd(), "skucd")) {
            entity.setSkucd(dto.getSkucd());
        }
        if (needsMapping(dto, dto.getReceivecd(), "receivecd")) {
            entity.setReceivecd(dto.getReceivecd());
        }
        if (needsMapping(dto, dto.getProductmark(), "productmark")) {
            entity.setProductmark(dto.getProductmark());
        }
        if (needsMapping(dto, dto.getOrderno(), "orderno")) {
            entity.setOrderno(dto.getOrderno());
        }
        if (needsMapping(dto, dto.getPrinterno(), "printerno")) {
            entity.setPrinterno(dto.getPrinterno());
        }
        if (needsMapping(dto, dto.getMakeno(), "makeno")) {
            entity.setMakeno(dto.getMakeno());
        }
        if (needsMapping(dto, dto.getLot4(), "lot4")) {
            entity.setLot4(dto.getLot4());
        }
        if (needsMapping(dto, dto.getMaketime(), "maketime")) {
            entity.setMaketime(dto.getMaketime());
        }
        if (needsMapping(dto, dto.getTransportcd(), "transportcd")) {
            entity.setTransportcd(dto.getTransportcd());
        }
        if (needsMapping(dto, dto.getDistributioncd(), "distributioncd")) {
            entity.setDistributioncd(dto.getDistributioncd());
        }
        if (needsMapping(dto, dto.getPalletid(), "palletid")) {
            entity.setPalletid(dto.getPalletid());
        }
        if (needsMapping(dto, dto.getInitnum(), "initnum")) {
            entity.setInitnum(dto.getInitnum());
        }
        if (needsMapping(dto, dto.getCreatedatetime(), "createdatetime")) {
            entity.setCreatedatetime(dto.getCreatedatetime());
        }
        if (needsMapping(dto, dto.getAssortdatetime(), "assortdatetime")) {
            entity.setAssortdatetime(dto.getAssortdatetime());
        }
        if (needsMapping(dto, dto.getTracetype(), "tracetype")) {
            entity.setTracetype(dto.getTracetype());
        }
        if (needsMapping(dto, dto.getTracetypename(), "tracetypename")) {
            entity.setTracetypename(dto.getTracetypename());
        }
        if (needsMapping(dto, dto.getLineblock(), "lineblock")) {
            entity.setLineblock(dto.getLineblock());
        }
        if (needsMapping(dto, dto.getAssortedunit(), "assortedunit")) {
            entity.setAssortedunit(dto.getAssortedunit());
        }
        if (needsMapping(dto, dto.getAssortedindex(), "assortedindex")) {
            entity.setAssortedindex(dto.getAssortedindex());
        }
        if (needsMapping(dto, dto.getOperationcode(), "operationcode")) {
            entity.setOperationcode(dto.getOperationcode());
        }
        if (needsMapping(dto, dto.getCaseinnum(), "caseinnum")) {
            entity.setCaseinnum(dto.getCaseinnum());
        }
        if (needsMapping(dto, dto.getAssortnum(), "assortnum")) {
            entity.setAssortnum(dto.getAssortnum());
        }
        if (needsMapping(dto, dto.getAssortdifnum(), "assortdifnum")) {
            entity.setAssortdifnum(dto.getAssortdifnum());
        }
        if (needsMapping(dto, dto.getDirectioncd(), "directioncd")) {
            entity.setDirectioncd(dto.getDirectioncd());
        }
        if (needsMapping(dto, dto.getPistontype(), "pistontype")) {
            entity.setPistontype(dto.getPistontype());
        }
        if (needsMapping(dto, dto.getCustomercd(), "customercd")) {
            entity.setCustomercd(dto.getCustomercd());
        }
        if (needsMapping(dto, dto.getDirectionnum(), "directionnum")) {
            entity.setDirectionnum(dto.getDirectionnum());
        }
        if (needsMapping(dto, dto.getDistwarehousecd(), "distwarehousecd")) {
            entity.setDistwarehousecd(dto.getDistwarehousecd());
        }
        if (needsMapping(dto, dto.getDistwarehousename(), "distwarehousename")) {
            entity.setDistwarehousename(dto.getDistwarehousename());
        }
        if (needsMapping(dto, dto.getInvNum(), "invNum")) {
            entity.setInvNum(dto.getInvNum());
        }
        if (needsMapping(dto, dto.getSortNum(), "sortNum")) {
            entity.setSortNum(dto.getSortNum());
        }
        if (needsMapping(dto, dto.getAdoptNum(), "adoptNum")) {
            entity.setAdoptNum(dto.getAdoptNum());
        }
        if (needsMapping(dto, dto.getWhItemcd(), "whItemcd")) {
            entity.setWhItemcd(dto.getWhItemcd());
        }
        if (needsMapping(dto, dto.getWhItemname(), "whItemname")) {
            entity.setWhItemname(dto.getWhItemname());
        }
        if (needsMapping(dto, dto.getWhDesigncd(), "whDesigncd")) {
            entity.setWhDesigncd(dto.getWhDesigncd());
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
    protected boolean needsMapping(EShopDomesticSendDto dto, Object value, String propName) {
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
    public List<EShopDomesticSend> mappingToEntityList(List<EShopDomesticSendDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EShopDomesticSend> entityList = new ArrayList<EShopDomesticSend>();
        for (EShopDomesticSendDto dto : dtoList) {
            EShopDomesticSend entity = mappingToEntity(dto);
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
    public EShopDomesticSendDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EShopDomesticSendDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EShopDomesticSendDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EShopDomesticSendDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EShopDomesticSendDtoMapper reverseReference() {
        setReverseReference(true);
        return (EShopDomesticSendDtoMapper)this;
    }
}
