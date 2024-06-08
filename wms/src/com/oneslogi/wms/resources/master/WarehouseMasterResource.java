package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dtomapper.MWarehouseDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.WarehouseMasterDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.WarehouseMasterCheckLogic;
import com.oneslogi.wms.logic.master.WarehouseMasterInsertLogic;
import com.oneslogi.wms.logic.master.WarehouseMasterSelectLogic;
import com.oneslogi.wms.logic.master.WarehouseMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 倉庫マスタ画面のリソースクラス。
 */
@Path("/master/warehouseMaster")
public class WarehouseMasterResource extends AbstractWmsResource {

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
		protected static final int NOT_FOUND_DATA = 3;
		/**
		 * 登録異常
		 */
		protected static final int WAREHOUSE_MASTER_INSERT_FAILED = 4;
		/**
		 * 更新異常
		 */
		protected static final int WAREHOUSE_MASTER_UPDATE_FAILED = 5;
		/**
		 * 倉庫マスタデータチェック異常
		 */
		protected static final int WAREHOUSE_MASTER_CHECK_FAILED = 6;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private WarehouseMasterSelectLogic warehouseMasterSelectLogic;
	@Inject
	private WarehouseMasterInsertLogic warehouseMasterInsertLogic;
	@Inject
	private WarehouseMasterUpdateLogic warehouseMasterUpdateLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private WarehouseMasterCheckLogic warehouseMasterCheckLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return WarehouseMasterDto 倉庫マスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public WarehouseMasterDto init() {
		return new WarehouseMasterDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・倉庫マスタDTOをキーに倉庫マスタデータ取り出し
	 * </pre>
	 * @param warehouseMasterDto 倉庫マスタ画面用DTO
	 * @return WarehouseMasterDto 倉庫マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public WarehouseMasterDto search(WarehouseMasterDto warehouseMasterDto) throws IOException {
		WarehouseMasterDto warehouseDto = new WarehouseMasterDto();

		// Entity変換
		MWarehouseDtoMapper mapper = new MWarehouseDtoMapper();
		MWarehouse warehouse = mapper.mappingToEntity(warehouseMasterDto.data.warehouseMasterSearch);

		//センタID取得
		String centerCd = warehouse.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		warehouse.setCenterId(mCenter.getCenterId());

		// 検索
		List<MWarehouse> page = warehouseMasterSelectLogic.select(warehouse, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<MWarehouseDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		warehouseDto.data.warehouseList = list;

		return warehouseDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・センタCD存在チェックエラー用メッセージ
	 * ・倉庫CD重複チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param warehouseMasterDto 倉庫マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(WarehouseMasterDto warehouseMasterDto) {
		// Entity変換
		MWarehouseDtoMapper mapper = new MWarehouseDtoMapper();
		List<MWarehouse> warehouseList = mapper.mappingToEntityList(warehouseMasterDto.data.warehouseList);

		// 登録データ組み立て
		warehouseMasterCheckLogic.checkWarehouseMaster(warehouseList, errRetSts(StatusCode.WAREHOUSE_MASTER_CHECK_FAILED));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		} else {
			// 確認表示
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		}

		return null;
	}

	/**
	 * <h2>倉庫マスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースに倉庫マスタデータを登録し、完了メッセージを設定する。
	 *
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param warehouseMasterDto 倉庫マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(WarehouseMasterDto warehouseMasterDto) {
		// Entity変換
		MWarehouseDtoMapper mapper = new MWarehouseDtoMapper();
		List<MWarehouse> warehouseList = mapper.mappingToEntityList(warehouseMasterDto.data.warehouseList);

		warehouseMasterCheckLogic.checkWarehouseMaster(warehouseList, errRetSts(StatusCode.WAREHOUSE_MASTER_CHECK_FAILED));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}
		// 登録ボディのリスト
		List<MWarehouse> insertList = new ArrayList<>();
		// 修正ボディのリスト
		List<MWarehouse> updateList = new ArrayList<>();

		for (MWarehouse mWarehouse : warehouseList) {
			// データの登録・更新判定
			if (mWarehouse.getWarehouseId() == null) {
				// 登録
				insertList.add(mWarehouse);
				//				warehouseMasterInsertLogic.insert(mWarehouse, errRetSts(StatusCode.WAREHOUSE_MASTER_INSERT_FAILED));
			} else {
				// 修正
				updateList.add(mWarehouse);
				//				warehouseMasterUpdateLogic.update(mWarehouse, errRetSts(StatusCode.WAREHOUSE_MASTER_UPDATE_FAILED));
			}
		}

		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW Start
		if (!insertList.isEmpty()) {
			warehouseMasterInsertLogic.batchInsert(insertList, errRetSts(StatusCode.WAREHOUSE_MASTER_INSERT_FAILED));
		}

		if (!updateList.isEmpty()) {
			warehouseMasterUpdateLogic.batchUpdate(updateList, errRetSts(StatusCode.WAREHOUSE_MASTER_INSERT_FAILED));
		}
		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW End

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 完了メッセージの設定
		//[ON推-品向-144]「正常に更新されました。」に修正 2014.11.26 衛 Start
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		//[ON推-品向-144]「正常に更新されました。」に修正 2014.11.26 衛 End
		return null;
	}
}
