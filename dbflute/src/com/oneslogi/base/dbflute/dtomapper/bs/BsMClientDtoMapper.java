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
 * The DTO mapper of M_CLIENT as TABLE. <br>
 * 荷主マスタ
 * <pre>
 * [primary-key]
 *     CLIENT_ID
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CLIENT_NM, CLIENT_ABBR, CUSTOMER_ID, SHAPE_GRP_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_SHAPE_GRP, M_CUSTOMER, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer-table]
 *     M_CBRCTG, M_CDRCATT, M_CLIENT_CENTER, M_CLIENT_COL, M_CLIENT_ITEM, M_CLIENT_SCREEN, M_CUSTOMER, M_IMPORT_TYPE, M_MFINVOPERATION, M_MFMONTHCHG, M_MFPICKCTL, M_MFRCVDESIGN, M_MFRCVITEM, M_MFWHxITEM, M_PRODUCT, M_SHAPE_GRP, M_USER_CLIENT, M_USER_LOGIN, M_WEB_HT_INFO, T_ALLOC_INST_H, T_CCOPAM, T_CENTER_SYMBOL, T_CORDHDR, T_EC_ORDER_H, T_INVENTORY_H, T_MFLASTSHIPLOT, T_MOVE_INST_H, T_PACKING_H, T_PALLET, T_PICKING_H, T_PIC_MTHD_RCMD, T_RECEIVE_PLAN_H, T_SERIAL_NO, T_SHIPPING_INST_H, T_SPLINFO, T_STOCK, T_STORE_RECORD_H, T_TRALLINV, T_TRALLINVHISTORY, T_TRCASEINVENTORY, T_TRCASENUM, T_TRCASESTOCK, T_TRHANBAIINV, T_TRINVCHECKINFO, T_TRINVCORRECT, T_TRINVREANSWER, T_TRINVREQUEST, T_TRITEMCONVRESULT, T_TRJUKYUINV, T_TRMANUFACTUREDATE, T_TRMANUFACTUREDATEDETAIL, T_TRMANUFACTUREDATEHISTORY, T_TRPALLETTRACE, T_TRREVERSESTOCK, T_TRSTOCKDIFFHISTORY, T_TRSYMBOLTRACE, T_TRSYMBOLTRACEEXTEND, T_TRTRACE, T_YTRSO, W_HT_INVENTORY_INPUT_PROD, W_HT_LOADING, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SERIAL_RECEIVE_INSP, W_HT_SERIAL_SHIPPING_INSP, W_HT_SHIPPING, W_HT_SHIPPING_PICKING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT
 *
 * [foreign-property]
 *     mShapeGrp, mCustomer, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     mCbrctgList, mCdrcattList, mClientCenterList, mClientColList, mClientItemList, mClientScreenList, mCustomerList, mImportTypeList, mMfinvoperationList, mMfmonthchgList, mMfpickctlList, mMfrcvdesignList, mMfrcvitemList, mMfwhxitemList, mProductList, mShapeGrpList, mUserClientList, mUserLoginList, mWebHtInfoList, tAllocInstHList, tCcopamList, tCenterSymbolList, tCordhdrList, tEcOrderHList, tInventoryHList, tMflastshiplotList, tMoveInstHList, tPackingHList, tPalletList, tPickingHList, tPicMthdRcmdList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tSplinfoList, tStockList, tStoreRecordHList, tTrallinvList, tTrallinvhistoryList, tTrcaseinventoryList, tTrcasenumList, tTrcasestockList, tTrhanbaiinvList, tTrinvcheckinfoList, tTrinvcorrectList, tTrinvreanswerList, tTrinvrequestList, tTritemconvresultList, tTrjukyuinvList, tTrmanufacturedateList, tTrmanufacturedatedetailList, tTrmanufacturedatehistoryList, tTrpallettraceList, tTrreversestockList, tTrstockdiffhistoryList, tTrsymboltraceList, tTrsymboltraceextendList, tTrtraceList, tYtrsoList, wHtInventoryInputProdList, wHtLoadingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMClientDtoMapper implements DtoMapper<MClient, MClientDto>, Serializable {

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
    protected boolean _suppressMShapeGrp;
    protected boolean _suppressMCustomer;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressMCbrctgList;
    protected boolean _suppressMCdrcattList;
    protected boolean _suppressMClientCenterList;
    protected boolean _suppressMClientColList;
    protected boolean _suppressMClientItemList;
    protected boolean _suppressMClientScreenList;
    protected boolean _suppressMCustomerList;
    protected boolean _suppressMImportTypeList;
    protected boolean _suppressMMfinvoperationList;
    protected boolean _suppressMMfmonthchgList;
    protected boolean _suppressMMfpickctlList;
    protected boolean _suppressMMfrcvdesignList;
    protected boolean _suppressMMfrcvitemList;
    protected boolean _suppressMMfwhxitemList;
    protected boolean _suppressMProductList;
    protected boolean _suppressMShapeGrpList;
    protected boolean _suppressMUserClientList;
    protected boolean _suppressMUserLoginList;
    protected boolean _suppressMWebHtInfoList;
    protected boolean _suppressTAllocInstHList;
    protected boolean _suppressTCcopamList;
    protected boolean _suppressTCenterSymbolList;
    protected boolean _suppressTCordhdrList;
    protected boolean _suppressTEcOrderHList;
    protected boolean _suppressTInventoryHList;
    protected boolean _suppressTMflastshiplotList;
    protected boolean _suppressTMoveInstHList;
    protected boolean _suppressTPackingHList;
    protected boolean _suppressTPalletList;
    protected boolean _suppressTPickingHList;
    protected boolean _suppressTPicMthdRcmdList;
    protected boolean _suppressTReceivePlanHList;
    protected boolean _suppressTSerialNoList;
    protected boolean _suppressTShippingInstHList;
    protected boolean _suppressTSplinfoList;
    protected boolean _suppressTStockList;
    protected boolean _suppressTStoreRecordHList;
    protected boolean _suppressTTrallinvList;
    protected boolean _suppressTTrallinvhistoryList;
    protected boolean _suppressTTrcaseinventoryList;
    protected boolean _suppressTTrcasenumList;
    protected boolean _suppressTTrcasestockList;
    protected boolean _suppressTTrhanbaiinvList;
    protected boolean _suppressTTrinvcheckinfoList;
    protected boolean _suppressTTrinvcorrectList;
    protected boolean _suppressTTrinvreanswerList;
    protected boolean _suppressTTrinvrequestList;
    protected boolean _suppressTTritemconvresultList;
    protected boolean _suppressTTrjukyuinvList;
    protected boolean _suppressTTrmanufacturedateList;
    protected boolean _suppressTTrmanufacturedatedetailList;
    protected boolean _suppressTTrmanufacturedatehistoryList;
    protected boolean _suppressTTrpallettraceList;
    protected boolean _suppressTTrreversestockList;
    protected boolean _suppressTTrstockdiffhistoryList;
    protected boolean _suppressTTrsymboltraceList;
    protected boolean _suppressTTrsymboltraceextendList;
    protected boolean _suppressTTrtraceList;
    protected boolean _suppressTYtrsoList;
    protected boolean _suppressWHtInventoryInputProdList;
    protected boolean _suppressWHtLoadingList;
    protected boolean _suppressWHtReceiveInspectionList;
    protected boolean _suppressWHtReceiveNoPlanInspList;
    protected boolean _suppressWHtReceiveStoreList;
    protected boolean _suppressWHtSerialReceiveInspList;
    protected boolean _suppressWHtSerialShippingInspList;
    protected boolean _suppressWHtShippingList;
    protected boolean _suppressWHtShippingPickingList;
    protected boolean _suppressWSglRowShipInspHList;
    protected boolean _suppressWShippingInterruptList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMClientDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMClientDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MClientDto mappingToDto(MClient entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MClientDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MClientDto dto = new MClientDto();
        dto.setClientId(entity.getClientId());
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        dto.setClientAbbr(entity.getClientAbbr());
        dto.setCustomerId(entity.getCustomerId());
        dto.setShapeGrpId(entity.getShapeGrpId());
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
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressMShapeGrp && entity.getMShapeGrp() != null) {
            MShapeGrp relationEntity = entity.getMShapeGrp();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MShapeGrpDto relationDto = (MShapeGrpDto)cachedDto;
                dto.setMShapeGrp(relationDto);
                if (reverseReference) {
                    relationDto.getMClientList().add(dto);
                }
            } else {
                MShapeGrpDtoMapper mapper = new MShapeGrpDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMClientList();
                MShapeGrpDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMShapeGrp(relationDto);
                if (reverseReference) {
                    relationDto.getMClientList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMShapeGrp());
                }
            }
        };
        if (!_suppressMCustomer && entity.getMCustomer() != null) {
            MCustomer relationEntity = entity.getMCustomer();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomer(relationDto);
                if (reverseReference) {
                    relationDto.getMClientList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMClientList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomer(relationDto);
                if (reverseReference) {
                    relationDto.getMClientList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomer());
                }
            }
        };
        if (!_suppressBClassDtlByDelFlg && entity.getBClassDtlByDelFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDelFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDelFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDelFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDelFlg());
                }
            }
        };
        if (!_suppressMCbrctgList && !entity.getMCbrctgList().isEmpty()) {
            MCbrctgDtoMapper mapper = new MCbrctgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MCbrctgDto> relationDtoList = mapper.mappingToDtoList(entity.getMCbrctgList());
            dto.setMCbrctgList(relationDtoList);
            if (reverseReference) {
                for (MCbrctgDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMCdrcattList && !entity.getMCdrcattList().isEmpty()) {
            MCdrcattDtoMapper mapper = new MCdrcattDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MCdrcattDto> relationDtoList = mapper.mappingToDtoList(entity.getMCdrcattList());
            dto.setMCdrcattList(relationDtoList);
            if (reverseReference) {
                for (MCdrcattDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMClientCenterList && !entity.getMClientCenterList().isEmpty()) {
            MClientCenterDtoMapper mapper = new MClientCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MClientCenterDto> relationDtoList = mapper.mappingToDtoList(entity.getMClientCenterList());
            dto.setMClientCenterList(relationDtoList);
            if (reverseReference) {
                for (MClientCenterDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMClientColList && !entity.getMClientColList().isEmpty()) {
            MClientColDtoMapper mapper = new MClientColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MClientColDto> relationDtoList = mapper.mappingToDtoList(entity.getMClientColList());
            dto.setMClientColList(relationDtoList);
            if (reverseReference) {
                for (MClientColDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMClientItemList && !entity.getMClientItemList().isEmpty()) {
            MClientItemDtoMapper mapper = new MClientItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MClientItemDto> relationDtoList = mapper.mappingToDtoList(entity.getMClientItemList());
            dto.setMClientItemList(relationDtoList);
            if (reverseReference) {
                for (MClientItemDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMClientScreenList && !entity.getMClientScreenList().isEmpty()) {
            MClientScreenDtoMapper mapper = new MClientScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MClientScreenDto> relationDtoList = mapper.mappingToDtoList(entity.getMClientScreenList());
            dto.setMClientScreenList(relationDtoList);
            if (reverseReference) {
                for (MClientScreenDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMCustomerList && !entity.getMCustomerList().isEmpty()) {
            MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MCustomerDto> relationDtoList = mapper.mappingToDtoList(entity.getMCustomerList());
            dto.setMCustomerList(relationDtoList);
            if (reverseReference) {
                for (MCustomerDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMImportTypeList && !entity.getMImportTypeList().isEmpty()) {
            MImportTypeDtoMapper mapper = new MImportTypeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MImportTypeDto> relationDtoList = mapper.mappingToDtoList(entity.getMImportTypeList());
            dto.setMImportTypeList(relationDtoList);
            if (reverseReference) {
                for (MImportTypeDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMMfinvoperationList && !entity.getMMfinvoperationList().isEmpty()) {
            MMfinvoperationDtoMapper mapper = new MMfinvoperationDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MMfinvoperationDto> relationDtoList = mapper.mappingToDtoList(entity.getMMfinvoperationList());
            dto.setMMfinvoperationList(relationDtoList);
            if (reverseReference) {
                for (MMfinvoperationDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMMfmonthchgList && !entity.getMMfmonthchgList().isEmpty()) {
            MMfmonthchgDtoMapper mapper = new MMfmonthchgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MMfmonthchgDto> relationDtoList = mapper.mappingToDtoList(entity.getMMfmonthchgList());
            dto.setMMfmonthchgList(relationDtoList);
            if (reverseReference) {
                for (MMfmonthchgDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMMfpickctlList && !entity.getMMfpickctlList().isEmpty()) {
            MMfpickctlDtoMapper mapper = new MMfpickctlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MMfpickctlDto> relationDtoList = mapper.mappingToDtoList(entity.getMMfpickctlList());
            dto.setMMfpickctlList(relationDtoList);
            if (reverseReference) {
                for (MMfpickctlDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMMfrcvdesignList && !entity.getMMfrcvdesignList().isEmpty()) {
            MMfrcvdesignDtoMapper mapper = new MMfrcvdesignDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MMfrcvdesignDto> relationDtoList = mapper.mappingToDtoList(entity.getMMfrcvdesignList());
            dto.setMMfrcvdesignList(relationDtoList);
            if (reverseReference) {
                for (MMfrcvdesignDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMMfrcvitemList && !entity.getMMfrcvitemList().isEmpty()) {
            MMfrcvitemDtoMapper mapper = new MMfrcvitemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MMfrcvitemDto> relationDtoList = mapper.mappingToDtoList(entity.getMMfrcvitemList());
            dto.setMMfrcvitemList(relationDtoList);
            if (reverseReference) {
                for (MMfrcvitemDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMMfwhxitemList && !entity.getMMfwhxitemList().isEmpty()) {
            MMfwhxitemDtoMapper mapper = new MMfwhxitemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MMfwhxitemDto> relationDtoList = mapper.mappingToDtoList(entity.getMMfwhxitemList());
            dto.setMMfwhxitemList(relationDtoList);
            if (reverseReference) {
                for (MMfwhxitemDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMProductList && !entity.getMProductList().isEmpty()) {
            MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MProductDto> relationDtoList = mapper.mappingToDtoList(entity.getMProductList());
            dto.setMProductList(relationDtoList);
            if (reverseReference) {
                for (MProductDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMShapeGrpList && !entity.getMShapeGrpList().isEmpty()) {
            MShapeGrpDtoMapper mapper = new MShapeGrpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MShapeGrpDto> relationDtoList = mapper.mappingToDtoList(entity.getMShapeGrpList());
            dto.setMShapeGrpList(relationDtoList);
            if (reverseReference) {
                for (MShapeGrpDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMUserClientList && !entity.getMUserClientList().isEmpty()) {
            MUserClientDtoMapper mapper = new MUserClientDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MUserClientDto> relationDtoList = mapper.mappingToDtoList(entity.getMUserClientList());
            dto.setMUserClientList(relationDtoList);
            if (reverseReference) {
                for (MUserClientDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMUserLoginList && !entity.getMUserLoginList().isEmpty()) {
            MUserLoginDtoMapper mapper = new MUserLoginDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MUserLoginDto> relationDtoList = mapper.mappingToDtoList(entity.getMUserLoginList());
            dto.setMUserLoginList(relationDtoList);
            if (reverseReference) {
                for (MUserLoginDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressMWebHtInfoList && !entity.getMWebHtInfoList().isEmpty()) {
            MWebHtInfoDtoMapper mapper = new MWebHtInfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MWebHtInfoDto> relationDtoList = mapper.mappingToDtoList(entity.getMWebHtInfoList());
            dto.setMWebHtInfoList(relationDtoList);
            if (reverseReference) {
                for (MWebHtInfoDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTAllocInstHList && !entity.getTAllocInstHList().isEmpty()) {
            TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TAllocInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocInstHList());
            dto.setTAllocInstHList(relationDtoList);
            if (reverseReference) {
                for (TAllocInstHDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTCcopamList && !entity.getTCcopamList().isEmpty()) {
            TCcopamDtoMapper mapper = new TCcopamDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TCcopamDto> relationDtoList = mapper.mappingToDtoList(entity.getTCcopamList());
            dto.setTCcopamList(relationDtoList);
            if (reverseReference) {
                for (TCcopamDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTCenterSymbolList && !entity.getTCenterSymbolList().isEmpty()) {
            TCenterSymbolDtoMapper mapper = new TCenterSymbolDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TCenterSymbolDto> relationDtoList = mapper.mappingToDtoList(entity.getTCenterSymbolList());
            dto.setTCenterSymbolList(relationDtoList);
            if (reverseReference) {
                for (TCenterSymbolDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTCordhdrList && !entity.getTCordhdrList().isEmpty()) {
            TCordhdrDtoMapper mapper = new TCordhdrDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TCordhdrDto> relationDtoList = mapper.mappingToDtoList(entity.getTCordhdrList());
            dto.setTCordhdrList(relationDtoList);
            if (reverseReference) {
                for (TCordhdrDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTEcOrderHList && !entity.getTEcOrderHList().isEmpty()) {
            TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TEcOrderHDto> relationDtoList = mapper.mappingToDtoList(entity.getTEcOrderHList());
            dto.setTEcOrderHList(relationDtoList);
            if (reverseReference) {
                for (TEcOrderHDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTInventoryHList && !entity.getTInventoryHList().isEmpty()) {
            TInventoryHDtoMapper mapper = new TInventoryHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TInventoryHDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryHList());
            dto.setTInventoryHList(relationDtoList);
            if (reverseReference) {
                for (TInventoryHDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTMflastshiplotList && !entity.getTMflastshiplotList().isEmpty()) {
            TMflastshiplotDtoMapper mapper = new TMflastshiplotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TMflastshiplotDto> relationDtoList = mapper.mappingToDtoList(entity.getTMflastshiplotList());
            dto.setTMflastshiplotList(relationDtoList);
            if (reverseReference) {
                for (TMflastshiplotDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTMoveInstHList && !entity.getTMoveInstHList().isEmpty()) {
            TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TMoveInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTMoveInstHList());
            dto.setTMoveInstHList(relationDtoList);
            if (reverseReference) {
                for (TMoveInstHDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTPackingHList && !entity.getTPackingHList().isEmpty()) {
            TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TPackingHDto> relationDtoList = mapper.mappingToDtoList(entity.getTPackingHList());
            dto.setTPackingHList(relationDtoList);
            if (reverseReference) {
                for (TPackingHDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTPalletList && !entity.getTPalletList().isEmpty()) {
            TPalletDtoMapper mapper = new TPalletDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TPalletDto> relationDtoList = mapper.mappingToDtoList(entity.getTPalletList());
            dto.setTPalletList(relationDtoList);
            if (reverseReference) {
                for (TPalletDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTPickingHList && !entity.getTPickingHList().isEmpty()) {
            TPickingHDtoMapper mapper = new TPickingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TPickingHDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingHList());
            dto.setTPickingHList(relationDtoList);
            if (reverseReference) {
                for (TPickingHDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTPicMthdRcmdList && !entity.getTPicMthdRcmdList().isEmpty()) {
            TPicMthdRcmdDtoMapper mapper = new TPicMthdRcmdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TPicMthdRcmdDto> relationDtoList = mapper.mappingToDtoList(entity.getTPicMthdRcmdList());
            dto.setTPicMthdRcmdList(relationDtoList);
            if (reverseReference) {
                for (TPicMthdRcmdDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTReceivePlanHList && !entity.getTReceivePlanHList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TReceivePlanHDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceivePlanHList());
            dto.setTReceivePlanHList(relationDtoList);
            if (reverseReference) {
                for (TReceivePlanHDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTSerialNoList && !entity.getTSerialNoList().isEmpty()) {
            TSerialNoDtoMapper mapper = new TSerialNoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TSerialNoDto> relationDtoList = mapper.mappingToDtoList(entity.getTSerialNoList());
            dto.setTSerialNoList(relationDtoList);
            if (reverseReference) {
                for (TSerialNoDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTShippingInstHList && !entity.getTShippingInstHList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TShippingInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstHList());
            dto.setTShippingInstHList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstHDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTSplinfoList && !entity.getTSplinfoList().isEmpty()) {
            TSplinfoDtoMapper mapper = new TSplinfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TSplinfoDto> relationDtoList = mapper.mappingToDtoList(entity.getTSplinfoList());
            dto.setTSplinfoList(relationDtoList);
            if (reverseReference) {
                for (TSplinfoDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTStockList && !entity.getTStockList().isEmpty()) {
            TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TStockDto> relationDtoList = mapper.mappingToDtoList(entity.getTStockList());
            dto.setTStockList(relationDtoList);
            if (reverseReference) {
                for (TStockDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTStoreRecordHList && !entity.getTStoreRecordHList().isEmpty()) {
            TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TStoreRecordHDto> relationDtoList = mapper.mappingToDtoList(entity.getTStoreRecordHList());
            dto.setTStoreRecordHList(relationDtoList);
            if (reverseReference) {
                for (TStoreRecordHDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrallinvList && !entity.getTTrallinvList().isEmpty()) {
            TTrallinvDtoMapper mapper = new TTrallinvDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrallinvDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrallinvList());
            dto.setTTrallinvList(relationDtoList);
            if (reverseReference) {
                for (TTrallinvDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrallinvhistoryList && !entity.getTTrallinvhistoryList().isEmpty()) {
            TTrallinvhistoryDtoMapper mapper = new TTrallinvhistoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrallinvhistoryDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrallinvhistoryList());
            dto.setTTrallinvhistoryList(relationDtoList);
            if (reverseReference) {
                for (TTrallinvhistoryDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrcaseinventoryList && !entity.getTTrcaseinventoryList().isEmpty()) {
            TTrcaseinventoryDtoMapper mapper = new TTrcaseinventoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrcaseinventoryDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrcaseinventoryList());
            dto.setTTrcaseinventoryList(relationDtoList);
            if (reverseReference) {
                for (TTrcaseinventoryDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrcasenumList && !entity.getTTrcasenumList().isEmpty()) {
            TTrcasenumDtoMapper mapper = new TTrcasenumDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrcasenumDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrcasenumList());
            dto.setTTrcasenumList(relationDtoList);
            if (reverseReference) {
                for (TTrcasenumDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrcasestockList && !entity.getTTrcasestockList().isEmpty()) {
            TTrcasestockDtoMapper mapper = new TTrcasestockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrcasestockDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrcasestockList());
            dto.setTTrcasestockList(relationDtoList);
            if (reverseReference) {
                for (TTrcasestockDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrhanbaiinvList && !entity.getTTrhanbaiinvList().isEmpty()) {
            TTrhanbaiinvDtoMapper mapper = new TTrhanbaiinvDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrhanbaiinvDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrhanbaiinvList());
            dto.setTTrhanbaiinvList(relationDtoList);
            if (reverseReference) {
                for (TTrhanbaiinvDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrinvcheckinfoList && !entity.getTTrinvcheckinfoList().isEmpty()) {
            TTrinvcheckinfoDtoMapper mapper = new TTrinvcheckinfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrinvcheckinfoDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrinvcheckinfoList());
            dto.setTTrinvcheckinfoList(relationDtoList);
            if (reverseReference) {
                for (TTrinvcheckinfoDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrinvcorrectList && !entity.getTTrinvcorrectList().isEmpty()) {
            TTrinvcorrectDtoMapper mapper = new TTrinvcorrectDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrinvcorrectDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrinvcorrectList());
            dto.setTTrinvcorrectList(relationDtoList);
            if (reverseReference) {
                for (TTrinvcorrectDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrinvreanswerList && !entity.getTTrinvreanswerList().isEmpty()) {
            TTrinvreanswerDtoMapper mapper = new TTrinvreanswerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrinvreanswerDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrinvreanswerList());
            dto.setTTrinvreanswerList(relationDtoList);
            if (reverseReference) {
                for (TTrinvreanswerDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrinvrequestList && !entity.getTTrinvrequestList().isEmpty()) {
            TTrinvrequestDtoMapper mapper = new TTrinvrequestDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrinvrequestDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrinvrequestList());
            dto.setTTrinvrequestList(relationDtoList);
            if (reverseReference) {
                for (TTrinvrequestDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTritemconvresultList && !entity.getTTritemconvresultList().isEmpty()) {
            TTritemconvresultDtoMapper mapper = new TTritemconvresultDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTritemconvresultDto> relationDtoList = mapper.mappingToDtoList(entity.getTTritemconvresultList());
            dto.setTTritemconvresultList(relationDtoList);
            if (reverseReference) {
                for (TTritemconvresultDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrjukyuinvList && !entity.getTTrjukyuinvList().isEmpty()) {
            TTrjukyuinvDtoMapper mapper = new TTrjukyuinvDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrjukyuinvDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrjukyuinvList());
            dto.setTTrjukyuinvList(relationDtoList);
            if (reverseReference) {
                for (TTrjukyuinvDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrmanufacturedateList && !entity.getTTrmanufacturedateList().isEmpty()) {
            TTrmanufacturedateDtoMapper mapper = new TTrmanufacturedateDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrmanufacturedateDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrmanufacturedateList());
            dto.setTTrmanufacturedateList(relationDtoList);
            if (reverseReference) {
                for (TTrmanufacturedateDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrmanufacturedatedetailList && !entity.getTTrmanufacturedatedetailList().isEmpty()) {
            TTrmanufacturedatedetailDtoMapper mapper = new TTrmanufacturedatedetailDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrmanufacturedatedetailDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrmanufacturedatedetailList());
            dto.setTTrmanufacturedatedetailList(relationDtoList);
            if (reverseReference) {
                for (TTrmanufacturedatedetailDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrmanufacturedatehistoryList && !entity.getTTrmanufacturedatehistoryList().isEmpty()) {
            TTrmanufacturedatehistoryDtoMapper mapper = new TTrmanufacturedatehistoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrmanufacturedatehistoryDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrmanufacturedatehistoryList());
            dto.setTTrmanufacturedatehistoryList(relationDtoList);
            if (reverseReference) {
                for (TTrmanufacturedatehistoryDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrpallettraceList && !entity.getTTrpallettraceList().isEmpty()) {
            TTrpallettraceDtoMapper mapper = new TTrpallettraceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrpallettraceDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrpallettraceList());
            dto.setTTrpallettraceList(relationDtoList);
            if (reverseReference) {
                for (TTrpallettraceDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrreversestockList && !entity.getTTrreversestockList().isEmpty()) {
            TTrreversestockDtoMapper mapper = new TTrreversestockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrreversestockDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrreversestockList());
            dto.setTTrreversestockList(relationDtoList);
            if (reverseReference) {
                for (TTrreversestockDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrstockdiffhistoryList && !entity.getTTrstockdiffhistoryList().isEmpty()) {
            TTrstockdiffhistoryDtoMapper mapper = new TTrstockdiffhistoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrstockdiffhistoryDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrstockdiffhistoryList());
            dto.setTTrstockdiffhistoryList(relationDtoList);
            if (reverseReference) {
                for (TTrstockdiffhistoryDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrsymboltraceList && !entity.getTTrsymboltraceList().isEmpty()) {
            TTrsymboltraceDtoMapper mapper = new TTrsymboltraceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrsymboltraceDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrsymboltraceList());
            dto.setTTrsymboltraceList(relationDtoList);
            if (reverseReference) {
                for (TTrsymboltraceDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrsymboltraceextendList && !entity.getTTrsymboltraceextendList().isEmpty()) {
            TTrsymboltraceextendDtoMapper mapper = new TTrsymboltraceextendDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrsymboltraceextendDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrsymboltraceextendList());
            dto.setTTrsymboltraceextendList(relationDtoList);
            if (reverseReference) {
                for (TTrsymboltraceextendDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTTrtraceList && !entity.getTTrtraceList().isEmpty()) {
            TTrtraceDtoMapper mapper = new TTrtraceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrtraceDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrtraceList());
            dto.setTTrtraceList(relationDtoList);
            if (reverseReference) {
                for (TTrtraceDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressTYtrsoList && !entity.getTYtrsoList().isEmpty()) {
            TYtrsoDtoMapper mapper = new TYtrsoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TYtrsoDto> relationDtoList = mapper.mappingToDtoList(entity.getTYtrsoList());
            dto.setTYtrsoList(relationDtoList);
            if (reverseReference) {
                for (TYtrsoDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressWHtInventoryInputProdList && !entity.getWHtInventoryInputProdList().isEmpty()) {
            WHtInventoryInputProdDtoMapper mapper = new WHtInventoryInputProdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtInventoryInputProdDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtInventoryInputProdList());
            dto.setWHtInventoryInputProdList(relationDtoList);
            if (reverseReference) {
                for (WHtInventoryInputProdDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressWHtLoadingList && !entity.getWHtLoadingList().isEmpty()) {
            WHtLoadingDtoMapper mapper = new WHtLoadingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtLoadingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtLoadingList());
            dto.setWHtLoadingList(relationDtoList);
            if (reverseReference) {
                for (WHtLoadingDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressWHtReceiveInspectionList && !entity.getWHtReceiveInspectionList().isEmpty()) {
            WHtReceiveInspectionDtoMapper mapper = new WHtReceiveInspectionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtReceiveInspectionDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveInspectionList());
            dto.setWHtReceiveInspectionList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveInspectionDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspList && !entity.getWHtReceiveNoPlanInspList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtReceiveNoPlanInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveNoPlanInspList());
            dto.setWHtReceiveNoPlanInspList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInspDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressWHtReceiveStoreList && !entity.getWHtReceiveStoreList().isEmpty()) {
            WHtReceiveStoreDtoMapper mapper = new WHtReceiveStoreDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtReceiveStoreDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveStoreList());
            dto.setWHtReceiveStoreList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveStoreDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressWHtSerialReceiveInspList && !entity.getWHtSerialReceiveInspList().isEmpty()) {
            WHtSerialReceiveInspDtoMapper mapper = new WHtSerialReceiveInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtSerialReceiveInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtSerialReceiveInspList());
            dto.setWHtSerialReceiveInspList(relationDtoList);
            if (reverseReference) {
                for (WHtSerialReceiveInspDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressWHtSerialShippingInspList && !entity.getWHtSerialShippingInspList().isEmpty()) {
            WHtSerialShippingInspDtoMapper mapper = new WHtSerialShippingInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtSerialShippingInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtSerialShippingInspList());
            dto.setWHtSerialShippingInspList(relationDtoList);
            if (reverseReference) {
                for (WHtSerialShippingInspDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressWHtShippingList && !entity.getWHtShippingList().isEmpty()) {
            WHtShippingDtoMapper mapper = new WHtShippingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtShippingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtShippingList());
            dto.setWHtShippingList(relationDtoList);
            if (reverseReference) {
                for (WHtShippingDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressWHtShippingPickingList && !entity.getWHtShippingPickingList().isEmpty()) {
            WHtShippingPickingDtoMapper mapper = new WHtShippingPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtShippingPickingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtShippingPickingList());
            dto.setWHtShippingPickingList(relationDtoList);
            if (reverseReference) {
                for (WHtShippingPickingDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressWSglRowShipInspHList && !entity.getWSglRowShipInspHList().isEmpty()) {
            WSglRowShipInspHDtoMapper mapper = new WSglRowShipInspHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WSglRowShipInspHDto> relationDtoList = mapper.mappingToDtoList(entity.getWSglRowShipInspHList());
            dto.setWSglRowShipInspHList(relationDtoList);
            if (reverseReference) {
                for (WSglRowShipInspHDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        if (!_suppressWShippingInterruptList && !entity.getWShippingInterruptList().isEmpty()) {
            WShippingInterruptDtoMapper mapper = new WShippingInterruptDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WShippingInterruptDto> relationDtoList = mapper.mappingToDtoList(entity.getWShippingInterruptList());
            dto.setWShippingInterruptList(relationDtoList);
            if (reverseReference) {
                for (WShippingInterruptDto relationDto : relationDtoList) {
                    relationDto.setMClient(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MClientDto> mappingToDtoList(List<MClient> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MClientDto> dtoList = new ArrayList<MClientDto>();
        for (MClient entity : entityList) {
            MClientDto dto = mappingToDto(entity);
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
    public MClient mappingToEntity(MClientDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MClient)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MClient entity = new MClient();
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
        }
        if (needsMapping(dto, dto.getClientAbbr(), "clientAbbr")) {
            entity.setClientAbbr(dto.getClientAbbr());
        }
        if (needsMapping(dto, dto.getCustomerId(), "customerId")) {
            entity.setCustomerId(dto.getCustomerId());
        }
        if (needsMapping(dto, dto.getShapeGrpId(), "shapeGrpId")) {
            entity.setShapeGrpId(dto.getShapeGrpId());
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
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressMShapeGrp && dto.getMShapeGrp() != null) {
            MShapeGrpDto relationDto = dto.getMShapeGrp();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MShapeGrp relationEntity = (MShapeGrp)cachedEntity;
                entity.setMShapeGrp(relationEntity);
                if (reverseReference) {
                    relationEntity.getMClientList().add(entity);
                }
            } else {
                MShapeGrpDtoMapper mapper = new MShapeGrpDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMClientList();
                MShapeGrp relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMShapeGrp(relationEntity);
                if (reverseReference) {
                    relationEntity.getMClientList().add(entity);
                }
                if (instanceCache && entity.getMShapeGrp().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMShapeGrp());
                }
            }
        };
        if (!_suppressMCustomer && dto.getMCustomer() != null) {
            MCustomerDto relationDto = dto.getMCustomer();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomer(relationEntity);
                if (reverseReference) {
                    relationEntity.getMClientList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMClientList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomer(relationEntity);
                if (reverseReference) {
                    relationEntity.getMClientList().add(entity);
                }
                if (instanceCache && entity.getMCustomer().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomer());
                }
            }
        };
        if (!_suppressBClassDtlByDelFlg && dto.getBClassDtlByDelFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDelFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDelFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDelFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDelFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDelFlg());
                }
            }
        };
        if (!_suppressMCbrctgList && !dto.getMCbrctgList().isEmpty()) {
            MCbrctgDtoMapper mapper = new MCbrctgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MCbrctg> relationEntityList = mapper.mappingToEntityList(dto.getMCbrctgList());
            entity.setMCbrctgList(relationEntityList);
            if (reverseReference) {
                for (MCbrctg relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMCdrcattList && !dto.getMCdrcattList().isEmpty()) {
            MCdrcattDtoMapper mapper = new MCdrcattDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MCdrcatt> relationEntityList = mapper.mappingToEntityList(dto.getMCdrcattList());
            entity.setMCdrcattList(relationEntityList);
            if (reverseReference) {
                for (MCdrcatt relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMClientCenterList && !dto.getMClientCenterList().isEmpty()) {
            MClientCenterDtoMapper mapper = new MClientCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MClientCenter> relationEntityList = mapper.mappingToEntityList(dto.getMClientCenterList());
            entity.setMClientCenterList(relationEntityList);
            if (reverseReference) {
                for (MClientCenter relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMClientColList && !dto.getMClientColList().isEmpty()) {
            MClientColDtoMapper mapper = new MClientColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MClientCol> relationEntityList = mapper.mappingToEntityList(dto.getMClientColList());
            entity.setMClientColList(relationEntityList);
            if (reverseReference) {
                for (MClientCol relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMClientItemList && !dto.getMClientItemList().isEmpty()) {
            MClientItemDtoMapper mapper = new MClientItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MClientItem> relationEntityList = mapper.mappingToEntityList(dto.getMClientItemList());
            entity.setMClientItemList(relationEntityList);
            if (reverseReference) {
                for (MClientItem relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMClientScreenList && !dto.getMClientScreenList().isEmpty()) {
            MClientScreenDtoMapper mapper = new MClientScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MClientScreen> relationEntityList = mapper.mappingToEntityList(dto.getMClientScreenList());
            entity.setMClientScreenList(relationEntityList);
            if (reverseReference) {
                for (MClientScreen relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMCustomerList && !dto.getMCustomerList().isEmpty()) {
            MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MCustomer> relationEntityList = mapper.mappingToEntityList(dto.getMCustomerList());
            entity.setMCustomerList(relationEntityList);
            if (reverseReference) {
                for (MCustomer relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMImportTypeList && !dto.getMImportTypeList().isEmpty()) {
            MImportTypeDtoMapper mapper = new MImportTypeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MImportType> relationEntityList = mapper.mappingToEntityList(dto.getMImportTypeList());
            entity.setMImportTypeList(relationEntityList);
            if (reverseReference) {
                for (MImportType relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMMfinvoperationList && !dto.getMMfinvoperationList().isEmpty()) {
            MMfinvoperationDtoMapper mapper = new MMfinvoperationDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MMfinvoperation> relationEntityList = mapper.mappingToEntityList(dto.getMMfinvoperationList());
            entity.setMMfinvoperationList(relationEntityList);
            if (reverseReference) {
                for (MMfinvoperation relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMMfmonthchgList && !dto.getMMfmonthchgList().isEmpty()) {
            MMfmonthchgDtoMapper mapper = new MMfmonthchgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MMfmonthchg> relationEntityList = mapper.mappingToEntityList(dto.getMMfmonthchgList());
            entity.setMMfmonthchgList(relationEntityList);
            if (reverseReference) {
                for (MMfmonthchg relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMMfpickctlList && !dto.getMMfpickctlList().isEmpty()) {
            MMfpickctlDtoMapper mapper = new MMfpickctlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MMfpickctl> relationEntityList = mapper.mappingToEntityList(dto.getMMfpickctlList());
            entity.setMMfpickctlList(relationEntityList);
            if (reverseReference) {
                for (MMfpickctl relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMMfrcvdesignList && !dto.getMMfrcvdesignList().isEmpty()) {
            MMfrcvdesignDtoMapper mapper = new MMfrcvdesignDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MMfrcvdesign> relationEntityList = mapper.mappingToEntityList(dto.getMMfrcvdesignList());
            entity.setMMfrcvdesignList(relationEntityList);
            if (reverseReference) {
                for (MMfrcvdesign relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMMfrcvitemList && !dto.getMMfrcvitemList().isEmpty()) {
            MMfrcvitemDtoMapper mapper = new MMfrcvitemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MMfrcvitem> relationEntityList = mapper.mappingToEntityList(dto.getMMfrcvitemList());
            entity.setMMfrcvitemList(relationEntityList);
            if (reverseReference) {
                for (MMfrcvitem relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMMfwhxitemList && !dto.getMMfwhxitemList().isEmpty()) {
            MMfwhxitemDtoMapper mapper = new MMfwhxitemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MMfwhxitem> relationEntityList = mapper.mappingToEntityList(dto.getMMfwhxitemList());
            entity.setMMfwhxitemList(relationEntityList);
            if (reverseReference) {
                for (MMfwhxitem relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMProductList && !dto.getMProductList().isEmpty()) {
            MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MProduct> relationEntityList = mapper.mappingToEntityList(dto.getMProductList());
            entity.setMProductList(relationEntityList);
            if (reverseReference) {
                for (MProduct relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMShapeGrpList && !dto.getMShapeGrpList().isEmpty()) {
            MShapeGrpDtoMapper mapper = new MShapeGrpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MShapeGrp> relationEntityList = mapper.mappingToEntityList(dto.getMShapeGrpList());
            entity.setMShapeGrpList(relationEntityList);
            if (reverseReference) {
                for (MShapeGrp relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMUserClientList && !dto.getMUserClientList().isEmpty()) {
            MUserClientDtoMapper mapper = new MUserClientDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MUserClient> relationEntityList = mapper.mappingToEntityList(dto.getMUserClientList());
            entity.setMUserClientList(relationEntityList);
            if (reverseReference) {
                for (MUserClient relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMUserLoginList && !dto.getMUserLoginList().isEmpty()) {
            MUserLoginDtoMapper mapper = new MUserLoginDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MUserLogin> relationEntityList = mapper.mappingToEntityList(dto.getMUserLoginList());
            entity.setMUserLoginList(relationEntityList);
            if (reverseReference) {
                for (MUserLogin relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressMWebHtInfoList && !dto.getMWebHtInfoList().isEmpty()) {
            MWebHtInfoDtoMapper mapper = new MWebHtInfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<MWebHtInfo> relationEntityList = mapper.mappingToEntityList(dto.getMWebHtInfoList());
            entity.setMWebHtInfoList(relationEntityList);
            if (reverseReference) {
                for (MWebHtInfo relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTAllocInstHList && !dto.getTAllocInstHList().isEmpty()) {
            TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TAllocInstH> relationEntityList = mapper.mappingToEntityList(dto.getTAllocInstHList());
            entity.setTAllocInstHList(relationEntityList);
            if (reverseReference) {
                for (TAllocInstH relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTCcopamList && !dto.getTCcopamList().isEmpty()) {
            TCcopamDtoMapper mapper = new TCcopamDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TCcopam> relationEntityList = mapper.mappingToEntityList(dto.getTCcopamList());
            entity.setTCcopamList(relationEntityList);
            if (reverseReference) {
                for (TCcopam relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTCenterSymbolList && !dto.getTCenterSymbolList().isEmpty()) {
            TCenterSymbolDtoMapper mapper = new TCenterSymbolDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TCenterSymbol> relationEntityList = mapper.mappingToEntityList(dto.getTCenterSymbolList());
            entity.setTCenterSymbolList(relationEntityList);
            if (reverseReference) {
                for (TCenterSymbol relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTCordhdrList && !dto.getTCordhdrList().isEmpty()) {
            TCordhdrDtoMapper mapper = new TCordhdrDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TCordhdr> relationEntityList = mapper.mappingToEntityList(dto.getTCordhdrList());
            entity.setTCordhdrList(relationEntityList);
            if (reverseReference) {
                for (TCordhdr relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTEcOrderHList && !dto.getTEcOrderHList().isEmpty()) {
            TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TEcOrderH> relationEntityList = mapper.mappingToEntityList(dto.getTEcOrderHList());
            entity.setTEcOrderHList(relationEntityList);
            if (reverseReference) {
                for (TEcOrderH relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTInventoryHList && !dto.getTInventoryHList().isEmpty()) {
            TInventoryHDtoMapper mapper = new TInventoryHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TInventoryH> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryHList());
            entity.setTInventoryHList(relationEntityList);
            if (reverseReference) {
                for (TInventoryH relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTMflastshiplotList && !dto.getTMflastshiplotList().isEmpty()) {
            TMflastshiplotDtoMapper mapper = new TMflastshiplotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TMflastshiplot> relationEntityList = mapper.mappingToEntityList(dto.getTMflastshiplotList());
            entity.setTMflastshiplotList(relationEntityList);
            if (reverseReference) {
                for (TMflastshiplot relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTMoveInstHList && !dto.getTMoveInstHList().isEmpty()) {
            TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TMoveInstH> relationEntityList = mapper.mappingToEntityList(dto.getTMoveInstHList());
            entity.setTMoveInstHList(relationEntityList);
            if (reverseReference) {
                for (TMoveInstH relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTPackingHList && !dto.getTPackingHList().isEmpty()) {
            TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TPackingH> relationEntityList = mapper.mappingToEntityList(dto.getTPackingHList());
            entity.setTPackingHList(relationEntityList);
            if (reverseReference) {
                for (TPackingH relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTPalletList && !dto.getTPalletList().isEmpty()) {
            TPalletDtoMapper mapper = new TPalletDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TPallet> relationEntityList = mapper.mappingToEntityList(dto.getTPalletList());
            entity.setTPalletList(relationEntityList);
            if (reverseReference) {
                for (TPallet relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTPickingHList && !dto.getTPickingHList().isEmpty()) {
            TPickingHDtoMapper mapper = new TPickingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TPickingH> relationEntityList = mapper.mappingToEntityList(dto.getTPickingHList());
            entity.setTPickingHList(relationEntityList);
            if (reverseReference) {
                for (TPickingH relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTPicMthdRcmdList && !dto.getTPicMthdRcmdList().isEmpty()) {
            TPicMthdRcmdDtoMapper mapper = new TPicMthdRcmdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TPicMthdRcmd> relationEntityList = mapper.mappingToEntityList(dto.getTPicMthdRcmdList());
            entity.setTPicMthdRcmdList(relationEntityList);
            if (reverseReference) {
                for (TPicMthdRcmd relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTReceivePlanHList && !dto.getTReceivePlanHList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TReceivePlanH> relationEntityList = mapper.mappingToEntityList(dto.getTReceivePlanHList());
            entity.setTReceivePlanHList(relationEntityList);
            if (reverseReference) {
                for (TReceivePlanH relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTSerialNoList && !dto.getTSerialNoList().isEmpty()) {
            TSerialNoDtoMapper mapper = new TSerialNoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TSerialNo> relationEntityList = mapper.mappingToEntityList(dto.getTSerialNoList());
            entity.setTSerialNoList(relationEntityList);
            if (reverseReference) {
                for (TSerialNo relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTShippingInstHList && !dto.getTShippingInstHList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TShippingInstH> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstHList());
            entity.setTShippingInstHList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstH relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTSplinfoList && !dto.getTSplinfoList().isEmpty()) {
            TSplinfoDtoMapper mapper = new TSplinfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TSplinfo> relationEntityList = mapper.mappingToEntityList(dto.getTSplinfoList());
            entity.setTSplinfoList(relationEntityList);
            if (reverseReference) {
                for (TSplinfo relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTStockList && !dto.getTStockList().isEmpty()) {
            TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TStock> relationEntityList = mapper.mappingToEntityList(dto.getTStockList());
            entity.setTStockList(relationEntityList);
            if (reverseReference) {
                for (TStock relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTStoreRecordHList && !dto.getTStoreRecordHList().isEmpty()) {
            TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TStoreRecordH> relationEntityList = mapper.mappingToEntityList(dto.getTStoreRecordHList());
            entity.setTStoreRecordHList(relationEntityList);
            if (reverseReference) {
                for (TStoreRecordH relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrallinvList && !dto.getTTrallinvList().isEmpty()) {
            TTrallinvDtoMapper mapper = new TTrallinvDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrallinv> relationEntityList = mapper.mappingToEntityList(dto.getTTrallinvList());
            entity.setTTrallinvList(relationEntityList);
            if (reverseReference) {
                for (TTrallinv relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrallinvhistoryList && !dto.getTTrallinvhistoryList().isEmpty()) {
            TTrallinvhistoryDtoMapper mapper = new TTrallinvhistoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrallinvhistory> relationEntityList = mapper.mappingToEntityList(dto.getTTrallinvhistoryList());
            entity.setTTrallinvhistoryList(relationEntityList);
            if (reverseReference) {
                for (TTrallinvhistory relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrcaseinventoryList && !dto.getTTrcaseinventoryList().isEmpty()) {
            TTrcaseinventoryDtoMapper mapper = new TTrcaseinventoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrcaseinventory> relationEntityList = mapper.mappingToEntityList(dto.getTTrcaseinventoryList());
            entity.setTTrcaseinventoryList(relationEntityList);
            if (reverseReference) {
                for (TTrcaseinventory relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrcasenumList && !dto.getTTrcasenumList().isEmpty()) {
            TTrcasenumDtoMapper mapper = new TTrcasenumDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrcasenum> relationEntityList = mapper.mappingToEntityList(dto.getTTrcasenumList());
            entity.setTTrcasenumList(relationEntityList);
            if (reverseReference) {
                for (TTrcasenum relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrcasestockList && !dto.getTTrcasestockList().isEmpty()) {
            TTrcasestockDtoMapper mapper = new TTrcasestockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrcasestock> relationEntityList = mapper.mappingToEntityList(dto.getTTrcasestockList());
            entity.setTTrcasestockList(relationEntityList);
            if (reverseReference) {
                for (TTrcasestock relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrhanbaiinvList && !dto.getTTrhanbaiinvList().isEmpty()) {
            TTrhanbaiinvDtoMapper mapper = new TTrhanbaiinvDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrhanbaiinv> relationEntityList = mapper.mappingToEntityList(dto.getTTrhanbaiinvList());
            entity.setTTrhanbaiinvList(relationEntityList);
            if (reverseReference) {
                for (TTrhanbaiinv relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrinvcheckinfoList && !dto.getTTrinvcheckinfoList().isEmpty()) {
            TTrinvcheckinfoDtoMapper mapper = new TTrinvcheckinfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrinvcheckinfo> relationEntityList = mapper.mappingToEntityList(dto.getTTrinvcheckinfoList());
            entity.setTTrinvcheckinfoList(relationEntityList);
            if (reverseReference) {
                for (TTrinvcheckinfo relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrinvcorrectList && !dto.getTTrinvcorrectList().isEmpty()) {
            TTrinvcorrectDtoMapper mapper = new TTrinvcorrectDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrinvcorrect> relationEntityList = mapper.mappingToEntityList(dto.getTTrinvcorrectList());
            entity.setTTrinvcorrectList(relationEntityList);
            if (reverseReference) {
                for (TTrinvcorrect relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrinvreanswerList && !dto.getTTrinvreanswerList().isEmpty()) {
            TTrinvreanswerDtoMapper mapper = new TTrinvreanswerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrinvreanswer> relationEntityList = mapper.mappingToEntityList(dto.getTTrinvreanswerList());
            entity.setTTrinvreanswerList(relationEntityList);
            if (reverseReference) {
                for (TTrinvreanswer relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrinvrequestList && !dto.getTTrinvrequestList().isEmpty()) {
            TTrinvrequestDtoMapper mapper = new TTrinvrequestDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrinvrequest> relationEntityList = mapper.mappingToEntityList(dto.getTTrinvrequestList());
            entity.setTTrinvrequestList(relationEntityList);
            if (reverseReference) {
                for (TTrinvrequest relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTritemconvresultList && !dto.getTTritemconvresultList().isEmpty()) {
            TTritemconvresultDtoMapper mapper = new TTritemconvresultDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTritemconvresult> relationEntityList = mapper.mappingToEntityList(dto.getTTritemconvresultList());
            entity.setTTritemconvresultList(relationEntityList);
            if (reverseReference) {
                for (TTritemconvresult relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrjukyuinvList && !dto.getTTrjukyuinvList().isEmpty()) {
            TTrjukyuinvDtoMapper mapper = new TTrjukyuinvDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrjukyuinv> relationEntityList = mapper.mappingToEntityList(dto.getTTrjukyuinvList());
            entity.setTTrjukyuinvList(relationEntityList);
            if (reverseReference) {
                for (TTrjukyuinv relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrmanufacturedateList && !dto.getTTrmanufacturedateList().isEmpty()) {
            TTrmanufacturedateDtoMapper mapper = new TTrmanufacturedateDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrmanufacturedate> relationEntityList = mapper.mappingToEntityList(dto.getTTrmanufacturedateList());
            entity.setTTrmanufacturedateList(relationEntityList);
            if (reverseReference) {
                for (TTrmanufacturedate relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrmanufacturedatedetailList && !dto.getTTrmanufacturedatedetailList().isEmpty()) {
            TTrmanufacturedatedetailDtoMapper mapper = new TTrmanufacturedatedetailDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrmanufacturedatedetail> relationEntityList = mapper.mappingToEntityList(dto.getTTrmanufacturedatedetailList());
            entity.setTTrmanufacturedatedetailList(relationEntityList);
            if (reverseReference) {
                for (TTrmanufacturedatedetail relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrmanufacturedatehistoryList && !dto.getTTrmanufacturedatehistoryList().isEmpty()) {
            TTrmanufacturedatehistoryDtoMapper mapper = new TTrmanufacturedatehistoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrmanufacturedatehistory> relationEntityList = mapper.mappingToEntityList(dto.getTTrmanufacturedatehistoryList());
            entity.setTTrmanufacturedatehistoryList(relationEntityList);
            if (reverseReference) {
                for (TTrmanufacturedatehistory relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrpallettraceList && !dto.getTTrpallettraceList().isEmpty()) {
            TTrpallettraceDtoMapper mapper = new TTrpallettraceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrpallettrace> relationEntityList = mapper.mappingToEntityList(dto.getTTrpallettraceList());
            entity.setTTrpallettraceList(relationEntityList);
            if (reverseReference) {
                for (TTrpallettrace relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrreversestockList && !dto.getTTrreversestockList().isEmpty()) {
            TTrreversestockDtoMapper mapper = new TTrreversestockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrreversestock> relationEntityList = mapper.mappingToEntityList(dto.getTTrreversestockList());
            entity.setTTrreversestockList(relationEntityList);
            if (reverseReference) {
                for (TTrreversestock relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrstockdiffhistoryList && !dto.getTTrstockdiffhistoryList().isEmpty()) {
            TTrstockdiffhistoryDtoMapper mapper = new TTrstockdiffhistoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrstockdiffhistory> relationEntityList = mapper.mappingToEntityList(dto.getTTrstockdiffhistoryList());
            entity.setTTrstockdiffhistoryList(relationEntityList);
            if (reverseReference) {
                for (TTrstockdiffhistory relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrsymboltraceList && !dto.getTTrsymboltraceList().isEmpty()) {
            TTrsymboltraceDtoMapper mapper = new TTrsymboltraceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrsymboltrace> relationEntityList = mapper.mappingToEntityList(dto.getTTrsymboltraceList());
            entity.setTTrsymboltraceList(relationEntityList);
            if (reverseReference) {
                for (TTrsymboltrace relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrsymboltraceextendList && !dto.getTTrsymboltraceextendList().isEmpty()) {
            TTrsymboltraceextendDtoMapper mapper = new TTrsymboltraceextendDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrsymboltraceextend> relationEntityList = mapper.mappingToEntityList(dto.getTTrsymboltraceextendList());
            entity.setTTrsymboltraceextendList(relationEntityList);
            if (reverseReference) {
                for (TTrsymboltraceextend relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTTrtraceList && !dto.getTTrtraceList().isEmpty()) {
            TTrtraceDtoMapper mapper = new TTrtraceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TTrtrace> relationEntityList = mapper.mappingToEntityList(dto.getTTrtraceList());
            entity.setTTrtraceList(relationEntityList);
            if (reverseReference) {
                for (TTrtrace relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressTYtrsoList && !dto.getTYtrsoList().isEmpty()) {
            TYtrsoDtoMapper mapper = new TYtrsoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<TYtrso> relationEntityList = mapper.mappingToEntityList(dto.getTYtrsoList());
            entity.setTYtrsoList(relationEntityList);
            if (reverseReference) {
                for (TYtrso relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressWHtInventoryInputProdList && !dto.getWHtInventoryInputProdList().isEmpty()) {
            WHtInventoryInputProdDtoMapper mapper = new WHtInventoryInputProdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtInventoryInputProd> relationEntityList = mapper.mappingToEntityList(dto.getWHtInventoryInputProdList());
            entity.setWHtInventoryInputProdList(relationEntityList);
            if (reverseReference) {
                for (WHtInventoryInputProd relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressWHtLoadingList && !dto.getWHtLoadingList().isEmpty()) {
            WHtLoadingDtoMapper mapper = new WHtLoadingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtLoading> relationEntityList = mapper.mappingToEntityList(dto.getWHtLoadingList());
            entity.setWHtLoadingList(relationEntityList);
            if (reverseReference) {
                for (WHtLoading relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressWHtReceiveInspectionList && !dto.getWHtReceiveInspectionList().isEmpty()) {
            WHtReceiveInspectionDtoMapper mapper = new WHtReceiveInspectionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtReceiveInspection> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveInspectionList());
            entity.setWHtReceiveInspectionList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveInspection relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspList && !dto.getWHtReceiveNoPlanInspList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtReceiveNoPlanInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveNoPlanInspList());
            entity.setWHtReceiveNoPlanInspList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInsp relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressWHtReceiveStoreList && !dto.getWHtReceiveStoreList().isEmpty()) {
            WHtReceiveStoreDtoMapper mapper = new WHtReceiveStoreDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtReceiveStore> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveStoreList());
            entity.setWHtReceiveStoreList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveStore relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressWHtSerialReceiveInspList && !dto.getWHtSerialReceiveInspList().isEmpty()) {
            WHtSerialReceiveInspDtoMapper mapper = new WHtSerialReceiveInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtSerialReceiveInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtSerialReceiveInspList());
            entity.setWHtSerialReceiveInspList(relationEntityList);
            if (reverseReference) {
                for (WHtSerialReceiveInsp relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressWHtSerialShippingInspList && !dto.getWHtSerialShippingInspList().isEmpty()) {
            WHtSerialShippingInspDtoMapper mapper = new WHtSerialShippingInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtSerialShippingInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtSerialShippingInspList());
            entity.setWHtSerialShippingInspList(relationEntityList);
            if (reverseReference) {
                for (WHtSerialShippingInsp relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressWHtShippingList && !dto.getWHtShippingList().isEmpty()) {
            WHtShippingDtoMapper mapper = new WHtShippingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtShipping> relationEntityList = mapper.mappingToEntityList(dto.getWHtShippingList());
            entity.setWHtShippingList(relationEntityList);
            if (reverseReference) {
                for (WHtShipping relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressWHtShippingPickingList && !dto.getWHtShippingPickingList().isEmpty()) {
            WHtShippingPickingDtoMapper mapper = new WHtShippingPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WHtShippingPicking> relationEntityList = mapper.mappingToEntityList(dto.getWHtShippingPickingList());
            entity.setWHtShippingPickingList(relationEntityList);
            if (reverseReference) {
                for (WHtShippingPicking relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressWSglRowShipInspHList && !dto.getWSglRowShipInspHList().isEmpty()) {
            WSglRowShipInspHDtoMapper mapper = new WSglRowShipInspHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WSglRowShipInspH> relationEntityList = mapper.mappingToEntityList(dto.getWSglRowShipInspHList());
            entity.setWSglRowShipInspHList(relationEntityList);
            if (reverseReference) {
                for (WSglRowShipInspH relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
        if (!_suppressWShippingInterruptList && !dto.getWShippingInterruptList().isEmpty()) {
            WShippingInterruptDtoMapper mapper = new WShippingInterruptDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMClient();
            List<WShippingInterrupt> relationEntityList = mapper.mappingToEntityList(dto.getWShippingInterruptList());
            entity.setWShippingInterruptList(relationEntityList);
            if (reverseReference) {
                for (WShippingInterrupt relationEntity : relationEntityList) {
                    relationEntity.setMClient(entity);
                }
            }
        };
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
    protected boolean needsMapping(MClientDto dto, Object value, String propName) {
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
    public List<MClient> mappingToEntityList(List<MClientDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MClient> entityList = new ArrayList<MClient>();
        for (MClientDto dto : dtoList) {
            MClient entity = mappingToEntity(dto);
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
    public void suppressMShapeGrp() {
        _suppressMShapeGrp = true;
    }
    public void suppressMCustomer() {
        _suppressMCustomer = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressMCbrctgList() {
        _suppressMCbrctgList = true;
    }
    public void suppressMCdrcattList() {
        _suppressMCdrcattList = true;
    }
    public void suppressMClientCenterList() {
        _suppressMClientCenterList = true;
    }
    public void suppressMClientColList() {
        _suppressMClientColList = true;
    }
    public void suppressMClientItemList() {
        _suppressMClientItemList = true;
    }
    public void suppressMClientScreenList() {
        _suppressMClientScreenList = true;
    }
    public void suppressMCustomerList() {
        _suppressMCustomerList = true;
    }
    public void suppressMImportTypeList() {
        _suppressMImportTypeList = true;
    }
    public void suppressMMfinvoperationList() {
        _suppressMMfinvoperationList = true;
    }
    public void suppressMMfmonthchgList() {
        _suppressMMfmonthchgList = true;
    }
    public void suppressMMfpickctlList() {
        _suppressMMfpickctlList = true;
    }
    public void suppressMMfrcvdesignList() {
        _suppressMMfrcvdesignList = true;
    }
    public void suppressMMfrcvitemList() {
        _suppressMMfrcvitemList = true;
    }
    public void suppressMMfwhxitemList() {
        _suppressMMfwhxitemList = true;
    }
    public void suppressMProductList() {
        _suppressMProductList = true;
    }
    public void suppressMShapeGrpList() {
        _suppressMShapeGrpList = true;
    }
    public void suppressMUserClientList() {
        _suppressMUserClientList = true;
    }
    public void suppressMUserLoginList() {
        _suppressMUserLoginList = true;
    }
    public void suppressMWebHtInfoList() {
        _suppressMWebHtInfoList = true;
    }
    public void suppressTAllocInstHList() {
        _suppressTAllocInstHList = true;
    }
    public void suppressTCcopamList() {
        _suppressTCcopamList = true;
    }
    public void suppressTCenterSymbolList() {
        _suppressTCenterSymbolList = true;
    }
    public void suppressTCordhdrList() {
        _suppressTCordhdrList = true;
    }
    public void suppressTEcOrderHList() {
        _suppressTEcOrderHList = true;
    }
    public void suppressTInventoryHList() {
        _suppressTInventoryHList = true;
    }
    public void suppressTMflastshiplotList() {
        _suppressTMflastshiplotList = true;
    }
    public void suppressTMoveInstHList() {
        _suppressTMoveInstHList = true;
    }
    public void suppressTPackingHList() {
        _suppressTPackingHList = true;
    }
    public void suppressTPalletList() {
        _suppressTPalletList = true;
    }
    public void suppressTPickingHList() {
        _suppressTPickingHList = true;
    }
    public void suppressTPicMthdRcmdList() {
        _suppressTPicMthdRcmdList = true;
    }
    public void suppressTReceivePlanHList() {
        _suppressTReceivePlanHList = true;
    }
    public void suppressTSerialNoList() {
        _suppressTSerialNoList = true;
    }
    public void suppressTShippingInstHList() {
        _suppressTShippingInstHList = true;
    }
    public void suppressTSplinfoList() {
        _suppressTSplinfoList = true;
    }
    public void suppressTStockList() {
        _suppressTStockList = true;
    }
    public void suppressTStoreRecordHList() {
        _suppressTStoreRecordHList = true;
    }
    public void suppressTTrallinvList() {
        _suppressTTrallinvList = true;
    }
    public void suppressTTrallinvhistoryList() {
        _suppressTTrallinvhistoryList = true;
    }
    public void suppressTTrcaseinventoryList() {
        _suppressTTrcaseinventoryList = true;
    }
    public void suppressTTrcasenumList() {
        _suppressTTrcasenumList = true;
    }
    public void suppressTTrcasestockList() {
        _suppressTTrcasestockList = true;
    }
    public void suppressTTrhanbaiinvList() {
        _suppressTTrhanbaiinvList = true;
    }
    public void suppressTTrinvcheckinfoList() {
        _suppressTTrinvcheckinfoList = true;
    }
    public void suppressTTrinvcorrectList() {
        _suppressTTrinvcorrectList = true;
    }
    public void suppressTTrinvreanswerList() {
        _suppressTTrinvreanswerList = true;
    }
    public void suppressTTrinvrequestList() {
        _suppressTTrinvrequestList = true;
    }
    public void suppressTTritemconvresultList() {
        _suppressTTritemconvresultList = true;
    }
    public void suppressTTrjukyuinvList() {
        _suppressTTrjukyuinvList = true;
    }
    public void suppressTTrmanufacturedateList() {
        _suppressTTrmanufacturedateList = true;
    }
    public void suppressTTrmanufacturedatedetailList() {
        _suppressTTrmanufacturedatedetailList = true;
    }
    public void suppressTTrmanufacturedatehistoryList() {
        _suppressTTrmanufacturedatehistoryList = true;
    }
    public void suppressTTrpallettraceList() {
        _suppressTTrpallettraceList = true;
    }
    public void suppressTTrreversestockList() {
        _suppressTTrreversestockList = true;
    }
    public void suppressTTrstockdiffhistoryList() {
        _suppressTTrstockdiffhistoryList = true;
    }
    public void suppressTTrsymboltraceList() {
        _suppressTTrsymboltraceList = true;
    }
    public void suppressTTrsymboltraceextendList() {
        _suppressTTrsymboltraceextendList = true;
    }
    public void suppressTTrtraceList() {
        _suppressTTrtraceList = true;
    }
    public void suppressTYtrsoList() {
        _suppressTYtrsoList = true;
    }
    public void suppressWHtInventoryInputProdList() {
        _suppressWHtInventoryInputProdList = true;
    }
    public void suppressWHtLoadingList() {
        _suppressWHtLoadingList = true;
    }
    public void suppressWHtReceiveInspectionList() {
        _suppressWHtReceiveInspectionList = true;
    }
    public void suppressWHtReceiveNoPlanInspList() {
        _suppressWHtReceiveNoPlanInspList = true;
    }
    public void suppressWHtReceiveStoreList() {
        _suppressWHtReceiveStoreList = true;
    }
    public void suppressWHtSerialReceiveInspList() {
        _suppressWHtSerialReceiveInspList = true;
    }
    public void suppressWHtSerialShippingInspList() {
        _suppressWHtSerialShippingInspList = true;
    }
    public void suppressWHtShippingList() {
        _suppressWHtShippingList = true;
    }
    public void suppressWHtShippingPickingList() {
        _suppressWHtShippingPickingList = true;
    }
    public void suppressWSglRowShipInspHList() {
        _suppressWSglRowShipInspHList = true;
    }
    public void suppressWShippingInterruptList() {
        _suppressWShippingInterruptList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMShapeGrp();
        suppressMCustomer();
        suppressBClassDtlByDelFlg();
        suppressMCbrctgList();
        suppressMCdrcattList();
        suppressMClientCenterList();
        suppressMClientColList();
        suppressMClientItemList();
        suppressMClientScreenList();
        suppressMCustomerList();
        suppressMImportTypeList();
        suppressMMfinvoperationList();
        suppressMMfmonthchgList();
        suppressMMfpickctlList();
        suppressMMfrcvdesignList();
        suppressMMfrcvitemList();
        suppressMMfwhxitemList();
        suppressMProductList();
        suppressMShapeGrpList();
        suppressMUserClientList();
        suppressMUserLoginList();
        suppressMWebHtInfoList();
        suppressTAllocInstHList();
        suppressTCcopamList();
        suppressTCenterSymbolList();
        suppressTCordhdrList();
        suppressTEcOrderHList();
        suppressTInventoryHList();
        suppressTMflastshiplotList();
        suppressTMoveInstHList();
        suppressTPackingHList();
        suppressTPalletList();
        suppressTPickingHList();
        suppressTPicMthdRcmdList();
        suppressTReceivePlanHList();
        suppressTSerialNoList();
        suppressTShippingInstHList();
        suppressTSplinfoList();
        suppressTStockList();
        suppressTStoreRecordHList();
        suppressTTrallinvList();
        suppressTTrallinvhistoryList();
        suppressTTrcaseinventoryList();
        suppressTTrcasenumList();
        suppressTTrcasestockList();
        suppressTTrhanbaiinvList();
        suppressTTrinvcheckinfoList();
        suppressTTrinvcorrectList();
        suppressTTrinvreanswerList();
        suppressTTrinvrequestList();
        suppressTTritemconvresultList();
        suppressTTrjukyuinvList();
        suppressTTrmanufacturedateList();
        suppressTTrmanufacturedatedetailList();
        suppressTTrmanufacturedatehistoryList();
        suppressTTrpallettraceList();
        suppressTTrreversestockList();
        suppressTTrstockdiffhistoryList();
        suppressTTrsymboltraceList();
        suppressTTrsymboltraceextendList();
        suppressTTrtraceList();
        suppressTYtrsoList();
        suppressWHtInventoryInputProdList();
        suppressWHtLoadingList();
        suppressWHtReceiveInspectionList();
        suppressWHtReceiveNoPlanInspList();
        suppressWHtReceiveStoreList();
        suppressWHtSerialReceiveInspList();
        suppressWHtSerialShippingInspList();
        suppressWHtShippingList();
        suppressWHtShippingPickingList();
        suppressWSglRowShipInspHList();
        suppressWShippingInterruptList();
    }
    protected void doSuppressClear() { // internal
        _suppressMShapeGrp = false;
        _suppressMCustomer = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressMCbrctgList = false;
        _suppressMCdrcattList = false;
        _suppressMClientCenterList = false;
        _suppressMClientColList = false;
        _suppressMClientItemList = false;
        _suppressMClientScreenList = false;
        _suppressMCustomerList = false;
        _suppressMImportTypeList = false;
        _suppressMMfinvoperationList = false;
        _suppressMMfmonthchgList = false;
        _suppressMMfpickctlList = false;
        _suppressMMfrcvdesignList = false;
        _suppressMMfrcvitemList = false;
        _suppressMMfwhxitemList = false;
        _suppressMProductList = false;
        _suppressMShapeGrpList = false;
        _suppressMUserClientList = false;
        _suppressMUserLoginList = false;
        _suppressMWebHtInfoList = false;
        _suppressTAllocInstHList = false;
        _suppressTCcopamList = false;
        _suppressTCenterSymbolList = false;
        _suppressTCordhdrList = false;
        _suppressTEcOrderHList = false;
        _suppressTInventoryHList = false;
        _suppressTMflastshiplotList = false;
        _suppressTMoveInstHList = false;
        _suppressTPackingHList = false;
        _suppressTPalletList = false;
        _suppressTPickingHList = false;
        _suppressTPicMthdRcmdList = false;
        _suppressTReceivePlanHList = false;
        _suppressTSerialNoList = false;
        _suppressTShippingInstHList = false;
        _suppressTSplinfoList = false;
        _suppressTStockList = false;
        _suppressTStoreRecordHList = false;
        _suppressTTrallinvList = false;
        _suppressTTrallinvhistoryList = false;
        _suppressTTrcaseinventoryList = false;
        _suppressTTrcasenumList = false;
        _suppressTTrcasestockList = false;
        _suppressTTrhanbaiinvList = false;
        _suppressTTrinvcheckinfoList = false;
        _suppressTTrinvcorrectList = false;
        _suppressTTrinvreanswerList = false;
        _suppressTTrinvrequestList = false;
        _suppressTTritemconvresultList = false;
        _suppressTTrjukyuinvList = false;
        _suppressTTrmanufacturedateList = false;
        _suppressTTrmanufacturedatedetailList = false;
        _suppressTTrmanufacturedatehistoryList = false;
        _suppressTTrpallettraceList = false;
        _suppressTTrreversestockList = false;
        _suppressTTrstockdiffhistoryList = false;
        _suppressTTrsymboltraceList = false;
        _suppressTTrsymboltraceextendList = false;
        _suppressTTrtraceList = false;
        _suppressTYtrsoList = false;
        _suppressWHtInventoryInputProdList = false;
        _suppressWHtLoadingList = false;
        _suppressWHtReceiveInspectionList = false;
        _suppressWHtReceiveNoPlanInspList = false;
        _suppressWHtReceiveStoreList = false;
        _suppressWHtSerialReceiveInspList = false;
        _suppressWHtSerialShippingInspList = false;
        _suppressWHtShippingList = false;
        _suppressWHtShippingPickingList = false;
        _suppressWSglRowShipInspHList = false;
        _suppressWShippingInterruptList = false;
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
    public MClientDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MClientDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MClientDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MClientDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MClientDtoMapper reverseReference() {
        setReverseReference(true);
        return (MClientDtoMapper)this;
    }
}
