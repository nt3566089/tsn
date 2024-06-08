package com.oneslogi.wms.resources.shipping;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.dto.customize.SqlBillOfLadingPrintSelectDto;
import com.oneslogi.base.dbflute.dtomapper.TPickingHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlBillOfLadingPrintSelectDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCommonCarrier;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.customize.SqlBillOfLadingPrint;
import com.oneslogi.base.dbflute.exentity.customize.SqlBillOfLadingPrintSelect;
import com.oneslogi.base.dbflute.exentity.customize.SqlBillOfLadingPrintSubReport;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.BillOfLadingListDto;
import com.oneslogi.wms.dto.report.BillOfLadingListSubDto;
import com.oneslogi.wms.dto.shipping.BillOfLadingPrintDto;
import com.oneslogi.wms.dto.shipping.BillOfLadingPrintParamDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.shipping.BillOfLadingPrintLogic;
import com.oneslogi.wms.logic.shipping.BillOfLadingPrintSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * Bill of Lading発行画面のリソースクラス。
 */
@Path("/shipping/billOfLadingPrint")
public class BillOfLadingPrintResource extends AbstractWmsResource {

	// ===== 定数定義 =====

	private static String REPORT_CD = "BillOfLading";

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
		 * オーダーBill of Lading発行データ取得異常
		 */
		protected static final int ORDER_PICKING_DATA_SELECT_FAILED = 2;
		/**
		 * トータルBill of Lading発行データ取得異常
		 */
		protected static final int TOTAL_PICKING_DATA_SELECT_FAILED = 3;
		/**
		 * 摘み取りBill of Lading発行データ取得異常
		 */
		protected static final int PL_PICKING_DATA_SELECT_FAILED = 4;
		/**
		 * 種蒔きBill of Lading発行データ取得異常
		 */
		protected static final int SL_PICKING_DATA_SELECT_FAILED = 5;
		/**
		 * 出庫帳票更新異常
		 */
		protected static final int T_PICKING_R_UPDATE_FAILED = 6;
		/**
		 * 一覧データ取得異常
		 */
		protected static final int PICKING_DATA_SELECT_FAILED = 7;
		/**
		 * 該当データ無し
		 */
		protected static final int NOT_FOUND_DATA = 8;
		// [エンハンス PH2.0] ケースBill of Ladingを追加 2015.12.04 sja Start
		/**
		 * ケースBill of Lading発行データ取得異常
		 */
		protected static final int CASE_PICKING_DATA_SELECT_FAILED = 9;
		// [エンハンス PH2.0] ケースBill of Ladingを追加 2015.12.04 sja End
		// [エンハンス PH2.0] マルチBill of Ladingを追加 2015.12.28 sja Start
		/**
		 * マルチBill of Lading発行データ取得異常
		 */
		protected static final int MULTI_PICKING_DATA_SELECT_FAILED = 10;
		// [エンハンス PH2.0] マルチBill of Ladingを追加 2015.12.28 sja End
		// [1.1.4-CT-069] ケースBill of Ladingを出力した時にケース分は検品済にする 2016.06.02 kawana Start
		/**
		 * ケースBill of Lading発行後検品済ステータス更新異常
		 */
		protected static final int CASE_PICKING_UPDATE_STATUS_FAILED = 11;
		// [1.1.4-CT-069] ケースBill of Ladingを出力した時にケース分は検品済にする 2016.06.02 kawana End

		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/04  Start
		/**
		 * 送り状・荷札発行データ取得異常
		 */
		protected static final int TAG_PICKING_DATA_SELECT_FAILED = 12;
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/04  End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private BillOfLadingPrintSelectLogic selectLogic;
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
	@Inject
	private BillOfLadingPrintLogic billOfLadingPrintLogic;
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// ===== 使用テーブル =====

	/**
	 * レコードの最大数
	 */
	private static final int recordMaxNUM = 5;

	/**
	 * <h2>初期処理(通常)。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return BillOfLadingPrintDto Bill of Lading発行画面用DTO
	 */
	@GET
	@Path("/initNormal")
	public BillOfLadingPrintDto initNormal() {

		// 画面用DTO作成
		BillOfLadingPrintDto billOfLadingPrintDto = new BillOfLadingPrintDto();

		return billOfLadingPrintDto;
	}

	/**
	 * <h2>レポートIDを取得。</h2>
	 * <pre>
	 * ・レポートIDの取得
	 * ・レポートCDをキーにレポートID取り出し
	 * ・レポートIDを画面用DTOに設定
	 * </pre>
	 * @return reportId レポートID
	 */
	@GET
	@Path("/getReportId")
	public String getReportId() {

		String reportId = ""+reportLogic.getReportId(REPORT_CD);
		return reportId;
	}

	/**
	 * <h2>検索。</h2>
	 * <pre>
	 * ・データベースにBill of Lading発行データを取得する
	 * </pre>
	 * @param billOfLadingPrintDto Bill of Lading発行画面用DTO
	 * @return BillOfLadingPrintDto Bill of Lading発行画面用DTO
	 */
	@GET
	@Path("/search")
	public BillOfLadingPrintDto search(BillOfLadingPrintDto billOfLadingPrintDto) {

		BillOfLadingPrintDto resultBillOfLadingPrintDto = new BillOfLadingPrintDto();

		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH tPickingH = headerMapper.mappingToEntity(billOfLadingPrintDto.data.head);
		// 引当指示ヘッダ
		TAllocInstH tAllocInstH = tPickingH.getTAllocInstH();
		//出庫帳票
		TPickingR tPickingR = tPickingH.getTPickingRAsOne();
		//共通運送業者マスタ
		MCommonCarrier mCommonCarrier = new MCommonCarrier();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(tPickingH.getMCenter().getCenterCd());
		centerCondition = centerLogic.getUkEntityWithDeletedCheck(centerCondition);
		if (centerCondition == null) {
			this.getErrorManager().add(errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();
		tPickingH.setCenterId(centerId);

		// 荷主IDの取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(tPickingH.getMClient().getClientCd());
		clientCondition = clientLogic.getUkEntityWithDeletedCheck(clientCondition);
		if (clientCondition == null) {
			this.getErrorManager().add(errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();
		tPickingH.setClientId(clientId);

		//出庫作業No
		tPickingH.setPickingWorkNo(billOfLadingPrintDto.data.head.getPickingWorkNo());

		//Bill of Lading No
		tPickingH.setBolNo(billOfLadingPrintDto.data.head.getBolNo());

		// 配送コース
		tPickingH.setDeliveryCourseCd(billOfLadingPrintDto.data.head.getDeliveryCourseCd());

		//発行対象のみ表示
		mCommonCarrier.setBolOutputTargetFlg(billOfLadingPrintDto.data.head.getBolOutputTargetFlg());

		//運送業者
		mCommonCarrier.setCarrierCd(billOfLadingPrintDto.data.head.getCarrierCd());

		//納品先CD
		tAllocInstH.setSupplyCustomerCd(billOfLadingPrintDto.data.head.getTAllocInstH().getSupplyCustomerCd());

		//出荷日（From)
		tAllocInstH.setShippingDtFrom(billOfLadingPrintDto.data.head.getTAllocInstH().getShippingDtFrom());

		//出荷日（To）
		tAllocInstH.setShippingDtTo(billOfLadingPrintDto.data.head.getTAllocInstH().getShippingDtTo());

		//Bill of Lading未発行のみ表示
		tPickingR.setBolOutFlg(billOfLadingPrintDto.data.head.getBolOutFlg());

		// Bill of Lading発行データ取得
		List<SqlBillOfLadingPrintSelect> selectEntity = selectLogic.select(tAllocInstH, tPickingH, tPickingR, mCommonCarrier, billOfLadingPrintDto.paging,
				errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));


		//エラーが存在する場合
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}
		// 区分値マスタより取得
				BClassDtlCB cb = bClassDtlBhv.newConditionBean();
				cb.specify().columnClassDtlCd();
				cb.specify().columnDictId();
				cb.setupSelect_BClass();
				cb.specify().specifyBClass().columnClassCd();
				cb.setupSelect_VDict(getCultureId());
				cb.specify().specifyVDict().columnDictNm();
				List<String> classCdList = new ArrayList<String>();
				classCdList.add("BOL_OUT_FLG");
				cb.query().queryBClass().setClassCd_InScope(classCdList);
				cb.query().queryBClass().addOrderBy_ClassCd_Asc();
				cb.query().addOrderBy_ClassDtlCd_Asc();
				List<BClassDtl> bClassList = bClassDtlBhv.selectList(cb);
				Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

				// センタ区分値をMapに変換
				String classCd = "";
				Map<String, String> dtlMap = null;
				for (BClassDtl bClassDtl : bClassList) {
					if (classCd.equals(bClassDtl.getBClass().getClassCd())) {
						dtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl.getVDict().getDictNm());
					} else {
						if (classCd.length() > 0) {
							bClassMap.put(classCd, dtlMap);
						}
						dtlMap = new HashMap<String, String>();
						dtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl.getVDict().getDictNm());
						classCd = bClassDtl.getBClass().getClassCd();
					}
				}
				if (classCd.length() > 0) {
					bClassMap.put(classCd, dtlMap);
				}

				// 区分値マスタの名称の設定
				for (SqlBillOfLadingPrintSelect sqlBillOfLadingPrintSelect : selectEntity) {

					if (bClassMap.containsKey("BOL_OUT_FLG")) {
						if (bClassMap.get("BOL_OUT_FLG").containsKey(sqlBillOfLadingPrintSelect.getBolOutFlg()) == false) {
							sqlBillOfLadingPrintSelect.setBolOutFlg("0");
							sqlBillOfLadingPrintSelect.setBolOutNm(bClassMap.get("BOL_OUT_FLG").get("0"));
						} else {
							sqlBillOfLadingPrintSelect.setBolOutNm(bClassMap.get("BOL_OUT_FLG").get(sqlBillOfLadingPrintSelect.getBolOutFlg()));
						}
					}
				}
		// Dto変換処理
		SqlBillOfLadingPrintSelectDtoMapper mapper = new SqlBillOfLadingPrintSelectDtoMapper();
		List<SqlBillOfLadingPrintSelectDto> list = mapper.mappingToDtoList(selectEntity);

		//検索結果詰め替え処理
		resultBillOfLadingPrintDto.paging = billOfLadingPrintDto.paging;

		// こちらのサンプルを動かしたい場合はこの部分のコメントを外しDto側も修正する事
		resultBillOfLadingPrintDto.data.list = list;

		return resultBillOfLadingPrintDto;
	}

	/**
	 * <h2>発行取消。</h2>
	 * <pre>
	 * ・データベースにBill of Lading発行データを取消する
	 * </pre>
	 * @param pickingHId 出庫ヘッダID
	 */
	@GET
	@Path("/issueCancelUpdate")
	public StatusDto issueCancelUpdate(String[] bolNo) {

		//出庫ヘッダと出庫帳票データを更新する
		billOfLadingPrintLogic.updateCancel(bolNo);
		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return null;
	}

	/**
	 * <h2>Bill of Lading発行。</h2>
	 * <pre>
	 * コントロールNo.を更新してから、出庫帳票データを取得する。
	 * 帳票を発行する。
	 * エラーがない場合は、データベースに出庫帳票データを更新する
	 *
	 * ・Bill of Lading出力フラグ
	 * </pre>
	 * @param billOfLadingPrintParamDto Bill of Lading発行画面用DTO
	 * @return billOfLadingPrintParamDto Bill of Lading発行画面用DTO
	 */

	@GET
	@Path("/print")
	public BillOfLadingPrintParamDto print(final BillOfLadingPrintParamDto billOfLadingPrintParamDto) throws Exception {
		// 発行帳票を指定
		billOfLadingPrintParamDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// ヘッダ部Entity変換
		TPickingHDtoMapper mapper = new TPickingHDtoMapper();
		TPickingH entity = mapper.mappingToEntity(billOfLadingPrintParamDto.data.head);

		// 明細部Entity変換
		SqlBillOfLadingPrintSelectDtoMapper bodyMapper = new SqlBillOfLadingPrintSelectDtoMapper();
		List<SqlBillOfLadingPrintSelect> bodyList = bodyMapper.mappingToEntityList(billOfLadingPrintParamDto.data.list);

		//コントロールNo更新
		TPickingR update = new TPickingR();

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

		List<String> bolNoList = new ArrayList<String>();
		List<String> workNoList = new ArrayList<String>();
		for (SqlBillOfLadingPrintSelect body : bodyList) {
			if (body.getBolNo() != null) {
				bolNoList.add(body.getBolNo());
			}
			workNoList.add(body.getPickingWorkNo());
		}

		//出庫ヘッダ更新
		bolNoList = billOfLadingPrintLogic.updateBolNo(bolNoList, workNoList, bodyList);

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
		billOfLadingPrintLogic.updateControlNo(update, bolNoList, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		//出庫帳票(検索用)
		tPickingR.setControlNo(update.getControlNo());

		//Bill of Ladingデータ取得メソッドを呼出し
		ListResultBean<SqlBillOfLadingPrint> sqlBillOfLadingPrint = billOfLadingPrintLogic.select(tPickingR, errRetSts(StatusCode.NOT_FOUND_DATA));

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 帳票出力データ取得処理
		List<BillOfLadingListDto> dataList = new ArrayList<BillOfLadingListDto>();

		String preBolNo = "";
		int bolNoAdd = 0;
		int productAdd = 0;
		int recordNum = 0;
		for (SqlBillOfLadingPrint head: sqlBillOfLadingPrint) {
			recordNum = recordNum + 1;
			//同じbolNoのレコードのレコード数
			int bolNoCount = getBolNoCount(head.getBolNo(),sqlBillOfLadingPrint);
			//同じbolNoのサブレコードのレコード数
			int productCount = getSubReportList(tPickingR,head.getBolNo()).size();

			if (preBolNo.equals(head.getBolNo()) == false){
				preBolNo = head.getBolNo();
				if (bolNoCount <= recordMaxNUM && productCount <= recordMaxNUM){
					bolNoAdd = recordMaxNUM - bolNoCount;
					productAdd = recordMaxNUM - productCount;
					for (SqlBillOfLadingPrint sqlBillOfLadingPrintDto: sqlBillOfLadingPrint) {
						if (preBolNo.equals(sqlBillOfLadingPrintDto.getBolNo())){
							BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
						    // ヘッダ部

							billOfLadingListDto.cultureId = getCultureId();
						    //帳票CD
							billOfLadingListDto.reportCd = REPORT_CD;

							//出庫ヘッダID
							billOfLadingListDto.pickingHId  = sqlBillOfLadingPrintDto.getPickingHId();

							//Date
							billOfLadingListDto.shippingDt = sqlBillOfLadingPrintDto.getShippingDt();

							// Name
							billOfLadingListDto.clientNm = sqlBillOfLadingPrintDto.getClientNm();

							//ADDRESS
							billOfLadingListDto.address1 = sqlBillOfLadingPrintDto.getAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdFrom = sqlBillOfLadingPrintDto.getZipCdFrom();

							//Bill of Lading Number
							billOfLadingListDto.bolNo = sqlBillOfLadingPrintDto.getBolNo();

							// Name
							billOfLadingListDto.delivCustomerNm = sqlBillOfLadingPrintDto.getDelivCustomerNm();

							//ADDRESS
							billOfLadingListDto.delivAddress1 = sqlBillOfLadingPrintDto.getDelivAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdTo = sqlBillOfLadingPrintDto.getZipCdTo();

							//Carrier Name
							billOfLadingListDto.carrierNm = sqlBillOfLadingPrintDto.getCarrierNm();

							//SCAC Code
							billOfLadingListDto.carrierCd = sqlBillOfLadingPrintDto.getCarrierCd();

							//Pro Number
							billOfLadingListDto.carrierTraceNum = sqlBillOfLadingPrintDto.getCarrierTraceNum();

							//Freight Charge Terms
							billOfLadingListDto.paymentTerm = sqlBillOfLadingPrintDto.getPaymentTerm();

							//Customer Order Number
							billOfLadingListDto.clientShippingNo = sqlBillOfLadingPrintDto.getClientShippingNo();

							//# PKGS
							billOfLadingListDto.pkgs = sqlBillOfLadingPrintDto.getPkgs();

							//Weight
							billOfLadingListDto.weight = sqlBillOfLadingPrintDto.getWeight();

							//Carrier Information
							List<BillOfLadingListSubDto> subReportList= getSubReportList(tPickingR,head.getBolNo());
							BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();

							for (int i = 1; i <= productAdd; i++) {
								billOfLadingListSubDto.cultureId = getCultureId();
								billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
								billOfLadingListSubDto.handlingUnitType = null;
								billOfLadingListSubDto.packageQty = WCC.ZERO;
								billOfLadingListSubDto.handlingUnitType = null;
								billOfLadingListSubDto.weight = WCC.ZERO;
								billOfLadingListSubDto.productAbbr = null;
								billOfLadingListSubDto.nmfcCode = null;
								billOfLadingListSubDto.freightCls = null;
								billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
								billOfLadingListSubDto.qtyCASES = WCC.ZERO;
								billOfLadingListSubDto.weightSum = WCC.ZERO;
								subReportList.add(billOfLadingListSubDto);
							}
							billOfLadingListDto.subReportData = subReportList;

							dataList.add(billOfLadingListDto);
						}
					}
					for (int i=1;i<=bolNoAdd;i++) {
						BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
					    // ヘッダ部

						billOfLadingListDto.cultureId = getCultureId();
					    //帳票CD
						billOfLadingListDto.reportCd = REPORT_CD;

						//出庫ヘッダID
						billOfLadingListDto.pickingHId  = head.getPickingHId();

						//Date
						billOfLadingListDto.shippingDt = head.getShippingDt();

						// Name
						billOfLadingListDto.clientNm = head.getClientNm();

						//ADDRESS
						billOfLadingListDto.address1 = head.getAddress1();

						//City/State/Zip
						billOfLadingListDto.zipCdFrom = head.getZipCdFrom();

						//Bill of Lading Number
						billOfLadingListDto.bolNo = head.getBolNo();

						// Name
						billOfLadingListDto.delivCustomerNm = head.getDelivCustomerNm();

						//ADDRESS
						billOfLadingListDto.delivAddress1 = head.getDelivAddress1();

						//City/State/Zip
						billOfLadingListDto.zipCdTo = head.getZipCdTo();

						//Carrier Name
						billOfLadingListDto.carrierNm = head.getCarrierNm();

						//SCAC Code
						billOfLadingListDto.carrierCd = head.getCarrierCd();

						//Pro Number
						billOfLadingListDto.carrierTraceNum = head.getCarrierTraceNum();

						//Freight Charge Terms
						billOfLadingListDto.paymentTerm = head.getPaymentTerm();

						//Customer Order Number
						billOfLadingListDto.clientShippingNo = null;

						//# PKGS
						billOfLadingListDto.pkgs = 0l;

						//Weight
						billOfLadingListDto.weight = WCC.ZERO;

						List<BillOfLadingListSubDto> subReportList= getSubReportList(tPickingR,head.getBolNo());
						BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();
						for (int j = 1; j <= productAdd; j++) {
							billOfLadingListSubDto.cultureId = getCultureId();
							billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
							billOfLadingListSubDto.handlingUnitType = null;
							billOfLadingListSubDto.packageQty = WCC.ZERO;
							billOfLadingListSubDto.handlingUnitType = null;
							billOfLadingListSubDto.weight = WCC.ZERO;
							billOfLadingListSubDto.productAbbr = null;
							billOfLadingListSubDto.nmfcCode = null;
							billOfLadingListSubDto.freightCls = null;
							billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
							billOfLadingListSubDto.qtyCASES = WCC.ZERO;
							billOfLadingListSubDto.weightSum = WCC.ZERO;
							subReportList.add(billOfLadingListSubDto);
						}
						billOfLadingListDto.subReportData = subReportList;

						dataList.add(billOfLadingListDto);
					}
				} else if (bolNoCount <= recordMaxNUM && productCount > recordMaxNUM){

					bolNoAdd = productCount - bolNoCount + recordMaxNUM - productCount%recordMaxNUM;
					productAdd = recordMaxNUM - productCount%recordMaxNUM;
					if (productCount%recordMaxNUM == 0) {
						productAdd = 0;
					}
					for (SqlBillOfLadingPrint sqlBillOfLadingPrintDto: sqlBillOfLadingPrint) {
						if (preBolNo.equals(sqlBillOfLadingPrintDto.getBolNo())){
							BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
						    // ヘッダ部

							billOfLadingListDto.cultureId = getCultureId();
						    //帳票CD
							billOfLadingListDto.reportCd = REPORT_CD;

							//出庫ヘッダID
							billOfLadingListDto.pickingHId  = sqlBillOfLadingPrintDto.getPickingHId();

							//Date
							billOfLadingListDto.shippingDt = sqlBillOfLadingPrintDto.getShippingDt();

							// Name
							billOfLadingListDto.clientNm = sqlBillOfLadingPrintDto.getClientNm();

							//ADDRESS
							billOfLadingListDto.address1 = sqlBillOfLadingPrintDto.getAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdFrom = sqlBillOfLadingPrintDto.getZipCdFrom();

							//Bill of Lading Number
							billOfLadingListDto.bolNo = sqlBillOfLadingPrintDto.getBolNo();

							// Name
							billOfLadingListDto.delivCustomerNm = sqlBillOfLadingPrintDto.getDelivCustomerNm();

							//ADDRESS
							billOfLadingListDto.delivAddress1 = sqlBillOfLadingPrintDto.getDelivAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdTo = sqlBillOfLadingPrintDto.getZipCdTo();

							//Carrier Name
							billOfLadingListDto.carrierNm = sqlBillOfLadingPrintDto.getCarrierNm();

							//SCAC Code
							billOfLadingListDto.carrierCd = sqlBillOfLadingPrintDto.getCarrierCd();

							//Pro Number
							billOfLadingListDto.carrierTraceNum = sqlBillOfLadingPrintDto.getCarrierTraceNum();

							//Freight Charge Terms
							billOfLadingListDto.paymentTerm = sqlBillOfLadingPrintDto.getPaymentTerm();

							//Customer Order Number
							billOfLadingListDto.clientShippingNo = sqlBillOfLadingPrintDto.getClientShippingNo();

							//# PKGS
							billOfLadingListDto.pkgs = sqlBillOfLadingPrintDto.getPkgs();

							//Weight
							billOfLadingListDto.weight = sqlBillOfLadingPrintDto.getWeight();

							List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
							List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
							int rowNum = 0;
							for (BillOfLadingListSubDto billOfLadingListSubDto : billOfLadingListSubList) {
								rowNum = rowNum + 1;
								if (rowNum <= 5) {
									subReportList.add(billOfLadingListSubDto);
								}
							}
							billOfLadingListDto.subReportData = subReportList;

							dataList.add(billOfLadingListDto);
						}
					}
					for (int i=1;i<=recordMaxNUM - bolNoCount;i++) {
						BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
					    // ヘッダ部

						billOfLadingListDto.cultureId = getCultureId();
					    //帳票CD
						billOfLadingListDto.reportCd = REPORT_CD;

						//出庫ヘッダID
						billOfLadingListDto.pickingHId  = head.getPickingHId();

						//Date
						billOfLadingListDto.shippingDt = head.getShippingDt();

						// Name
						billOfLadingListDto.clientNm = head.getClientNm();

						//ADDRESS
						billOfLadingListDto.address1 = head.getAddress1();

						//City/State/Zip
						billOfLadingListDto.zipCdFrom = head.getZipCdFrom();

						//Bill of Lading Number
						billOfLadingListDto.bolNo = head.getBolNo();

						// Name
						billOfLadingListDto.delivCustomerNm = head.getDelivCustomerNm();

						//ADDRESS
						billOfLadingListDto.delivAddress1 = head.getDelivAddress1();

						//City/State/Zip
						billOfLadingListDto.zipCdTo = head.getZipCdTo();

						//Carrier Name
						billOfLadingListDto.carrierNm = head.getCarrierNm();

						//SCAC Code
						billOfLadingListDto.carrierCd = head.getCarrierCd();

						//Pro Number
						billOfLadingListDto.carrierTraceNum = head.getCarrierTraceNum();

						//Freight Charge Terms
						billOfLadingListDto.paymentTerm = head.getPaymentTerm();

						//Customer Order Number
						billOfLadingListDto.clientShippingNo = null;

						//# PKGS
						billOfLadingListDto.pkgs = 0l;

						//Weight
						billOfLadingListDto.weight = WCC.ZERO;

						List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
						List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
						int rowNum = 0;
						for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList) {
							rowNum = rowNum + 1;
							if (rowNum <= 5) {
								subReportList.add(billOfLadingListSubDto);
							}
						}
						billOfLadingListDto.subReportData = subReportList;

						dataList.add(billOfLadingListDto);
					}

					int pageFlg = 1;
					for (int i=1;i<=productCount - (productCount%recordMaxNUM)-5;i++) {
						pageFlg =(int)Math.ceil((float)i/recordMaxNUM)+1;
						BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
					    // ヘッダ部

						billOfLadingListDto.cultureId = getCultureId();
					    //帳票CD
						billOfLadingListDto.reportCd = REPORT_CD;

						//出庫ヘッダID
						billOfLadingListDto.pickingHId  = head.getPickingHId();

						//Date
						billOfLadingListDto.shippingDt = head.getShippingDt();

						// Name
						billOfLadingListDto.clientNm = head.getClientNm();

						//ADDRESS
						billOfLadingListDto.address1 = head.getAddress1();

						//City/State/Zip
						billOfLadingListDto.zipCdFrom = head.getZipCdFrom();

						//Bill of Lading Number
						billOfLadingListDto.bolNo = head.getBolNo();

						// Name
						billOfLadingListDto.delivCustomerNm = head.getDelivCustomerNm();

						//ADDRESS
						billOfLadingListDto.delivAddress1 = head.getDelivAddress1();

						//City/State/Zip
						billOfLadingListDto.zipCdTo = head.getZipCdTo();

						//Carrier Name
						billOfLadingListDto.carrierNm = head.getCarrierNm();

						//SCAC Code
						billOfLadingListDto.carrierCd = head.getCarrierCd();

						//Pro Number
						billOfLadingListDto.carrierTraceNum = head.getCarrierTraceNum();

						//Freight Charge Terms
						billOfLadingListDto.paymentTerm = head.getPaymentTerm();

						//Customer Order Number
						billOfLadingListDto.clientShippingNo = null;

						//# PKGS
						billOfLadingListDto.pkgs = 0l;

						//Weight
						billOfLadingListDto.weight = WCC.ZERO;

						List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
						List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
						int rowNum = 0;
						for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList) {
							rowNum = rowNum + 1;
							if (rowNum > (pageFlg-1)*5 && rowNum <= pageFlg * 5) {
								subReportList.add(billOfLadingListSubDto);
							}
						}
						billOfLadingListDto.subReportData = subReportList;

						dataList.add(billOfLadingListDto);
					}
					for (int i=1;i<=recordMaxNUM;i++) {
						BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
					    // ヘッダ部

						billOfLadingListDto.cultureId = getCultureId();
					    //帳票CD
						billOfLadingListDto.reportCd = REPORT_CD;

						//出庫ヘッダID
						billOfLadingListDto.pickingHId  = head.getPickingHId();

						//Date
						billOfLadingListDto.shippingDt = head.getShippingDt();

						// Name
						billOfLadingListDto.clientNm = head.getClientNm();

						//ADDRESS
						billOfLadingListDto.address1 = head.getAddress1();

						//City/State/Zip
						billOfLadingListDto.zipCdFrom = head.getZipCdFrom();

						//Bill of Lading Number
						billOfLadingListDto.bolNo = head.getBolNo();

						// Name
						billOfLadingListDto.delivCustomerNm = head.getDelivCustomerNm();

						//ADDRESS
						billOfLadingListDto.delivAddress1 = head.getDelivAddress1();

						//City/State/Zip
						billOfLadingListDto.zipCdTo = head.getZipCdTo();

						//Carrier Name
						billOfLadingListDto.carrierNm = head.getCarrierNm();

						//SCAC Code
						billOfLadingListDto.carrierCd = head.getCarrierCd();

						//Pro Number
						billOfLadingListDto.carrierTraceNum = head.getCarrierTraceNum();

						//Freight Charge Terms
						billOfLadingListDto.paymentTerm = head.getPaymentTerm();

						//Customer Order Number
						billOfLadingListDto.clientShippingNo = null;

						//# PKGS
						billOfLadingListDto.pkgs = 0l;

						//Weight
						billOfLadingListDto.weight = WCC.ZERO;

						List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
						List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
						int rowNum = 0;
						for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList) {
							rowNum = rowNum + 1;
							if (rowNum > (getSubReportList(tPickingR,head.getBolNo()).size()/recordMaxNUM) * recordMaxNUM) {
								subReportList.add(billOfLadingListSubDto);
							}
						}
						BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();

						for (int j = 1; j <= productAdd; j++) {
							billOfLadingListSubDto.cultureId = getCultureId();
							billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
							billOfLadingListSubDto.handlingUnitType = null;
							billOfLadingListSubDto.packageQty = WCC.ZERO;
							billOfLadingListSubDto.handlingUnitType = null;
							billOfLadingListSubDto.weight = WCC.ZERO;
							billOfLadingListSubDto.productAbbr = null;
							billOfLadingListSubDto.nmfcCode = null;
							billOfLadingListSubDto.freightCls = null;
							billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
							billOfLadingListSubDto.qtyCASES = WCC.ZERO;
							billOfLadingListSubDto.weightSum = WCC.ZERO;
							subReportList.add(billOfLadingListSubDto);
						}
						billOfLadingListDto.subReportData = subReportList;

						dataList.add(billOfLadingListDto);
					}
				} else if (bolNoCount > recordMaxNUM && productCount <= recordMaxNUM){

					bolNoAdd = recordMaxNUM - bolNoCount%recordMaxNUM;
					if (bolNoCount%recordMaxNUM == 0) {
						bolNoAdd = 0;
					}
					productAdd = recordMaxNUM - productCount;
					for (SqlBillOfLadingPrint sqlBillOfLadingPrintDto: sqlBillOfLadingPrint) {
						if (preBolNo.equals(sqlBillOfLadingPrintDto.getBolNo())){
							BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
						    // ヘッダ部

							billOfLadingListDto.cultureId = getCultureId();
						    //帳票CD
							billOfLadingListDto.reportCd = REPORT_CD;

							//出庫ヘッダID
							billOfLadingListDto.pickingHId  = sqlBillOfLadingPrintDto.getPickingHId();

							//Date
							billOfLadingListDto.shippingDt = sqlBillOfLadingPrintDto.getShippingDt();

							// Name
							billOfLadingListDto.clientNm = sqlBillOfLadingPrintDto.getClientNm();

							//ADDRESS
							billOfLadingListDto.address1 = sqlBillOfLadingPrintDto.getAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdFrom = sqlBillOfLadingPrintDto.getZipCdFrom();

							//Bill of Lading Number
							billOfLadingListDto.bolNo = sqlBillOfLadingPrintDto.getBolNo();

							// Name
							billOfLadingListDto.delivCustomerNm = sqlBillOfLadingPrintDto.getDelivCustomerNm();

							//ADDRESS
							billOfLadingListDto.delivAddress1 = sqlBillOfLadingPrintDto.getDelivAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdTo = sqlBillOfLadingPrintDto.getZipCdTo();

							//Carrier Name
							billOfLadingListDto.carrierNm = sqlBillOfLadingPrintDto.getCarrierNm();

							//SCAC Code
							billOfLadingListDto.carrierCd = sqlBillOfLadingPrintDto.getCarrierCd();

							//Pro Number
							billOfLadingListDto.carrierTraceNum = sqlBillOfLadingPrintDto.getCarrierTraceNum();

							//Freight Charge Terms
							billOfLadingListDto.paymentTerm = sqlBillOfLadingPrintDto.getPaymentTerm();

							//Customer Order Number
							billOfLadingListDto.clientShippingNo = sqlBillOfLadingPrintDto.getClientShippingNo();

							//# PKGS
							billOfLadingListDto.pkgs = sqlBillOfLadingPrintDto.getPkgs();

							//Weight
							billOfLadingListDto.weight = sqlBillOfLadingPrintDto.getWeight();

							//Carrier Information
							//ListResultBean<SqlBillOfLadingPrintSubReport> sqlBillOfLadingPrintSubReport = billOfLadingPrintLogic.selectSubReportData(tPickingR,head.getBolNo(), errRetSts(StatusCode.NOT_FOUND_DATA));

							//if (getErrorManager().size() > 0) {
							//	// 処理中止
							//	return null;
							//}
							List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
							List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
							for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList ) {

									subReportList.add(billOfLadingListSubDto);
							}

							BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();
							for (int j = 1; j <= productAdd; j++) {
								billOfLadingListSubDto.cultureId = getCultureId();
								billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
								billOfLadingListSubDto.handlingUnitType = null;
								billOfLadingListSubDto.packageQty = WCC.ZERO;
								billOfLadingListSubDto.handlingUnitType = null;
								billOfLadingListSubDto.weight = WCC.ZERO;
								billOfLadingListSubDto.productAbbr = null;
								billOfLadingListSubDto.nmfcCode = null;
								billOfLadingListSubDto.freightCls = null;
								billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
								billOfLadingListSubDto.qtyCASES = WCC.ZERO;
								billOfLadingListSubDto.weightSum = WCC.ZERO;
								subReportList.add(billOfLadingListSubDto);
							}
							billOfLadingListDto.subReportData = subReportList;

							dataList.add(billOfLadingListDto);
						}
					}
					for (int i=1;i<=bolNoAdd;i++) {
						BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
					    // ヘッダ部

						billOfLadingListDto.cultureId = getCultureId();
					    //帳票CD
						billOfLadingListDto.reportCd = REPORT_CD;

						//出庫ヘッダID
						billOfLadingListDto.pickingHId  = head.getPickingHId();

						//Date
						billOfLadingListDto.shippingDt = head.getShippingDt();

						// Name
						billOfLadingListDto.clientNm = head.getClientNm();

						//ADDRESS
						billOfLadingListDto.address1 = head.getAddress1();

						//City/State/Zip
						billOfLadingListDto.zipCdFrom = head.getZipCdFrom();

						//Bill of Lading Number
						billOfLadingListDto.bolNo = head.getBolNo();

						// Name
						billOfLadingListDto.delivCustomerNm = head.getDelivCustomerNm();

						//ADDRESS
						billOfLadingListDto.delivAddress1 = head.getDelivAddress1();

						//City/State/Zip
						billOfLadingListDto.zipCdTo = head.getZipCdTo();

						//Carrier Name
						billOfLadingListDto.carrierNm = head.getCarrierNm();

						//SCAC Code
						billOfLadingListDto.carrierCd = head.getCarrierCd();

						//Pro Number
						billOfLadingListDto.carrierTraceNum = head.getCarrierTraceNum();

						//Freight Charge Terms
						billOfLadingListDto.paymentTerm = head.getPaymentTerm();

						//Customer Order Number
						billOfLadingListDto.clientShippingNo = null;

						//# PKGS
						billOfLadingListDto.pkgs = 0l;

						//Weight
						billOfLadingListDto.weight = WCC.ZERO;

						List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
						List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
						for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList ) {

								subReportList.add(billOfLadingListSubDto);
						}

						BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();
						for (int j = 1; j <= productAdd; j++) {
							billOfLadingListSubDto.cultureId = getCultureId();
							billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
							billOfLadingListSubDto.handlingUnitType = null;
							billOfLadingListSubDto.packageQty = WCC.ZERO;
							billOfLadingListSubDto.handlingUnitType = null;
							billOfLadingListSubDto.weight = WCC.ZERO;
							billOfLadingListSubDto.productAbbr = null;
							billOfLadingListSubDto.nmfcCode = null;
							billOfLadingListSubDto.freightCls = null;
							billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
							billOfLadingListSubDto.qtyCASES = WCC.ZERO;
							billOfLadingListSubDto.weightSum = WCC.ZERO;
							subReportList.add(billOfLadingListSubDto);
						}
						billOfLadingListDto.subReportData = subReportList;

						dataList.add(billOfLadingListDto);
					}

				} else if (bolNoCount > recordMaxNUM && productCount > recordMaxNUM && bolNoCount == productCount){

					bolNoAdd = recordMaxNUM - bolNoCount%recordMaxNUM;
					productAdd = recordMaxNUM - productCount%recordMaxNUM;
					if (bolNoCount%recordMaxNUM == 0) {
						bolNoAdd = 0;
						productAdd = 0;
					}
					int row = 0;
					for (SqlBillOfLadingPrint sqlBillOfLadingPrintDto: sqlBillOfLadingPrint) {
						if (preBolNo.equals(sqlBillOfLadingPrintDto.getBolNo())){
							row = row + 1;
							BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
						    // ヘッダ部

							billOfLadingListDto.cultureId = getCultureId();
						    //帳票CD
							billOfLadingListDto.reportCd = REPORT_CD;

							//出庫ヘッダID
							billOfLadingListDto.pickingHId  = sqlBillOfLadingPrintDto.getPickingHId();

							//Date
							billOfLadingListDto.shippingDt = sqlBillOfLadingPrintDto.getShippingDt();

							// Name
							billOfLadingListDto.clientNm = sqlBillOfLadingPrintDto.getClientNm();

							//ADDRESS
							billOfLadingListDto.address1 = sqlBillOfLadingPrintDto.getAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdFrom = sqlBillOfLadingPrintDto.getZipCdFrom();

							//Bill of Lading Number
							billOfLadingListDto.bolNo = sqlBillOfLadingPrintDto.getBolNo();

							// Name
							billOfLadingListDto.delivCustomerNm = sqlBillOfLadingPrintDto.getDelivCustomerNm();

							//ADDRESS
							billOfLadingListDto.delivAddress1 = sqlBillOfLadingPrintDto.getDelivAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdTo = sqlBillOfLadingPrintDto.getZipCdTo();

							//Carrier Name
							billOfLadingListDto.carrierNm = sqlBillOfLadingPrintDto.getCarrierNm();

							//SCAC Code
							billOfLadingListDto.carrierCd = sqlBillOfLadingPrintDto.getCarrierCd();

							//Pro Number
							billOfLadingListDto.carrierTraceNum = sqlBillOfLadingPrintDto.getCarrierTraceNum();

							//Freight Charge Terms
							billOfLadingListDto.paymentTerm = sqlBillOfLadingPrintDto.getPaymentTerm();

							//Customer Order Number
							billOfLadingListDto.clientShippingNo = sqlBillOfLadingPrintDto.getClientShippingNo();

							//# PKGS
							billOfLadingListDto.pkgs = sqlBillOfLadingPrintDto.getPkgs();

							//Weight
							billOfLadingListDto.weight = sqlBillOfLadingPrintDto.getWeight();

							int rowSub = 0;
							List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
							List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
							for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList ) {
								rowSub = rowSub + 1;
								if (row%recordMaxNUM==0){
									if (rowSub >Math.floor(row/recordMaxNUM-1)*recordMaxNUM && rowSub <=(Math.floor(row/recordMaxNUM-1)+1)*recordMaxNUM) {
										subReportList.add(billOfLadingListSubDto);
									}
								} else {
									if (rowSub >Math.floor(row/recordMaxNUM)*recordMaxNUM && rowSub <=(Math.floor(row/recordMaxNUM)+1)*recordMaxNUM) {
										subReportList.add(billOfLadingListSubDto);
									}
								}
							}

							if (row > (productCount/recordMaxNUM)*5) {
								BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();
								for (int j = 1; j <= productAdd; j++) {
									billOfLadingListSubDto.cultureId = getCultureId();
									billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
									billOfLadingListSubDto.handlingUnitType = null;
									billOfLadingListSubDto.packageQty = WCC.ZERO;
									billOfLadingListSubDto.handlingUnitType = null;
									billOfLadingListSubDto.weight = WCC.ZERO;
									billOfLadingListSubDto.productAbbr = null;
									billOfLadingListSubDto.nmfcCode = null;
									billOfLadingListSubDto.freightCls = null;
									billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
									billOfLadingListSubDto.qtyCASES = WCC.ZERO;
									billOfLadingListSubDto.weightSum = WCC.ZERO;
									subReportList.add(billOfLadingListSubDto);
								}
							}
							billOfLadingListDto.subReportData = subReportList;

							dataList.add(billOfLadingListDto);
						}
					}
					for (int i=1;i<=bolNoAdd;i++) {
						BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
					    // ヘッダ部

						billOfLadingListDto.cultureId = getCultureId();
					    //帳票CD
						billOfLadingListDto.reportCd = REPORT_CD;

						//出庫ヘッダID
						billOfLadingListDto.pickingHId  = head.getPickingHId();

						//Date
						billOfLadingListDto.shippingDt = head.getShippingDt();

						// Name
						billOfLadingListDto.clientNm = head.getClientNm();

						//ADDRESS
						billOfLadingListDto.address1 = head.getAddress1();

						//City/State/Zip
						billOfLadingListDto.zipCdFrom = head.getZipCdFrom();

						//Bill of Lading Number
						billOfLadingListDto.bolNo = head.getBolNo();

						// Name
						billOfLadingListDto.delivCustomerNm = head.getDelivCustomerNm();

						//ADDRESS
						billOfLadingListDto.delivAddress1 = head.getDelivAddress1();

						//City/State/Zip
						billOfLadingListDto.zipCdTo = head.getZipCdTo();

						//Carrier Name
						billOfLadingListDto.carrierNm = head.getCarrierNm();

						//SCAC Code
						billOfLadingListDto.carrierCd = head.getCarrierCd();

						//Pro Number
						billOfLadingListDto.carrierTraceNum = head.getCarrierTraceNum();

						//Freight Charge Terms
						billOfLadingListDto.paymentTerm = head.getPaymentTerm();

						//Customer Order Number
						billOfLadingListDto.clientShippingNo = null;

						//# PKGS
						billOfLadingListDto.pkgs = 0l;

						//Weight
						billOfLadingListDto.weight = WCC.ZERO;

						int rowNo = 0;
						List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
						List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
						for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList ) {
							rowNo = rowNo + 1;
							if (rowNo > (productCount/recordMaxNUM)*5){
								subReportList.add(billOfLadingListSubDto);
							}
						}

						BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();
						for (int j = 1; j <= productAdd; j++) {
							billOfLadingListSubDto.cultureId = getCultureId();
							billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
							billOfLadingListSubDto.handlingUnitType = null;
							billOfLadingListSubDto.packageQty = WCC.ZERO;
							billOfLadingListSubDto.handlingUnitType = null;
							billOfLadingListSubDto.weight = WCC.ZERO;
							billOfLadingListSubDto.productAbbr = null;
							billOfLadingListSubDto.nmfcCode = null;
							billOfLadingListSubDto.freightCls = null;
							billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
							billOfLadingListSubDto.qtyCASES = WCC.ZERO;
							billOfLadingListSubDto.weightSum = WCC.ZERO;
							subReportList.add(billOfLadingListSubDto);
						}
						billOfLadingListDto.subReportData = subReportList;

						dataList.add(billOfLadingListDto);
					}

				} else if (bolNoCount > recordMaxNUM && productCount > recordMaxNUM && bolNoCount > productCount){

					bolNoAdd = recordMaxNUM - bolNoCount%recordMaxNUM;
					if (bolNoCount%recordMaxNUM == 0) {
						bolNoAdd = 0;
					}
					productAdd = bolNoCount - productCount + bolNoAdd;
					int row = 0;
					for (SqlBillOfLadingPrint sqlBillOfLadingPrintDto: sqlBillOfLadingPrint) {
						if (preBolNo.equals(sqlBillOfLadingPrintDto.getBolNo())){
							row = row + 1;
							if (row <= (productCount/recordMaxNUM)*recordMaxNUM) {
								BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
							    // ヘッダ部

								billOfLadingListDto.cultureId = getCultureId();
							    //帳票CD
								billOfLadingListDto.reportCd = REPORT_CD;

								//出庫ヘッダID
								billOfLadingListDto.pickingHId  = sqlBillOfLadingPrintDto.getPickingHId();

								//Date
								billOfLadingListDto.shippingDt = sqlBillOfLadingPrintDto.getShippingDt();

								// Name
								billOfLadingListDto.clientNm = sqlBillOfLadingPrintDto.getClientNm();

								//ADDRESS
								billOfLadingListDto.address1 = sqlBillOfLadingPrintDto.getAddress1();

								//City/State/Zip
								billOfLadingListDto.zipCdFrom = sqlBillOfLadingPrintDto.getZipCdFrom();

								//Bill of Lading Number
								billOfLadingListDto.bolNo = sqlBillOfLadingPrintDto.getBolNo();

								// Name
								billOfLadingListDto.delivCustomerNm = sqlBillOfLadingPrintDto.getDelivCustomerNm();

								//ADDRESS
								billOfLadingListDto.delivAddress1 = sqlBillOfLadingPrintDto.getDelivAddress1();

								//City/State/Zip
								billOfLadingListDto.zipCdTo = sqlBillOfLadingPrintDto.getZipCdTo();

								//Carrier Name
								billOfLadingListDto.carrierNm = sqlBillOfLadingPrintDto.getCarrierNm();

								//SCAC Code
								billOfLadingListDto.carrierCd = sqlBillOfLadingPrintDto.getCarrierCd();

								//Pro Number
								billOfLadingListDto.carrierTraceNum = sqlBillOfLadingPrintDto.getCarrierTraceNum();

								//Freight Charge Terms
								billOfLadingListDto.paymentTerm = sqlBillOfLadingPrintDto.getPaymentTerm();

								//Customer Order Number
								billOfLadingListDto.clientShippingNo = sqlBillOfLadingPrintDto.getClientShippingNo();

								//# PKGS
								billOfLadingListDto.pkgs = sqlBillOfLadingPrintDto.getPkgs();

								//Weight
								billOfLadingListDto.weight = sqlBillOfLadingPrintDto.getWeight();

								int rowSub = 0;
								List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
								List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
								for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList ) {
									rowSub = rowSub + 1;
									if (row == recordMaxNUM ) {
										if (rowSub >0 && rowSub <= recordMaxNUM){
											subReportList.add(billOfLadingListSubDto);
										}
									} else {
										if ((row%recordMaxNUM == 0 && rowSub > (row-(row/recordMaxNUM-1)*recordMaxNUM) && rowSub <= row) || (rowSub >Math.floor(row/recordMaxNUM)*recordMaxNUM && rowSub <=(Math.floor(row/recordMaxNUM)+1)*recordMaxNUM)) {
											subReportList.add(billOfLadingListSubDto);
										}
									}
								}
								billOfLadingListDto.subReportData = subReportList;
								dataList.add(billOfLadingListDto);
							} else if (row > (productCount/recordMaxNUM)*recordMaxNUM && row <= Math.ceil((float)productCount/recordMaxNUM)*recordMaxNUM && bolNoCount/recordMaxNUM > productCount/recordMaxNUM) {

								BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
							    // ヘッダ部

								billOfLadingListDto.cultureId = getCultureId();
							    //帳票CD
								billOfLadingListDto.reportCd = REPORT_CD;

								//出庫ヘッダID
								billOfLadingListDto.pickingHId  = sqlBillOfLadingPrintDto.getPickingHId();

								//Date
								billOfLadingListDto.shippingDt = sqlBillOfLadingPrintDto.getShippingDt();

								// Name
								billOfLadingListDto.clientNm = sqlBillOfLadingPrintDto.getClientNm();

								//ADDRESS
								billOfLadingListDto.address1 = sqlBillOfLadingPrintDto.getAddress1();

								//City/State/Zip
								billOfLadingListDto.zipCdFrom = sqlBillOfLadingPrintDto.getZipCdFrom();

								//Bill of Lading Number
								billOfLadingListDto.bolNo = sqlBillOfLadingPrintDto.getBolNo();

								// Name
								billOfLadingListDto.delivCustomerNm = sqlBillOfLadingPrintDto.getDelivCustomerNm();

								//ADDRESS
								billOfLadingListDto.delivAddress1 = sqlBillOfLadingPrintDto.getDelivAddress1();

								//City/State/Zip
								billOfLadingListDto.zipCdTo = sqlBillOfLadingPrintDto.getZipCdTo();

								//Carrier Name
								billOfLadingListDto.carrierNm = sqlBillOfLadingPrintDto.getCarrierNm();

								//SCAC Code
								billOfLadingListDto.carrierCd = sqlBillOfLadingPrintDto.getCarrierCd();

								//Pro Number
								billOfLadingListDto.carrierTraceNum = sqlBillOfLadingPrintDto.getCarrierTraceNum();

								//Freight Charge Terms
								billOfLadingListDto.paymentTerm = sqlBillOfLadingPrintDto.getPaymentTerm();

								//Customer Order Number
								billOfLadingListDto.clientShippingNo = sqlBillOfLadingPrintDto.getClientShippingNo();

								//# PKGS
								billOfLadingListDto.pkgs = sqlBillOfLadingPrintDto.getPkgs();

								//Weight
								billOfLadingListDto.weight = sqlBillOfLadingPrintDto.getWeight();

								int rowSub = 0;
								List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
								List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
								for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList ) {
									rowSub = rowSub + 1;
									if (rowSub >(productCount/recordMaxNUM)*5) {
										subReportList.add(billOfLadingListSubDto);
									}
								}

								BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();
								for (int j = 1; j <= recordMaxNUM - productCount%recordMaxNUM; j++) {
									billOfLadingListSubDto.cultureId = getCultureId();
									billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
									billOfLadingListSubDto.handlingUnitType = null;
									billOfLadingListSubDto.packageQty = WCC.ZERO;
									billOfLadingListSubDto.handlingUnitType = null;
									billOfLadingListSubDto.weight = WCC.ZERO;
									billOfLadingListSubDto.productAbbr = null;
									billOfLadingListSubDto.nmfcCode = null;
									billOfLadingListSubDto.freightCls = null;
									billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
									billOfLadingListSubDto.qtyCASES = WCC.ZERO;
									billOfLadingListSubDto.weightSum = WCC.ZERO;
									subReportList.add(billOfLadingListSubDto);
								}
								billOfLadingListDto.subReportData = subReportList;
								dataList.add(billOfLadingListDto);
							} else if (row > (productCount/recordMaxNUM)*recordMaxNUM && row <= Math.ceil((float)productCount/recordMaxNUM)*recordMaxNUM && bolNoCount/recordMaxNUM == productCount/recordMaxNUM) {

								BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
							    // ヘッダ部

								billOfLadingListDto.cultureId = getCultureId();
							    //帳票CD
								billOfLadingListDto.reportCd = REPORT_CD;

								//出庫ヘッダID
								billOfLadingListDto.pickingHId  = sqlBillOfLadingPrintDto.getPickingHId();

								//Date
								billOfLadingListDto.shippingDt = sqlBillOfLadingPrintDto.getShippingDt();

								// Name
								billOfLadingListDto.clientNm = sqlBillOfLadingPrintDto.getClientNm();

								//ADDRESS
								billOfLadingListDto.address1 = sqlBillOfLadingPrintDto.getAddress1();

								//City/State/Zip
								billOfLadingListDto.zipCdFrom = sqlBillOfLadingPrintDto.getZipCdFrom();

								//Bill of Lading Number
								billOfLadingListDto.bolNo = sqlBillOfLadingPrintDto.getBolNo();

								// Name
								billOfLadingListDto.delivCustomerNm = sqlBillOfLadingPrintDto.getDelivCustomerNm();

								//ADDRESS
								billOfLadingListDto.delivAddress1 = sqlBillOfLadingPrintDto.getDelivAddress1();

								//City/State/Zip
								billOfLadingListDto.zipCdTo = sqlBillOfLadingPrintDto.getZipCdTo();

								//Carrier Name
								billOfLadingListDto.carrierNm = sqlBillOfLadingPrintDto.getCarrierNm();

								//SCAC Code
								billOfLadingListDto.carrierCd = sqlBillOfLadingPrintDto.getCarrierCd();

								//Pro Number
								billOfLadingListDto.carrierTraceNum = sqlBillOfLadingPrintDto.getCarrierTraceNum();

								//Freight Charge Terms
								billOfLadingListDto.paymentTerm = sqlBillOfLadingPrintDto.getPaymentTerm();

								//Customer Order Number
								billOfLadingListDto.clientShippingNo = sqlBillOfLadingPrintDto.getClientShippingNo();

								//# PKGS
								billOfLadingListDto.pkgs = sqlBillOfLadingPrintDto.getPkgs();

								//Weight
								billOfLadingListDto.weight = sqlBillOfLadingPrintDto.getWeight();

								int rowSub = 0;
								List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
								List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
								for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList) {
									rowSub = rowSub + 1;
									if (rowSub >(productCount/recordMaxNUM)*5) {
										subReportList.add(billOfLadingListSubDto);
									}
								}

								BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();
								for (int j = 1; j <= recordMaxNUM - productCount%recordMaxNUM; j++) {
									billOfLadingListSubDto.cultureId = getCultureId();
									billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
									billOfLadingListSubDto.handlingUnitType = null;
									billOfLadingListSubDto.packageQty = WCC.ZERO;
									billOfLadingListSubDto.handlingUnitType = null;
									billOfLadingListSubDto.weight = WCC.ZERO;
									billOfLadingListSubDto.productAbbr = null;
									billOfLadingListSubDto.nmfcCode = null;
									billOfLadingListSubDto.freightCls = null;
									billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
									billOfLadingListSubDto.qtyCASES = WCC.ZERO;
									billOfLadingListSubDto.weightSum = WCC.ZERO;
									subReportList.add(billOfLadingListSubDto);
								}
								billOfLadingListDto.subReportData = subReportList;
								dataList.add(billOfLadingListDto);
							} else if (row > Math.ceil((float)productCount/recordMaxNUM)*recordMaxNUM) {

								BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
							    // ヘッダ部

								billOfLadingListDto.cultureId = getCultureId();
							    //帳票CD
								billOfLadingListDto.reportCd = REPORT_CD;

								//出庫ヘッダID
								billOfLadingListDto.pickingHId  = sqlBillOfLadingPrintDto.getPickingHId();

								//Date
								billOfLadingListDto.shippingDt = sqlBillOfLadingPrintDto.getShippingDt();

								// Name
								billOfLadingListDto.clientNm = sqlBillOfLadingPrintDto.getClientNm();

								//ADDRESS
								billOfLadingListDto.address1 = sqlBillOfLadingPrintDto.getAddress1();

								//City/State/Zip
								billOfLadingListDto.zipCdFrom = sqlBillOfLadingPrintDto.getZipCdFrom();

								//Bill of Lading Number
								billOfLadingListDto.bolNo = sqlBillOfLadingPrintDto.getBolNo();

								// Name
								billOfLadingListDto.delivCustomerNm = sqlBillOfLadingPrintDto.getDelivCustomerNm();

								//ADDRESS
								billOfLadingListDto.delivAddress1 = sqlBillOfLadingPrintDto.getDelivAddress1();

								//City/State/Zip
								billOfLadingListDto.zipCdTo = sqlBillOfLadingPrintDto.getZipCdTo();

								//Carrier Name
								billOfLadingListDto.carrierNm = sqlBillOfLadingPrintDto.getCarrierNm();

								//SCAC Code
								billOfLadingListDto.carrierCd = sqlBillOfLadingPrintDto.getCarrierCd();

								//Pro Number
								billOfLadingListDto.carrierTraceNum = sqlBillOfLadingPrintDto.getCarrierTraceNum();

								//Freight Charge Terms
								billOfLadingListDto.paymentTerm = sqlBillOfLadingPrintDto.getPaymentTerm();

								//Customer Order Number
								billOfLadingListDto.clientShippingNo = sqlBillOfLadingPrintDto.getClientShippingNo();

								//# PKGS
								billOfLadingListDto.pkgs = sqlBillOfLadingPrintDto.getPkgs();

								//Weight
								billOfLadingListDto.weight = sqlBillOfLadingPrintDto.getWeight();

								List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();

								BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();
								for (int j = 1; j <= recordMaxNUM; j++) {
									billOfLadingListSubDto.cultureId = getCultureId();
									billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
									billOfLadingListSubDto.handlingUnitType = null;
									billOfLadingListSubDto.packageQty = WCC.ZERO;
									billOfLadingListSubDto.handlingUnitType = null;
									billOfLadingListSubDto.weight = WCC.ZERO;
									billOfLadingListSubDto.productAbbr = null;
									billOfLadingListSubDto.nmfcCode = null;
									billOfLadingListSubDto.freightCls = null;
									billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
									billOfLadingListSubDto.qtyCASES = WCC.ZERO;
									billOfLadingListSubDto.weightSum = WCC.ZERO;
									subReportList.add(billOfLadingListSubDto);
								}
								billOfLadingListDto.subReportData = subReportList;
								dataList.add(billOfLadingListDto);
							}
						}
					}
					if (bolNoCount/recordMaxNUM == productCount/recordMaxNUM) {
						for (int i=1;i<=bolNoAdd;i++) {
							BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
						    // ヘッダ部

							billOfLadingListDto.cultureId = getCultureId();
						    //帳票CD
							billOfLadingListDto.reportCd = REPORT_CD;

							//出庫ヘッダID
							billOfLadingListDto.pickingHId  = head.getPickingHId();

							//Date
							billOfLadingListDto.shippingDt = head.getShippingDt();

							// Name
							billOfLadingListDto.clientNm = head.getClientNm();

							//ADDRESS
							billOfLadingListDto.address1 = head.getAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdFrom = head.getZipCdFrom();

							//Bill of Lading Number
							billOfLadingListDto.bolNo = head.getBolNo();

							// Name
							billOfLadingListDto.delivCustomerNm = head.getDelivCustomerNm();

							//ADDRESS
							billOfLadingListDto.delivAddress1 = head.getDelivAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdTo = head.getZipCdTo();

							//Carrier Name
							billOfLadingListDto.carrierNm = head.getCarrierNm();

							//SCAC Code
							billOfLadingListDto.carrierCd = head.getCarrierCd();

							//Pro Number
							billOfLadingListDto.carrierTraceNum = head.getCarrierTraceNum();

							//Freight Charge Terms
							billOfLadingListDto.paymentTerm = head.getPaymentTerm();

							//Customer Order Number
							billOfLadingListDto.clientShippingNo = null;

							//# PKGS
							billOfLadingListDto.pkgs = 0l;

							//Weight
							billOfLadingListDto.weight = WCC.ZERO;

							int rowSub = 0;
							List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
							List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
							for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList) {
								rowSub = rowSub + 1;
								if (rowSub >(productCount/recordMaxNUM)*5) {
									subReportList.add(billOfLadingListSubDto);
								}
							}

							BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();
							for (int j = 1; j <= recordMaxNUM - productCount%recordMaxNUM; j++) {
								billOfLadingListSubDto.cultureId = getCultureId();
								billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
								billOfLadingListSubDto.handlingUnitType = null;
								billOfLadingListSubDto.packageQty = WCC.ZERO;
								billOfLadingListSubDto.handlingUnitType = null;
								billOfLadingListSubDto.weight = WCC.ZERO;
								billOfLadingListSubDto.productAbbr = null;
								billOfLadingListSubDto.nmfcCode = null;
								billOfLadingListSubDto.freightCls = null;
								billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
								billOfLadingListSubDto.qtyCASES = WCC.ZERO;
								billOfLadingListSubDto.weightSum = WCC.ZERO;
								subReportList.add(billOfLadingListSubDto);
							}
							billOfLadingListDto.subReportData = subReportList;
							dataList.add(billOfLadingListDto);
						}
					} else {
						for (int i=1;i<=bolNoAdd;i++) {
							BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
						    // ヘッダ部

							billOfLadingListDto.cultureId = getCultureId();
						    //帳票CD
							billOfLadingListDto.reportCd = REPORT_CD;

							//出庫ヘッダID
							billOfLadingListDto.pickingHId  = head.getPickingHId();

							//Date
							billOfLadingListDto.shippingDt = head.getShippingDt();

							// Name
							billOfLadingListDto.clientNm = head.getClientNm();

							//ADDRESS
							billOfLadingListDto.address1 = head.getAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdFrom = head.getZipCdFrom();

							//Bill of Lading Number
							billOfLadingListDto.bolNo = head.getBolNo();

							// Name
							billOfLadingListDto.delivCustomerNm = head.getDelivCustomerNm();

							//ADDRESS
							billOfLadingListDto.delivAddress1 = head.getDelivAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdTo = head.getZipCdTo();

							//Carrier Name
							billOfLadingListDto.carrierNm = head.getCarrierNm();

							//SCAC Code
							billOfLadingListDto.carrierCd = head.getCarrierCd();

							//Pro Number
							billOfLadingListDto.carrierTraceNum = head.getCarrierTraceNum();

							//Freight Charge Terms
							billOfLadingListDto.paymentTerm = head.getPaymentTerm();

							//Customer Order Number
							billOfLadingListDto.clientShippingNo = null;

							//# PKGS
							billOfLadingListDto.pkgs = 0l;

							//Weight
							billOfLadingListDto.weight = WCC.ZERO;

							List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();

							BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();
							for (int j = 1; j <= recordMaxNUM; j++) {
								billOfLadingListSubDto.cultureId = getCultureId();
								billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
								billOfLadingListSubDto.handlingUnitType = null;
								billOfLadingListSubDto.packageQty = WCC.ZERO;
								billOfLadingListSubDto.handlingUnitType = null;
								billOfLadingListSubDto.weight = WCC.ZERO;
								billOfLadingListSubDto.productAbbr = null;
								billOfLadingListSubDto.nmfcCode = null;
								billOfLadingListSubDto.freightCls = null;
								billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
								billOfLadingListSubDto.qtyCASES = WCC.ZERO;
								billOfLadingListSubDto.weightSum = WCC.ZERO;
								subReportList.add(billOfLadingListSubDto);
							}
							billOfLadingListDto.subReportData = subReportList;
							dataList.add(billOfLadingListDto);
						}
					}
				} else if (bolNoCount > recordMaxNUM && productCount > recordMaxNUM && bolNoCount < productCount){

					productAdd = recordMaxNUM - productCount%recordMaxNUM;
					if (productCount%recordMaxNUM == 0) {
						productAdd = 0;
					}
					bolNoAdd = productCount - bolNoCount + productAdd;
					int row = 0;
					for (SqlBillOfLadingPrint sqlBillOfLadingPrintDto: sqlBillOfLadingPrint) {
						if (preBolNo.equals(sqlBillOfLadingPrintDto.getBolNo())){
							row = row + 1;
							if (row <= (bolNoCount/recordMaxNUM)*recordMaxNUM) {
								BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
							    // ヘッダ部

								billOfLadingListDto.cultureId = getCultureId();
							    //帳票CD
								billOfLadingListDto.reportCd = REPORT_CD;

								//出庫ヘッダID
								billOfLadingListDto.pickingHId  = sqlBillOfLadingPrintDto.getPickingHId();

								//Date
								billOfLadingListDto.shippingDt = sqlBillOfLadingPrintDto.getShippingDt();

								// Name
								billOfLadingListDto.clientNm = sqlBillOfLadingPrintDto.getClientNm();

								//ADDRESS
								billOfLadingListDto.address1 = sqlBillOfLadingPrintDto.getAddress1();

								//City/State/Zip
								billOfLadingListDto.zipCdFrom = sqlBillOfLadingPrintDto.getZipCdFrom();

								//Bill of Lading Number
								billOfLadingListDto.bolNo = sqlBillOfLadingPrintDto.getBolNo();

								// Name
								billOfLadingListDto.delivCustomerNm = sqlBillOfLadingPrintDto.getDelivCustomerNm();

								//ADDRESS
								billOfLadingListDto.delivAddress1 = sqlBillOfLadingPrintDto.getDelivAddress1();

								//City/State/Zip
								billOfLadingListDto.zipCdTo = sqlBillOfLadingPrintDto.getZipCdTo();

								//Carrier Name
								billOfLadingListDto.carrierNm = sqlBillOfLadingPrintDto.getCarrierNm();

								//SCAC Code
								billOfLadingListDto.carrierCd = sqlBillOfLadingPrintDto.getCarrierCd();

								//Pro Number
								billOfLadingListDto.carrierTraceNum = sqlBillOfLadingPrintDto.getCarrierTraceNum();

								//Freight Charge Terms
								billOfLadingListDto.paymentTerm = sqlBillOfLadingPrintDto.getPaymentTerm();

								//Customer Order Number
								billOfLadingListDto.clientShippingNo = sqlBillOfLadingPrintDto.getClientShippingNo();

								//# PKGS
								billOfLadingListDto.pkgs = sqlBillOfLadingPrintDto.getPkgs();

								//Weight
								billOfLadingListDto.weight = sqlBillOfLadingPrintDto.getWeight();

								int rowSub = 0;
								List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
								List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
								for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList) {
									rowSub = rowSub + 1;
									//if ((row%recordMaxNUM == 0 && rowSub > (row-(row/recordMaxNUM-1)*recordMaxNUM) && rowSub <= row) || (rowSub >Math.floor(row/recordMaxNUM)*recordMaxNUM && rowSub <=(Math.floor(row/recordMaxNUM)+1)*recordMaxNUM)) {
									//	subReportList.add(billOfLadingListSubDto);
									//}
									if (row == recordMaxNUM ) {
										if (rowSub >0 && rowSub <= recordMaxNUM){
											subReportList.add(billOfLadingListSubDto);
										}
									} else {
										if ((row%recordMaxNUM == 0 && rowSub > (row-(row/recordMaxNUM-1)*recordMaxNUM) && rowSub <= row) || (rowSub >Math.floor(row/recordMaxNUM)*recordMaxNUM && rowSub <=(Math.floor(row/recordMaxNUM)+1)*recordMaxNUM)) {
											subReportList.add(billOfLadingListSubDto);
										}
									}
								}
								billOfLadingListDto.subReportData = subReportList;
								dataList.add(billOfLadingListDto);
							} else if (row > (bolNoCount/recordMaxNUM)*recordMaxNUM && row <= Math.ceil((float)bolNoCount/recordMaxNUM)*recordMaxNUM && bolNoCount/recordMaxNUM < productCount/recordMaxNUM) {

								BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
							    // ヘッダ部

								billOfLadingListDto.cultureId = getCultureId();
							    //帳票CD
								billOfLadingListDto.reportCd = REPORT_CD;

								//出庫ヘッダID
								billOfLadingListDto.pickingHId  = sqlBillOfLadingPrintDto.getPickingHId();

								//Date
								billOfLadingListDto.shippingDt = sqlBillOfLadingPrintDto.getShippingDt();

								// Name
								billOfLadingListDto.clientNm = sqlBillOfLadingPrintDto.getClientNm();

								//ADDRESS
								billOfLadingListDto.address1 = sqlBillOfLadingPrintDto.getAddress1();

								//City/State/Zip
								billOfLadingListDto.zipCdFrom = sqlBillOfLadingPrintDto.getZipCdFrom();

								//Bill of Lading Number
								billOfLadingListDto.bolNo = sqlBillOfLadingPrintDto.getBolNo();

								// Name
								billOfLadingListDto.delivCustomerNm = sqlBillOfLadingPrintDto.getDelivCustomerNm();

								//ADDRESS
								billOfLadingListDto.delivAddress1 = sqlBillOfLadingPrintDto.getDelivAddress1();

								//City/State/Zip
								billOfLadingListDto.zipCdTo = sqlBillOfLadingPrintDto.getZipCdTo();

								//Carrier Name
								billOfLadingListDto.carrierNm = sqlBillOfLadingPrintDto.getCarrierNm();

								//SCAC Code
								billOfLadingListDto.carrierCd = sqlBillOfLadingPrintDto.getCarrierCd();

								//Pro Number
								billOfLadingListDto.carrierTraceNum = sqlBillOfLadingPrintDto.getCarrierTraceNum();

								//Freight Charge Terms
								billOfLadingListDto.paymentTerm = sqlBillOfLadingPrintDto.getPaymentTerm();

								//Customer Order Number
								billOfLadingListDto.clientShippingNo = sqlBillOfLadingPrintDto.getClientShippingNo();

								//# PKGS
								billOfLadingListDto.pkgs = sqlBillOfLadingPrintDto.getPkgs();

								//Weight
								billOfLadingListDto.weight = sqlBillOfLadingPrintDto.getWeight();

								int rowSub = 0;
								List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
								List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
								for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList) {
									rowSub = rowSub + 1;
									if ((row%recordMaxNUM == 0 && rowSub > (row-(row/recordMaxNUM-1)*recordMaxNUM) && rowSub <= row) || (rowSub >Math.floor(row/recordMaxNUM)*recordMaxNUM && rowSub <=(Math.floor(row/recordMaxNUM)+1)*recordMaxNUM)) {
										subReportList.add(billOfLadingListSubDto);
									}
								}
								billOfLadingListDto.subReportData = subReportList;
								dataList.add(billOfLadingListDto);

							} else if (row > (productCount/recordMaxNUM)*recordMaxNUM && row <= Math.ceil((float)productCount/recordMaxNUM)*recordMaxNUM && bolNoCount/recordMaxNUM == productCount/recordMaxNUM) {

								BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
							    // ヘッダ部

								billOfLadingListDto.cultureId = getCultureId();
							    //帳票CD
								billOfLadingListDto.reportCd = REPORT_CD;

								//出庫ヘッダID
								billOfLadingListDto.pickingHId  = sqlBillOfLadingPrintDto.getPickingHId();

								//Date
								billOfLadingListDto.shippingDt = sqlBillOfLadingPrintDto.getShippingDt();

								// Name
								billOfLadingListDto.clientNm = sqlBillOfLadingPrintDto.getClientNm();

								//ADDRESS
								billOfLadingListDto.address1 = sqlBillOfLadingPrintDto.getAddress1();

								//City/State/Zip
								billOfLadingListDto.zipCdFrom = sqlBillOfLadingPrintDto.getZipCdFrom();

								//Bill of Lading Number
								billOfLadingListDto.bolNo = sqlBillOfLadingPrintDto.getBolNo();

								// Name
								billOfLadingListDto.delivCustomerNm = sqlBillOfLadingPrintDto.getDelivCustomerNm();

								//ADDRESS
								billOfLadingListDto.delivAddress1 = sqlBillOfLadingPrintDto.getDelivAddress1();

								//City/State/Zip
								billOfLadingListDto.zipCdTo = sqlBillOfLadingPrintDto.getZipCdTo();

								//Carrier Name
								billOfLadingListDto.carrierNm = sqlBillOfLadingPrintDto.getCarrierNm();

								//SCAC Code
								billOfLadingListDto.carrierCd = sqlBillOfLadingPrintDto.getCarrierCd();

								//Pro Number
								billOfLadingListDto.carrierTraceNum = sqlBillOfLadingPrintDto.getCarrierTraceNum();

								//Freight Charge Terms
								billOfLadingListDto.paymentTerm = sqlBillOfLadingPrintDto.getPaymentTerm();

								//Customer Order Number
								billOfLadingListDto.clientShippingNo = sqlBillOfLadingPrintDto.getClientShippingNo();

								//# PKGS
								billOfLadingListDto.pkgs = sqlBillOfLadingPrintDto.getPkgs();

								//Weight
								billOfLadingListDto.weight = sqlBillOfLadingPrintDto.getWeight();

								int rowSub = 0;
								List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
								List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
								for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList) {
									rowSub = rowSub + 1;
									if (rowSub >(bolNoCount/recordMaxNUM)*5) {
										subReportList.add(billOfLadingListSubDto);
									}
								}

								BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();
								for (int j = 1; j <= recordMaxNUM - productCount%recordMaxNUM; j++) {
									billOfLadingListSubDto.cultureId = getCultureId();
									billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
									billOfLadingListSubDto.handlingUnitType = null;
									billOfLadingListSubDto.packageQty = WCC.ZERO;
									billOfLadingListSubDto.handlingUnitType = null;
									billOfLadingListSubDto.weight = WCC.ZERO;
									billOfLadingListSubDto.productAbbr = null;
									billOfLadingListSubDto.nmfcCode = null;
									billOfLadingListSubDto.freightCls = null;
									billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
									billOfLadingListSubDto.qtyCASES = WCC.ZERO;
									billOfLadingListSubDto.weightSum = WCC.ZERO;
									subReportList.add(billOfLadingListSubDto);
								}
								billOfLadingListDto.subReportData = subReportList;
								dataList.add(billOfLadingListDto);
							}
						}
					}
					if (bolNoCount/recordMaxNUM == productCount/recordMaxNUM) {
						for (int i=1;i<=(recordMaxNUM - bolNoCount%recordMaxNUM);i++) {
							BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
						    // ヘッダ部

							billOfLadingListDto.cultureId = getCultureId();
						    //帳票CD
							billOfLadingListDto.reportCd = REPORT_CD;

							//出庫ヘッダID
							billOfLadingListDto.pickingHId  = head.getPickingHId();

							//Date
							billOfLadingListDto.shippingDt = head.getShippingDt();

							// Name
							billOfLadingListDto.clientNm = head.getClientNm();

							//ADDRESS
							billOfLadingListDto.address1 = head.getAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdFrom = head.getZipCdFrom();

							//Bill of Lading Number
							billOfLadingListDto.bolNo = head.getBolNo();

							// Name
							billOfLadingListDto.delivCustomerNm = head.getDelivCustomerNm();

							//ADDRESS
							billOfLadingListDto.delivAddress1 = head.getDelivAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdTo = head.getZipCdTo();

							//Carrier Name
							billOfLadingListDto.carrierNm = head.getCarrierNm();

							//SCAC Code
							billOfLadingListDto.carrierCd = head.getCarrierCd();

							//Pro Number
							billOfLadingListDto.carrierTraceNum = head.getCarrierTraceNum();

							//Freight Charge Terms
							billOfLadingListDto.paymentTerm = head.getPaymentTerm();

							//Customer Order Number
							billOfLadingListDto.clientShippingNo = null;

							//# PKGS
							billOfLadingListDto.pkgs = 0l;

							//Weight
							billOfLadingListDto.weight = WCC.ZERO;

							int rowSub = 0;
							List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
							List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
							for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList) {
								rowSub = rowSub + 1;
								if (rowSub >(bolNoCount/recordMaxNUM)*recordMaxNUM) {
									subReportList.add(billOfLadingListSubDto);
								}
							}

							BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();
							for (int j = 1; j <= recordMaxNUM - productCount%recordMaxNUM; j++) {
								billOfLadingListSubDto.cultureId = getCultureId();
								billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
								billOfLadingListSubDto.handlingUnitType = null;
								billOfLadingListSubDto.packageQty = WCC.ZERO;
								billOfLadingListSubDto.handlingUnitType = null;
								billOfLadingListSubDto.weight = WCC.ZERO;
								billOfLadingListSubDto.productAbbr = null;
								billOfLadingListSubDto.nmfcCode = null;
								billOfLadingListSubDto.freightCls = null;
								billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
								billOfLadingListSubDto.qtyCASES = WCC.ZERO;
								billOfLadingListSubDto.weightSum = WCC.ZERO;
								subReportList.add(billOfLadingListSubDto);
							}
							billOfLadingListDto.subReportData = subReportList;
							dataList.add(billOfLadingListDto);
						}
					} else {
						for (int i=1;i<=(recordMaxNUM - bolNoCount%recordMaxNUM);i++) {
							BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
						    // ヘッダ部

							billOfLadingListDto.cultureId = getCultureId();
						    //帳票CD
							billOfLadingListDto.reportCd = REPORT_CD;

							//出庫ヘッダID
							billOfLadingListDto.pickingHId  = head.getPickingHId();

							//Date
							billOfLadingListDto.shippingDt = head.getShippingDt();

							// Name
							billOfLadingListDto.clientNm = head.getClientNm();

							//ADDRESS
							billOfLadingListDto.address1 = head.getAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdFrom = head.getZipCdFrom();

							//Bill of Lading Number
							billOfLadingListDto.bolNo = head.getBolNo();

							// Name
							billOfLadingListDto.delivCustomerNm = head.getDelivCustomerNm();

							//ADDRESS
							billOfLadingListDto.delivAddress1 = head.getDelivAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdTo = head.getZipCdTo();

							//Carrier Name
							billOfLadingListDto.carrierNm = head.getCarrierNm();

							//SCAC Code
							billOfLadingListDto.carrierCd = head.getCarrierCd();

							//Pro Number
							billOfLadingListDto.carrierTraceNum = head.getCarrierTraceNum();

							//Freight Charge Terms
							billOfLadingListDto.paymentTerm = head.getPaymentTerm();

							//Customer Order Number
							billOfLadingListDto.clientShippingNo = null;

							//# PKGS
							billOfLadingListDto.pkgs = 0l;

							//Weight
							billOfLadingListDto.weight = WCC.ZERO;

							int rowSub = 0;
							List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
							List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
							for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList) {
								rowSub = rowSub + 1;
								if (rowSub >(bolNoCount/recordMaxNUM)*recordMaxNUM && rowSub <=Math.ceil((float)bolNoCount/recordMaxNUM)*recordMaxNUM) {
									subReportList.add(billOfLadingListSubDto);
								}
							}
							billOfLadingListDto.subReportData = subReportList;
							dataList.add(billOfLadingListDto);
						}
						for (int i=(int)Math.ceil((float)bolNoCount/recordMaxNUM)*recordMaxNUM+1;i<=((productCount/recordMaxNUM)*recordMaxNUM);i++) {
							BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
						    // ヘッダ部

							billOfLadingListDto.cultureId = getCultureId();
						    //帳票CD
							billOfLadingListDto.reportCd = REPORT_CD;

							//出庫ヘッダID
							billOfLadingListDto.pickingHId  = head.getPickingHId();

							//Date
							billOfLadingListDto.shippingDt = head.getShippingDt();

							// Name
							billOfLadingListDto.clientNm = head.getClientNm();

							//ADDRESS
							billOfLadingListDto.address1 = head.getAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdFrom = head.getZipCdFrom();

							//Bill of Lading Number
							billOfLadingListDto.bolNo = head.getBolNo();

							// Name
							billOfLadingListDto.delivCustomerNm = head.getDelivCustomerNm();

							//ADDRESS
							billOfLadingListDto.delivAddress1 = head.getDelivAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdTo = head.getZipCdTo();

							//Carrier Name
							billOfLadingListDto.carrierNm = head.getCarrierNm();

							//SCAC Code
							billOfLadingListDto.carrierCd = head.getCarrierCd();

							//Pro Number
							billOfLadingListDto.carrierTraceNum = head.getCarrierTraceNum();

							//Freight Charge Terms
							billOfLadingListDto.paymentTerm = head.getPaymentTerm();

							//Customer Order Number
							billOfLadingListDto.clientShippingNo = null;

							//# PKGS
							billOfLadingListDto.pkgs = 0l;

							//Weight
							billOfLadingListDto.weight = WCC.ZERO;

							int rowSub = 0;
							List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
							List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
							for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList) {
								rowSub = rowSub + 1;
								if (rowSub >(i/recordMaxNUM)*recordMaxNUM && rowSub <=Math.ceil((float)i/recordMaxNUM)*recordMaxNUM) {
									subReportList.add(billOfLadingListSubDto);
								}
							}
							billOfLadingListDto.subReportData = subReportList;
							dataList.add(billOfLadingListDto);
						}
						for (int i=(int)(productCount/recordMaxNUM)*recordMaxNUM+1;i<=(Math.ceil((float)productCount/recordMaxNUM)*recordMaxNUM);i++) {
							BillOfLadingListDto billOfLadingListDto = new BillOfLadingListDto();
						    // ヘッダ部

							billOfLadingListDto.cultureId = getCultureId();
						    //帳票CD
							billOfLadingListDto.reportCd = REPORT_CD;

							//出庫ヘッダID
							billOfLadingListDto.pickingHId  = head.getPickingHId();

							//Date
							billOfLadingListDto.shippingDt = head.getShippingDt();

							// Name
							billOfLadingListDto.clientNm = head.getClientNm();

							//ADDRESS
							billOfLadingListDto.address1 = head.getAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdFrom = head.getZipCdFrom();

							//Bill of Lading Number
							billOfLadingListDto.bolNo = head.getBolNo();

							// Name
							billOfLadingListDto.delivCustomerNm = head.getDelivCustomerNm();

							//ADDRESS
							billOfLadingListDto.delivAddress1 = head.getDelivAddress1();

							//City/State/Zip
							billOfLadingListDto.zipCdTo = head.getZipCdTo();

							//Carrier Name
							billOfLadingListDto.carrierNm = head.getCarrierNm();

							//SCAC Code
							billOfLadingListDto.carrierCd = head.getCarrierCd();

							//Pro Number
							billOfLadingListDto.carrierTraceNum = head.getCarrierTraceNum();

							//Freight Charge Terms
							billOfLadingListDto.paymentTerm = head.getPaymentTerm();

							//Customer Order Number
							billOfLadingListDto.clientShippingNo = null;

							//# PKGS
							billOfLadingListDto.pkgs = 0l;

							//Weight
							billOfLadingListDto.weight = WCC.ZERO;

							int rowSub = 0;
							List<BillOfLadingListSubDto> subReportList= new ArrayList<BillOfLadingListSubDto>();
							List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,head.getBolNo());
							for (BillOfLadingListSubDto billOfLadingListSubDto :billOfLadingListSubList) {
								rowSub = rowSub + 1;
								if (rowSub >=i) {
									subReportList.add(billOfLadingListSubDto);
								}
							}

							BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();
							for (int j = 1; j <= recordMaxNUM - productCount%recordMaxNUM; j++) {
								billOfLadingListSubDto.cultureId = getCultureId();
								billOfLadingListSubDto.handlingUnitQty = WCC.ZERO;
								billOfLadingListSubDto.handlingUnitType = null;
								billOfLadingListSubDto.packageQty = WCC.ZERO;
								billOfLadingListSubDto.handlingUnitType = null;
								billOfLadingListSubDto.weight = WCC.ZERO;
								billOfLadingListSubDto.productAbbr = null;
								billOfLadingListSubDto.nmfcCode = null;
								billOfLadingListSubDto.freightCls = null;
								billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
								billOfLadingListSubDto.qtyCASES = WCC.ZERO;
								billOfLadingListSubDto.weightSum = WCC.ZERO;
								subReportList.add(billOfLadingListSubDto);
							}
							billOfLadingListDto.subReportData = subReportList;
							dataList.add(billOfLadingListDto);
						}
					}
				}
			}

		}
		//合計出力設定
		int rowFlg = 0;
		String bol = "";
		BigDecimal preQtyPLTS = WCC.ZERO;
		BigDecimal preQtyCASE = WCC.ZERO;
		BigDecimal preWeight = WCC.ZERO;
		List<BillOfLadingListSubDto> subDtoList = new ArrayList<BillOfLadingListSubDto>();
		for (BillOfLadingListDto dto: dataList) {
			List<BillOfLadingListSubDto> billOfLadingListSubList= getSubReportList(tPickingR,dto.getBolNo());
			BigDecimal qtyPLTS = WCC.ZERO;
			BigDecimal qtyCASE = WCC.ZERO;
			BigDecimal weight = WCC.ZERO;
			int countNum = 0;
			for (BillOfLadingListSubDto subDto: billOfLadingListSubList) {
				qtyPLTS = qtyPLTS.add(subDto.getHandlingUnitQty());
				qtyCASE = qtyCASE.add(subDto.getPackageQty());
				weight = weight.add(subDto.getWeight());
			}
			if (rowFlg != 0 && bol.equals(dto.getBolNo())==false){
				countNum = countNum + 1;
				dataList.get(rowFlg-1).setSumFlg("1");
				List<BillOfLadingListSubDto> billOfLadingListSubDtoList = new ArrayList<BillOfLadingListSubDto>();
				billOfLadingListSubDtoList = subDtoList;
				billOfLadingListSubDtoList.get(4).setQtyPLTS(preQtyPLTS);
				billOfLadingListSubDtoList.get(4).setQtyCASES(preQtyCASE);
				billOfLadingListSubDtoList.get(4).setWeightSum(preWeight);
				dataList.get(rowFlg-1).setSubReportData(billOfLadingListSubDtoList);

			} else {
				if (rowFlg == 0) {
					dataList.get(rowFlg).setSumFlg("0");
				} else {
					dataList.get(rowFlg-1).setSumFlg("0");
				}
			}
			rowFlg = rowFlg + 1;
			bol = dto.getBolNo();
			subDtoList = dto.getSubReportData();
			preQtyPLTS = qtyPLTS;
			preQtyCASE = qtyCASE;
			preWeight = weight;
			if (rowFlg == dataList.size() && countNum == 0) {
				dataList.get(rowFlg-1).setSumFlg("1");
				List<BillOfLadingListSubDto> billOfLadingListSubDtoList = new ArrayList<BillOfLadingListSubDto>();
				billOfLadingListSubDtoList = dto.getSubReportData();
				billOfLadingListSubDtoList.get(4).setQtyPLTS(qtyPLTS);
				billOfLadingListSubDtoList.get(4).setQtyCASES(qtyCASE);
				billOfLadingListSubDtoList.get(4).setWeightSum(weight);
				dataList.get(rowFlg-1).setSubReportData(billOfLadingListSubDtoList);
			}
		}
		//帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		//Bill Of Lading帳票を発行する
		billOfLadingPrintParamDto.printBasicData.outputData = json.format(dataList);
		printLogic.print(billOfLadingPrintParamDto);

		BillOfLadingPrintDto billOfLadingPrintDto = new BillOfLadingPrintDto();
		billOfLadingPrintDto.output = billOfLadingPrintParamDto.output;

		Timestamp time = new Timestamp(System.currentTimeMillis());

		//出庫帳票更新
		update.setControlNo(null);

		update.setBolOutFlg_$1();

		update.setBolOutUserId(this.getUserId());

		update.setBolOutDt(time);

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		billOfLadingPrintLogic.updatePrOutFlg(update, tPickingR, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return billOfLadingPrintParamDto;
	}

	/*同じbolNoのレコードのレコード数*/
	public int getBolNoCount(String bolNo, ListResultBean<SqlBillOfLadingPrint> sqlBillOfLadingPrint){
		int bolCount = 0;
		for (SqlBillOfLadingPrint head: sqlBillOfLadingPrint) {

			if (bolNo.equals(head.getBolNo())){
				bolCount = bolCount + 1;
			}
		}

		return bolCount;
	}
	public List<BillOfLadingListSubDto> getSubReportList(TPickingR tPickingR, String bolNo){

		List<BillOfLadingListSubDto> billOfLadingListSubList = new ArrayList<BillOfLadingListSubDto>();
		//Carrier Informationデータ取得
		ListResultBean<SqlBillOfLadingPrintSubReport> sqlBillOfLadingPrintSubReport = billOfLadingPrintLogic.selectSubReportData(tPickingR,bolNo, errRetSts(StatusCode.NOT_FOUND_DATA));
		for (SqlBillOfLadingPrintSubReport subReportDto : sqlBillOfLadingPrintSubReport){
			BillOfLadingListSubDto billOfLadingListSubDto = new BillOfLadingListSubDto();

			billOfLadingListSubDto.cultureId = getCultureId();
			billOfLadingListSubDto.handlingUnitQty=WCC.ZERO;
			billOfLadingListSubDto.handlingUnitType=null;
			billOfLadingListSubDto.packageQty=new BigDecimal(subReportDto.getInstNum2());
			billOfLadingListSubDto.packageType=subReportDto.getType();
			billOfLadingListSubDto.weight=subReportDto.getWeight();
			billOfLadingListSubDto.productAbbr=subReportDto.getProductAbbr();
			billOfLadingListSubDto.nmfcCode=subReportDto.getNmfcCode();
			billOfLadingListSubDto.freightCls=subReportDto.getFreightCls();
			billOfLadingListSubDto.qtyPLTS = WCC.ZERO;
			billOfLadingListSubDto.qtyCASES = WCC.ZERO;
			billOfLadingListSubDto.weightSum = WCC.ZERO;
			billOfLadingListSubList.add(billOfLadingListSubDto);
		}

		return billOfLadingListSubList;
	}
}
