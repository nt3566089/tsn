package com.oneslogi.wms.resources.assist;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dtomapper.MCustomerDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.assist.VendorMasterSearchDto;
import com.oneslogi.wms.logic.assist.VendorListSelectLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 仕入先マスタ検索画面のリソースクラス
 */
@Path("/assist/vendorMasterSearch")
public class VendorMasterSearchResource extends AbstractWmsResource {

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
		 * 仕入先検索データ取得異常
		 */
		protected static final int VENDOR_MASTER_SEARCH_FAILED = 2;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private VendorListSelectLogic vendorListSelectLogic;

	@Inject
	private ClientLogic clientLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return VendorMasterSearchDto 仕入先マスタ検索画面用DTO
	 */
	@GET
	@Path("/initNew")
	public VendorMasterSearchDto initNew() {
		// 画面用DTO作成
		VendorMasterSearchDto vendorMasterSearchDto = new VendorMasterSearchDto();

		return vendorMasterSearchDto;
	}

	/**
	 * <h2>仕入先検索データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、仕入先検索データ取得
	 * </pre>
	 * @return VendorMasterSearchDto 仕入先マスタ検索画面用DTO
	 */
	@GET
	@Path("/search")
	public VendorMasterSearchDto search(VendorMasterSearchDto vendorMasterSearchDto) {
			// 荷主IDの取得
		String clientCd = vendorMasterSearchDto.data.head.getMClient().getClientCd();
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(clientCd);
		clientCondition = clientLogic.getUkEntity(clientCondition);
		if (clientCondition == null) {
			this.getErrorManager().add(errRetSts(StatusCode.VENDOR_MASTER_SEARCH_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		// エンティティ編集
		vendorMasterSearchDto.data.head.setClientId(clientCondition.getClientId());

		// エンティティ変換
		MCustomerDtoMapper mapper = new MCustomerDtoMapper();
		MCustomer header = mapper.mappingToEntity(vendorMasterSearchDto.data.head);

		// 仕入先検索データ取得.検索データ取得メソッドを呼出し
		PagingResultBean<MCustomer> page = vendorListSelectLogic.select(header,vendorMasterSearchDto.paging, errRetSts(StatusCode.VENDOR_MASTER_SEARCH_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// Dto変換処理
		vendorMasterSearchDto.data.list = mapper.mappingToDtoList(page);
		return vendorMasterSearchDto;

	}
}
