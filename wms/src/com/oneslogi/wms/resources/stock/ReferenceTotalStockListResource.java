package com.oneslogi.wms.resources.stock;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dtomapper.TStockDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.dto.stock.ReferenceTotalStockListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.stock.ReferenceTotalStockListLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * トータル在庫問合せ（参照）のリソースクラス。
 */
@Path("/stock/referenceTotalStockList")
public class ReferenceTotalStockListResource extends AbstractWmsResource {

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
		 * 一覧データ取得異常
		 */
		protected static final int SEARCH_DATA_ERROR = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ReferenceTotalStockListLogic referenceTotalStockListLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CustomerLogic customerLogic;

	// ===== 使用テーブル =====
	@Inject
	private StockTypeLogic stockTypeLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ReferenceTotalStockListDto 定点発注一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public ReferenceTotalStockListDto init() {
		// 画面用DTO作成
		ReferenceTotalStockListDto referenceTotalStockListDto = new ReferenceTotalStockListDto();
		return referenceTotalStockListDto;
	}

	/**
	 * <h2>トータル在庫問合せ（参照）データ取得。</h2>
	 * <pre>
	 * 以下のチェックを行う。チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する
	 * ・取得データが0件チェック
	 *
	 * 戻り値には次のテーブルが結合された結果が設定される。
	 *
	 * 【データ取得テーブル】
	 * 【パラメータの使用項目】
	 * </pre>
	 * @param referenceTotalStockListDto 検索条件
	 * @return PagingResultBean
	 */
	@GET
	@Path("/search")
	public ReferenceTotalStockListDto search(ReferenceTotalStockListDto referenceTotalStockListDto) throws Exception {
		// ===== 初期化 =====
		ReferenceTotalStockListDto result = new ReferenceTotalStockListDto();

		TStockDtoMapper mapper = new TStockDtoMapper();
		TStock tStock = mapper.mappingToEntity(referenceTotalStockListDto.data.head);

		// マスタ検索で必要なIDの取得
		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(tStock.chaseMLocation().chaseMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);

		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(tStock.chaseMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient != null) {
			tStock.setClientId(mClient.getClientId());

			// 預託ID取得
			MCustomer mCustomer = new MCustomer();
			mCustomer.setClientId(mClient.getClientId());
			mCustomer.setCustomerCd(tStock.chaseMCustomer().getCustomerCd());
			mCustomer = customerLogic.getUkEntity(mCustomer);
			if (mCustomer != null) {
				tStock.setDepositId(mCustomer.getCustomerId());
			}
		} else {
			mClient = new MClient();
		}

		// 在庫区分ID取得
		MStockType mStockType = new MStockType();
		mStockType.setStockTypeCd(tStock.chaseMStockType().getStockTypeCd());
		mStockType = stockTypeLogic.getUkEntity(mStockType);
		if (mStockType != null) {
			tStock.setStockTypeId(mStockType.getStockTypeId());
		}

		// 商品マスタデータ編集
		MProduct mProduct = new MProduct();
		mProduct.setProductCd(tStock.chaseMProduct().getProductCd());
		mProduct.setJanCd(tStock.chaseMProduct().getJanCd());

		// ロットデータ編集
		TLot tLot = new TLot();
		tLot.setLimitDtFrom(tStock.chaseTLot().getLimitDtFrom());
		tLot.setLimitDtTo(tStock.chaseTLot().getLimitDtTo());
		tLot.setLot(tStock.chaseTLot().getLot());

		// ユーザマスタ設定
		BUser bUser = new BUser();
		bUser.setUserCd(tStock.getReferenceUserCd());

		// ===== 一覧データ取得 =====

		PagingResultBean<TStock> tStocklist = referenceTotalStockListLogic.select(tStock, mCenter, mProduct, tLot, bUser, errRetSts(StatusCode.SEARCH_DATA_ERROR));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 上限チェック =====

		//  [#4685][v3.0] Excel出力時の上限数を変更 2018.06.08 kawana Start
		int allowListCount = getAllowCount();
		//  [#4685][v3.0] Excel出力時の上限数を変更 2018.06.08 kawana End
		if (0 < allowListCount) {
			if (allowListCount < tStocklist.size()) {
				this.getErrorManager().add(errRetSts(StatusCode.SEARCH_DATA_ERROR), WmsMessageConst.OVER_SAFETY_SIZE_ERROR, String.valueOf(allowListCount));
				return null;
			}
		}

		result.data.body = new TStockDtoMapper().mappingToDtoList(tStocklist);

		return result;
	}

	//  [#4685][v3.0] Excel出力時の上限数を変更 2018.06.08 kawana Start

	/**
	 * 上限数の取得
	 */
	private int getAllowCount() {

		if (isDataTypeExcel()) {
			return getPropertyIntValue(WmsPropertyConst.ALLOW_QUERY_COUNT_TO_EXCEL);
		} else {
			return getPropertyIntValue(WmsPropertyConst.ALLOW_RESPONSE_LIST_COUNT);
		}
	}

	//  [#4685][v3.0] Excel出力時の上限数を変更 2018.06.08 kawana End
}
