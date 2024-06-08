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
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.dto.stock.StockMoveInstListDto;
import com.oneslogi.wms.dto.stock.StockMoveListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.stock.StockMoveInstListSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 在庫移動明細一覧のリソースクラス。
 */
@Path("/stock/stockMoveBodyList")
public class StockMoveBodyListResource extends AbstractWmsResource {

	// ===== 定数定義 =====
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		// [#924] 検索データがない場合のエラーが画面上部ではなくポップアップ表示される 2017.01.31 kawana Start
		/**
		 * 在庫移動指示明細データ取得異常
		 */
		protected static final int STOCK_DATA_SELECT_FAILED = 2;
		// [#924] 検索データがない場合のエラーが画面上部ではなくポップアップ表示される 2017.01.31 kawana End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private StockMoveInstListSelectLogic selectLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return stockMoveListDto 在庫移動一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public StockMoveListDto init() {
		// 画面用DTO作成
		StockMoveListDto stockMoveListDto = new StockMoveListDto();

		return stockMoveListDto;
	}

	/**
	 * <h2>在庫移動明細指示明細データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・在庫移動明細指示明細データ取得取り出し
	 * ・在庫移動明細指示明細画面用DTOに設定
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

		// ===== 倉庫IDを取得 =====
		String wrehouseCd = tMoveInstH.getWarehouseCd();
		if (!CU.isNullOrEmpty(wrehouseCd)) {
			MWarehouse warehouse = new MWarehouse();
			warehouse.setWarehouseCd(wrehouseCd);
			warehouse.setCenterId(mCenter.getCenterId());
			warehouse = warehouseLogic.getUkEntity(warehouse);
			if (warehouse != null) {
				tMoveInstH.setWarehouseId(warehouse.getWarehouseId());
			}
		}

		// ===== 処理区分IDを取得 =====
		String processTypeCd = tMoveInstH.getMProcessType().getProcessTypeCd();
		if (!CU.isNullOrEmpty(processTypeCd)) {
			MProcessType processType = new MProcessType();
			processType.setProcessTypeCd(processTypeCd);
			processType = processTypeLogic.getUkEntity(processType);
			if (processType != null) {
				tMoveInstH.setProcessTypeId(processType.getProcessTypeId());
			}
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
				// ロット
				moveInstb.setLot(moveInstb.getTLot().getLot());
				// 期限日
				moveInstb.setLimitDt(moveInstb.getTLot().getLimitDt());
			}

			if(moveInstb.getStoreNoId() != null){
				// 入庫ラベルNo.
				moveInstb.setStoreLabelNo(moveInstb.getTStoreNo().getStoreLabelNo());
			}

			// 入出庫区分名称
			if(moveInstb.getInoutType().equals("0")){
				moveInstb.setInoutTypeNm("入庫");
			}else{
				moveInstb.setInoutTypeNm("出庫");
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
