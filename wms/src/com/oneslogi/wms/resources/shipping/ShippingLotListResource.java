package com.oneslogi.wms.resources.shipping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.TLotCB;
import com.oneslogi.base.dbflute.dto.TLastLotDto;
import com.oneslogi.base.dbflute.dtomapper.TLastLotDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TLotBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TLastLot;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.shipping.ShippingLotListDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.LotLimitCheckLogic;
import com.oneslogi.wms.logic.shipping.ShippingLotListSelectLogic;
import com.oneslogi.wms.logic.shipping.ShippingLotListUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 出荷期限管理一覧。
 */
@Path("/shipping/shippingLotList")
public class ShippingLotListResource extends AbstractWmsResource {

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
		 * 最終ロット管理データ取得異常
		 */
		protected static final int SHIPPING_LOT_SELECT_FAILED = 2;
		/**
		 * ロット・期限日入力チェック異常
		 */
		protected static final int CHECK_FAILED = 3;
		/**
		 * 最終ロット管理データ更新処理異常
		 */
		protected static final int SHIPPING_LOT_UPDATE_FAILED = 4;

	}

	@Inject
	private ClientLogic clientLogic;

	// [#1517] 出荷期限日一覧の不要な項目 (センタCD関連処理の削除) 2017.04.18 kawana

	@Inject
	private ShippingLotListSelectLogic shippingLotListSelectLogic;
	@Inject
	private LotLimitCheckLogic lotLimitCheckLogic;
	@Inject
	private ShippingLotListUpdateLogic shippingLotListUpdateLogic;
	@Inject
	private TLotBhv tLotBhv;

	/**
	 * 登録または更新データ組立の結果
	 */
	private enum ResultSetupData {
		ALL_OK,
		ERROR,
	}

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ShippingLotListDto 出荷期限管理一覧画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ShippingLotListDto initNew() {
		return new ShippingLotListDto();
	}

	/**
	 * <h2>最終ロット管理データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、出荷期限管理一覧データ取得
	 * </pre>
	 * @param shippingLotListDto 出荷期限管理一覧画面用DTO
	 * @return ShippingLotListDto 出荷期限管理一覧画面用DTO
	 */
	@GET
	@Path("/search")
	public ShippingLotListDto search(ShippingLotListDto shippingLotListDto, ErrorStatus errSts) throws IOException {
		ShippingLotListDto shippingLotDto = new ShippingLotListDto();

		// Entity変換
		TLastLotDtoMapper mapper = new TLastLotDtoMapper();
		TLastLot entity = mapper.mappingToEntity(shippingLotListDto.data.head);

		// 荷主ID取得
		String clientCd = shippingLotListDto.data.head.getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// [#1517] 出荷期限日一覧の不要な項目 (センタCD関連処理の削除) 2017.04.18 kawana

		// 商品マスタ
		MProduct mProduct = entity.getMProduct();
		// 取引先マスタ
		MCustomer mCustomer = entity.getMCustomer();

		// [#1517] 出荷期限日一覧の不要な項目 (センタCDでの絞込みを削除) 2017.04.18 kawana Start

		// 検索
		List<TLastLot> tLastLotList = shippingLotListSelectLogic.select(mClient, mProduct, mCustomer, errRetSts(StatusCode.SHIPPING_LOT_SELECT_FAILED));
		if (getErrorManager().size() > 0) {
			return null;
		}

		// [#1517] 出荷期限日一覧の不要な項目 (センタCDでの絞込みを削除) 2017.04.18 kawana End

		List<TLastLotDto> list = mapper.mappingToDtoList(tLastLotList);

		//検索結果詰込処理
		shippingLotDto.data.body = list;

		return shippingLotDto;

	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックは結果で判定。
	 * </pre>
	 * @param shippingLotListDto 出荷期限管理一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(ShippingLotListDto shippingLotListDto, ErrorStatus errSts) {
		ResultSetupData resultStatus = setupInputCheck(shippingLotListDto,errRetSts(StatusCode.SHIPPING_LOT_UPDATE_FAILED));

		switch (resultStatus) {
		case ERROR:
			return null;
		case ALL_OK:
			// 通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
			break;
		}

		return null;
	}
	/**
	 * <h2>ロット・期限日入力チェック。</h2>
	 * <pre>
	 * データのチェックを行う。
	 * ・ロット・期限日入力チェック。
	 * </pre>
	 * @param shippingLotListDto 出荷期限管理一覧画面用DTO
	 * @param errSts エラー時に登録するエラーステータス
	 * @return ResultSetupData 処理結果
	 */
	protected ResultSetupData setupInputCheck(ShippingLotListDto shippingLotListDto, ErrorStatus errSts) {
		TLastLotDtoMapper mapper = new TLastLotDtoMapper();
		List<TLastLot> entityList = mapper.mappingToEntityList(shippingLotListDto.data.body);
		for (TLastLot tLastLot : entityList) {
			MClient mClient = new MClient();
			mClient.setClientId(entityList.get(0).getMProduct().getClientId());
			mClient = clientLogic.getPkEntity(mClient);

			// [#1517] 出荷期限日一覧の不要な項目 (センタCD関連処理の削除) 2017.04.18 kawana

			MProduct mProduct = tLastLot.getMProduct();
			TLot tLot = tLastLot.getTLot();
			lotLimitCheckLogic.check(mClient, mProduct, tLot, WCC.ONE, errRetSts(StatusCode.CHECK_FAILED));
		}
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		int rowIndex = -1;
		for (TLastLot tLastLot : entityList) {
			rowIndex++;
			TLot tlot = tLastLot.getTLot();
			TLotCB cbTlot = tLotBhv.newMyConditionBean();
			cbTlot.query().setLimitDt_Equal(tlot.getLimitDt());
			cbTlot.query().setProductId_Equal(tlot.getProductId());
			cbTlot.query().setLot_Equal(tlot.getLot());

			List<TLot> tLotList = new ArrayList<TLot>();

			tLotList = tLotBhv.selectList(cbTlot);

			if (tLotList.size() == 0) {
				getErrorManager().add(new ErrorStatus(errSts, StatusCode.SHIPPING_LOT_SELECT_FAILED, rowIndex), WmsMessageConst.LOT_NOT_FOUND_IN_LOT_MASTER_ERROR);
			}
		}
		// 結果の設定
		ResultSetupData resultStatus;
		if (0 < getErrorManager().size()) {
			resultStatus = ResultSetupData.ERROR;
		} else {
			resultStatus = ResultSetupData.ALL_OK;
		}

		return resultStatus;
	}

	/**
	 * <h2>最終ロット管理データ更新処理。</h2>
	 * <pre>
	 * ・ロット・期限日入力チェック
	 * ・エラーがない場合は、データベースに最終ロット管理データを更新し、完了メッセージを設定する
	 * </pre>
	 * @param shippingLotListDto 出荷期限管理一覧画面用DTO
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return StatusDto 処理結果DTO
	 */
	@GET
	@Path("/update")
	public StatusDto update(ShippingLotListDto shippingLotListDto, ErrorStatus errSts) throws IOException {
		TLastLotDtoMapper mapper = new TLastLotDtoMapper();
		List<TLastLot> entityList = mapper.mappingToEntityList(shippingLotListDto.data.body);
		for (TLastLot tLastLot : entityList) {
			TLot tlot = tLastLot.getTLot();
			// DB最終ロット管理データ更新
			shippingLotListUpdateLogic.update(tLastLot, tlot, errRetSts(StatusCode.SHIPPING_LOT_UPDATE_FAILED));
		}
		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return null;
	}

}
