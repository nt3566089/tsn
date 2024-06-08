package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.BMessageDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsBMessageDtoMapper;
import com.oneslogi.base.dbflute.exentity.BMessage;

/**
 * The DTO mapper of B_MESSAGE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BMessageDtoMapper extends BsBMessageDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public BMessageDtoMapper() {
    }

    public BMessageDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
    @Override
   	public BMessageDto mappingToDto(BMessage input) {
    	BMessageDto output = super.mappingToDto(input);

   		if (output != null) {
   			if(input != null){
   				output.setCultureCd(input.getCultureCd());
   			}
   		}

   		return output;
   	}

   	@Override
   	public BMessage mappingToEntity(BMessageDto input) {
   		BMessage output = super.mappingToEntity(input);

   		if (output != null) {
   			if(input != null){
   				output.setCultureCd(input.getCultureCd());
   			}
   		}
   		return output;
   	}
}
