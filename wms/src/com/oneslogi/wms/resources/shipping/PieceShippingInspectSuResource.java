package com.oneslogi.wms.resources.shipping;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.wms.dto.shipping.QuantityInputDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/shipping/pieceShippingInspectSu")
public class PieceShippingInspectSuResource extends AbstractWmsResource {

	// ===== 使用ロジッククラス =====
	/**
	 * <h2>画面用DTOの作成</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * 数量入力画面用DTOを作成
	 * </pre>
	 * @return QuantityInputDto 数量入力画面用DTO
	 */
	@GET
	@Path("/init")
	public QuantityInputDto init() {
		// 数量入力登録画面用DTOを作成
		return new QuantityInputDto();
	}
}
