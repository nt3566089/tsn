package com.oneslogi.wms.resources.shipping;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.wms.dto.stock.BoxMasterDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/shipping/pieceShippingInspectBox")
public class PieceShippingInspectBoxResource extends AbstractWmsResource {

	// ===== 使用ロジッククラス =====
	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * </pre>
	 * @return BoxMasterDto 箱登録画面用DTO
	 */
	@GET
	@Path("/init")
	public BoxMasterDto init() {
		return new BoxMasterDto();
	}
}
