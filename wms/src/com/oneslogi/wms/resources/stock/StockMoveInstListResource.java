package com.oneslogi.wms.resources.stock;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.TMoveInstBDto;
import com.oneslogi.base.dbflute.dtomapper.TMoveInstBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TMoveInstHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.wms.dto.stock.StockMoveInstListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.stock.StockMoveInstListSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 *在庫移動指示明細のリソースクラス。
 */
@Path("/stock/stockMoveInstList")
public class StockMoveInstListResource extends AbstractWmsResource {

	// ===== 定数定義 =====
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * 在庫移動指示明細データ取得異常
		 */
		protected static final int STOCK_DATA_SELECT_FAILED = 1;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private StockMoveInstListSelectLogic selectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	
	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return StockMoveInstListDto 在庫移動指示明細画面用DTO
	 */
	@GET
	@Path("/init")
	public StockMoveInstListDto init() {
		// 画面用DTO作成
		StockMoveInstListDto stockMoveInstListDto = new StockMoveInstListDto();

		return stockMoveInstListDto;
	}

	/**
	 * <h2>在庫移動指示明細データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・在庫移動指示明細データ取得取り出し
	 * ・在庫移動指示明細画面用DTOに設定
	 * </pre>
	 * @param  dto 在庫移動指示明細画面用DTO
	 * @return StockMoveInstListDto 在庫移動指示明細画面用DTO
	 */
	@GET
	@Path("/search")
	public StockMoveInstListDto search(StockMoveInstListDto dto) {
		StockMoveInstListDto result = new StockMoveInstListDto();
		
		// ===== Entity変換 =====
		TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper();
		TMoveInstH tMoveInstH = mapper.mappingToEntity(dto.data.head);

		// ===== 荷主Cd取得と荷主ID設定 =====
		MClient mClient = new MClient();
		mClient.setClientCd(tMoveInstH.getMClient().getClientCd());
		mClient= clientLogic.getUkEntity(mClient);
		if(mClient != null){
			tMoveInstH.setClientId(mClient.getClientId());
		}

		// ===== センタCd取得とセンタID設定 =====
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(tMoveInstH.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		if(mCenter != null){
			tMoveInstH.setCenterId(mCenter.getCenterId());
		}
		
        // ===== 在庫移動指示明細画面データ取得メソッドを呼出し =====
		// [#6799][OSS] ページング不正修正 2019.11.08 kawana Start
		PagingResultBean<TMoveInstB> selectEntity = selectLogic.select(tMoveInstH, dto.paging, errRetSts(StatusCode.STOCK_DATA_SELECT_FAILED));
		// [#6799][OSS] ページング不正修正 2019.11.08 kawana End

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// エンティティ編集
		for(TMoveInstB moveInstb : selectEntity){
			if(moveInstb.getLotId() != null){
				moveInstb.setLot(moveInstb.getTLot().getLot());
				moveInstb.setLimitDt(moveInstb.getTLot().getLimitDt());
			}
			if(moveInstb.getStoreNoId() != null){
				moveInstb.setStoreLabelNo(moveInstb.getTStoreNo().getStoreLabelNo());
			}
		}
		
		// ===== JSON通信のためにSimpleDTO変換 =====
		TMoveInstBDtoMapper mapper1 = new TMoveInstBDtoMapper();
		List<TMoveInstBDto> body = mapper1.mappingToDtoList(selectEntity);

		// ===== 画面用DTO ヘッダの作成 =====
		result.data.head = body.get(0).getTMoveInstH();
		result.data.body = body;
		// [#6799][OSS] ページング不正修正 2019.11.08 kawana Start
		result.paging = dto.paging;
		// [#6799][OSS] ページング不正修正 2019.11.08 kawana End

		return result;
	}
}
