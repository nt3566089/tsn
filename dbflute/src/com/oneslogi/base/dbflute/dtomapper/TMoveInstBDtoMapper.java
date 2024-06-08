package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;
import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TMoveInstBDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTMoveInstBDtoMapper;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;

/**
 * The DTO mapper of T_MOVE_INST_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TMoveInstBDtoMapper extends BsTMoveInstBDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public TMoveInstBDtoMapper() {
    }

    public TMoveInstBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

	@Override
	public TMoveInstBDto mappingToDto(TMoveInstB input) {
		TMoveInstBDto output = super.mappingToDto(input);

		if (output != null) {
			output.setLocationCdFrom(input.getLocationCdFrom());
			output.setLocationCdTo(input.getLocationCdTo());
			output.setLimitDtFrom(input.getLimitDtFrom());
			output.setLimitDtTo(input.getLimitDtTo());
			output.setStoreDtFrom(input.getStoreDtFrom());
			output.setStoreDtTo(input.getStoreDtTo());
		}

		return output;
	}

	@Override
	public TMoveInstB mappingToEntity(TMoveInstBDto input) {
		TMoveInstB output = super.mappingToEntity(input);

		if (output != null) {
			output.setLocationCdFrom(input.getLocationCdFrom());
			output.setLocationCdTo(input.getLocationCdTo());
			output.setLimitDtFrom(input.getLimitDtFrom());
			output.setLimitDtTo(input.getLimitDtTo());
			output.setStoreDtFrom(input.getStoreDtFrom());
			output.setStoreDtTo(input.getStoreDtTo());
		}

		return output;
	}
}
