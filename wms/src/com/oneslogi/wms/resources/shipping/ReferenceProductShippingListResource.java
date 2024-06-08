package com.oneslogi.wms.resources.shipping;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstHDtoMapper;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.wms.dto.shipping.ReferenceProductShippingListDto;
import com.oneslogi.wms.logic.shipping.ReferenceProductShippingListSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/shipping/referenceProductShippingList")
public class ReferenceProductShippingListResource extends AbstractWmsResource {

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
		 * 商品別出荷一覧（参照）データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ReferenceProductShippingListSelectLogic selectLogic;

	/**
	 * <h2>初期処理(通常)</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * </pre>
	 * @return ReferenceProductShippingListDto 商品別出荷一覧（参照）画面用DTO
	 */
	@GET
	@Path("/initUsually")
	public ReferenceProductShippingListDto initUsually() {
		return new ReferenceProductShippingListDto();
	}

	/**
	 * <h2>検索。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * ・商品別出荷一覧（参照）DTOをキーに商品別出荷一覧（参照）データ取り出し
	 * </pre>
	 * @param referenceProductShippingListDto 商品別出荷一覧（参照）画面用DTO
	 * @return ReferenceProductShippingListDto 商品別出荷一覧（参照）画面用DTO
	 */
	@GET
	@Path("/search")
	public ReferenceProductShippingListDto search(ReferenceProductShippingListDto referenceProductShippingListDto) {
		ReferenceProductShippingListDto resultReferenceProductShippingListDto = new ReferenceProductShippingListDto();

		// Entity変換
		TShippingInstHDtoMapper headerMapper1 = new TShippingInstHDtoMapper();
		TShippingInstH tShippingInstH = headerMapper1.mappingToEntity(referenceProductShippingListDto.data.search);

		// 商品別出荷一覧（参照）取得用
		List<TShippingInstB> page = selectLogic.select(tShippingInstH, referenceProductShippingListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return resultReferenceProductShippingListDto;
		}

		// Dto変換処理
		TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper();
		List<TShippingInstBDto> list = mapper.mappingToDtoList(page);

		// 出荷データにおいて「実績」「予定」「NULL」を判定
		for(TShippingInstBDto tShippingInstBDto : list) {
			// NULL判定
			if(tShippingInstBDto != null) {
				// 出荷の実績有無で預託の値をセット
				if(tShippingInstBDto.getTAllocInstB() != null) {
					// 実績ありの場合
					tShippingInstBDto.setReferenceDepositCd(
							tShippingInstBDto.getTAllocInstB().getMCustomer().getCustomerCd()
							);
					tShippingInstBDto.setReferenceDepositNm(
							tShippingInstBDto.getTAllocInstB().getMCustomer().getCustomerNm()
							);
				} else if(tShippingInstBDto.getTAllocInstB() == null) {
					// 実績なしの場合
					tShippingInstBDto.setReferenceDepositCd(
							tShippingInstBDto.getMCustomer().getCustomerCd()
							);
					tShippingInstBDto.setReferenceDepositNm(
							tShippingInstBDto.getMCustomer().getCustomerNm()
							);
				}
			}
		}

		//検索結果詰め替え処理
		resultReferenceProductShippingListDto.paging = referenceProductShippingListDto.paging;

		resultReferenceProductShippingListDto.data.list = list;

		return resultReferenceProductShippingListDto;
	}

}
