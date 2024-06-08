package com.oneslogi.wms.resources.receive;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.HReceiveBDto;
import com.oneslogi.base.dbflute.dtomapper.HReceiveBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.HReceiveHDtoMapper;
import com.oneslogi.base.dbflute.exentity.HReceiveB;
import com.oneslogi.base.dbflute.exentity.HReceiveH;
import com.oneslogi.wms.dto.receive.ReceiveHistoryDto;
import com.oneslogi.wms.logic.receive.ReceiveHistorySelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/receive/receiveHistory")
public class ReceiveHistoryResource extends AbstractWmsResource {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 入荷履歴データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ReceiveHistorySelectLogic selectLogic;

	/**
	 * <h2>初期処理</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * </pre>
	 * @return ReceiveHistoryDto 入荷履歴画面用DTO
	 */
	@GET
	@Path("/init")
	public ReceiveHistoryDto init() {
		return new ReceiveHistoryDto();
	}

	/**
	 * <h2>検索。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * ・入荷履歴DTOをキーに入荷履歴データ取り出し
	 * </pre>
	 * @param receiveHistoryDto 入荷履歴画面用DTO
	 * @return ReceiveHistoryDto 入荷履歴画面用DTO
	 */
	@GET
	@Path("/search")
	public ReceiveHistoryDto search(ReceiveHistoryDto receiveHistoryDto) throws IOException {

		ReceiveHistoryDto resultReceiveHistoryDto = new ReceiveHistoryDto();

		// Entity変換
		HReceiveHDtoMapper headerMapper = new HReceiveHDtoMapper();
		HReceiveH hReceiveH = headerMapper.mappingToEntity(receiveHistoryDto.data.head);
		HReceiveBDtoMapper bodyMapper = new HReceiveBDtoMapper();
		HReceiveB hReceiveB = bodyMapper.mappingToEntity(receiveHistoryDto.data.body);

		// 入荷履歴データ取得用
		PagingResultBean<HReceiveB> page = selectLogic.select(hReceiveH, hReceiveB, receiveHistoryDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// Dto変換処理
		List<HReceiveBDto> list = bodyMapper.mappingToDtoList(page);

		resultReceiveHistoryDto.paging = receiveHistoryDto.paging;
		resultReceiveHistoryDto.data.bodyList = list;

		return resultReceiveHistoryDto;
	}
}
