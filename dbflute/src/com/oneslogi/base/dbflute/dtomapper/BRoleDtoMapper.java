package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.BRoleDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsBRoleDtoMapper;
import com.oneslogi.base.dbflute.exentity.BRole;

/**
 * The DTO mapper of B_ROLE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BRoleDtoMapper extends BsBRoleDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public BRoleDtoMapper() {
    }

    public BRoleDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
    @Override
   	public BRoleDto mappingToDto(BRole input) {
    	BRoleDto output = super.mappingToDto(input);

   		if (output != null) {
   			output.setDictName(input.getDictName());
   		}

   		return output;
   	}

   	@Override
   	public BRole mappingToEntity(BRoleDto input) {
   		BRole output = super.mappingToEntity(input);

   		if (output != null) {
   			output.setDictName(input.getDictName());
   		}

   		return output;
   	}
}
