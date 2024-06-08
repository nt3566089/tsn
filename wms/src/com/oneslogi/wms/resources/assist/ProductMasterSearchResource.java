package com.oneslogi.wms.resources.assist;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.assist.ProductMasterSearchDto;
import com.oneslogi.wms.logic.assist.ProductListSelectLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 商品マスタ検索画面のリソースクラス。
 */
@Path("/assist/productMasterSearch")
public class ProductMasterSearchResource extends AbstractWmsResource {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 商品マスタデータ取得異常
		 */
		protected static final int PRODUCT_MASTER_SEARCH_FAILED = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ProductListSelectLogic productListSelectLogic;
	@Inject
	private ClientLogic ClientLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ProductMasterSearchDto 商品マスタ検索画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ProductMasterSearchDto initNew() {
		// 画面用DTO作成
		ProductMasterSearchDto productMasterDto = new ProductMasterSearchDto();
		return productMasterDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・商品マスタDTOをキーに商品マスタデータ取り出し
	 * </pre>
	 * @param productMasterDto 商品マスタ画面用DTO
	 * @return ProductMasterSearchDto 商品マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public ProductMasterSearchDto search(ProductMasterSearchDto productMasterDto) throws IOException {
		ProductMasterSearchDto productDto = new ProductMasterSearchDto();

		// Entity変換
		MProductDtoMapper mapper = new MProductDtoMapper();
		MProduct product = mapper.mappingToEntity(productMasterDto.data.head);

		//荷主ID取得
		String clientCd = product.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = ClientLogic.getUkEntity(mClient);
		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.PRODUCT_MASTER_SEARCH_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		product.setClientId(mClient.getClientId());

		// 検索
		PagingResultBean<MProduct> page = productListSelectLogic.select(product,productMasterDto.paging,errRetSts(StatusCode.PRODUCT_MASTER_SEARCH_FAILED));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<MProductDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		productDto.paging = productMasterDto.paging;
		productDto.data.list = list;

		return productDto;
	}


}
