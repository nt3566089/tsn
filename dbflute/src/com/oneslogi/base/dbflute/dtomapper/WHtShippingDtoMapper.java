package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.WHtShippingDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsWHtShippingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShipping;

/**
 * The DTO mapper of w_ht_shipping.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WHtShippingDtoMapper extends BsWHtShippingDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public WHtShippingDtoMapper() {
    }

    public WHtShippingDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

    @Override
    public WHtShippingDto mappingToDto(WHtShipping input) {
    	WHtShippingDto output = super.mappingToDto(input);

    	if (output != null) {
            // [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto Start
            output.setSpgWorkCommentSet(input.getSpgWorkCommentSet());
            // [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto End
    	}

    	return output;
    }

    @Override
    public WHtShipping mappingToEntity(WHtShippingDto input) {
    	WHtShipping output = super.mappingToEntity(input);

    	if(output != null) {
            // [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto Start
            output.setSpgWorkCommentSet(input.getSpgWorkCommentSet());
            // [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto End
    	}

    	return output;
    }
}
