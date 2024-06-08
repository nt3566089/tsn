package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsMLocationDtoMapper;
import com.oneslogi.base.dbflute.exentity.MLocation;

/**
 * The DTO mapper of M_LOCATION.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MLocationDtoMapper extends BsMLocationDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public MLocationDtoMapper() {
    }

    public MLocationDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

    @Override
	public MLocationDto mappingToDto(MLocation entity) {
		MLocationDto mLocationDto = super.mappingToDto(entity);

		if (mLocationDto != null) {
			mLocationDto.setLocationCdFrom(entity.getLocationCdFrom());
			mLocationDto.setLocationCdTo(entity.getLocationCdTo());
		}

		return mLocationDto;
	}

	@Override
	public MLocation mappingToEntity(MLocationDto dto) {
		MLocation mLocation = super.mappingToEntity(dto);

		if (mLocation != null) {
			mLocation.setLocationCdFrom(dto.getLocationCdFrom());
			mLocation.setLocationCdTo(dto.getLocationCdTo());
		}

		return mLocation;
	}
}
