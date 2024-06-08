package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsMDeliveryCourseDtoMapper;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;

/**
 * The DTO mapper of M_DELIVERY_COURSE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MDeliveryCourseDtoMapper extends BsMDeliveryCourseDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public MDeliveryCourseDtoMapper() {
    }

    public MDeliveryCourseDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

	// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015.01.30 kawana Start
	@Override
	public MDeliveryCourseDto mappingToDto(MDeliveryCourse entity) {
		MDeliveryCourseDto dto = super.mappingToDto(entity);

		if (dto != null) {
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
//			dto.setTagType(entity.getTagType());
			dto.setSlipTagType(entity.getSlipTagType());
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
		}

		return dto;
	}

	@Override
	public MDeliveryCourse mappingToEntity(MDeliveryCourseDto dto) {
		MDeliveryCourse entity = super.mappingToEntity(dto);

		if (entity != null) {
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
//			entity.setTagType(dto.getTagType());
			entity.setSlipTagType(dto.getSlipTagType());
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
		}

		return entity;
	}
	// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015.01.30 kawana End
}
