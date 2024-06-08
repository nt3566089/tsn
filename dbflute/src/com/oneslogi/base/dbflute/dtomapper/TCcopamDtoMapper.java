package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TCcopamDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTCcopamDtoMapper;
import com.oneslogi.base.dbflute.exentity.TCcopam;

/**
 * The DTO mapper of T_CCOPAM.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TCcopamDtoMapper extends BsTCcopamDtoMapper {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    public TCcopamDtoMapper() {
    }

    public TCcopamDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
    
    @Override
	public TCcopamDto mappingToDto(TCcopam entity) {
    	TCcopamDto dto = super.mappingToDto(entity);

		if (dto != null) {
			dto.setWarehouseCls(entity.getWarehouseCls());
			dto.setCenterCd(entity.getCenterCd());
			dto.setClientCd(entity.getClientCd());
			dto.setSum(entity.getSum());
			dto.setNo(entity.getNo());
			dto.setLanding(entity.getLanding());
			dto.setRcvSumQty1Pallet(entity.getRcvSumQty1Pallet());
		}

		return dto;
	}

	@Override
	public TCcopam mappingToEntity(TCcopamDto dto) {
		TCcopam entity = super.mappingToEntity(dto);

		if (entity != null) {
			entity.setWarehouseCls(dto.getWarehouseCls());
			entity.setCenterCd(dto.getCenterCd());
			entity.setClientCd(dto.getClientCd());
			entity.setSum(entity.getSum());
			entity.setNo(entity.getNo());
			entity.setLanding(dto.getLanding());
			entity.setRcvSumQty1Pallet(dto.getRcvSumQty1Pallet());
		}

		return entity;
	}
}
