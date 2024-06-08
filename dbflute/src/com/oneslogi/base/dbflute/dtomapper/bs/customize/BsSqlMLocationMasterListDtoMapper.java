package com.oneslogi.base.dbflute.dtomapper.bs.customize;

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
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.dto.customize.*;
import com.oneslogi.base.dbflute.dtomapper.customize.*;

/**
 * The DTO mapper of SqlMLocationMasterList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LocGroup, LocGroupNm, LOCATION_CD, ALLOC_NG_FLG, ALLOC_NG_FLG_NM, DEL_FLG, DEL_FLG_NM, LOCATION_NM, PICKING_ORDER, PALLETECAPACITY, MAX_STORE_NUM, LINBLK, LIN_OR_BLOCK, LOCID, LOCKBN_NM, PRODUCT_CD, PRODUCT_NM, BRCTG, SPLREVUN, REPLENISHMENT_ROUNDEDUP__UNIT_NM, SPLREVCTQA, REPLENISH_P_NUM, BSSPLPT, TOSPLMD, TOSPLMD_NM, PRESPLMD, PRESPLMD_NM, TRANSPORTPRIORITY, VIRTUALLOCFLG, LINNM, BLKNM, CENTER_CD, CENTER_NM, CLIENT_ID, CLIENT_CD, CLIENT_NM, LOCATION_ID, UPD_DT, USER_NM, ZONE, ALLOC_ORDER, LOCATION_TYPE, REPLENISH_PRODUCT_ID, REPLENISH_STOCK_TYPE_ID, REPLENISH_DEPOSIT_ID, REPLENISH_P_PRODUCT_SHAPE_ID, MAX_STORE_PRODUCT_SHAPE_ID, VERSION_NO, CONTROL_NO, ADD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public abstract class BsSqlMLocationMasterListDtoMapper implements DtoMapper<SqlMLocationMasterList, SqlMLocationMasterListDto>, Serializable {

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
    public BsSqlMLocationMasterListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlMLocationMasterListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlMLocationMasterListDto mappingToDto(SqlMLocationMasterList entity) {
        if (entity == null) {
            return null;
        }
        SqlMLocationMasterListDto dto = new SqlMLocationMasterListDto();
        dto.setLocGroup(entity.getLocGroup());
        dto.setLocGroupNm(entity.getLocGroupNm());
        dto.setLocationCd(entity.getLocationCd());
        dto.setAllocNgFlg(entity.getAllocNgFlg());
        dto.setAllocNgFlgNm(entity.getAllocNgFlgNm());
        dto.setDelFlg(entity.getDelFlg());
        dto.setDelFlgNm(entity.getDelFlgNm());
        dto.setLocationNm(entity.getLocationNm());
        dto.setPickingOrder(entity.getPickingOrder());
        dto.setPalletecapacity(entity.getPalletecapacity());
        dto.setMaxStoreNum(entity.getMaxStoreNum());
        dto.setLinblk(entity.getLinblk());
        dto.setLinOrBlock(entity.getLinOrBlock());
        dto.setLocid(entity.getLocid());
        dto.setLockbnNm(entity.getLockbnNm());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setBrctg(entity.getBrctg());
        dto.setSplrevun(entity.getSplrevun());
        dto.setReplenishmentRoundedupUnitNm(entity.getReplenishmentRoundedupUnitNm());
        dto.setSplrevctqa(entity.getSplrevctqa());
        dto.setReplenishPNum(entity.getReplenishPNum());
        dto.setBssplpt(entity.getBssplpt());
        dto.setTosplmd(entity.getTosplmd());
        dto.setTosplmdNm(entity.getTosplmdNm());
        dto.setPresplmd(entity.getPresplmd());
        dto.setPresplmdNm(entity.getPresplmdNm());
        dto.setTransportpriority(entity.getTransportpriority());
        dto.setVirtuallocflg(entity.getVirtuallocflg());
        dto.setLinnm(entity.getLinnm());
        dto.setBlknm(entity.getBlknm());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setClientId(entity.getClientId());
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        dto.setLocationId(entity.getLocationId());
        dto.setUpdDt(entity.getUpdDt());
        dto.setUserNm(entity.getUserNm());
        dto.setZone(entity.getZone());
        dto.setAllocOrder(entity.getAllocOrder());
        dto.setLocationType(entity.getLocationType());
        dto.setReplenishProductId(entity.getReplenishProductId());
        dto.setReplenishStockTypeId(entity.getReplenishStockTypeId());
        dto.setReplenishDepositId(entity.getReplenishDepositId());
        dto.setReplenishPProductShapeId(entity.getReplenishPProductShapeId());
        dto.setMaxStoreProductShapeId(entity.getMaxStoreProductShapeId());
        dto.setVersionNo(entity.getVersionNo());
        dto.setControlNo(entity.getControlNo());
        dto.setAddProcess(entity.getAddProcess());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlMLocationMasterListDto> mappingToDtoList(List<SqlMLocationMasterList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlMLocationMasterListDto> dtoList = new ArrayList<SqlMLocationMasterListDto>();
        for (SqlMLocationMasterList entity : entityList) {
            SqlMLocationMasterListDto dto = mappingToDto(entity);
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
    public SqlMLocationMasterList mappingToEntity(SqlMLocationMasterListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlMLocationMasterList entity = new SqlMLocationMasterList();
        if (needsMapping(dto, dto.getLocGroup(), "locGroup")) {
            entity.setLocGroup(dto.getLocGroup());
        }
        if (needsMapping(dto, dto.getLocGroupNm(), "locGroupNm")) {
            entity.setLocGroupNm(dto.getLocGroupNm());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getAllocNgFlg(), "allocNgFlg")) {
            entity.setAllocNgFlg(dto.getAllocNgFlg());
        }
        if (needsMapping(dto, dto.getAllocNgFlgNm(), "allocNgFlgNm")) {
            entity.setAllocNgFlgNm(dto.getAllocNgFlgNm());
        }
        if (needsMapping(dto, dto.getDelFlg(), "delFlg")) {
            entity.setDelFlgAsDelFlg(CDef.DelFlg.codeOf(dto.getDelFlg()));
        }
        if (needsMapping(dto, dto.getDelFlgNm(), "delFlgNm")) {
            entity.setDelFlgNm(dto.getDelFlgNm());
        }
        if (needsMapping(dto, dto.getLocationNm(), "locationNm")) {
            entity.setLocationNm(dto.getLocationNm());
        }
        if (needsMapping(dto, dto.getPickingOrder(), "pickingOrder")) {
            entity.setPickingOrder(dto.getPickingOrder());
        }
        if (needsMapping(dto, dto.getPalletecapacity(), "palletecapacity")) {
            entity.setPalletecapacity(dto.getPalletecapacity());
        }
        if (needsMapping(dto, dto.getMaxStoreNum(), "maxStoreNum")) {
            entity.setMaxStoreNum(dto.getMaxStoreNum());
        }
        if (needsMapping(dto, dto.getLinblk(), "linblk")) {
            entity.setLinblk(dto.getLinblk());
        }
        if (needsMapping(dto, dto.getLinOrBlock(), "linOrBlock")) {
            entity.setLinOrBlock(dto.getLinOrBlock());
        }
        if (needsMapping(dto, dto.getLocid(), "locid")) {
            entity.setLocid(dto.getLocid());
        }
        if (needsMapping(dto, dto.getLockbnNm(), "lockbnNm")) {
            entity.setLockbnNm(dto.getLockbnNm());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getBrctg(), "brctg")) {
            entity.setBrctg(dto.getBrctg());
        }
        if (needsMapping(dto, dto.getSplrevun(), "splrevun")) {
            entity.setSplrevun(dto.getSplrevun());
        }
        if (needsMapping(dto, dto.getReplenishmentRoundedupUnitNm(), "replenishmentRoundedupUnitNm")) {
            entity.setReplenishmentRoundedupUnitNm(dto.getReplenishmentRoundedupUnitNm());
        }
        if (needsMapping(dto, dto.getSplrevctqa(), "splrevctqa")) {
            entity.setSplrevctqa(dto.getSplrevctqa());
        }
        if (needsMapping(dto, dto.getReplenishPNum(), "replenishPNum")) {
            entity.setReplenishPNum(dto.getReplenishPNum());
        }
        if (needsMapping(dto, dto.getBssplpt(), "bssplpt")) {
            entity.setBssplpt(dto.getBssplpt());
        }
        if (needsMapping(dto, dto.getTosplmd(), "tosplmd")) {
            entity.setTosplmd(dto.getTosplmd());
        }
        if (needsMapping(dto, dto.getTosplmdNm(), "tosplmdNm")) {
            entity.setTosplmdNm(dto.getTosplmdNm());
        }
        if (needsMapping(dto, dto.getPresplmd(), "presplmd")) {
            entity.setPresplmd(dto.getPresplmd());
        }
        if (needsMapping(dto, dto.getPresplmdNm(), "presplmdNm")) {
            entity.setPresplmdNm(dto.getPresplmdNm());
        }
        if (needsMapping(dto, dto.getTransportpriority(), "transportpriority")) {
            entity.setTransportpriority(dto.getTransportpriority());
        }
        if (needsMapping(dto, dto.getVirtuallocflg(), "virtuallocflg")) {
            entity.setVirtuallocflg(dto.getVirtuallocflg());
        }
        if (needsMapping(dto, dto.getLinnm(), "linnm")) {
            entity.setLinnm(dto.getLinnm());
        }
        if (needsMapping(dto, dto.getBlknm(), "blknm")) {
            entity.setBlknm(dto.getBlknm());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
        }
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt")) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getUserNm(), "userNm")) {
            entity.setUserNm(dto.getUserNm());
        }
        if (needsMapping(dto, dto.getZone(), "zone")) {
            entity.setZone(dto.getZone());
        }
        if (needsMapping(dto, dto.getAllocOrder(), "allocOrder")) {
            entity.setAllocOrder(dto.getAllocOrder());
        }
        if (needsMapping(dto, dto.getLocationType(), "locationType")) {
            entity.setLocationType(dto.getLocationType());
        }
        if (needsMapping(dto, dto.getReplenishProductId(), "replenishProductId")) {
            entity.setReplenishProductId(dto.getReplenishProductId());
        }
        if (needsMapping(dto, dto.getReplenishStockTypeId(), "replenishStockTypeId")) {
            entity.setReplenishStockTypeId(dto.getReplenishStockTypeId());
        }
        if (needsMapping(dto, dto.getReplenishDepositId(), "replenishDepositId")) {
            entity.setReplenishDepositId(dto.getReplenishDepositId());
        }
        if (needsMapping(dto, dto.getReplenishPProductShapeId(), "replenishPProductShapeId")) {
            entity.setReplenishPProductShapeId(dto.getReplenishPProductShapeId());
        }
        if (needsMapping(dto, dto.getMaxStoreProductShapeId(), "maxStoreProductShapeId")) {
            entity.setMaxStoreProductShapeId(dto.getMaxStoreProductShapeId());
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getControlNo(), "controlNo")) {
            entity.setControlNo(dto.getControlNo());
        }
        if (needsMapping(dto, dto.getAddProcess(), "addProcess")) {
            entity.setAddProcess(dto.getAddProcess());
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
    protected boolean needsMapping(SqlMLocationMasterListDto dto, Object value, String propName) {
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
    public List<SqlMLocationMasterList> mappingToEntityList(List<SqlMLocationMasterListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlMLocationMasterList> entityList = new ArrayList<SqlMLocationMasterList>();
        for (SqlMLocationMasterListDto dto : dtoList) {
            SqlMLocationMasterList entity = mappingToEntity(dto);
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
    public SqlMLocationMasterListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlMLocationMasterListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlMLocationMasterListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlMLocationMasterListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlMLocationMasterListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlMLocationMasterListDtoMapper)this;
    }
}
