package com.oneslogi.wms.resources.stock;

import java.io.IOException;
import java.text.ParseException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.stock.ShippingPalleteInfoInquiryDto;
import com.oneslogi.wms.dto.stock.ShippingPalleteInfoInquiryDto.ShippingPalleteInfoInquiryHeadData;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.stock.ShippingPalleteInfoInquirySelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 出庫パレット情報照会画面のリソースクラス。
 */
@Path("/stock/ShippingPalleteInfoInquiry")
public class ShippingPalleteInfoInquiryResource extends AbstractWmsResource {

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
		 * 出庫パレット情報照会データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingPalleteInfoInquirySelectLogic selectLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・出庫パレット情報照会明細の空行を新規作成
	 * </pre>
	 * @return ShippingPalleteInfoInquiryDto 出庫パレット情報照会検索画面用DTO
	 */
	@GET
	@Path("/init")
	public ShippingPalleteInfoInquiryDto init() {

		// 画面用DTO作成
		ShippingPalleteInfoInquiryDto shippingPalleteInfoInquiryDto =  new ShippingPalleteInfoInquiryDto();
		
		return shippingPalleteInfoInquiryDto;

	}
	
	/**
	 * <h2>出庫パレット情報照会データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、出庫パレット情報照会データ取得
	 * </pre>
	 * @param shippingPalleteInfoInquiryDto 出庫パレット情報照会画面用DTO
	 * @return ShippingPalleteInfoInquiryDto 出庫パレット情報照会画面用DTO
	 * @throws ParseException
	 */
	@GET
	@Path("/search")
	public ShippingPalleteInfoInquiryDto search(ShippingPalleteInfoInquiryDto shippingPalleteInfoInquiryDto) throws IOException, ParseException {

		ShippingPalleteInfoInquiryDto result = new ShippingPalleteInfoInquiryDto();
		ShippingPalleteInfoInquiryHeadData head = shippingPalleteInfoInquiryDto.data.head;
		
		MClient mClient = new MClient();
		MCenter mCenter = new MCenter();

		// センタマスタ検索で必要なIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(head.getCenterCd());

		mCenter = centerLogic.getUkEntity(centerCondition);

		if (mCenter == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}

		mCenter.setCenterId(mCenter.getCenterId());
		mCenter.setCenterCd(mCenter.getCenterCd());
		mCenter.setCenterNm(mCenter.getCenterNm());
		
		// 荷主マスタ検索で必要なIDの取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(head.getClientCd());

		 mClient = clientLogic.getUkEntity(clientCondition);

		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}

		mClient.setClientId(mClient.getClientId());
		mClient.setClientCd(mClient.getClientCd());
		mClient.setClientNm(mClient.getClientNm());

		result.data.body = this.selectLogic.select(head,mCenter,mClient, errRetSts(StatusCode.NOT_FOUND_DATA));
		
		return result;
	}

}
