package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TLastLotDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTLastLotDtoMapper;
import com.oneslogi.base.dbflute.exentity.TLastLot;

/**
 * The DTO mapper of T_LAST_LOT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TLastLotDtoMapper extends BsTLastLotDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public TLastLotDtoMapper() {
    }

    public TLastLotDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
   	@Override
   	public TLastLot mappingToEntity(TLastLotDto input) {
   		TLastLot output = super.mappingToEntity(input);

   		if (output != null) {
   			output.setShippingDt(input.getShippingDt());
   		}

   		return output;
   	}
	@Override
	public TLastLotDto mappingToDto(TLastLot input) {
		TLastLotDto output = super.mappingToDto(input);

		if (output != null) {
			output.setShippingDt(input.getShippingDt());
		}

		return output;
	}
}
