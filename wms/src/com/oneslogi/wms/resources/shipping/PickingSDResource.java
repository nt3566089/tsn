package com.oneslogi.wms.resources.shipping;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.wms.dto.shipping.PickingSDDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ピッキング画面（スマートデバイス用）のリソースクラス。
 */
@Path("/shipping/pickingSD")
public class PickingSDResource extends AbstractWmsResource {

	/**
	 * <h2>初期処理(通常)。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return PickingSDDto ピッキング画面用（スマートデバイス用）DTO
	 */
	@GET
	@Path("/init")
	public PickingSDDto init() {

		// 画面用DTO作成
		PickingSDDto pickingSDDto = new PickingSDDto();

		return pickingSDDto;
	}

}
