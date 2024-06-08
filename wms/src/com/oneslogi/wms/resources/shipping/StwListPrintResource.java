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
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPackingR;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.StwListDto;
import com.oneslogi.wms.dto.shipping.StwListPrintDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.DeliveryCourseLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.shipping.StwListPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 積込リスト出力に必要な各種情報を取得するクラス
 *
 */
@Path("/shipping/stwListPrint")
public class StwListPrintResource extends AbstractWmsResource {

	private static final String REPORT_CD = "StwList";

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
		 * 積込リスト発行データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;

		/**
		 * 梱包帳票更新異常
		 */
		protected static final int UPDATE_EXCEPTION = 3;

		/**
		 * 配送コース一括変更異常
		 */
		protected static final int DELIVERY_COURSE_UDPATE_ERROR = 4;
	}

	@Inject
	private StwListPrintLogic stwListPrintLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private DeliveryCourseLogic deliveryCourseLogic;
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
	 * @return stwListPrintDto 積込リスト発行画面用DTO
	 */
	@GET
	@Path("/init")
	public StwListPrintDto init() {
		StwListPrintDto stwListPrintDto = new StwListPrintDto();

		// 発行帳票を指定
		stwListPrintDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		return stwListPrintDto;
	}

	/**
	 * <h2>積込リスト発行。</h2>
	 * <pre>
	 * コントロールNo.を更新してから、梱包帳票データを取得する
	 * 帳票を発行する
	 * エラーがない場合は、データベースに梱包帳票データを更新する
	 * ・積込リスト出力フラグ
	 * </pre>
	 * @param  dto 積込リスト発行画面用DTO
	 * @return stwListPrintDto 処理結果DTO
	 */
	@GET
	@Path("/print")
	public StwListPrintDto print(final StwListPrintDto dto) throws Exception {

		// 発行帳票を指定
		dto.printBasicData.reportId  = reportLogic.getReportId(REPORT_CD);

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// Entity変換
		TPackingHDtoMapper mapper = new TPackingHDtoMapper();
		TPackingH entity = mapper.mappingToEntity(dto.data.search);

		//コントロールNo更新
		TPackingR update = new TPackingR();

		TPackingH tPackingH = new TPackingH();

		TAllocInstH tAllocInstH = new TAllocInstH();

		TPackingR report = new TPackingR();

		//エンティティ編集
		update.setControlNo(controlNo);

		//センタID取得
		String centerCd = entity.getMCenter().getCenterCd();

		MCenter mCenter = new MCenter();

		mCenter.setCenterCd(centerCd);

		mCenter = centerLogic.getUkEntity(mCenter);

		//ON推-CT4-246
		tPackingH.setCenterId(mCenter.getCenterId());

		//荷主ID取得
		String clientCd = entity.getMClient().getClientCd();

		MClient mClient = new MClient();

		mClient.setClientCd(clientCd);

		mClient = clientLogic.getUkEntity(mClient);

		//ON推-CT4-246
		tPackingH.setClientId(mClient.getClientId());

		String deliveryCourseCd = entity.chaseTAllocInstH().chaseMDeliveryCourse().getDeliveryCourseCd();

		if(!CU.isNullOrEmpty(deliveryCourseCd)){
			MDeliveryCourse mDeliveryCourseEntity = new MDeliveryCourse();

			mDeliveryCourseEntity.setCenterId(mCenter.getCenterId());

			mDeliveryCourseEntity.setDeliveryCourseCd(deliveryCourseCd);

			MDeliveryCourse mDeliveryCourse = deliveryCourseLogic.getUkEntity(mDeliveryCourseEntity);

			if (mDeliveryCourse == null) {
				this.getErrorManager().add(errRetSts(StatusCode.UPDATE_EXCEPTION), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}
			tAllocInstH.setDeliveryCourseId(mDeliveryCourse.getDeliveryCourseId());
		}

		//出荷日取得
		tAllocInstH.setShippingDt(entity.chaseTAllocInstH().getShippingDt());

		//発行条件
		if (!"2".equals(entity.getPrintCondition())) {
			report.setStwOutFlg(entity.getPrintCondition());
		}

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
		stwListPrintLogic.updateControlNo(update, tPackingH, tAllocInstH, report, errRetSts(StatusCode.UPDATE_EXCEPTION));

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		//積込リスト帳票(検索用)
		report.setControlNo(update.getControlNo());

		//積込リスト発行データ取得メソッドを呼出し
		List<TPickingH> tPickingHList = stwListPrintLogic.select(update, errRetSts(StatusCode.NOT_FOUND_DATA));

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 帳票出力データ取得処理
		List<StwListDto> dataList = new ArrayList<StwListDto>();

		for (TPickingH head : tPickingHList) {
			StwListDto redto = new StwListDto();
			redto.cultureId = getCultureId();

			// ===== ヘッダ部 =====

			//帳票CD
			redto.reportCd = REPORT_CD;

			//センタCD
			redto.centerCd = head.chaseMCenter().getCenterCd();

			//センタ名称
			redto.centerNm = head.chaseMCenter().getCenterAbbr();

			//荷主CD
			redto.clientCd = head.chaseMClient().getClientCd();

			//荷主名称
			redto.clientNm = head.chaseMClient().getClientAbbr();

			//出荷日
			redto.shippingDt = head.chaseTAllocInstH().getShippingDt();

			//配送コースCD
			redto.deliveryCourseCd = head.chaseTAllocInstH().chaseMDeliveryCourse().getDeliveryCourseCd();

			///配送コース名称
			redto.deliveryCourseNm = head.chaseTAllocInstH().chaseMDeliveryCourse().getDeliveryCourseNm();

			//運送業者CD
			redto.carrierCd = head.chaseTAllocInstH().chaseMDeliveryCourse().chaseMCarrier().getCarrierCd();

			//運送業者名称
			redto.carrierNm = head.chaseTAllocInstH().chaseMDeliveryCourse().chaseMCarrier().getCarrierAbbr();

			//処理区分CD
			redto.setProcessTypeCd(head.chaseMProcessType().getProcessTypeCd());

			//処理区分名称
			redto.setProcessTypeNm(head.chaseMProcessType().chaseVDict().getDictNm());

			// ===== ボディ部 =====

			// [#1782] 納品先名称を届先名称に変更 2017.05.12 kawana Start

			//納品先 (※住所に合わせて届先が優先)
			redto.supplierCustomerCd = CU.coalesce(head.chaseTAllocInstH().getDelivCustomerCd(), head.chaseTAllocInstH().getSupplyCustomerCd());
			//[検査-191]「納品先名称も含めトランザクションから印字するように修正します。」に修正 2014.12.02 衛 Start
			redto.supplierCustomerNm = CU.coalesce(head.chaseTAllocInstH().getDelivCustomerNm(), head.chaseTAllocInstH().getSupplyCustomerNm());
			//[検査-191]「納品先名称も含めトランザクションから印字するように修正します。」に修正 2014.12.02 衛 End

			// [#1782] 納品先名称を届先名称に変更 2017.05.12 kawana End

			//住所１
			redto.delivAddress1 = head.chaseTAllocInstH().getDelivAddress1();

			//住所２
			redto.delivAddress2 = head.chaseTAllocInstH().getDelivAddress2();

			//出庫作業No.
			redto.pickingWorkNo = head.getPickingWorkNo();

			//個口数
			redto.sumPickingHCount = head.getSumPickingHCount();

			// 発行フラグ
			redto.printFlg = head.getStwOutFlg();

			dataList.add(redto);
		}

		//帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		//梱包帳票を発行する
		dto.printBasicData.outputData = json.format(dataList);
		printLogic.print(dto);

		StwListPrintDto stwListPrintDto = new StwListPrintDto();
		stwListPrintDto.output = dto.output;

		Timestamp time = new Timestamp(System.currentTimeMillis());

		//梱包帳票更新
		update.setControlNo(null);

		update.setStwOutFlg_$1();

		update.setStwOutUserId(this.getUserId());

		update.setStwOutDt(time);

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		stwListPrintLogic.updateSlOutFlg(update, report, errRetSts(StatusCode.UPDATE_EXCEPTION));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return stwListPrintDto;
	}
}
