package com.oneslogi.wms.resources.assist;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dtomapper.MCustomerDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.assist.DeliveryMasterSearchDto;
import com.oneslogi.wms.logic.assist.DeliveryListSelectLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 納品先マスタ検索画面のリソースクラス。
 */
@Path("/assist/deliveryMasterSearch")
public class DeliveryMasterSearchResource extends AbstractWmsResource {

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
		 * 納品先検索データ取得異常
		 */
		protected static final int DELIVERY_MASTER_SEARCH_FAILED = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private DeliveryListSelectLogic deliveryListSelectLogic;
	@Inject
	private ClientLogic clientLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return DeliveryMasterSearchDto 納品先マスタ検索画面用DTO
	 */
	@GET
	@Path("/initNew")
	public DeliveryMasterSearchDto initNew() {
		// 画面用DTO作成
		DeliveryMasterSearchDto deliveryMasterSearchDto = new DeliveryMasterSearchDto();
		return deliveryMasterSearchDto;
	}

	/**
	 * <h2>納品先検索データ取得。</h2>
	 * <pre>
	 * ・画面で入力されたCDを元にIDを取得し、納品先検索データ取得
	 * </pre>
	 * @param deliveryMasterSearchDto 納品先マスタ検索画面用DTO
	 * @return DeliveryMasterSearchDto 納品先マスタ検索画面用DTO
	 */
	@GET
	@Path("/search")
	public DeliveryMasterSearchDto search(DeliveryMasterSearchDto deliveryMasterSearchDto) {
		// 荷主IDを取得

		String clientCd = deliveryMasterSearchDto.data.head.getMClient().getClientCd();
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(clientCd);
		clientCondition = clientLogic.getUkEntity(clientCondition);
		if (clientCondition == null) {
			this.getErrorManager().add(errRetSts(StatusCode.DELIVERY_MASTER_SEARCH_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		// エンティティ編集
		deliveryMasterSearchDto.data.head.setClientId(clientCondition.getClientId());

		// エンティティ変換
		MCustomerDtoMapper mapper = new MCustomerDtoMapper();
		MCustomer header = mapper.mappingToEntity(deliveryMasterSearchDto.data.head);

		// 納品先検索データ取得.検索データ取得メソッドを呼出し
		PagingResultBean<MCustomer> mCustomerList = deliveryListSelectLogic.select(header, deliveryMasterSearchDto.paging, errRetSts(StatusCode.DELIVERY_MASTER_SEARCH_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// Dto変換処理 納品先マスタ検索画面用DTOデータセット
		deliveryMasterSearchDto.data.list = mapper.mappingToDtoList(mCustomerList);

		return deliveryMasterSearchDto;
	}

}
