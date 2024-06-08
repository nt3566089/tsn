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
 * The DTO mapper of E_TRACKING_INFO_IMPORT as TABLE. <br>
 * 追跡情報送信テーブル（輸入）
 * <pre>
 * [primary-key]
 *     TRACKING_INFO_IMPORT_ID
 *
 * [column]
 *     TRACKING_INFO_IMPORT_ID, SYMBOLPOSKEY, WAREHOUSECD, WAREHOUSE_SNAME, FACTORY_SNAME, FACTORYCD, ITEMCD_CASE, ITEM_SNAME_CASE, ITEMCD_WH, ITEM_SNAME_WH, RCVKEY, MACHINENO, CREATENO, LIMITDATENOW, DESIGNCD_CASE, LOT1, MANUFACTURECD, OTHERLOT1, CASECREATETYPE, CASECREATETYPE_NM, RECEIVEDATE, ARRIVALPORTDATE, SHIPNAME, INITNUM, MIXEDFLG, LENDFLG, LOCGROUP, LOCCD, SHIPDATE, CURRENT_LOCATION_CD, CURRENT_LOCATION_SNAME, ADDDATETIME, TRACETYPE, OTHERCD1, EXAMSTS, CASEINNUMBOWL, SHIPNUMBOWL, SUPPLIERRCVNO, TOKUHANCD, TOKUHAN_NM, MAKERCASENO, CASEITFNO, CASEBARCODEVALIANT, CASELOT4, CASECENTERNO, CASEPACKNO, CASEPACKTIME, SENDER_LOCATION, RECEIVER_LOCATION, SHIPMENT_ID, SHIPMENT_DATE, NUMBER_OF_PALLETS, CARRIERNO, TKHNORDERNO, SRCCD, BLNO, INVOICENO, SSCC, CASENO, INV_NUM, SORT_NUM, ADOPT_NUM, SEND_CD, SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRACKING_INFO_IMPORT_ID
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
public abstract class BsETrackingInfoImportDtoMapper implements DtoMapper<ETrackingInfoImport, ETrackingInfoImportDto>, Serializable {

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
    public BsETrackingInfoImportDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsETrackingInfoImportDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public ETrackingInfoImportDto mappingToDto(ETrackingInfoImport entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ETrackingInfoImportDto dto = new ETrackingInfoImportDto();
        dto.setTrackingInfoImportId(entity.getTrackingInfoImportId());
        dto.setSymbolposkey(entity.getSymbolposkey());
        dto.setWarehousecd(entity.getWarehousecd());
        dto.setWarehouseSname(entity.getWarehouseSname());
        dto.setFactorySname(entity.getFactorySname());
        dto.setFactorycd(entity.getFactorycd());
        dto.setItemcdCase(entity.getItemcdCase());
        dto.setItemSnameCase(entity.getItemSnameCase());
        dto.setItemcdWh(entity.getItemcdWh());
        dto.setItemSnameWh(entity.getItemSnameWh());
        dto.setRcvkey(entity.getRcvkey());
        dto.setMachineno(entity.getMachineno());
        dto.setCreateno(entity.getCreateno());
        dto.setLimitdatenow(entity.getLimitdatenow());
        dto.setDesigncdCase(entity.getDesigncdCase());
        dto.setLot1(entity.getLot1());
        dto.setManufacturecd(entity.getManufacturecd());
        dto.setOtherlot1(entity.getOtherlot1());
        dto.setCasecreatetype(entity.getCasecreatetype());
        dto.setCasecreatetypeNm(entity.getCasecreatetypeNm());
        dto.setReceivedate(entity.getReceivedate());
        dto.setArrivalportdate(entity.getArrivalportdate());
        dto.setShipname(entity.getShipname());
        dto.setInitnum(entity.getInitnum());
        dto.setMixedflg(entity.getMixedflg());
        dto.setLendflg(entity.getLendflg());
        dto.setLocgroup(entity.getLocgroup());
        dto.setLoccd(entity.getLoccd());
        dto.setShipdate(entity.getShipdate());
        dto.setCurrentLocationCd(entity.getCurrentLocationCd());
        dto.setCurrentLocationSname(entity.getCurrentLocationSname());
        dto.setAdddatetime(entity.getAdddatetime());
        dto.setTracetype(entity.getTracetype());
        dto.setOthercd1(entity.getOthercd1());
        dto.setExamsts(entity.getExamsts());
        dto.setCaseinnumbowl(entity.getCaseinnumbowl());
        dto.setShipnumbowl(entity.getShipnumbowl());
        dto.setSupplierrcvno(entity.getSupplierrcvno());
        dto.setTokuhancd(entity.getTokuhancd());
        dto.setTokuhanNm(entity.getTokuhanNm());
        dto.setMakercaseno(entity.getMakercaseno());
        dto.setCaseitfno(entity.getCaseitfno());
        dto.setCasebarcodevaliant(entity.getCasebarcodevaliant());
        dto.setCaselot4(entity.getCaselot4());
        dto.setCasecenterno(entity.getCasecenterno());
        dto.setCasepackno(entity.getCasepackno());
        dto.setCasepacktime(entity.getCasepacktime());
        dto.setSenderLocation(entity.getSenderLocation());
        dto.setReceiverLocation(entity.getReceiverLocation());
        dto.setShipmentId(entity.getShipmentId());
        dto.setShipmentDate(entity.getShipmentDate());
        dto.setNumberOfPallets(entity.getNumberOfPallets());
        dto.setCarrierno(entity.getCarrierno());
        dto.setTkhnorderno(entity.getTkhnorderno());
        dto.setSrccd(entity.getSrccd());
        dto.setBlno(entity.getBlno());
        dto.setInvoiceno(entity.getInvoiceno());
        dto.setSscc(entity.getSscc());
        dto.setCaseno(entity.getCaseno());
        dto.setInvNum(entity.getInvNum());
        dto.setSortNum(entity.getSortNum());
        dto.setAdoptNum(entity.getAdoptNum());
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
    public List<ETrackingInfoImportDto> mappingToDtoList(List<ETrackingInfoImport> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ETrackingInfoImportDto> dtoList = new ArrayList<ETrackingInfoImportDto>();
        for (ETrackingInfoImport entity : entityList) {
            ETrackingInfoImportDto dto = mappingToDto(entity);
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
    public ETrackingInfoImport mappingToEntity(ETrackingInfoImportDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ETrackingInfoImport entity = new ETrackingInfoImport();
        if (needsMapping(dto, dto.getTrackingInfoImportId(), "trackingInfoImportId")) {
            entity.setTrackingInfoImportId(dto.getTrackingInfoImportId());
        }
        if (needsMapping(dto, dto.getSymbolposkey(), "symbolposkey")) {
            entity.setSymbolposkey(dto.getSymbolposkey());
        }
        if (needsMapping(dto, dto.getWarehousecd(), "warehousecd")) {
            entity.setWarehousecd(dto.getWarehousecd());
        }
        if (needsMapping(dto, dto.getWarehouseSname(), "warehouseSname")) {
            entity.setWarehouseSname(dto.getWarehouseSname());
        }
        if (needsMapping(dto, dto.getFactorySname(), "factorySname")) {
            entity.setFactorySname(dto.getFactorySname());
        }
        if (needsMapping(dto, dto.getFactorycd(), "factorycd")) {
            entity.setFactorycd(dto.getFactorycd());
        }
        if (needsMapping(dto, dto.getItemcdCase(), "itemcdCase")) {
            entity.setItemcdCase(dto.getItemcdCase());
        }
        if (needsMapping(dto, dto.getItemSnameCase(), "itemSnameCase")) {
            entity.setItemSnameCase(dto.getItemSnameCase());
        }
        if (needsMapping(dto, dto.getItemcdWh(), "itemcdWh")) {
            entity.setItemcdWh(dto.getItemcdWh());
        }
        if (needsMapping(dto, dto.getItemSnameWh(), "itemSnameWh")) {
            entity.setItemSnameWh(dto.getItemSnameWh());
        }
        if (needsMapping(dto, dto.getRcvkey(), "rcvkey")) {
            entity.setRcvkey(dto.getRcvkey());
        }
        if (needsMapping(dto, dto.getMachineno(), "machineno")) {
            entity.setMachineno(dto.getMachineno());
        }
        if (needsMapping(dto, dto.getCreateno(), "createno")) {
            entity.setCreateno(dto.getCreateno());
        }
        if (needsMapping(dto, dto.getLimitdatenow(), "limitdatenow")) {
            entity.setLimitdatenow(dto.getLimitdatenow());
        }
        if (needsMapping(dto, dto.getDesigncdCase(), "designcdCase")) {
            entity.setDesigncdCase(dto.getDesigncdCase());
        }
        if (needsMapping(dto, dto.getLot1(), "lot1")) {
            entity.setLot1(dto.getLot1());
        }
        if (needsMapping(dto, dto.getManufacturecd(), "manufacturecd")) {
            entity.setManufacturecd(dto.getManufacturecd());
        }
        if (needsMapping(dto, dto.getOtherlot1(), "otherlot1")) {
            entity.setOtherlot1(dto.getOtherlot1());
        }
        if (needsMapping(dto, dto.getCasecreatetype(), "casecreatetype")) {
            entity.setCasecreatetype(dto.getCasecreatetype());
        }
        if (needsMapping(dto, dto.getCasecreatetypeNm(), "casecreatetypeNm")) {
            entity.setCasecreatetypeNm(dto.getCasecreatetypeNm());
        }
        if (needsMapping(dto, dto.getReceivedate(), "receivedate")) {
            entity.setReceivedate(dto.getReceivedate());
        }
        if (needsMapping(dto, dto.getArrivalportdate(), "arrivalportdate")) {
            entity.setArrivalportdate(dto.getArrivalportdate());
        }
        if (needsMapping(dto, dto.getShipname(), "shipname")) {
            entity.setShipname(dto.getShipname());
        }
        if (needsMapping(dto, dto.getInitnum(), "initnum")) {
            entity.setInitnum(dto.getInitnum());
        }
        if (needsMapping(dto, dto.getMixedflg(), "mixedflg")) {
            entity.setMixedflg(dto.getMixedflg());
        }
        if (needsMapping(dto, dto.getLendflg(), "lendflg")) {
            entity.setLendflg(dto.getLendflg());
        }
        if (needsMapping(dto, dto.getLocgroup(), "locgroup")) {
            entity.setLocgroup(dto.getLocgroup());
        }
        if (needsMapping(dto, dto.getLoccd(), "loccd")) {
            entity.setLoccd(dto.getLoccd());
        }
        if (needsMapping(dto, dto.getShipdate(), "shipdate")) {
            entity.setShipdate(dto.getShipdate());
        }
        if (needsMapping(dto, dto.getCurrentLocationCd(), "currentLocationCd")) {
            entity.setCurrentLocationCd(dto.getCurrentLocationCd());
        }
        if (needsMapping(dto, dto.getCurrentLocationSname(), "currentLocationSname")) {
            entity.setCurrentLocationSname(dto.getCurrentLocationSname());
        }
        if (needsMapping(dto, dto.getAdddatetime(), "adddatetime")) {
            entity.setAdddatetime(dto.getAdddatetime());
        }
        if (needsMapping(dto, dto.getTracetype(), "tracetype")) {
            entity.setTracetype(dto.getTracetype());
        }
        if (needsMapping(dto, dto.getOthercd1(), "othercd1")) {
            entity.setOthercd1(dto.getOthercd1());
        }
        if (needsMapping(dto, dto.getExamsts(), "examsts")) {
            entity.setExamsts(dto.getExamsts());
        }
        if (needsMapping(dto, dto.getCaseinnumbowl(), "caseinnumbowl")) {
            entity.setCaseinnumbowl(dto.getCaseinnumbowl());
        }
        if (needsMapping(dto, dto.getShipnumbowl(), "shipnumbowl")) {
            entity.setShipnumbowl(dto.getShipnumbowl());
        }
        if (needsMapping(dto, dto.getSupplierrcvno(), "supplierrcvno")) {
            entity.setSupplierrcvno(dto.getSupplierrcvno());
        }
        if (needsMapping(dto, dto.getTokuhancd(), "tokuhancd")) {
            entity.setTokuhancd(dto.getTokuhancd());
        }
        if (needsMapping(dto, dto.getTokuhanNm(), "tokuhanNm")) {
            entity.setTokuhanNm(dto.getTokuhanNm());
        }
        if (needsMapping(dto, dto.getMakercaseno(), "makercaseno")) {
            entity.setMakercaseno(dto.getMakercaseno());
        }
        if (needsMapping(dto, dto.getCaseitfno(), "caseitfno")) {
            entity.setCaseitfno(dto.getCaseitfno());
        }
        if (needsMapping(dto, dto.getCasebarcodevaliant(), "casebarcodevaliant")) {
            entity.setCasebarcodevaliant(dto.getCasebarcodevaliant());
        }
        if (needsMapping(dto, dto.getCaselot4(), "caselot4")) {
            entity.setCaselot4(dto.getCaselot4());
        }
        if (needsMapping(dto, dto.getCasecenterno(), "casecenterno")) {
            entity.setCasecenterno(dto.getCasecenterno());
        }
        if (needsMapping(dto, dto.getCasepackno(), "casepackno")) {
            entity.setCasepackno(dto.getCasepackno());
        }
        if (needsMapping(dto, dto.getCasepacktime(), "casepacktime")) {
            entity.setCasepacktime(dto.getCasepacktime());
        }
        if (needsMapping(dto, dto.getSenderLocation(), "senderLocation")) {
            entity.setSenderLocation(dto.getSenderLocation());
        }
        if (needsMapping(dto, dto.getReceiverLocation(), "receiverLocation")) {
            entity.setReceiverLocation(dto.getReceiverLocation());
        }
        if (needsMapping(dto, dto.getShipmentId(), "shipmentId")) {
            entity.setShipmentId(dto.getShipmentId());
        }
        if (needsMapping(dto, dto.getShipmentDate(), "shipmentDate")) {
            entity.setShipmentDate(dto.getShipmentDate());
        }
        if (needsMapping(dto, dto.getNumberOfPallets(), "numberOfPallets")) {
            entity.setNumberOfPallets(dto.getNumberOfPallets());
        }
        if (needsMapping(dto, dto.getCarrierno(), "carrierno")) {
            entity.setCarrierno(dto.getCarrierno());
        }
        if (needsMapping(dto, dto.getTkhnorderno(), "tkhnorderno")) {
            entity.setTkhnorderno(dto.getTkhnorderno());
        }
        if (needsMapping(dto, dto.getSrccd(), "srccd")) {
            entity.setSrccd(dto.getSrccd());
        }
        if (needsMapping(dto, dto.getBlno(), "blno")) {
            entity.setBlno(dto.getBlno());
        }
        if (needsMapping(dto, dto.getInvoiceno(), "invoiceno")) {
            entity.setInvoiceno(dto.getInvoiceno());
        }
        if (needsMapping(dto, dto.getSscc(), "sscc")) {
            entity.setSscc(dto.getSscc());
        }
        if (needsMapping(dto, dto.getCaseno(), "caseno")) {
            entity.setCaseno(dto.getCaseno());
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
    protected boolean needsMapping(ETrackingInfoImportDto dto, Object value, String propName) {
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
    public List<ETrackingInfoImport> mappingToEntityList(List<ETrackingInfoImportDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<ETrackingInfoImport> entityList = new ArrayList<ETrackingInfoImport>();
        for (ETrackingInfoImportDto dto : dtoList) {
            ETrackingInfoImport entity = mappingToEntity(dto);
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
    public ETrackingInfoImportDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ETrackingInfoImportDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ETrackingInfoImportDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ETrackingInfoImportDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ETrackingInfoImportDtoMapper reverseReference() {
        setReverseReference(true);
        return (ETrackingInfoImportDtoMapper)this;
    }
}
