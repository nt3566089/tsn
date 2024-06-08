package com.oneslogi.wms.resources.shipping;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.HShippingBDto;
import com.oneslogi.base.dbflute.dtomapper.HShippingBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.HShippingHDtoMapper;
import com.oneslogi.base.dbflute.exentity.HShippingB;
import com.oneslogi.base.dbflute.exentity.HShippingH;
import com.oneslogi.wms.dto.shipping.ShippingHistoryDto;
import com.oneslogi.wms.logic.shipping.ShippingHistorySelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 出荷履歴のリソースクラス。
 */
@Path("/shipping/shippingHistory")
public class ShippingHistoryResource extends AbstractWmsResource {

	// ===== 定数定義 =====
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 出荷履歴データ取得異常
		 */
		protected static final int H_SHIPPING_FAILED = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingHistorySelectLogic selectLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return shippingHistoryDto 出荷履歴画面用DTO
	 */
	@GET
	@Path("/init")
	public ShippingHistoryDto init() {
		// 画面用DTO作成
		return new ShippingHistoryDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力された、在庫移動情報を取得する
	 * </pre>
	 * @param shippingHistoryDto 出荷履歴画面用DTO
	 * @return ShippingHistoryDto 出荷履歴画面用DTO
	 */
	@GET
	@Path("/search")
	public ShippingHistoryDto search(ShippingHistoryDto shippingHistoryDto) throws IOException {

		ShippingHistoryDto resultShippingHistoryDto = new ShippingHistoryDto();

		// Entity変換
		HShippingHDtoMapper headerMapper = new HShippingHDtoMapper();
		HShippingH hShippingH = headerMapper.mappingToEntity(shippingHistoryDto.data.head);
		HShippingBDtoMapper bodyMapper = new HShippingBDtoMapper();
		HShippingB hShippingB = bodyMapper.mappingToEntity(shippingHistoryDto.data.body);

		// 出荷履歴データ取得用
		PagingResultBean<HShippingB> page = selectLogic.select(hShippingH, hShippingB, shippingHistoryDto.paging, errRetSts(StatusCode.H_SHIPPING_FAILED));

		// Dto変換処理
		List<HShippingBDto> list = bodyMapper.mappingToDtoList(page);

		resultShippingHistoryDto.paging = shippingHistoryDto.paging;
		resultShippingHistoryDto.data.bodyList = list;

		return resultShippingHistoryDto;
	}
}
