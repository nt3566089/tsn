package com.oneslogi.wms.resources.stock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.TTrinvcheckinfoDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TTrinvcheckinfo;
import com.oneslogi.base.dbflute.exentity.TTrstockdiffhistory;
import com.oneslogi.base.dbflute.exentity.customize.SqlGetInvDate;
import com.oneslogi.base.dbflute.exentity.customize.SqlGetTotalNumOfMonthAccounts;
import com.oneslogi.base.dbflute.exentity.customize.SqlNoGoodItemDiffReportList;
import com.oneslogi.base.dbflute.exentity.customize.SqlNoGoodItemDiffReportListCount;
import com.oneslogi.base.dbflute.exentity.customize.SqlNotGoodItemReportList;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.ExcessOrDeficiencyReportListDomesticDto;
import com.oneslogi.wms.dto.report.ExcessOrDeficiencyReportListImportDto;
import com.oneslogi.wms.dto.stock.InventoryReportPrintDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.stock.NoGoodItemDiffReportListSelectLogic;
import com.oneslogi.wms.logic.stock.NoGoodItemDiffReportListUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

import net.arnx.jsonic.JSON;

@Path("/stock/noGoodItemDiffReportList")
public class NoGoodItemDiffReportListResource extends AbstractWmsResource {
	
	/**
	 * 発行処理CD
	 */
	private static final String REPORT_CD = "ExcessOrDeficiencyReportListDomestic";
	
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
		 * データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		
		/**
		 * 在庫照合指示データ登録異常
		 */
		protected static final int STOCK_INST_AJUST_REGISTER_ERROR = 3;
		
		/**
		 * 統合在庫実績ワーク登録異常
		 */
		protected static final int T_TRHANBAIINV_REGISTER_ERROR = 4;

	}
	
	@Inject
	private NoGoodItemDiffReportListSelectLogic noGoodItemDiffReportListSelectLogic;
	
	@Inject
	private NoGoodItemDiffReportListUpdateLogic noGoodItemDiffReportListUpdateLogic;

	@Inject
	private ReportLogic reportLogic;
	
	@Inject
	private CenterLogic centerLogic;
	
	@Inject
	private ClientLogic clientLogic;
	
	@Inject
	private PrintLogic printLogic;
	
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	
	// ===== 定数定義 =====
	public static final String INOUT_KBN_A000 = "A000";
	
	public static final String INOUT_KBN_0001 = "0001";

	/**
	 * <h2>不適品過不足報告書</h2>
	 * <pre>
	 * コントロールNo.を更新してから、梱包帳票データを取得する
	 * 帳票を発行する
	 * </pre>
	 * @param  dto 在庫調査関連リスト出力用DTO
	 * @return InventoryReportPrintDto 処理結果DTO
	 * @throws Exception
	 */
	@GET
	@Path("/print")
	public InventoryReportPrintDto print(InventoryReportPrintDto dto) throws Exception {
		// 発行帳票を指定
		// TODO 輸入の内外区分に応じて対応するreportIdを取得し、暫定国産
		dto.printBasicData.reportId  = reportLogic.getReportId(REPORT_CD);
		
		//(I) 採番マスタからコントロールNo.を取得する。
		Long controlNo = numberingCenterLogic.getControlNo();
		
		//(II)ENTITY変換
		//(i) リクエスト.在庫調査関連リスト出力用DTOを在庫調査関連リストENTITYに変換する。
		TTrinvcheckinfoDtoMapper tTrinvcheckinfoDtoMapper = new TTrinvcheckinfoDtoMapper();
		TTrinvcheckinfo  tTrinvcheckinfo = tTrinvcheckinfoDtoMapper.mappingToEntity(dto.data.searchCondition);
		
		//(III) 拠点ID取得
		//(i) 検索.拠点から拠点マスタを単一検索、拠点IDを取得する。
		String centerCd = tTrinvcheckinfo.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		//拠点IDセット
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		//(ii) エラーが発生した場合、エラーメッセージを出力し、処理を中断する。
		if (mCenter == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}
		tTrinvcheckinfo.setCenterId(mCenter.getCenterId());
		
		//(IV) 荷主ID取得
		//(IV) (i) 検索.荷主から荷主マスタを単一検索、荷主IDを取得する。
		String clientCd = tTrinvcheckinfo.getMClient().getClientCd();
		MClient mClient = new MClient();
		//荷主IDセット
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		//(IV) (ii) エラーが発生した場合、エラーメッセージを出力し、処理を中断する。
		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}
		tTrinvcheckinfo.setClientId(mClient.getClientId());
		
		//(V) たな卸実施日マスタ取得
		//(V)(i) たな卸実施日マスタを単一検索、たな卸実施日を取得する。
		SqlGetInvDate dateInvSql = noGoodItemDiffReportListSelectLogic.getInvDate(mCenter,mClient,tTrinvcheckinfo.getExecutedate()); 
		
		String dateInv = null;
		if (dateInvSql != null) {
			dateInv = dateInvSql.getInvDate();
		}
		//(VI) 区分値マスタ取得
		//(VI)(i) 区分値マスタを単一検索、決算たな卸月件数を取得する。
		SqlGetTotalNumOfMonthAccounts totalNumOfMonthAccounts =noGoodItemDiffReportListSelectLogic.getTotalNumOfMonthAccounts(tTrinvcheckinfo.getExecutedate());
		
		//変数.たな卸実施日(From)
		String inventoryDateFrom = null;
		//変数.たな卸実施日(To)
		String inventoryDateTo = null;
		
		//(ア)上記で取得した 決算たな卸月件数 > 0 の場合
		if (totalNumOfMonthAccounts.getSettlementinvmonthNum()>0 &&  dateInv !=null) {
			// 3.1.(2)(C)(a)(V)で取得した たな卸実施日
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date dateInvDate = sdf.parse(dateInv);
			Calendar clInvDate = Calendar.getInstance();
			clInvDate.setTime(dateInvDate);
			
			//在庫調査表情報リストENTITY.在庫実績日
			String executedate = tTrinvcheckinfo.getExecutedate();
			Date dateExecutedate = sdf.parse(executedate);
			Calendar clExecutedate = Calendar.getInstance();
			clExecutedate.setTime(dateExecutedate);
			
			//(ア)(あ) 3.1.(2)(C)(a)(V)で取得した たな卸実施日 < 在庫調査表情報リストENTITY.在庫実績日 の場合
			if (dateInv.compareTo(executedate)<0) {
				//変数.たな卸実施日(From) に 3.1.(2)(C)(a)(V)で取得した 棚卸実施日 + 1日 を設定
				clInvDate.add(Calendar.DATE,1);
				inventoryDateFrom = sdf.format(clInvDate.getTime());
				//変数.たな卸実施日(To) に 在庫調査表情報リストENTITY.在庫実績日 の月末日 を設定
				clExecutedate.set(Calendar.DATE,clExecutedate.getActualMaximum(Calendar.DATE));
				inventoryDateTo = sdf.format(clExecutedate.getTime());
			} else {
				//(ア)(い) 上記以外の場合
				clExecutedate.set(Calendar.DATE,clExecutedate.getActualMinimum(Calendar.DATE));
				inventoryDateFrom = sdf.format(clExecutedate.getTime());
				//変数.たな卸実施日(To) に 3.1.(2)(C)(a)(V)で取得した たな卸実施日 を設定
				inventoryDateTo = dateInv;
			}
		}
		
		//(VII) 在庫過不足履歴のコントロールNo.を設定する。
		//(i) 以下の条件で在庫過不足履歴を一括更新(queryUpdate)する。
		//updateの内容
		TTrstockdiffhistory updatenoGoodItemDiffReportListUpdate = new TTrstockdiffhistory();
		//updateの条件
		TTrstockdiffhistory conditionnoGoodItemDiffReportListUpdate = new TTrstockdiffhistory();
		conditionnoGoodItemDiffReportListUpdate.setCenterId(mCenter.getCenterId());
		conditionnoGoodItemDiffReportListUpdate.setClientId(mClient.getClientId());
		conditionnoGoodItemDiffReportListUpdate.setDiffoccArea(dto.data.searchCondition.diffoccarea);
		conditionnoGoodItemDiffReportListUpdate.setInoutKbn(tTrinvcheckinfo.getInoutkbn());
		
		updatenoGoodItemDiffReportListUpdate.setControlNo(controlNo);
		//(VII) 在庫過不足履歴のコントロールNo.を設定する。
		int updateCount = noGoodItemDiffReportListUpdateLogic.updateControlNo(updatenoGoodItemDiffReportListUpdate,conditionnoGoodItemDiffReportListUpdate,inventoryDateFrom,inventoryDateTo,totalNumOfMonthAccounts,tTrinvcheckinfo);
		
		//変数.印刷対象件数
		int printNum = -1;
		//変数.対象データ無フラグ
		String emptyFlag = null;
		if (updateCount == 0) {
			//(ア) 更新対象件数 == 0 の場合
			//① 変数.印刷対象件数 に 0 を設定する。
			printNum = 0;
			//② 変数.対象データ無フラグ に '1'(印刷対象なし) を設定する。
			emptyFlag = "1";
		} else if (updateCount > 0) {
			//(イ) 更新対象件数 > 0 の場合
			//① 変数.印刷対象件数 に 更新対象件数 を設定する。
			printNum = updateCount;
			//② 変数.対象データ無フラグ に '0'(印刷対象あり) を設定する。
			emptyFlag = "0";
		}
		//(VIII) 印刷対象件数の取得
		//※変数.対象データ無フラグ == '0'(印刷対象あり) の時のみ、以下の処理を行う。
		if ("0".equals(emptyFlag)) {
			//(i) 在庫過不足履歴を検索し、印刷対象件数を取得する。
			SqlNoGoodItemDiffReportListCount noGoodItemDiffReportListCount = noGoodItemDiffReportListSelectLogic.itemDiffReportListCount(controlNo);
			//(ア) 上記で取得した印刷対象件数 == 0 の場合、
			int printCount = noGoodItemDiffReportListCount.getNumofprints();
			
			if (printCount== 0) {
				//① 変数.印刷対象件数 に 0 を設定する。
				printNum = 0;
				//② 変数.対象データ無フラグ に '1'(印刷対象なし) を設定する。
				emptyFlag = "1";
			} else if (printCount > 0) {
				//(イ) 更新対象件数 > 0 の場合、
				//① 変数.印刷対象件数 に 上記で取得した 印刷対象件数 を設定する。
				printNum = printCount;
			}
		}
		
		//不適品過不足報告書アウトプットデータ(国産)
		List<ExcessOrDeficiencyReportListDomesticDto> domesticList = null;
		//不適品過不足報告書(輸入) 
		List<ExcessOrDeficiencyReportListImportDto> importList = null;
		List<SqlNoGoodItemDiffReportList> noGoodItemDiffReportList = null;
		SqlNotGoodItemReportList notGoodItemReportList = null;
		//(IX) 検索実行
		if ("0".equals(emptyFlag)) {
			//(i) 変数.対象データ無フラグ == '0'(印刷対象あり) の場合
			//(ア) コントロールNo.で在庫過不足履歴を検索し、不適品過不足報告書項目を取得する。
			noGoodItemDiffReportList = noGoodItemDiffReportListSelectLogic.noGoodItemDiffReportList(controlNo,tTrinvcheckinfo.getExecutedate(),Long.valueOf(printNum),emptyFlag);
			// 検索.内外区分 == 'A000'(国産) の場合、不適品過不足報告書(国産)
			if (INOUT_KBN_A000.equals(dto.data.searchCondition.getInoutkbn())) {
				domesticList = getPrintDataDomestic(noGoodItemDiffReportList);
			} else {
				//上記以外の場合、不適品過不足報告書(輸入)
				importList = getPrintDataImport(noGoodItemDiffReportList);
			}
		}else if ("1".equals(emptyFlag)) {
			//(ii) 変数.対象データ無フラグ == '1'(印刷対象なし) の場合
			//(ア) 拠点マスタを単一検索し、不適品過不足報告書項目を取得する。
			notGoodItemReportList = noGoodItemDiffReportListSelectLogic.getSqlNotGoodItemReportList(tTrinvcheckinfo,mCenter,emptyFlag,printNum);
			
			if (INOUT_KBN_A000.equals(dto.data.searchCondition.getInoutkbn())) {
				domesticList = getPrintDataCenterDomestic(notGoodItemReportList);
			}else {
				//上記以外の場合、不適品過不足報告書(輸入)
				importList = getPrintDataCenterImport(notGoodItemReportList);
			}
		}
		//(X) 3.1.(2)(C)(a)(IX)で取得した不適品過不足報告書項目を発行用データに変換する。
		JSON json = new JSON();
		json.setSuppressNull(true);
		
		if (INOUT_KBN_A000.equals(dto.data.searchCondition.getInoutkbn())) {
			//帳票発行処理
			dto.printBasicData.outputData = json.format(domesticList);
		} else {
			dto.printBasicData.outputData = json.format(importList);
		}
		
		printLogic.print(dto);
		//(XII) DTO設定 (i) 3.1.(2)(C)(a)(X)で変換した発行用データを  レスポンス.在庫調査関連リスト出力用DTO.不適品過不足報告書アウトプットデータに設定する。
		InventoryReportPrintDto result = new InventoryReportPrintDto();
		result.output = dto.output;
		
		//(XIII) 在庫過不足履歴のコントロールNo.をクリアする。 (i) 以下の条件で在庫過不足履歴を一括更新(queryUpdate)する。
		//updateの内容
		TTrstockdiffhistory condition = new TTrstockdiffhistory();
		condition.setControlNo(null);
		noGoodItemDiffReportListUpdateLogic.updateInventoryByControlNo(condition,controlNo);
		
		//(XIV) 完了メッセージ設定
		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		
		//(XV) 3.1.(2)(C)(a)(XII)にて設定したDTOを返却する。
		return result;
		
		
	}

	/**
	 * <h2>不適品過不足報告書(輸入)発行データ取得。</h2>
	 * <pre>
	 * ・帳票用DTOの作成
	 * ・拠点マスタを単一検索し、不適品過不足報告書(輸入) データを取得する
	 * </pre>
	 * @param SqlNoGoodItemDiffReportList 不適品過不足報告書(輸入)
	 * @return List<ExcessOrDeficiencyReportListImportDto> 不適品過不足報告書(輸入)帳票用DTO
	 * @throws ParseException 日付文字列が"yyyyMMdd"以外の場合の例外
	 */
	private List<ExcessOrDeficiencyReportListImportDto> getPrintDataCenterImport(
			SqlNotGoodItemReportList notGoodItemReportList) {
		ExcessOrDeficiencyReportListImportDto dto = new ExcessOrDeficiencyReportListImportDto();
		List<ExcessOrDeficiencyReportListImportDto> result = new ArrayList<ExcessOrDeficiencyReportListImportDto>();

		dto.setCenterAbbr(notGoodItemReportList.getCenterNm());
		dto.setInvDate(notGoodItemReportList.getInvdate());
		dto.setProductCd(notGoodItemReportList.getProductCd());
		dto.setBrNm(notGoodItemReportList.getProductNm());
		dto.setCggdId(notGoodItemReportList.getCggdidNm());
		if (CU.nullToZero(notGoodItemReportList.getDiffqty()).compareTo(WCC.ZERO) >= 0) {
			dto.setExcesstotalinvQty(CU.nullToZero(notGoodItemReportList.getDiffqty()).longValue());
		}else {
			dto.setStockQty(CU.nullToZero(notGoodItemReportList.getDiffqty()).longValue());
		}
		dto.setInOutKbn(notGoodItemReportList.getInoutkbnNm());
		dto.setDiffOccArea(notGoodItemReportList.getInadequacyarea());
		dto.setCenterCd(notGoodItemReportList.getCenterCd());
		dto.setUserNm(notGoodItemReportList.getUserNm());
		dto.setUserCd(notGoodItemReportList.getUserCd());
		//「たばこ・商品区分」毎の最終レコードにtrueを設定、以外はfalseを設定してください。
		dto.setShowSumItemFlg(false);
		
		//変数.対象データ無フラグ== '1' の場合 true 、以外は false
		if(notGoodItemReportList.getEmtpyflag().equals("1")) {
			dto.setNothingFlg(true);
		}else {
			dto.setNothingFlg(false);
		}
		result.add(dto);
		return null;
	}

	/**
	 * <h2>不適品過不足報告書(輸入)発行データ取得。</h2>
	 * <pre>
	 * ・帳票用DTOの作成
	 * ・不適品過不足報告書(輸入) データを取得する
	 * </pre>
	 * @param List<SqlNoGoodItemDiffReportList> 不適品過不足報告書(輸入)
	 * @return List<ExcessOrDeficiencyReportListImportDto> 不適品過不足報告書(輸入)帳票用DTO
	 * @throws ParseException 日付文字列が"yyyyMMdd"以外の場合の例外
	 */
	private List<ExcessOrDeficiencyReportListImportDto> getPrintDataImport(
		List<SqlNoGoodItemDiffReportList> reportList) {
		List<ExcessOrDeficiencyReportListImportDto> result = new ArrayList<ExcessOrDeficiencyReportListImportDto>();
		for(int i = 0; i < reportList.size() ; i++) {
			SqlNoGoodItemDiffReportList item = reportList.get(i);
			ExcessOrDeficiencyReportListImportDto dto = new ExcessOrDeficiencyReportListImportDto();
			dto.setCenterAbbr(item.getCenterNm());
			dto.setInvDate(item.getInvdate());
			dto.setProductCd(item.getProductCd());
			dto.setBrNm(item.getProductAbbr());
			dto.setCggdId(item.getCggdidNm());
			if (CU.nullToZero(item.getDiffQty1()).compareTo(WCC.ZERO) >= 0) {
				dto.setExcesstotalinvQty(CU.nullToZero(item.getDiffQty1()).longValue());
				dto.setStockQty(0L);
			}else {
				dto.setExcesstotalinvQty(0L);
				dto.setStockQty(CU.nullToZero(item.getDiffQty1()).abs().longValue());
			}
			dto.setInOutKbn(item.getInoutkbnNm());
			dto.setDiffOccArea(item.getDiffoccArea());
			dto.setCenterCd(item.getCenterCd());
			dto.setUserNm(item.getUserNm());
			dto.setUserCd(item.getUserCd());
			//「たばこ・商品区分」毎の最終レコードにtrueを設定、以外はfalseを設定してください。
			if (item.getCggdid() != null && i == reportList.size() - 1) {
				//最終レコードにtrueを設定
				dto.setShowSumItemFlg(true);
			}else if (item.getCggdid() != null && !item.getCggdid().equals(reportList.get(i+1).getCggdid())){
				//リストは「たばこ・商品区分」に従ってソートする必要があるため、現在のレコードと次のエントリが等しくない場合、trueを設定
				dto.setShowSumItemFlg(true);
			}else {
				//以外はfalseを設定
				dto.setShowSumItemFlg(false);
			}
			//変数.対象データ無フラグ== '1' の場合 true 、以外は false
			if(item.getEmtpyflag().equals("1")) {
				dto.setNothingFlg(true);
			}else {
				dto.setNothingFlg(false);
			}
			result.add(dto);
		}	
		return result;
	}

	/**
	 * <h2>不適品過不足報告書(国産)発行データ取得。</h2>
	 * <pre>
	 * ・帳票用DTOの作成
	 * ・拠点マスタを単一検索し、不適品過不足報告書(国産) データを取得する
	 * </pre>
	 * @param SqlNotGoodItemReportList 不適品過不足報告書(国産)
	 * @return List<ExcessOrDeficiencyReportListDomesticDto> 不適品過不足報告書(国産)帳票用DTO
	 * @throws ParseException 日付文字列が"yyyyMMdd"以外の場合の例外
	 */
	private List<ExcessOrDeficiencyReportListDomesticDto> getPrintDataCenterDomestic(
			SqlNotGoodItemReportList notGoodItemReportList) throws ParseException {
		List<ExcessOrDeficiencyReportListDomesticDto> result = new ArrayList<ExcessOrDeficiencyReportListDomesticDto>();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		Calendar  calendar = Calendar.getInstance();
		Date invDate = format.parse(notGoodItemReportList.getInvdate());
		calendar.setTime(invDate);			
		
		ExcessOrDeficiencyReportListDomesticDto excessDto = new  ExcessOrDeficiencyReportListDomesticDto();
		excessDto.setCenterAbbr(notGoodItemReportList.getCenterNm());
		excessDto.setInvDateYear(String.valueOf(calendar.get(Calendar.YEAR)));
		excessDto.setInvDateMonth(String.valueOf(calendar.get(Calendar.MONTH)+1));
		excessDto.setInvDateDay(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
		excessDto.setProductCd(notGoodItemReportList.getProductCd());
		excessDto.setProductNm(notGoodItemReportList.getProductNm());
		excessDto.setCggdId(notGoodItemReportList.getCggdidNm());
		excessDto.setDiffQty(CU.nullToZero(notGoodItemReportList.getDiffqty()).longValue());
		excessDto.setInOutKbn(notGoodItemReportList.getInoutkbnNm());
		excessDto.setCenterCd(notGoodItemReportList.getCenterCd());
		excessDto.setUserNm(notGoodItemReportList.getUserNm());
		excessDto.setUserCd(notGoodItemReportList.getUserCd());
		//「たばこ・商品区分」毎の最終レコードにtrueを設定、以外はfalseを設定してください。
		excessDto.setShowSumItemFlg(false);
		//変数.対象データ無フラグ== '1' の場合 true 、以外は false
		if(notGoodItemReportList.getEmtpyflag().equals("1")) {
			excessDto.setNothingFlg(true);
		}else {
			excessDto.setNothingFlg(false);
		}
		result.add(excessDto);
		return result;
	}

	/**
	 * <h2>不適品過不足報告書(国産)発行データ取得。</h2>
	 * <pre>
	 * ・帳票用DTOの作成
	 * ・不適品過不足報告書(国産) データを取得する
	 * </pre>
	 * @param List<SqlNoGoodItemDiffReportList> 不適品過不足報告書(国産)
	 * @return List<ExcessOrDeficiencyReportListDomesticDto> 不適品過不足報告書(国産)帳票用DTO
	 * @throws ParseException 日付文字列が"yyyyMMdd"以外の場合の例外
	 */
	private List<ExcessOrDeficiencyReportListDomesticDto> getPrintDataDomestic(
			List<SqlNoGoodItemDiffReportList> reportList) throws ParseException {
		List<ExcessOrDeficiencyReportListDomesticDto> result = new ArrayList<ExcessOrDeficiencyReportListDomesticDto>();
		for(int i = 0; i < reportList.size() ; i++) {
			SqlNoGoodItemDiffReportList item = reportList.get(i);
			
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
			Calendar  calendar = Calendar.getInstance();
			Date invDate = format.parse(item.getInvdate());
			calendar.setTime(invDate);			
			
			ExcessOrDeficiencyReportListDomesticDto noGoodItemIn = new ExcessOrDeficiencyReportListDomesticDto();
			noGoodItemIn.setCenterAbbr(item.getCenterNm());
			noGoodItemIn.setInvDateYear(String.valueOf(calendar.get(Calendar.YEAR)));
			noGoodItemIn.setInvDateMonth(String.valueOf(calendar.get(Calendar.MONTH)+1));
			noGoodItemIn.setInvDateDay(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
			noGoodItemIn.setProductCd(item.getProductCd());
			noGoodItemIn.setProductNm(item.getProductAbbr());
			noGoodItemIn.setCggdId(item.getCggdidNm());
			noGoodItemIn.setDiffQty(CU.nullToZero(item.getDiffQty1()).longValue());
			noGoodItemIn.setInOutKbn(item.getInoutkbnNm());
			noGoodItemIn.setDiffOccArea(item.getDiffoccArea());
			noGoodItemIn.setCenterCd(item.getCenterCd());
			noGoodItemIn.setUserNm(item.getUserNm());
			noGoodItemIn.setUserCd(item.getUserCd());
			//「たばこ・商品区分」毎の最終レコードにtrueを設定、以外はfalseを設定してください。
			if (item.getCggdid() != null && i == reportList.size() - 1) {
				//最終レコードにtrueを設定
				noGoodItemIn.setShowSumItemFlg(true);
			}else if (item.getCggdid() != null && !item.getCggdid().equals(reportList.get(i+1).getCggdid())){
				//リストは「たばこ・商品区分」に従ってソートする必要があるため、現在のレコードと次のエントリが等しくない場合、trueを設定
				noGoodItemIn.setShowSumItemFlg(true);
			}else {
				//以外はfalseを設定
				noGoodItemIn.setShowSumItemFlg(false);
			}
			//変数.対象データ無フラグ== '1' の場合 true 、以外は false
			if(item.getEmtpyflag().equals("1")) {
				noGoodItemIn.setNothingFlg(true);
			}else {
				noGoodItemIn.setNothingFlg(false);
			}
			
			result.add(noGoodItemIn);
		}
		return result;
	}
}
