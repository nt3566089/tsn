package com.oneslogi.wms.resources.stock;

import java.io.IOException;
import java.text.ParseException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.wms.dto.stock.ShippingPalleteInfoInquiryDetailDto;
import com.oneslogi.wms.dto.stock.ShippingPalleteInfoInquiryDetailDto.ShippingPalleteInfoInquiryDetailHeadData;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.stock.ShippingPalleteInfoInquiryDetailSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 出庫パレット情報照会(詳細)画面のリソースクラス。
 */
@Path("/stock/ShippingPalleteInfoInquiryDetail")
public class ShippingPalleteInfoInquiryDetailResource extends AbstractWmsResource {

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
		 * 出庫パレット情報照会(詳細)データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingPalleteInfoInquiryDetailSelectLogic selectLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・出庫パレット情報照会(詳細)のヘッダ情報を設定
	 * </pre>
	 * @return ShippingPalleteInfoInquiryDetailDto 出庫パレット情報照会検索画面用DTO
	 */
	@GET
	@Path("/init")
	public ShippingPalleteInfoInquiryDetailDto init(@QueryParam("centerCd") String centerCd,@QueryParam("clientCd") String clientCd,
			@QueryParam("sts") String sts,@QueryParam("soPalletNo") String soPalletNo,@QueryParam("shipSchDate") String shipSchDate,
			@QueryParam("ownerOrderNo") String ownerOrderNo,@QueryParam("orderType") String orderType,@QueryParam("custOrderNo") String custOrderNo,
			@QueryParam("rmaNo") String rmaNo,@QueryParam("refNo") String refNo,@QueryParam("shipDate") String shipDate,
			@QueryParam("expectQty1Style1") Long expectQty1Style1,@QueryParam("expectQty1Style2") Long expectQty1Style2,@QueryParam("shipToCd") String shipToCd,
			@QueryParam("shipToSName") String shipToSName,@QueryParam("otherRefNo1") String otherRefNo1,@QueryParam("palletKey") String palletKey,@QueryParam("soId") long soId) {

		// =======================================================
		// =              引継ぎデータの設定                     =
		// =======================================================
		
		// 画面用DTO作成
		ShippingPalleteInfoInquiryDetailDto dto =  new ShippingPalleteInfoInquiryDetailDto();
		
		//ヘッダ情報の設定
		dto.data.head.setCenterCd(centerCd);
		dto.data.head.setClientCd(clientCd);
		dto.data.head.setStatus(sts);
		dto.data.head.setSoPalletNo(soPalletNo);
		dto.data.head.setShipSchDate(shipSchDate);
		dto.data.head.setOwnerOrderNo(ownerOrderNo);
		dto.data.head.setRequestType(orderType);

		if(custOrderNo.matches(" ")){
			dto.data.head.setCustorderNo("");
		}else{
			dto.data.head.setCustorderNo(custOrderNo);
		}

		if(refNo.matches(" ")){
			dto.data.head.setRefNo("");
		}else{
			dto.data.head.setRefNo(refNo);
		}

		dto.data.head.setRmaNo(rmaNo);
		dto.data.head.setShipDate(shipDate);
		dto.data.head.setTotalQtyCase(expectQty1Style1);
		dto.data.head.setTotalQtyCarton(expectQty1Style2);
		dto.data.head.setShipToCd(shipToCd);
		dto.data.head.setOtherRefNo1(otherRefNo1);
		dto.data.head.setPalletKey(palletKey);
		dto.data.head.setSoId(soId);
		
		return dto;

	}
	
//	/**
//	 * <h2>出庫パレット情報照会(詳細)データ取得。</h2>
//	 * <pre>
//	 * ・画面用DTOの作成
//	 * ・前画面から渡されたCDを元にIDを取得し、出庫パレット情報照会(詳細)の明細データを取得
//	 * </pre>
//	 * @param soId 出庫予定ID
//	 * @param centerCd 拠点CD
//	 * @param clientCd 荷主CD
//	 * @return ShippingPalleteInfoInquiryDetailDto 出庫パレット情報照会(詳細)画面用DTO
//	 * @throws ParseException
//	 */
//	@GET
//	@Path("/search")
//	public ShippingPalleteInfoInquiryDetailDto search(@QueryParam("soId") Long soId,@QueryParam("centerCd") String centerCd,@QueryParam("clientCd") String clientCd) throws IOException, ParseException {
//
//		// =======================================================
//		// =              選択行データの設定                     =
//		// =======================================================
//		
//		ShippingPalleteInfoInquiryDetailDto dto = new ShippingPalleteInfoInquiryDetailDto();
//		
//		//明細情報の取得
//		MClient mClient = new MClient();
//		MCenter mCenter = new MCenter();
//		
//		// 荷主マスタ検索で必要なIDの取得
//		MClient clientCondition = new MClient();
//		clientCondition.setClientCd(clientCd);
//		// 荷主ID
//		Long clientId = clientLogic.getUkEntity(clientCondition).getClientId();
//		String clientNm = clientLogic.getUkEntity(clientCondition).getClientNm();
//
//		mClient.setClientId(clientId);
//		mClient.setClientCd(clientCd);
//		mClient.setClientNm(clientNm);
//
//		// センタマスタ検索で必要なIDの取得
//		MCenter centerCondition = new MCenter();
//		centerCondition.setCenterCd(centerCd);
//		// センタID
//		Long centerId = centerLogic.getUkEntity(centerCondition).getCenterId();
//		String centerNm = centerLogic.getUkEntity(centerCondition).getCenterNm();
//
//		mCenter.setCenterId(centerId);
//		mCenter.setCenterCd(centerCd);
//		mCenter.setCenterNm(centerNm);
//		
//		dto.data.body = this.selectLogic.select(soId,mCenter,mClient,errRetSts(StatusCode.NOT_FOUND_DATA));
//		
//		return dto;
//	}
	
	/**
	 * <h2>出庫パレット情報照会(詳細)データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・前画面から渡されたCDを元にIDを取得し、出庫パレット情報照会(詳細)の明細データを取得
	 * </pre>
	 * @param soId 出庫予定ID
	 * @param centerCd 拠点CD
	 * @param clientCd 荷主CD
	 * @return ShippingPalleteInfoInquiryDetailDto 出庫パレット情報照会(詳細)画面用DTO
	 * @throws ParseException
	 */
	@GET
	@Path("/search")
	public ShippingPalleteInfoInquiryDetailDto search(ShippingPalleteInfoInquiryDetailDto shippingPalleteInfoInquiryDetailDto) throws IOException, ParseException {

		// =======================================================
		// =              選択行データの設定                     =
		// =======================================================
		ShippingPalleteInfoInquiryDetailDto dto = new ShippingPalleteInfoInquiryDetailDto();
		ShippingPalleteInfoInquiryDetailHeadData head = shippingPalleteInfoInquiryDetailDto.data.head;
		
		//明細情報の取得
		MClient mClient = new MClient();
		MCenter mCenter = new MCenter();
		
		// 荷主マスタ検索で必要なIDの取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(head.getClientCd());
		// 荷主ID
		Long clientId = clientLogic.getUkEntity(clientCondition).getClientId();
		String clientNm = clientLogic.getUkEntity(clientCondition).getClientNm();

		mClient.setClientId(clientId);
		mClient.setClientCd(head.getClientCd());
		mClient.setClientNm(clientNm);

		// センタマスタ検索で必要なIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(head.getCenterCd());
		// センタID
		Long centerId = centerLogic.getUkEntity(centerCondition).getCenterId();
		String centerNm = centerLogic.getUkEntity(centerCondition).getCenterNm();

		mCenter.setCenterId(centerId);
		mCenter.setCenterCd(head.getCenterCd());
		mCenter.setCenterNm(centerNm);
		
		dto.data.body = this.selectLogic.select(head.getSoId(),mCenter,mClient,errRetSts(StatusCode.NOT_FOUND_DATA));
		
		return dto;
	}
	
}
