package com.oneslogi.wms.resources.shipping;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.dtomapper.TPackingHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlPackingSlipListPrint;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.PackingSlipListDto;
import com.oneslogi.wms.dto.shipping.PackingSlipListPrintDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.shipping.PackingSlipListPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * Packing Slip出力に必要な各種情報を取得するクラス
 *
 */
@Path("/shipping/packingSlipListPrint")
public class PackingSlipListPrintResource extends AbstractWmsResource {

	private static final String REPORT_CD = "PackingSlipList";

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
		 * Packing Slipデータ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;

		/**
		 * 出庫帳票更新異常
		 */
		protected static final int UPDATE_EXCEPTION = 3;

	}
	@Inject
	private PackingSlipListPrintLogic packingSlipListPrintLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private PrintLogic printLogic;


	/**
	 * <h2>Packing Slip。</h2>
	 * <pre>
	 * コントロールNo.を更新してから、出庫帳票データを取得する
	 * 帳票を発行する
	 * エラーがない場合は、データベースに出庫帳票データを更新する
	 * ・Bill of Lading出力フラグ
	 * </pre>
	 * @param dto Packing Slip画面用DTO
	 * @return packingSlipListPrintDto 処理結果DTO
	 */

	@GET
	@Path("/printPackingSlip")
	public PackingSlipListPrintDto printPackingSlip(final PackingSlipListPrintDto dto) throws Exception {

		// 発行帳票を指定
		dto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// Entity変換
		TPackingHDtoMapper mapper = new TPackingHDtoMapper();
		TPackingH entity = mapper.mappingToEntity(dto.data.search);

		//コントロールNo更新
		TPickingR update = new TPickingR();

		TAllocInstH tAllocInstH = new TAllocInstH();

		TPickingH tPickingH = new TPickingH();

		TPickingR tPickingR = new TPickingR();

		TShippingInstH tShippingInstH = new TShippingInstH();

        //エンティティ編集
        update.setControlNo(controlNo);

        //センタID取得
        String centerCd = entity.getMCenter().getCenterCd();

		MCenter mCenter = new MCenter();

		mCenter.setCenterCd(centerCd);

		mCenter = centerLogic.getUkEntity(mCenter);

		if (mCenter == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		tPickingH.setCenterId(mCenter.getCenterId());

		//荷主ID取得
		String clientCd = entity.getMClient().getClientCd();

		MClient mClient = new MClient();

		mClient.setClientCd(clientCd);

		mClient = clientLogic.getUkEntity(mClient);

		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		tPickingH.setClientId(mClient.getClientId());

		//出荷日
		tShippingInstH.setShippingDt(entity.chaseTAllocInstH().getShippingDt());

		//納品先CD
		tAllocInstH.setSupplyCustomerCd(entity.chaseTAllocInstH().getSupplyCustomerCd());

        //発行条件
        if(!"2".equals(entity.getPrintCondition())){
        	tPickingR.setPackingOutFlg(entity.getPrintCondition());
        }

        //出庫作業No.
        tPickingH.setPickingWorkNo(entity.chaseTPickingH().getPickingWorkNo());

        //顧客出荷指示No.
        tShippingInstH.setClientShippingNo(entity.getClientShippingNo());

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
        packingSlipListPrintLogic.updateControlNo(update, tPickingH, tAllocInstH, tPickingR, tShippingInstH, errRetSts(StatusCode.UPDATE_EXCEPTION));

        if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

        //出庫帳票(検索用)
        tPickingR.setControlNo(update.getControlNo());

        //Packing Slipデータ取得メソッドを呼出し
        ListResultBean<SqlPackingSlipListPrint> tPickingHList = packingSlipListPrintLogic.select(entity.getClientShippingNo(),update, errRetSts(StatusCode.NOT_FOUND_DATA));

        if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

        // 帳票出力データ取得処理
        List<PackingSlipListDto> dataList = new ArrayList<PackingSlipListDto>();

        for (SqlPackingSlipListPrint head: tPickingHList) {
        	PackingSlipListDto redto = new PackingSlipListDto();

    	    redto.cultureId = getCultureId();
    	    // ヘッダ部
    	    //帳票CD
    	    redto.reportCd = REPORT_CD;

    		//荷主
    	    redto.clientCd = head.getClientCd();

    		//荷主名称
    	    redto.clientNm = head.getClientNm();

    		//荷主センタ住所１
    	    redto.clientAddress1 = head.getClientAddress1();

    		//荷主センタ住所２
    	    redto.clientAddress2 = head.getClientAddress2();

    		//荷主センタ住所３
    	    redto.clientAddress3 = head.getClientAddress3();

    		//荷主電話番号
    	    redto.clientTelNo = head.getClientTelNo();

    		//出荷日
    	    redto.shippingDt = head.getShippingDt();

    		//オーダーNo
    	    redto.clientShippingNo = head.getClientShippingNo();

    		//請求先名称
    	    redto.supplyCustomerNm = head.getSupplyCustomerNm();

    		//請求先住所１
    	    redto.billAddress1 = head.getBillAddress1();

    		//請求先住所２
    	    redto.billAddress2 = head.getBillAddress2();

    		//請求先住所３
    	    redto.billAddress3 = head.getBillAddress3();

    		//請求先電話番号
    	    redto.billTelNo = head.getBillTelNo();

    		//出荷先名称
    	    redto.delivCustomerNm = head.getDelivCustomerNm();

    		//請求先住所１
    	    redto.delivAddress1 = head.getDelivAddress1();

    		//出荷先住所２
    	    redto.delivAddress2 = head.getDelivAddress2();

    		//出荷先住所３
    	    redto.delivAddress3 = head.getDelivAddress3();

    		//出荷先電話番号
    	    redto.delivTelNo = head.getDelivTelNo();

    		//商品コード
    	    redto.productCd = head.getProductCd();

    		//商品名称
    	    redto.productNm = head.getProductNm();

    		//数量
    	    redto.allocNum = head.getAllocNum();

			dataList.add(redto);
		}

		//帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		//梱包帳票を発行する
		dto.printBasicData.outputData = json.format(dataList);
		printLogic.print(dto);

		PackingSlipListPrintDto packingSlipListPrintDto = new PackingSlipListPrintDto();
		packingSlipListPrintDto.output = dto.output;

		Timestamp time = new Timestamp(System.currentTimeMillis());

		//出庫帳票更新
		update.setControlNo(null);

		update.setPackingOutFlg_$1();

		update.setPackingOutUserId(this.getUserId());

		update.setPackingOutDt(time);

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		packingSlipListPrintLogic.updatePrOutFlg(update, tPickingR, errRetSts(StatusCode.UPDATE_EXCEPTION));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return packingSlipListPrintDto;
	}
}
