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
 * The DTO mapper of T_TRLEAVERESULT as TABLE. <br>
 * 出庫実績情報
 * <pre>
 * [primary-key]
 *     TRLEAVERESULT_ID
 *
 * [column]
 *     TRLEAVERESULT_ID, LEAVERESULTKEY, REFNO, TAXPALLETNO, FACTORYCD, PRODUCT_CD, MACHINENO, CREATENO, RCVKEY, CASEFLG, FIRMCARRYNO, LIMITDATE, DESIGNCD, BATJMFYM, QTY, LASTITEMCD, LASTDESIGNCD, SHIPCD, CARRYOUTDATE, SHIPTOCD, RCVDATE, SHTYPECD, TPLQTY, RCVPALLETNO, CASEQTY, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRLEAVERESULT_ID
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
public abstract class BsTTrleaveresultDtoMapper implements DtoMapper<TTrleaveresult, TTrleaveresultDto>, Serializable {

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
    public BsTTrleaveresultDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrleaveresultDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrleaveresultDto mappingToDto(TTrleaveresult entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrleaveresultDto dto = new TTrleaveresultDto();
        dto.setTrleaveresultId(entity.getTrleaveresultId());
        dto.setLeaveresultkey(entity.getLeaveresultkey());
        dto.setRefno(entity.getRefno());
        dto.setTaxpalletno(entity.getTaxpalletno());
        dto.setFactorycd(entity.getFactorycd());
        dto.setProductCd(entity.getProductCd());
        dto.setMachineno(entity.getMachineno());
        dto.setCreateno(entity.getCreateno());
        dto.setRcvkey(entity.getRcvkey());
        dto.setCaseflg(entity.getCaseflg());
        dto.setFirmcarryno(entity.getFirmcarryno());
        dto.setLimitdate(entity.getLimitdate());
        dto.setDesigncd(entity.getDesigncd());
        dto.setBatjmfym(entity.getBatjmfym());
        dto.setQty(entity.getQty());
        dto.setLastitemcd(entity.getLastitemcd());
        dto.setLastdesigncd(entity.getLastdesigncd());
        dto.setShipcd(entity.getShipcd());
        dto.setCarryoutdate(entity.getCarryoutdate());
        dto.setShiptocd(entity.getShiptocd());
        dto.setRcvdate(entity.getRcvdate());
        dto.setShtypecd(entity.getShtypecd());
        dto.setTplqty(entity.getTplqty());
        dto.setRcvpalletno(entity.getRcvpalletno());
        dto.setCaseqty(entity.getCaseqty());
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
    public List<TTrleaveresultDto> mappingToDtoList(List<TTrleaveresult> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrleaveresultDto> dtoList = new ArrayList<TTrleaveresultDto>();
        for (TTrleaveresult entity : entityList) {
            TTrleaveresultDto dto = mappingToDto(entity);
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
    public TTrleaveresult mappingToEntity(TTrleaveresultDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrleaveresult entity = new TTrleaveresult();
        if (needsMapping(dto, dto.getTrleaveresultId(), "trleaveresultId")) {
            entity.setTrleaveresultId(dto.getTrleaveresultId());
        }
        if (needsMapping(dto, dto.getLeaveresultkey(), "leaveresultkey")) {
            entity.setLeaveresultkey(dto.getLeaveresultkey());
        }
        if (needsMapping(dto, dto.getRefno(), "refno")) {
            entity.setRefno(dto.getRefno());
        }
        if (needsMapping(dto, dto.getTaxpalletno(), "taxpalletno")) {
            entity.setTaxpalletno(dto.getTaxpalletno());
        }
        if (needsMapping(dto, dto.getFactorycd(), "factorycd")) {
            entity.setFactorycd(dto.getFactorycd());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getMachineno(), "machineno")) {
            entity.setMachineno(dto.getMachineno());
        }
        if (needsMapping(dto, dto.getCreateno(), "createno")) {
            entity.setCreateno(dto.getCreateno());
        }
        if (needsMapping(dto, dto.getRcvkey(), "rcvkey")) {
            entity.setRcvkey(dto.getRcvkey());
        }
        if (needsMapping(dto, dto.getCaseflg(), "caseflg")) {
            entity.setCaseflg(dto.getCaseflg());
        }
        if (needsMapping(dto, dto.getFirmcarryno(), "firmcarryno")) {
            entity.setFirmcarryno(dto.getFirmcarryno());
        }
        if (needsMapping(dto, dto.getLimitdate(), "limitdate")) {
            entity.setLimitdate(dto.getLimitdate());
        }
        if (needsMapping(dto, dto.getDesigncd(), "designcd")) {
            entity.setDesigncd(dto.getDesigncd());
        }
        if (needsMapping(dto, dto.getBatjmfym(), "batjmfym")) {
            entity.setBatjmfym(dto.getBatjmfym());
        }
        if (needsMapping(dto, dto.getQty(), "qty")) {
            entity.setQty(dto.getQty());
        }
        if (needsMapping(dto, dto.getLastitemcd(), "lastitemcd")) {
            entity.setLastitemcd(dto.getLastitemcd());
        }
        if (needsMapping(dto, dto.getLastdesigncd(), "lastdesigncd")) {
            entity.setLastdesigncd(dto.getLastdesigncd());
        }
        if (needsMapping(dto, dto.getShipcd(), "shipcd")) {
            entity.setShipcd(dto.getShipcd());
        }
        if (needsMapping(dto, dto.getCarryoutdate(), "carryoutdate")) {
            entity.setCarryoutdate(dto.getCarryoutdate());
        }
        if (needsMapping(dto, dto.getShiptocd(), "shiptocd")) {
            entity.setShiptocd(dto.getShiptocd());
        }
        if (needsMapping(dto, dto.getRcvdate(), "rcvdate")) {
            entity.setRcvdate(dto.getRcvdate());
        }
        if (needsMapping(dto, dto.getShtypecd(), "shtypecd")) {
            entity.setShtypecd(dto.getShtypecd());
        }
        if (needsMapping(dto, dto.getTplqty(), "tplqty")) {
            entity.setTplqty(dto.getTplqty());
        }
        if (needsMapping(dto, dto.getRcvpalletno(), "rcvpalletno")) {
            entity.setRcvpalletno(dto.getRcvpalletno());
        }
        if (needsMapping(dto, dto.getCaseqty(), "caseqty")) {
            entity.setCaseqty(dto.getCaseqty());
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
    protected boolean needsMapping(TTrleaveresultDto dto, Object value, String propName) {
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
    public List<TTrleaveresult> mappingToEntityList(List<TTrleaveresultDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrleaveresult> entityList = new ArrayList<TTrleaveresult>();
        for (TTrleaveresultDto dto : dtoList) {
            TTrleaveresult entity = mappingToEntity(dto);
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
    public TTrleaveresultDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrleaveresultDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrleaveresultDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrleaveresultDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrleaveresultDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrleaveresultDtoMapper)this;
    }
}
