package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.BUserDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsBUserDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;

/**
 * The DTO mapper of B_USER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BUserDtoMapper extends BsBUserDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public BUserDtoMapper() {
    }

    public BUserDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

    @Override
	public BUserDto mappingToDto(BUser input) {
    	BUserDto output = super.mappingToDto(input);

		if (output != null) {
			output.setCultureNm(input.getCultureNm());
			output.setRoleGrpNm(input.getRoleGrpNm());
			output.setDelFlgNm(input.getDelFlgNm());
		}

		return output;
	}
}
