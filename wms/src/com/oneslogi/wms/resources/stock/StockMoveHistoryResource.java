package com.oneslogi.wms.resources.stock;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.HMoveBDto;
import com.oneslogi.base.dbflute.dtomapper.HMoveBDtoMapper;
import com.oneslogi.base.dbflute.exentity.HMoveB;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.dto.stock.StockMoveHistoryDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.stock.StockMoveHistorySelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 在庫移動履歴のリソースクラス。
 */
@Path("/stock/stockMoveHistory")
public class StockMoveHistoryResource extends AbstractWmsResource {

	// ===== 定数定義 =====
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * 在庫移動履歴データ取得異常
		 */
		protected static final int H_MOVE_FAILED = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private StockMoveHistorySelectLogic stockMoveHistorySelectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return stockMoveHistoryDto 在庫移動履歴画面用DTO
	 */
	@GET
	@Path("/init")
	public StockMoveHistoryDto init() {
		// 画面用DTO作成
		StockMoveHistoryDto stockMoveHistoryDto = new StockMoveHistoryDto();

		return stockMoveHistoryDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力された、在庫移動情報を取得する
	 * </pre>
	 * @param stockMoveHistoryDto 在庫移動履歴画面用DTO
	 * @return StockMoveHistoryDto 在庫移動履歴画面用DTO
	 */
	@GET
	@Path("/search")
	public StockMoveHistoryDto search(StockMoveHistoryDto stockMoveHistoryDto) throws Exception {

		StockMoveHistoryDto resultStockMoveHistoryDto = new StockMoveHistoryDto();

		// エンティティ編集
		HMoveBDtoMapper bodyMapper = new HMoveBDtoMapper();
		HMoveB hMoveB = bodyMapper.mappingToEntity(stockMoveHistoryDto.data.head);

		// ===== センタIDを取得 =====
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(hMoveB.getHStock().getCenterCd());
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();
		hMoveB.getHStock().setCenterId(centerId);

		// ===== 在庫IDを取得 =====
		String stockTypeCd = hMoveB.getHStock().getMStockType().getStockTypeCd();
		if (!CU.isNullOrEmpty(stockTypeCd)) {
			MStockType stockType = new MStockType();
			stockType.setStockTypeCd(stockTypeCd);
			stockType = stockTypeLogic.getUkEntity(stockType);
			if (stockType != null) {
				hMoveB.getHStock().getMStockType().setStockTypeId(stockType.getStockTypeId());
			}
		}

		// ===== 処理区分IDを取得 =====
		String processTypeCd = hMoveB.getHMoveH().getMProcessType().getProcessTypeCd();
		if (!CU.isNullOrEmpty(processTypeCd)) {
			MProcessType processType = new MProcessType();
			processType.setProcessTypeCd(processTypeCd);
			processType = processTypeLogic.getUkEntity(processType);
			if (processType != null) {
				hMoveB.getHMoveH().setProcessTypeId(processType.getProcessTypeId());
			}
		}

		// 検索
		PagingResultBean<HMoveB> page = stockMoveHistorySelectLogic.select(hMoveB, stockMoveHistoryDto.paging, errRetSts(StatusCode.H_MOVE_FAILED));

		// Dto変換処理
		List<HMoveBDto> list = bodyMapper.mappingToDtoList(page);

		// 検索結果詰込処理
		resultStockMoveHistoryDto.paging = stockMoveHistoryDto.paging;
		resultStockMoveHistoryDto.data.list = list;

		return resultStockMoveHistoryDto;
	}
}
