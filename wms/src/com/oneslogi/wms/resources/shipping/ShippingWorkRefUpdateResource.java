package com.oneslogi.wms.resources.shipping;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.wms.dto.shipping.ShippingWorkRefUpdateDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 出庫作業メッセージ登録画面のリソースクラス。
 */
@Path("/shipping/shippingWorkRefUpdate")
public class ShippingWorkRefUpdateResource extends AbstractWmsResource {

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ShippingWorkRefUpdateDto 出庫作業メッセージ登録画面用DTO
	 */
	@GET
	@Path("/init")
	public ShippingWorkRefUpdateDto init() {
		return new ShippingWorkRefUpdateDto();
	}
}
