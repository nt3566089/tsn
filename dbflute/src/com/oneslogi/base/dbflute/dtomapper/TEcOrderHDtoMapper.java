package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TEcOrderHDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTEcOrderHDtoMapper;
import com.oneslogi.base.dbflute.exentity.TEcOrderH;

/**
 * The DTO mapper of t_ec_order_h.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TEcOrderHDtoMapper extends BsTEcOrderHDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public TEcOrderHDtoMapper() {
	}

	public TEcOrderHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public TEcOrderHDto mappingToDto(TEcOrderH entity) {
		TEcOrderHDto dto = super.mappingToDto(entity);

		if (dto != null) {
			dto.setDtCls(entity.getDtCls());
			dto.setDtFrom(entity.getDtFrom());
			dto.setDtTo(entity.getDtTo());
			dto.setProductShippingStopFlg(entity.getProductShippingStopFlg());
			dto.setAllocNgFlg(entity.getAllocNgFlg());
			dto.setReportCd(entity.getReportCd());
			dto.setIsMessageOutPutFlg(entity.getIsMessageOutPutFlg());
			dto.setIsOtherWarehouse(entity.getIsOtherWarehouse());
			dto.setCancelDisplay(entity.getCancelDisplay());
			dto.setMergeFlg(entity.getMergeFlg());
			dto.setMergeIdForDisplay(entity.getMergeIdForDisplay());
			dto.setCommentFlg(entity.getCommentFlg());
		}

		return dto;
	}

	@Override
	public TEcOrderH mappingToEntity(TEcOrderHDto dto) {
		TEcOrderH entity = super.mappingToEntity(dto);

		if (entity != null) {
			entity.setDtCls(dto.getDtCls());
			entity.setDtFrom(dto.getDtFrom());
			entity.setDtTo(dto.getDtTo());
			entity.setProductShippingStopFlg(dto.getProductShippingStopFlg());
			entity.setAllocNgFlg(dto.getAllocNgFlg());
			entity.setReportCd(dto.getReportCd());
			entity.setIsMessageOutPutFlg(dto.getIsMessageOutPutFlg());
			entity.setIsOtherWarehouse(dto.getIsOtherWarehouse());
			entity.setCancelDisplay(dto.getCancelDisplay());
			entity.setMergeFlg(dto.getMergeFlg());
			entity.setMergeIdForDisplay(dto.getMergeIdForDisplay());
			entity.setCommentFlg(dto.getCommentFlg());
		}

		return entity;
	}

}
