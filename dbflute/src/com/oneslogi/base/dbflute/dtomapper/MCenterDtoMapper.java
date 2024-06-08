package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsMCenterDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;

/**
 * The DTO mapper of M_CENTER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MCenterDtoMapper extends BsMCenterDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public MCenterDtoMapper() {
	}

	public MCenterDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public MCenterDto mappingToDto(MCenter input) {
		MCenterDto output = super.mappingToDto(input);

		if (output != null) {
			output.setCenterCheckBox(input.getCenterCheckBox());
			output.setStockNum(input.getStockNum());
			output.setExpiredStockNum(input.getExpiredStockNum());
		}

		return output;
	}

	@Override
	public MCenter mappingToEntity(MCenterDto input) {
		MCenter output = super.mappingToEntity(input);

		if (output != null) {
			output.setCenterCheckBox(input.getCenterCheckBox());
			output.setStockNum(input.getStockNum());
			output.setExpiredStockNum(input.getExpiredStockNum());
		}
		return output;
	}
}
