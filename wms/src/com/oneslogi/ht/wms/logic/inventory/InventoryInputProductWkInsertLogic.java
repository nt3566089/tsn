package com.oneslogi.ht.wms.logic.inventory;

import javax.inject.Inject;

import org.dbflute.hook.AccessContext;

import com.oneslogi.base.dbflute.dto.WHtInventoryInputProdDto;
import com.oneslogi.base.dbflute.exbhv.WHtInventoryInputProdBhv;
import com.oneslogi.base.dbflute.exentity.WHtInventoryInputProd;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 商品棚卸入力商品棚卸ワーク登録ロジッククラス
 */
public class InventoryInputProductWkInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 商品棚卸用一時テーブル         */
	@Inject
	private WHtInventoryInputProdBhv wHtInventoryInputProductBhv;

	/**
	 * <h2>商品棚卸ワークを登録する。</h2>
	 * <pre>
	 * 受取った引数のDTOを商品棚卸ワークテーブルに挿入する。
	 *
	 * 同時送信の排他チェックのため、
	 * ロットと期限日がNULLの場合、半角スペース（" "）で登録し、棚卸ヘッダIDとバージョンNoを設定する。
	 * </pre>
	 * @param wHtInventoryDto 商品棚卸ワーク：全項目
	 */
	public void insertWHtInventoryInputProd(WHtInventoryInputProdDto wHtInventoryDto) {

		//商品棚卸用一時テーブル登録
		WHtInventoryInputProd wHtInventoryInputProduct = new WHtInventoryInputProd();

		wHtInventoryInputProduct.setMacAddress(wHtInventoryDto.getMacAddress());
		wHtInventoryInputProduct.setClientId(wHtInventoryDto.getClientId());
		wHtInventoryInputProduct.setCenterId(wHtInventoryDto.getCenterId());
		wHtInventoryInputProduct.setWarehouseId(wHtInventoryDto.getWarehouseId());
		wHtInventoryInputProduct.setProductId(wHtInventoryDto.getProductId());
		wHtInventoryInputProduct.setProductCd(wHtInventoryDto.getProductCd());
		wHtInventoryInputProduct.setProductNm(wHtInventoryDto.getProductNm());
		wHtInventoryInputProduct.setLocId(wHtInventoryDto.getLocId());
		wHtInventoryInputProduct.setLocCd(wHtInventoryDto.getLocCd());
		wHtInventoryInputProduct.setLocNm(wHtInventoryDto.getLocNm());
		wHtInventoryInputProduct.setJanCd(wHtInventoryDto.getJanCd());
		wHtInventoryInputProduct.setConsignmentClsId(wHtInventoryDto.getConsignmentClsId());
		wHtInventoryInputProduct.setConsignmentClsNm(wHtInventoryDto.getConsignmentClsNm());
		wHtInventoryInputProduct.setStockTypeId(wHtInventoryDto.getStockTypeId());
		wHtInventoryInputProduct.setStkClsNm(wHtInventoryDto.getStkClsNm());
		wHtInventoryInputProduct.setLotId(wHtInventoryDto.getLotId());
		//[HT1.5-CT1-041] 同時送信の排他チェックのためにNULLの場合は" "をセットに変更  2015/06/26 KAI UPDATE START
		//wHtInventoryInputProduct.setLot(wHtInventoryDto.getLot());
		//wHtInventoryInputProduct.setLimitDt(wHtInventoryDto.getLimitDt());
		if (wHtInventoryDto.getLot() ==  null || wHtInventoryDto.getLot().length() == 0){
			wHtInventoryInputProduct.setLot(" ");
		} else {
			wHtInventoryInputProduct.setLot(wHtInventoryDto.getLot());
		}
		if (wHtInventoryDto.getLimitDt() ==  null || wHtInventoryDto.getLimitDt().length() == 0){
			wHtInventoryInputProduct.setLimitDt(" ");
		} else {
			wHtInventoryInputProduct.setLimitDt(wHtInventoryDto.getLimitDt());
		}
		//[HT1.5-CT1-041] 同時送信の排他チェックのためにNULLの場合は" "をセットに変更  2015/06/26 KAI UPDATE END
		wHtInventoryInputProduct.setQty(wHtInventoryDto.getQty());
		wHtInventoryInputProduct.setCrDt(AccessContext.getAccessTimestampOnThread());
		wHtInventoryInputProduct.setWorkStartDt(AccessContext.getAccessTimestampOnThread());
		wHtInventoryInputProduct.setWorkEndDt(AccessContext.getAccessTimestampOnThread());

		//[HT1.5-CT1-041] 同時送信の排他チェックのために棚卸ヘッダID、棚卸ボディのバージョンNoを追加 2015/06/26 KAI ADD START
		wHtInventoryInputProduct.setInventoryHId(wHtInventoryDto.getInventoryHId());
		wHtInventoryInputProduct.setInventoryBVersionNo(wHtInventoryDto.getInventoryBVersionNo());
		//[HT1.5-CT1-041] 同時送信の排他チェックのために棚卸ヘッダID、棚卸ボディのバージョンNoを追加 2015/06/26 KAI ADD END

		wHtInventoryInputProductBhv.insert(wHtInventoryInputProduct);

	}
}