package com.oneslogi.wms.resources.stock;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TTrhanbaiinvDto;
import com.oneslogi.base.dbflute.dtomapper.TTrhanbaiinvDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TTrhanbaiinv;
import com.oneslogi.wms.dto.stock.StockCheckDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.stock.StockCheckSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 国免在庫照合のリソースクラス。
 */
@Path("/stock/stockCheck")
public class StockCheckResource extends AbstractWmsResource {

	// ===== 定数定義 =====
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 該当データ無し
		 */
		protected static final int NOT_FOUND_DATA = 2;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private StockCheckSelectLogic stockCheckSelectLogic;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return stockCheckDto 国免在庫照合用DTO
	 */
	@GET
	@Path("/init")
	public StockCheckDto init() {
		// 画面用DTO作成
		StockCheckDto stockCheckDto = new StockCheckDto();

		return stockCheckDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力された、販売物流在庫情報を取得する
	 * </pre>
	 * @param dto 国免在庫照合用DTO
	 * @return stockCheckDto 国免在庫照合用DTO
	 */
	@GET
	@Path("/search")
	public StockCheckDto search(StockCheckDto dto) {
		StockCheckDto stockCheckDto = new StockCheckDto();
		// エンティティ編集
		TTrhanbaiinvDtoMapper headerMapper = new TTrhanbaiinvDtoMapper();
		TTrhanbaiinv header = headerMapper.mappingToEntity(dto.data.head);

		// ===== 拠点IDを取得 =====
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		header.setCenterId(mCenter.getCenterId());

		// ===== 荷主IDを取得 =====
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		header.setClientId(mClient.getClientId());

		// 検索実行
		List<TTrhanbaiinv> selectEntity = stockCheckSelectLogic.select(header, dto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// EntityToDtoマッピング SQL実行型から、画面表示ができる型に変換。
		List<TTrhanbaiinvDto> result = headerMapper.mappingToDtoList(selectEntity);

		// 検索結果詰込処理
		stockCheckDto.data.list = result;
		stockCheckDto.paging = dto.paging;
		return stockCheckDto;
	}

}
