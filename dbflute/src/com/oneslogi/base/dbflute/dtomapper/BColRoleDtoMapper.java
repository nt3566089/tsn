package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.BColRoleDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsBColRoleDtoMapper;
import com.oneslogi.base.dbflute.exentity.BColRole;

/**
 * The DTO mapper of B_COL_ROLE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BColRoleDtoMapper extends BsBColRoleDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public BColRoleDtoMapper() {
	}

	public BColRoleDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public BColRoleDto mappingToDto(BColRole input) {
		BColRoleDto output = super.mappingToDto(input);
		if (output != null) {
			output.setScreenCd(input.getScreenCd());
			output.setItemCd(input.getItemCd());
			output.setRoleCd(input.getRoleCd());
		}

		return output;
	}

	@Override
	public BColRole mappingToEntity(BColRoleDto input) {
		BColRole output = super.mappingToEntity(input);
		if (output != null) {
			output.setScreenCd(input.getScreenCd());
			output.setItemCd(input.getItemCd());
			output.setRoleCd(input.getRoleCd());
		}

		return output;
	}
}
