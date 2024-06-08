package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.BRoleGrpDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsBRoleGrpDtoMapper;
import com.oneslogi.base.dbflute.exentity.BRoleGrp;

/**
 * The DTO mapper of b_role_grp.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BRoleGrpDtoMapper extends BsBRoleGrpDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public BRoleGrpDtoMapper() {
    }

    public BRoleGrpDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
    @Override
	public BRoleGrpDto mappingToDto(BRoleGrp input) {
    	BRoleGrpDto output = super.mappingToDto(input);

		if (output != null) {
			output.setDictName(input.getDictName());
		}

		return output;
	}

	@Override
	public BRoleGrp mappingToEntity(BRoleGrpDto input) {
		BRoleGrp output = super.mappingToEntity(input);

		if (output != null) {
			output.setDictName(input.getDictName());
		}

		return output;
	}
}
