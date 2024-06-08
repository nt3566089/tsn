package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.BInfoDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsBInfoDtoMapper;
import com.oneslogi.base.dbflute.exentity.BInfo;

/**
 * The DTO mapper of B_INFO.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BInfoDtoMapper extends BsBInfoDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public BInfoDtoMapper() {
    }

    public BInfoDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
	@Override
	public BInfo mappingToEntity(BInfoDto input) {
		BInfo output = super.mappingToEntity(input);

		if (output != null) {
			output.setInfoDtFrom(input.getInfoDtFrom());
			output.setInfoDtTo(input.getInfoDtTo());
			output.setInfoEnd(input.getInfoEnd());

		}

		return output;
	}
}
