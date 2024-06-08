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
 * The DTO mapper of E_CORDDTAAM_SEND as TABLE. <br>
 * さしず実績送信テーブル
 * <pre>
 * [primary-key]
 *     CORDDTAAM_SEND_ID
 *
 * [column]
 *     CORDDTAAM_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CENTER_CD, DELIVAY_CENTER_CD, DELIVERY_DATETIME, DIRECTION_CD, PISTON_TYPE, CAP_DIRECTION_CD, CAP_PISTON_TYPE, SORT_LINE_CD, SORT_ORDER, CUSTOMER_CD, CUSTOMER_NM, PRODUCT_CD, SLQACB, SLQACT, LINE_BLOCK, LOCATION_NO, LOCATION_TYPE, DELIVERY_PRINT_RANK, DELIVERY_SEQ_NO, DELIVERY_BRANCH_NO, SORT_WORK_DT, CSROPRTCNT, CUTTOPDIRASSORD, PRODUCT_TYPE, BOX_NO, BOX_NO_SEQ_NO, BOX_TYPE, MERGE_BOX_VISIBLE_TYPE, DM_VISIBLE_TYPE, TOTAL_BOX_CNT, BOX_CARTON_SUM, BOX_CARTON_SORT_NUM, TTTOPDEDRNK, LINE_BLOCK_BOX_NO, LINE_BLOCK_TOTAL_BOX_CNT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CORDDTAAM_SEND_ID
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
public abstract class BsECorddtaamSendDtoMapper implements DtoMapper<ECorddtaamSend, ECorddtaamSendDto>, Serializable {

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
    public BsECorddtaamSendDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsECorddtaamSendDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public ECorddtaamSendDto mappingToDto(ECorddtaamSend entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ECorddtaamSendDto dto = new ECorddtaamSendDto();
        dto.setCorddtaamSendId(entity.getCorddtaamSendId());
        dto.setSendCd(entity.getSendCd());
        dto.setSendRowId(entity.getSendRowId());
        dto.setWorkFlg(entity.getWorkFlg());
        dto.setCenterCd(entity.getCenterCd());
        dto.setDelivayCenterCd(entity.getDelivayCenterCd());
        dto.setDeliveryDatetime(entity.getDeliveryDatetime());
        dto.setDirectionCd(entity.getDirectionCd());
        dto.setPistonType(entity.getPistonType());
        dto.setCapDirectionCd(entity.getCapDirectionCd());
        dto.setCapPistonType(entity.getCapPistonType());
        dto.setSortLineCd(entity.getSortLineCd());
        dto.setSortOrder(entity.getSortOrder());
        dto.setCustomerCd(entity.getCustomerCd());
        dto.setCustomerNm(entity.getCustomerNm());
        dto.setProductCd(entity.getProductCd());
        dto.setSlqacb(entity.getSlqacb());
        dto.setSlqact(entity.getSlqact());
        dto.setLineBlock(entity.getLineBlock());
        dto.setLocationNo(entity.getLocationNo());
        dto.setLocationType(entity.getLocationType());
        dto.setDeliveryPrintRank(entity.getDeliveryPrintRank());
        dto.setDeliverySeqNo(entity.getDeliverySeqNo());
        dto.setDeliveryBranchNo(entity.getDeliveryBranchNo());
        dto.setSortWorkDt(entity.getSortWorkDt());
        dto.setCsroprtcnt(entity.getCsroprtcnt());
        dto.setCuttopdirassord(entity.getCuttopdirassord());
        dto.setProductType(entity.getProductType());
        dto.setBoxNo(entity.getBoxNo());
        dto.setBoxNoSeqNo(entity.getBoxNoSeqNo());
        dto.setBoxType(entity.getBoxType());
        dto.setMergeBoxVisibleType(entity.getMergeBoxVisibleType());
        dto.setDmVisibleType(entity.getDmVisibleType());
        dto.setTotalBoxCnt(entity.getTotalBoxCnt());
        dto.setBoxCartonSum(entity.getBoxCartonSum());
        dto.setBoxCartonSortNum(entity.getBoxCartonSortNum());
        dto.setTttopdedrnk(entity.getTttopdedrnk());
        dto.setLineBlockBoxNo(entity.getLineBlockBoxNo());
        dto.setLineBlockTotalBoxCnt(entity.getLineBlockTotalBoxCnt());
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
    public List<ECorddtaamSendDto> mappingToDtoList(List<ECorddtaamSend> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ECorddtaamSendDto> dtoList = new ArrayList<ECorddtaamSendDto>();
        for (ECorddtaamSend entity : entityList) {
            ECorddtaamSendDto dto = mappingToDto(entity);
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
    public ECorddtaamSend mappingToEntity(ECorddtaamSendDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ECorddtaamSend entity = new ECorddtaamSend();
        if (needsMapping(dto, dto.getCorddtaamSendId(), "corddtaamSendId")) {
            entity.setCorddtaamSendId(dto.getCorddtaamSendId());
        }
        if (needsMapping(dto, dto.getSendCd(), "sendCd")) {
            entity.setSendCd(dto.getSendCd());
        }
        if (needsMapping(dto, dto.getSendRowId(), "sendRowId")) {
            entity.setSendRowId(dto.getSendRowId());
        }
        if (needsMapping(dto, dto.getWorkFlg(), "workFlg")) {
            entity.setWorkFlg(dto.getWorkFlg());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getDelivayCenterCd(), "delivayCenterCd")) {
            entity.setDelivayCenterCd(dto.getDelivayCenterCd());
        }
        if (needsMapping(dto, dto.getDeliveryDatetime(), "deliveryDatetime")) {
            entity.setDeliveryDatetime(dto.getDeliveryDatetime());
        }
        if (needsMapping(dto, dto.getDirectionCd(), "directionCd")) {
            entity.setDirectionCd(dto.getDirectionCd());
        }
        if (needsMapping(dto, dto.getPistonType(), "pistonType")) {
            entity.setPistonType(dto.getPistonType());
        }
        if (needsMapping(dto, dto.getCapDirectionCd(), "capDirectionCd")) {
            entity.setCapDirectionCd(dto.getCapDirectionCd());
        }
        if (needsMapping(dto, dto.getCapPistonType(), "capPistonType")) {
            entity.setCapPistonType(dto.getCapPistonType());
        }
        if (needsMapping(dto, dto.getSortLineCd(), "sortLineCd")) {
            entity.setSortLineCd(dto.getSortLineCd());
        }
        if (needsMapping(dto, dto.getSortOrder(), "sortOrder")) {
            entity.setSortOrder(dto.getSortOrder());
        }
        if (needsMapping(dto, dto.getCustomerCd(), "customerCd")) {
            entity.setCustomerCd(dto.getCustomerCd());
        }
        if (needsMapping(dto, dto.getCustomerNm(), "customerNm")) {
            entity.setCustomerNm(dto.getCustomerNm());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getSlqacb(), "slqacb")) {
            entity.setSlqacb(dto.getSlqacb());
        }
        if (needsMapping(dto, dto.getSlqact(), "slqact")) {
            entity.setSlqact(dto.getSlqact());
        }
        if (needsMapping(dto, dto.getLineBlock(), "lineBlock")) {
            entity.setLineBlock(dto.getLineBlock());
        }
        if (needsMapping(dto, dto.getLocationNo(), "locationNo")) {
            entity.setLocationNo(dto.getLocationNo());
        }
        if (needsMapping(dto, dto.getLocationType(), "locationType")) {
            entity.setLocationType(dto.getLocationType());
        }
        if (needsMapping(dto, dto.getDeliveryPrintRank(), "deliveryPrintRank")) {
            entity.setDeliveryPrintRank(dto.getDeliveryPrintRank());
        }
        if (needsMapping(dto, dto.getDeliverySeqNo(), "deliverySeqNo")) {
            entity.setDeliverySeqNo(dto.getDeliverySeqNo());
        }
        if (needsMapping(dto, dto.getDeliveryBranchNo(), "deliveryBranchNo")) {
            entity.setDeliveryBranchNo(dto.getDeliveryBranchNo());
        }
        if (needsMapping(dto, dto.getSortWorkDt(), "sortWorkDt")) {
            entity.setSortWorkDt(dto.getSortWorkDt());
        }
        if (needsMapping(dto, dto.getCsroprtcnt(), "csroprtcnt")) {
            entity.setCsroprtcnt(dto.getCsroprtcnt());
        }
        if (needsMapping(dto, dto.getCuttopdirassord(), "cuttopdirassord")) {
            entity.setCuttopdirassord(dto.getCuttopdirassord());
        }
        if (needsMapping(dto, dto.getProductType(), "productType")) {
            entity.setProductType(dto.getProductType());
        }
        if (needsMapping(dto, dto.getBoxNo(), "boxNo")) {
            entity.setBoxNo(dto.getBoxNo());
        }
        if (needsMapping(dto, dto.getBoxNoSeqNo(), "boxNoSeqNo")) {
            entity.setBoxNoSeqNo(dto.getBoxNoSeqNo());
        }
        if (needsMapping(dto, dto.getBoxType(), "boxType")) {
            entity.setBoxType(dto.getBoxType());
        }
        if (needsMapping(dto, dto.getMergeBoxVisibleType(), "mergeBoxVisibleType")) {
            entity.setMergeBoxVisibleType(dto.getMergeBoxVisibleType());
        }
        if (needsMapping(dto, dto.getDmVisibleType(), "dmVisibleType")) {
            entity.setDmVisibleType(dto.getDmVisibleType());
        }
        if (needsMapping(dto, dto.getTotalBoxCnt(), "totalBoxCnt")) {
            entity.setTotalBoxCnt(dto.getTotalBoxCnt());
        }
        if (needsMapping(dto, dto.getBoxCartonSum(), "boxCartonSum")) {
            entity.setBoxCartonSum(dto.getBoxCartonSum());
        }
        if (needsMapping(dto, dto.getBoxCartonSortNum(), "boxCartonSortNum")) {
            entity.setBoxCartonSortNum(dto.getBoxCartonSortNum());
        }
        if (needsMapping(dto, dto.getTttopdedrnk(), "tttopdedrnk")) {
            entity.setTttopdedrnk(dto.getTttopdedrnk());
        }
        if (needsMapping(dto, dto.getLineBlockBoxNo(), "lineBlockBoxNo")) {
            entity.setLineBlockBoxNo(dto.getLineBlockBoxNo());
        }
        if (needsMapping(dto, dto.getLineBlockTotalBoxCnt(), "lineBlockTotalBoxCnt")) {
            entity.setLineBlockTotalBoxCnt(dto.getLineBlockTotalBoxCnt());
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
    protected boolean needsMapping(ECorddtaamSendDto dto, Object value, String propName) {
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
    public List<ECorddtaamSend> mappingToEntityList(List<ECorddtaamSendDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<ECorddtaamSend> entityList = new ArrayList<ECorddtaamSend>();
        for (ECorddtaamSendDto dto : dtoList) {
            ECorddtaamSend entity = mappingToEntity(dto);
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
    public ECorddtaamSendDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ECorddtaamSendDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ECorddtaamSendDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ECorddtaamSendDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ECorddtaamSendDtoMapper reverseReference() {
        setReverseReference(true);
        return (ECorddtaamSendDtoMapper)this;
    }
}
