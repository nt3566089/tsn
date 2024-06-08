package com.oneslogi.wms.resources.shipping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlChakuchiOtherListPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlChakuchiSapListPmb;
import com.oneslogi.base.dbflute.dto.customize.SqlChakuchiOtherListDto;
import com.oneslogi.base.dbflute.dto.customize.SqlChakuchiSapListDto;
import com.oneslogi.base.dbflute.dto.customize.SqlDispatchRecordInputListDto;
import com.oneslogi.base.dbflute.dtomapper.TCcopamDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlDispatchRecordInputListDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MCorgBhv;
import com.oneslogi.base.dbflute.exbhv.MCrelaybsBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TCcopam;
import com.oneslogi.base.dbflute.exentity.customize.SqlDispatchRecordInputList;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsConst;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.DeliveryListDto;
import com.oneslogi.wms.dto.shipping.DispatchRecordInputDto;
import com.oneslogi.wms.dto.shipping.DispatchRecordInputPrintDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstructionInfoPrintSelectLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstructionInfoPrintUpdateLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstructionInfoSelectLogic;
import com.oneslogi.wms.logic.shipping.SlipNoReceiveListUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

import net.arnx.jsonic.JSON;

/**
 * 配車実績入力(一覧)画面のリソースクラス。
 */
@Path("/shipping/dispatchRecordInput")
public class DispatchRecordInputResource extends AbstractWmsResource {

	private static final String REPORT_CD = "DeliveryList";
	
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
		 * 配車実績入力(一覧)データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 配車実績入力(一覧)データ削除異常
		 */
		protected static final int DELETE_FAILED = 3;
		/**
		 * 配車実績入力(一覧)データ発行異常
		 */
		protected static final int EXECUTE_FAILED = 4;
		
	}
	
	/**
	 * CAPセンターフラグ定義
	 */
	protected static class CapFlg {
		// '1'(CAPセンター)
		protected static final String CAP_FLG_CAP = "1";
		// '0'(CAPセンター以外)
		protected static final String CAP_FLG_OTHER = "0";
	}
	
	/**
	 * 倉庫区分定義
	 */
	protected static class WarehouseCls {
		// '0'(CAP倉庫)
		protected static final String CLS_CAP = "0";
	}
	
	/**
	 * 輸送区分定義
	 */
	protected static class SupplierrCvFlg {
		// '2'(CAP)
		protected static final String FLG_CAP = "2";
		// '1'(中継)
		protected static final String FLG_OTHER= "1";
		// '0'(TD)
		protected static final String FLG_TD= "0";
	}
	
	/**
	 * 帳票名定義
	 */
	protected static class ReportName {
		// 帳票名が[製造たばこ運送依頼書]の場合
		protected static final String RPTNM_CAP1 = "運送人に引渡";
		// 帳票名が[中継保管たばこ運送依頼書]の場合
		protected static final String RPTNM_OTHER1= "輸送ドライバー保管";
		// 帳票名が[製造たばこ送付書]の場合
		protected static final String RPTNM_CAP2= "受入元保管";
		// 帳票名が[中継保管たばこ送付書]の場合
		protected static final String RPTNM_OTHER2 = "中継拠点保管";
		// 帳票名が[製造たばこ輸送依頼書]の場合
		protected static final String RPTNM_CAP3= "発送元保管";
		// 帳票名が[中継保管たばこ輸送依頼書]の場合
		protected static final String RPTNM_OTHER3= "ＴＳＮ保管";
	}
	
	// ===== 使用テーブル =====
	@Inject
	private MCrelaybsBhv mCrelaybsBhv;
	@Inject
	private MCorgBhv mCorgBhv;
	
	// ===== 使用ロジッククラス =====
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private ShippingInstructionInfoPrintUpdateLogic shippingInstructionInfoPrintUpdateLogic;
	@Inject
	private ShippingInstructionInfoSelectLogic shippingInstructionInfoSelectLogic;
	@Inject
	private ShippingInstructionInfoPrintSelectLogic shippingInstructionInfoPrintSelectLogic;
	@Inject
	private SlipNoReceiveListUpdateLogic slipNoReceiveListUpdateLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・配車実績入力(一覧)画面用DTOの作成
	 * </pre>
	 * @return DispatchRecordInputDto 配車実績入力(一覧)画面用DTO
	 */
	@GET
	@Path("/init")
	public DispatchRecordInputDto init() {
		
		DispatchRecordInputDto dispatchRecordInputDto = new DispatchRecordInputDto();

		// 発行帳票を指定
		dispatchRecordInputDto.data.dispatchRecordInputPrintDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);
		
		// 拠点
		String defCenterCd = getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_CD_KEY_NAME);
		
		// 拠点マスタを検索、倉庫区分を取得する
		MCenter mCenterInput = new MCenter();
		mCenterInput.setCenterCd(defCenterCd);
		MCenter mCenter = centerLogic.getUkEntity(mCenterInput);
		// エラーが発生した場合、エラーメッセージを出力し、処理を中断する
		if (mCenter == null) {
			getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}
		
		// 倉庫区分
		String warehouseCls = mCenter.getWarehousecls();
		
		// CAPセンターフラグ(0:CAPセンター以外)
		String capFlg = CapFlg.CAP_FLG_OTHER;
		// 輸送区分(1:中継)
		dispatchRecordInputDto.data.head.setTdrelayid(SupplierrCvFlg.FLG_OTHER);
		
		if (!CU.isNullOrEmpty(warehouseCls) && WarehouseCls.CLS_CAP.equals(warehouseCls)) {
			// 変数.倉庫区分が'0'(CAP倉庫)の場合、CAPセンターフラグ(に1:CAPセンターを設定する
			capFlg = CapFlg.CAP_FLG_CAP;
			// 変数.倉庫区分が'0'(CAP倉庫)の場合、輸送区分(3:CAP)
			dispatchRecordInputDto.data.head.setTdrelayid(SupplierrCvFlg.FLG_CAP);
		}
		dispatchRecordInputDto.data.capFlg = capFlg;
		
		return dispatchRecordInputDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・検索条件で配車実績入力(一覧)データ取り出し
	 * </pre>
	 * @param DdspatchRecordInputDto 配車実績入力(一覧)画面用DTO
	 * @return DispatchRecordInputDto 配車実績入力(一覧)画面用DTO
	 */
	@GET
	@Path("/search")
	public DispatchRecordInputDto search(DispatchRecordInputDto dispatchRecordInputDto)
			throws IOException {
		DispatchRecordInputDto dispatchRecordInputListDto = new DispatchRecordInputDto();

		// Entity変換
		TCcopamDtoMapper tCcopamDtoMapper = new TCcopamDtoMapper();
		TCcopam tCcopam = tCcopamDtoMapper.mappingToEntity(dispatchRecordInputDto.data.head);
		
		// 拠点ID取得
		MCenter mCenterInput = new MCenter();
		mCenterInput.setCenterCd(tCcopam.getMCenter().getCenterCd());
		MCenter mCenter = centerLogic.getUkEntity(mCenterInput);
		// エラーが発生した場合、エラーメッセージを出力し、処理を中断する
		if (mCenter == null) {
			getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}
		tCcopam.setCenterId(mCenter.getCenterId());

		// 荷主ID取得
		MClient mClientInput = new MClient();
		mClientInput.setClientCd(tCcopam.getMClient().getClientCd());
		MClient mClient = clientLogic.getUkEntity(mClientInput);
		// エラーが発生した場合、エラーメッセージを出力し、処理を中断する
		if (mClient == null) {
			getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}
		tCcopam.setClientId(mClient.getClientId());
				
		// 検索
		PagingResultBean<SqlDispatchRecordInputList> page = shippingInstructionInfoSelectLogic.select(tCcopam, 
				dispatchRecordInputDto.data.systemDt, 
				dispatchRecordInputDto.paging, 
				errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// Entity-Dto変換処理
		SqlDispatchRecordInputListDtoMapper sqlDispatchRecordInputListDtoMapper = new SqlDispatchRecordInputListDtoMapper();
		List<SqlDispatchRecordInputListDto> list = sqlDispatchRecordInputListDtoMapper.mappingToDtoList(page);

		// 検索結果詰込処理
		dispatchRecordInputListDto.paging = dispatchRecordInputDto.paging;
		dispatchRecordInputListDto.data.list = list;

		return dispatchRecordInputListDto;
	}

	/**
	 * <h2>配車実績入力(一覧)削除。</h2>
	 * <pre>
	 * 配車実績入力(一覧)削除を行う
	 * エラーがない場合は、データベースに配車実績データを登録または更新し、完了メッセージを設定する
	 * </pre>
	 * @param dispatchRecordInputDto 配車実績入力(一覧)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(DispatchRecordInputDto dispatchRecordInputDto) {
		
		// エンティティ編集
		SqlDispatchRecordInputListDtoMapper mapper = new SqlDispatchRecordInputListDtoMapper();
		List<SqlDispatchRecordInputList> sqlDispatchRecordInputList = mapper.mappingToEntityList(dispatchRecordInputDto.data.list);
		
		// 削除処理実施
		slipNoReceiveListUpdateLogic.delete(sqlDispatchRecordInputList, errRetSts(StatusCode.DELETE_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}
		
		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;
	}
	
	/**
	 * <h2>配車実績入力(一覧)発行。</h2>
	 * <pre>
	 * 配車実績入力(一覧)発行を行う
	 * エラーがない場合は、配車実績入力(一覧)データを発行し、完了メッセージを設定する
	 * </pre>
	 * @param dispatchRecordInputPrintDto 配車実績入力(一覧)画面発行用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/output")
	public DispatchRecordInputPrintDto output(final DispatchRecordInputPrintDto dispatchRecordInputPrintDto) throws Exception {

		// 発行帳票を指定
		dispatchRecordInputPrintDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);
		
		// エンティティ編集
		SqlDispatchRecordInputListDtoMapper mapper = new SqlDispatchRecordInputListDtoMapper();
		List<SqlDispatchRecordInputList> sqlDispatchRecordInputList = mapper.mappingToEntityList(dispatchRecordInputPrintDto.data.list);
		
		// 拠点名称
		String centerNm = "";
		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		long controlNo = numberingLogic.getControlNo();
		
		// ===== 輸送帳票データの取得 =====
		
		// 輸送帳票DTOリスト初期化
		List<DeliveryListDto> dataList = new ArrayList<DeliveryListDto>();
		
		// 配車実績ENTITYリストの件数分、以下の繰り返し処理を行う
		for (SqlDispatchRecordInputList sqlDispatchRecordInput : sqlDispatchRecordInputList) {
			centerNm = sqlDispatchRecordInput.getCenterNm();
			// コントロールNo.の設定
			shippingInstructionInfoPrintUpdateLogic.updateControlNo(sqlDispatchRecordInput.getCcopamId(), 
					controlNo, 
					errRetSts(StatusCode.EXECUTE_FAILED));
			
			// 結果判定
			if (0 < getErrorManager().size()) {

				// 処理中止
				return null;
			}
			
			// 配車実績項目の取得
			DeliveryListDto dto = shippingInstructionInfoPrintSelectLogic.selectPrintData(sqlDispatchRecordInput.getSupplierrCvFlgCd(), 
					dispatchRecordInputPrintDto.data.systemDt,
					controlNo, 
					errRetSts(StatusCode.EXECUTE_FAILED));
			
			// 結果判定
			if (0 < getErrorManager().size()) {

				// 処理中止
				return null;
			}
			
			// コントロールNo.の解放
			shippingInstructionInfoPrintUpdateLogic.releaseControlNo(controlNo, errRetSts(StatusCode.EXECUTE_FAILED));
			
			// 結果判定
			if (0 < getErrorManager().size()) {

				// 処理中止
				return null;
			}
			
			// 変換した発行用データをレスポンス.配車実績入力(一覧)用DTO.依頼書アウトプットデータリストにaddする
			dataList.add(dto);
		}

		// 帳票発行処理
		List<String> listDownloadUrl = new ArrayList<String>();
		String strRptNmOther = "";
		String strRptNmCap = "";
		for (int j = 0; j < 3; j++) {
			if (j == 0) {
				strRptNmOther = ReportName.RPTNM_OTHER1;
				strRptNmCap = ReportName.RPTNM_CAP1;
			} else if (j == 1) {
				strRptNmOther = ReportName.RPTNM_OTHER2;
				strRptNmCap = ReportName.RPTNM_CAP2;
			} else {
				strRptNmOther = ReportName.RPTNM_OTHER3;
				strRptNmCap = ReportName.RPTNM_CAP3;
			}
			
			for (int i = 0; i < dataList.size(); i++) {

				if (SupplierrCvFlg.FLG_OTHER.equals(dataList.get(i).getDeliveryClass())) {
					// 輸送区分が'1'(中継)の場合
					dataList.get(i).setReportName(strRptNmOther);
				} else {
					// 輸送区分が'1'(中継)以外の場合(TD・CAP)
					dataList.get(i).setReportName(strRptNmCap);
				}
				
				// 発送元
				dataList.get(i).setSupplierName(centerNm);
			}
			JSON json = new JSON();
			json.setSuppressNull(true);
			// 輸送帳票を発行する
			dispatchRecordInputPrintDto.printBasicData.outputData = json.format(dataList);
			printLogic.print(dispatchRecordInputPrintDto);

			listDownloadUrl.add(dispatchRecordInputPrintDto.output.downloadUrl);
		}

		// 発行済みの帳票戻る
		DispatchRecordInputPrintDto ret = new DispatchRecordInputPrintDto();
		ret.output = dispatchRecordInputPrintDto.output;
		ret.output.listDownloadUrl.clear();
		ret.output.listDownloadUrl.addAll(listDownloadUrl);

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		
		return ret;
	}
	
	/**
	 * <h2>着地リスト取得。</h2>
	 * <pre>
	 * ・検索条件で着地リストデータ取り出し
	 * </pre>
	 * @param centerId ユーザ情報.拠点ID
	 * @param centerCd ユーザ情報.拠点CD
	 * @param supplierrCvFlg 輸送区分
	 * @param systemDt ユーザ情報.システム管理日付
	 * @return DispatchRecordInputDto 配車実績入力(一覧)画面用DTO
	 */
	@GET
	@Path("/chakuchiList")
	public DispatchRecordInputDto chakuchiList(@QueryParam("centerId") long centerId, 
			@QueryParam("centerCd") String centerCd, 
			@QueryParam("supplierrCvFlg") String supplierrCvFlg, 
			@QueryParam("systemDt") String systemDt) {

		DispatchRecordInputDto dispatchRecordInputDto = new DispatchRecordInputDto();
		
		// 拠点マスタを検索、倉庫区分を取得する
		MCenter mCenterInput = new MCenter();
		mCenterInput.setCenterCd(centerCd);
		MCenter mCenter = centerLogic.getUkEntity(mCenterInput);
		// エラーが発生した場合、エラーメッセージを出力し、処理を中断する
		if (mCenter == null) {
			getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}
		
		// 倉庫区分
		String warehouseCls = mCenter.getWarehousecls();
		
		// CAPセンターフラグ(0:CAPセンター以外)
		String capFlg = CapFlg.CAP_FLG_OTHER;
		
		// 輸送区分に'1'(中継)を設定する
		// String supplierrCvFlg = SupplierrCvFlg.FLG_OTHER;
		if (!CU.isNullOrEmpty(warehouseCls) && WarehouseCls.CLS_CAP.equals(warehouseCls)) {
			// 変数.倉庫区分が'0'(CAP倉庫)の場合、CAPセンターフラグ(に1:CAPセンターを設定する
			capFlg = CapFlg.CAP_FLG_CAP;
			// 変数.倉庫区分が'0'(CAP倉庫)の場合、輸送区分に'3'(CAP)を設定する
			// supplierrCvFlg = SupplierrCvFlg.FLG_CAP;
			
			// ===== 着地リストを取得する =====
			
			// 外出しSQLの定義
			String pathChakuchiSap = MCorgBhv.PATH_selectSqlChakuchiSapList;

			// 引数定義
			BsSqlChakuchiSapListPmb pmbChakuchiSap = new BsSqlChakuchiSapListPmb();

			// 引数の値を設定
			pmbChakuchiSap.setSystemDt(systemDt);
			
			// 検索実行
			Class<SqlChakuchiSapListDto> chakuchiSapEntityType = SqlChakuchiSapListDto.class;
			List<SqlChakuchiSapListDto> chakuchiSapSqlDtoList;
			chakuchiSapSqlDtoList = super.selectList(mCorgBhv, pathChakuchiSap, pmbChakuchiSap, chakuchiSapEntityType);

			// 検索結果詰込処理
			dispatchRecordInputDto.data.chakuchiSapList = chakuchiSapSqlDtoList;
		} else {
			// ===== 着地リストを取得する =====
			
			if (SupplierrCvFlg.FLG_TD.equals(supplierrCvFlg)) {
				// 外出しSQLの定義
				String pathChakuchiSap = MCorgBhv.PATH_selectSqlChakuchiSapList;

				// 引数定義
				BsSqlChakuchiSapListPmb pmbChakuchiSap = new BsSqlChakuchiSapListPmb();

				// 引数の値を設定
				pmbChakuchiSap.setSystemDt(systemDt);
				
				// 検索実行
				Class<SqlChakuchiSapListDto> chakuchiSapEntityType = SqlChakuchiSapListDto.class;
				List<SqlChakuchiSapListDto> chakuchiSapSqlDtoList;
				chakuchiSapSqlDtoList = super.selectList(mCorgBhv, pathChakuchiSap, pmbChakuchiSap, chakuchiSapEntityType);

				// 検索結果詰込処理
				dispatchRecordInputDto.data.chakuchiSapList = chakuchiSapSqlDtoList;
			} else {
				// 外出しSQLの定義
				String pathChakuchiSap = MCorgBhv.PATH_selectSqlChakuchiSapList;

				// 引数定義
				BsSqlChakuchiSapListPmb pmbChakuchiSap = new BsSqlChakuchiSapListPmb();

				// 引数の値を設定
				pmbChakuchiSap.setSystemDt(systemDt);
				
				// 検索実行
				Class<SqlChakuchiSapListDto> chakuchiSapEntityType = SqlChakuchiSapListDto.class;
				List<SqlChakuchiSapListDto> chakuchiSapSqlDtoList;
				chakuchiSapSqlDtoList = super.selectList(mCorgBhv, pathChakuchiSap, pmbChakuchiSap, chakuchiSapEntityType);
				
				// 検索結果詰込処理
				dispatchRecordInputDto.data.chakuchiSapList = chakuchiSapSqlDtoList;
				
				
				// 外出しSQLの定義
				String pathChakuchiOther = MCrelaybsBhv.PATH_selectSqlChakuchiOtherList;

				// 引数定義
				BsSqlChakuchiOtherListPmb pmbChakuchiOther = new BsSqlChakuchiOtherListPmb();

				// 引数の値を設定
				pmbChakuchiOther.setSystemDt(systemDt);
				
				// 検索実行
				Class<SqlChakuchiOtherListDto> chakuchiOtherEntityType = SqlChakuchiOtherListDto.class;
				List<SqlChakuchiOtherListDto> chakuchiOtherSqlDtoList;
				chakuchiOtherSqlDtoList = super.selectList(mCrelaybsBhv, pathChakuchiOther, pmbChakuchiOther, chakuchiOtherEntityType);

				// 検索結果詰込処理
				dispatchRecordInputDto.data.chakuchiOtherList = chakuchiOtherSqlDtoList;
			}

		}
		
		// 検索結果詰込処理
		dispatchRecordInputDto.data.capFlg = capFlg;
				
		return dispatchRecordInputDto;

	}
}
