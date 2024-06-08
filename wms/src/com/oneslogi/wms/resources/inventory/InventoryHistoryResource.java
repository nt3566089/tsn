package com.oneslogi.wms.resources.inventory;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.HInventoryBDto;
import com.oneslogi.base.dbflute.dtomapper.HInventoryBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.HInventoryHDtoMapper;
import com.oneslogi.base.dbflute.exentity.HInventoryB;
import com.oneslogi.base.dbflute.exentity.HInventoryH;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.wms.dto.inventory.InventoryHistoryDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.inventory.InventoryHistorySearchSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 棚卸履歴画面のリソースクラス。
 */
@Path("/inventory/inventoryHistory")
public class InventoryHistoryResource extends AbstractWmsResource {

	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 棚卸履歴データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	InventoryHistorySearchSelectLogic selectLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return InventoryHistoryDto 棚卸履歴画面用DTO
	 */
	@GET
	@Path("/init")
	public InventoryHistoryDto init() {
		return new InventoryHistoryDto();
	}

	/**
	 * <h2>検索。</h2>
	 * <pre>
	 * ・棚卸履歴を行う
	 * </pre>
	 * @param inventoryHistoryDto 棚卸履歴画面用DTO
	 * @return InventoryHistoryDto 棚卸履歴画面用DTO
	 */
	@GET
	@Path("/search")
	public InventoryHistoryDto search(InventoryHistoryDto inventoryHistoryDto) throws IOException {

		InventoryHistoryDto resultInventoryHistoryDto = new InventoryHistoryDto();

		// Entity変換
		HInventoryHDtoMapper headerMapper = new HInventoryHDtoMapper();
		HInventoryH hInventoryH = headerMapper.mappingToEntity(inventoryHistoryDto.data.head);
		HInventoryBDtoMapper bodyMapper = new HInventoryBDtoMapper();
		HInventoryB hInventoryB = bodyMapper.mappingToEntity(inventoryHistoryDto.data.body);

		// 入力区分名称と在庫調整フラグ名称取得を追加 2016/11/11 nayzaw Start
		// ===== センタIDを取得 =====
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(hInventoryH.getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		hInventoryH.setCenterId(mCenter.getCenterId());

		// =====荷主IDを取得
		MClient mClient = new MClient();
		mClient.setClientCd(hInventoryH.getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		hInventoryH.setClientId(mClient.getClientId());
		// 入力区分名称と在庫調整フラグ名称取得を追加 2016/11/11 nayzaw End

		// 棚卸履歴データ取得用
		PagingResultBean<HInventoryB> page = selectLogic.select(hInventoryH, hInventoryB, inventoryHistoryDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// Dto変換処理
		List<HInventoryBDto> list = bodyMapper.mappingToDtoList(page);

		resultInventoryHistoryDto.paging = inventoryHistoryDto.paging;
		resultInventoryHistoryDto.data.bodyList = list;

		return resultInventoryHistoryDto;
	}
}
