package com.oneslogi.base.dbflute.dtomapper.customize;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.customize.SqlPackingListUpdateDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.bs.customize.BsSqlPackingListUpdateDtoMapper;
import com.oneslogi.base.dbflute.exentity.customize.SqlPackingListUpdate;

/**
 * The DTO mapper of SqlPackingListUpdate.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class SqlPackingListUpdateDtoMapper extends BsSqlPackingListUpdateDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public SqlPackingListUpdateDtoMapper() {
    }

    public SqlPackingListUpdateDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

	@Override
	public SqlPackingListUpdateDto mappingToDto(SqlPackingListUpdate input) {
		SqlPackingListUpdateDto output = super.mappingToDto(input);

		if (output != null) {
			output.setBoxNo(input.getBoxNo());
			output.setUpdateRow(input.getUpdateRow());
			// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add Start
			MProductDtoMapper productDtoMapper = new MProductDtoMapper();
			output.setProductDto(productDtoMapper.mappingToDto(input.prepareDomain()));
			// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add End
		}

		return output;
	}

	@Override
	public SqlPackingListUpdate mappingToEntity(SqlPackingListUpdateDto input) {
		SqlPackingListUpdate output = super.mappingToEntity(input);

		if (output != null) {
			output.setBoxNo(input.getBoxNo());
			output.setUpdateRow(input.getUpdateRow());
		}

		return output;
	}
}

