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
 * The DTO mapper of E_SHOP_IMPORT_SEND as TABLE. <br>
 * 販売店仕分情報送信テーブル(輸入)
 * <pre>
 * [primary-key]
 *     SHOP_IMPORT_SEND_ID
 *
 * [column]
 *     SHOP_IMPORT_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, SYMBOL_POS_KEY, WAREHOUSE_CD, WAREHOUSE_SNAME, FACTORY_CD, FACTORY_SNAME, ITEM_CD_CASE, ITEM_SNAME_CASE, ITEM_CD_WH, ITEM_SNAME_WH, RCV_KEY, MACHINE_NO, CREATE_NO, LIMIT_DATE_NOW, DESIGN_CD_CASE, FIRMTRANSPORT_NO, MANUFACTURE_CD, OTHER_LOT1, CASE_CREATE_TYPE, CODE_SNAME, RECEIVE_DATE, ARRIVAL_PORT_DATE, SHIP_NAME, INIT_NUM, MIXED_FLG, LEND_FLG, LOC_GROUP, LOC_CD, SHIP_DATE, CURRENT_LOCATION_CD, CURRENT_LOCATION_SNAME, SHIP_TO_CD, SHIP_TO_SNAME, CREATE_DATETIME, TRACE_TYPE, TRACE_TYPE_SNAME, EXAM_STS, CASE_IN_NUM, SHIPPING_NUM, ASSORT_DATETIME, LINE_BLOCK, ASSORTED_UNIT, ASSORTED_INDEX, OPERATION_CODE, OPERATION_NUM, ASSORT_NUM, ASSORT_DIF_NUM, DIRECTION_CD, PISTON_TYPE, CUSTOMER_CD, DIRECTION_NUM, SUPPLIER_RCV_NO, TOKUHAN_CD, TOKUHAN_SNAME, MAKER_CASE_NO, CASE_ITF_NO, CASE_BARCODE_VALIANT, CASE_LOT4, CASE_CENTER_NO, CASE_PACK_NO, CASE_PACK_TIME, SENDER_LOCATION, RECEIVER_LOCATION, SHIPMENT_ID, SHIPMENT_DATE, NUMBER_OF_PALLETS, CARRIER_NO, ORDER_NO, SRC_CD, BL_NO, INVOICE_NO, SSCC, CASE_NO, INV_NUM, SORT_NUM, ADOPT_NUM, DELIVERY_DATETIME, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHOP_IMPORT_SEND_ID
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
public abstract class BsEShopImportSendDtoMapper implements DtoMapper<EShopImportSend, EShopImportSendDto>, Serializable {

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
    public BsEShopImportSendDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEShopImportSendDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EShopImportSendDto mappingToDto(EShopImportSend entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EShopImportSendDto dto = new EShopImportSendDto();
        dto.setShopImportSendId(entity.getShopImportSendId());
        dto.setSendCd(entity.getSendCd());
        dto.setSendRowId(entity.getSendRowId());
        dto.setWorkFlg(entity.getWorkFlg());
        dto.setSymbolPosKey(entity.getSymbolPosKey());
        dto.setWarehouseCd(entity.getWarehouseCd());
        dto.setWarehouseSname(entity.getWarehouseSname());
        dto.setFactoryCd(entity.getFactoryCd());
        dto.setFactorySname(entity.getFactorySname());
        dto.setItemCdCase(entity.getItemCdCase());
        dto.setItemSnameCase(entity.getItemSnameCase());
        dto.setItemCdWh(entity.getItemCdWh());
        dto.setItemSnameWh(entity.getItemSnameWh());
        dto.setRcvKey(entity.getRcvKey());
        dto.setMachineNo(entity.getMachineNo());
        dto.setCreateNo(entity.getCreateNo());
        dto.setLimitDateNow(entity.getLimitDateNow());
        dto.setDesignCdCase(entity.getDesignCdCase());
        dto.setFirmtransportNo(entity.getFirmtransportNo());
        dto.setManufactureCd(entity.getManufactureCd());
        dto.setOtherLot1(entity.getOtherLot1());
        dto.setCaseCreateType(entity.getCaseCreateType());
        dto.setCodeSname(entity.getCodeSname());
        dto.setReceiveDate(entity.getReceiveDate());
        dto.setArrivalPortDate(entity.getArrivalPortDate());
        dto.setShipName(entity.getShipName());
        dto.setInitNum(entity.getInitNum());
        dto.setMixedFlg(entity.getMixedFlg());
        dto.setLendFlg(entity.getLendFlg());
        dto.setLocGroup(entity.getLocGroup());
        dto.setLocCd(entity.getLocCd());
        dto.setShipDate(entity.getShipDate());
        dto.setCurrentLocationCd(entity.getCurrentLocationCd());
        dto.setCurrentLocationSname(entity.getCurrentLocationSname());
        dto.setShipToCd(entity.getShipToCd());
        dto.setShipToSname(entity.getShipToSname());
        dto.setCreateDatetime(entity.getCreateDatetime());
        dto.setTraceType(entity.getTraceType());
        dto.setTraceTypeSname(entity.getTraceTypeSname());
        dto.setExamSts(entity.getExamSts());
        dto.setCaseInNum(entity.getCaseInNum());
        dto.setShippingNum(entity.getShippingNum());
        dto.setAssortDatetime(entity.getAssortDatetime());
        dto.setLineBlock(entity.getLineBlock());
        dto.setAssortedUnit(entity.getAssortedUnit());
        dto.setAssortedIndex(entity.getAssortedIndex());
        dto.setOperationCode(entity.getOperationCode());
        dto.setOperationNum(entity.getOperationNum());
        dto.setAssortNum(entity.getAssortNum());
        dto.setAssortDifNum(entity.getAssortDifNum());
        dto.setDirectionCd(entity.getDirectionCd());
        dto.setPistonType(entity.getPistonType());
        dto.setCustomerCd(entity.getCustomerCd());
        dto.setDirectionNum(entity.getDirectionNum());
        dto.setSupplierRcvNo(entity.getSupplierRcvNo());
        dto.setTokuhanCd(entity.getTokuhanCd());
        dto.setTokuhanSname(entity.getTokuhanSname());
        dto.setMakerCaseNo(entity.getMakerCaseNo());
        dto.setCaseItfNo(entity.getCaseItfNo());
        dto.setCaseBarcodeValiant(entity.getCaseBarcodeValiant());
        dto.setCaseLot4(entity.getCaseLot4());
        dto.setCaseCenterNo(entity.getCaseCenterNo());
        dto.setCasePackNo(entity.getCasePackNo());
        dto.setCasePackTime(entity.getCasePackTime());
        dto.setSenderLocation(entity.getSenderLocation());
        dto.setReceiverLocation(entity.getReceiverLocation());
        dto.setShipmentId(entity.getShipmentId());
        dto.setShipmentDate(entity.getShipmentDate());
        dto.setNumberOfPallets(entity.getNumberOfPallets());
        dto.setCarrierNo(entity.getCarrierNo());
        dto.setOrderNo(entity.getOrderNo());
        dto.setSrcCd(entity.getSrcCd());
        dto.setBlNo(entity.getBlNo());
        dto.setInvoiceNo(entity.getInvoiceNo());
        dto.setSscc(entity.getSscc());
        dto.setCaseNo(entity.getCaseNo());
        dto.setInvNum(entity.getInvNum());
        dto.setSortNum(entity.getSortNum());
        dto.setAdoptNum(entity.getAdoptNum());
        dto.setDeliveryDatetime(entity.getDeliveryDatetime());
        dto.setSpareStr(entity.getSpareStr());
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
    public List<EShopImportSendDto> mappingToDtoList(List<EShopImportSend> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EShopImportSendDto> dtoList = new ArrayList<EShopImportSendDto>();
        for (EShopImportSend entity : entityList) {
            EShopImportSendDto dto = mappingToDto(entity);
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
    public EShopImportSend mappingToEntity(EShopImportSendDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EShopImportSend entity = new EShopImportSend();
        if (needsMapping(dto, dto.getShopImportSendId(), "shopImportSendId")) {
            entity.setShopImportSendId(dto.getShopImportSendId());
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
        if (needsMapping(dto, dto.getSymbolPosKey(), "symbolPosKey")) {
            entity.setSymbolPosKey(dto.getSymbolPosKey());
        }
        if (needsMapping(dto, dto.getWarehouseCd(), "warehouseCd")) {
            entity.setWarehouseCd(dto.getWarehouseCd());
        }
        if (needsMapping(dto, dto.getWarehouseSname(), "warehouseSname")) {
            entity.setWarehouseSname(dto.getWarehouseSname());
        }
        if (needsMapping(dto, dto.getFactoryCd(), "factoryCd")) {
            entity.setFactoryCd(dto.getFactoryCd());
        }
        if (needsMapping(dto, dto.getFactorySname(), "factorySname")) {
            entity.setFactorySname(dto.getFactorySname());
        }
        if (needsMapping(dto, dto.getItemCdCase(), "itemCdCase")) {
            entity.setItemCdCase(dto.getItemCdCase());
        }
        if (needsMapping(dto, dto.getItemSnameCase(), "itemSnameCase")) {
            entity.setItemSnameCase(dto.getItemSnameCase());
        }
        if (needsMapping(dto, dto.getItemCdWh(), "itemCdWh")) {
            entity.setItemCdWh(dto.getItemCdWh());
        }
        if (needsMapping(dto, dto.getItemSnameWh(), "itemSnameWh")) {
            entity.setItemSnameWh(dto.getItemSnameWh());
        }
        if (needsMapping(dto, dto.getRcvKey(), "rcvKey")) {
            entity.setRcvKey(dto.getRcvKey());
        }
        if (needsMapping(dto, dto.getMachineNo(), "machineNo")) {
            entity.setMachineNo(dto.getMachineNo());
        }
        if (needsMapping(dto, dto.getCreateNo(), "createNo")) {
            entity.setCreateNo(dto.getCreateNo());
        }
        if (needsMapping(dto, dto.getLimitDateNow(), "limitDateNow")) {
            entity.setLimitDateNow(dto.getLimitDateNow());
        }
        if (needsMapping(dto, dto.getDesignCdCase(), "designCdCase")) {
            entity.setDesignCdCase(dto.getDesignCdCase());
        }
        if (needsMapping(dto, dto.getFirmtransportNo(), "firmtransportNo")) {
            entity.setFirmtransportNo(dto.getFirmtransportNo());
        }
        if (needsMapping(dto, dto.getManufactureCd(), "manufactureCd")) {
            entity.setManufactureCd(dto.getManufactureCd());
        }
        if (needsMapping(dto, dto.getOtherLot1(), "otherLot1")) {
            entity.setOtherLot1(dto.getOtherLot1());
        }
        if (needsMapping(dto, dto.getCaseCreateType(), "caseCreateType")) {
            entity.setCaseCreateType(dto.getCaseCreateType());
        }
        if (needsMapping(dto, dto.getCodeSname(), "codeSname")) {
            entity.setCodeSname(dto.getCodeSname());
        }
        if (needsMapping(dto, dto.getReceiveDate(), "receiveDate")) {
            entity.setReceiveDate(dto.getReceiveDate());
        }
        if (needsMapping(dto, dto.getArrivalPortDate(), "arrivalPortDate")) {
            entity.setArrivalPortDate(dto.getArrivalPortDate());
        }
        if (needsMapping(dto, dto.getShipName(), "shipName")) {
            entity.setShipName(dto.getShipName());
        }
        if (needsMapping(dto, dto.getInitNum(), "initNum")) {
            entity.setInitNum(dto.getInitNum());
        }
        if (needsMapping(dto, dto.getMixedFlg(), "mixedFlg")) {
            entity.setMixedFlg(dto.getMixedFlg());
        }
        if (needsMapping(dto, dto.getLendFlg(), "lendFlg")) {
            entity.setLendFlg(dto.getLendFlg());
        }
        if (needsMapping(dto, dto.getLocGroup(), "locGroup")) {
            entity.setLocGroup(dto.getLocGroup());
        }
        if (needsMapping(dto, dto.getLocCd(), "locCd")) {
            entity.setLocCd(dto.getLocCd());
        }
        if (needsMapping(dto, dto.getShipDate(), "shipDate")) {
            entity.setShipDate(dto.getShipDate());
        }
        if (needsMapping(dto, dto.getCurrentLocationCd(), "currentLocationCd")) {
            entity.setCurrentLocationCd(dto.getCurrentLocationCd());
        }
        if (needsMapping(dto, dto.getCurrentLocationSname(), "currentLocationSname")) {
            entity.setCurrentLocationSname(dto.getCurrentLocationSname());
        }
        if (needsMapping(dto, dto.getShipToCd(), "shipToCd")) {
            entity.setShipToCd(dto.getShipToCd());
        }
        if (needsMapping(dto, dto.getShipToSname(), "shipToSname")) {
            entity.setShipToSname(dto.getShipToSname());
        }
        if (needsMapping(dto, dto.getCreateDatetime(), "createDatetime")) {
            entity.setCreateDatetime(dto.getCreateDatetime());
        }
        if (needsMapping(dto, dto.getTraceType(), "traceType")) {
            entity.setTraceType(dto.getTraceType());
        }
        if (needsMapping(dto, dto.getTraceTypeSname(), "traceTypeSname")) {
            entity.setTraceTypeSname(dto.getTraceTypeSname());
        }
        if (needsMapping(dto, dto.getExamSts(), "examSts")) {
            entity.setExamSts(dto.getExamSts());
        }
        if (needsMapping(dto, dto.getCaseInNum(), "caseInNum")) {
            entity.setCaseInNum(dto.getCaseInNum());
        }
        if (needsMapping(dto, dto.getShippingNum(), "shippingNum")) {
            entity.setShippingNum(dto.getShippingNum());
        }
        if (needsMapping(dto, dto.getAssortDatetime(), "assortDatetime")) {
            entity.setAssortDatetime(dto.getAssortDatetime());
        }
        if (needsMapping(dto, dto.getLineBlock(), "lineBlock")) {
            entity.setLineBlock(dto.getLineBlock());
        }
        if (needsMapping(dto, dto.getAssortedUnit(), "assortedUnit")) {
            entity.setAssortedUnit(dto.getAssortedUnit());
        }
        if (needsMapping(dto, dto.getAssortedIndex(), "assortedIndex")) {
            entity.setAssortedIndex(dto.getAssortedIndex());
        }
        if (needsMapping(dto, dto.getOperationCode(), "operationCode")) {
            entity.setOperationCode(dto.getOperationCode());
        }
        if (needsMapping(dto, dto.getOperationNum(), "operationNum")) {
            entity.setOperationNum(dto.getOperationNum());
        }
        if (needsMapping(dto, dto.getAssortNum(), "assortNum")) {
            entity.setAssortNum(dto.getAssortNum());
        }
        if (needsMapping(dto, dto.getAssortDifNum(), "assortDifNum")) {
            entity.setAssortDifNum(dto.getAssortDifNum());
        }
        if (needsMapping(dto, dto.getDirectionCd(), "directionCd")) {
            entity.setDirectionCd(dto.getDirectionCd());
        }
        if (needsMapping(dto, dto.getPistonType(), "pistonType")) {
            entity.setPistonType(dto.getPistonType());
        }
        if (needsMapping(dto, dto.getCustomerCd(), "customerCd")) {
            entity.setCustomerCd(dto.getCustomerCd());
        }
        if (needsMapping(dto, dto.getDirectionNum(), "directionNum")) {
            entity.setDirectionNum(dto.getDirectionNum());
        }
        if (needsMapping(dto, dto.getSupplierRcvNo(), "supplierRcvNo")) {
            entity.setSupplierRcvNo(dto.getSupplierRcvNo());
        }
        if (needsMapping(dto, dto.getTokuhanCd(), "tokuhanCd")) {
            entity.setTokuhanCd(dto.getTokuhanCd());
        }
        if (needsMapping(dto, dto.getTokuhanSname(), "tokuhanSname")) {
            entity.setTokuhanSname(dto.getTokuhanSname());
        }
        if (needsMapping(dto, dto.getMakerCaseNo(), "makerCaseNo")) {
            entity.setMakerCaseNo(dto.getMakerCaseNo());
        }
        if (needsMapping(dto, dto.getCaseItfNo(), "caseItfNo")) {
            entity.setCaseItfNo(dto.getCaseItfNo());
        }
        if (needsMapping(dto, dto.getCaseBarcodeValiant(), "caseBarcodeValiant")) {
            entity.setCaseBarcodeValiant(dto.getCaseBarcodeValiant());
        }
        if (needsMapping(dto, dto.getCaseLot4(), "caseLot4")) {
            entity.setCaseLot4(dto.getCaseLot4());
        }
        if (needsMapping(dto, dto.getCaseCenterNo(), "caseCenterNo")) {
            entity.setCaseCenterNo(dto.getCaseCenterNo());
        }
        if (needsMapping(dto, dto.getCasePackNo(), "casePackNo")) {
            entity.setCasePackNo(dto.getCasePackNo());
        }
        if (needsMapping(dto, dto.getCasePackTime(), "casePackTime")) {
            entity.setCasePackTime(dto.getCasePackTime());
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
        if (needsMapping(dto, dto.getCarrierNo(), "carrierNo")) {
            entity.setCarrierNo(dto.getCarrierNo());
        }
        if (needsMapping(dto, dto.getOrderNo(), "orderNo")) {
            entity.setOrderNo(dto.getOrderNo());
        }
        if (needsMapping(dto, dto.getSrcCd(), "srcCd")) {
            entity.setSrcCd(dto.getSrcCd());
        }
        if (needsMapping(dto, dto.getBlNo(), "blNo")) {
            entity.setBlNo(dto.getBlNo());
        }
        if (needsMapping(dto, dto.getInvoiceNo(), "invoiceNo")) {
            entity.setInvoiceNo(dto.getInvoiceNo());
        }
        if (needsMapping(dto, dto.getSscc(), "sscc")) {
            entity.setSscc(dto.getSscc());
        }
        if (needsMapping(dto, dto.getCaseNo(), "caseNo")) {
            entity.setCaseNo(dto.getCaseNo());
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
        if (needsMapping(dto, dto.getDeliveryDatetime(), "deliveryDatetime")) {
            entity.setDeliveryDatetime(dto.getDeliveryDatetime());
        }
        if (needsMapping(dto, dto.getSpareStr(), "spareStr")) {
            entity.setSpareStr(dto.getSpareStr());
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
    protected boolean needsMapping(EShopImportSendDto dto, Object value, String propName) {
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
    public List<EShopImportSend> mappingToEntityList(List<EShopImportSendDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EShopImportSend> entityList = new ArrayList<EShopImportSend>();
        for (EShopImportSendDto dto : dtoList) {
            EShopImportSend entity = mappingToEntity(dto);
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
    public EShopImportSendDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EShopImportSendDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EShopImportSendDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EShopImportSendDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EShopImportSendDtoMapper reverseReference() {
        setReverseReference(true);
        return (EShopImportSendDtoMapper)this;
    }
}
