package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.BClassGrpDtlDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsBClassGrpDtlDtoMapper;
import com.oneslogi.base.dbflute.exentity.BClassGrpDtl;

/**
 * The DTO mapper of b_class_grp_dtl.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BClassGrpDtlDtoMapper extends BsBClassGrpDtlDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public BClassGrpDtlDtoMapper() {
    }

    public BClassGrpDtlDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

	@Override
	public BClassGrpDtlDto mappingToDto(BClassGrpDtl input) {
		BClassGrpDtlDto output = super.mappingToDto(input);

		if (output != null) {
			output.setSelectFlg(input.getSelectFlg());
		}

		return output;
	}

	@Override
	public BClassGrpDtl mappingToEntity(BClassGrpDtlDto input) {
		BClassGrpDtl output = super.mappingToEntity(input);

		if (output != null) {
			output.setSelectFlg(input.getSelectFlg());
		}

		return output;
	}
}
