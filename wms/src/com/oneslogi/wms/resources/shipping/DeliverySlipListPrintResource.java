package com.oneslogi.wms.resources.shipping;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import com.oneslogi.base.dbflute.dtomapper.TPackingHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.DeliverySlipListDto;
import com.oneslogi.wms.dto.shipping.DeliverySlipListPrintDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.shipping.DeliverySlipListPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 納品明細発行出力に必要な各種情報を取得するクラス
 *
 */
@Path("/shipping/deliverySlipListPrint")
public class DeliverySlipListPrintResource extends AbstractWmsResource {

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (REPORT_CDをロジッククラスに移動) 2018.08.20 kawana Delete

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
		 * 納品明細発行データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;

		/**
		 * 出庫帳票更新異常
		 */
		protected static final int UPDATE_EXCEPTION = 3;

	}
	@Inject
	private DeliverySlipListPrintLogic deliverySlipListPrintLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (clientCenterLogicをロジッククラスに移動) 2018.08.20 kawana Delete
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private PrintLogic printLogic;


	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return deliverySlipListPrintDto 納品明細発行画面用DTO
	 */
	@GET
	@Path("/init")
	public DeliverySlipListPrintDto init() {
		DeliverySlipListPrintDto deliverySlipListPrintDto = new DeliverySlipListPrintDto();

		// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (REPORT_CDをロジッククラスに移動) 2018.08.20 kawana Start

		// 出庫帳票を指定
		deliverySlipListPrintDto.printBasicData.reportId = reportLogic.getReportId(DeliverySlipListPrintLogic.REPORT_CD);

		// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (REPORT_CDをロジッククラスに移動) 2018.08.20 kawana End

		return deliverySlipListPrintDto;
	}

	// 米国出荷ドキュメント追加対応 2018.01.08 PYM Start
	/**
	 * <h2>レポートIDを取得。</h2>
	 * <pre>
	 * ・レポートIDのリストの作成
	 * ・レポートCDをキーにレポートID取り出し
	 * ・レポートIDを画面用DTOに設定
	 * </pre>
	 * @return listReportId レポートIDのリスト
	 */
	@GET
	@Path("/getReportId")
	public List<String> getReportId() {

		List<String> listReportId = new ArrayList<String>();
		//listReportId.add(""+reportLogic.getReportId("DeliverySlipList"));
		listReportId.add(""+reportLogic.getReportId("PackingSlipList"));

		return listReportId;
	}
	// 米国出荷ドキュメント追加対応 2018.01.08 PYM End

	/**
	 * <h2>納品明細発行。</h2>
	 * <pre>
	 * コントロールNo.を更新してから、出庫帳票データを取得する
	 * 帳票を発行する
	 * エラーがない場合は、データベースに出庫帳票データを更新する
	 * ・納品明細書出力フラグ
	 * </pre>
	 * @param dto 納品明細発行画面用DTO
	 * @return deliverySlipListPrintDto 処理結果DTO
	 */

	@GET
	@Path("/print")
	public DeliverySlipListPrintDto print(final DeliverySlipListPrintDto dto) throws Exception {

		// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (REPORT_CDをロジッククラスに移動) 2018.08.20 kawana Start
		// 発行帳票を指定
		dto.printBasicData.reportId = reportLogic.getReportId(DeliverySlipListPrintLogic.REPORT_CD);
		// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (REPORT_CDをロジッククラスに移動) 2018.08.20 kawana End

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
		tAllocInstH.setShippingDt(entity.chaseTAllocInstH().getShippingDt());

		//納品先CD
		tAllocInstH.setSupplyCustomerCd(entity.chaseTAllocInstH().getSupplyCustomerCd());

        //発行条件
        if(!"2".equals(entity.getPrintCondition())){
        	tPickingR.setPackingOutFlg(entity.getPrintCondition());
        }

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
        deliverySlipListPrintLogic.updateControlNo(update, tPickingH, tAllocInstH, tPickingR, errRetSts(StatusCode.UPDATE_EXCEPTION));

        if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

        //出庫帳票(検索用)
        tPickingR.setControlNo(update.getControlNo());

		// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (帳票用Dtoへの変換処理をロジッククラスに移動) 2018.08.20 kawana Start

		// 帳票用Dto取得
		List<DeliverySlipListDto> dataList = deliverySlipListPrintLogic.selectReportDtoList(tPickingR, mCenter.getCenterId(), mClient.getClientId(), errRetSts(StatusCode.NOT_FOUND_DATA));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (帳票用Dtoへの変換処理をロジッククラスに移動) 2018.08.20 kawana End

		//帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		//梱包帳票を発行する
		dto.printBasicData.outputData = json.format(dataList);
		printLogic.print(dto);

		DeliverySlipListPrintDto deliverySlipListPrintDto = new DeliverySlipListPrintDto();
		deliverySlipListPrintDto.output = dto.output;

		Timestamp time = new Timestamp(System.currentTimeMillis());

		//出庫帳票更新
		update.setControlNo(null);

		update.setPackingOutFlg_$1();

		update.setPackingOutUserId(this.getUserId());

		update.setPackingOutDt(time);

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		deliverySlipListPrintLogic.updatePrOutFlg(update, tPickingR, errRetSts(StatusCode.UPDATE_EXCEPTION));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return deliverySlipListPrintDto;
	}
}
