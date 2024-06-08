package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TInventoryHDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTInventoryHDtoMapper;
import com.oneslogi.base.dbflute.exentity.TInventoryH;

/**
 * The DTO mapper of T_INVENTORY_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryHDtoMapper extends BsTInventoryHDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public TInventoryHDtoMapper() {
    }

    public TInventoryHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

	@Override
	public TInventoryHDto mappingToDto(TInventoryH input) {
		TInventoryHDto output = super.mappingToDto(input);

		if (output != null) {
			output.setInventoryDtFrom(input.getInventoryDtFrom());
			output.setInventoryDtTo(input.getInventoryDtTo());
			//LSC担当分機能対応のため、下記項目を追加 2024/05/08 ADD BY LSC START
			output.setInventoryKeyFlg(input.getInventoryKeyFlg());
			output.setCapProduct(input.getCapProduct());
			output.setProductType(input.getProductType());
			//LSC担当分機能対応のため、下記項目を追加 2024/05/08 ADD BY LSC END
		}

		return output;
	}

	@Override
	public TInventoryH mappingToEntity(TInventoryHDto input) {
		TInventoryH output = super.mappingToEntity(input);

		if (output != null) {
			output.setInventoryDtFrom(input.getInventoryDtFrom());
			output.setInventoryDtTo(input.getInventoryDtTo());
			//LSC担当分機能対応のため、下記項目を追加 2024/05/08 ADD BY LSC START
			output.setInventoryKeyFlg(input.getInventoryKeyFlg());
			output.setCapProduct(input.getCapProduct());
			output.setProductType(input.getProductType());
			//LSC担当分機能対応のため、下記項目を追加 2024/05/08 ADD BY LSC END
		}

		return output;
	}
}
