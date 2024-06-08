package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TPickingHDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTPickingHDtoMapper;
import com.oneslogi.base.dbflute.exentity.TPickingH;

/**
 * The DTO mapper of t_picking_h.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TPickingHDtoMapper extends BsTPickingHDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public TPickingHDtoMapper() {
    }

    public TPickingHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
    @Override
   	public TPickingHDto mappingToDto(TPickingH input) {
    	TPickingHDto output = super.mappingToDto(input);

   		if (output != null) {
   			output.setNoConfirmedFlg(input.getNoConfirmFlg());
   			output.setShippingDtFrom(input.getShippingDtFrom());
   			output.setShippingDtTo(input.getShippingDtTo());
   			// [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka Start
   			output.setWorkDtFrom(input.getWorkDtFrom());
   			output.setWorkDtTo(input.getWorkDtTo());
   			// [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka End
   			output.setConfirmCancelFlg(input.getConfirmCancelFlg());
   			output.setDtFrom(input.getDtFrom());
   			output.setDtTo(input.getDtTo());
   			output.setTakingShippingFlg(input.getTakingShippingFlg());
   			output.setPicCls(input.getPicCls());
   			output.setListOutKbn(input.getListOutKbn());
   			output.setWarehouseCd(input.getWarehouseCd());
   			output.setPickingBatchNo(input.getPickingBatchNo());
   			output.setEmergencyFlg(input.getEmergencyFlg());
   			output.setPicListCls1(input.getPicListCls1());
   			output.setPicListCls2(input.getPicListCls2());
   			// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA Start
   			output.setPicListCls3(input.getPicListCls3());
   			// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA End
   			output.setTagType(input.getTagType());
   			// [ON推-品向-602] 足りない変換を追加 2015.04.14 kawana Start
   			output.setClientShippingNo(input.getClientShippingNo());
   			// [ON推-品向-602] 足りない変換を追加 2015.04.14 kawana End
   		// [新ｿﾘ-084] 確認メッセージの出力ので、変数を追加 2014.11.26 fengc Start
   			output.setIsOtherWarehouse(input.getIsOtherWarehouse());
   			output.setReportCd(input.getReportCd());
   			output.setIsMessageOutPutFlg(input.getIsMessageOutPutFlg());
   		// [新ｿﾘ-084] 確認メッセージの出力ので、変数を追加 2014.11.26 fengc End
			// [ON推-品向-602] 足りない変換を追加 2015.04.14 kawana Start
			output.setNoStockOutFlg(input.getNoStockOutFlg());
			// [ON推-品向-602] 足りない変換を追加 2015.04.14 kawana End
			// [#1005] SDケースピッキング ケースピッキングNo.追加 2017.02.24 honma Add Start
			output.setCasePickingNo(input.getCasePickingNo());
			// [#1005] SDケースピッキング ケースピッキングNo.追加 2017.02.24 honma Add End
			//[Ver3.1][#5129]検索条件にケースピックフラグ追加 2018.09.21 miyabe add Start
			output.setCasePicFlg(input.getCasePicFlg());
			//[Ver3.1][#5129]検索条件にケースピックフラグ追加 2018.09.21 miyabe add End
   		}
   		return output;
   	}

   	@Override
   	public TPickingH mappingToEntity(TPickingHDto input) {
   		TPickingH output = super.mappingToEntity(input);

   		if (output != null) {
   			output.setNoConfirmFlg(input.getNoConfirmedFlg());
   			output.setShippingDtFrom(input.getShippingDtFrom());
   			output.setShippingDtTo(input.getShippingDtTo());
   			// [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka Start
   			output.setWorkDtFrom(input.getWorkDtFrom());
   			output.setWorkDtTo(input.getWorkDtTo());
   			// [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka End
   			output.setConfirmCancelFlg(input.getConfirmCancelFlg());
   			output.setDtFrom(input.getDtFrom());
   			output.setDtTo(input.getDtTo());
   			output.setTakingShippingFlg(input.getTakingShippingFlg());
   			output.setPicCls(input.getPicCls());
   			output.setListOutKbn(input.getListOutKbn());
   			output.setWarehouseCd(input.getWarehouseCd());
   			output.setPickingBatchNo(input.getPickingBatchNo());
   			output.setEmergencyFlg(input.getEmergencyFlg());
   			output.setPicListCls1(input.getPicListCls1());
   			output.setPicListCls2(input.getPicListCls2());
   			// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA Start
   			output.setPicListCls3(input.getPicListCls3());
   			// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA End
   			output.setTagType(input.getTagType());
   			// [ON推-品向-602] 足りない変換を追加 2015.04.14 kawana Start
   			output.setClientShippingNo(input.getClientShippingNo());
   			// [ON推-品向-602] 足りない変換を追加 2015.04.14 kawana End
   		// [新ｿﾘ-084] 確認メッセージの出力ので、変数を追加 2014.11.26 fengc Start
   			output.setIsOtherWarehouse(input.getIsOtherWarehouse());
   			output.setReportCd(input.getReportCd());
   			output.setIsMessageOutPutFlg(input.getIsMessageOutPutFlg());
   		// [新ｿﾘ-084] 確認メッセージの出力ので、変数を追加 2014.11.26 fengc End
			// [ON推-品向-602] 足りない変換を追加 2015.04.14 kawana Start
			output.setNoStockOutFlg(input.getNoStockOutFlg());
			// [ON推-品向-602] 足りない変換を追加 2015.04.14 kawana End
			//[Ver3.1][#5129]検索条件にケースピックフラグ追加 2018.09.21 miyabe add Start
			output.setCasePicFlg(input.getCasePicFlg());
			//[Ver3.1][#5129]検索条件にケースピックフラグ追加 2018.09.21 miyabe add End

   		}

   		return output;
   	}
}
