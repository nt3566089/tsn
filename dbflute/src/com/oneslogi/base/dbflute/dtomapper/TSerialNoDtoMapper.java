package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TSerialNoDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTSerialNoDtoMapper;
import com.oneslogi.base.dbflute.exentity.TSerialNo;

/**
 * The DTO mapper of t_serial_no.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TSerialNoDtoMapper extends BsTSerialNoDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public TSerialNoDtoMapper() {
    }

    public TSerialNoDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

	@Override
	public TSerialNoDto mappingToDto(TSerialNo input) {
		TSerialNoDto output = super.mappingToDto(input);

		if (output != null) {
			output.setSerialNoFrom(input.getSerialNoFrom());//シリアルNo.(From)
			output.setSerialNoTo(input.getSerialNoTo());//シリアルNo.(To)
			output.setReceiveDtFrom(input.getReceiveDtFrom());//入荷日(From)
			output.setReceiveDtTo(input.getReceiveDtTo());//入荷日(To)
			output.setShippingDtFrom(input.getShippingDtFrom());//出荷日(From)
			output.setShippingDtTo(input.getShippingDtTo());//出荷日(To)
		}

		return output;
	}

	@Override
	public TSerialNo mappingToEntity(TSerialNoDto input) {
		TSerialNo output = super.mappingToEntity(input);

		if (output != null) {
			output.setSerialNoFrom(input.getSerialNoFrom());//シリアルNo.(From)
			output.setSerialNoTo(input.getSerialNoTo());//シリアルNo.(To)
			output.setReceiveDtFrom(input.getReceiveDtFrom());//入荷日(From)
			output.setReceiveDtTo(input.getReceiveDtTo());//入荷日(To)
			output.setShippingDtFrom(input.getShippingDtFrom());//出荷日(From)
			output.setShippingDtTo(input.getShippingDtTo());//出荷日(To)
		}

		return output;
	}
}
