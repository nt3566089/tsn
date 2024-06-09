package com.oneslogi.wms.resources.inventory;

import java.text.ParseException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.dtomapper.TInventoryInstDtoMapper;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MCblk;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MClin;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.inventory.InventoryCreateDto;
import com.oneslogi.wms.logic.common.BlockLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.LineLogic;
import com.oneslogi.wms.logic.inventory.InventoryCreateLogic;
import com.oneslogi.wms.logic.stock.StockAdjustFlagCheckLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 在庫調査指示作成画面のリソースクラス。
 */
@Path("/inventory/inventoryCreate")
public class InventoryCreateResource extends AbstractWmsResource {
	
	
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private LineLogic lineLogic;
	@Inject
	private BlockLogic blockLogic;
	@Inject
	private StockAdjustFlagCheckLogic stockAdjustFlagCheckLogic;
	@Inject
	private InventoryCreateLogic inventoryCreateLogic;
	
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
		 * 該当データ無し
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 拠点マスタに存在しません
		 */
		protected static final int CENTER_NOT_FOUND = 3;
		/**
		 * 荷主マスタに存在しません
		 */
		protected static final int CLIENT_NOT_FOUND = 4;
		/**
		 * 荷主拠点マスタに存在しません
		 */
		protected static final int CLIENTCENTER_NOT_FOUND = 5;
		/**
		 * ラインマスタに存在しません
		 */
		protected static final int LINE_NOT_FOUND = 6;
		/**
		 * ブロックマスタに存在しません
		 */
		protected static final int BLOCK_NOT_FOUND = 7;
		/**
		 * 移動中在庫が存在しています
		 */
		protected static final int MOVING_STOCK_EXIST = 8;
		/**
		 * 既に仕分一連処理を実施済みのため、棚卸データを作成できません
		 */
		protected static final int SORTING_PROCESS_STARTED = 9;
		/**
		 * 仕分一連処理未実施のため、棚卸データを作成できません
		 */
		protected static final int SORTING_PROCESS_UNSTARTED = 15;
		/**
		 * 終了後検品の指示キー作成済です
		 */
		protected static final int SORTING_LINEWORK_COMPLETED = 10;
		/**
		 * 選択したライン/ブロックの仕分作業が完了していません。仕分作業完了登録を実行してください
		 */
		protected static final int SORTING_PROCESSIN_COMPLETE_LINEBLOCK = 11;
		/**
		 * 適品在庫実績が取り込まれていません
		 */
		protected static final int HANBAI_SUITABLE_PRODUCTSTOCKTYPE_UNRECEIVED = 12;
		/**
		 * 保管場在庫調査の指示が作成されていないため、在庫調査指示が作成できません
		 */
		protected static final int STORING_INVENTORY_INCOMPLETE = 13;
		/**
		 * 仕分場在庫調査(終了)の指示が作成されていないため、在庫調査指示が作成できません
		 */
		protected static final int SORTING_INVENTORY_INCOMPLETE = 14;
		/**
		 * 登録エラー
		 */
		protected static final int REGISTER_ERROR = 16;

	}
	

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return InventoryCreateDto 在庫調査指示一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public InventoryCreateDto init(@QueryParam("centerCd") String centerCd, @QueryParam("clientCd") String clientCd) {
		InventoryCreateDto dto = new InventoryCreateDto();
		//拠点データー取得
		MCenter center = new MCenter();
		center.setCenterCd(centerCd);
		center = centerLogic.getUkEntity(center, new ErrorStatus(StatusCode.CENTER_NOT_FOUND));
		if (getErrorManager().size() > 0) {
			return null;
		}
		//荷主データー取得
		MClient client = new MClient();
		client.setClientCd(clientCd);
		client = clientLogic.getUkEntity(client,new ErrorStatus(StatusCode.CLIENT_NOT_FOUND));
		// 結果判定
		if (getErrorManager().size() > 0) {
			return null;
		}
		//荷主拠点マスタ取得
		MClientCenter clientCenter = new MClientCenter();
		clientCenter.setClientId(client.getClientId());
		clientCenter.setCenterId(center.getCenterId());
		clientCenter = clientCenterLogic.getUkEntityCacheable(clientCenter,new ErrorStatus(StatusCode.CLIENTCENTER_NOT_FOUND));
		//初期画面項目取得
		dto.data.searchCondition.setHozeFlag(clientCenter.getMParamAsOne().getCenterKbn());
		return dto;
	}

	/**
	 * <h2>登録処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return InventoryCreateDto 在庫調査指示作成用DTO
	 * @throws ParseException 
	 */
	@POST
	@Path("/register")
	public StatusDto register(InventoryCreateDto inventoryCreateDto) throws ParseException {
		// Entity変換
		TInventoryInstDtoMapper mapper = new TInventoryInstDtoMapper();
		TInventoryInst entity = mapper.mappingToEntity(inventoryCreateDto.data.searchCondition);
		
		InventoryCreateDto dto = new InventoryCreateDto();
		//拠点データー取得
		String centerCd = entity.getTInventoryH().getMCenter().getCenterCd();
		MCenter center = new MCenter();
		center.setCenterCd(centerCd);
		center = centerLogic.getUkEntity(center, new ErrorStatus(StatusCode.CENTER_NOT_FOUND));
		if (getErrorManager().size() > 0) {
			return null;
		}
		//荷主データー取得
		String clientCd = entity.getTInventoryH().getMClient().getClientCd();
		MClient client = new MClient();
		client.setClientCd(clientCd);
		client = clientLogic.getUkEntity(client,new ErrorStatus(StatusCode.CLIENT_NOT_FOUND));
		//荷主ID取得
		Long clientId = client.getClientId();
		//拠点ID取得
		Long centerId = center.getCenterId();
		// 結果判定
		if (getErrorManager().size() > 0) {
			return null;
		}
		//ライン/ブロックCD取得
		String lineBlockCd = entity.getLineBlock();
		//ライン/ブロックの選択肢の頭文字を取得
		char lineOrblockFlag = entity.getLineBlock() != null ? entity.getLineBlock().charAt(0) : '\0';

		switch (lineOrblockFlag) {
			case 'L':
				//ラインマスタ情報取得
				MClin clin = lineLogic.getUkEntity(centerId, lineBlockCd,new ErrorStatus(StatusCode.LINE_NOT_FOUND));
				break;
			case 'B':
				//ブロックマスタ情報取得
				MCblk block = blockLogic.getUkEntity(centerId, lineBlockCd,new ErrorStatus(StatusCode.BLOCK_NOT_FOUND));
				break;
			default:
		}
		// 結果判定
		if (getErrorManager().size() > 0) {
			return null;
		}
		//荷主拠点マスタ取得
		MClientCenter clientCenter = new MClientCenter();
		clientCenter.setClientId(clientId);
		clientCenter.setCenterId(centerId);
		clientCenter = clientCenterLogic.getUkEntityCacheable(clientCenter,new ErrorStatus(StatusCode.CLIENTCENTER_NOT_FOUND));
		// 結果判定
		if (getErrorManager().size() > 0) {
			return null;
		}
		//在庫調査区分取得
		String inventoryInstKbn = entity.getInventoryInstKbn() == null ? "" : entity.getInventoryInstKbn();
		switch(inventoryInstKbn) {
			case"00":
				//移動中数存在チェック
				stockAdjustFlagCheckLogic.isMoveNumExist(centerId, clientId, CDef.LocGroup.$02.code(), new ErrorStatus(StatusCode.MOVING_STOCK_EXIST));
				// 結果判定
				if (getErrorManager().size() > 0) {
					return null;
				}
			break;
			case"01":
				//仕分一連処理確認
				stockAdjustFlagCheckLogic.isSroprtcntExist(centerId, clientCenter.getSystemDt(), inventoryInstKbn, new ErrorStatus(StatusCode.SORTING_PROCESS_STARTED));
				// 結果判定
				if (getErrorManager().size() > 0) {
					return null;
				}
				//移動中数存在チェック
				stockAdjustFlagCheckLogic.isMoveNumExist(centerId, clientId, CDef.LocGroup.$06.code(), new ErrorStatus(StatusCode.MOVING_STOCK_EXIST));
				// 結果判定
				if (getErrorManager().size() > 0) {
					return null;
				}
				break;
			case"02":
				//仕分一連処理確認
				stockAdjustFlagCheckLogic.isSroprtcntExist(centerId, clientCenter.getSystemDt(), inventoryInstKbn, new ErrorStatus(StatusCode.SORTING_PROCESS_UNSTARTED));
				// 結果判定
				if (getErrorManager().size() > 0) {
					return null;
				}
				//在庫調査状況確認
				stockAdjustFlagCheckLogic.isSortingLineWorkCompleted(centerId, clientId, clientCenter.getSystemDt(), new ErrorStatus(StatusCode.SORTING_LINEWORK_COMPLETED));
				// 結果判定
				if (getErrorManager().size() > 0) {
					return null;
				}
				//移動中数存在チェック
				stockAdjustFlagCheckLogic.isMoveNumExist(centerId, clientId, CDef.LocGroup.$06.code(), new ErrorStatus(StatusCode.MOVING_STOCK_EXIST));
				// 結果判定
				if (getErrorManager().size() > 0) {
					return null;
				}
				break;
			case "03":
				//仕分一連処理確認
				stockAdjustFlagCheckLogic.isSroprtcntExist(centerId, clientCenter.getSystemDt(), inventoryInstKbn, new ErrorStatus(StatusCode.SORTING_PROCESS_UNSTARTED));
				// 結果判定
				if (getErrorManager().size() > 0) {
					return null;
				}
				//方面指示終了確認
				stockAdjustFlagCheckLogic.isSortingProcessInCompleteLineBlock(centerId, clientId, entity.getLineBlock(), new ErrorStatus(StatusCode.SORTING_PROCESSIN_COMPLETE_LINEBLOCK));
				// 結果判定
				if (getErrorManager().size() > 0) {
					return null;
				}
				//移動中数存在チェック
				stockAdjustFlagCheckLogic.isMoveNumExist(centerId, clientId, CDef.LocGroup.$06.code(), new ErrorStatus(StatusCode.MOVING_STOCK_EXIST));
				// 結果判定
				if (getErrorManager().size() > 0) {
					return null;
				}
				break;
			case "04":
				//販売物流在庫情報存在チェック
				stockAdjustFlagCheckLogic.isHanbaiSuitableProductStockTypeUnreceived(centerId, clientId, clientCenter.getSystemDt(), inventoryInstKbn, new ErrorStatus(StatusCode.HANBAI_SUITABLE_PRODUCTSTOCKTYPE_UNRECEIVED));
				// 結果判定
				if (getErrorManager().size() > 0) {
					return null;
				}
				//保管場ロケ在庫調査状況チェック
				stockAdjustFlagCheckLogic.isStoringInventoryIncomplete(centerId, clientId, clientCenter.getSystemDt(), new ErrorStatus(StatusCode.STORING_INVENTORY_INCOMPLETE));
				// 結果判定
				if (getErrorManager().size() > 0) {
					return null;
				}
				//区分値明細IDを取得する
				BClassDtl bclassDtl = stockAdjustFlagCheckLogic.selectClassMaster(centerCd);
				//保管場ロケ在庫調査状況チェック2
				stockAdjustFlagCheckLogic.isSortingInventoryIncomplete(centerId, clientId, clientCenter.getSystemDt(), new ErrorStatus(StatusCode.SORTING_INVENTORY_INCOMPLETE));
				// 結果判定
				if (getErrorManager().size() > 0) {
					return null;
				}
				break;
			case "05":
				//販売物流在庫情報存在チェック
				stockAdjustFlagCheckLogic.isHanbaiSuitableProductStockTypeUnreceived(centerId, clientId, clientCenter.getSystemDt(), inventoryInstKbn, new ErrorStatus(StatusCode.HANBAI_SUITABLE_PRODUCTSTOCKTYPE_UNRECEIVED));
				break;
			case "06":
				//販売物流在庫情報存在チェック
				stockAdjustFlagCheckLogic.isHanbaiSuitableProductStockTypeUnreceived(centerId, clientId, clientCenter.getSystemDt(), inventoryInstKbn, new ErrorStatus(StatusCode.HANBAI_SUITABLE_PRODUCTSTOCKTYPE_UNRECEIVED));
				break;
			default:
		}
		inventoryCreateLogic.registerInventory(entity,clientCenter,center,client,new ErrorStatus(StatusCode.REGISTER_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			return null;
		}
		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	

}