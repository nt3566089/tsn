package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.BLogDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsBLogDtoMapper;
import com.oneslogi.base.dbflute.exentity.BLog;

/**
 * The DTO mapper of B_LOG.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BLogDtoMapper extends BsBLogDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public BLogDtoMapper() {
    }

    public BLogDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

    @Override
	public BLogDto mappingToDto(BLog input) {
    	BLogDto output = super.mappingToDto(input);

		if (output != null) {
			output.setProcessDtFrom(input.getProcessDtFrom());
			output.setProcessDtTo(input.getProcessDtTo());
			output.setPgm(input.getPgm());
		}

		return output;
	}
	@Override
	public BLog mappingToEntity(BLogDto input) {
		BLog output = super.mappingToEntity(input);

		if (output != null) {
			output.setProcessDtFrom(input.getProcessDtFrom());
			output.setProcessDtTo(input.getProcessDtTo());
			output.setPgm(input.getPgm());
		}
		return output;
	}
}
