package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.BDictDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsBDictDtoMapper;
import com.oneslogi.base.dbflute.exentity.BDict;

/**
 * The DTO mapper of B_DICT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BDictDtoMapper extends BsBDictDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public BDictDtoMapper() {
    }

    public BDictDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

    @Override
	public BDictDto mappingToDto(BDict input) {
    	BDictDto output = super.mappingToDto(input);

		if (output != null) {
			output.setCultureCd(input.getCultureCd());
			output.setDictCultureNm(input.getDictCultureNm());
		}

		return output;
	}

	@Override
	public BDict mappingToEntity(BDictDto input) {
		BDict output = super.mappingToEntity(input);

		if (output != null) {
			output.setCultureCd(input.getCultureCd());
			output.setDictCultureNm(input.getDictCultureNm());
		}

		return output;
	}
}
