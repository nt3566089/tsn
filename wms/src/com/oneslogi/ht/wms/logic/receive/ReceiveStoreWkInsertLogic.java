package com.oneslogi.ht.wms.logic.receive;

import javax.inject.Inject;

import org.dbflute.hook.AccessContext;

import com.oneslogi.base.dbflute.dto.WHtReceiveStoreDto;
import com.oneslogi.base.dbflute.dtomapper.WHtReceiveStoreDtoMapper;
import com.oneslogi.base.dbflute.exbhv.WHtReceiveStoreBhv;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入庫格納ワーク登録ロジッククラス
 */
public class ReceiveStoreWkInsertLogic extends AbstractWmsLogic {

	@Inject
	private WHtReceiveStoreBhv wHtReceiveStoreBhv;

	/**
	 * <h2>入庫格納ワークデータを登録する。</h2>
	 * <pre>
	 * 引数の入庫格納ワークデータを登録する。
	 * </pre>
	 * @param wHtReceiveStore 入庫格納ワーク：全項目
	 */
	public void insertWHtReceiveStore(WHtReceiveStore wHtReceiveStore) {

		WHtReceiveStoreDtoMapper wHtReceiveStoreDtoMapper = new WHtReceiveStoreDtoMapper();

		WHtReceiveStoreDto wHtReceiveStoreDto = wHtReceiveStoreDtoMapper.mappingToDto(wHtReceiveStore);

		wHtReceiveStore.setMacAddress(wHtReceiveStoreDto.getMacAddress());
		wHtReceiveStore.setClientId(wHtReceiveStoreDto.getClientId());
		wHtReceiveStore.setCenterId(wHtReceiveStoreDto.getCenterId());
		wHtReceiveStore.setWarehouseId(wHtReceiveStoreDto.getWarehouseId());
		wHtReceiveStore.setProductId(wHtReceiveStoreDto.getProductId());
		wHtReceiveStore.setProductCd(wHtReceiveStoreDto.getProductCd());
		wHtReceiveStore.setProductNm(wHtReceiveStoreDto.getProductNm());
		wHtReceiveStore.setLocId(wHtReceiveStoreDto.getLocId());
		wHtReceiveStore.setLocCd(wHtReceiveStoreDto.getLocCd());
		wHtReceiveStore.setLocNm(wHtReceiveStoreDto.getLocNm());
		wHtReceiveStore.setJanCd(wHtReceiveStoreDto.getJanCd());
		wHtReceiveStore.setStockTypeId(wHtReceiveStoreDto.getStockTypeId());
		wHtReceiveStore.setStkClsNm(wHtReceiveStoreDto.getStkClsNm());
		wHtReceiveStore.setLotId(wHtReceiveStoreDto.getLotId());
		wHtReceiveStore.setLot(wHtReceiveStoreDto.getLot());
		wHtReceiveStore.setLimitDt(wHtReceiveStoreDto.getLimitDt());
		wHtReceiveStore.setStoreNum(wHtReceiveStoreDto.getStoreNum());
		wHtReceiveStore.setWorkStartDt(AccessContext.getAccessTimestampOnThread());
		wHtReceiveStore.setWorkEndDt(AccessContext.getAccessTimestampOnThread());

		wHtReceiveStoreBhv.insert(wHtReceiveStore);

	}
}
