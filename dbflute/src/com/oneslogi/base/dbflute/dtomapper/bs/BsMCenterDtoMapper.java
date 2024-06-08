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
 * The DTO mapper of M_CENTER as TABLE. <br>
 * 拠点マスタ
 * <pre>
 * [primary-key]
 *     CENTER_ID
 *
 * [column]
 *     CENTER_ID, CENTER_CD, CENTER_NM, CENTER_ABBR, CULTURE_ID, TIME_ZONE_ID, WarehouseGroup, VirtualWhouseFlg, Aname, Address1, Address2, Address3, PostNo, CountryCd, PortCd, DistrictCd, Phone1, Phone2, Fax1, Fax2, WarehouseFlg, RefName, SubcontractFlg, WeightCapacity, Capacity, HULFT_ID, WarehouseCls, CMLRASID, OWN_OR_ANOTHER_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_TIME_ZONE, B_CULTURE, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer-table]
 *     M_BOX, M_BOX_GRP, M_CARRIER, M_CARRIER_SLIP_SGW, M_CARRIER_SLIP_YMT, M_CARRIER_SLIP_YUPK, M_CBLK, M_CBRCTG, M_CDRCATT, M_CENTER_CLASS, M_CENTER_COL, M_CENTER_CUSTOMER, M_CENTER_ITEM, M_CENTER_SCREEN, M_CLIENT_CENTER, M_CLIN, M_CORG, M_DELIVERY_COURSE, M_LOCATION, M_MFINVOPERATION, M_MFMONTHCHG, M_MFSTOCKITEM, M_MFWHSTRCT, M_MFWHxITEM, M_NUMBERING_CENTER, M_USER_CENTER, M_USER_LOGIN, M_WAREHOUSE, M_WEB_HT_INFO, T_ALLOC_INST_H, T_CCOPAM, T_CENTER_SYMBOL, T_CORDHDR, T_CSRWHADM, T_EC_ORDER_H, T_INVENTORY_H, T_MFLASTSHIPLOT, T_MOVE_INST_H, T_PACKING_H, T_PALLET, T_PICKING_H, T_PIC_MTHD_RCMD, T_RECEIVE_PLAN_H, T_SERIAL_NO, T_SHIPPING_INST_H, T_SPLINFO, T_STORE_RECORD_H, T_TRALLINV, T_TRALLINVHISTORY, T_TRCASEINVENTORY, T_TRCASENUM, T_TRCASESTOCK, T_TRHANBAIINV, T_TRINVCHECKINFO, T_TRINVCORRECT, T_TRINVREANSWER, T_TRINVREQUEST, T_TRITEMCONVRESULT, T_TRJUKYUINV, T_TRMANUFACTUREDATE, T_TRMANUFACTUREDATEDETAIL, T_TRMANUFACTUREDATEHISTORY, T_TRPALLETTRACE, T_TRREVERSESTOCK, T_TRSTOCKDIFFHISTORY, T_TRSYMBOLTRACE, T_TRSYMBOLTRACEEXTEND, T_TRTRACE, T_YTRSO, W_HT_INVENTORY_INPUT_PROD, W_HT_LOADING, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SERIAL_RECEIVE_INSP, W_HT_SERIAL_SHIPPING_INSP, W_HT_SHIPPING, W_HT_SHIPPING_PICKING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT
 *
 * [foreign-property]
 *     bTimeZone, bCulture, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     mBoxList, mBoxGrpList, mCarrierList, mCarrierSlipSgwList, mCarrierSlipYmtList, mCarrierSlipYupkList, mCblkList, mCbrctgList, mCdrcattList, mCenterClassList, mCenterColList, mCenterCustomerList, mCenterItemList, mCenterScreenList, mClientCenterList, mClinList, mCorgList, mDeliveryCourseList, mLocationList, mMfinvoperationList, mMfmonthchgList, mMfstockitemList, mMfwhstrctList, mMfwhxitemList, mNumberingCenterList, mUserCenterList, mUserLoginList, mWarehouseList, mWebHtInfoList, tAllocInstHList, tCcopamList, tCenterSymbolList, tCordhdrList, tCsrwhadmList, tEcOrderHList, tInventoryHList, tMflastshiplotList, tMoveInstHList, tPackingHList, tPalletList, tPickingHList, tPicMthdRcmdList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tSplinfoList, tStoreRecordHList, tTrallinvList, tTrallinvhistoryList, tTrcaseinventoryList, tTrcasenumList, tTrcasestockList, tTrhanbaiinvList, tTrinvcheckinfoList, tTrinvcorrectList, tTrinvreanswerList, tTrinvrequestList, tTritemconvresultList, tTrjukyuinvList, tTrmanufacturedateList, tTrmanufacturedatedetailList, tTrmanufacturedatehistoryList, tTrpallettraceList, tTrreversestockList, tTrstockdiffhistoryList, tTrsymboltraceList, tTrsymboltraceextendList, tTrtraceList, tYtrsoList, wHtInventoryInputProdList, wHtLoadingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCenterDtoMapper implements DtoMapper<MCenter, MCenterDto>, Serializable {

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
    protected boolean _suppressBTimeZone;
    protected boolean _suppressBCulture;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressMBoxList;
    protected boolean _suppressMBoxGrpList;
    protected boolean _suppressMCarrierList;
    protected boolean _suppressMCarrierSlipSgwList;
    protected boolean _suppressMCarrierSlipYmtList;
    protected boolean _suppressMCarrierSlipYupkList;
    protected boolean _suppressMCblkList;
    protected boolean _suppressMCbrctgList;
    protected boolean _suppressMCdrcattList;
    protected boolean _suppressMCenterClassList;
    protected boolean _suppressMCenterColList;
    protected boolean _suppressMCenterCustomerList;
    protected boolean _suppressMCenterItemList;
    protected boolean _suppressMCenterScreenList;
    protected boolean _suppressMClientCenterList;
    protected boolean _suppressMClinList;
    protected boolean _suppressMCorgList;
    protected boolean _suppressMDeliveryCourseList;
    protected boolean _suppressMLocationList;
    protected boolean _suppressMMfinvoperationList;
    protected boolean _suppressMMfmonthchgList;
    protected boolean _suppressMMfstockitemList;
    protected boolean _suppressMMfwhstrctList;
    protected boolean _suppressMMfwhxitemList;
    protected boolean _suppressMNumberingCenterList;
    protected boolean _suppressMUserCenterList;
    protected boolean _suppressMUserLoginList;
    protected boolean _suppressMWarehouseList;
    protected boolean _suppressMWebHtInfoList;
    protected boolean _suppressTAllocInstHList;
    protected boolean _suppressTCcopamList;
    protected boolean _suppressTCenterSymbolList;
    protected boolean _suppressTCordhdrList;
    protected boolean _suppressTCsrwhadmList;
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
    public BsMCenterDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMCenterDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MCenterDto mappingToDto(MCenter entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MCenterDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCenterDto dto = new MCenterDto();
        dto.setCenterId(entity.getCenterId());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setCenterAbbr(entity.getCenterAbbr());
        dto.setCultureId(entity.getCultureId());
        dto.setTimeZoneId(entity.getTimeZoneId());
        dto.setWarehousegroup(entity.getWarehousegroup());
        dto.setVirtualwhouseflg(entity.getVirtualwhouseflg());
        dto.setAname(entity.getAname());
        dto.setAddress1(entity.getAddress1());
        dto.setAddress2(entity.getAddress2());
        dto.setAddress3(entity.getAddress3());
        dto.setPostno(entity.getPostno());
        dto.setCountrycd(entity.getCountrycd());
        dto.setPortcd(entity.getPortcd());
        dto.setDistrictcd(entity.getDistrictcd());
        dto.setPhone1(entity.getPhone1());
        dto.setPhone2(entity.getPhone2());
        dto.setFax1(entity.getFax1());
        dto.setFax2(entity.getFax2());
        dto.setWarehouseflg(entity.getWarehouseflg());
        dto.setRefname(entity.getRefname());
        dto.setSubcontractflg(entity.getSubcontractflg());
        dto.setWeightcapacity(entity.getWeightcapacity());
        dto.setCapacity(entity.getCapacity());
        dto.setHulftId(entity.getHulftId());
        dto.setWarehousecls(entity.getWarehousecls());
        dto.setCmlrasid(entity.getCmlrasid());
        dto.setOwnOrAnotherFlg(entity.getOwnOrAnotherFlg());
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
        if (!_suppressBTimeZone && entity.getBTimeZone() != null) {
            BTimeZone relationEntity = entity.getBTimeZone();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BTimeZoneDto relationDto = (BTimeZoneDto)cachedDto;
                dto.setBTimeZone(relationDto);
                if (reverseReference) {
                    relationDto.getMCenterList().add(dto);
                }
            } else {
                BTimeZoneDtoMapper mapper = new BTimeZoneDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCenterList();
                BTimeZoneDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBTimeZone(relationDto);
                if (reverseReference) {
                    relationDto.getMCenterList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBTimeZone());
                }
            }
        };
        if (!_suppressBCulture && entity.getBCulture() != null) {
            BCulture relationEntity = entity.getBCulture();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BCultureDto relationDto = (BCultureDto)cachedDto;
                dto.setBCulture(relationDto);
                if (reverseReference) {
                    relationDto.getMCenterList().add(dto);
                }
            } else {
                BCultureDtoMapper mapper = new BCultureDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCenterList();
                BCultureDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBCulture(relationDto);
                if (reverseReference) {
                    relationDto.getMCenterList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBCulture());
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
        if (!_suppressMBoxList && !entity.getMBoxList().isEmpty()) {
            MBoxDtoMapper mapper = new MBoxDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MBoxDto> relationDtoList = mapper.mappingToDtoList(entity.getMBoxList());
            dto.setMBoxList(relationDtoList);
            if (reverseReference) {
                for (MBoxDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMBoxGrpList && !entity.getMBoxGrpList().isEmpty()) {
            MBoxGrpDtoMapper mapper = new MBoxGrpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MBoxGrpDto> relationDtoList = mapper.mappingToDtoList(entity.getMBoxGrpList());
            dto.setMBoxGrpList(relationDtoList);
            if (reverseReference) {
                for (MBoxGrpDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCarrierList && !entity.getMCarrierList().isEmpty()) {
            MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrierDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierList());
            dto.setMCarrierList(relationDtoList);
            if (reverseReference) {
                for (MCarrierDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCarrierSlipSgwList && !entity.getMCarrierSlipSgwList().isEmpty()) {
            MCarrierSlipSgwDtoMapper mapper = new MCarrierSlipSgwDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrierSlipSgwDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierSlipSgwList());
            dto.setMCarrierSlipSgwList(relationDtoList);
            if (reverseReference) {
                for (MCarrierSlipSgwDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCarrierSlipYmtList && !entity.getMCarrierSlipYmtList().isEmpty()) {
            MCarrierSlipYmtDtoMapper mapper = new MCarrierSlipYmtDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrierSlipYmtDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierSlipYmtList());
            dto.setMCarrierSlipYmtList(relationDtoList);
            if (reverseReference) {
                for (MCarrierSlipYmtDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCarrierSlipYupkList && !entity.getMCarrierSlipYupkList().isEmpty()) {
            MCarrierSlipYupkDtoMapper mapper = new MCarrierSlipYupkDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrierSlipYupkDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierSlipYupkList());
            dto.setMCarrierSlipYupkList(relationDtoList);
            if (reverseReference) {
                for (MCarrierSlipYupkDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCblkList && !entity.getMCblkList().isEmpty()) {
            MCblkDtoMapper mapper = new MCblkDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCblkDto> relationDtoList = mapper.mappingToDtoList(entity.getMCblkList());
            dto.setMCblkList(relationDtoList);
            if (reverseReference) {
                for (MCblkDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCbrctgList && !entity.getMCbrctgList().isEmpty()) {
            MCbrctgDtoMapper mapper = new MCbrctgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCbrctgDto> relationDtoList = mapper.mappingToDtoList(entity.getMCbrctgList());
            dto.setMCbrctgList(relationDtoList);
            if (reverseReference) {
                for (MCbrctgDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCdrcattList && !entity.getMCdrcattList().isEmpty()) {
            MCdrcattDtoMapper mapper = new MCdrcattDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCdrcattDto> relationDtoList = mapper.mappingToDtoList(entity.getMCdrcattList());
            dto.setMCdrcattList(relationDtoList);
            if (reverseReference) {
                for (MCdrcattDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCenterClassList && !entity.getMCenterClassList().isEmpty()) {
            MCenterClassDtoMapper mapper = new MCenterClassDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterClassDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterClassList());
            dto.setMCenterClassList(relationDtoList);
            if (reverseReference) {
                for (MCenterClassDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCenterColList && !entity.getMCenterColList().isEmpty()) {
            MCenterColDtoMapper mapper = new MCenterColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterColDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterColList());
            dto.setMCenterColList(relationDtoList);
            if (reverseReference) {
                for (MCenterColDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCenterCustomerList && !entity.getMCenterCustomerList().isEmpty()) {
            MCenterCustomerDtoMapper mapper = new MCenterCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterCustomerDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterCustomerList());
            dto.setMCenterCustomerList(relationDtoList);
            if (reverseReference) {
                for (MCenterCustomerDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCenterItemList && !entity.getMCenterItemList().isEmpty()) {
            MCenterItemDtoMapper mapper = new MCenterItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterItemDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterItemList());
            dto.setMCenterItemList(relationDtoList);
            if (reverseReference) {
                for (MCenterItemDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCenterScreenList && !entity.getMCenterScreenList().isEmpty()) {
            MCenterScreenDtoMapper mapper = new MCenterScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterScreenDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterScreenList());
            dto.setMCenterScreenList(relationDtoList);
            if (reverseReference) {
                for (MCenterScreenDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMClientCenterList && !entity.getMClientCenterList().isEmpty()) {
            MClientCenterDtoMapper mapper = new MClientCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MClientCenterDto> relationDtoList = mapper.mappingToDtoList(entity.getMClientCenterList());
            dto.setMClientCenterList(relationDtoList);
            if (reverseReference) {
                for (MClientCenterDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMClinList && !entity.getMClinList().isEmpty()) {
            MClinDtoMapper mapper = new MClinDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MClinDto> relationDtoList = mapper.mappingToDtoList(entity.getMClinList());
            dto.setMClinList(relationDtoList);
            if (reverseReference) {
                for (MClinDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCorgList && !entity.getMCorgList().isEmpty()) {
            MCorgDtoMapper mapper = new MCorgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCorgDto> relationDtoList = mapper.mappingToDtoList(entity.getMCorgList());
            dto.setMCorgList(relationDtoList);
            if (reverseReference) {
                for (MCorgDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMDeliveryCourseList && !entity.getMDeliveryCourseList().isEmpty()) {
            MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MDeliveryCourseDto> relationDtoList = mapper.mappingToDtoList(entity.getMDeliveryCourseList());
            dto.setMDeliveryCourseList(relationDtoList);
            if (reverseReference) {
                for (MDeliveryCourseDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMLocationList && !entity.getMLocationList().isEmpty()) {
            MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MLocationDto> relationDtoList = mapper.mappingToDtoList(entity.getMLocationList());
            dto.setMLocationList(relationDtoList);
            if (reverseReference) {
                for (MLocationDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMMfinvoperationList && !entity.getMMfinvoperationList().isEmpty()) {
            MMfinvoperationDtoMapper mapper = new MMfinvoperationDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MMfinvoperationDto> relationDtoList = mapper.mappingToDtoList(entity.getMMfinvoperationList());
            dto.setMMfinvoperationList(relationDtoList);
            if (reverseReference) {
                for (MMfinvoperationDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMMfmonthchgList && !entity.getMMfmonthchgList().isEmpty()) {
            MMfmonthchgDtoMapper mapper = new MMfmonthchgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MMfmonthchgDto> relationDtoList = mapper.mappingToDtoList(entity.getMMfmonthchgList());
            dto.setMMfmonthchgList(relationDtoList);
            if (reverseReference) {
                for (MMfmonthchgDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMMfstockitemList && !entity.getMMfstockitemList().isEmpty()) {
            MMfstockitemDtoMapper mapper = new MMfstockitemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MMfstockitemDto> relationDtoList = mapper.mappingToDtoList(entity.getMMfstockitemList());
            dto.setMMfstockitemList(relationDtoList);
            if (reverseReference) {
                for (MMfstockitemDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMMfwhstrctList && !entity.getMMfwhstrctList().isEmpty()) {
            MMfwhstrctDtoMapper mapper = new MMfwhstrctDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MMfwhstrctDto> relationDtoList = mapper.mappingToDtoList(entity.getMMfwhstrctList());
            dto.setMMfwhstrctList(relationDtoList);
            if (reverseReference) {
                for (MMfwhstrctDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMMfwhxitemList && !entity.getMMfwhxitemList().isEmpty()) {
            MMfwhxitemDtoMapper mapper = new MMfwhxitemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MMfwhxitemDto> relationDtoList = mapper.mappingToDtoList(entity.getMMfwhxitemList());
            dto.setMMfwhxitemList(relationDtoList);
            if (reverseReference) {
                for (MMfwhxitemDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMNumberingCenterList && !entity.getMNumberingCenterList().isEmpty()) {
            MNumberingCenterDtoMapper mapper = new MNumberingCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MNumberingCenterDto> relationDtoList = mapper.mappingToDtoList(entity.getMNumberingCenterList());
            dto.setMNumberingCenterList(relationDtoList);
            if (reverseReference) {
                for (MNumberingCenterDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMUserCenterList && !entity.getMUserCenterList().isEmpty()) {
            MUserCenterDtoMapper mapper = new MUserCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MUserCenterDto> relationDtoList = mapper.mappingToDtoList(entity.getMUserCenterList());
            dto.setMUserCenterList(relationDtoList);
            if (reverseReference) {
                for (MUserCenterDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMUserLoginList && !entity.getMUserLoginList().isEmpty()) {
            MUserLoginDtoMapper mapper = new MUserLoginDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MUserLoginDto> relationDtoList = mapper.mappingToDtoList(entity.getMUserLoginList());
            dto.setMUserLoginList(relationDtoList);
            if (reverseReference) {
                for (MUserLoginDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMWarehouseList && !entity.getMWarehouseList().isEmpty()) {
            MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MWarehouseDto> relationDtoList = mapper.mappingToDtoList(entity.getMWarehouseList());
            dto.setMWarehouseList(relationDtoList);
            if (reverseReference) {
                for (MWarehouseDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMWebHtInfoList && !entity.getMWebHtInfoList().isEmpty()) {
            MWebHtInfoDtoMapper mapper = new MWebHtInfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MWebHtInfoDto> relationDtoList = mapper.mappingToDtoList(entity.getMWebHtInfoList());
            dto.setMWebHtInfoList(relationDtoList);
            if (reverseReference) {
                for (MWebHtInfoDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTAllocInstHList && !entity.getTAllocInstHList().isEmpty()) {
            TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TAllocInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocInstHList());
            dto.setTAllocInstHList(relationDtoList);
            if (reverseReference) {
                for (TAllocInstHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTCcopamList && !entity.getTCcopamList().isEmpty()) {
            TCcopamDtoMapper mapper = new TCcopamDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TCcopamDto> relationDtoList = mapper.mappingToDtoList(entity.getTCcopamList());
            dto.setTCcopamList(relationDtoList);
            if (reverseReference) {
                for (TCcopamDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTCenterSymbolList && !entity.getTCenterSymbolList().isEmpty()) {
            TCenterSymbolDtoMapper mapper = new TCenterSymbolDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TCenterSymbolDto> relationDtoList = mapper.mappingToDtoList(entity.getTCenterSymbolList());
            dto.setTCenterSymbolList(relationDtoList);
            if (reverseReference) {
                for (TCenterSymbolDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTCordhdrList && !entity.getTCordhdrList().isEmpty()) {
            TCordhdrDtoMapper mapper = new TCordhdrDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TCordhdrDto> relationDtoList = mapper.mappingToDtoList(entity.getTCordhdrList());
            dto.setTCordhdrList(relationDtoList);
            if (reverseReference) {
                for (TCordhdrDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTCsrwhadmList && !entity.getTCsrwhadmList().isEmpty()) {
            TCsrwhadmDtoMapper mapper = new TCsrwhadmDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TCsrwhadmDto> relationDtoList = mapper.mappingToDtoList(entity.getTCsrwhadmList());
            dto.setTCsrwhadmList(relationDtoList);
            if (reverseReference) {
                for (TCsrwhadmDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTEcOrderHList && !entity.getTEcOrderHList().isEmpty()) {
            TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TEcOrderHDto> relationDtoList = mapper.mappingToDtoList(entity.getTEcOrderHList());
            dto.setTEcOrderHList(relationDtoList);
            if (reverseReference) {
                for (TEcOrderHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTInventoryHList && !entity.getTInventoryHList().isEmpty()) {
            TInventoryHDtoMapper mapper = new TInventoryHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TInventoryHDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryHList());
            dto.setTInventoryHList(relationDtoList);
            if (reverseReference) {
                for (TInventoryHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTMflastshiplotList && !entity.getTMflastshiplotList().isEmpty()) {
            TMflastshiplotDtoMapper mapper = new TMflastshiplotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TMflastshiplotDto> relationDtoList = mapper.mappingToDtoList(entity.getTMflastshiplotList());
            dto.setTMflastshiplotList(relationDtoList);
            if (reverseReference) {
                for (TMflastshiplotDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTMoveInstHList && !entity.getTMoveInstHList().isEmpty()) {
            TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TMoveInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTMoveInstHList());
            dto.setTMoveInstHList(relationDtoList);
            if (reverseReference) {
                for (TMoveInstHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTPackingHList && !entity.getTPackingHList().isEmpty()) {
            TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TPackingHDto> relationDtoList = mapper.mappingToDtoList(entity.getTPackingHList());
            dto.setTPackingHList(relationDtoList);
            if (reverseReference) {
                for (TPackingHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTPalletList && !entity.getTPalletList().isEmpty()) {
            TPalletDtoMapper mapper = new TPalletDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TPalletDto> relationDtoList = mapper.mappingToDtoList(entity.getTPalletList());
            dto.setTPalletList(relationDtoList);
            if (reverseReference) {
                for (TPalletDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTPickingHList && !entity.getTPickingHList().isEmpty()) {
            TPickingHDtoMapper mapper = new TPickingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TPickingHDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingHList());
            dto.setTPickingHList(relationDtoList);
            if (reverseReference) {
                for (TPickingHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTPicMthdRcmdList && !entity.getTPicMthdRcmdList().isEmpty()) {
            TPicMthdRcmdDtoMapper mapper = new TPicMthdRcmdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TPicMthdRcmdDto> relationDtoList = mapper.mappingToDtoList(entity.getTPicMthdRcmdList());
            dto.setTPicMthdRcmdList(relationDtoList);
            if (reverseReference) {
                for (TPicMthdRcmdDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTReceivePlanHList && !entity.getTReceivePlanHList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TReceivePlanHDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceivePlanHList());
            dto.setTReceivePlanHList(relationDtoList);
            if (reverseReference) {
                for (TReceivePlanHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTSerialNoList && !entity.getTSerialNoList().isEmpty()) {
            TSerialNoDtoMapper mapper = new TSerialNoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TSerialNoDto> relationDtoList = mapper.mappingToDtoList(entity.getTSerialNoList());
            dto.setTSerialNoList(relationDtoList);
            if (reverseReference) {
                for (TSerialNoDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTShippingInstHList && !entity.getTShippingInstHList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TShippingInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstHList());
            dto.setTShippingInstHList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTSplinfoList && !entity.getTSplinfoList().isEmpty()) {
            TSplinfoDtoMapper mapper = new TSplinfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TSplinfoDto> relationDtoList = mapper.mappingToDtoList(entity.getTSplinfoList());
            dto.setTSplinfoList(relationDtoList);
            if (reverseReference) {
                for (TSplinfoDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTStoreRecordHList && !entity.getTStoreRecordHList().isEmpty()) {
            TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TStoreRecordHDto> relationDtoList = mapper.mappingToDtoList(entity.getTStoreRecordHList());
            dto.setTStoreRecordHList(relationDtoList);
            if (reverseReference) {
                for (TStoreRecordHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrallinvList && !entity.getTTrallinvList().isEmpty()) {
            TTrallinvDtoMapper mapper = new TTrallinvDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrallinvDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrallinvList());
            dto.setTTrallinvList(relationDtoList);
            if (reverseReference) {
                for (TTrallinvDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrallinvhistoryList && !entity.getTTrallinvhistoryList().isEmpty()) {
            TTrallinvhistoryDtoMapper mapper = new TTrallinvhistoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrallinvhistoryDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrallinvhistoryList());
            dto.setTTrallinvhistoryList(relationDtoList);
            if (reverseReference) {
                for (TTrallinvhistoryDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrcaseinventoryList && !entity.getTTrcaseinventoryList().isEmpty()) {
            TTrcaseinventoryDtoMapper mapper = new TTrcaseinventoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrcaseinventoryDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrcaseinventoryList());
            dto.setTTrcaseinventoryList(relationDtoList);
            if (reverseReference) {
                for (TTrcaseinventoryDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrcasenumList && !entity.getTTrcasenumList().isEmpty()) {
            TTrcasenumDtoMapper mapper = new TTrcasenumDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrcasenumDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrcasenumList());
            dto.setTTrcasenumList(relationDtoList);
            if (reverseReference) {
                for (TTrcasenumDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrcasestockList && !entity.getTTrcasestockList().isEmpty()) {
            TTrcasestockDtoMapper mapper = new TTrcasestockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrcasestockDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrcasestockList());
            dto.setTTrcasestockList(relationDtoList);
            if (reverseReference) {
                for (TTrcasestockDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrhanbaiinvList && !entity.getTTrhanbaiinvList().isEmpty()) {
            TTrhanbaiinvDtoMapper mapper = new TTrhanbaiinvDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrhanbaiinvDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrhanbaiinvList());
            dto.setTTrhanbaiinvList(relationDtoList);
            if (reverseReference) {
                for (TTrhanbaiinvDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrinvcheckinfoList && !entity.getTTrinvcheckinfoList().isEmpty()) {
            TTrinvcheckinfoDtoMapper mapper = new TTrinvcheckinfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrinvcheckinfoDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrinvcheckinfoList());
            dto.setTTrinvcheckinfoList(relationDtoList);
            if (reverseReference) {
                for (TTrinvcheckinfoDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrinvcorrectList && !entity.getTTrinvcorrectList().isEmpty()) {
            TTrinvcorrectDtoMapper mapper = new TTrinvcorrectDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrinvcorrectDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrinvcorrectList());
            dto.setTTrinvcorrectList(relationDtoList);
            if (reverseReference) {
                for (TTrinvcorrectDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrinvreanswerList && !entity.getTTrinvreanswerList().isEmpty()) {
            TTrinvreanswerDtoMapper mapper = new TTrinvreanswerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrinvreanswerDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrinvreanswerList());
            dto.setTTrinvreanswerList(relationDtoList);
            if (reverseReference) {
                for (TTrinvreanswerDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrinvrequestList && !entity.getTTrinvrequestList().isEmpty()) {
            TTrinvrequestDtoMapper mapper = new TTrinvrequestDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrinvrequestDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrinvrequestList());
            dto.setTTrinvrequestList(relationDtoList);
            if (reverseReference) {
                for (TTrinvrequestDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTritemconvresultList && !entity.getTTritemconvresultList().isEmpty()) {
            TTritemconvresultDtoMapper mapper = new TTritemconvresultDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTritemconvresultDto> relationDtoList = mapper.mappingToDtoList(entity.getTTritemconvresultList());
            dto.setTTritemconvresultList(relationDtoList);
            if (reverseReference) {
                for (TTritemconvresultDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrjukyuinvList && !entity.getTTrjukyuinvList().isEmpty()) {
            TTrjukyuinvDtoMapper mapper = new TTrjukyuinvDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrjukyuinvDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrjukyuinvList());
            dto.setTTrjukyuinvList(relationDtoList);
            if (reverseReference) {
                for (TTrjukyuinvDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrmanufacturedateList && !entity.getTTrmanufacturedateList().isEmpty()) {
            TTrmanufacturedateDtoMapper mapper = new TTrmanufacturedateDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrmanufacturedateDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrmanufacturedateList());
            dto.setTTrmanufacturedateList(relationDtoList);
            if (reverseReference) {
                for (TTrmanufacturedateDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrmanufacturedatedetailList && !entity.getTTrmanufacturedatedetailList().isEmpty()) {
            TTrmanufacturedatedetailDtoMapper mapper = new TTrmanufacturedatedetailDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrmanufacturedatedetailDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrmanufacturedatedetailList());
            dto.setTTrmanufacturedatedetailList(relationDtoList);
            if (reverseReference) {
                for (TTrmanufacturedatedetailDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrmanufacturedatehistoryList && !entity.getTTrmanufacturedatehistoryList().isEmpty()) {
            TTrmanufacturedatehistoryDtoMapper mapper = new TTrmanufacturedatehistoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrmanufacturedatehistoryDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrmanufacturedatehistoryList());
            dto.setTTrmanufacturedatehistoryList(relationDtoList);
            if (reverseReference) {
                for (TTrmanufacturedatehistoryDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrpallettraceList && !entity.getTTrpallettraceList().isEmpty()) {
            TTrpallettraceDtoMapper mapper = new TTrpallettraceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrpallettraceDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrpallettraceList());
            dto.setTTrpallettraceList(relationDtoList);
            if (reverseReference) {
                for (TTrpallettraceDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrreversestockList && !entity.getTTrreversestockList().isEmpty()) {
            TTrreversestockDtoMapper mapper = new TTrreversestockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrreversestockDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrreversestockList());
            dto.setTTrreversestockList(relationDtoList);
            if (reverseReference) {
                for (TTrreversestockDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrstockdiffhistoryList && !entity.getTTrstockdiffhistoryList().isEmpty()) {
            TTrstockdiffhistoryDtoMapper mapper = new TTrstockdiffhistoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrstockdiffhistoryDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrstockdiffhistoryList());
            dto.setTTrstockdiffhistoryList(relationDtoList);
            if (reverseReference) {
                for (TTrstockdiffhistoryDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrsymboltraceList && !entity.getTTrsymboltraceList().isEmpty()) {
            TTrsymboltraceDtoMapper mapper = new TTrsymboltraceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrsymboltraceDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrsymboltraceList());
            dto.setTTrsymboltraceList(relationDtoList);
            if (reverseReference) {
                for (TTrsymboltraceDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrsymboltraceextendList && !entity.getTTrsymboltraceextendList().isEmpty()) {
            TTrsymboltraceextendDtoMapper mapper = new TTrsymboltraceextendDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrsymboltraceextendDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrsymboltraceextendList());
            dto.setTTrsymboltraceextendList(relationDtoList);
            if (reverseReference) {
                for (TTrsymboltraceextendDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTTrtraceList && !entity.getTTrtraceList().isEmpty()) {
            TTrtraceDtoMapper mapper = new TTrtraceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrtraceDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrtraceList());
            dto.setTTrtraceList(relationDtoList);
            if (reverseReference) {
                for (TTrtraceDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTYtrsoList && !entity.getTYtrsoList().isEmpty()) {
            TYtrsoDtoMapper mapper = new TYtrsoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TYtrsoDto> relationDtoList = mapper.mappingToDtoList(entity.getTYtrsoList());
            dto.setTYtrsoList(relationDtoList);
            if (reverseReference) {
                for (TYtrsoDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtInventoryInputProdList && !entity.getWHtInventoryInputProdList().isEmpty()) {
            WHtInventoryInputProdDtoMapper mapper = new WHtInventoryInputProdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtInventoryInputProdDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtInventoryInputProdList());
            dto.setWHtInventoryInputProdList(relationDtoList);
            if (reverseReference) {
                for (WHtInventoryInputProdDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtLoadingList && !entity.getWHtLoadingList().isEmpty()) {
            WHtLoadingDtoMapper mapper = new WHtLoadingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtLoadingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtLoadingList());
            dto.setWHtLoadingList(relationDtoList);
            if (reverseReference) {
                for (WHtLoadingDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtReceiveInspectionList && !entity.getWHtReceiveInspectionList().isEmpty()) {
            WHtReceiveInspectionDtoMapper mapper = new WHtReceiveInspectionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtReceiveInspectionDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveInspectionList());
            dto.setWHtReceiveInspectionList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveInspectionDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspList && !entity.getWHtReceiveNoPlanInspList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtReceiveNoPlanInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveNoPlanInspList());
            dto.setWHtReceiveNoPlanInspList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInspDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtReceiveStoreList && !entity.getWHtReceiveStoreList().isEmpty()) {
            WHtReceiveStoreDtoMapper mapper = new WHtReceiveStoreDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtReceiveStoreDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveStoreList());
            dto.setWHtReceiveStoreList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveStoreDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtSerialReceiveInspList && !entity.getWHtSerialReceiveInspList().isEmpty()) {
            WHtSerialReceiveInspDtoMapper mapper = new WHtSerialReceiveInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtSerialReceiveInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtSerialReceiveInspList());
            dto.setWHtSerialReceiveInspList(relationDtoList);
            if (reverseReference) {
                for (WHtSerialReceiveInspDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtSerialShippingInspList && !entity.getWHtSerialShippingInspList().isEmpty()) {
            WHtSerialShippingInspDtoMapper mapper = new WHtSerialShippingInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtSerialShippingInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtSerialShippingInspList());
            dto.setWHtSerialShippingInspList(relationDtoList);
            if (reverseReference) {
                for (WHtSerialShippingInspDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtShippingList && !entity.getWHtShippingList().isEmpty()) {
            WHtShippingDtoMapper mapper = new WHtShippingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtShippingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtShippingList());
            dto.setWHtShippingList(relationDtoList);
            if (reverseReference) {
                for (WHtShippingDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtShippingPickingList && !entity.getWHtShippingPickingList().isEmpty()) {
            WHtShippingPickingDtoMapper mapper = new WHtShippingPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtShippingPickingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtShippingPickingList());
            dto.setWHtShippingPickingList(relationDtoList);
            if (reverseReference) {
                for (WHtShippingPickingDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWSglRowShipInspHList && !entity.getWSglRowShipInspHList().isEmpty()) {
            WSglRowShipInspHDtoMapper mapper = new WSglRowShipInspHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WSglRowShipInspHDto> relationDtoList = mapper.mappingToDtoList(entity.getWSglRowShipInspHList());
            dto.setWSglRowShipInspHList(relationDtoList);
            if (reverseReference) {
                for (WSglRowShipInspHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWShippingInterruptList && !entity.getWShippingInterruptList().isEmpty()) {
            WShippingInterruptDtoMapper mapper = new WShippingInterruptDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WShippingInterruptDto> relationDtoList = mapper.mappingToDtoList(entity.getWShippingInterruptList());
            dto.setWShippingInterruptList(relationDtoList);
            if (reverseReference) {
                for (WShippingInterruptDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MCenterDto> mappingToDtoList(List<MCenter> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MCenterDto> dtoList = new ArrayList<MCenterDto>();
        for (MCenter entity : entityList) {
            MCenterDto dto = mappingToDto(entity);
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
    public MCenter mappingToEntity(MCenterDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MCenter)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCenter entity = new MCenter();
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getCenterAbbr(), "centerAbbr")) {
            entity.setCenterAbbr(dto.getCenterAbbr());
        }
        if (needsMapping(dto, dto.getCultureId(), "cultureId")) {
            entity.setCultureId(dto.getCultureId());
        }
        if (needsMapping(dto, dto.getTimeZoneId(), "timeZoneId")) {
            entity.setTimeZoneId(dto.getTimeZoneId());
        }
        if (needsMapping(dto, dto.getWarehousegroup(), "warehousegroup")) {
            entity.setWarehousegroup(dto.getWarehousegroup());
        }
        if (needsMapping(dto, dto.getVirtualwhouseflg(), "virtualwhouseflg")) {
            entity.setVirtualwhouseflg(dto.getVirtualwhouseflg());
        }
        if (needsMapping(dto, dto.getAname(), "aname")) {
            entity.setAname(dto.getAname());
        }
        if (needsMapping(dto, dto.getAddress1(), "address1")) {
            entity.setAddress1(dto.getAddress1());
        }
        if (needsMapping(dto, dto.getAddress2(), "address2")) {
            entity.setAddress2(dto.getAddress2());
        }
        if (needsMapping(dto, dto.getAddress3(), "address3")) {
            entity.setAddress3(dto.getAddress3());
        }
        if (needsMapping(dto, dto.getPostno(), "postno")) {
            entity.setPostno(dto.getPostno());
        }
        if (needsMapping(dto, dto.getCountrycd(), "countrycd")) {
            entity.setCountrycd(dto.getCountrycd());
        }
        if (needsMapping(dto, dto.getPortcd(), "portcd")) {
            entity.setPortcd(dto.getPortcd());
        }
        if (needsMapping(dto, dto.getDistrictcd(), "districtcd")) {
            entity.setDistrictcd(dto.getDistrictcd());
        }
        if (needsMapping(dto, dto.getPhone1(), "phone1")) {
            entity.setPhone1(dto.getPhone1());
        }
        if (needsMapping(dto, dto.getPhone2(), "phone2")) {
            entity.setPhone2(dto.getPhone2());
        }
        if (needsMapping(dto, dto.getFax1(), "fax1")) {
            entity.setFax1(dto.getFax1());
        }
        if (needsMapping(dto, dto.getFax2(), "fax2")) {
            entity.setFax2(dto.getFax2());
        }
        if (needsMapping(dto, dto.getWarehouseflg(), "warehouseflg")) {
            entity.setWarehouseflg(dto.getWarehouseflg());
        }
        if (needsMapping(dto, dto.getRefname(), "refname")) {
            entity.setRefname(dto.getRefname());
        }
        if (needsMapping(dto, dto.getSubcontractflg(), "subcontractflg")) {
            entity.setSubcontractflg(dto.getSubcontractflg());
        }
        if (needsMapping(dto, dto.getWeightcapacity(), "weightcapacity")) {
            entity.setWeightcapacity(dto.getWeightcapacity());
        }
        if (needsMapping(dto, dto.getCapacity(), "capacity")) {
            entity.setCapacity(dto.getCapacity());
        }
        if (needsMapping(dto, dto.getHulftId(), "hulftId")) {
            entity.setHulftId(dto.getHulftId());
        }
        if (needsMapping(dto, dto.getWarehousecls(), "warehousecls")) {
            entity.setWarehousecls(dto.getWarehousecls());
        }
        if (needsMapping(dto, dto.getCmlrasid(), "cmlrasid")) {
            entity.setCmlrasid(dto.getCmlrasid());
        }
        if (needsMapping(dto, dto.getOwnOrAnotherFlg(), "ownOrAnotherFlg")) {
            entity.setOwnOrAnotherFlg(dto.getOwnOrAnotherFlg());
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
        if (!_suppressBTimeZone && dto.getBTimeZone() != null) {
            BTimeZoneDto relationDto = dto.getBTimeZone();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BTimeZone relationEntity = (BTimeZone)cachedEntity;
                entity.setBTimeZone(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCenterList().add(entity);
                }
            } else {
                BTimeZoneDtoMapper mapper = new BTimeZoneDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCenterList();
                BTimeZone relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBTimeZone(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCenterList().add(entity);
                }
                if (instanceCache && entity.getBTimeZone().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBTimeZone());
                }
            }
        };
        if (!_suppressBCulture && dto.getBCulture() != null) {
            BCultureDto relationDto = dto.getBCulture();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BCulture relationEntity = (BCulture)cachedEntity;
                entity.setBCulture(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCenterList().add(entity);
                }
            } else {
                BCultureDtoMapper mapper = new BCultureDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCenterList();
                BCulture relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBCulture(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCenterList().add(entity);
                }
                if (instanceCache && entity.getBCulture().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBCulture());
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
        if (!_suppressMBoxList && !dto.getMBoxList().isEmpty()) {
            MBoxDtoMapper mapper = new MBoxDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MBox> relationEntityList = mapper.mappingToEntityList(dto.getMBoxList());
            entity.setMBoxList(relationEntityList);
            if (reverseReference) {
                for (MBox relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMBoxGrpList && !dto.getMBoxGrpList().isEmpty()) {
            MBoxGrpDtoMapper mapper = new MBoxGrpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MBoxGrp> relationEntityList = mapper.mappingToEntityList(dto.getMBoxGrpList());
            entity.setMBoxGrpList(relationEntityList);
            if (reverseReference) {
                for (MBoxGrp relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCarrierList && !dto.getMCarrierList().isEmpty()) {
            MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrier> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierList());
            entity.setMCarrierList(relationEntityList);
            if (reverseReference) {
                for (MCarrier relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCarrierSlipSgwList && !dto.getMCarrierSlipSgwList().isEmpty()) {
            MCarrierSlipSgwDtoMapper mapper = new MCarrierSlipSgwDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrierSlipSgw> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierSlipSgwList());
            entity.setMCarrierSlipSgwList(relationEntityList);
            if (reverseReference) {
                for (MCarrierSlipSgw relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCarrierSlipYmtList && !dto.getMCarrierSlipYmtList().isEmpty()) {
            MCarrierSlipYmtDtoMapper mapper = new MCarrierSlipYmtDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrierSlipYmt> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierSlipYmtList());
            entity.setMCarrierSlipYmtList(relationEntityList);
            if (reverseReference) {
                for (MCarrierSlipYmt relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCarrierSlipYupkList && !dto.getMCarrierSlipYupkList().isEmpty()) {
            MCarrierSlipYupkDtoMapper mapper = new MCarrierSlipYupkDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrierSlipYupk> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierSlipYupkList());
            entity.setMCarrierSlipYupkList(relationEntityList);
            if (reverseReference) {
                for (MCarrierSlipYupk relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCblkList && !dto.getMCblkList().isEmpty()) {
            MCblkDtoMapper mapper = new MCblkDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCblk> relationEntityList = mapper.mappingToEntityList(dto.getMCblkList());
            entity.setMCblkList(relationEntityList);
            if (reverseReference) {
                for (MCblk relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCbrctgList && !dto.getMCbrctgList().isEmpty()) {
            MCbrctgDtoMapper mapper = new MCbrctgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCbrctg> relationEntityList = mapper.mappingToEntityList(dto.getMCbrctgList());
            entity.setMCbrctgList(relationEntityList);
            if (reverseReference) {
                for (MCbrctg relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCdrcattList && !dto.getMCdrcattList().isEmpty()) {
            MCdrcattDtoMapper mapper = new MCdrcattDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCdrcatt> relationEntityList = mapper.mappingToEntityList(dto.getMCdrcattList());
            entity.setMCdrcattList(relationEntityList);
            if (reverseReference) {
                for (MCdrcatt relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCenterClassList && !dto.getMCenterClassList().isEmpty()) {
            MCenterClassDtoMapper mapper = new MCenterClassDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterClass> relationEntityList = mapper.mappingToEntityList(dto.getMCenterClassList());
            entity.setMCenterClassList(relationEntityList);
            if (reverseReference) {
                for (MCenterClass relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCenterColList && !dto.getMCenterColList().isEmpty()) {
            MCenterColDtoMapper mapper = new MCenterColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterCol> relationEntityList = mapper.mappingToEntityList(dto.getMCenterColList());
            entity.setMCenterColList(relationEntityList);
            if (reverseReference) {
                for (MCenterCol relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCenterCustomerList && !dto.getMCenterCustomerList().isEmpty()) {
            MCenterCustomerDtoMapper mapper = new MCenterCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterCustomer> relationEntityList = mapper.mappingToEntityList(dto.getMCenterCustomerList());
            entity.setMCenterCustomerList(relationEntityList);
            if (reverseReference) {
                for (MCenterCustomer relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCenterItemList && !dto.getMCenterItemList().isEmpty()) {
            MCenterItemDtoMapper mapper = new MCenterItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterItem> relationEntityList = mapper.mappingToEntityList(dto.getMCenterItemList());
            entity.setMCenterItemList(relationEntityList);
            if (reverseReference) {
                for (MCenterItem relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCenterScreenList && !dto.getMCenterScreenList().isEmpty()) {
            MCenterScreenDtoMapper mapper = new MCenterScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterScreen> relationEntityList = mapper.mappingToEntityList(dto.getMCenterScreenList());
            entity.setMCenterScreenList(relationEntityList);
            if (reverseReference) {
                for (MCenterScreen relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMClientCenterList && !dto.getMClientCenterList().isEmpty()) {
            MClientCenterDtoMapper mapper = new MClientCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MClientCenter> relationEntityList = mapper.mappingToEntityList(dto.getMClientCenterList());
            entity.setMClientCenterList(relationEntityList);
            if (reverseReference) {
                for (MClientCenter relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMClinList && !dto.getMClinList().isEmpty()) {
            MClinDtoMapper mapper = new MClinDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MClin> relationEntityList = mapper.mappingToEntityList(dto.getMClinList());
            entity.setMClinList(relationEntityList);
            if (reverseReference) {
                for (MClin relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCorgList && !dto.getMCorgList().isEmpty()) {
            MCorgDtoMapper mapper = new MCorgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCorg> relationEntityList = mapper.mappingToEntityList(dto.getMCorgList());
            entity.setMCorgList(relationEntityList);
            if (reverseReference) {
                for (MCorg relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMDeliveryCourseList && !dto.getMDeliveryCourseList().isEmpty()) {
            MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MDeliveryCourse> relationEntityList = mapper.mappingToEntityList(dto.getMDeliveryCourseList());
            entity.setMDeliveryCourseList(relationEntityList);
            if (reverseReference) {
                for (MDeliveryCourse relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMLocationList && !dto.getMLocationList().isEmpty()) {
            MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MLocation> relationEntityList = mapper.mappingToEntityList(dto.getMLocationList());
            entity.setMLocationList(relationEntityList);
            if (reverseReference) {
                for (MLocation relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMMfinvoperationList && !dto.getMMfinvoperationList().isEmpty()) {
            MMfinvoperationDtoMapper mapper = new MMfinvoperationDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MMfinvoperation> relationEntityList = mapper.mappingToEntityList(dto.getMMfinvoperationList());
            entity.setMMfinvoperationList(relationEntityList);
            if (reverseReference) {
                for (MMfinvoperation relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMMfmonthchgList && !dto.getMMfmonthchgList().isEmpty()) {
            MMfmonthchgDtoMapper mapper = new MMfmonthchgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MMfmonthchg> relationEntityList = mapper.mappingToEntityList(dto.getMMfmonthchgList());
            entity.setMMfmonthchgList(relationEntityList);
            if (reverseReference) {
                for (MMfmonthchg relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMMfstockitemList && !dto.getMMfstockitemList().isEmpty()) {
            MMfstockitemDtoMapper mapper = new MMfstockitemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MMfstockitem> relationEntityList = mapper.mappingToEntityList(dto.getMMfstockitemList());
            entity.setMMfstockitemList(relationEntityList);
            if (reverseReference) {
                for (MMfstockitem relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMMfwhstrctList && !dto.getMMfwhstrctList().isEmpty()) {
            MMfwhstrctDtoMapper mapper = new MMfwhstrctDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MMfwhstrct> relationEntityList = mapper.mappingToEntityList(dto.getMMfwhstrctList());
            entity.setMMfwhstrctList(relationEntityList);
            if (reverseReference) {
                for (MMfwhstrct relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMMfwhxitemList && !dto.getMMfwhxitemList().isEmpty()) {
            MMfwhxitemDtoMapper mapper = new MMfwhxitemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MMfwhxitem> relationEntityList = mapper.mappingToEntityList(dto.getMMfwhxitemList());
            entity.setMMfwhxitemList(relationEntityList);
            if (reverseReference) {
                for (MMfwhxitem relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMNumberingCenterList && !dto.getMNumberingCenterList().isEmpty()) {
            MNumberingCenterDtoMapper mapper = new MNumberingCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MNumberingCenter> relationEntityList = mapper.mappingToEntityList(dto.getMNumberingCenterList());
            entity.setMNumberingCenterList(relationEntityList);
            if (reverseReference) {
                for (MNumberingCenter relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMUserCenterList && !dto.getMUserCenterList().isEmpty()) {
            MUserCenterDtoMapper mapper = new MUserCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MUserCenter> relationEntityList = mapper.mappingToEntityList(dto.getMUserCenterList());
            entity.setMUserCenterList(relationEntityList);
            if (reverseReference) {
                for (MUserCenter relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMUserLoginList && !dto.getMUserLoginList().isEmpty()) {
            MUserLoginDtoMapper mapper = new MUserLoginDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MUserLogin> relationEntityList = mapper.mappingToEntityList(dto.getMUserLoginList());
            entity.setMUserLoginList(relationEntityList);
            if (reverseReference) {
                for (MUserLogin relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMWarehouseList && !dto.getMWarehouseList().isEmpty()) {
            MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MWarehouse> relationEntityList = mapper.mappingToEntityList(dto.getMWarehouseList());
            entity.setMWarehouseList(relationEntityList);
            if (reverseReference) {
                for (MWarehouse relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMWebHtInfoList && !dto.getMWebHtInfoList().isEmpty()) {
            MWebHtInfoDtoMapper mapper = new MWebHtInfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MWebHtInfo> relationEntityList = mapper.mappingToEntityList(dto.getMWebHtInfoList());
            entity.setMWebHtInfoList(relationEntityList);
            if (reverseReference) {
                for (MWebHtInfo relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTAllocInstHList && !dto.getTAllocInstHList().isEmpty()) {
            TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TAllocInstH> relationEntityList = mapper.mappingToEntityList(dto.getTAllocInstHList());
            entity.setTAllocInstHList(relationEntityList);
            if (reverseReference) {
                for (TAllocInstH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTCcopamList && !dto.getTCcopamList().isEmpty()) {
            TCcopamDtoMapper mapper = new TCcopamDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TCcopam> relationEntityList = mapper.mappingToEntityList(dto.getTCcopamList());
            entity.setTCcopamList(relationEntityList);
            if (reverseReference) {
                for (TCcopam relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTCenterSymbolList && !dto.getTCenterSymbolList().isEmpty()) {
            TCenterSymbolDtoMapper mapper = new TCenterSymbolDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TCenterSymbol> relationEntityList = mapper.mappingToEntityList(dto.getTCenterSymbolList());
            entity.setTCenterSymbolList(relationEntityList);
            if (reverseReference) {
                for (TCenterSymbol relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTCordhdrList && !dto.getTCordhdrList().isEmpty()) {
            TCordhdrDtoMapper mapper = new TCordhdrDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TCordhdr> relationEntityList = mapper.mappingToEntityList(dto.getTCordhdrList());
            entity.setTCordhdrList(relationEntityList);
            if (reverseReference) {
                for (TCordhdr relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTCsrwhadmList && !dto.getTCsrwhadmList().isEmpty()) {
            TCsrwhadmDtoMapper mapper = new TCsrwhadmDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TCsrwhadm> relationEntityList = mapper.mappingToEntityList(dto.getTCsrwhadmList());
            entity.setTCsrwhadmList(relationEntityList);
            if (reverseReference) {
                for (TCsrwhadm relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTEcOrderHList && !dto.getTEcOrderHList().isEmpty()) {
            TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TEcOrderH> relationEntityList = mapper.mappingToEntityList(dto.getTEcOrderHList());
            entity.setTEcOrderHList(relationEntityList);
            if (reverseReference) {
                for (TEcOrderH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTInventoryHList && !dto.getTInventoryHList().isEmpty()) {
            TInventoryHDtoMapper mapper = new TInventoryHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TInventoryH> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryHList());
            entity.setTInventoryHList(relationEntityList);
            if (reverseReference) {
                for (TInventoryH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTMflastshiplotList && !dto.getTMflastshiplotList().isEmpty()) {
            TMflastshiplotDtoMapper mapper = new TMflastshiplotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TMflastshiplot> relationEntityList = mapper.mappingToEntityList(dto.getTMflastshiplotList());
            entity.setTMflastshiplotList(relationEntityList);
            if (reverseReference) {
                for (TMflastshiplot relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTMoveInstHList && !dto.getTMoveInstHList().isEmpty()) {
            TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TMoveInstH> relationEntityList = mapper.mappingToEntityList(dto.getTMoveInstHList());
            entity.setTMoveInstHList(relationEntityList);
            if (reverseReference) {
                for (TMoveInstH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTPackingHList && !dto.getTPackingHList().isEmpty()) {
            TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TPackingH> relationEntityList = mapper.mappingToEntityList(dto.getTPackingHList());
            entity.setTPackingHList(relationEntityList);
            if (reverseReference) {
                for (TPackingH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTPalletList && !dto.getTPalletList().isEmpty()) {
            TPalletDtoMapper mapper = new TPalletDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TPallet> relationEntityList = mapper.mappingToEntityList(dto.getTPalletList());
            entity.setTPalletList(relationEntityList);
            if (reverseReference) {
                for (TPallet relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTPickingHList && !dto.getTPickingHList().isEmpty()) {
            TPickingHDtoMapper mapper = new TPickingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TPickingH> relationEntityList = mapper.mappingToEntityList(dto.getTPickingHList());
            entity.setTPickingHList(relationEntityList);
            if (reverseReference) {
                for (TPickingH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTPicMthdRcmdList && !dto.getTPicMthdRcmdList().isEmpty()) {
            TPicMthdRcmdDtoMapper mapper = new TPicMthdRcmdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TPicMthdRcmd> relationEntityList = mapper.mappingToEntityList(dto.getTPicMthdRcmdList());
            entity.setTPicMthdRcmdList(relationEntityList);
            if (reverseReference) {
                for (TPicMthdRcmd relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTReceivePlanHList && !dto.getTReceivePlanHList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TReceivePlanH> relationEntityList = mapper.mappingToEntityList(dto.getTReceivePlanHList());
            entity.setTReceivePlanHList(relationEntityList);
            if (reverseReference) {
                for (TReceivePlanH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTSerialNoList && !dto.getTSerialNoList().isEmpty()) {
            TSerialNoDtoMapper mapper = new TSerialNoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TSerialNo> relationEntityList = mapper.mappingToEntityList(dto.getTSerialNoList());
            entity.setTSerialNoList(relationEntityList);
            if (reverseReference) {
                for (TSerialNo relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTShippingInstHList && !dto.getTShippingInstHList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TShippingInstH> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstHList());
            entity.setTShippingInstHList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTSplinfoList && !dto.getTSplinfoList().isEmpty()) {
            TSplinfoDtoMapper mapper = new TSplinfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TSplinfo> relationEntityList = mapper.mappingToEntityList(dto.getTSplinfoList());
            entity.setTSplinfoList(relationEntityList);
            if (reverseReference) {
                for (TSplinfo relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTStoreRecordHList && !dto.getTStoreRecordHList().isEmpty()) {
            TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TStoreRecordH> relationEntityList = mapper.mappingToEntityList(dto.getTStoreRecordHList());
            entity.setTStoreRecordHList(relationEntityList);
            if (reverseReference) {
                for (TStoreRecordH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrallinvList && !dto.getTTrallinvList().isEmpty()) {
            TTrallinvDtoMapper mapper = new TTrallinvDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrallinv> relationEntityList = mapper.mappingToEntityList(dto.getTTrallinvList());
            entity.setTTrallinvList(relationEntityList);
            if (reverseReference) {
                for (TTrallinv relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrallinvhistoryList && !dto.getTTrallinvhistoryList().isEmpty()) {
            TTrallinvhistoryDtoMapper mapper = new TTrallinvhistoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrallinvhistory> relationEntityList = mapper.mappingToEntityList(dto.getTTrallinvhistoryList());
            entity.setTTrallinvhistoryList(relationEntityList);
            if (reverseReference) {
                for (TTrallinvhistory relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrcaseinventoryList && !dto.getTTrcaseinventoryList().isEmpty()) {
            TTrcaseinventoryDtoMapper mapper = new TTrcaseinventoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrcaseinventory> relationEntityList = mapper.mappingToEntityList(dto.getTTrcaseinventoryList());
            entity.setTTrcaseinventoryList(relationEntityList);
            if (reverseReference) {
                for (TTrcaseinventory relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrcasenumList && !dto.getTTrcasenumList().isEmpty()) {
            TTrcasenumDtoMapper mapper = new TTrcasenumDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrcasenum> relationEntityList = mapper.mappingToEntityList(dto.getTTrcasenumList());
            entity.setTTrcasenumList(relationEntityList);
            if (reverseReference) {
                for (TTrcasenum relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrcasestockList && !dto.getTTrcasestockList().isEmpty()) {
            TTrcasestockDtoMapper mapper = new TTrcasestockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrcasestock> relationEntityList = mapper.mappingToEntityList(dto.getTTrcasestockList());
            entity.setTTrcasestockList(relationEntityList);
            if (reverseReference) {
                for (TTrcasestock relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrhanbaiinvList && !dto.getTTrhanbaiinvList().isEmpty()) {
            TTrhanbaiinvDtoMapper mapper = new TTrhanbaiinvDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrhanbaiinv> relationEntityList = mapper.mappingToEntityList(dto.getTTrhanbaiinvList());
            entity.setTTrhanbaiinvList(relationEntityList);
            if (reverseReference) {
                for (TTrhanbaiinv relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrinvcheckinfoList && !dto.getTTrinvcheckinfoList().isEmpty()) {
            TTrinvcheckinfoDtoMapper mapper = new TTrinvcheckinfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrinvcheckinfo> relationEntityList = mapper.mappingToEntityList(dto.getTTrinvcheckinfoList());
            entity.setTTrinvcheckinfoList(relationEntityList);
            if (reverseReference) {
                for (TTrinvcheckinfo relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrinvcorrectList && !dto.getTTrinvcorrectList().isEmpty()) {
            TTrinvcorrectDtoMapper mapper = new TTrinvcorrectDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrinvcorrect> relationEntityList = mapper.mappingToEntityList(dto.getTTrinvcorrectList());
            entity.setTTrinvcorrectList(relationEntityList);
            if (reverseReference) {
                for (TTrinvcorrect relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrinvreanswerList && !dto.getTTrinvreanswerList().isEmpty()) {
            TTrinvreanswerDtoMapper mapper = new TTrinvreanswerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrinvreanswer> relationEntityList = mapper.mappingToEntityList(dto.getTTrinvreanswerList());
            entity.setTTrinvreanswerList(relationEntityList);
            if (reverseReference) {
                for (TTrinvreanswer relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrinvrequestList && !dto.getTTrinvrequestList().isEmpty()) {
            TTrinvrequestDtoMapper mapper = new TTrinvrequestDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrinvrequest> relationEntityList = mapper.mappingToEntityList(dto.getTTrinvrequestList());
            entity.setTTrinvrequestList(relationEntityList);
            if (reverseReference) {
                for (TTrinvrequest relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTritemconvresultList && !dto.getTTritemconvresultList().isEmpty()) {
            TTritemconvresultDtoMapper mapper = new TTritemconvresultDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTritemconvresult> relationEntityList = mapper.mappingToEntityList(dto.getTTritemconvresultList());
            entity.setTTritemconvresultList(relationEntityList);
            if (reverseReference) {
                for (TTritemconvresult relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrjukyuinvList && !dto.getTTrjukyuinvList().isEmpty()) {
            TTrjukyuinvDtoMapper mapper = new TTrjukyuinvDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrjukyuinv> relationEntityList = mapper.mappingToEntityList(dto.getTTrjukyuinvList());
            entity.setTTrjukyuinvList(relationEntityList);
            if (reverseReference) {
                for (TTrjukyuinv relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrmanufacturedateList && !dto.getTTrmanufacturedateList().isEmpty()) {
            TTrmanufacturedateDtoMapper mapper = new TTrmanufacturedateDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrmanufacturedate> relationEntityList = mapper.mappingToEntityList(dto.getTTrmanufacturedateList());
            entity.setTTrmanufacturedateList(relationEntityList);
            if (reverseReference) {
                for (TTrmanufacturedate relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrmanufacturedatedetailList && !dto.getTTrmanufacturedatedetailList().isEmpty()) {
            TTrmanufacturedatedetailDtoMapper mapper = new TTrmanufacturedatedetailDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrmanufacturedatedetail> relationEntityList = mapper.mappingToEntityList(dto.getTTrmanufacturedatedetailList());
            entity.setTTrmanufacturedatedetailList(relationEntityList);
            if (reverseReference) {
                for (TTrmanufacturedatedetail relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrmanufacturedatehistoryList && !dto.getTTrmanufacturedatehistoryList().isEmpty()) {
            TTrmanufacturedatehistoryDtoMapper mapper = new TTrmanufacturedatehistoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrmanufacturedatehistory> relationEntityList = mapper.mappingToEntityList(dto.getTTrmanufacturedatehistoryList());
            entity.setTTrmanufacturedatehistoryList(relationEntityList);
            if (reverseReference) {
                for (TTrmanufacturedatehistory relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrpallettraceList && !dto.getTTrpallettraceList().isEmpty()) {
            TTrpallettraceDtoMapper mapper = new TTrpallettraceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrpallettrace> relationEntityList = mapper.mappingToEntityList(dto.getTTrpallettraceList());
            entity.setTTrpallettraceList(relationEntityList);
            if (reverseReference) {
                for (TTrpallettrace relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrreversestockList && !dto.getTTrreversestockList().isEmpty()) {
            TTrreversestockDtoMapper mapper = new TTrreversestockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrreversestock> relationEntityList = mapper.mappingToEntityList(dto.getTTrreversestockList());
            entity.setTTrreversestockList(relationEntityList);
            if (reverseReference) {
                for (TTrreversestock relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrstockdiffhistoryList && !dto.getTTrstockdiffhistoryList().isEmpty()) {
            TTrstockdiffhistoryDtoMapper mapper = new TTrstockdiffhistoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrstockdiffhistory> relationEntityList = mapper.mappingToEntityList(dto.getTTrstockdiffhistoryList());
            entity.setTTrstockdiffhistoryList(relationEntityList);
            if (reverseReference) {
                for (TTrstockdiffhistory relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrsymboltraceList && !dto.getTTrsymboltraceList().isEmpty()) {
            TTrsymboltraceDtoMapper mapper = new TTrsymboltraceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrsymboltrace> relationEntityList = mapper.mappingToEntityList(dto.getTTrsymboltraceList());
            entity.setTTrsymboltraceList(relationEntityList);
            if (reverseReference) {
                for (TTrsymboltrace relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrsymboltraceextendList && !dto.getTTrsymboltraceextendList().isEmpty()) {
            TTrsymboltraceextendDtoMapper mapper = new TTrsymboltraceextendDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrsymboltraceextend> relationEntityList = mapper.mappingToEntityList(dto.getTTrsymboltraceextendList());
            entity.setTTrsymboltraceextendList(relationEntityList);
            if (reverseReference) {
                for (TTrsymboltraceextend relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTTrtraceList && !dto.getTTrtraceList().isEmpty()) {
            TTrtraceDtoMapper mapper = new TTrtraceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TTrtrace> relationEntityList = mapper.mappingToEntityList(dto.getTTrtraceList());
            entity.setTTrtraceList(relationEntityList);
            if (reverseReference) {
                for (TTrtrace relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTYtrsoList && !dto.getTYtrsoList().isEmpty()) {
            TYtrsoDtoMapper mapper = new TYtrsoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TYtrso> relationEntityList = mapper.mappingToEntityList(dto.getTYtrsoList());
            entity.setTYtrsoList(relationEntityList);
            if (reverseReference) {
                for (TYtrso relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtInventoryInputProdList && !dto.getWHtInventoryInputProdList().isEmpty()) {
            WHtInventoryInputProdDtoMapper mapper = new WHtInventoryInputProdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtInventoryInputProd> relationEntityList = mapper.mappingToEntityList(dto.getWHtInventoryInputProdList());
            entity.setWHtInventoryInputProdList(relationEntityList);
            if (reverseReference) {
                for (WHtInventoryInputProd relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtLoadingList && !dto.getWHtLoadingList().isEmpty()) {
            WHtLoadingDtoMapper mapper = new WHtLoadingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtLoading> relationEntityList = mapper.mappingToEntityList(dto.getWHtLoadingList());
            entity.setWHtLoadingList(relationEntityList);
            if (reverseReference) {
                for (WHtLoading relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtReceiveInspectionList && !dto.getWHtReceiveInspectionList().isEmpty()) {
            WHtReceiveInspectionDtoMapper mapper = new WHtReceiveInspectionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtReceiveInspection> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveInspectionList());
            entity.setWHtReceiveInspectionList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveInspection relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspList && !dto.getWHtReceiveNoPlanInspList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtReceiveNoPlanInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveNoPlanInspList());
            entity.setWHtReceiveNoPlanInspList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInsp relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtReceiveStoreList && !dto.getWHtReceiveStoreList().isEmpty()) {
            WHtReceiveStoreDtoMapper mapper = new WHtReceiveStoreDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtReceiveStore> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveStoreList());
            entity.setWHtReceiveStoreList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveStore relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtSerialReceiveInspList && !dto.getWHtSerialReceiveInspList().isEmpty()) {
            WHtSerialReceiveInspDtoMapper mapper = new WHtSerialReceiveInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtSerialReceiveInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtSerialReceiveInspList());
            entity.setWHtSerialReceiveInspList(relationEntityList);
            if (reverseReference) {
                for (WHtSerialReceiveInsp relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtSerialShippingInspList && !dto.getWHtSerialShippingInspList().isEmpty()) {
            WHtSerialShippingInspDtoMapper mapper = new WHtSerialShippingInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtSerialShippingInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtSerialShippingInspList());
            entity.setWHtSerialShippingInspList(relationEntityList);
            if (reverseReference) {
                for (WHtSerialShippingInsp relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtShippingList && !dto.getWHtShippingList().isEmpty()) {
            WHtShippingDtoMapper mapper = new WHtShippingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtShipping> relationEntityList = mapper.mappingToEntityList(dto.getWHtShippingList());
            entity.setWHtShippingList(relationEntityList);
            if (reverseReference) {
                for (WHtShipping relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtShippingPickingList && !dto.getWHtShippingPickingList().isEmpty()) {
            WHtShippingPickingDtoMapper mapper = new WHtShippingPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtShippingPicking> relationEntityList = mapper.mappingToEntityList(dto.getWHtShippingPickingList());
            entity.setWHtShippingPickingList(relationEntityList);
            if (reverseReference) {
                for (WHtShippingPicking relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWSglRowShipInspHList && !dto.getWSglRowShipInspHList().isEmpty()) {
            WSglRowShipInspHDtoMapper mapper = new WSglRowShipInspHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WSglRowShipInspH> relationEntityList = mapper.mappingToEntityList(dto.getWSglRowShipInspHList());
            entity.setWSglRowShipInspHList(relationEntityList);
            if (reverseReference) {
                for (WSglRowShipInspH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWShippingInterruptList && !dto.getWShippingInterruptList().isEmpty()) {
            WShippingInterruptDtoMapper mapper = new WShippingInterruptDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WShippingInterrupt> relationEntityList = mapper.mappingToEntityList(dto.getWShippingInterruptList());
            entity.setWShippingInterruptList(relationEntityList);
            if (reverseReference) {
                for (WShippingInterrupt relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
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
    protected boolean needsMapping(MCenterDto dto, Object value, String propName) {
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
    public List<MCenter> mappingToEntityList(List<MCenterDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MCenter> entityList = new ArrayList<MCenter>();
        for (MCenterDto dto : dtoList) {
            MCenter entity = mappingToEntity(dto);
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
    public void suppressBTimeZone() {
        _suppressBTimeZone = true;
    }
    public void suppressBCulture() {
        _suppressBCulture = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressMBoxList() {
        _suppressMBoxList = true;
    }
    public void suppressMBoxGrpList() {
        _suppressMBoxGrpList = true;
    }
    public void suppressMCarrierList() {
        _suppressMCarrierList = true;
    }
    public void suppressMCarrierSlipSgwList() {
        _suppressMCarrierSlipSgwList = true;
    }
    public void suppressMCarrierSlipYmtList() {
        _suppressMCarrierSlipYmtList = true;
    }
    public void suppressMCarrierSlipYupkList() {
        _suppressMCarrierSlipYupkList = true;
    }
    public void suppressMCblkList() {
        _suppressMCblkList = true;
    }
    public void suppressMCbrctgList() {
        _suppressMCbrctgList = true;
    }
    public void suppressMCdrcattList() {
        _suppressMCdrcattList = true;
    }
    public void suppressMCenterClassList() {
        _suppressMCenterClassList = true;
    }
    public void suppressMCenterColList() {
        _suppressMCenterColList = true;
    }
    public void suppressMCenterCustomerList() {
        _suppressMCenterCustomerList = true;
    }
    public void suppressMCenterItemList() {
        _suppressMCenterItemList = true;
    }
    public void suppressMCenterScreenList() {
        _suppressMCenterScreenList = true;
    }
    public void suppressMClientCenterList() {
        _suppressMClientCenterList = true;
    }
    public void suppressMClinList() {
        _suppressMClinList = true;
    }
    public void suppressMCorgList() {
        _suppressMCorgList = true;
    }
    public void suppressMDeliveryCourseList() {
        _suppressMDeliveryCourseList = true;
    }
    public void suppressMLocationList() {
        _suppressMLocationList = true;
    }
    public void suppressMMfinvoperationList() {
        _suppressMMfinvoperationList = true;
    }
    public void suppressMMfmonthchgList() {
        _suppressMMfmonthchgList = true;
    }
    public void suppressMMfstockitemList() {
        _suppressMMfstockitemList = true;
    }
    public void suppressMMfwhstrctList() {
        _suppressMMfwhstrctList = true;
    }
    public void suppressMMfwhxitemList() {
        _suppressMMfwhxitemList = true;
    }
    public void suppressMNumberingCenterList() {
        _suppressMNumberingCenterList = true;
    }
    public void suppressMUserCenterList() {
        _suppressMUserCenterList = true;
    }
    public void suppressMUserLoginList() {
        _suppressMUserLoginList = true;
    }
    public void suppressMWarehouseList() {
        _suppressMWarehouseList = true;
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
    public void suppressTCsrwhadmList() {
        _suppressTCsrwhadmList = true;
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
        suppressBTimeZone();
        suppressBCulture();
        suppressBClassDtlByDelFlg();
        suppressMBoxList();
        suppressMBoxGrpList();
        suppressMCarrierList();
        suppressMCarrierSlipSgwList();
        suppressMCarrierSlipYmtList();
        suppressMCarrierSlipYupkList();
        suppressMCblkList();
        suppressMCbrctgList();
        suppressMCdrcattList();
        suppressMCenterClassList();
        suppressMCenterColList();
        suppressMCenterCustomerList();
        suppressMCenterItemList();
        suppressMCenterScreenList();
        suppressMClientCenterList();
        suppressMClinList();
        suppressMCorgList();
        suppressMDeliveryCourseList();
        suppressMLocationList();
        suppressMMfinvoperationList();
        suppressMMfmonthchgList();
        suppressMMfstockitemList();
        suppressMMfwhstrctList();
        suppressMMfwhxitemList();
        suppressMNumberingCenterList();
        suppressMUserCenterList();
        suppressMUserLoginList();
        suppressMWarehouseList();
        suppressMWebHtInfoList();
        suppressTAllocInstHList();
        suppressTCcopamList();
        suppressTCenterSymbolList();
        suppressTCordhdrList();
        suppressTCsrwhadmList();
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
        _suppressBTimeZone = false;
        _suppressBCulture = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressMBoxList = false;
        _suppressMBoxGrpList = false;
        _suppressMCarrierList = false;
        _suppressMCarrierSlipSgwList = false;
        _suppressMCarrierSlipYmtList = false;
        _suppressMCarrierSlipYupkList = false;
        _suppressMCblkList = false;
        _suppressMCbrctgList = false;
        _suppressMCdrcattList = false;
        _suppressMCenterClassList = false;
        _suppressMCenterColList = false;
        _suppressMCenterCustomerList = false;
        _suppressMCenterItemList = false;
        _suppressMCenterScreenList = false;
        _suppressMClientCenterList = false;
        _suppressMClinList = false;
        _suppressMCorgList = false;
        _suppressMDeliveryCourseList = false;
        _suppressMLocationList = false;
        _suppressMMfinvoperationList = false;
        _suppressMMfmonthchgList = false;
        _suppressMMfstockitemList = false;
        _suppressMMfwhstrctList = false;
        _suppressMMfwhxitemList = false;
        _suppressMNumberingCenterList = false;
        _suppressMUserCenterList = false;
        _suppressMUserLoginList = false;
        _suppressMWarehouseList = false;
        _suppressMWebHtInfoList = false;
        _suppressTAllocInstHList = false;
        _suppressTCcopamList = false;
        _suppressTCenterSymbolList = false;
        _suppressTCordhdrList = false;
        _suppressTCsrwhadmList = false;
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
    public MCenterDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MCenterDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MCenterDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MCenterDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MCenterDtoMapper reverseReference() {
        setReverseReference(true);
        return (MCenterDtoMapper)this;
    }
}
