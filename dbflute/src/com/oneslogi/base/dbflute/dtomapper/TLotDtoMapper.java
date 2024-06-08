package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTLotDtoMapper;
import com.oneslogi.base.dbflute.exentity.TLot;

/**
 * The DTO mapper of T_LOT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TLotDtoMapper extends BsTLotDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public TLotDtoMapper() {
    }

    public TLotDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

	@Override
	public TLotDto mappingToDto(TLot entity) {
		TLotDto tLotDto = super.mappingToDto(entity);

		if (tLotDto != null) {
			tLotDto.setLimitDtFrom(entity.getLimitDtFrom());
			tLotDto.setLimitDtTo(entity.getLimitDtTo());
		}

		return tLotDto;
	}

	@Override
	public TLot mappingToEntity(TLotDto dto) {
		TLot tLot = super.mappingToEntity(dto);

		if (tLot != null) {
			tLot.setLimitDtFrom(dto.getLimitDtFrom());
			tLot.setLimitDtTo(dto.getLimitDtTo());
		}

		return tLot;
	}
}
