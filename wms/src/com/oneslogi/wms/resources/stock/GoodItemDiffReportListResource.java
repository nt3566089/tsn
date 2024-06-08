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
import com.oneslogi.base.dbflute.exentity.customize.SqlGetFinishInvDate;
import com.oneslogi.base.dbflute.exentity.customize.SqlGetStartInvDate;
import com.oneslogi.base.dbflute.exentity.customize.SqlGoodItemDiffReportList;
import com.oneslogi.base.dbflute.exentity.customize.SqlGoodItemDiffReportListCenter;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.ExcessOrDeficiencyReportListDto;
import com.oneslogi.wms.dto.stock.InventoryReportPrintDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.stock.GoodItemDiffReportListSelectLogic;
import com.oneslogi.wms.logic.stock.GoodItemDiffReportListUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

import net.arnx.jsonic.JSON;


@Path("/stock/goodItemDiffReportList")
public class GoodItemDiffReportListResource extends AbstractWmsResource{
	/**
	 * 発行処理CD
	 */
	private static final String REPORT_CD = "ExcessOrDeficiencyReportList";
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
	private GoodItemDiffReportListSelectLogic goodItemDiffReportListSelectLogic;
	
	@Inject
	private GoodItemDiffReportListUpdateLogic goodItemDiffReportListUpdateLogic;
	
	@Inject
	private CenterLogic centerLogic;
	
	@Inject
	private ClientLogic clientLogic;
	
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	
	@Inject
	private PrintLogic printLogic;
	
	@Inject
	private ReportLogic reportLogic;
	
	/**
	 * <h2>適品過不足報告書</h2>
	 * <pre>
	 * コントロールNo.を更新してから、適品過不足報告書データを取得する
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
		dto.printBasicData.reportId  = reportLogic.getReportId(REPORT_CD);

		// (I) 採番マスタからコントロールNo.を取得する。
		Long controlNo = numberingCenterLogic.getControlNo();
		
		//(II)Entity変換
		TTrinvcheckinfoDtoMapper tTrinvcheckinfoDtoMapper = new TTrinvcheckinfoDtoMapper();
		TTrinvcheckinfo  tTrinvcheckinfo = tTrinvcheckinfoDtoMapper.mappingToEntity(dto.data.searchCondition);

		//(III) 拠点ID取得
		//(i) 検索.拠点から拠点マスタを単一検索、拠点IDを取得する。
		String centerCd = tTrinvcheckinfo.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		//拠点IDセット
		mCenter.setCenterCd(centerCd);

		mCenter = centerLogic.getUkEntity(mCenter);
		//(III) (ii)エラーが発生した場合、エラーメッセージを出力し、処理を中断する。
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
		
		//(V) たな卸実施日マスタ取得(開始日の取得)
		SqlGetStartInvDate startDateSql = goodItemDiffReportListSelectLogic.getStartInvDate(mCenter,mClient,tTrinvcheckinfo);
		String startDate = null;
		if (startDateSql != null) {
			startDate = startDateSql.getRcvFrDate();
		}
		
		//(VI) たな卸実施日マスタ取得(終了日の取得)
		SqlGetFinishInvDate finishDateSql  =	goodItemDiffReportListSelectLogic.getFinishInvDate(mCenter,mClient,tTrinvcheckinfo);
		String finishDate = null;
		if (finishDateSql != null) {
			finishDate = finishDateSql.getRcvToDate();
		}
		
		//(VII) 在庫過不足履歴のコントロールNo.を設定する。(i) 以下の条件で在庫過不足履歴を一括更新(queryUpdate)する。
		TTrstockdiffhistory updateControlNo = new TTrstockdiffhistory();
		TTrstockdiffhistory conditionControlNo = new TTrstockdiffhistory();
		
		updateControlNo.setControlNo(controlNo);
		conditionControlNo.setCenterId(mCenter.getCenterId());
		conditionControlNo.setClientId(mClient.getClientId());
		conditionControlNo.setGoodItemKbn("0");
		conditionControlNo.setDamageRefundKbn("0");
		conditionControlNo.setInoutKbn(tTrinvcheckinfo.getInoutkbn());
		
		int updateCount = goodItemDiffReportListUpdateLogic.updateControlNo(updateControlNo,conditionControlNo,startDate,finishDate);
		
		//(ア) 更新対象件数 == 0 の場合、
		//変数.印刷対象件数
		int printCount = -1;
		//変数.対象データ無フラグ
		String emptyFlag = null;
		if (updateCount == 0 ) {
			//① 変数.印刷対象件数 に 0 を設定する。
			printCount = 0;
			//② 変数.対象データ無フラグ に '1'(印刷対象なし) を設定する。
			emptyFlag="1";
		} else if (updateCount > 0) {
			//(イ) 更新対象件数 > 0 の場合、
			//① 変数.印刷対象件数 に 更新対象件数 を設定する。
			printCount = updateCount;
			//② 変数.対象データ無フラグ に '0'(印刷対象あり) を設定する。
			emptyFlag = "0";
		}
		
		//(VIII) 印刷対象件数の取得
		//※変数.対象データ無フラグ == '0'(印刷対象あり) の時のみ、以下の処理を行う。
		if ("0".equals(emptyFlag)) {
			int reportListCount = goodItemDiffReportListSelectLogic.getReportListCount(controlNo);
			//(ア) 上記で取得した印刷対象件数 == 0 の場合、
			if ( reportListCount ==0) {
				//① 変数.印刷対象件数 に 0 を設定する。
				printCount = 0;
				//② 変数.対象データ無フラグ に '1'(印刷対象なし) を設定する。
				emptyFlag = "1";
			} else if (reportListCount > 0) {
				//(イ) 更新対象件数 > 0 の場合、
				printCount = reportListCount;
			}
		}
		
		// ===== 初期処理 =====
		List<ExcessOrDeficiencyReportListDto> list = null;
		
		//(ア) コントロールNo.で在庫過不足履歴を検索し、適品過不足報告書項目を取得する。
		//(i) 変数.対象データ無フラグ == '0'(印刷対象あり) の場合
		if ("0".equals(emptyFlag)) {
			TTrstockdiffhistory goodItemDiffReportList = new TTrstockdiffhistory();
			goodItemDiffReportList.setControlNo(controlNo);
			List<SqlGoodItemDiffReportList> reportList = goodItemDiffReportListSelectLogic.getGoodItemDiffReportList(goodItemDiffReportList,tTrinvcheckinfo.getExecutedate(),printCount,emptyFlag);
			// 帳票出力データ取得処理
			list = getPrintData(reportList);		
		} else if ("1".equals(emptyFlag)) {
			//(ii) 変数.対象データ無フラグ == '1'(印刷対象なし) の場合
			TTrstockdiffhistory updateGoodItemDiffReportListCenter = new TTrstockdiffhistory();
			updateGoodItemDiffReportListCenter.setCenterId(mClient.getClientId());
			updateGoodItemDiffReportListCenter.setInoutKbn(tTrinvcheckinfo.getInoutkbn());
			SqlGoodItemDiffReportListCenter sqlGoodItemDiffReportListCenter = goodItemDiffReportListSelectLogic.getGoodItemDiffReportListCenter(updateGoodItemDiffReportListCenter,tTrinvcheckinfo.getExecutedate(),printCount,emptyFlag);
			list =  getPrintDataCenter(sqlGoodItemDiffReportListCenter);
		}

		//(X) 3.1.(2)(B)(a)(IX)で取得した適品過不足報告書項目を発行用データに変換する。
		JSON json = new JSON();
		json.setSuppressNull(true);
		
		//(XI) 発行用データを引数として印刷共通機能を呼び出す。
		dto.printBasicData.outputData = json.format(list);
		printLogic.print(dto);
	
		//(XII) DTO設定
		InventoryReportPrintDto result = new InventoryReportPrintDto();
		//レスポンス.在庫調査関連リスト出力用DTO.適品過不足報告書アウトプットデータに設定する。
		result.output = dto.output;
		
		//(XIII) 在庫過不足履歴のコントロールNo.をクリアする。
		//(XIII)(i) 以下の条件で在庫過不足履歴を一括更新(queryUpdate)する。
		TTrstockdiffhistory update = new TTrstockdiffhistory();
		update.setControlNo(null);
		goodItemDiffReportListUpdateLogic.updateInventoryByControlNo(update,controlNo);

		//(XIV) 完了メッセージ設定
		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		//(XV) 3.1.(2)(B)(a)(XII)にて設定したDTOを返却する。
		return result;
	}

	/**
	 * <h2>適品過不足報告書発行データ取得。</h2>
	 * <pre>
	 * ・帳票用DTOの作成
	 * ・適品過不足報告書発行データを取得する
	 * </pre>
	 * @param List<SqlGoodItemDiffReportList> 在庫過不足履歴
	 * @return List<ExcessOrDeficiencyReportListDto> 適品過不足報告書帳票用DTO
	 * @throws ParseException 日付文字列が"yyyyMMdd"以外の場合の例外
	 */
	private List<ExcessOrDeficiencyReportListDto> getPrintData(List<SqlGoodItemDiffReportList> reportList) throws ParseException {
		// ===== 初期処理 =====
		List<ExcessOrDeficiencyReportListDto> result = new ArrayList<ExcessOrDeficiencyReportListDto>();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		Calendar  calendar = Calendar.getInstance();
		for (int i = 0; i < reportList.size() ; i++) {
			SqlGoodItemDiffReportList item = reportList.get(i);
			Date invDate = format.parse(item.getInvdate());
			calendar.setTime(invDate);			
			ExcessOrDeficiencyReportListDto excessDto = new  ExcessOrDeficiencyReportListDto();
			excessDto.setCenterAbbr(item.getCenterAbbr());
			excessDto.setInvDateYear(String.valueOf(calendar.get(Calendar.YEAR)));
			excessDto.setInvDateMonth(String.valueOf(calendar.get(Calendar.MONTH)+1));
			excessDto.setInvDateDay(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
			excessDto.setProductCd(item.getProductCd());
			excessDto.setProductNm(item.getProductAbbr());
			excessDto.setCggdId(item.getCggdidNm());
			excessDto.setDiffQty(CU.nullToZero(item.getDiffQty()).longValue());
			excessDto.setInOutKbn(item.getInoutkbnNm());
			excessDto.setCenterCd(item.getCenterCd());
			excessDto.setUserNm(item.getUserNm());
			excessDto.setUserCd(item.getUserCd());
			//「たばこ・商品区分」毎の最終レコードにtrueを設定、以外はfalseを設定してください。
			if (item.getCggdid() != null && i == reportList.size() - 1) {
				//最終レコードにtrueを設定
				excessDto.setShowSumItemFlg(true);
			}else if (item.getCggdid() != null && !item.getCggdid().equals(reportList.get(i+1).getCggdid())){
				//リストは「たばこ・商品区分」に従ってソートする必要があるため、現在のレコードと次のエントリが等しくない場合、trueを設定
				excessDto.setShowSumItemFlg(true);
			}else {
				//以外はfalseを設定
				excessDto.setShowSumItemFlg(false);
			}
			//変数.対象データ無フラグ== '1' の場合 true 、以外は false
			if(item.getEmtpyflag().equals("1")) {
				excessDto.setNothingFlg(true);
			}else {
				excessDto.setNothingFlg(false);
			}
			result.add(excessDto);
		}
		return result;
	}
	
	/**
	 * <h2>拠点マスタを単一検索し、適品過不足報告書発行データ取得。</h2>
	 * <pre>
	 * ・帳票用DTOの作成
	 * ・ 拠点マスタを単一検索し、適品過不足報告書発行データを取得する
	 * </pre>
	 * @param SqlGoodItemDiffReportListCenter 在庫過不足履歴
	 * @return List<ExcessOrDeficiencyReportListDto> 適品過不足報告書帳票用DTO
	 * @throws ParseException 日付文字列が"yyyyMMdd"以外の場合の例外
	 */
	private List<ExcessOrDeficiencyReportListDto> getPrintDataCenter(SqlGoodItemDiffReportListCenter sqlGoodItemDiffReportListCenter) throws ParseException {
		// ===== 初期処理 =====
		List<ExcessOrDeficiencyReportListDto> result = new ArrayList<ExcessOrDeficiencyReportListDto>();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		Calendar  calendar = Calendar.getInstance();
		Date invDate = format.parse(sqlGoodItemDiffReportListCenter.getInvdate());
		calendar.setTime(invDate);			
		
		ExcessOrDeficiencyReportListDto excessDto = new  ExcessOrDeficiencyReportListDto();
		excessDto.setCenterAbbr(sqlGoodItemDiffReportListCenter.getCenterAbbr());
		excessDto.setInvDateYear(String.valueOf(calendar.get(Calendar.YEAR)));
		excessDto.setInvDateMonth(String.valueOf(calendar.get(Calendar.MONTH)+1));
		excessDto.setInvDateDay(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
		excessDto.setProductCd(sqlGoodItemDiffReportListCenter.getProductCd());
		excessDto.setProductNm(sqlGoodItemDiffReportListCenter.getProductNm());
		excessDto.setCggdId(sqlGoodItemDiffReportListCenter.getCggdidNm());
		excessDto.setDiffQty(CU.nullToZero(sqlGoodItemDiffReportListCenter.getDiffQty()).longValue());
		excessDto.setInOutKbn(sqlGoodItemDiffReportListCenter.getInoutkbnNm());
		excessDto.setCenterCd(sqlGoodItemDiffReportListCenter.getCenterCd());
		excessDto.setUserNm(sqlGoodItemDiffReportListCenter.getUserNm());
		excessDto.setUserCd(sqlGoodItemDiffReportListCenter.getUserCd());
		//「たばこ・商品区分」毎の最終レコードにtrueを設定、以外はfalseを設定してください。
		excessDto.setShowSumItemFlg(false);
		//変数.対象データ無フラグ== '1' の場合 true 、以外は false
		if(sqlGoodItemDiffReportListCenter.getEmtpyflag().equals("1")) {
			excessDto.setNothingFlg(true);
		}else {
			excessDto.setNothingFlg(false);
		}
		result.add(excessDto);
		return result;
	}
}
