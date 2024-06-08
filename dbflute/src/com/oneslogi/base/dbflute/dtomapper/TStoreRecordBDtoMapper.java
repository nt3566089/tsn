package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TStoreRecordBDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTStoreRecordBDtoMapper;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;

/**
 * The DTO mapper of T_STORE_RECORD_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TStoreRecordBDtoMapper extends BsTStoreRecordBDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public TStoreRecordBDtoMapper() {
	}

	public TStoreRecordBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public TStoreRecordBDto mappingToDto(TStoreRecordB input) {
		TStoreRecordBDto output = super.mappingToDto(input);

		if (output != null) {
			output.setUnitNum(input.getUnitNum());
			output.setStoreCaseNum(input.getStoreCaseNum());
			output.setStorePieceNum(input.getStorePieceNum());
			output.setStoreLabelNo(input.getStoreLabelNo());
			output.setExistFlg(input.getExistFlg());
			output.setStoreLabelNo(input.getStoreLabelNo());
			output.setStockTypeCd(input.getStockTypeCd());
			output.setStockTypeNm(input.getStockTypeNm());
			output.setLocationNm(input.getLocationNm());
			output.setStoreLabelNoFrom(input.getStoreLabelNoFrom());
			output.setStoreLabelNoTo(input.getStoreLabelNoTo());
			output.setLimitDtNgFlg(input.getLimitDtNgFlg());
			output.setMaxLimitDt(input.getMaxLimitDt());
		}

		return output;
	}

	@Override
	public TStoreRecordB mappingToEntity(TStoreRecordBDto input) {
		TStoreRecordB output = super.mappingToEntity(input);

		if (output != null) {
			output.setUnitNum(input.getUnitNum());
			output.setStoreCaseNum(input.getStoreCaseNum());
			output.setStorePieceNum(input.getStorePieceNum());
			output.setStoreLabelNo(input.getStoreLabelNo());
			output.setExistFlg(input.getExistFlg());
			output.setStoreLabelNoFrom(input.getStoreLabelNoFrom());
			output.setStoreLabelNoTo(input.getStoreLabelNoTo());
			output.setLimitDtNgFlg(input.getLimitDtNgFlg());
			output.setMaxLimitDt(input.getMaxLimitDt());
		}

		return output;
	}
}
