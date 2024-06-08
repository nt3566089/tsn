package com.oneslogi.wms.resources.stock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.dto.TSerialNoDto;
import com.oneslogi.base.dbflute.dtomapper.TSerialNoDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.stock.SerialNoListDto;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;
import com.oneslogi.wms.logic.stock.SerialNoCheckShippingLogic;
import com.oneslogi.wms.logic.stock.SerialNoListLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/stock/serialNoList")
public class SerialNoListResource extends AbstractWmsResource {

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
		 * 出荷情報クリア異常
		 */
		protected static final int CANNOT_SHIPP_UDPATE_ERROR = 3;
		/**
		 * 出荷情報更新異常
		 */
		protected static final int SHIPPING_UPDATE_ERROR = 4;
		/**
		 * 削除異常
		 */
		protected static final int DATA_DELETE_ERROR = 5;
		/**
		 * 出荷情報チェック異常
		 */
		protected static final int CHECK_SHIPPING_INFO_ERROR = 6;
		/**
		 * 出荷商品チェック異常
		 */
		protected static final int CHECK_SHIPPING_PRODUCT_ERROR = 7;
		/**
		 * 出荷商品数チェック異常
		 */
		protected static final int CHECK_SHIPPING_PRODUCT_NUM_ERROR = 8;
		// [#5475][v3.1] 出荷梱包No登録データで出庫指示一覧に遷移すると該当データなしになる問題を修正 2018.10.22 kawana Start
		/**
		 * 出庫作業No.取得異常
		 */
		protected static final int SELECT_PICKING_WORK_NO_ERROR = 9;
		// [#5475][v3.1] 出荷梱包No登録データで出庫指示一覧に遷移すると該当データなしになる問題を修正 2018.10.22 kawana End
	}

	// [#5475][v3.1] 出荷梱包No登録データで出庫指示一覧に遷移すると該当データなしになる問題を修正 2018.10.22 kawana Start

	// ===== 使用テーブル =====

	@Inject
	private TPackingHBhv tPackingHBhv;

	// [#5475][v3.1] 出荷梱包No登録データで出庫指示一覧に遷移すると該当データなしになる問題を修正 2018.10.22 kawana End

	// ===== 使用ロジック =====

	@Inject
	private SerialNoListLogic serialNoListLogic;
	@Inject
	private SerialNoCheckShippingLogic checkLogic;
	// [#5475][v3.1] 出荷梱包No登録データで出庫指示一覧に遷移すると該当データなしになる問題を修正 2018.10.22 kawana Start
	@Inject
	private ShippingCommonLogic shippingCommonLogic;
	// [#5475][v3.1] 出荷梱包No登録データで出庫指示一覧に遷移すると該当データなしになる問題を修正 2018.10.22 kawana End

	/**
	 * <h2>初期処理</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * </pre>
	 * @return SerialNoListDto 出庫指示一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public SerialNoListDto init() {
		SerialNoListDto serialNoListDto = new SerialNoListDto();
		return serialNoListDto;
	}

	/**
	 * <h2>シリアルNo.一覧データ検索処理</h2>
	 * <pre>
	 * 画面で入力された検索条件を元にシリアルNo.一覧を取得する。
	 * </pre>
	 * @param serialNoListDto  シリアルNo.一覧画面用DTO
	 * @return serialNoListDto シリアルNo.一覧画面用DTO
	 */
	@GET
	@Path("/search")
	public SerialNoListDto search(SerialNoListDto serialNoListDto) {
		SerialNoListDto resultSerialNoListDto = new SerialNoListDto();
		// Entity変換
		TSerialNoDtoMapper mapper = new TSerialNoDtoMapper();
		TSerialNo header = mapper.mappingToEntity(serialNoListDto.data.search);

		List<TSerialNo> tSerialNoList = serialNoListLogic.select(header, serialNoListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		List<TSerialNoDto> list = mapper.mappingToDtoList(tSerialNoList);

		//検索結果詰込処理
		resultSerialNoListDto.paging = serialNoListDto.paging;
		resultSerialNoListDto.data.list = list;
		return resultSerialNoListDto;
	}

	/**
	 * <h2>チェック処理（削除）。</h2>
	 * <pre>
	 * 削除データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックは結果で判定。
	 * </pre>
	 * @param SerialNoListDto シリアルNo.管理一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkDelete")
	public StatusDto checkDelete(SerialNoListDto serialNoListDto, ErrorStatus errSts) {
		// 通常の確認メッセージを設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.PROCESS_EXECUTE_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>削除処理</h2>
	 * <pre>
	 * シリアルNo.管理チェックを行う
	 * エラーがない場合は、エラーデータ削除処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param SerialNoListDto シリアルNo.管理一覧画面用DTO
	 * @return SerialNoListDto 処理結果DTO
	 */
	@POST
	@Path("/dataDelete")
	public SerialNoListDto dataDelete(SerialNoListDto serialNoListDto) {
		// Entity変換
		TSerialNoDtoMapper mapper = new TSerialNoDtoMapper();
		final List<TSerialNo> list = mapper.mappingToEntityList(serialNoListDto.data.list);

		// ===== シリアルNo.管理削除メソッドを呼出し =====
		serialNoListLogic.delete(list, errRetSts(StatusCode.DATA_DELETE_ERROR));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}
		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>出荷情報クリア更新。</h2>
	 * <pre>
	 * エラーがない場合は、データベースにEDIマスタを更新し。
	 * シリアルNo.管理を更新または削除または登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param SerialNoListDto シリアルNo.管理画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/shippingInfoClear")
	public StatusDto shippingInfoClear(SerialNoListDto serialNoListDto) {
		// Entity変換
		TSerialNoDtoMapper mapper = new TSerialNoDtoMapper();
		List<TSerialNo> list = mapper.mappingToEntityList(serialNoListDto.data.list);
		for (TSerialNo tSerialNo : list) {
			tSerialNo.setSupplyCustomerCd(null);
			tSerialNo.setSupplyCustomerNm(null);
			tSerialNo.setPickingWorkNo(null);
			tSerialNo.setShippingDt(null);
		}
		// ===== シリアルNo.管理一括更新メソッドを呼出し =====
		serialNoListLogic.batchUpdate(list, errRetSts(StatusCode.CANNOT_SHIPP_UDPATE_ERROR));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}
		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>チェック処理（出荷情報更新）。</h2>
	 * <pre>
	 * 出荷情報更新データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックは結果で判定。
	 * </pre>
	 * @param SerialNoListDto シリアルNo.管理一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkShippingUpdate")
	public StatusDto checkShippingUpdate(SerialNoListDto serialNoListDto, ErrorStatus errSts) {

		// Entity変換
		TSerialNoDtoMapper mapper = new TSerialNoDtoMapper();
		List<TSerialNo> serialNoList = mapper.mappingToEntityList(serialNoListDto.data.list);

		final long centerId = serialNoList.get(0).getCenterId();
		final long clientId = serialNoList.get(0).getClientId();
		String pickingWorkNo = serialNoListDto.data.tSerialNoFooter.pickingWorkNoBatch;
		String supplyCustomerCd = serialNoListDto.data.tSerialNoFooter.supplyCustomerCdBatch;
		String shippingDt = serialNoListDto.data.tSerialNoFooter.shippingDtBatch;

		// ===== データのチェック =====

		setupShippingUpdateData(centerId, clientId, pickingWorkNo, supplyCustomerCd, shippingDt, serialNoList);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 確認メッセージの設定 =====

		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		return null;
	}

	/**
	 * <h2>出荷情報更新処理</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、出荷情報更新処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param SerialNoListDto シリアルNo.管理画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/shippingUpdate")
	public StatusDto shippingUpdate(SerialNoListDto serialNoListDto) {
		// Entity変換
		TSerialNoDtoMapper mapper = new TSerialNoDtoMapper();
		List<TSerialNo> serialNoList = mapper.mappingToEntityList(serialNoListDto.data.list);

		final long centerId = serialNoList.get(0).getCenterId();
		final long clientId = serialNoList.get(0).getClientId();
		String pickingWorkNo = serialNoListDto.data.tSerialNoFooter.pickingWorkNoBatch;
		String supplyCustomerCd = serialNoListDto.data.tSerialNoFooter.supplyCustomerCdBatch;
		String shippingDt = serialNoListDto.data.tSerialNoFooter.shippingDtBatch;

		// ===== データのチェックと設定 =====
		setupShippingUpdateData(centerId, clientId, pickingWorkNo, supplyCustomerCd, shippingDt, serialNoList);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== シリアルNo.管理更新メソッドを呼出し =====
		serialNoListLogic.batchUpdate(serialNoList, errRetSts(StatusCode.SHIPPING_UPDATE_ERROR));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 完了メッセージの設定 =====

		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * 出荷情報更新のデータ設定
	 */
	private void setupShippingUpdateData(final long centerId, final long clientId, String pickingWorkNo, String supplyCustomerCd, String shippingDt, List<TSerialNo> serialNoList) {

		// ===== 出荷情報のチェックと値設定 =====

		TSerialNo headerSerialNo = new TSerialNo();
		headerSerialNo.setCenterId(centerId);
		headerSerialNo.setClientId(clientId);
		headerSerialNo.setPickingWorkNo(pickingWorkNo);
		headerSerialNo.setSupplyCustomerCd(supplyCustomerCd);
		headerSerialNo.setShippingDt(shippingDt);
		checkLogic.checkAndSetHeader(headerSerialNo, errRetSts(StatusCode.CHECK_SHIPPING_INFO_ERROR));
		if (0 < getErrorManager().size()) {
			return;
		}

		Map<Long, Set<String>> productSerialNoMap = new HashMap<Long, Set<String>>();
		for (TSerialNo serialNo : serialNoList) {

			// ===== シリアルに出荷情報を設定 ====

			serialNo.setSupplyCustomerCd(headerSerialNo.getSupplyCustomerCd());
			serialNo.setSupplyCustomerNm(headerSerialNo.getSupplyCustomerNm());
			serialNo.setPickingWorkNo(headerSerialNo.getPickingWorkNo());
			serialNo.setShippingDt(headerSerialNo.getShippingDt());

			// ===== 商品単位のチェック =====

			long productId = serialNo.getProductId();
			if (productSerialNoMap.containsKey(productId)) {

				// シリアルNo.追加
				productSerialNoMap.get(productId).add(serialNo.getSerialNo());
			} else {

				// 商品CDチェック
				checkLogic.checkProduct(serialNo, errRetSts(StatusCode.CHECK_SHIPPING_PRODUCT_ERROR));
				if (0 < getErrorManager().size()) {
					return;
				}

				// シリアルNo.追加
				Set<String> serialNoSet = new HashSet<String>();
				serialNoSet.add(serialNo.getSerialNo());

				productSerialNoMap.put(productId, serialNoSet);
			}
		}

		for (Map.Entry<Long, Set<String>> entry : productSerialNoMap.entrySet()) {

			long productId = entry.getKey();
			Set<String> serialNoSet = entry.getValue();

			// ===== 出庫数チェック =====

			checkLogic.checkOrverQuantity(centerId, clientId, pickingWorkNo, productId, serialNoSet, errRetSts(StatusCode.CHECK_SHIPPING_PRODUCT_NUM_ERROR));
			if (0 < getErrorManager().size()) {
				return;
			}
		}
	}

	// [#5475][v3.1] 出荷梱包No登録データで出庫指示一覧に遷移すると該当データなしになる問題を修正 2018.10.23 kawana Start
	/**
	 * <h2>出庫作業Noと作業日の取得.</h2>
	 * <pre>
	 * 引数の出荷梱包No.から出庫作業No.と作業日を取得して設定する。
	 * 既に出庫作業No.が設定さている場合は、作業日のみを設定する。
	 * </pre>
	 * @param serialNoListDto シリアルNo.管理画面用DTO
	 * @return 出庫作業No.を設定したシリアルNo.管理画面用DTO
	 */
	@GET
	@Path("/getPickingWorkNo")
	public SerialNoListDto getPickingWorkNo(SerialNoListDto serialNoListDto) {

		TSerialNoDtoMapper mapper = new TSerialNoDtoMapper();
		List<TSerialNo> serialNoList = mapper.mappingToEntityList(serialNoListDto.data.list);

		for (TSerialNo serialNo : serialNoList) {

			long centerId = serialNo.getCenterId();
			long clientId = serialNo.getClientId();
			String pickingWorkNoOrShippingPackingNo = serialNo.getPickingWorkNo();

			// 出荷梱包No.で検索

			TPackingHCB cb = tPackingHBhv.newMyConditionBean();
			cb.setupSelect_TPickingH().withTAllocInstH();

			cb.specify().columnPackingHId();
			cb.specify().specifyTPickingH().columnPickingWorkNo();
			cb.specify().specifyTPickingH().specifyTAllocInstH().columnWorkDt();

			cb.checkInvalidQuery();
			cb.query().setCenterId_Equal(centerId);
			cb.query().setClientId_Equal(clientId);

			if (shippingCommonLogic.isPickingWorkNo(centerId, pickingWorkNoOrShippingPackingNo)) {
				// 出庫作業No.

				cb.query().queryTPickingH().setPickingWorkNo_Equal(pickingWorkNoOrShippingPackingNo);
			} else {
				// 出荷梱包No.

				cb.query().setShippingPackingNo_Equal(pickingWorkNoOrShippingPackingNo);
			}
			// 1件取得
			cb.fetchFirst(1);

			TPackingH packingH = tPackingHBhv.selectEntity(cb);

			if (packingH == null) {
				// 該当データなし

				// 画面遷移で使用するため作業日を設定
				serialNo.setWorkDt(serialNo.getShippingDt());
				continue;
			}

			// 出庫作業No.を設定
			serialNo.setPickingWorkNo(packingH.getTPickingH().getPickingWorkNo());
			// 作業日を設定
			serialNo.setWorkDt(packingH.getTPickingH().getTAllocInstH().getWorkDt());
		}

		// 結果を設定
		serialNoListDto.data.list = mapper.mappingToDtoList(serialNoList);

		return serialNoListDto;
	}
	// [#5475][v3.1] 出荷梱包No登録データで出庫指示一覧に遷移すると該当データなしになる問題を修正 2018.10.23 kawana End
}
