package com.oneslogi.wms.resources.shipping;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.HPackingBDto;
import com.oneslogi.base.dbflute.dtomapper.HPackingBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.HPackingHDtoMapper;
import com.oneslogi.base.dbflute.exentity.HPackingB;
import com.oneslogi.base.dbflute.exentity.HPackingH;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.wms.dto.shipping.PackingHistoryDto;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.shipping.PackingHistorySelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/shipping/packingHistory")
public class PackingHistoryResource extends AbstractWmsResource {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 梱包履歴データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private PackingHistorySelectLogic selectLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;

	/**
	 * <h2>初期処理</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * </pre>
	 * @return PackingHistoryDto 梱包履歴画面用DTO
	 */
	@GET
	@Path("/init")
	public PackingHistoryDto init() {
		return new PackingHistoryDto();
	}

	/**
	 * <h2>検索。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * ・梱包履歴DTOをキーに梱包履歴データ取り出し
	 * </pre>
	 * @param packingHistoryDto 梱包履歴画面用DTO
	 * @return PackingHistoryDto 梱包履歴画面用DTO
	 */
	@GET
	@Path("/search")
	public PackingHistoryDto search(PackingHistoryDto packingHistoryDto) throws IOException {

		PackingHistoryDto resultPackingHistoryDto = new PackingHistoryDto();

		// Entity変換
		HPackingHDtoMapper headerMapper = new HPackingHDtoMapper();
		HPackingH hPackingH = headerMapper.mappingToEntity(packingHistoryDto.data.head);
		HPackingBDtoMapper bodyMapper = new HPackingBDtoMapper();
		HPackingB hPackingB = bodyMapper.mappingToEntity(packingHistoryDto.data.body);

		// 処理区分ID取得
		MProcessType mProcessType = new MProcessType();
		mProcessType.setProcessTypeCd(hPackingH.getHShippingH().getMProcessType().getProcessTypeCd());
		mProcessType = processTypeLogic.getUkEntity(mProcessType);
		if (mProcessType != null) {
			// 処理区分IDを設定
			hPackingH.setProcessTypeId(mProcessType.getProcessTypeId());
		}

		// 梱包履歴データ取得用
		PagingResultBean<HPackingB> page = selectLogic.select(hPackingH, hPackingB, packingHistoryDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// Dto変換処理
		List<HPackingBDto> list = bodyMapper.mappingToDtoList(page);

		resultPackingHistoryDto.paging = packingHistoryDto.paging;
		resultPackingHistoryDto.data.bodyList = list;

		return resultPackingHistoryDto;
	}
}