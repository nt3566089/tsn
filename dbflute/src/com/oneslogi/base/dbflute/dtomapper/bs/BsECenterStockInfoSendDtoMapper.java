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
 * The DTO mapper of E_CENTER_STOCK_INFO_SEND as TABLE. <br>
 * 拠点別在庫情報送信テーブル(国産)
 * <pre>
 * [primary-key]
 *     CENTER_STOCK_INFO_SEND_ID
 *
 * [column]
 *     CENTER_STOCK_INFO_SEND_ID, SEQNO, PROCESS_DT, WAREHOUSE_CD, WAREHOUSE_NAME, ITEM_CD, ITEM_NAME, LIMIT_DATE, DESIGN_CD, INV_TYPE, INV_NUM, TRANSPORT_CD, FIRMTRANSPORT_CD, SOURCE_CD, SOURCE_NAME, SCH_DATE, RECEIVE_DATE, SCHRECEIVE_DATE, SCHRECEIVE_NUM, TRANSPORT_PRIORITY, ITEM_SORT, USE_TYPE, SEND_CD, SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_STOCK_INFO_SEND_ID
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
public abstract class BsECenterStockInfoSendDtoMapper implements DtoMapper<ECenterStockInfoSend, ECenterStockInfoSendDto>, Serializable {

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
    public BsECenterStockInfoSendDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsECenterStockInfoSendDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public ECenterStockInfoSendDto mappingToDto(ECenterStockInfoSend entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ECenterStockInfoSendDto dto = new ECenterStockInfoSendDto();
        dto.setCenterStockInfoSendId(entity.getCenterStockInfoSendId());
        dto.setSeqno(entity.getSeqno());
        dto.setProcessDt(entity.getProcessDt());
        dto.setWarehouseCd(entity.getWarehouseCd());
        dto.setWarehouseName(entity.getWarehouseName());
        dto.setItemCd(entity.getItemCd());
        dto.setItemName(entity.getItemName());
        dto.setLimitDate(entity.getLimitDate());
        dto.setDesignCd(entity.getDesignCd());
        dto.setInvType(entity.getInvType());
        dto.setInvNum(entity.getInvNum());
        dto.setTransportCd(entity.getTransportCd());
        dto.setFirmtransportCd(entity.getFirmtransportCd());
        dto.setSourceCd(entity.getSourceCd());
        dto.setSourceName(entity.getSourceName());
        dto.setSchDate(entity.getSchDate());
        dto.setReceiveDate(entity.getReceiveDate());
        dto.setSchreceiveDate(entity.getSchreceiveDate());
        dto.setSchreceiveNum(entity.getSchreceiveNum());
        dto.setTransportPriority(entity.getTransportPriority());
        dto.setItemSort(entity.getItemSort());
        dto.setUseType(entity.getUseType());
        dto.setSendCd(entity.getSendCd());
        dto.setSendFlg(entity.getSendFlg());
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
    public List<ECenterStockInfoSendDto> mappingToDtoList(List<ECenterStockInfoSend> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ECenterStockInfoSendDto> dtoList = new ArrayList<ECenterStockInfoSendDto>();
        for (ECenterStockInfoSend entity : entityList) {
            ECenterStockInfoSendDto dto = mappingToDto(entity);
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
    public ECenterStockInfoSend mappingToEntity(ECenterStockInfoSendDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ECenterStockInfoSend entity = new ECenterStockInfoSend();
        if (needsMapping(dto, dto.getCenterStockInfoSendId(), "centerStockInfoSendId")) {
            entity.setCenterStockInfoSendId(dto.getCenterStockInfoSendId());
        }
        if (needsMapping(dto, dto.getSeqno(), "seqno")) {
            entity.setSeqno(dto.getSeqno());
        }
        if (needsMapping(dto, dto.getProcessDt(), "processDt")) {
            entity.setProcessDt(dto.getProcessDt());
        }
        if (needsMapping(dto, dto.getWarehouseCd(), "warehouseCd")) {
            entity.setWarehouseCd(dto.getWarehouseCd());
        }
        if (needsMapping(dto, dto.getWarehouseName(), "warehouseName")) {
            entity.setWarehouseName(dto.getWarehouseName());
        }
        if (needsMapping(dto, dto.getItemCd(), "itemCd")) {
            entity.setItemCd(dto.getItemCd());
        }
        if (needsMapping(dto, dto.getItemName(), "itemName")) {
            entity.setItemName(dto.getItemName());
        }
        if (needsMapping(dto, dto.getLimitDate(), "limitDate")) {
            entity.setLimitDate(dto.getLimitDate());
        }
        if (needsMapping(dto, dto.getDesignCd(), "designCd")) {
            entity.setDesignCd(dto.getDesignCd());
        }
        if (needsMapping(dto, dto.getInvType(), "invType")) {
            entity.setInvType(dto.getInvType());
        }
        if (needsMapping(dto, dto.getInvNum(), "invNum")) {
            entity.setInvNum(dto.getInvNum());
        }
        if (needsMapping(dto, dto.getTransportCd(), "transportCd")) {
            entity.setTransportCd(dto.getTransportCd());
        }
        if (needsMapping(dto, dto.getFirmtransportCd(), "firmtransportCd")) {
            entity.setFirmtransportCd(dto.getFirmtransportCd());
        }
        if (needsMapping(dto, dto.getSourceCd(), "sourceCd")) {
            entity.setSourceCd(dto.getSourceCd());
        }
        if (needsMapping(dto, dto.getSourceName(), "sourceName")) {
            entity.setSourceName(dto.getSourceName());
        }
        if (needsMapping(dto, dto.getSchDate(), "schDate")) {
            entity.setSchDate(dto.getSchDate());
        }
        if (needsMapping(dto, dto.getReceiveDate(), "receiveDate")) {
            entity.setReceiveDate(dto.getReceiveDate());
        }
        if (needsMapping(dto, dto.getSchreceiveDate(), "schreceiveDate")) {
            entity.setSchreceiveDate(dto.getSchreceiveDate());
        }
        if (needsMapping(dto, dto.getSchreceiveNum(), "schreceiveNum")) {
            entity.setSchreceiveNum(dto.getSchreceiveNum());
        }
        if (needsMapping(dto, dto.getTransportPriority(), "transportPriority")) {
            entity.setTransportPriority(dto.getTransportPriority());
        }
        if (needsMapping(dto, dto.getItemSort(), "itemSort")) {
            entity.setItemSort(dto.getItemSort());
        }
        if (needsMapping(dto, dto.getUseType(), "useType")) {
            entity.setUseType(dto.getUseType());
        }
        if (needsMapping(dto, dto.getSendCd(), "sendCd")) {
            entity.setSendCd(dto.getSendCd());
        }
        if (needsMapping(dto, dto.getSendFlg(), "sendFlg")) {
            entity.setSendFlg(dto.getSendFlg());
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
    protected boolean needsMapping(ECenterStockInfoSendDto dto, Object value, String propName) {
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
    public List<ECenterStockInfoSend> mappingToEntityList(List<ECenterStockInfoSendDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<ECenterStockInfoSend> entityList = new ArrayList<ECenterStockInfoSend>();
        for (ECenterStockInfoSendDto dto : dtoList) {
            ECenterStockInfoSend entity = mappingToEntity(dto);
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
    public ECenterStockInfoSendDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ECenterStockInfoSendDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ECenterStockInfoSendDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ECenterStockInfoSendDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ECenterStockInfoSendDtoMapper reverseReference() {
        setReverseReference(true);
        return (ECenterStockInfoSendDtoMapper)this;
    }
}
