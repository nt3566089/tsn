package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.MClientCenterDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsMClientCenterDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClientCenter;

/**
 * The DTO mapper of M_CLIENT_CENTER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MClientCenterDtoMapper extends BsMClientCenterDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public MClientCenterDtoMapper() {
    }

    public MClientCenterDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

    @Override
	public MClientCenterDto mappingToDto(MClientCenter input) {
    	MClientCenterDto output = super.mappingToDto(input);

		if (output != null) {
			output.setSystemDateAdd(input.getSystemDateAdd());
			output.setLineNo(input.getLineNo());
		}

		return output;
	}

	@Override
	public MClientCenter mappingToEntity(MClientCenterDto input) {
		MClientCenter output = super.mappingToEntity(input);

		if (output != null) {
			output.setSystemDateAdd(input.getSystemDateAdd());
			output.setLineNo(input.getLineNo());
		}

		return output;
	}
}
