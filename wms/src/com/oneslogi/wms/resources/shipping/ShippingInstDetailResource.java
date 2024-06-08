package com.oneslogi.wms.resources.shipping;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstHDtoMapper;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.shipping.ShippingInstDetailDto;
import com.oneslogi.wms.logic.shipping.ShippingInstDetailSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/shipping/shippingInstDetail")
public class ShippingInstDetailResource extends AbstractWmsResource {

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
		 * 出荷指示明細データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingInstDetailSelectLogic selectLogic;

	/**
	 * <h2>初期処理(通常)</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * </pre>
	 * @return ShippingInstListDto 出庫指示一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public ShippingInstDetailDto init() {
		return new ShippingInstDetailDto();
	}

	/**
	 * <h2>出荷指示明細データ取得。</h2>
	 * <pre>
	 * ・出荷指示明細データ取得。
	 * </pre>
	 * @param shippingInstDetailDto 出荷指示明細画面用DTO
	 * @return resultShippingInstDetailDto 出荷指示明細画面用DTO
	 */
	@GET
	@Path("/search")
	public ShippingInstDetailDto search (ShippingInstDetailDto shippingInstDetailDto ) {
		ShippingInstDetailDto resultShippingInstDetailDto = new ShippingInstDetailDto();
		// Entity変換
		TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper();
		TShippingInstH header = mapper.mappingToEntity(shippingInstDetailDto.data.head);
		//伝票別入荷一覧データ取得用
		// [ON推-品向-513] ページングが動作しない不具合を修正 2015.01.09 kawana Start
		PagingResultBean<TShippingInstB> page = selectLogic.select(header, shippingInstDetailDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// [ON推-品向-513] ページングが動作しない不具合を修正 2015.01.09 kawana End
		if (getErrorManager().size() > 0) {
			return null;
		}

		// [ON推-品向-536] 商品マスタ、取引先マスタから削除された場合の考慮追加 2015.01.14 kawana Start
		for (TShippingInstB body : page) {
			if (body.chaseTShippingInstH().getMCustomerBySupplyCustomerId() == null) {
				// 納品先が取引先マスタから削除されている

				getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CUSTOMER_CODE_FOUND_DELETED_WITH_CD_ERROR, body.chaseTShippingInstH().getSupplyCustomerCd());
				return null;
			}

			if (body.getMCustomer() == null) {
				// 預託先が取引先マスタから削除されている

				getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CUSTOMER_CODE_FOUND_DELETED_WITH_CD_ERROR, body.getDepositCd());
				return null;
			}

			if (body.getMProduct() == null) {
				// 商品が商品マスタから削除されている

				getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.PRODUCT_CODE_FOUND_DELETED_WITH_CD_ERROR, body.getProductCd());
				return null;
			}
		}
		// [ON推-品向-536] 商品マスタ、取引先マスタから削除された場合の考慮追加 2015.01.14 kawana End

		// Dto変換処理
		TShippingInstBDtoMapper mapperb = new TShippingInstBDtoMapper();
		List<TShippingInstBDto> list = mapperb.mappingToDtoList(page);

		//検索結果詰め替え処理
		// [ON推-品向-513] ページングが動作しない不具合を修正 2015.01.09 kawana Start
		resultShippingInstDetailDto.paging = shippingInstDetailDto.paging;
		// [ON推-品向-513] ページングが動作しない不具合を修正 2015.01.09 kawana End
		resultShippingInstDetailDto.data.head = list.get(0).getTShippingInstH();
		resultShippingInstDetailDto.data.list = list;

		return resultShippingInstDetailDto;
	}

}
