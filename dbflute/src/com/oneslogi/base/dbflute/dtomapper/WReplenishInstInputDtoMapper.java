package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.WReplenishInstInputDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsWReplenishInstInputDtoMapper;
import com.oneslogi.base.dbflute.exentity.WReplenishInstInput;

/**
 * The DTO mapper of W_REPLENISH_INST_INPUT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WReplenishInstInputDtoMapper extends BsWReplenishInstInputDtoMapper {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    public WReplenishInstInputDtoMapper() {
    }

    public WReplenishInstInputDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
    
    @Override
	public WReplenishInstInputDto mappingToDto(WReplenishInstInput entity) {
    	WReplenishInstInputDto wReplenishInstInputDto = super.mappingToDto(entity);

		if (wReplenishInstInputDto != null) {
			wReplenishInstInputDto.setmCenterDto(entity.getmCenterDto());
			wReplenishInstInputDto.setmClientDto(entity.getmClientDto());
			wReplenishInstInputDto.setErrorProcessMet(entity.getErrorProcessMet());
			wReplenishInstInputDto.setChkErrorShow(entity.getChkErrorShow());
		}

		return wReplenishInstInputDto;
	}

	@Override
	public WReplenishInstInput mappingToEntity(WReplenishInstInputDto dto) {
		WReplenishInstInput wReplenishInstInput = super.mappingToEntity(dto);

		if (wReplenishInstInput != null) {
			wReplenishInstInput.setmCenterDto(dto.getmCenterDto());
			wReplenishInstInput.setmClientDto(dto.getmClientDto());
			wReplenishInstInput.setErrorProcessMet(dto.getErrorProcessMet());
			wReplenishInstInput.setChkErrorShow(dto.getChkErrorShow());
		}

		return wReplenishInstInput;
	}
}
