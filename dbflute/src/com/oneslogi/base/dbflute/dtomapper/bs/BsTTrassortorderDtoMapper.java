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
 * The DTO mapper of T_TRASSORTORDER as TABLE. <br>
 * 追跡情報(棚卸)
 * <pre>
 * [primary-key]
 *     DIRECTIONORDERKEY, DIRECTIONORDERGNO
 *
 * [column]
 *     DIRECTIONORDERKEY, DIRECTIONORDERGNO, ACTFLG, WAREHOUSECD, RCVDATE, SHIPORDER, RANGESTART, RANGEEND, DPWAREHOUSECD, DELIVERYDATE, ITEMCD, LINECD, SOTEDUNIT, ASSORTEDORDER, DELIVERYSEQNO, DELIVERYBRANCHNO, CASENO, CASESERIAL, SOTEDLOC, PRODUCT_CD, DIRECTIONCD, PISTONTYPE, CUSTOMERCD, DIRECTIONNUM, SROPRTCNT, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DIRECTIONORDERKEY
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
public abstract class BsTTrassortorderDtoMapper implements DtoMapper<TTrassortorder, TTrassortorderDto>, Serializable {

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
    public BsTTrassortorderDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrassortorderDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrassortorderDto mappingToDto(TTrassortorder entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrassortorderDto dto = new TTrassortorderDto();
        dto.setDirectionorderkey(entity.getDirectionorderkey());
        dto.setDirectionordergno(entity.getDirectionordergno());
        dto.setActflg(entity.getActflg());
        dto.setWarehousecd(entity.getWarehousecd());
        dto.setRcvdate(entity.getRcvdate());
        dto.setShiporder(entity.getShiporder());
        dto.setRangestart(entity.getRangestart());
        dto.setRangeend(entity.getRangeend());
        dto.setDpwarehousecd(entity.getDpwarehousecd());
        dto.setDeliverydate(entity.getDeliverydate());
        dto.setItemcd(entity.getItemcd());
        dto.setLinecd(entity.getLinecd());
        dto.setSotedunit(entity.getSotedunit());
        dto.setAssortedorder(entity.getAssortedorder());
        dto.setDeliveryseqno(entity.getDeliveryseqno());
        dto.setDeliverybranchno(entity.getDeliverybranchno());
        dto.setCaseno(entity.getCaseno());
        dto.setCaseserial(entity.getCaseserial());
        dto.setSotedloc(entity.getSotedloc());
        dto.setProductCd(entity.getProductCd());
        dto.setDirectioncd(entity.getDirectioncd());
        dto.setPistontype(entity.getPistontype());
        dto.setCustomercd(entity.getCustomercd());
        dto.setDirectionnum(entity.getDirectionnum());
        dto.setSroprtcnt(entity.getSroprtcnt());
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
    public List<TTrassortorderDto> mappingToDtoList(List<TTrassortorder> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrassortorderDto> dtoList = new ArrayList<TTrassortorderDto>();
        for (TTrassortorder entity : entityList) {
            TTrassortorderDto dto = mappingToDto(entity);
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
    public TTrassortorder mappingToEntity(TTrassortorderDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrassortorder entity = new TTrassortorder();
        if (needsMapping(dto, dto.getDirectionorderkey(), "directionorderkey")) {
            entity.setDirectionorderkey(dto.getDirectionorderkey());
        }
        if (needsMapping(dto, dto.getDirectionordergno(), "directionordergno")) {
            entity.setDirectionordergno(dto.getDirectionordergno());
        }
        if (needsMapping(dto, dto.getActflg(), "actflg")) {
            entity.setActflg(dto.getActflg());
        }
        if (needsMapping(dto, dto.getWarehousecd(), "warehousecd")) {
            entity.setWarehousecd(dto.getWarehousecd());
        }
        if (needsMapping(dto, dto.getRcvdate(), "rcvdate")) {
            entity.setRcvdate(dto.getRcvdate());
        }
        if (needsMapping(dto, dto.getShiporder(), "shiporder")) {
            entity.setShiporder(dto.getShiporder());
        }
        if (needsMapping(dto, dto.getRangestart(), "rangestart")) {
            entity.setRangestart(dto.getRangestart());
        }
        if (needsMapping(dto, dto.getRangeend(), "rangeend")) {
            entity.setRangeend(dto.getRangeend());
        }
        if (needsMapping(dto, dto.getDpwarehousecd(), "dpwarehousecd")) {
            entity.setDpwarehousecd(dto.getDpwarehousecd());
        }
        if (needsMapping(dto, dto.getDeliverydate(), "deliverydate")) {
            entity.setDeliverydate(dto.getDeliverydate());
        }
        if (needsMapping(dto, dto.getItemcd(), "itemcd")) {
            entity.setItemcd(dto.getItemcd());
        }
        if (needsMapping(dto, dto.getLinecd(), "linecd")) {
            entity.setLinecd(dto.getLinecd());
        }
        if (needsMapping(dto, dto.getSotedunit(), "sotedunit")) {
            entity.setSotedunit(dto.getSotedunit());
        }
        if (needsMapping(dto, dto.getAssortedorder(), "assortedorder")) {
            entity.setAssortedorder(dto.getAssortedorder());
        }
        if (needsMapping(dto, dto.getDeliveryseqno(), "deliveryseqno")) {
            entity.setDeliveryseqno(dto.getDeliveryseqno());
        }
        if (needsMapping(dto, dto.getDeliverybranchno(), "deliverybranchno")) {
            entity.setDeliverybranchno(dto.getDeliverybranchno());
        }
        if (needsMapping(dto, dto.getCaseno(), "caseno")) {
            entity.setCaseno(dto.getCaseno());
        }
        if (needsMapping(dto, dto.getCaseserial(), "caseserial")) {
            entity.setCaseserial(dto.getCaseserial());
        }
        if (needsMapping(dto, dto.getSotedloc(), "sotedloc")) {
            entity.setSotedloc(dto.getSotedloc());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
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
        if (needsMapping(dto, dto.getSroprtcnt(), "sroprtcnt")) {
            entity.setSroprtcnt(dto.getSroprtcnt());
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
    protected boolean needsMapping(TTrassortorderDto dto, Object value, String propName) {
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
    public List<TTrassortorder> mappingToEntityList(List<TTrassortorderDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrassortorder> entityList = new ArrayList<TTrassortorder>();
        for (TTrassortorderDto dto : dtoList) {
            TTrassortorder entity = mappingToEntity(dto);
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
    public TTrassortorderDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrassortorderDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrassortorderDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrassortorderDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrassortorderDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrassortorderDtoMapper)this;
    }
}
