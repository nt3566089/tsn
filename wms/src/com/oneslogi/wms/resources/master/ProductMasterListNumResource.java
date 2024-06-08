package com.oneslogi.wms.resources.master;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.wms.dto.master.ProductMasterListDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/master/productMasterListNum")
public class ProductMasterListNumResource extends AbstractWmsResource {

	// ===== 使用ロジッククラス =====
	/**
	 * <h2>画面用DTOの作成</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * 数量入力画面用DTOを作成
	 * </pre>
	 * @return ProductMasterListDto 数量入力画面用DTO
	 */
	@GET
	@Path("/init")
	public ProductMasterListDto init() {

		// 数量入力登録画面用DTOを作成
		return new ProductMasterListDto();
	}
}
