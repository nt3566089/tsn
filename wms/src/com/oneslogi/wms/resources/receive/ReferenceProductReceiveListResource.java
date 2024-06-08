package com.oneslogi.wms.resources.receive;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.receive.ReferenceProductReceiveListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.receive.ReferenceReceiveListToProductSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 商品別入荷一覧(参照)画面のリソースクラス。
 */
@Path("/receive/ReferenceProductReceiveList")
public class ReferenceProductReceiveListResource extends AbstractWmsResource {

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
		 * 商品別入荷一覧データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ReferenceReceiveListToProductSelectLogic selectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;

	/**
	 * <h2>初期処理(通常)</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ReferenceProductReceiveListDto 商品別入荷一覧(参照)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ReferenceProductReceiveListDto initNew() {
		return new ReferenceProductReceiveListDto();
	}

	/**
	 * <h2>商品別入荷一覧データ取得</h2>
	 * <pre>
	 * ・画面で入力されたCDを元にIDを取得し、商品別入荷一覧データ取得
	 * </pre>
	 * @param referenceProductReceiveListDto 商品別入荷一覧(参照)画面用DTO
	 * @return ReferenceProductReceiveListDto 商品別入荷一覧(参照)画面用DTO
	 */
	@GET
	@Path("/search")
	public ReferenceProductReceiveListDto search(ReferenceProductReceiveListDto referenceProductReceiveListDto) {

		ReferenceProductReceiveListDto resultReferenceProductReceiveListDto = new ReferenceProductReceiveListDto();

		// Entity変換
		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		final TReceivePlanH header = headerMapper.mappingToEntity(referenceProductReceiveListDto.data.head);

		// 荷主ID取得
		String clientCd = header.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		header.setClientId(mClient.getClientId());

		// センタID取得
		String centerCd = header.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		if (mCenter == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		header.setCenterId(mCenter.getCenterId());

		// 倉庫ID
		String warehouseCd = header.getPlanWarehouseCd();
		MWarehouse mWarehouse = new MWarehouse();
		mWarehouse.setWarehouseCd(warehouseCd);
		mWarehouse.setCenterId(mCenter.getCenterId());
		mWarehouse = warehouseLogic.getUkEntity(mWarehouse);

		if (!CU.isNullOrEmpty(warehouseCd)) {
			if (mWarehouse == null) {
				this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}
		}

		TStoreRecordB body = new TStoreRecordB();
		body.setStoreDtFrom(header.getStoreDtFrom());
		body.setStoreDtTo(header.getStoreDtTo());

		TReceivePlanB tReceivePlanB = new TReceivePlanB();
		tReceivePlanB.setProductCd(header.getProductCd());
		tReceivePlanB.setPlanClientOrderNo(header.getClientOrderNo());
		if (mWarehouse != null)
		{
			tReceivePlanB.setPlanWarehouseId(mWarehouse.getWarehouseId());
		}

		// 商品別入荷一覧データ取得(検索)メソッドを呼出し
		resultReferenceProductReceiveListDto = this.searchData(header, body, tReceivePlanB, referenceProductReceiveListDto.paging);

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		return resultReferenceProductReceiveListDto;
	}

	/**
	 * <h2>商品別入荷一覧データ取得(検索)</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・商品別入荷一覧データ取得
	 * </pre>
	 * @param header 入荷予定ヘッダ
	 * @param recordBody 入庫実績ボディ
	 * @param planBody 入荷予定ボディ
	 * @return ReferenceProductReceiveListDto 商品別入荷一覧(参照)画面用DTO
	 */
	protected ReferenceProductReceiveListDto searchData(TReceivePlanH header, TStoreRecordB recordBody, TReceivePlanB planBody,PagingData paging) {

		ReferenceProductReceiveListDto resultReferenceProductReceiveListDto = new ReferenceProductReceiveListDto();

		// 商品別入荷一覧データ取得(検索)メソッドを呼出し
		PagingResultBean<TReceivePlanB> page = selectLogic.select(header, planBody, recordBody, paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// 該当データ無し
		if (page.size() == 0) {
			return resultReferenceProductReceiveListDto;
		}


		// Dto変換処理
		TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper();
		List<TReceivePlanBDto> list = mapper.mappingToDtoList(page);

		// グリッドの預託CDと預託名称に値を設定
		for(TReceivePlanBDto tReceivePlanBDto : list) {
			if(tReceivePlanBDto != null) {
				if(tReceivePlanBDto.getTStoreRecordBList().size() > 0) {
					// 入荷実績あり
					tReceivePlanBDto.setDepositCd(tReceivePlanBDto.getTStoreRecordBList().get(0).getTStoreRecordH().getMCustomerByDepositId().getCustomerCd());
					tReceivePlanBDto.setDepositNm(tReceivePlanBDto.getTStoreRecordBList().get(0).getTStoreRecordH().getMCustomerByDepositId().getCustomerNm());
				} else {
					// 入荷実績なし
					tReceivePlanBDto.setDepositCd(tReceivePlanBDto.getTReceivePlanH().getMCustomerByPlanDepositId().getCustomerCd());
					tReceivePlanBDto.setDepositNm(tReceivePlanBDto.getTReceivePlanH().getMCustomerByPlanDepositId().getCustomerNm());
				}
			}
		}

		// 検索結果詰め替え処理
		resultReferenceProductReceiveListDto.paging = paging;
		// ===== 画面用DTO ボディの作成 =====
		for (TReceivePlanBDto selectBody : list) {
			resultReferenceProductReceiveListDto.data.list.add(ReferenceProductReceiveListDto.chaseTReceivePlanBDto(selectBody));
		}

		return resultReferenceProductReceiveListDto;
	}

}
