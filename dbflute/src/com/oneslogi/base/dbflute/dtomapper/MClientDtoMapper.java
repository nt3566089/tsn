package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsMClientDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;

/**
 * The DTO mapper of M_CLIENT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MClientDtoMapper extends BsMClientDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public MClientDtoMapper() {
    }

    public MClientDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

    @Override
	public MClientDto mappingToDto(MClient input) {
    	MClientDto output = super.mappingToDto(input);

		if (output != null) {
			output.setClientCheckBox(input.getClientCheckBox());
		}

		return output;
	}

    @Override
	public MClient mappingToEntity(MClientDto input) {
    	MClient output = super.mappingToEntity(input);

		if (output != null) {
			output.setClientCheckBox(input.getClientCheckBox());
		}
		return output;
	}
}
