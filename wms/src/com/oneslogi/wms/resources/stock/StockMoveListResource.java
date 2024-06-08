package com.oneslogi.wms.resources.stock;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.AppCDef;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TMoveInstBCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstHCB;
import com.oneslogi.base.dbflute.dto.TMoveInstHDto;
import com.oneslogi.base.dbflute.dtomapper.MCenterDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MClientDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TMoveInstHDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstHBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveInstR;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStartEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.MoveLabelDto;
import com.oneslogi.wms.dto.report.StockReplenishLabelDto;
import com.oneslogi.wms.dto.report.StockSetInstListDto;
import com.oneslogi.wms.dto.stock.MoveLabelPrintDto;
import com.oneslogi.wms.dto.stock.ReplenishLabelPrintDto;
import com.oneslogi.wms.dto.stock.StockMoveListDto;
import com.oneslogi.wms.dto.stock.StockSetInstListPrintDto;
import com.oneslogi.wms.dto.stock.StockSetReleaseListPrintDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.stock.MoveLabelPrintLogic;
import com.oneslogi.wms.logic.stock.StockMoveListSelectLogic;
import com.oneslogi.wms.logic.stock.StockMoveListUpdateLogic;
import com.oneslogi.wms.logic.stock.StockReplenishLabelPrintLogic;
import com.oneslogi.wms.logic.stock.StockSetInstListPrintLogic;
import com.oneslogi.wms.logic.stock.StockSetReleaseListPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 在庫移動一覧のリソースクラス。
 */
@Path("/stock/stockMoveList")
public class StockMoveListResource extends AbstractWmsResource {

	// [ON推-品向-1034] 指示書発行機能追加 2015.12.21 koyama Start
	private static final String INST_REPORT_CD = "StockSetInstList";
	private static final String INST_PGM_CD = "StockSetInstListPrint";
	private static final String RELEASE_REPORT_CD = "StockSetReleaseList";
	private static final String RELEASE_PGM_CD = "StockSetReleaseListPrint";
	// [ON推-品向-1034] 指示書発行機能追加 2015.12.21 koyama End
	// [C-CWMS-0050] 補充ラベル発行機能追加 2016.1.28 koyama Start
	private static final String RG_REPLENISH_REPORT_CD = "RGReplenishLabel";
	private static final String EM_REPLENISH_REPORT_CD = "EMReplenishLabel";
	// [C-CWMS-0050] 補充ラベル発行機能追加 2016.1.28 koyama End

	//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Add Start
	private static final String MOVE_LABEL_REPORT_CD = "MoveLabel";
	//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Add End

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
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 在庫移動一覧データ取得異常
		 */
		protected static final int STOCK_MOVE_LIST_FAILED = 2;
		/**
		 * 在庫移動指示ボディデータ取得異常
		 */
		protected static final int T_MOVE_INST_B_NOT_FOUND_ERROR = 3;
		/**
		 * 在庫移動一覧チェック異常
		 */
		protected static final int STOCK_MOVE_LIST_CHECK_FAILED = 4;
		// [ON推-品向-1034] 指示書発行機能追加 2015.12.21 koyama Start
		/**
		 * 指示書発行データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 5;
		/**
		 * 指示書更新異常
		 */
		protected static final int UPDATE_EXCEPTION = 6;
		// [ON推-品向-1034] 指示書発行機能追加 2015.12.21 koyama End

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
	private StockMoveListSelectLogic stockMoveListSelectLogic;
	@Inject
	private StockMoveListUpdateLogic stockMoveListUpdateLogic;
	// [ON推-品向-1034] 指示書発行機能追加 2015.12.21 koyama Start
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private StockSetInstListPrintLogic stockSetInstListPrintLogic;
	@Inject
	private StockSetReleaseListPrintLogic stockSetReleaseListPrintLogic;
	// [ON推-品向-1034] 指示書発行機能追加 2015.12.21 koyama End
	// [C-CWMS-0050] 補充ラベル発行機能追加 2016.1.28 koyama Start
	@Inject
	private StockReplenishLabelPrintLogic stockReplenishLabelPrintLogic;
	// [C-CWMS-0050] 補充ラベル発行機能追加 2016.1.28 koyama End
	// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する 2016.06.17 kawana Start
	// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod Start
	// [#4220][Ver3.0] 帳票 - 表示項目最新化(推奨ロケ表示対象外のため削除) 2018.04.03 honma Delete
	// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod End
	// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する 2016.06.17 kawana End

	//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Add Start
	@Inject
	private MoveLabelPrintLogic moveLabelPrintLogic;
	//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Add End

	// ===== 使用テーブル =====
	@Inject
	private TMoveInstHBhv tMoveInstHBhv;
	@Inject
	private TMoveInstBBhv tMoveInstBBhv;

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
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力された、在庫移動情報を取得する
	 * </pre>
	 * @param dto 在庫移動一覧画面用DTO
	 * @return StockMoveListDto 在庫移動一覧画面用DTO
	 */
	@GET
	@Path("/search")
	public StockMoveListDto search(StockMoveListDto dto) throws Exception {
		StockMoveListDto stockMoveListDto = new StockMoveListDto();
		// エンティティ編集
		TMoveInstHDtoMapper tMapper = new TMoveInstHDtoMapper();
		TMoveInstH head = tMapper.mappingToEntity(dto.data.head);

		// ===== センタIDを取得 =====
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(head.getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();
		head.setCenterId(centerId);

		// ===== 荷主IDを取得 =====
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(head.getMClient().getClientCd());
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();
		head.setClientId(clientId);

		// ===== 倉庫IDを取得 =====
		String wrehouseCd = head.getWarehouseCd();
		if (!CU.isNullOrEmpty(wrehouseCd)) {
			MWarehouse warehouse = new MWarehouse();
			warehouse.setWarehouseCd(wrehouseCd);
			warehouse.setCenterId(centerId);
			warehouse = warehouseLogic.getUkEntity(warehouse);
			if (warehouse != null) {
				head.setWarehouseId(warehouse.getWarehouseId());
			}
		}

		// ===== 処理区分IDを取得 =====
		String processTypeCd = head.getMProcessType().getProcessTypeCd();
		if (!CU.isNullOrEmpty(processTypeCd)) {
			MProcessType processType = new MProcessType();
			processType.setProcessTypeCd(processTypeCd);
			processType = processTypeLogic.getUkEntity(processType);
			if (processType != null) {
				head.setProcessTypeId(processType.getProcessTypeId());
			}
		}

		// 在庫移動一覧データ取得.在庫移動一覧データ取得メソッドを呼出し
		List<TMoveInstH> page = stockMoveListSelectLogic.select(head, dto.paging, errRetSts(StatusCode.STOCK_MOVE_LIST_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// JSON通信のためにSimpleDTO変換
		TMoveInstHDtoMapper mMapper = new TMoveInstHDtoMapper();
		List<TMoveInstHDto> list = mMapper.mappingToDtoList(page);

		// 検索結果詰込処理
		stockMoveListDto.data.list = list;
		stockMoveListDto.paging = dto.paging;
		return stockMoveListDto;
	}

	/**
	 * <h2>更新前チェック処理。</h2>
	 * <pre>
	 * ・更新前チェック処理
	 *
	 * </pre>
	 * @param dto 在庫移動一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/updateCheck")
	public StatusDto updateCheck(StockMoveListDto dto) {
		// チェック処理
		setupUpdateCheck(dto);

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 確認表示
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}

	/***
	 * <h2>チェック処理。</h2>
	 * <pre>
	 * ・チェック処理
	 * </pre>
	 *
	 * @param moveInstHList
	 */
	private StatusDto setupUpdateCheck(StockMoveListDto dto) {
		// エンティティ編集
		TMoveInstHDtoMapper tMapper = new TMoveInstHDtoMapper();
		List<TMoveInstH> list = tMapper.mappingToEntityList(dto.data.list);

		// 在庫移動指示ボディ件数で繰り返し
		for (TMoveInstH moveInstH : list) {
			// 在庫移動指示ステータスが"00"(未作業)又は"01"(作業中)以外の場合
			TMoveInstHCB cb = tMoveInstHBhv.newMyConditionBean();
			cb.query().setMoveInstHId_Equal(moveInstH.getMoveInstHId());
			//[ON推-品向-1081] 修正対応 2016.4.14 chou Mod Start
			cb.orScopeQuery(new OrQuery<TMoveInstHCB>() {
				@Override
				public void query(TMoveInstHCB arg0) {
					//未作業
					arg0.query().setMoveInstStatus_Equal_$00();
					//作業中
					arg0.query().setMoveInstStatus_Equal_$01();
				}
			});
			//[ON推-品向-1081] 修正対応 2016.4.14 chou Mod End
			int count = tMoveInstHBhv.selectCount(cb);

			if (count == 0) {
				getErrorManager().add(this.errRetSts(StatusCode.STOCK_MOVE_LIST_CHECK_FAILED), WmsMessageConst.EXCLUSIVE_CONTROL_ERROR);
				return null;
			}
		}

		return null;
	}

	/**
	 * <h2>完了処理。</h2>
	 * <pre>
	 * 在庫移動指示を更新し、完了メッセージを設定する
	 *
	 * 更新データに次の値を設定する
	 * ・在庫移動指示ヘッダ
	 * ・在庫移動指示ボディ
	 * </pre>
	 * @param dto 在庫移動一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStartEnd("StockMoveList")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public StatusDto register(StockMoveListDto dto) throws Exception {
		// エンティティ編集
		TMoveInstHDtoMapper tMapper = new TMoveInstHDtoMapper();
		List<TMoveInstH> list = tMapper.mappingToEntityList(dto.data.list);

		// チェック処理
		setupUpdateCheck(dto);

		// エラー有りの場合は終了
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		BigDecimal stockSetInstnum = WCC.ZERO;
		BigDecimal stockSetReleasenum = WCC.ZERO;
		BigDecimal rGReplenishnum = WCC.ZERO;
		BigDecimal eMReplenishnum = WCC.ZERO;
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// 在庫移動指示ヘッダ件数で繰り返し
		for (TMoveInstH moveInstH : list) {
			// 在庫移動指示ヘッダより、ボディを取得
			TMoveInstBCB cbB = tMoveInstBBhv.newMyConditionBean();
			cbB.setupSelect_TMoveInstH();
			// 在庫移動指示ヘッダID
			cbB.query().setMoveInstHId_Equal(moveInstH.getMoveInstHId());
			// [ON推-CT113-004] ステータス条件を削除し、処理区分の判定を追加する SJA 2015.12.22 Start
			// 在庫移動指示ステータス
			//cbB.query().setMoveInstStatus_Equal_$01();
			cbB.orScopeQuery(new OrQuery<TMoveInstBCB>() {
				@Override
				public void query(TMoveInstBCB arg0) {
					// セット組指示
					arg0.query().queryTMoveInstH().queryMProcessType().setProcessTypeCd_Equal(CDef.ProcessTypeCd.$30.code());
					// セット解除指示
					arg0.query().queryTMoveInstH().queryMProcessType().setProcessTypeCd_Equal(CDef.ProcessTypeCd.$31.code());
					//[ON推-品向-1081] 修正対応 2016.4.14 chou Add Start
					// 定期補充
					arg0.query().queryTMoveInstH().queryMProcessType().setProcessTypeCd_Equal(CDef.ProcessTypeCd.$32.code());
					// 緊急補充
					arg0.query().queryTMoveInstH().queryMProcessType().setProcessTypeCd_Equal(CDef.ProcessTypeCd.$33.code());
					//[ON推-品向-1081] 修正対応 2016.4.14 chou Add End
					// [#2233] 処理対象に処理区分【移動】を追加 2017.08.22 ase Start
					// 移動
					arg0.query().queryTMoveInstH().queryMProcessType().setProcessTypeCd_Equal(CDef.ProcessTypeCd.$21.code());
					// [#2233] 処理対象に処理区分【移動】を追加 2017.08.22 ase End
				}
			});
			// [ON推-CT113-004] ステータス条件を削除し、処理区分の判定を追加する SJA 2015.12.22 End
			// 検索実行
			List<TMoveInstB> moveInstBList = tMoveInstBBhv.selectList(cbB);
			if (moveInstBList.size() == 0) {
				//[ON推-品向-1081] 修正対応 2016.4.14 chou Add Start
				getErrorManager().add(this.errRetSts(StatusCode.T_MOVE_INST_B_NOT_FOUND_ERROR), WmsMessageConst.STOCK_CANNOT_EXECUTE_SET_REPLENISH_DATA_ERROR);
				//[ON推-品向-1081] 修正対応 2016.4.14 chou Add End
				return null;
			}

			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
			////30:セット組指示
			if (moveInstH.getMProcessType().getProcessTypeCd().equals(CDef.ProcessTypeCd.$30.code())) {
				stockSetInstnum = WCC.add(stockSetInstnum,moveInstH.getInstTotalNum());
			}
			////31:セット解除指示
			if (moveInstH.getMProcessType().getProcessTypeCd().equals(CDef.ProcessTypeCd.$31.code())) {
				stockSetReleasenum = WCC.add(stockSetReleasenum,moveInstH.getInstTotalNum());
			}
			////32:定期補充
			if (moveInstH.getMProcessType().getProcessTypeCd().equals(CDef.ProcessTypeCd.$32.code())) {
				rGReplenishnum = WCC.add(rGReplenishnum,moveInstH.getInstTotalNum());

			}
			////33:緊急補充
			if (moveInstH.getMProcessType().getProcessTypeCd().equals(CDef.ProcessTypeCd.$33.code())) {
				eMReplenishnum = WCC.add(eMReplenishnum,moveInstH.getInstTotalNum());
			}
			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End


			// 在庫移動一覧処理.完了処理メソッドを呼出し
			stockMoveListUpdateLogic.update_finished(moveInstH, moveInstBList, errRetSts(StatusCode.STOCK_MOVE_LIST_FAILED));
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		//30:セット組指示
		if (stockSetInstnum !=WCC.ZERO) {
			appendWorkLogWorkCd("StockSetInst");
			//数量
			setWorkLogQty(stockSetInstnum);
			//センタ
			setWorkLogCenterCd(list.get(0).getMCenter().getCenterCd());
			//荷主
			setWorkLogClientCd(list.get(0).getMClient().getClientCd());
		}
		//31:セット解除指示
		if (stockSetReleasenum !=WCC.ZERO) {
			appendWorkLogWorkCd("StockSetRelease");
			//数量
			setWorkLogQty(stockSetReleasenum);
			//センタ
			setWorkLogCenterCd(list.get(0).getMCenter().getCenterCd());
			//荷主
			setWorkLogClientCd(list.get(0).getMClient().getClientCd());
		}
		//32:定期補充
		if (rGReplenishnum !=WCC.ZERO) {
			appendWorkLogWorkCd("RGReplenish");
			//数量
			setWorkLogQty(rGReplenishnum);
			//センタ
			setWorkLogCenterCd(list.get(0).getMCenter().getCenterCd());
			//荷主
			setWorkLogClientCd(list.get(0).getMClient().getClientCd());
		}
		//33:緊急補充
		if (eMReplenishnum !=WCC.ZERO) {
			appendWorkLogWorkCd("EMReplenish");
			//数量
			setWorkLogQty(eMReplenishnum);
			//センタ
			setWorkLogCenterCd(list.get(0).getMCenter().getCenterCd());
			//荷主
			setWorkLogClientCd(list.get(0).getMClient().getClientCd());
		}
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// ===== 完了メッセージの設定 =====
		getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>取消処理。</h2>
	 * 在庫移動指示を更新し、完了メッセージを設定する
	 *
	 * 更新データに次の値を設定する
	 * ・在庫移動指示ヘッダ
	 * ・在庫移動指示ボディ
	 * <pre>
	 *
	 * </pre>
	 * @param dto 在庫移動一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/cancel")
	public StatusDto cancel(StockMoveListDto dto) throws Exception {
		// エンティティ編集
		TMoveInstHDtoMapper tMapper = new TMoveInstHDtoMapper();
		List<TMoveInstH> list = tMapper.mappingToEntityList(dto.data.list);

		// チェック処理
		setupUpdateCheck(dto);

		// エラー有りの場合は終了
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 在庫移動指示ヘッダ件数で繰り返し
		for (TMoveInstH moveInstH : list) {
			// 在庫移動指示ヘッダより、ボディを取得
			TMoveInstBCB cbB = tMoveInstBBhv.newMyConditionBean();
			cbB.setupSelect_TMoveInstH();
			// 在庫移動指示ヘッダID
			cbB.query().setMoveInstHId_Equal(moveInstH.getMoveInstHId());
			// [ON推-CT113-007] ステータス条件を削除する 2015.12.22 SJA Start
			// 在庫移動指示ステータス
			//cbB.query().setMoveInstStatus_Equal_$01();
			// [ON推-CT113-007] ステータス条件を削除する 2015.12.22 SJA End
			// ソート順
			cbB.query().addOrderBy_InoutType_Desc();
			// 検索実行
			List<TMoveInstB> moveInstBList = tMoveInstBBhv.selectList(cbB);
			if (moveInstBList.size() == 0) {
				getErrorManager().add(this.errRetSts(StatusCode.T_MOVE_INST_B_NOT_FOUND_ERROR), WmsMessageConst.EXCLUSIVE_CONTROL_ERROR);
				return null;
			}

			// 在庫移動一覧処理.取消処理メソッドを呼出し
			stockMoveListUpdateLogic.update_cancel(moveInstH, moveInstBList, errRetSts(StatusCode.STOCK_MOVE_LIST_FAILED));

			// エラー有りの場合は終了
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		// ===== 完了メッセージの設定 =====
		getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>帳票ID検索処理。</h2>
	 * <pre>
	 * ・帳票IDを取得
	 * </pre>
	 * @param instData releaseData
	 * @return stockMoveListDto 在庫移動一覧画面用DTO
	 */
	@GET
	@Path("/searchReportId")
	public StockMoveListDto searchReportId(String processType) throws Exception {

		StockMoveListDto stockMoveListDto = new StockMoveListDto();

		// [C-CWMS-0050] 補充ラベル発行機能追加 2016.1.28 koyama Start
		// セット組指示書
		if (AppCDef.ProcessTypeCd.$30.code().equals(processType)) {
			stockMoveListDto.data.directionsPrintParam.printBasicData.reportId = reportLogic.getReportId(INST_REPORT_CD);
		}

		// セット組解除指示書
		if (AppCDef.ProcessTypeCd.$31.code().equals(processType)) {
			stockMoveListDto.data.directionsPrintParam.printBasicData.reportId = reportLogic.getReportId(RELEASE_REPORT_CD);
		}

		// 定期補充ラベル
		if (AppCDef.ProcessTypeCd.$32.code().equals(processType)) {
			stockMoveListDto.data.directionsPrintParam.printBasicData.reportId = reportLogic.getReportId(RG_REPLENISH_REPORT_CD);
		}

		// 緊急補充ラベル
		if (AppCDef.ProcessTypeCd.$33.code().equals(processType)) {
			stockMoveListDto.data.directionsPrintParam.printBasicData.reportId = reportLogic.getReportId(EM_REPLENISH_REPORT_CD);
		}
		// [C-CWMS-0050] 補充ラベル発行機能追加 2016.1.28 koyama End

		//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Add Start
		// 搬送ラベル
		if (AppCDef.ProcessTypeCd.$21.code().equals(processType) || AppCDef.ProcessTypeCd.$29.code().equals(processType)) {
			stockMoveListDto.data.directionsPrintParam.printBasicData.reportId = reportLogic.getReportId(MOVE_LABEL_REPORT_CD);
		}
		//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Add End
		return stockMoveListDto;

	}

	/**
	 * <h2>セット組指示書発行。</h2>
	 * <pre>
	 * ・コントロールNo.を更新してから、セット組指示書発行リストデータを取得する
	 * ・帳票を発行する
	 * ・エラーがない場合は、データベースにセット組指示書発行データを更新する
	 * ・・セット組指示書発行リスト出力フラグ
	 * </pre>
	 * @param dto dto 在庫移動一覧画面用DTO
	 * @return StockSetInstListPrintDto セット組指示書発行リスト画面用DTO
	 * @throws Exception
	 */
	@GET
	@Path("/instPrint")
	public StockSetInstListPrintDto instPrint(StockMoveListDto dto) throws Exception {

		// セット組指示書発行画面DTO
		StockSetInstListPrintDto stockSetInstListPrintDto = new StockSetInstListPrintDto();
		stockSetInstListPrintDto.printBasicData = dto.data.directionsPrintParam.printBasicData;

		// [C-CWMS-0050] 補充ラベル発行機能追加に伴い削除 2016.2.3 koyama Start
//		// 発行帳票を指定
//		stockSetInstListPrintDto.printBasicData.reportId = reportLogic.getReportId(INST_REPORT_CD);
		// [C-CWMS-0050] 補充ラベル発行機能追加に伴い削除 2016.2.3 koyama End

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// Entity変換
		TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper();
		List<TMoveInstH> tMoveInstHList = mapper.mappingToEntityList(dto.data.list);

		//コントロールNo更新
		TMoveInstR update = new TMoveInstR();

		TMoveInstR report = new TMoveInstR();

		//エンティティ編集
		update.setControlNo(controlNo);

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
		stockSetInstListPrintLogic.updateControlNoById(update, tMoveInstHList, errRetSts(StatusCode.UPDATE_EXCEPTION));

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		//セット組指示書帳票(検索用)
		report.setControlNo(update.getControlNo());

		//セット組指示書発行データ取得メソッドを呼出し
		List<StockSetInstListDto> stockSetInstList = stockSetInstListPrintLogic.select(update, errRetSts(StatusCode.NOT_FOUND_DATA));

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 帳票出力データ取得処理
		List<StockSetInstListDto> dataList = new ArrayList<StockSetInstListDto>();
		boolean blnFirst = true;
		String moveSlipNoPre = null;
		String productCdPre = "";
		String isFirstFlg = "0";
		for (StockSetInstListDto printList : stockSetInstList) {
			StockSetInstListDto redto = new StockSetInstListDto();
			redto.setCultureId(getCultureId());
			redto.setReportCd(INST_REPORT_CD);
			redto.setPgmCd(INST_PGM_CD);
			redto.printFlg = printList.printFlg;

			isFirstFlg = "0";
			if (!blnFirst == true) {
				if (!moveSlipNoPre.equals(printList.getMoveSlipNo()) || !productCdPre.equals(printList.getProductCd())) {
					dataList.get(dataList.size() - 1).setIsLastFlg("1");
					isFirstFlg = "1";
				}
			} else {
				isFirstFlg = "1";
				blnFirst = false;
			}
			moveSlipNoPre = printList.getMoveSlipNo();
			productCdPre = printList.getProductCd();

			// ヘッダ設定
			redto.setMoveSlipNo(printList.getMoveSlipNo());
			redto.setCenterCd(printList.getCenterCd());
			redto.setCenterNm(printList.getCenterNm());
			redto.setClientCd(printList.getClientCd());
			redto.setClientNm(printList.getClientNm());
			redto.setWarehouseCd(printList.getWarehouseCd());
			redto.setWarehouseNm(printList.getWarehouseNm());
			redto.setProductCdH(printList.getProductCdH());
			redto.setProductNmH(printList.getProductNmH());
			redto.setDepositCdH(printList.getDepositCdH());
			redto.setDepositNmH(printList.getDepositNmH());
			redto.setStockTypeCdH(printList.getStockTypeCdH());
			redto.setStockTypeNmH(printList.getStockTypeNmH());
			redto.setLocationCdH(printList.getLocationCdH());
			redto.setLocationNmH(printList.getLocationNmH());
			redto.setInstNumH(printList.getInstNumH());
			redto.setLotH(printList.getLotH());
			redto.setLimitDtH(printList.getLimitDtH());
			redto.setStoreDtH(printList.getStoreDtH());

			// 明細設定
			redto.setProductCd(printList.getProductCd());
			redto.setProductNm(printList.getProductNm());
			redto.setDepositCd(printList.getDepositCd());
			redto.setDepositNm(printList.getDepositNm());
			redto.setUnitNum(printList.getUnitNum());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara Start
			redto.setJanCd(printList.getJanCd());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara End
			redto.setStoreLabelNo(printList.getStoreLabelNo());
			redto.setStockTypeCd(printList.getStockTypeCd());
			redto.setStockTypeNm(printList.getStockTypeNm());
			redto.setLocationCd(printList.getLocationCd());
			redto.setLocationNm(printList.getLocationNm());
			redto.setInstNum(printList.getInstNum());
			// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Add Start
			redto.setMinimumPackingUnit(printList.getMinimumPackingUnit());
			// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Add End
			redto.setLot(printList.getLot());
			redto.setLimitDt(printList.getLimitDt());
			redto.setStoreDt(printList.getStoreDt());
			redto.setChargeNum(printList.getChargeNum());
			redto.setIsFirstFlg(isFirstFlg);
			redto.setIsLastFlg("0");

			dataList.add(redto);
		}
		dataList.get(dataList.size() - 1).setIsLastFlg("1");

		//帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		//セット組指示書を発行する
		stockSetInstListPrintDto.printBasicData.outputData = json.format(dataList);
		printLogic.print(stockSetInstListPrintDto);

		Timestamp time = new Timestamp(System.currentTimeMillis());

		//在庫移動指示帳票更新
		update.setControlNo(null);

		update.setInstOutFlg_$1();

		update.setInstOutUserId(this.getUserId());

		update.setInstOutDt(time);

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		stockSetInstListPrintLogic.updateOutFlg(update, report, errRetSts(StatusCode.UPDATE_EXCEPTION));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return stockSetInstListPrintDto;
	}

	/**
	 * <h2>セット解除指示書発行。</h2>
	 * <pre>
	 * ・コントロールNo.を更新してから、セット組指示書発行リストデータを取得する
	 * ・帳票を発行する
	 * ・エラーがない場合は、データベースにセット組指示書発行データを更新する
	 * ・・セット解除指示書発行リスト出力フラグ
	 * </pre>
	 * @param dto dto 在庫移動一覧画面用DTO
	 * @return stockSetReleaseListPrintDto セット解除指示書発行リスト画面用DTO
	 * @throws Exception
	 */
	@GET
	@Path("/releasePrint")
	public StockSetReleaseListPrintDto releasePrint(StockMoveListDto dto) throws Exception {

		// セット解除指示書発行画面DTO
		StockSetReleaseListPrintDto stockSetReleaseListPrintDto = new StockSetReleaseListPrintDto();
		stockSetReleaseListPrintDto.printBasicData = dto.data.directionsPrintParam.printBasicData;

		// [C-CWMS-0050] 補充ラベル発行機能追加に伴い削除 2016.2.3 koyama Start
//		// 発行帳票を指定
//		stockSetReleaseListPrintDto.printBasicData.reportId = reportLogic.getReportId(RELEASE_REPORT_CD);
		// [C-CWMS-0050] 補充ラベル発行機能追加に伴い削除 2016.2.3 koyama End

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// Entity変換
		TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper();
		List<TMoveInstH> tMoveInstHList = mapper.mappingToEntityList(dto.data.list);

		//コントロールNo更新
		TMoveInstR update = new TMoveInstR();

		TMoveInstR report = new TMoveInstR();

		//エンティティ編集
		update.setControlNo(controlNo);

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
		stockSetReleaseListPrintLogic.updateControlNoById(update, tMoveInstHList, errRetSts(StatusCode.UPDATE_EXCEPTION));

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		//セット解除指示書帳票(検索用)
		report.setControlNo(update.getControlNo());

		//セット解除指示書発行データ取得メソッドを呼出し
		List<StockSetInstListDto> stockSetInstList = stockSetReleaseListPrintLogic.select(update, errRetSts(StatusCode.NOT_FOUND_DATA));

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 帳票出力データ取得処理
		List<StockSetInstListDto> dataList = new ArrayList<StockSetInstListDto>();
		boolean blnFirst = true;
		String moveSlipNoPre = null;
		String productCdPre = "";
		String isFirstFlg = "0";
		for (StockSetInstListDto printList : stockSetInstList) {
			StockSetInstListDto redto = new StockSetInstListDto();
			redto.setCultureId(getCultureId());
			redto.setReportCd(RELEASE_REPORT_CD);
			redto.setPgmCd(RELEASE_PGM_CD);
			redto.printFlg = printList.printFlg;

			isFirstFlg = "0";
			if (!blnFirst == true) {
				if (!moveSlipNoPre.equals(printList.getMoveSlipNo()) || !productCdPre.equals(printList.getProductCd())) {
					dataList.get(dataList.size() - 1).setIsLastFlg("1");
					isFirstFlg = "1";
				}
			} else {
				isFirstFlg = "1";
				blnFirst = false;
			}
			moveSlipNoPre = printList.getMoveSlipNo();
			productCdPre = printList.getProductCd();

			// ヘッダ設定
			redto.setMoveSlipNo(printList.getMoveSlipNo());
			redto.setCenterCd(printList.getCenterCd());
			redto.setCenterNm(printList.getCenterNm());
			redto.setClientCd(printList.getClientCd());
			redto.setClientNm(printList.getClientNm());
			redto.setWarehouseCd(printList.getWarehouseCd());
			redto.setWarehouseNm(printList.getWarehouseNm());
			redto.setProductCdH(printList.getProductCdH());
			redto.setProductNmH(printList.getProductNmH());
			redto.setDepositCdH(printList.getDepositCdH());
			redto.setDepositNmH(printList.getDepositNmH());
			redto.setStockTypeCdH(printList.getStockTypeCdH());
			redto.setStockTypeNmH(printList.getStockTypeNmH());
			redto.setLocationCdH(printList.getLocationCdH());
			redto.setLocationNmH(printList.getLocationNmH());
			redto.setInstNumH(printList.getInstNumH());
			redto.setLotH(printList.getLotH());
			redto.setLimitDtH(printList.getLimitDtH());
			redto.setStoreDtH(printList.getStoreDtH());

			// 明細設定
			redto.setProductCd(printList.getProductCd());
			redto.setProductNm(printList.getProductNm());
			redto.setDepositCd(printList.getDepositCd());
			redto.setDepositNm(printList.getDepositNm());
			redto.setUnitNum(printList.getUnitNum());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara Start
			redto.setJanCd(printList.getJanCd());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara End
			redto.setStoreLabelNo(printList.getStoreLabelNo());
			redto.setStockTypeCd(printList.getStockTypeCd());
			redto.setStockTypeNm(printList.getStockTypeNm());
			redto.setLocationCd(printList.getLocationCd());
			redto.setLocationNm(printList.getLocationNm());
			redto.setInstNum(printList.getInstNum());
			// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Add Start
			redto.setMinimumPackingUnit(printList.getMinimumPackingUnit());
			// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Add End
			redto.setLot(printList.getLot());
			redto.setLimitDt(printList.getLimitDt());
			redto.setStoreDt(printList.getStoreDt());
			redto.setChargeNum(printList.getChargeNum());
			redto.setIsFirstFlg(isFirstFlg);
			redto.setIsLastFlg("0");

			dataList.add(redto);
		}
		dataList.get(dataList.size() - 1).setIsLastFlg("1");

		//帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		//セット解除指示書を発行する
		stockSetReleaseListPrintDto.printBasicData.outputData = json.format(dataList);
		printLogic.print(stockSetReleaseListPrintDto);

		Timestamp time = new Timestamp(System.currentTimeMillis());

		//在庫移動指示帳票更新
		update.setControlNo(null);

		update.setInstOutFlg_$1();

		update.setInstOutUserId(this.getUserId());

		update.setInstOutDt(time);

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		stockSetReleaseListPrintLogic.updateOutFlg(update, report, errRetSts(StatusCode.UPDATE_EXCEPTION));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return stockSetReleaseListPrintDto;
	}

	// [C-CWMS-0050] 補充ラベル発行機能追加 2016.1.28 koyama Start
	/**
	 * <h2>補充ラベル発行。</h2>
	 * <pre>
	 * ・コントロールNo.を更新してから、セット組指示書発行リストデータを取得する
	 * ・帳票を発行する
	 * ・エラーがない場合は、データベースにセット組指示書発行データを更新する
	 * ・・セット組指示書発行リスト出力フラグ
	 * </pre>
	 * @param dto dto 在庫移動一覧画面用DTO
	 * @return ReplenishLabelPrintDto セット組指示書発行リスト画面用DTO
	 * @throws Exception
	 */
	@GET
	@Path("/replenishPrint")
	public ReplenishLabelPrintDto replenishPrint(StockMoveListDto dto) throws Exception {

		// 補充ラベルDTO
		ReplenishLabelPrintDto replenishLabelPrintDto = new ReplenishLabelPrintDto();
		replenishLabelPrintDto.printBasicData = dto.data.directionsPrintParam.printBasicData;

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// Entity変換
		TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper();
		List<TMoveInstH> tMoveInstHList = mapper.mappingToEntityList(dto.data.list);

		//コントロールNo更新
		TMoveInstR update = new TMoveInstR();

		TMoveInstR report = new TMoveInstR();

		//エンティティ編集
		update.setControlNo(controlNo);

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
		stockReplenishLabelPrintLogic.updateControlNoById(update, tMoveInstHList, errRetSts(StatusCode.UPDATE_EXCEPTION));

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 補充ラベル帳票(検索用)
		report.setControlNo(update.getControlNo());

		// ケース荷姿ID取得用
		MClientDtoMapper mClientMapper = new MClientDtoMapper();
		MClient mClient = mClientMapper.mappingToEntity(dto.data.head.getMClient());
		MCenterDtoMapper mCenterDtoMapper = new MCenterDtoMapper();
		MCenter mCenter = mCenterDtoMapper.mappingToEntity(dto.data.head.getMCenter());

		// 補充ラベル発行データ取得メソッドを呼出し
		List<TMoveInstB> stockReplenishLabel = stockReplenishLabelPrintLogic.select(update, mClient, mCenter, errRetSts(StatusCode.NOT_FOUND_DATA));

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 帳票出力データ取得処理
		List<StockReplenishLabelDto> dataList = new ArrayList<StockReplenishLabelDto>();
		StockReplenishLabelDto redto = null;
		for(int i = 0 ; i < stockReplenishLabel.size() ; i++){
			if (redto == null) {

				// 総ピース数
				BigDecimal storeNum = WCC.ZERO;
				// [#2962][Ver3.0] 不要なピース・ケース換算処理を削除 2018.02.19 miyabe Delete
				// ピース数
				BigDecimal paraNum = WCC.ZERO;
				// 入数
				Long unitNum = new Long(0);

				// 総ピース数
				if(stockReplenishLabel.get(i).getInstNum() != null){
					storeNum = stockReplenishLabel.get(i).getInstNum();
				}

				// ケース数
				if(stockReplenishLabel.get(i).getMProduct().getMProductShapeList().size() > 0){
					if(stockReplenishLabel.get(i).getMProduct().getMProductShapeList().get(0).getUnitNum() != null){
						unitNum = stockReplenishLabel.get(i).chaseMProduct().getMProductShapeList().get(0).getUnitNum();
					}
				}

				// 数量計算
				// 入数が1以上の場合
				if(WCC.isGreaterEqual(unitNum, WCC.ONE)){
					// ピース数 = 総ピース数 ÷ 入数 の余り
					paraNum = WCC.remainder(storeNum, unitNum);

					// [#2962][Ver3.0] 不要なピース・ケース換算処理を削除 2018.02.19 miyabe Delete
				}else{
					// ピース数 = 総ピース数
					paraNum = storeNum;
				}

				// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する 2016.06.17 kawana Start
				// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod Start
				// [#4220][Ver3.0] 帳票 - 表示項目最新化(推奨ロケ表示対象外のため削除) 2018.04.03 honma Delete
				// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod End
				// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する 2016.06.17 kawana End

				// [#4220][Ver3.0] 帳票 - 表示項目最新化(推奨ロケ表示対象外のため削除) 2018.04.03 honma Delete

				// 初期化
				redto = new StockReplenishLabelDto();

				redto.setCultureId(getCultureId());

				// 荷主CD
				redto.setClientCd(stockReplenishLabel.get(i).chaseTMoveInstH().chaseMClient().getClientCd());

				// 荷主名称
				redto.setClientNm(stockReplenishLabel.get(i).chaseTMoveInstH().chaseMClient().getClientNm());

				// センタCD
				redto.setCenterCd(stockReplenishLabel.get(i).chaseTMoveInstH().chaseMCenter().getCenterCd());

				// センタ名称
				redto.setCenterNm(stockReplenishLabel.get(i).chaseTMoveInstH().chaseMCenter().getCenterNm());

				// 商品CD
				if (!CU.isNullOrEmpty(stockReplenishLabel.get(i).chaseMProduct().getProductCd())) {
					redto.setProductCd(stockReplenishLabel.get(i).chaseMProduct().getProductCd());
				} else {
					redto.setProductCd("");
				}

				// 商品名称
				redto.setProductNm(stockReplenishLabel.get(i).chaseMProduct().getProductAbbr());

				// JANCD
				if (!CU.isNullOrEmpty(stockReplenishLabel.get(i).chaseMProduct().getJanCd())) {
					redto.setJanCd(stockReplenishLabel.get(i).chaseMProduct().getJanCd());
				} else {
					redto.setJanCd("");
				}

				// 預託
				redto.setDepositNm(stockReplenishLabel.get(i).chaseMCustomerByDepositId().getCustomerAbbr());

				// 期限日
				redto.setLimitDt(stockReplenishLabel.get(i).getLimitDt());

				// 在庫区分
				redto.setStockType(stockReplenishLabel.get(i).chaseMStockType().chaseVDict().getDictNm());

				// ロット
				redto.setLot(stockReplenishLabel.get(i).getLot());

				// [#4220][Ver3.0] 帳票 - 表示不正(推奨ロケ表示対象外) 2018.04.03 honma Mod Start
				// 推奨ロケCD
				redto.settLoactionCd("");

				// 推奨ロケ名称
				redto.settLocationNm("");
				// [#4220][Ver3.0] 帳票 - 表示不正(推奨ロケ表示対象外) 2018.04.03 honma Mod End

				//[ON推-品向-1088]修正対応 2016.4.19 chou Mod Start
				if (stockReplenishLabel.get(i).chaseMProduct().getMLocationList().size() > 0) {
					// ピックロケCD
					redto.setPickTLocationCd(stockReplenishLabel.get(i).chaseMProduct().getMLocationList().get(0).getLocationCd());

					// ピックロケ名称
					redto.setPickTLocationNm(stockReplenishLabel.get(i).chaseMProduct().getMLocationList().get(0).getLocationNm());
				}
				//[ON推-品向-1088]修正対応 2016.4.19 chou Mod End

				// [#2962][Ver3.0] 不要なピース・ケース換算処理を削除 2018.02.19 miyabe Delete

				// ピース数
				redto.setParaNum(paraNum);

				// 総ピース数
				redto.setStoreNum(storeNum);

				// 入数
				redto.setUnitNum(unitNum);

				// [Ver3.0] unit of measure対応 2017.11.28 REN Start
				//内訳
				redto.setBreakdown(stockReplenishLabel.get(i).getBreakdown());

				//入数
				redto.setStringUnitNum(stockReplenishLabel.get(i).getStringUnitNum());

				//最小梱包単位
				redto.setMinimumPackingUnit(stockReplenishLabel.get(i).getMinimumPackingUnit());
				// [Ver3.0] unit of measure対応 2017.11.28 REN End

				//[ON推-品向-1081]修正対応 2016.4.13 chou Mod Start
				//指示元バッチNo.
				redto.setSourceBatchNo(stockReplenishLabel.get(i).chaseTMoveInstH().getSourceBatchNo());
				//[ON推-品向-1081]修正対応 2016.4.13 chou Mod Start

				// ユーザCD
				redto.setUserCd(stockReplenishLabel.get(i).getAddUser());

				// PrintCondition(補充ラベル)
				redto.setPrintCondition("1");

				// 入出庫区分(0:入庫)
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
				if(AppCDef.InoutType.$0.code().equals(stockReplenishLabel.get(i).getInoutType())){
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
					// 入庫ロケCD
					redto.setInTLocationCd(stockReplenishLabel.get(i).chaseMLocation().getLocationCd());
					// 入庫ロケ名称
					redto.setInTLocationNm(stockReplenishLabel.get(i).chaseMLocation().getLocationNm());

					// 倉庫CD
					redto.setWarehouseCd(stockReplenishLabel.get(i).chaseMLocation().chaseMZone().chaseMWarehouse().getWarehouseCd());
					// [#4220][Ver3.0] 帳票 - 表示項目最新化(倉庫CD,NM表示対象) 2018.04.03 honma Mod Start
					// 倉庫名称(略称)
					redto.setWarehouseNm(stockReplenishLabel.get(i).chaseMLocation().chaseMZone().chaseMWarehouse().getWarehouseAbbr());
					// [#4220][Ver3.0] 帳票 - 表示項目最新化(倉庫CD,NM表示対象) 2018.04.03 honma Mod End

					// ゾーンCD
					redto.setZoneCd(stockReplenishLabel.get(i).chaseMLocation().chaseMZone().getZoneCd());
					// ゾーン名称
					redto.setZoneNm(stockReplenishLabel.get(i).chaseMLocation().chaseMZone().getZoneNm());

					//[ON推-品向-1081]修正対応 2016.4.13 chou Add Start
					// 入庫ラベルNo.(入庫:移動先)
					redto.setStoreLabelNo(stockReplenishLabel.get(i).getStoreLabelNo());//入庫No.ID経由で取得しなくて、入庫ラベルNo.で設定
					//[ON推-品向-1081]修正対応 2016.4.13 chou Add End

					//[#3801] 定期補充ラベルの出力順序の調整 ピッキング順序の追加 fujiwara 2018.03.02 Start
					// 移動先ピッキング順序
					redto.setInPickingOrder(stockReplenishLabel.get(i).chaseMLocation().getPickingOrder());
					//[#3801] 定期補充ラベルの出力順序の調整 ピッキング順序の追加 fujiwara 2018.03.02 End
				}

				// 入出庫区分(1:出庫)
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
				if(AppCDef.InoutType.$1.code().equals(stockReplenishLabel.get(i).getInoutType())){
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
					// 出庫ロケCD
					redto.setOutTLocationCd(stockReplenishLabel.get(i).getLocationCd());
					// 出庫ロケ名称
					redto.setOutTLocationNm(stockReplenishLabel.get(i).chaseMLocation().getLocationNm());

					//[ON推-品向-1081]修正対応 2016.4.13 chou Add Start
					// 入庫ラベルNo.(出庫:移動元)
					redto.setOutStoreLabelNo(stockReplenishLabel.get(i).getStoreLabelNo());//入庫No.ID経由で取得しなくて、入庫ラベルNo.で設定
					//[ON推-品向-1081]修正対応 2016.4.13 chou Add End

					//[#3801] 定期補充ラベルの出力順序の調整 ピッキング順序の追加 fujiwara 2018.03.02 Start
					// 移動元ピッキング順序
					redto.setOutPickingOrder(stockReplenishLabel.get(i).chaseMLocation().getPickingOrder());
					//[#3801] 定期補充ラベルの出力順序の調整 ピッキング順序の追加 fujiwara 2018.03.02 End
				}

			}else{
				// 入出庫区分(0:入庫)
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
				if(AppCDef.InoutType.$0.code().equals(stockReplenishLabel.get(i).getInoutType())){
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
					// 入庫ロケCD
					redto.setInTLocationCd(stockReplenishLabel.get(i).chaseMLocation().getLocationCd());
					// 入庫ロケ名称
					redto.setInTLocationNm(stockReplenishLabel.get(i).chaseMLocation().getLocationNm());

					// 倉庫CD
					redto.setWarehouseCd(stockReplenishLabel.get(i).chaseMLocation().chaseMZone().chaseMWarehouse().getWarehouseCd());
					// [#4220][Ver3.0] 帳票 - 表示項目最新化(倉庫CD,NM表示対象) 2018.04.03 honma Mod Start
					// 倉庫名称(略称)
					redto.setWarehouseNm(stockReplenishLabel.get(i).chaseMLocation().chaseMZone().chaseMWarehouse().getWarehouseAbbr());
					// [#4220][Ver3.0] 帳票 - 表示項目最新化(倉庫CD,NM表示対象) 2018.04.03 honma Mod End

					// ゾーンCD
					redto.setZoneCd(stockReplenishLabel.get(i).chaseMLocation().chaseMZone().getZoneCd());
					// ゾーン名称
					redto.setZoneNm(stockReplenishLabel.get(i).chaseMLocation().chaseMZone().getZoneNm());

					//[ON推-品向-1081]修正対応 2016.4.13 chou Add Start
					// 入庫ラベルNo.(入庫:移動先)
					redto.setStoreLabelNo(stockReplenishLabel.get(i).getStoreLabelNo());//入庫No.ID経由で取得しなくて、入庫ラベルNo.で設定
					//[ON推-品向-1081]修正対応 2016.4.13 chou Add End

					//[#3801] 定期補充ラベルの出力順序の調整 ピッキング順序の追加 fujiwara 2018.03.02 Start
					// 移動先ピッキング順序
					redto.setInPickingOrder(stockReplenishLabel.get(i).chaseMLocation().getPickingOrder());
					//[#3801] 定期補充ラベルの出力順序の調整 ピッキング順序の追加 fujiwara 2018.03.02 End
				}
				// 入出庫区分(1:出庫)
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
				if(AppCDef.InoutType.$1.code().equals(stockReplenishLabel.get(i).getInoutType())){
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
					// 出庫ロケCD
					redto.setOutTLocationCd(stockReplenishLabel.get(i).getLocationCd());
					// 出庫ロケ名称
					redto.setOutTLocationNm(stockReplenishLabel.get(i).chaseMLocation().getLocationNm());

					//[ON推-品向-1081]修正対応 2016.4.13 chou Add Start
					// 入庫ラベルNo.(出庫:移動元)
					redto.setOutStoreLabelNo(stockReplenishLabel.get(i).getStoreLabelNo());//入庫No.ID経由で取得しなくて、入庫ラベルNo.で設定
					//[ON推-品向-1081]修正対応 2016.4.13 chou Add End

					//[#3801] 定期補充ラベルの出力順序の調整 ピッキング順序の追加 fujiwara 2018.03.02 Start
					// 移動元ピッキング順序
					redto.setOutPickingOrder(stockReplenishLabel.get(i).chaseMLocation().getPickingOrder());
					//[#3801] 定期補充ラベルの出力順序の調整 ピッキング順序の追加 fujiwara 2018.03.02 End
				}
			}

			//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add Start
			//入庫日
			if(!CU.isNullOrEmpty(stockReplenishLabel.get(i).getStoreDt())){
				redto.setStoreDt(stockReplenishLabel.get(i).getStoreDt());
			}else{
				redto.setStoreDt("");
			}
			//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add End

			// List追加判定
			if(i == stockReplenishLabel.size() - 1){
				// 最終行の場合
				dataList.add(redto);

			}else if(!CU.isNotNullAndEquals(stockReplenishLabel.get(i).chaseTMoveInstH().getMoveInstHId(),
					stockReplenishLabel.get(i + 1).chaseTMoveInstH().getMoveInstHId())){
				// 次の在庫移動指示ヘッダIDが異なる場合
				dataList.add(redto);
				redto = null;

			}
		}

		//[ON推-品向-1081]修正対応 2016.4.13 chou Add Start
		//「指示元バッチNo.(NULLは不可)、出庫ロケーションCD、入庫ロケーションCD、商品CD、移動元入庫ラベルNo」で、指示数をサマリする
		List<StockReplenishLabelDto> dataListForSum = new ArrayList<StockReplenishLabelDto>();
		boolean isFound = false;
		for (StockReplenishLabelDto data : dataList) {

			for (StockReplenishLabelDto dataForSum : dataListForSum) {
				if (!CU.isNullOrEmpty(data.getSourceBatchNo()) &&
						data.getSourceBatchNo().equals(dataForSum.getSourceBatchNo()) &&
							data.getOutTLocationCd().equals(dataForSum.getOutTLocationCd()) &&
								data.getInTLocationCd().equals(dataForSum.getInTLocationCd()) &&
									data.getProductCd().equals(dataForSum.getProductCd()) &&
										data.getOutStoreLabelNo().equals(dataForSum.getOutStoreLabelNo())) {

					//総ピース数の合計
					BigDecimal storeNnumTotal = WCC.add(dataForSum.getStoreNum(), data.getStoreNum());

					dataForSum.setStoreNum(storeNnumTotal);//総ピース数

					//=== ケース数、ピース数を再計算する START===

					// [#2962][Ver3.0] 不要なピース・ケース換算処理を削除 2018.02.19 miyabe Delete
					BigDecimal paraNum = WCC.ZERO;// ピース数
					Long unitNum = dataForSum.getUnitNum();// 入数

					// 数量計算
					if(unitNum >= 1){// 入数が1以上の場合
						// ピース数 = 総ピース数 ÷ 入数 の余り
						paraNum = WCC.remainder(storeNnumTotal, unitNum);
						// [#2962][Ver3.0] 不要なピース・ケース換算処理を削除 2018.02.19 miyabe Delete
					}else{
						// ピース数 = 総ピース数
						paraNum = storeNnumTotal;
					}

					//=== ケース数、ピース数を再計算する END===

					// [#2962][Ver3.0] 不要なピース・ケース換算処理を削除 2018.02.19 miyabe Delete
					// ピース数
					dataForSum.setParaNum(paraNum);

					isFound = true;

					break;
				}else {
					isFound = false;
				}
			}

			if (!isFound) {
				dataListForSum.add(data);
			}

		}

		//=== 移動元ピッキング順序、移動元ロケーションCD、商品CD,移動先ピッキング順序、移動先ロケーションCDの順にソートする===
		Collections.sort(dataListForSum, new Comparator<StockReplenishLabelDto>() {
			@Override
			public int compare(StockReplenishLabelDto arg1, StockReplenishLabelDto arg2) {
				//ソート順（昇順）：移動元ピッキング順序、移動元ロケーションCD、商品CD,移動先ピッキング順序、移動先ロケーションCD

				//[#3801] 定期補充ラベルの出力順序の調整 ピッキング順序の追加 fujiwara 2018.03.02 Start

				String v1 = (arg1.getOutPickingOrder()) +
							(arg1.getOutTLocationCd()) +
							(arg1.getProductCd()) +
							(arg1.getInPickingOrder()) +
							(arg1.getInTLocationCd());

				String v2 = (arg2.getOutPickingOrder()) +
							(arg2.getOutTLocationCd()) +
							(arg2.getProductCd()) +
							(arg2.getInPickingOrder()) +
							(arg2.getInTLocationCd());


				//[#3801] 定期補充ラベルの出力順序の調整 ピッキング順序の追加 fujiwara 2018.03.02 End

				return v1.compareTo(v2);
			}

		});

		dataList = dataListForSum;

		//[ON推-品向-1081]修正対応 2016.4.13 chou Add End

		// 該当データ無し
		if (dataList.size() == 0) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 帳票発行処理
		JSON json = new JSON();

		json.setSuppressNull(true);

		replenishLabelPrintDto.printBasicData.outputData = json.format(dataList);

		printLogic.print(replenishLabelPrintDto);

		Timestamp time = new Timestamp(System.currentTimeMillis());

		//在庫移動指示帳票更新
		update.setControlNo(null);

		update.setInstOutFlg_$1();

		update.setInstOutUserId(this.getUserId());

		update.setInstOutDt(time);

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		stockReplenishLabelPrintLogic.updateOutFlg(update, report, errRetSts(StatusCode.UPDATE_EXCEPTION));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return replenishLabelPrintDto;
	}
	// [C-CWMS-0050] 補充ラベル発行機能追加 2016.1.28 koyama End

	// [ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Add Start
	/**
	 * <h2>搬送ラベル発行処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・データベースに搬送ラベル発行データを取得する
	 * </pre>
	 * @param dto 在庫移動一覧画面用DTO
	 * @return MoveLabelPrintDto 処理結果DTO
	 * @throws Exception
	 */
	@GET
	@Path("/moveLabelPrint")
	public MoveLabelPrintDto select(StockMoveListDto dto) throws Exception {

		//搬送ラベル発行データ
		MoveLabelPrintDto moveLabelPrintDto = new MoveLabelPrintDto();
		// 発行帳票を指定
		moveLabelPrintDto.printBasicData = dto.data.directionsPrintParam.printBasicData;

		// Entity変換
		TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper();
		List<TMoveInstH> tMoveInstHList = mapper.mappingToEntityList(dto.data.list);

		//WMS在庫移動伝票No.のリスト
		Collection<String> moveSlipNoList = new HashSet<String>();
		for (TMoveInstH data : tMoveInstHList){
			moveSlipNoList.add(data.getMoveSlipNo());
		}

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		numberingCenterLogic.getControlNo();

		// 在庫移動指示ヘッダ
		TMoveInstH tMoveInstH = tMoveInstHBhv.newMyEntity();

		// センタID取得
		String centerCd = dto.data.head.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		if (mCenter == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		tMoveInstH.setCenterId(mCenter.getCenterId());

		// 荷主ID取得
		String clientCd = dto.data.head.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		tMoveInstH.setClientId(mClient.getClientId());

		// 在庫移動指示ボディ
		TMoveInstB tMoveInstB = tMoveInstBBhv.newMyEntity();

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
		List<TMoveInstB> stockList = moveLabelPrintLogic.select(tMoveInstH, tMoveInstB, moveSlipNoList, errRetSts(StatusCode.NOT_FOUND_DATA));

		// 該当データ無し
		if (stockList == null) {
			return null;
		}

		Iterator<TMoveInstB> stockIte = stockList.iterator();
		List<MoveLabelDto> retList = new ArrayList<MoveLabelDto>();
		MoveLabelDto moveLabelDto;

		while (stockIte.hasNext()) {

			TMoveInstB tBody = (TMoveInstB) stockIte.next();

			// 調整移動区分(0:調整の場合、出力しない)
			if("0".equals(tBody.getClsMove())) {
				continue;
			}
			// [Ver3.0] unit of measure対応 2017.11.28 REN Del
			moveLabelDto = new MoveLabelDto();

			// カルチャID
			moveLabelDto.cultureId = getCultureId();
			// 荷主CD
			moveLabelDto.clientCd = tBody.chaseTMoveInstH().chaseMClient().getClientCd();
			// 荷主略称
			moveLabelDto.clientNm = tBody.chaseTMoveInstH().chaseMClient().getClientAbbr();
			// センタCD
			moveLabelDto.centerCd = tBody.chaseTMoveInstH().chaseMCenter().getCenterCd();
			// センタ略称
			moveLabelDto.centerNm = tBody.chaseTMoveInstH().chaseMCenter().getCenterAbbr();

			// 商品CD
			if(!CU.isNullOrEmpty(tBody.chaseMProduct().getProductCd())){
				moveLabelDto.productCd = tBody.chaseMProduct().getProductCd();
			}else{
				moveLabelDto.productCd = "";
			}

			// 商品名称
			moveLabelDto.productNm = tBody.chaseMProduct().getProductAbbr();

			// JANCD
			if(!CU.isNullOrEmpty(tBody.chaseMProduct().getJanCd())){
				moveLabelDto.janCd = tBody.chaseMProduct().getJanCd();
			}else{
				moveLabelDto.janCd = "";
			}

			// 預託
			moveLabelDto.depositNm = tBody.chaseMCustomerByDepositId().getCustomerAbbr();
			// 期限日
			moveLabelDto.limitDt = tBody.getLimitDt();
			// [#4220][Ver3.0] 帳票 - 表示項目最新化(倉庫CD,NM表示対象) 2018.04.03 honma Mod Start
			// 倉庫CD
			if(!CU.isNullOrEmpty(tBody.chaseMWarehouse().getWarehouseCd())){
				moveLabelDto.warehouseCd = tBody.chaseMWarehouse().getWarehouseCd();
			} else {
				moveLabelDto.warehouseCd = "";
			}
			// 倉庫略称
			if (!CU.isNullOrEmpty(tBody.chaseMWarehouse().getWarehouseAbbr())) {
				moveLabelDto.warehouseNm = tBody.chaseMWarehouse().getWarehouseAbbr();
			} else {
				moveLabelDto.warehouseNm = "";
			}
			// [#4220][Ver3.0] 帳票 - 表示項目最新化(倉庫CD,NM表示対象) 2018.04.03 honma Mod End
			// 在庫区分
			moveLabelDto.stockType = tBody.chaseMStockType().chaseVDict().getDictNm();
			// ロット
			moveLabelDto.lot = tBody.getLot();
			// ゾーンCD
			moveLabelDto.zoneCd = tBody.chaseMLocation().chaseMZone().getZoneCd();
			// ゾーン名称
			moveLabelDto.zoneNm = tBody.chaseMLocation().chaseMZone().getZoneNm();
			// 総ピース数
			moveLabelDto.storeNum = tBody.getInstNum();
			// [#134] 搬送ラベルの入数を商品荷姿マスタから取得するように変更 2016.10.28 kawana Start
			// [Ver3.0] unit of measure対応 2017.11.28 REN Del
			// [Ver3.0] unit of measure対応 2017.11.28 REN Start
			//内訳
			moveLabelDto.setBreakdown(tBody.getBreakdown());

			//入数
			moveLabelDto.setStringUnitNum(tBody.getStringUnitNum());

			//最小梱包単位
			moveLabelDto.setMinimumPackingUnit(tBody.getMinimumPackingUnit());
			// [Ver3.0] unit of measure対応 2017.11.28 REN End

			// [ver3.0][#3595] 搬送ラベルに入庫データの搬送ラベルが出力されるように変更 2018.02.16 matsumoto Start
			// 入庫ラベルNo.
			moveLabelDto.setStoreLabelNo(tBody.getStoreLabelNo());
			// [ver3.0][#3595] 搬送ラベルに入庫データの搬送ラベルが出力されるように変更 2018.02.16 matsumoto End

			//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add Start
			//入庫日
			if((tBody.chaseTStoreNo() != null ) &&
					!CU.isNullOrEmpty(tBody.chaseTStoreNo().getStoreDt())){
				moveLabelDto.storeDt = tBody.chaseTStoreNo().getStoreDt();
			}else{
				moveLabelDto.storeDt = "";
			}
			//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add End

			moveLabelDto.printCondition = "1";

			// [#4220][Ver3.0] 搬送ラベル - 表示不正(推奨ロケ表示対象外) 2018.04.03 honma Mod Start
			// 推奨ロケCD
			moveLabelDto.tLoactionCd = "";

			// 推奨ロケ
			moveLabelDto.tLocationNm = "";
			// [#4220][Ver3.0] 搬送ラベル - 表示不正(推奨ロケ表示対象外) 2018.04.03 honma Mod End
			// [#4220][Ver3.0] 帳票 - 表示項目最新化(ピックロケ表示対象) 2018.04.03 honma Add Start
			if (tBody.chaseMProduct().getMLocationList().size() > 0) {
				// ピックロケCD
				moveLabelDto.setPickTLocationCd(tBody.chaseMProduct().getMLocationList().get(0).getLocationCd());

				// ピックロケ名称
				moveLabelDto.setPickTLocationNm(tBody.chaseMProduct().getMLocationList().get(0).getLocationNm());
			}
			// [#4220][Ver3.0] 帳票 - 表示項目最新化(ピックロケ表示対象) 2018.04.03 honma Add End

			// 出庫ロケCD(入出庫区分:1出庫)
			moveLabelDto.outTLocationCd = tBody.getOutTLocationCd();
			// 出庫ロケ(入出庫区分:1出庫)
			moveLabelDto.outTLocationNm = tBody.getOutTLocationNm();
			// 入庫ロケCD(入出庫区分:0入庫)
			moveLabelDto.inTLocationCd = tBody.getInTLocationCd();
			// 入庫ロケ(入出庫区分:0入庫)
			moveLabelDto.inTLocationNm = tBody.getInTLocationNm();
			// ユーザCD
			moveLabelDto.userCd = tBody.getAddUser();

			retList.add(moveLabelDto);
		}

		// 該当データ無し
		if (retList.size() == 0) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);
		moveLabelPrintDto.printBasicData.outputData = json.format(retList);
		printLogic.print(moveLabelPrintDto);

		for(TMoveInstB stock : stockList) {
			// 調整移動区分(0:調整の場合、出力しないので、更新しない)
			if("0".equals(stock.getClsMove())) {
				continue;
			}

			TMoveInstR tMoveInstR = new TMoveInstR();
			tMoveInstR.setMoveInstHId(stock.getMoveInstHId());

			// 指示書出力フラグ更新処理（ロジッククラスを呼ぶ）
			moveLabelPrintLogic.update(tMoveInstR, errRetSts(StatusCode.UPDATE_EXCEPTION));
		}

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return  moveLabelPrintDto;
	}
	// [ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Add End
}
